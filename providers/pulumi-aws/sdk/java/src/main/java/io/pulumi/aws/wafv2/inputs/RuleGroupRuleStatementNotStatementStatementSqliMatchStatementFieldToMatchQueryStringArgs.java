// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs Empty = new RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs();

    public RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs build() {
            return new RuleGroupRuleStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs();
        }
    }
}
