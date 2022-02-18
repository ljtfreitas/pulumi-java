// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.RouteFilterArgs;
import io.pulumi.azurenative.network.outputs.ExpressRouteCircuitPeeringResponse;
import io.pulumi.azurenative.network.outputs.RouteFilterRuleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Route Filter Resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:RouteFilter filterName /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/routeFilters/filterName 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:RouteFilter")
public class RouteFilter extends io.pulumi.resources.CustomResource {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * A collection of references to express route circuit ipv6 peerings.
     * 
     */
    @OutputExport(name="ipv6Peerings", type=List.class, parameters={ExpressRouteCircuitPeeringResponse.class})
    private Output<List<ExpressRouteCircuitPeeringResponse>> ipv6Peerings;

    /**
     * @return A collection of references to express route circuit ipv6 peerings.
     * 
     */
    public Output<List<ExpressRouteCircuitPeeringResponse>> getIpv6Peerings() {
        return this.ipv6Peerings;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A collection of references to express route circuit peerings.
     * 
     */
    @OutputExport(name="peerings", type=List.class, parameters={ExpressRouteCircuitPeeringResponse.class})
    private Output<List<ExpressRouteCircuitPeeringResponse>> peerings;

    /**
     * @return A collection of references to express route circuit peerings.
     * 
     */
    public Output<List<ExpressRouteCircuitPeeringResponse>> getPeerings() {
        return this.peerings;
    }
    /**
     * The provisioning state of the route filter resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the route filter resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Collection of RouteFilterRules contained within a route filter.
     * 
     */
    @OutputExport(name="rules", type=List.class, parameters={RouteFilterRuleResponse.class})
    private Output</* @Nullable */ List<RouteFilterRuleResponse>> rules;

    /**
     * @return Collection of RouteFilterRules contained within a route filter.
     * 
     */
    public Output</* @Nullable */ List<RouteFilterRuleResponse>> getRules() {
        return this.rules;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteFilter(String name, RouteFilterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:RouteFilter", name, args == null ? RouteFilterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RouteFilter(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:RouteFilter", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20161201:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170301:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170601:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170801:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20170901:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20171001:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20171101:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180101:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180201:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180401:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180601:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180701:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180801:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:RouteFilter").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:RouteFilter").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RouteFilter get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RouteFilter(name, id, options);
    }
}
