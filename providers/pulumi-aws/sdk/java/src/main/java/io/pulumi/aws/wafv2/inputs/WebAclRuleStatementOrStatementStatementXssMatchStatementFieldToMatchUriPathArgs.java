// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathArgs Empty = new WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathArgs();

    public WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathArgs build() {
            return new WebAclRuleStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathArgs();
        }
    }
}
