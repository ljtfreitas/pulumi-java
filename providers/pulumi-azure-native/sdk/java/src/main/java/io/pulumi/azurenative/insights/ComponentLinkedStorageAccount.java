// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.ComponentLinkedStorageAccountArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An Application Insights component linked storage accounts
 * API Version: 2020-03-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:ComponentLinkedStorageAccount serviceprofile /subscriptions/86dc51d3-92ed-4d7e-947a-775ea79b4918/resourceGroups/someResourceGroupNameproviders/microsoft.insights/components/myComponent/linkedStorageAccounts/serviceprofiler 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:ComponentLinkedStorageAccount")
public class ComponentLinkedStorageAccount extends io.pulumi.resources.CustomResource {
    /**
     * Linked storage account resource ID
     * 
     */
    @OutputExport(name="linkedStorageAccount", type=String.class, parameters={})
    private Output</* @Nullable */ String> linkedStorageAccount;

    /**
     * @return Linked storage account resource ID
     * 
     */
    public Output</* @Nullable */ String> getLinkedStorageAccount() {
        return this.linkedStorageAccount;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
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
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
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
    public ComponentLinkedStorageAccount(String name, ComponentLinkedStorageAccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ComponentLinkedStorageAccount", name, args == null ? ComponentLinkedStorageAccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ComponentLinkedStorageAccount(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ComponentLinkedStorageAccount", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:insights/v20200301preview:ComponentLinkedStorageAccount").build())
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
    public static ComponentLinkedStorageAccount get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ComponentLinkedStorageAccount(name, id, options);
    }
}
