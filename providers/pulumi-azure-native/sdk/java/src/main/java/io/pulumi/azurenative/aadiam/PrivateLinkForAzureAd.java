// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aadiam;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.aadiam.PrivateLinkForAzureAdArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * PrivateLink Policy configuration object.
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:aadiam:privateLinkForAzureAd myOrgPrivateLinkPolicy /subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/microsoft.aadiam/privateLinkForAzureAd/{policyName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:aadiam:privateLinkForAzureAd")
public class PrivateLinkForAzureAd extends io.pulumi.resources.CustomResource {
    /**
     * Flag indicating whether all tenants are allowed
     * 
     */
    @OutputExport(name="allTenants", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allTenants;

    /**
     * @return Flag indicating whether all tenants are allowed
     * 
     */
    public Output</* @Nullable */ Boolean> getAllTenants() {
        return this.allTenants;
    }
    /**
     * Name of this resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of this resource.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * Guid of the owner tenant
     * 
     */
    @OutputExport(name="ownerTenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> ownerTenantId;

    /**
     * @return Guid of the owner tenant
     * 
     */
    public Output</* @Nullable */ String> getOwnerTenantId() {
        return this.ownerTenantId;
    }
    /**
     * Name of the resource group
     * 
     */
    @OutputExport(name="resourceGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroup;

    /**
     * @return Name of the resource group
     * 
     */
    public Output</* @Nullable */ String> getResourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Name of the private link policy resource
     * 
     */
    @OutputExport(name="resourceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceName;

    /**
     * @return Name of the private link policy resource
     * 
     */
    public Output</* @Nullable */ String> getPropResourceName() {
        return this.resourceName;
    }
    /**
     * Subscription Identifier
     * 
     */
    @OutputExport(name="subscriptionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> subscriptionId;

    /**
     * @return Subscription Identifier
     * 
     */
    public Output</* @Nullable */ String> getSubscriptionId() {
        return this.subscriptionId;
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
     * The list of tenantIds.
     * 
     */
    @OutputExport(name="tenants", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tenants;

    /**
     * @return The list of tenantIds.
     * 
     */
    public Output</* @Nullable */ List<String>> getTenants() {
        return this.tenants;
    }
    /**
     * Type of this resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of this resource.
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
    public PrivateLinkForAzureAd(String name, PrivateLinkForAzureAdArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:aadiam:privateLinkForAzureAd", name, args == null ? PrivateLinkForAzureAdArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateLinkForAzureAd(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:aadiam:privateLinkForAzureAd", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:aadiam/v20200301:privateLinkForAzureAd").build()),
                Input.of(Alias.builder().setType("azure-native:aadiam/v20200301preview:privateLinkForAzureAd").build())
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
    public static PrivateLinkForAzureAd get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLinkForAzureAd(name, id, options);
    }
}
