// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs Empty = new WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs();

    public WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs build() {
            return new WebAclRuleStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs();
        }
    }
}
