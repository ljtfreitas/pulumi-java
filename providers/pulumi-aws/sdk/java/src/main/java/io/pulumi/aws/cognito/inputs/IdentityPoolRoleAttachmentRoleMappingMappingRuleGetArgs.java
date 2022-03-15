// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IdentityPoolRoleAttachmentRoleMappingMappingRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityPoolRoleAttachmentRoleMappingMappingRuleGetArgs Empty = new IdentityPoolRoleAttachmentRoleMappingMappingRuleGetArgs();

    /**
     * The claim name that must be present in the token, for example, "isAdmin" or "paid".
     * 
     */
    @Import(name="claim", required=true)
      private final Output<String> claim;

    public Output<String> getClaim() {
        return this.claim;
    }

    /**
     * The match condition that specifies how closely the claim value in the IdP token must match Value.
     * 
     */
    @Import(name="matchType", required=true)
      private final Output<String> matchType;

    public Output<String> getMatchType() {
        return this.matchType;
    }

    /**
     * The role ARN.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * A brief string that the claim must match, for example, "paid" or "yes".
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public IdentityPoolRoleAttachmentRoleMappingMappingRuleGetArgs(
        Output<String> claim,
        Output<String> matchType,
        Output<String> roleArn,
        Output<String> value) {
        this.claim = Objects.requireNonNull(claim, "expected parameter 'claim' to be non-null");
        this.matchType = Objects.requireNonNull(matchType, "expected parameter 'matchType' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private IdentityPoolRoleAttachmentRoleMappingMappingRuleGetArgs() {
        this.claim = Output.empty();
        this.matchType = Output.empty();
        this.roleArn = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPoolRoleAttachmentRoleMappingMappingRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> claim;
        private Output<String> matchType;
        private Output<String> roleArn;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPoolRoleAttachmentRoleMappingMappingRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claim = defaults.claim;
    	      this.matchType = defaults.matchType;
    	      this.roleArn = defaults.roleArn;
    	      this.value = defaults.value;
        }

        public Builder claim(Output<String> claim) {
            this.claim = Objects.requireNonNull(claim);
            return this;
        }

        public Builder claim(String claim) {
            this.claim = Output.of(Objects.requireNonNull(claim));
            return this;
        }

        public Builder matchType(Output<String> matchType) {
            this.matchType = Objects.requireNonNull(matchType);
            return this;
        }

        public Builder matchType(String matchType) {
            this.matchType = Output.of(Objects.requireNonNull(matchType));
            return this;
        }

        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }
        public IdentityPoolRoleAttachmentRoleMappingMappingRuleGetArgs build() {
            return new IdentityPoolRoleAttachmentRoleMappingMappingRuleGetArgs(claim, matchType, roleArn, value);
        }
    }
}
