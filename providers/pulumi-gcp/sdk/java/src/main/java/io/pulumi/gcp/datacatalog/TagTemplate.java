// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.datacatalog.TagTemplateArgs;
import io.pulumi.gcp.datacatalog.inputs.TagTemplateState;
import io.pulumi.gcp.datacatalog.outputs.TagTemplateField;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A tag template defines a tag, which can have one or more typed fields.
 * The template is used to create and attach the tag to GCP resources.
 * 
 * To get more information about TagTemplate, see:
 * 
 * * [API documentation](https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.tagTemplates)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/data-catalog/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * TagTemplate can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:datacatalog/tagTemplate:TagTemplate default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:datacatalog/tagTemplate:TagTemplate")
public class TagTemplate extends io.pulumi.resources.CustomResource {
    /**
     * The display name for this template.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name for this template.
     * 
     */
    public Output</* @Nullable */ String> displayName() {
        return this.displayName;
    }
    /**
     * Set of tag template field IDs and the settings for the field. This set is an exhaustive list of the allowed fields. This set must contain at least one field and at most 500 fields.
     * Structure is documented below.
     * 
     */
    @Export(name="fields", type=List.class, parameters={TagTemplateField.class})
    private Output<List<TagTemplateField>> fields;

    /**
     * @return Set of tag template field IDs and the settings for the field. This set is an exhaustive list of the allowed fields. This set must contain at least one field and at most 500 fields.
     * Structure is documented below.
     * 
     */
    public Output<List<TagTemplateField>> fields() {
        return this.fields;
    }
    /**
     * This confirms the deletion of any possible tags using this template. Must be set to true in order to delete the tag template.
     * 
     */
    @Export(name="forceDelete", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDelete;

    /**
     * @return This confirms the deletion of any possible tags using this template. Must be set to true in order to delete the tag template.
     * 
     */
    public Output</* @Nullable */ Boolean> forceDelete() {
        return this.forceDelete;
    }
    /**
     * - 
     * The resource name of the tag template field in URL format. Example: projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}/fields/{field}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return -
     * The resource name of the tag template field in URL format. Example: projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}/fields/{field}
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Template location region.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Template location region.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The id of the tag template to create.
     * 
     */
    @Export(name="tagTemplateId", type=String.class, parameters={})
    private Output<String> tagTemplateId;

    /**
     * @return The id of the tag template to create.
     * 
     */
    public Output<String> tagTemplateId() {
        return this.tagTemplateId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagTemplate(String name) {
        this(name, TagTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagTemplate(String name, TagTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagTemplate(String name, TagTemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/tagTemplate:TagTemplate", name, args == null ? TagTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TagTemplate(String name, Output<String> id, @Nullable TagTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/tagTemplate:TagTemplate", name, state, makeResourceOptions(options, id));
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
    public static TagTemplate get(String name, Output<String> id, @Nullable TagTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TagTemplate(name, id, state, options);
    }
}
