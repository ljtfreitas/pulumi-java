// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementXssMatchStatementFieldToMatchQueryStringGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementXssMatchStatementFieldToMatchQueryStringGetArgs Empty = new WebAclRuleStatementXssMatchStatementFieldToMatchQueryStringGetArgs();

    public WebAclRuleStatementXssMatchStatementFieldToMatchQueryStringGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementXssMatchStatementFieldToMatchQueryStringGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementXssMatchStatementFieldToMatchQueryStringGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementXssMatchStatementFieldToMatchQueryStringGetArgs build() {
            return new WebAclRuleStatementXssMatchStatementFieldToMatchQueryStringGetArgs();
        }
    }
}
