// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments {
    @CustomType.Constructor
    private RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments build() {
            return new RuleGroupRuleStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments();
        }
    }
}
