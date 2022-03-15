// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridconnectivity;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridconnectivity.EndpointArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The endpoint for the target resource.
 * API Version: 2021-10-06-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:hybridconnectivity:Endpoint default /subscriptions/f5bcc1d9-23af-4ae9-aca1-041d0f593a63/resourceGroups/hybridRG/providers/Microsoft.HybridCompute/machines/testMachine/providers/Microsoft.HybridConnectivity/endpoints/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:hybridconnectivity:Endpoint")
public class Endpoint extends io.pulumi.resources.CustomResource {
    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdAt;

    /**
     * @return The timestamp of resource creation (UTC).
     * 
     */
    public Output</* @Nullable */ String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The identity that created the resource.
     * 
     */
    @Export(name="createdBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdBy;

    /**
     * @return The identity that created the resource.
     * 
     */
    public Output</* @Nullable */ String> getCreatedBy() {
        return this.createdBy;
    }
    /**
     * The type of identity that created the resource.
     * 
     */
    @Export(name="createdByType", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdByType;

    /**
     * @return The type of identity that created the resource.
     * 
     */
    public Output</* @Nullable */ String> getCreatedByType() {
        return this.createdByType;
    }
    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    @Export(name="lastModifiedAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedAt;

    /**
     * @return The timestamp of resource last modification (UTC)
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * The identity that last modified the resource.
     * 
     */
    @Export(name="lastModifiedBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedBy;

    /**
     * @return The identity that last modified the resource.
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * The type of identity that last modified the resource.
     * 
     */
    @Export(name="lastModifiedByType", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedByType;

    /**
     * @return The type of identity that last modified the resource.
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedByType() {
        return this.lastModifiedByType;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource Id of the connectivity endpoint (optional).
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceId;

    /**
     * @return The resource Id of the connectivity endpoint (optional).
     * 
     */
    public Output</* @Nullable */ String> getResourceId() {
        return this.resourceId;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(EndpointArgs.Builder a);
    }
    private static io.pulumi.azurenative.hybridconnectivity.EndpointArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.hybridconnectivity.EndpointArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Endpoint(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Endpoint(String name) {
        this(name, EndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Endpoint(String name, EndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Endpoint(String name, EndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridconnectivity:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Endpoint(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridconnectivity:Endpoint", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:hybridconnectivity/v20211006preview:Endpoint").build())
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
    public static Endpoint get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, options);
    }
}
