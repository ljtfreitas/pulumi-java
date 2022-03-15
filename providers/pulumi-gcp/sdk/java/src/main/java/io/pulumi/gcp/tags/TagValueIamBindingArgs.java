// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.tags.inputs.TagValueIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagValueIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagValueIamBindingArgs Empty = new TagValueIamBindingArgs();

    @Import(name="condition")
      private final @Nullable Output<TagValueIamBindingConditionArgs> condition;

    public Output<TagValueIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    @Import(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="tagValue", required=true)
      private final Output<String> tagValue;

    public Output<String> getTagValue() {
        return this.tagValue;
    }

    public TagValueIamBindingArgs(
        @Nullable Output<TagValueIamBindingConditionArgs> condition,
        Output<List<String>> members,
        Output<String> role,
        Output<String> tagValue) {
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.tagValue = Objects.requireNonNull(tagValue, "expected parameter 'tagValue' to be non-null");
    }

    private TagValueIamBindingArgs() {
        this.condition = Output.empty();
        this.members = Output.empty();
        this.role = Output.empty();
        this.tagValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagValueIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TagValueIamBindingConditionArgs> condition;
        private Output<List<String>> members;
        private Output<String> role;
        private Output<String> tagValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TagValueIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
    	      this.tagValue = defaults.tagValue;
        }

        public Builder condition(@Nullable Output<TagValueIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable TagValueIamBindingConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }

        public Builder members(Output<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder members(List<String> members) {
            this.members = Output.of(Objects.requireNonNull(members));
            return this;
        }

        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }

        public Builder tagValue(Output<String> tagValue) {
            this.tagValue = Objects.requireNonNull(tagValue);
            return this;
        }

        public Builder tagValue(String tagValue) {
            this.tagValue = Output.of(Objects.requireNonNull(tagValue));
            return this;
        }
        public TagValueIamBindingArgs build() {
            return new TagValueIamBindingArgs(condition, members, role, tagValue);
        }
    }
}
