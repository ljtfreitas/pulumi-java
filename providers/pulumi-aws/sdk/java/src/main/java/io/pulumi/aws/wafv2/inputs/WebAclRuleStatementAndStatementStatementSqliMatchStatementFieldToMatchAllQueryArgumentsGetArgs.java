// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs Empty = new WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs();

    public WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs();
        }
    }
}