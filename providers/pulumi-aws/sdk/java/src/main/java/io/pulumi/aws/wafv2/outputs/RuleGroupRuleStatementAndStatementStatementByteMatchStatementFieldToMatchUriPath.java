// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupRuleStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath {
    @OutputCustomType.Constructor({})
    private RuleGroupRuleStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupRuleStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath build() {
            return new RuleGroupRuleStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath();
        }
    }
}
