// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs Empty = new WebAclRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs();

    public WebAclRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs build() {
            return new WebAclRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs();
        }
    }
}
