// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs Empty = new RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs();

    public RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs build() {
            return new RuleGroupRuleStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs();
        }
    }
}
