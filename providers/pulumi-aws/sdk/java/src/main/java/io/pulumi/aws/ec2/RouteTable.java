// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.RouteTableArgs;
import io.pulumi.aws.ec2.inputs.RouteTableState;
import io.pulumi.aws.ec2.outputs.RouteTableRoute;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to create a VPC routing table.
 * 
 * > **NOTE on Route Tables and Routes:** This provider currently
 * provides both a standalone Route resource and a Route Table resource with routes
 * defined in-line. At this time you cannot use a Route Table with in-line routes
 * in conjunction with any Route resources. Doing so will cause
 * a conflict of rule settings and will overwrite rules.
 * 
 * > **NOTE on `gateway_id` and `nat_gateway_id`:** The AWS API is very forgiving with these two
 * attributes and the `aws.ec2.RouteTable` resource can be created with a NAT ID specified as a Gateway ID attribute.
 * This _will_ lead to a permanent diff between your configuration and statefile, as the API returns the correct
 * parameters in the returned route table. If you're experiencing constant diffs in your `aws.ec2.RouteTable` resources,
 * the first thing to check is whether or not you're specifying a NAT ID instead of a Gateway ID, or vice-versa.
 * 
 * > **NOTE on `propagating_vgws` and the `aws.ec2.VpnGatewayRoutePropagation` resource:**
 * If the `propagating_vgws` argument is present, it's not supported to _also_
 * define route propagations using `aws.ec2.VpnGatewayRoutePropagation`, since
 * this resource will delete any propagating gateways not explicitly listed in
 * `propagating_vgws`. Omit this argument when defining route propagation using
 * the separate resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route Tables can be imported using the route table `id`. For example, to import route table `rtb-4e616f6d69`, use this command
 * 
 * ```sh
 *  $ pulumi import aws:ec2/routeTable:RouteTable public_rt rtb-4e616f6d69
 * ```
 * 
 */
@ResourceType(type="aws:ec2/routeTable:RouteTable")
public class RouteTable extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the route table.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the route table.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The ID of the AWS account that owns the route table.
     * 
     */
    @OutputExport(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the route table.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * A list of virtual gateways for propagation.
     * 
     */
    @OutputExport(name="propagatingVgws", type=List.class, parameters={String.class})
    private Output<List<String>> propagatingVgws;

    /**
     * @return A list of virtual gateways for propagation.
     * 
     */
    public Output<List<String>> getPropagatingVgws() {
        return this.propagatingVgws;
    }
    /**
     * A list of route objects. Their keys are documented below.
     * 
     */
    @OutputExport(name="routes", type=List.class, parameters={RouteTableRoute.class})
    private Output<List<RouteTableRoute>> routes;

    /**
     * @return A list of route objects. Their keys are documented below.
     * 
     */
    public Output<List<RouteTableRoute>> getRoutes() {
        return this.routes;
    }
    /**
     * A map of tags to assign to the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The VPC ID.
     * 
     */
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The VPC ID.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteTable(String name, RouteTableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/routeTable:RouteTable", name, args == null ? RouteTableArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RouteTable(String name, Input<String> id, @Nullable RouteTableState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/routeTable:RouteTable", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static RouteTable get(String name, Input<String> id, @Nullable RouteTableState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RouteTable(name, id, state, options);
    }
}
