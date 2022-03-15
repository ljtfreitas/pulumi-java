// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.datacatalog.inputs.TagTemplateFieldGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagTemplateState extends io.pulumi.resources.ResourceArgs {

    public static final TagTemplateState Empty = new TagTemplateState();

    /**
     * The display name for this template.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Set of tag template field IDs and the settings for the field. This set is an exhaustive list of the allowed fields. This set must contain at least one field and at most 500 fields.
     * Structure is documented below.
     * 
     */
    @Import(name="fields")
      private final @Nullable Output<List<TagTemplateFieldGetArgs>> fields;

    public Output<List<TagTemplateFieldGetArgs>> getFields() {
        return this.fields == null ? Output.empty() : this.fields;
    }

    /**
     * This confirms the deletion of any possible tags using this template. Must be set to true in order to delete the tag template.
     * 
     */
    @Import(name="forceDelete")
      private final @Nullable Output<Boolean> forceDelete;

    public Output<Boolean> getForceDelete() {
        return this.forceDelete == null ? Output.empty() : this.forceDelete;
    }

    /**
     * - 
     * The resource name of the tag template field in URL format. Example: projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}/fields/{field}
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Template location region.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * The id of the tag template to create.
     * 
     */
    @Import(name="tagTemplateId")
      private final @Nullable Output<String> tagTemplateId;

    public Output<String> getTagTemplateId() {
        return this.tagTemplateId == null ? Output.empty() : this.tagTemplateId;
    }

    public TagTemplateState(
        @Nullable Output<String> displayName,
        @Nullable Output<List<TagTemplateFieldGetArgs>> fields,
        @Nullable Output<Boolean> forceDelete,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> tagTemplateId) {
        this.displayName = displayName;
        this.fields = fields;
        this.forceDelete = forceDelete;
        this.name = name;
        this.project = project;
        this.region = region;
        this.tagTemplateId = tagTemplateId;
    }

    private TagTemplateState() {
        this.displayName = Output.empty();
        this.fields = Output.empty();
        this.forceDelete = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.tagTemplateId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<List<TagTemplateFieldGetArgs>> fields;
        private @Nullable Output<Boolean> forceDelete;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> tagTemplateId;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.fields = defaults.fields;
    	      this.forceDelete = defaults.forceDelete;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.tagTemplateId = defaults.tagTemplateId;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder fields(@Nullable Output<List<TagTemplateFieldGetArgs>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder fields(@Nullable List<TagTemplateFieldGetArgs> fields) {
            this.fields = Output.ofNullable(fields);
            return this;
        }

        public Builder forceDelete(@Nullable Output<Boolean> forceDelete) {
            this.forceDelete = forceDelete;
            return this;
        }

        public Builder forceDelete(@Nullable Boolean forceDelete) {
            this.forceDelete = Output.ofNullable(forceDelete);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }

        public Builder tagTemplateId(@Nullable Output<String> tagTemplateId) {
            this.tagTemplateId = tagTemplateId;
            return this;
        }

        public Builder tagTemplateId(@Nullable String tagTemplateId) {
            this.tagTemplateId = Output.ofNullable(tagTemplateId);
            return this;
        }
        public TagTemplateState build() {
            return new TagTemplateState(displayName, fields, forceDelete, name, project, region, tagTemplateId);
        }
    }
}
