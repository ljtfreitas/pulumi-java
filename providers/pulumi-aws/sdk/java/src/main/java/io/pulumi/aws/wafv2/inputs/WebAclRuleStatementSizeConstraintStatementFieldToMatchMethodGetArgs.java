// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementSizeConstraintStatementFieldToMatchMethodGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementSizeConstraintStatementFieldToMatchMethodGetArgs Empty = new WebAclRuleStatementSizeConstraintStatementFieldToMatchMethodGetArgs();

    public WebAclRuleStatementSizeConstraintStatementFieldToMatchMethodGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementSizeConstraintStatementFieldToMatchMethodGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementSizeConstraintStatementFieldToMatchMethodGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementSizeConstraintStatementFieldToMatchMethodGetArgs build() {
            return new WebAclRuleStatementSizeConstraintStatementFieldToMatchMethodGetArgs();
        }
    }
}
