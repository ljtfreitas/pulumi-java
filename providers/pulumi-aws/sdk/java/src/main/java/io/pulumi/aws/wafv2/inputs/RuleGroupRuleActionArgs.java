// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionArgs Empty = new RuleGroupRuleActionArgs();

    /**
     * Instructs AWS WAF to allow the web request. See Allow below for details.
     * 
     */
    @Import(name="allow")
      private final @Nullable Output<RuleGroupRuleActionAllowArgs> allow;

    public Output<RuleGroupRuleActionAllowArgs> getAllow() {
        return this.allow == null ? Output.empty() : this.allow;
    }

    /**
     * Instructs AWS WAF to block the web request. See Block below for details.
     * 
     */
    @Import(name="block")
      private final @Nullable Output<RuleGroupRuleActionBlockArgs> block;

    public Output<RuleGroupRuleActionBlockArgs> getBlock() {
        return this.block == null ? Output.empty() : this.block;
    }

    /**
     * Instructs AWS WAF to count the web request and allow it. See Count below for details.
     * 
     */
    @Import(name="count")
      private final @Nullable Output<RuleGroupRuleActionCountArgs> count;

    public Output<RuleGroupRuleActionCountArgs> getCount() {
        return this.count == null ? Output.empty() : this.count;
    }

    public RuleGroupRuleActionArgs(
        @Nullable Output<RuleGroupRuleActionAllowArgs> allow,
        @Nullable Output<RuleGroupRuleActionBlockArgs> block,
        @Nullable Output<RuleGroupRuleActionCountArgs> count) {
        this.allow = allow;
        this.block = block;
        this.count = count;
    }

    private RuleGroupRuleActionArgs() {
        this.allow = Output.empty();
        this.block = Output.empty();
        this.count = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleActionAllowArgs> allow;
        private @Nullable Output<RuleGroupRuleActionBlockArgs> block;
        private @Nullable Output<RuleGroupRuleActionCountArgs> count;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
    	      this.count = defaults.count;
        }

        public Builder allow(@Nullable Output<RuleGroupRuleActionAllowArgs> allow) {
            this.allow = allow;
            return this;
        }

        public Builder allow(@Nullable RuleGroupRuleActionAllowArgs allow) {
            this.allow = Output.ofNullable(allow);
            return this;
        }

        public Builder block(@Nullable Output<RuleGroupRuleActionBlockArgs> block) {
            this.block = block;
            return this;
        }

        public Builder block(@Nullable RuleGroupRuleActionBlockArgs block) {
            this.block = Output.ofNullable(block);
            return this;
        }

        public Builder count(@Nullable Output<RuleGroupRuleActionCountArgs> count) {
            this.count = count;
            return this;
        }

        public Builder count(@Nullable RuleGroupRuleActionCountArgs count) {
            this.count = Output.ofNullable(count);
            return this;
        }
        public RuleGroupRuleActionArgs build() {
            return new RuleGroupRuleActionArgs(allow, block, count);
        }
    }
}
