// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchQueryString {
    @OutputCustomType.Constructor({})
    private WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchQueryString() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchQueryString defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchQueryString defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchQueryString build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementSqliMatchStatementFieldToMatchQueryString();
        }
    }
}
