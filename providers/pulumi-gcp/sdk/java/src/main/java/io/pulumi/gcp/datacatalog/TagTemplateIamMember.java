// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.datacatalog.TagTemplateIamMemberArgs;
import io.pulumi.gcp.datacatalog.inputs.TagTemplateIamMemberState;
import io.pulumi.gcp.datacatalog.outputs.TagTemplateIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:datacatalog/tagTemplateIamMember:TagTemplateIamMember")
public class TagTemplateIamMember extends io.pulumi.resources.CustomResource {
    @Export(name="condition", type=TagTemplateIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ TagTemplateIamMemberCondition> condition;

    public Output</* @Nullable */ TagTemplateIamMemberCondition> condition() {
        return this.condition;
    }
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }
    @Export(name="tagTemplate", type=String.class, parameters={})
    private Output<String> tagTemplate;

    public Output<String> tagTemplate() {
        return this.tagTemplate;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagTemplateIamMember(String name) {
        this(name, TagTemplateIamMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagTemplateIamMember(String name, TagTemplateIamMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagTemplateIamMember(String name, TagTemplateIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/tagTemplateIamMember:TagTemplateIamMember", name, args == null ? TagTemplateIamMemberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TagTemplateIamMember(String name, Output<String> id, @Nullable TagTemplateIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:datacatalog/tagTemplateIamMember:TagTemplateIamMember", name, state, makeResourceOptions(options, id));
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
    public static TagTemplateIamMember get(String name, Output<String> id, @Nullable TagTemplateIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TagTemplateIamMember(name, id, state, options);
    }
}
