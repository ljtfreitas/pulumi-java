// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementByteMatchStatementFieldToMatchUriPathGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementByteMatchStatementFieldToMatchUriPathGetArgs Empty = new WebAclRuleStatementByteMatchStatementFieldToMatchUriPathGetArgs();

    public WebAclRuleStatementByteMatchStatementFieldToMatchUriPathGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementByteMatchStatementFieldToMatchUriPathGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementByteMatchStatementFieldToMatchUriPathGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementByteMatchStatementFieldToMatchUriPathGetArgs build() {
            return new WebAclRuleStatementByteMatchStatementFieldToMatchUriPathGetArgs();
        }
    }
}
