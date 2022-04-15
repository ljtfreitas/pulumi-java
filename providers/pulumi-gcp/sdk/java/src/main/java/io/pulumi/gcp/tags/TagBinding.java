// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.tags.TagBindingArgs;
import io.pulumi.gcp.tags.inputs.TagBindingState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A TagBinding represents a connection between a TagValue and a cloud resource (currently project, folder, or organization). Once a TagBinding is created, the TagValue is applied to all the descendants of the cloud resource.
 * 
 * To get more information about TagBinding, see:
 * 
 * * [API documentation](https://cloud.google.com/resource-manager/reference/rest/v3/tagBindings)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/resource-manager/docs/tags/tags-creating-and-managing)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * TagBinding can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:tags/tagBinding:TagBinding default tagBindings/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:tags/tagBinding:TagBinding default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:tags/tagBinding:TagBinding")
public class TagBinding extends io.pulumi.resources.CustomResource {
    /**
     * The generated id for the TagBinding. This is a string of the form: 'tagBindings/{full-resource-name}/{tag-value-name}'
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The generated id for the TagBinding. This is a string of the form: 'tagBindings/{full-resource-name}/{tag-value-name}'
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }
    /**
     * The TagValue of the TagBinding. Must be of the form tagValues/456.
     * 
     */
    @Export(name="tagValue", type=String.class, parameters={})
    private Output<String> tagValue;

    /**
     * @return The TagValue of the TagBinding. Must be of the form tagValues/456.
     * 
     */
    public Output<String> tagValue() {
        return this.tagValue;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagBinding(String name) {
        this(name, TagBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagBinding(String name, TagBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagBinding(String name, TagBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:tags/tagBinding:TagBinding", name, args == null ? TagBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TagBinding(String name, Output<String> id, @Nullable TagBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:tags/tagBinding:TagBinding", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TagBinding get(String name, Output<String> id, @Nullable TagBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TagBinding(name, id, state, options);
    }
}
