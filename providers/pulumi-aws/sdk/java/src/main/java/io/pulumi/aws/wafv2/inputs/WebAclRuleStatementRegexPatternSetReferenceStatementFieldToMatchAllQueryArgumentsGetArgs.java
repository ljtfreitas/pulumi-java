// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs Empty = new WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs();

    public WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs build() {
            return new WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs();
        }
    }
}
