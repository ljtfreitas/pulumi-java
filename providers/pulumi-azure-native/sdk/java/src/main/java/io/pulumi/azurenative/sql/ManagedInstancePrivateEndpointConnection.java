// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.ManagedInstancePrivateEndpointConnectionArgs;
import io.pulumi.azurenative.sql.outputs.ManagedInstancePrivateEndpointPropertyResponse;
import io.pulumi.azurenative.sql.outputs.ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A private endpoint connection
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ManagedInstancePrivateEndpointConnection private-endpoint-connection-name /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default/providers/Microsoft.Sql/managedInstances/test-cl/privateEndpointConnections/private-endpoint-connection-name 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ManagedInstancePrivateEndpointConnection")
public class ManagedInstancePrivateEndpointConnection extends io.pulumi.resources.CustomResource {
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Private endpoint which the connection belongs to.
     * 
     */
    @Export(name="privateEndpoint", type=ManagedInstancePrivateEndpointPropertyResponse.class, parameters={})
    private Output</* @Nullable */ ManagedInstancePrivateEndpointPropertyResponse> privateEndpoint;

    /**
     * @return Private endpoint which the connection belongs to.
     * 
     */
    public Output</* @Nullable */ ManagedInstancePrivateEndpointPropertyResponse> getPrivateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * Connection State of the Private Endpoint Connection.
     * 
     */
    @Export(name="privateLinkServiceConnectionState", type=ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse.class, parameters={})
    private Output</* @Nullable */ ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse> privateLinkServiceConnectionState;

    /**
     * @return Connection State of the Private Endpoint Connection.
     * 
     */
    public Output</* @Nullable */ ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    /**
     * State of the Private Endpoint Connection.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the Private Endpoint Connection.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
        public void apply(ManagedInstancePrivateEndpointConnectionArgs.Builder a);
    }
    private static io.pulumi.azurenative.sql.ManagedInstancePrivateEndpointConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sql.ManagedInstancePrivateEndpointConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ManagedInstancePrivateEndpointConnection(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedInstancePrivateEndpointConnection(String name) {
        this(name, ManagedInstancePrivateEndpointConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedInstancePrivateEndpointConnection(String name, ManagedInstancePrivateEndpointConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedInstancePrivateEndpointConnection(String name, ManagedInstancePrivateEndpointConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ManagedInstancePrivateEndpointConnection", name, args == null ? ManagedInstancePrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ManagedInstancePrivateEndpointConnection(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ManagedInstancePrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:sql/v20200202preview:ManagedInstancePrivateEndpointConnection").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20200801preview:ManagedInstancePrivateEndpointConnection").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20201101preview:ManagedInstancePrivateEndpointConnection").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20210201preview:ManagedInstancePrivateEndpointConnection").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20210501preview:ManagedInstancePrivateEndpointConnection").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20210801preview:ManagedInstancePrivateEndpointConnection").build())
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
    public static ManagedInstancePrivateEndpointConnection get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagedInstancePrivateEndpointConnection(name, id, options);
    }
}
