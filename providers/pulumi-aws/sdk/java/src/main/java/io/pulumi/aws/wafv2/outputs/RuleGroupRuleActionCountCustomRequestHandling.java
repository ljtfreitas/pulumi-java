// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleActionCountCustomRequestHandlingInsertHeader;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupRuleActionCountCustomRequestHandling {
    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    private final List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeader> insertHeaders;

    @OutputCustomType.Constructor({"insertHeaders"})
    private RuleGroupRuleActionCountCustomRequestHandling(List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeader> insertHeaders) {
        this.insertHeaders = Objects.requireNonNull(insertHeaders);
    }

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    public List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeader> getInsertHeaders() {
        return this.insertHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionCountCustomRequestHandling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeader> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionCountCustomRequestHandling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder setInsertHeaders(List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeader> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }
        public RuleGroupRuleActionCountCustomRequestHandling build() {
            return new RuleGroupRuleActionCountCustomRequestHandling(insertHeaders);
        }
    }
}
