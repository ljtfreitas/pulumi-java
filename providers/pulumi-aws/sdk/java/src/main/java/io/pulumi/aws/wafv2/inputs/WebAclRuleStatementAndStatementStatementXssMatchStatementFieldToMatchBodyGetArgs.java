// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs Empty = new WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs();

    public WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs();
        }
    }
}
