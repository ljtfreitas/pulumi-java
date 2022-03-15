// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hanaonazure.ProviderInstanceArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A provider instance associated with a SAP monitor.
 * API Version: 2020-02-07-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:hanaonazure:ProviderInstance myProviderInstance /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.HanaOnAzure/sapMonitors/mySapMonitor/providerInstances/myProviderInstance 
 * ```
 * 
 */
@ResourceType(type="azure-native:hanaonazure:ProviderInstance")
public class ProviderInstance extends io.pulumi.resources.CustomResource {
    /**
     * A JSON string containing metadata of the provider instance.
     * 
     */
    @Export(name="metadata", type=String.class, parameters={})
    private Output</* @Nullable */ String> metadata;

    /**
     * @return A JSON string containing metadata of the provider instance.
     * 
     */
    public Output</* @Nullable */ String> getMetadata() {
        return this.metadata;
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
    /**
     * A JSON string containing the properties of the provider instance.
     * 
     */
    @Export(name="properties", type=String.class, parameters={})
    private Output<String> properties;

    /**
     * @return A JSON string containing the properties of the provider instance.
     * 
     */
    public Output<String> getProperties() {
        return this.properties;
    }
    /**
     * State of provisioning of the provider instance
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of provisioning of the provider instance
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
        public void apply(ProviderInstanceArgs.Builder a);
    }
    private static io.pulumi.azurenative.hanaonazure.ProviderInstanceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.hanaonazure.ProviderInstanceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ProviderInstance(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProviderInstance(String name) {
        this(name, ProviderInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProviderInstance(String name, ProviderInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProviderInstance(String name, ProviderInstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hanaonazure:ProviderInstance", name, args == null ? ProviderInstanceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ProviderInstance(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hanaonazure:ProviderInstance", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:hanaonazure/v20200207preview:ProviderInstance").build())
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
    public static ProviderInstance get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProviderInstance(name, id, options);
    }
}
