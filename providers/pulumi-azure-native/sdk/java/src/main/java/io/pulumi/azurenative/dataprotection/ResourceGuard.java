// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dataprotection.ResourceGuardArgs;
import io.pulumi.azurenative.dataprotection.outputs.DppIdentityDetailsResponse;
import io.pulumi.azurenative.dataprotection.outputs.ResourceGuardResponse;
import io.pulumi.azurenative.dataprotection.outputs.SystemDataResponse;
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
 * API Version: 2021-10-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:dataprotection:ResourceGuard VaultGuardTestNew /subscriptions/c999d45b-944f-418c-a0d8-c3fcfd1802c8/resourceGroups/vaultguardRGNew/providers/Microsoft.DataProtection/resourceGuards/VaultGuardTestNew 
 * ```
 * 
 */
@ResourceType(type="azure-native:dataprotection:ResourceGuard")
public class ResourceGuard extends io.pulumi.resources.CustomResource {
    /**
     * Optional ETag.
     * 
     */
    @OutputExport(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    /**
     * @return Optional ETag.
     * 
     */
    public Output</* @Nullable */ String> getETag() {
        return this.eTag;
    }
    /**
     * Input Managed Identity Details
     * 
     */
    @OutputExport(name="identity", type=DppIdentityDetailsResponse.class, parameters={})
    private Output</* @Nullable */ DppIdentityDetailsResponse> identity;

    /**
     * @return Input Managed Identity Details
     * 
     */
    public Output</* @Nullable */ DppIdentityDetailsResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource name associated with the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name associated with the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * ResourceGuardResource properties
     * 
     */
    @OutputExport(name="properties", type=ResourceGuardResponse.class, parameters={})
    private Output<ResourceGuardResponse> properties;

    /**
     * @return ResourceGuardResource properties
     * 
     */
    public Output<ResourceGuardResponse> getProperties() {
        return this.properties;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
     * Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
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
    public ResourceGuard(String name, ResourceGuardArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dataprotection:ResourceGuard", name, args == null ? ResourceGuardArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourceGuard(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dataprotection:ResourceGuard", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:dataprotection/v20210701:ResourceGuard").build()),
                Input.of(Alias.builder().setType("azure-native:dataprotection/v20211001preview:ResourceGuard").build()),
                Input.of(Alias.builder().setType("azure-native:dataprotection/v20211201preview:ResourceGuard").build())
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
    public static ResourceGuard get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceGuard(name, id, options);
    }
}
