// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.GalleryImageArgs;
import io.pulumi.azurenative.labservices.outputs.GalleryImageReferenceResponse;
import io.pulumi.azurenative.labservices.outputs.LatestOperationResultResponse;
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
 * Represents an image from the Azure Marketplace
 * API Version: 2018-10-15.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:labservices:GalleryImage myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.LabServices/labaccounts/{labAccountName}/galleryimages/{galleryImageName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:labservices:GalleryImage")
public class GalleryImage extends io.pulumi.resources.CustomResource {
    /**
     * The author of the gallery image.
     * 
     */
    @OutputExport(name="author", type=String.class, parameters={})
    private Output<String> author;

    /**
     * @return The author of the gallery image.
     * 
     */
    public Output<String> getAuthor() {
        return this.author;
    }
    /**
     * The creation date of the gallery image.
     * 
     */
    @OutputExport(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The creation date of the gallery image.
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The description of the gallery image.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the gallery image.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The icon of the gallery image.
     * 
     */
    @OutputExport(name="icon", type=String.class, parameters={})
    private Output<String> icon;

    /**
     * @return The icon of the gallery image.
     * 
     */
    public Output<String> getIcon() {
        return this.icon;
    }
    /**
     * The image reference of the gallery image.
     * 
     */
    @OutputExport(name="imageReference", type=GalleryImageReferenceResponse.class, parameters={})
    private Output<GalleryImageReferenceResponse> imageReference;

    /**
     * @return The image reference of the gallery image.
     * 
     */
    public Output<GalleryImageReferenceResponse> getImageReference() {
        return this.imageReference;
    }
    /**
     * Indicates whether this gallery image is enabled.
     * 
     */
    @OutputExport(name="isEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isEnabled;

    /**
     * @return Indicates whether this gallery image is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Indicates whether this gallery has been overridden for this lab account
     * 
     */
    @OutputExport(name="isOverride", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isOverride;

    /**
     * @return Indicates whether this gallery has been overridden for this lab account
     * 
     */
    public Output</* @Nullable */ Boolean> getIsOverride() {
        return this.isOverride;
    }
    /**
     * Indicates if the plan has been authorized for programmatic deployment.
     * 
     */
    @OutputExport(name="isPlanAuthorized", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isPlanAuthorized;

    /**
     * @return Indicates if the plan has been authorized for programmatic deployment.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsPlanAuthorized() {
        return this.isPlanAuthorized;
    }
    /**
     * The details of the latest operation. ex: status, error
     * 
     */
    @OutputExport(name="latestOperationResult", type=LatestOperationResultResponse.class, parameters={})
    private Output<LatestOperationResultResponse> latestOperationResult;

    /**
     * @return The details of the latest operation. ex: status, error
     * 
     */
    public Output<LatestOperationResultResponse> getLatestOperationResult() {
        return this.latestOperationResult;
    }
    /**
     * The location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The third party plan that applies to this image
     * 
     */
    @OutputExport(name="planId", type=String.class, parameters={})
    private Output<String> planId;

    /**
     * @return The third party plan that applies to this image
     * 
     */
    public Output<String> getPlanId() {
        return this.planId;
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The tags of the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @OutputExport(name="uniqueIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Output</* @Nullable */ String> getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GalleryImage(String name, GalleryImageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:GalleryImage", name, args == null ? GalleryImageArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GalleryImage(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:GalleryImage", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:labservices/v20181015:GalleryImage").build())
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
    public static GalleryImage get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GalleryImage(name, id, options);
    }
}
