// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="displayName")
        private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Set of tag template field IDs and the settings for the field. This set is an exhaustive list of the allowed fields. This set must contain at least one field and at most 500 fields.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fields")
        private final @Nullable Input<List<TagTemplateFieldGetArgs>> fields;

    public Input<List<TagTemplateFieldGetArgs>> getFields() {
        return this.fields == null ? Input.empty() : this.fields;
    }

    /**
     * This confirms the deletion of any possible tags using this template. Must be set to true in order to delete the tag template.
     * 
     */
    @InputImport(name="forceDelete")
        private final @Nullable Input<Boolean> forceDelete;

    public Input<Boolean> getForceDelete() {
        return this.forceDelete == null ? Input.empty() : this.forceDelete;
    }

    /**
     * - 
     * The resource name of the tag template field in URL format. Example: projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}/fields/{field}
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Template location region.
     * 
     */
    @InputImport(name="region")
        private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The id of the tag template to create.
     * 
     */
    @InputImport(name="tagTemplateId")
        private final @Nullable Input<String> tagTemplateId;

    public Input<String> getTagTemplateId() {
        return this.tagTemplateId == null ? Input.empty() : this.tagTemplateId;
    }

    public TagTemplateState(
        @Nullable Input<String> displayName,
        @Nullable Input<List<TagTemplateFieldGetArgs>> fields,
        @Nullable Input<Boolean> forceDelete,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<String> tagTemplateId) {
        this.displayName = displayName;
        this.fields = fields;
        this.forceDelete = forceDelete;
        this.name = name;
        this.project = project;
        this.region = region;
        this.tagTemplateId = tagTemplateId;
    }

    private TagTemplateState() {
        this.displayName = Input.empty();
        this.fields = Input.empty();
        this.forceDelete = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.tagTemplateId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<List<TagTemplateFieldGetArgs>> fields;
        private @Nullable Input<Boolean> forceDelete;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<String> tagTemplateId;

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

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setFields(@Nullable Input<List<TagTemplateFieldGetArgs>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setFields(@Nullable List<TagTemplateFieldGetArgs> fields) {
            this.fields = Input.ofNullable(fields);
            return this;
        }

        public Builder setForceDelete(@Nullable Input<Boolean> forceDelete) {
            this.forceDelete = forceDelete;
            return this;
        }

        public Builder setForceDelete(@Nullable Boolean forceDelete) {
            this.forceDelete = Input.ofNullable(forceDelete);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setTagTemplateId(@Nullable Input<String> tagTemplateId) {
            this.tagTemplateId = tagTemplateId;
            return this;
        }

        public Builder setTagTemplateId(@Nullable String tagTemplateId) {
            this.tagTemplateId = Input.ofNullable(tagTemplateId);
            return this;
        }
        public TagTemplateState build() {
            return new TagTemplateState(displayName, fields, forceDelete, name, project, region, tagTemplateId);
        }
    }
}
