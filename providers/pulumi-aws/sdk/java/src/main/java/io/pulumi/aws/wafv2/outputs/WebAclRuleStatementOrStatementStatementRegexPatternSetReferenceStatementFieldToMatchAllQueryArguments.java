// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments {
    @CustomType.Constructor
    private WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments build() {
            return new WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments();
        }
    }
}
