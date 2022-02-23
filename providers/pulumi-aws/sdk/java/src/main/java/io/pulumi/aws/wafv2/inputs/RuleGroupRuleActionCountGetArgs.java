// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountCustomRequestHandlingGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleActionCountGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionCountGetArgs Empty = new RuleGroupRuleActionCountGetArgs();

    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    @InputImport(name="customRequestHandling")
    private final @Nullable Input<RuleGroupRuleActionCountCustomRequestHandlingGetArgs> customRequestHandling;

    public Input<RuleGroupRuleActionCountCustomRequestHandlingGetArgs> getCustomRequestHandling() {
        return this.customRequestHandling == null ? Input.empty() : this.customRequestHandling;
    }

    public RuleGroupRuleActionCountGetArgs(@Nullable Input<RuleGroupRuleActionCountCustomRequestHandlingGetArgs> customRequestHandling) {
        this.customRequestHandling = customRequestHandling;
    }

    private RuleGroupRuleActionCountGetArgs() {
        this.customRequestHandling = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionCountGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRuleActionCountCustomRequestHandlingGetArgs> customRequestHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionCountGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRequestHandling = defaults.customRequestHandling;
        }

        public Builder setCustomRequestHandling(@Nullable Input<RuleGroupRuleActionCountCustomRequestHandlingGetArgs> customRequestHandling) {
            this.customRequestHandling = customRequestHandling;
            return this;
        }

        public Builder setCustomRequestHandling(@Nullable RuleGroupRuleActionCountCustomRequestHandlingGetArgs customRequestHandling) {
            this.customRequestHandling = Input.ofNullable(customRequestHandling);
            return this;
        }
        public RuleGroupRuleActionCountGetArgs build() {
            return new RuleGroupRuleActionCountGetArgs(customRequestHandling);
        }
    }
}
