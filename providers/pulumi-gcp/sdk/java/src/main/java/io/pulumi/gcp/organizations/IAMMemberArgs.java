// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.organizations.inputs.IAMMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final IAMMemberArgs Empty = new IAMMemberArgs();

    @Import(name="condition")
      private final @Nullable Output<IAMMemberConditionArgs> condition;

    public Output<IAMMemberConditionArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    @Import(name="member", required=true)
      private final Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }

    /**
     * The numeric ID of the organization in which you want to manage the audit logging config.
     * 
     */
    @Import(name="orgId", required=true)
      private final Output<String> orgId;

    public Output<String> getOrgId() {
        return this.orgId;
    }

    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public IAMMemberArgs(
        @Nullable Output<IAMMemberConditionArgs> condition,
        Output<String> member,
        Output<String> orgId,
        Output<String> role) {
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.orgId = Objects.requireNonNull(orgId, "expected parameter 'orgId' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private IAMMemberArgs() {
        this.condition = Output.empty();
        this.member = Output.empty();
        this.orgId = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IAMMemberConditionArgs> condition;
        private Output<String> member;
        private Output<String> orgId;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.orgId = defaults.orgId;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<IAMMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable IAMMemberConditionArgs condition) {
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

        public Builder orgId(Output<String> orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }

        public Builder orgId(String orgId) {
            this.orgId = Output.of(Objects.requireNonNull(orgId));
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
        public IAMMemberArgs build() {
            return new IAMMemberArgs(condition, member, orgId, role);
        }
    }
}
