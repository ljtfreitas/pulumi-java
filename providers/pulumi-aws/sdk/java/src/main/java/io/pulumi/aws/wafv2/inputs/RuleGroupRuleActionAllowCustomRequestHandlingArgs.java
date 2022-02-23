// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleActionAllowCustomRequestHandlingArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionAllowCustomRequestHandlingArgs Empty = new RuleGroupRuleActionAllowCustomRequestHandlingArgs();

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    @InputImport(name="insertHeaders", required=true)
    private final Input<List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderArgs>> insertHeaders;

    public Input<List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderArgs>> getInsertHeaders() {
        return this.insertHeaders;
    }

    public RuleGroupRuleActionAllowCustomRequestHandlingArgs(Input<List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderArgs>> insertHeaders) {
        this.insertHeaders = Objects.requireNonNull(insertHeaders, "expected parameter 'insertHeaders' to be non-null");
    }

    private RuleGroupRuleActionAllowCustomRequestHandlingArgs() {
        this.insertHeaders = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionAllowCustomRequestHandlingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderArgs>> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionAllowCustomRequestHandlingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder setInsertHeaders(Input<List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderArgs>> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }

        public Builder setInsertHeaders(List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeaderArgs> insertHeaders) {
            this.insertHeaders = Input.of(Objects.requireNonNull(insertHeaders));
            return this;
        }
        public RuleGroupRuleActionAllowCustomRequestHandlingArgs build() {
            return new RuleGroupRuleActionAllowCustomRequestHandlingArgs(insertHeaders);
        }
    }
}
