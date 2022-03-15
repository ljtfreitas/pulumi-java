// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionAllowCustomRequestHandlingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleActionAllowArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionAllowArgs Empty = new RuleGroupRuleActionAllowArgs();

    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    @Import(name="customRequestHandling")
      private final @Nullable Output<RuleGroupRuleActionAllowCustomRequestHandlingArgs> customRequestHandling;

    public Output<RuleGroupRuleActionAllowCustomRequestHandlingArgs> getCustomRequestHandling() {
        return this.customRequestHandling == null ? Output.empty() : this.customRequestHandling;
    }

    public RuleGroupRuleActionAllowArgs(@Nullable Output<RuleGroupRuleActionAllowCustomRequestHandlingArgs> customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    private RuleGroupRuleActionAllowArgs() {
        this.customRequestHandling = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionAllowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleActionAllowCustomRequestHandlingArgs> customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionAllowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder customRequestHandling(@Nullable Output<RuleGroupRuleActionAllowCustomRequestHandlingArgs> customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }

        public Builder customRequestHandling(@Nullable RuleGroupRuleActionAllowCustomRequestHandlingArgs customRequestHandling) {
            this.customRequestHandling = Output.ofNullable(customRequestHandling);
            return this;
        }
        public RuleGroupRuleActionAllowArgs build() {
            return new RuleGroupRuleActionAllowArgs(customRequestHandling);
        }
    }
}
