// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.KeyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A workspace key
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:synapse:Key somekey /subscriptions/01234567-89ab-4def-0123-456789abcdef/resourceGroups/ExampleResourceGroup/providers/Microsoft.Synapse/workspaces/ExampleWorkspace/keys/somekey 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:Key")
public class Key extends io.pulumi.resources.CustomResource {
    /**
     * Used to activate the workspace after a customer managed key is provided.
     * 
     */
    @Export(name="isActiveCMK", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isActiveCMK;

    /**
     * @return Used to activate the workspace after a customer managed key is provided.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsActiveCMK() {
        return this.isActiveCMK;
    }
    /**
     * The Key Vault Url of the workspace key.
     * 
     */
    @Export(name="keyVaultUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyVaultUrl;

    /**
     * @return The Key Vault Url of the workspace key.
     * 
     */
    public Output</* @Nullable */ String> getKeyVaultUrl() {
        return this.keyVaultUrl;
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
        public void apply(KeyArgs.Builder a);
    }
    private static io.pulumi.azurenative.synapse.KeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.synapse.KeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Key(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Key(String name) {
        this(name, KeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Key(String name, KeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Key(String name, KeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:Key", name, args == null ? KeyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Key(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:Key", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:synapse/v20190601preview:Key").build()),
                Output.of(Alias.builder().setType("azure-native:synapse/v20201201:Key").build()),
                Output.of(Alias.builder().setType("azure-native:synapse/v20210301:Key").build()),
                Output.of(Alias.builder().setType("azure-native:synapse/v20210401preview:Key").build()),
                Output.of(Alias.builder().setType("azure-native:synapse/v20210501:Key").build()),
                Output.of(Alias.builder().setType("azure-native:synapse/v20210601:Key").build()),
                Output.of(Alias.builder().setType("azure-native:synapse/v20210601preview:Key").build())
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
    public static Key get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Key(name, id, options);
    }
}
