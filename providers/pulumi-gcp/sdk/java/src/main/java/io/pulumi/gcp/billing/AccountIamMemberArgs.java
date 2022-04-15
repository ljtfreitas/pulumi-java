// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.billing.inputs.AccountIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountIamMemberArgs Empty = new AccountIamMemberArgs();

    @Import(name="billingAccountId", required=true)
      private final Output<String> billingAccountId;

    public Output<String> billingAccountId() {
        return this.billingAccountId;
    }

    @Import(name="condition")
      private final @Nullable Output<AccountIamMemberConditionArgs> condition;

    public Output<AccountIamMemberConditionArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    @Import(name="member", required=true)
      private final Output<String> member;

    public Output<String> member() {
        return this.member;
    }

    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    public AccountIamMemberArgs(
        Output<String> billingAccountId,
        @Nullable Output<AccountIamMemberConditionArgs> condition,
        Output<String> member,
        Output<String> role) {
        this.billingAccountId = Objects.requireNonNull(billingAccountId, "expected parameter 'billingAccountId' to be non-null");
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private AccountIamMemberArgs() {
        this.billingAccountId = Codegen.empty();
        this.condition = Codegen.empty();
        this.member = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> billingAccountId;
        private @Nullable Output<AccountIamMemberConditionArgs> condition;
        private Output<String> member;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder billingAccountId(Output<String> billingAccountId) {
            this.billingAccountId = Objects.requireNonNull(billingAccountId);
            return this;
        }
        public Builder billingAccountId(String billingAccountId) {
            this.billingAccountId = Output.of(Objects.requireNonNull(billingAccountId));
            return this;
        }
        public Builder condition(@Nullable Output<AccountIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable AccountIamMemberConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
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
        }        public AccountIamMemberArgs build() {
            return new AccountIamMemberArgs(billingAccountId, condition, member, role);
        }
    }
}
