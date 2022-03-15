// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.tags.inputs.TagKeyIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagKeyIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagKeyIamMemberArgs Empty = new TagKeyIamMemberArgs();

    @Import(name="condition")
      private final @Nullable Output<TagKeyIamMemberConditionArgs> condition;

    public Output<TagKeyIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    @Import(name="member", required=true)
      private final Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.tags.TagKeyIamBinding` can be used per role. Note that custom roles must be of the format
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
    @Import(name="tagKey", required=true)
      private final Output<String> tagKey;

    public Output<String> getTagKey() {
        return this.tagKey;
    }

    public TagKeyIamMemberArgs(
        @Nullable Output<TagKeyIamMemberConditionArgs> condition,
        Output<String> member,
        Output<String> role,
        Output<String> tagKey) {
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.tagKey = Objects.requireNonNull(tagKey, "expected parameter 'tagKey' to be non-null");
    }

    private TagKeyIamMemberArgs() {
        this.condition = Output.empty();
        this.member = Output.empty();
        this.role = Output.empty();
        this.tagKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagKeyIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TagKeyIamMemberConditionArgs> condition;
        private Output<String> member;
        private Output<String> role;
        private Output<String> tagKey;

        public Builder() {
    	      // Empty
        }

        public Builder(TagKeyIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
    	      this.tagKey = defaults.tagKey;
        }

        public Builder condition(@Nullable Output<TagKeyIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable TagKeyIamMemberConditionArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }

        public Builder member(Output<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }

        public Builder member(String member) {
            this.member = Output.of(Objects.requireNonNull(member));
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

        public Builder tagKey(Output<String> tagKey) {
            this.tagKey = Objects.requireNonNull(tagKey);
            return this;
        }

        public Builder tagKey(String tagKey) {
            this.tagKey = Output.of(Objects.requireNonNull(tagKey));
            return this;
        }
        public TagKeyIamMemberArgs build() {
            return new TagKeyIamMemberArgs(condition, member, role, tagKey);
        }
    }
}
