// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.RouteArgs;
import io.pulumi.gcp.compute.inputs.RouteState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a Route resource.
 * 
 * A route is a rule that specifies how certain packets should be handled by
 * the virtual network. Routes are associated with virtual machines by tag,
 * and the set of routes for a particular virtual machine is called its
 * routing table. For each packet leaving a virtual machine, the system
 * searches that virtual machine's routing table for a single best matching
 * route.
 * 
 * Routes match packets by destination IP address, preferring smaller or more
 * specific ranges over larger ones. If there is a tie, the system selects
 * the route with the smallest priority value. If there is still a tie, it
 * uses the layer three and four packet headers to select just one of the
 * remaining matching routes. The packet is then forwarded as specified by
 * the next_hop field of the winning route -- either to another virtual
 * machine destination, a virtual machine gateway or a Compute
 * Engine-operated gateway. Packets that do not match any route in the
 * sending virtual machine's routing table will be dropped.
 * 
 * A Route resource must have exactly one specification of either
 * nextHopGateway, nextHopInstance, nextHopIp, nextHopVpnTunnel, or
 * nextHopIlb.
 * 
 * To get more information about Route, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/routes)
 * * How-to Guides
 *     * [Using Routes](https://cloud.google.com/vpc/docs/using-routes)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/route:Route default projects/{{project}}/global/routes/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/route:Route default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/route:Route default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/route:Route")
public class Route extends io.pulumi.resources.CustomResource {
    /**
     * An optional description of this resource. Provide this property
     * when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource. Provide this property
     * when you create the resource.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The destination range of outgoing packets that this route applies to.
     * Only IPv4 is supported.
     * 
     */
    @Export(name="destRange", type=String.class, parameters={})
    private Output<String> destRange;

    /**
     * @return The destination range of outgoing packets that this route applies to.
     * Only IPv4 is supported.
     * 
     */
    public Output<String> destRange() {
        return this.destRange;
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The network that this route applies to.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The network that this route applies to.
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * URL to a gateway that should handle matching packets.
     * Currently, you can only specify the internet gateway, using a full or
     * partial valid URL:
     * * `https://www.googleapis.com/compute/v1/projects/project/global/gateways/default-internet-gateway`
     * * `projects/project/global/gateways/default-internet-gateway`
     * * `global/gateways/default-internet-gateway`
     * * The string `default-internet-gateway`.
     * 
     */
    @Export(name="nextHopGateway", type=String.class, parameters={})
    private Output</* @Nullable */ String> nextHopGateway;

    /**
     * @return URL to a gateway that should handle matching packets.
     * Currently, you can only specify the internet gateway, using a full or
     * partial valid URL:
     * * `https://www.googleapis.com/compute/v1/projects/project/global/gateways/default-internet-gateway`
     * * `projects/project/global/gateways/default-internet-gateway`
     * * `global/gateways/default-internet-gateway`
     * * The string `default-internet-gateway`.
     * 
     */
    public Output</* @Nullable */ String> nextHopGateway() {
        return this.nextHopGateway;
    }
    /**
     * The IP address or URL to a forwarding rule of type
     * loadBalancingScheme=INTERNAL that should handle matching
     * packets.
     * With the GA provider you can only specify the forwarding
     * rule as a partial or full URL. For example, the following
     * are all valid values:
     * * 10.128.0.56
     * * https://www.googleapis.com/compute/v1/projects/project/regions/region/forwardingRules/forwardingRule
     * * regions/region/forwardingRules/forwardingRule
     *   When the beta provider, you can also specify the IP address
     *   of a forwarding rule from the same VPC or any peered VPC.
     *   Note that this can only be used when the destinationRange is
     *   a public (non-RFC 1918) IP CIDR range.
     * 
     */
    @Export(name="nextHopIlb", type=String.class, parameters={})
    private Output</* @Nullable */ String> nextHopIlb;

    /**
     * @return The IP address or URL to a forwarding rule of type
     * loadBalancingScheme=INTERNAL that should handle matching
     * packets.
     * With the GA provider you can only specify the forwarding
     * rule as a partial or full URL. For example, the following
     * are all valid values:
     * * 10.128.0.56
     * * https://www.googleapis.com/compute/v1/projects/project/regions/region/forwardingRules/forwardingRule
     * * regions/region/forwardingRules/forwardingRule
     *   When the beta provider, you can also specify the IP address
     *   of a forwarding rule from the same VPC or any peered VPC.
     *   Note that this can only be used when the destinationRange is
     *   a public (non-RFC 1918) IP CIDR range.
     * 
     */
    public Output</* @Nullable */ String> nextHopIlb() {
        return this.nextHopIlb;
    }
    /**
     * URL to an instance that should handle matching packets.
     * You can specify this as a full or partial URL. For example:
     * * `https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance`
     * * `projects/project/zones/zone/instances/instance`
     * * `zones/zone/instances/instance`
     * * Just the instance name, with the zone in `next_hop_instance_zone`.
     * 
     */
    @Export(name="nextHopInstance", type=String.class, parameters={})
    private Output</* @Nullable */ String> nextHopInstance;

    /**
     * @return URL to an instance that should handle matching packets.
     * You can specify this as a full or partial URL. For example:
     * * `https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance`
     * * `projects/project/zones/zone/instances/instance`
     * * `zones/zone/instances/instance`
     * * Just the instance name, with the zone in `next_hop_instance_zone`.
     * 
     */
    public Output</* @Nullable */ String> nextHopInstance() {
        return this.nextHopInstance;
    }
    /**
     * (Optional when `next_hop_instance` is
     * specified)  The zone of the instance specified in
     * `next_hop_instance`.  Omit if `next_hop_instance` is specified as
     * a URL.
     * 
     */
    @Export(name="nextHopInstanceZone", type=String.class, parameters={})
    private Output<String> nextHopInstanceZone;

    /**
     * @return (Optional when `next_hop_instance` is
     * specified)  The zone of the instance specified in
     * `next_hop_instance`.  Omit if `next_hop_instance` is specified as
     * a URL.
     * 
     */
    public Output<String> nextHopInstanceZone() {
        return this.nextHopInstanceZone;
    }
    /**
     * Network IP address of an instance that should handle matching packets.
     * 
     */
    @Export(name="nextHopIp", type=String.class, parameters={})
    private Output<String> nextHopIp;

    /**
     * @return Network IP address of an instance that should handle matching packets.
     * 
     */
    public Output<String> nextHopIp() {
        return this.nextHopIp;
    }
    /**
     * URL to a Network that should handle matching packets.
     * 
     */
    @Export(name="nextHopNetwork", type=String.class, parameters={})
    private Output<String> nextHopNetwork;

    /**
     * @return URL to a Network that should handle matching packets.
     * 
     */
    public Output<String> nextHopNetwork() {
        return this.nextHopNetwork;
    }
    /**
     * URL to a VpnTunnel that should handle matching packets.
     * 
     */
    @Export(name="nextHopVpnTunnel", type=String.class, parameters={})
    private Output</* @Nullable */ String> nextHopVpnTunnel;

    /**
     * @return URL to a VpnTunnel that should handle matching packets.
     * 
     */
    public Output</* @Nullable */ String> nextHopVpnTunnel() {
        return this.nextHopVpnTunnel;
    }
    /**
     * The priority of this route. Priority is used to break ties in cases
     * where there is more than one matching route of equal prefix length.
     * In the case of two routes with equal prefix length, the one with the
     * lowest-numbered priority value wins.
     * Default value is 1000. Valid range is 0 through 65535.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return The priority of this route. Priority is used to break ties in cases
     * where there is more than one matching route of equal prefix length.
     * In the case of two routes with equal prefix length, the one with the
     * lowest-numbered priority value wins.
     * Default value is 1000. Valid range is 0 through 65535.
     * 
     */
    public Output</* @Nullable */ Integer> priority() {
        return this.priority;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * A list of instance tags to which this route applies.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of instance tags to which this route applies.
     * 
     */
    public Output</* @Nullable */ List<String>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Route(String name) {
        this(name, RouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Route(String name, RouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Route(String name, RouteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/route:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Route(String name, Output<String> id, @Nullable RouteState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/route:Route", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Route get(String name, Output<String> id, @Nullable RouteState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Route(name, id, state, options);
    }
}
