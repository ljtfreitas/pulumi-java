// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class RuleGroupRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs Empty = new RuleGroupRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs();

    public RuleGroupRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs build() {
            return new RuleGroupRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs();
        }
    }
}
