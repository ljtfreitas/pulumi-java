// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs();

    public WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchBodyArgs();
        }
    }
}
