// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs Empty = new WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs();

    public WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs build() {
            return new WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs();
        }
    }
}
