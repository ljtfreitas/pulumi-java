// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs Empty = new WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs();

    public WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs build() {
            return new WebAclRuleStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs();
        }
    }
}
