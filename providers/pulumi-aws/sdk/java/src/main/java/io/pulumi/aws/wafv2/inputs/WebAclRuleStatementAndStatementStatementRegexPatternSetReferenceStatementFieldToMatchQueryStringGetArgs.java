// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs Empty = new WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs();

    public WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs();
        }
    }
}