// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod {
    @OutputCustomType.Constructor({})
    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod();
        }
    }
}
