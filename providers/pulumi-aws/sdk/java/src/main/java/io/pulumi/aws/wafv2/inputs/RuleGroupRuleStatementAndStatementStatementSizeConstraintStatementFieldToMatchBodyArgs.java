// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class RuleGroupRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs Empty = new RuleGroupRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs();

    public RuleGroupRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs build() {
            return new RuleGroupRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs();
        }
    }
}