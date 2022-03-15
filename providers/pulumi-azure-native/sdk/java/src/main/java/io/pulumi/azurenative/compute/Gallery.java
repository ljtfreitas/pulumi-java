// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.GalleryArgs;
import io.pulumi.azurenative.compute.outputs.GalleryIdentifierResponse;
import io.pulumi.azurenative.compute.outputs.SharingProfileResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Specifies information about the Shared Image Gallery that you want to create or update.
 * API Version: 2020-09-30.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:Gallery myGalleryName /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/galleries/{galleryName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:Gallery")
public class Gallery extends io.pulumi.resources.CustomResource {
    /**
     * The description of this Shared Image Gallery resource. This property is updatable.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of this Shared Image Gallery resource. This property is updatable.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Describes the gallery unique name.
     * 
     */
    @Export(name="identifier", type=GalleryIdentifierResponse.class, parameters={})
    private Output</* @Nullable */ GalleryIdentifierResponse> identifier;

    /**
     * @return Describes the gallery unique name.
     * 
     */
    public Output</* @Nullable */ GalleryIdentifierResponse> getIdentifier() {
        return this.identifier;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state, which only appears in the response.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Profile for gallery sharing to subscription or tenant
     * 
     */
    @Export(name="sharingProfile", type=SharingProfileResponse.class, parameters={})
    private Output</* @Nullable */ SharingProfileResponse> sharingProfile;

    /**
     * @return Profile for gallery sharing to subscription or tenant
     * 
     */
    public Output</* @Nullable */ SharingProfileResponse> getSharingProfile() {
        return this.sharingProfile;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(GalleryArgs.Builder a);
    }
    private static io.pulumi.azurenative.compute.GalleryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.compute.GalleryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Gallery(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gallery(String name) {
        this(name, GalleryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gallery(String name, GalleryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gallery(String name, GalleryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:Gallery", name, args == null ? GalleryArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Gallery(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:Gallery", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:compute/v20180601:Gallery").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20190301:Gallery").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20190701:Gallery").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20191201:Gallery").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20200930:Gallery").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20210701:Gallery").build())
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
    public static Gallery get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Gallery(name, id, options);
    }
}
