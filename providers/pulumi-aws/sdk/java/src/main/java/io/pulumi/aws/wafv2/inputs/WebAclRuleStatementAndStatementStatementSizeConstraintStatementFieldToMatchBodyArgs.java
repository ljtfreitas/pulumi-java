// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs Empty = new WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs();

    public WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs build() {
            return new WebAclRuleStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs();
        }
    }
}
