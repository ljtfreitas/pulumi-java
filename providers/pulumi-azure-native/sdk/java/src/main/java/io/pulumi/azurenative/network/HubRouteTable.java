// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.HubRouteTableArgs;
import io.pulumi.azurenative.network.outputs.HubRouteResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * RouteTable resource in a virtual hub.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:HubRouteTable hubRouteTable1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/virtualHub1/routeTables/virtualHubRouteTable1a 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:HubRouteTable")
public class HubRouteTable extends io.pulumi.resources.CustomResource {
    /**
     * List of all connections associated with this route table.
     * 
     */
    @Export(name="associatedConnections", type=List.class, parameters={String.class})
    private Output<List<String>> associatedConnections;

    /**
     * @return List of all connections associated with this route table.
     * 
     */
    public Output<List<String>> getAssociatedConnections() {
        return this.associatedConnections;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * List of labels associated with this route table.
     * 
     */
    @Export(name="labels", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> labels;

    /**
     * @return List of labels associated with this route table.
     * 
     */
    public Output</* @Nullable */ List<String>> getLabels() {
        return this.labels;
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * List of all connections that advertise to this route table.
     * 
     */
    @Export(name="propagatingConnections", type=List.class, parameters={String.class})
    private Output<List<String>> propagatingConnections;

    /**
     * @return List of all connections that advertise to this route table.
     * 
     */
    public Output<List<String>> getPropagatingConnections() {
        return this.propagatingConnections;
    }
    /**
     * The provisioning state of the RouteTable resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the RouteTable resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * List of all routes.
     * 
     */
    @Export(name="routes", type=List.class, parameters={HubRouteResponse.class})
    private Output</* @Nullable */ List<HubRouteResponse>> routes;

    /**
     * @return List of all routes.
     * 
     */
    public Output</* @Nullable */ List<HubRouteResponse>> getRoutes() {
        return this.routes;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(HubRouteTableArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.HubRouteTableArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.HubRouteTableArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public HubRouteTable(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HubRouteTable(String name) {
        this(name, HubRouteTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HubRouteTable(String name, HubRouteTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HubRouteTable(String name, HubRouteTableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:HubRouteTable", name, args == null ? HubRouteTableArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private HubRouteTable(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:HubRouteTable", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:network/v20200401:HubRouteTable").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200501:HubRouteTable").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200601:HubRouteTable").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200701:HubRouteTable").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200801:HubRouteTable").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20201101:HubRouteTable").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210201:HubRouteTable").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210301:HubRouteTable").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210501:HubRouteTable").build())
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
    public static HubRouteTable get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HubRouteTable(name, id, options);
    }
}
