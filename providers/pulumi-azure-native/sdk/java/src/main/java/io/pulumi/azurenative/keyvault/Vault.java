// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.keyvault.VaultArgs;
import io.pulumi.azurenative.keyvault.outputs.VaultPropertiesResponse;
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
 * Resource information with extended details.
 * API Version: 2019-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:keyvault:Vault sample-vault /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/sample-resource-group/providers/Microsoft.KeyVault/vaults/sample-vault 
 * ```
 * 
 */
@ResourceType(type="azure-native:keyvault:Vault")
public class Vault extends io.pulumi.resources.CustomResource {
    /**
     * Azure location of the key vault resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Azure location of the key vault resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Name of the key vault resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the key vault resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Properties of the vault
     * 
     */
    @OutputExport(name="properties", type=VaultPropertiesResponse.class, parameters={})
    private Output<VaultPropertiesResponse> properties;

    /**
     * @return Properties of the vault
     * 
     */
    public Output<VaultPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Tags assigned to the key vault resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags assigned to the key vault resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type of the key vault resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type of the key vault resource.
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
    public Vault(String name, VaultArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:keyvault:Vault", name, args == null ? VaultArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Vault(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:keyvault:Vault", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:keyvault/v20150601:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20161001:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20180214:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20180214preview:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20190901:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20200401preview:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20210401preview:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20210601preview:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20211001:Vault").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20211101preview:Vault").build())
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
    public static Vault get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Vault(name, id, options);
    }
}
