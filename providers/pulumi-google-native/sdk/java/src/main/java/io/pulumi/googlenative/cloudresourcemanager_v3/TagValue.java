// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v3;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudresourcemanager_v3.TagValueArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a TagValue as a child of the specified TagKey. If a another request with the same parameters is sent while the original request is in process the second request will receive an error. A maximum of 300 TagValues can exist under a TagKey at any given time.
 * 
 */
@ResourceType(type="google-native:cloudresourcemanager/v3:TagValue")
public class TagValue extends io.pulumi.resources.CustomResource {
    /**
     * Creation time.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Creation time.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. User-assigned description of the TagValue. Must not exceed 256 characters. Read-write.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. User-assigned description of the TagValue. Must not exceed 256 characters. Read-write.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Optional. Entity tag which users can pass to prevent race conditions. This field is always set in server responses. See UpdateTagValueRequest for details.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Optional. Entity tag which users can pass to prevent race conditions. This field is always set in server responses. See UpdateTagValueRequest for details.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Immutable. Resource name for TagValue in the format `tagValues/456`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. Resource name for TagValue in the format `tagValues/456`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Namespaced name of the TagValue. Must be in the format `{organization_id}/{tag_key_short_name}/{short_name}`.
     * 
     */
    @Export(name="namespacedName", type=String.class, parameters={})
    private Output<String> namespacedName;

    /**
     * @return Namespaced name of the TagValue. Must be in the format `{organization_id}/{tag_key_short_name}/{short_name}`.
     * 
     */
    public Output<String> getNamespacedName() {
        return this.namespacedName;
    }
    /**
     * Immutable. The resource name of the new TagValue's parent TagKey. Must be of the form `tagKeys/{tag_key_id}`.
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return Immutable. The resource name of the new TagValue's parent TagKey. Must be of the form `tagKeys/{tag_key_id}`.
     * 
     */
    public Output<String> getParent() {
        return this.parent;
    }
    /**
     * Immutable. User-assigned short name for TagValue. The short name should be unique for TagValues within the same parent TagKey. The short name must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @Export(name="shortName", type=String.class, parameters={})
    private Output<String> shortName;

    /**
     * @return Immutable. User-assigned short name for TagValue. The short name should be unique for TagValues within the same parent TagKey. The short name must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    public Output<String> getShortName() {
        return this.shortName;
    }
    /**
     * Update time.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Update time.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(TagValueArgs.Builder a);
    }
    private static io.pulumi.googlenative.cloudresourcemanager_v3.TagValueArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.cloudresourcemanager_v3.TagValueArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TagValue(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagValue(String name) {
        this(name, TagValueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagValue(String name, TagValueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagValue(String name, TagValueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudresourcemanager/v3:TagValue", name, args == null ? TagValueArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private TagValue(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudresourcemanager/v3:TagValue", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static TagValue get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TagValue(name, id, options);
    }
}
