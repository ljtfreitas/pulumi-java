// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class RuleGroupRuleStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs Empty = new RuleGroupRuleStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs();

    public RuleGroupRuleStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupRuleStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs build() {
            return new RuleGroupRuleStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs();
        }
    }
}
