// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class RuleGroupRuleStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs Empty = new RuleGroupRuleStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs();

    public RuleGroupRuleStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupRuleStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs build() {
            return new RuleGroupRuleStatementOrStatementStatementSqliMatchStatementFieldToMatchBodyArgs();
        }
    }
}
