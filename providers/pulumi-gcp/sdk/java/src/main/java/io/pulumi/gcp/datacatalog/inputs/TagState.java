// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.datacatalog.inputs.TagFieldGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagState extends io.pulumi.resources.ResourceArgs {

    public static final TagState Empty = new TagState();

    /**
     * Resources like Entry can have schemas associated with them. This scope allows users to attach tags to an
     * individual column based on that schema.
     * For attaching a tag to a nested column, use `.` to separate the column names. Example:
     * `outer_column.inner_column`
     * 
     */
    @Import(name="column")
      private final @Nullable Output<String> column;

    public Output<String> getColumn() {
        return this.column == null ? Output.empty() : this.column;
    }

    /**
     * This maps the ID of a tag field to the value of and additional information about that field.
     * Valid field IDs are defined by the tag's template. A tag must have at least 1 field and at most 500 fields.
     * Structure is documented below.
     * 
     */
    @Import(name="fields")
      private final @Nullable Output<List<TagFieldGetArgs>> fields;

    public Output<List<TagFieldGetArgs>> getFields() {
        return this.fields == null ? Output.empty() : this.fields;
    }

    /**
     * The resource name of the tag in URL format. Example:
     * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/entries/{entryId}/tags/{tag_id} or
     * projects/{project_id}/locations/{location}/entrygroups/{entryGroupId}/tags/{tag_id} where tag_id is a system-generated
     * identifier. Note that this Tag may not actually be stored in the location in this name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The name of the parent this tag is attached to. This can be the name of an entry or an entry group. If an entry group, the tag will be attached to
     * all entries in that group.
     * 
     */
    @Import(name="parent")
      private final @Nullable Output<String> parent;

    public Output<String> getParent() {
        return this.parent == null ? Output.empty() : this.parent;
    }

    /**
     * The resource name of the tag template that this tag uses. Example:
     * projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}
     * This field cannot be modified after creation.
     * 
     */
    @Import(name="template")
      private final @Nullable Output<String> template;

    public Output<String> getTemplate() {
        return this.template == null ? Output.empty() : this.template;
    }

    /**
     * The display name of the tag template.
     * 
     */
    @Import(name="templateDisplayname")
      private final @Nullable Output<String> templateDisplayname;

    public Output<String> getTemplateDisplayname() {
        return this.templateDisplayname == null ? Output.empty() : this.templateDisplayname;
    }

    public TagState(
        @Nullable Output<String> column,
        @Nullable Output<List<TagFieldGetArgs>> fields,
        @Nullable Output<String> name,
        @Nullable Output<String> parent,
        @Nullable Output<String> template,
        @Nullable Output<String> templateDisplayname) {
        this.column = column;
        this.fields = fields;
        this.name = name;
        this.parent = parent;
        this.template = template;
        this.templateDisplayname = templateDisplayname;
    }

    private TagState() {
        this.column = Output.empty();
        this.fields = Output.empty();
        this.name = Output.empty();
        this.parent = Output.empty();
        this.template = Output.empty();
        this.templateDisplayname = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> column;
        private @Nullable Output<List<TagFieldGetArgs>> fields;
        private @Nullable Output<String> name;
        private @Nullable Output<String> parent;
        private @Nullable Output<String> template;
        private @Nullable Output<String> templateDisplayname;

        public Builder() {
    	      // Empty
        }

        public Builder(TagState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.template = defaults.template;
    	      this.templateDisplayname = defaults.templateDisplayname;
        }

        public Builder column(@Nullable Output<String> column) {
            this.column = column;
            return this;
        }

        public Builder column(@Nullable String column) {
            this.column = Output.ofNullable(column);
            return this;
        }

        public Builder fields(@Nullable Output<List<TagFieldGetArgs>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder fields(@Nullable List<TagFieldGetArgs> fields) {
            this.fields = Output.ofNullable(fields);
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

        public Builder parent(@Nullable Output<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder parent(@Nullable String parent) {
            this.parent = Output.ofNullable(parent);
            return this;
        }

        public Builder template(@Nullable Output<String> template) {
            this.template = template;
            return this;
        }

        public Builder template(@Nullable String template) {
            this.template = Output.ofNullable(template);
            return this;
        }

        public Builder templateDisplayname(@Nullable Output<String> templateDisplayname) {
            this.templateDisplayname = templateDisplayname;
            return this;
        }

        public Builder templateDisplayname(@Nullable String templateDisplayname) {
            this.templateDisplayname = Output.ofNullable(templateDisplayname);
            return this;
        }
        public TagState build() {
            return new TagState(column, fields, name, parent, template, templateDisplayname);
        }
    }
}
