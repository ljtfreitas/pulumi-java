// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridcompute.PrivateLinkScopedResourceArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A private link scoped resource
 * API Version: 2020-08-15-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:hybridcompute:PrivateLinkScopedResource scoped-resource-name /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/myResourceGroup/providers/Microsoft.HybridCompute/privateLinkScopes/myPrivateLinkScope/scopedResources/scoped-resource-name 
 * ```
 * 
 */
@ResourceType(type="azure-native:hybridcompute:PrivateLinkScopedResource")
public class PrivateLinkScopedResource extends io.pulumi.resources.CustomResource {
    /**
     * The resource id of the scoped Azure monitor resource.
     * 
     */
    @OutputExport(name="linkedResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> linkedResourceId;

    /**
     * @return The resource id of the scoped Azure monitor resource.
     * 
     */
    public Output</* @Nullable */ String> getLinkedResourceId() {
        return this.linkedResourceId;
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
     * State of the private endpoint connection.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the private endpoint connection.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
    public PrivateLinkScopedResource(String name, PrivateLinkScopedResourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridcompute:PrivateLinkScopedResource", name, args == null ? PrivateLinkScopedResourceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateLinkScopedResource(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridcompute:PrivateLinkScopedResource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:hybridcompute/v20200815preview:PrivateLinkScopedResource").build())
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
    public static PrivateLinkScopedResource get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLinkScopedResource(name, id, options);
    }
}
