// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.datacatalog.TagTemplateIamBindingArgs;
import io.pulumi.gcp.datacatalog.inputs.TagTemplateIamBindingState;
import io.pulumi.gcp.datacatalog.outputs.TagTemplateIamBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:datacatalog/tagTemplateIamBinding:TagTemplateIamBinding")
public class TagTemplateIamBinding extends io.pulumi.resources.CustomResource {
    @Export(name="condition", type=TagTemplateIamBindingCondition.class, parameters={})
    private Output</* @Nullable */ TagTemplateIamBindingCondition> condition;

    public Output</* @Nullable */ TagTemplateIamBindingCondition> getCondition() {
        return this.condition;
    }
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @Export(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }
    @Export(name="tagTemplate", type=String.class, parameters={})
    private Output<String> tagTemplate;

    public Output<String> getTagTemplate() {
        return this.tagTemplate;
    }

    public interface BuilderApplicator {
        public void apply(TagTemplateIamBindingArgs.Builder a);
    }
    private static io.pulumi.gcp.datacatalog.TagTemplateIamBindingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.datacatalog.TagTemplateIamBindingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TagTemplateIamBinding(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagTemplateIamBinding(String name) {
        this(name, TagTemplateIamBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagTemplateIamBinding(String name, TagTemplateIamBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagTemplateIamBinding(String name, TagTemplateIamBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/tagTemplateIamBinding:TagTemplateIamBinding", name, args == null ? TagTemplateIamBindingArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private TagTemplateIamBinding(String name, Output<String> id, @Nullable TagTemplateIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/tagTemplateIamBinding:TagTemplateIamBinding", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TagTemplateIamBinding get(String name, Output<String> id, @Nullable TagTemplateIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TagTemplateIamBinding(name, id, state, options);
    }
}
