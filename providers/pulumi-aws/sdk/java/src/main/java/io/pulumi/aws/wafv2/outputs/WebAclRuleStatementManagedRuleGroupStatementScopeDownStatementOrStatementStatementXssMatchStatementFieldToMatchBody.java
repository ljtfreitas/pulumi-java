// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementXssMatchStatementFieldToMatchBody {
    @CustomType.Constructor
    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementXssMatchStatementFieldToMatchBody() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementXssMatchStatementFieldToMatchBody defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementXssMatchStatementFieldToMatchBody defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementXssMatchStatementFieldToMatchBody build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementXssMatchStatementFieldToMatchBody();
        }
    }
}
