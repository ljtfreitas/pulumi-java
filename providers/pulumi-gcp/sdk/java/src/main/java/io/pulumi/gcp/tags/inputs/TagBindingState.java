// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagBindingState extends io.pulumi.resources.ResourceArgs {

    public static final TagBindingState Empty = new TagBindingState();

    /**
     * The generated id for the TagBinding. This is a string of the form: 'tagBindings/{full-resource-name}/{tag-value-name}'
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
     * 
     */
    @Import(name="parent")
      private final @Nullable Output<String> parent;

    public Output<String> parent() {
        return this.parent == null ? Codegen.empty() : this.parent;
    }

    /**
     * The TagValue of the TagBinding. Must be of the form tagValues/456.
     * 
     */
    @Import(name="tagValue")
      private final @Nullable Output<String> tagValue;

    public Output<String> tagValue() {
        return this.tagValue == null ? Codegen.empty() : this.tagValue;
    }

    public TagBindingState(
        @Nullable Output<String> name,
        @Nullable Output<String> parent,
        @Nullable Output<String> tagValue) {
        this.name = name;
        this.parent = parent;
        this.tagValue = tagValue;
    }

    private TagBindingState() {
        this.name = Codegen.empty();
        this.parent = Codegen.empty();
        this.tagValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> parent;
        private @Nullable Output<String> tagValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TagBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.tagValue = defaults.tagValue;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder parent(@Nullable Output<String> parent) {
            this.parent = parent;
            return this;
        }
        public Builder parent(@Nullable String parent) {
            this.parent = Codegen.ofNullable(parent);
            return this;
        }
        public Builder tagValue(@Nullable Output<String> tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public Builder tagValue(@Nullable String tagValue) {
            this.tagValue = Codegen.ofNullable(tagValue);
            return this;
        }        public TagBindingState build() {
            return new TagBindingState(name, parent, tagValue);
        }
    }
}
