// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs Empty = new WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs();

    public WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs build() {
            return new WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethodArgs();
        }
    }
}
