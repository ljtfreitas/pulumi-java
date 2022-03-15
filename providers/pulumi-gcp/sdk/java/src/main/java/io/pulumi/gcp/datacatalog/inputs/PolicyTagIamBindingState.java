// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.datacatalog.inputs.PolicyTagIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyTagIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final PolicyTagIamBindingState Empty = new PolicyTagIamBindingState();

    @Import(name="condition")
      private final @Nullable Output<PolicyTagIamBindingConditionGetArgs> condition;

    public Output<PolicyTagIamBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    @Import(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members == null ? Output.empty() : this.members;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="policyTag")
      private final @Nullable Output<String> policyTag;

    public Output<String> getPolicyTag() {
        return this.policyTag == null ? Output.empty() : this.policyTag;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.datacatalog.PolicyTagIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    public PolicyTagIamBindingState(
        @Nullable Output<PolicyTagIamBindingConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<List<String>> members,
        @Nullable Output<String> policyTag,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.members = members;
        this.policyTag = policyTag;
        this.role = role;
    }

    private PolicyTagIamBindingState() {
        this.condition = Output.empty();
        this.etag = Output.empty();
        this.members = Output.empty();
        this.policyTag = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTagIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PolicyTagIamBindingConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<String> policyTag;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTagIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.members = defaults.members;
    	      this.policyTag = defaults.policyTag;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<PolicyTagIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable PolicyTagIamBindingConditionGetArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }

        public Builder members(@Nullable Output<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder members(@Nullable List<String> members) {
            this.members = Output.ofNullable(members);
            return this;
        }

        public Builder policyTag(@Nullable Output<String> policyTag) {
            this.policyTag = policyTag;
            return this;
        }

        public Builder policyTag(@Nullable String policyTag) {
            this.policyTag = Output.ofNullable(policyTag);
            return this;
        }

        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }

        public Builder role(@Nullable String role) {
            this.role = Output.ofNullable(role);
            return this;
        }
        public PolicyTagIamBindingState build() {
            return new PolicyTagIamBindingState(condition, etag, members, policyTag, role);
        }
    }
}
