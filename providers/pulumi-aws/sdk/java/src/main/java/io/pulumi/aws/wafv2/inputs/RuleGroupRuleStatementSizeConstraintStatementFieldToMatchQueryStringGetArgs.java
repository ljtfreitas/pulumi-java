// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class RuleGroupRuleStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs Empty = new RuleGroupRuleStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs();

    public RuleGroupRuleStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupRuleStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs build() {
            return new RuleGroupRuleStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs();
        }
    }
}
