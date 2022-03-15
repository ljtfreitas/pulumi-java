// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationGatewayRewriteRuleActionSetArgs;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayRewriteRuleConditionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rewrite rule of an application gateway.
 * 
 */
public final class ApplicationGatewayRewriteRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayRewriteRuleArgs Empty = new ApplicationGatewayRewriteRuleArgs();

    /**
     * Set of actions to be done as part of the rewrite Rule.
     * 
     */
    @Import(name="actionSet")
      private final @Nullable Output<ApplicationGatewayRewriteRuleActionSetArgs> actionSet;

    public Output<ApplicationGatewayRewriteRuleActionSetArgs> getActionSet() {
        return this.actionSet == null ? Output.empty() : this.actionSet;
    }

    /**
     * Conditions based on which the action set execution will be evaluated.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<ApplicationGatewayRewriteRuleConditionArgs>> conditions;

    public Output<List<ApplicationGatewayRewriteRuleConditionArgs>> getConditions() {
        return this.conditions == null ? Output.empty() : this.conditions;
    }

    /**
     * Name of the rewrite rule that is unique within an Application Gateway.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Rule Sequence of the rewrite rule that determines the order of execution of a particular rule in a RewriteRuleSet.
     * 
     */
    @Import(name="ruleSequence")
      private final @Nullable Output<Integer> ruleSequence;

    public Output<Integer> getRuleSequence() {
        return this.ruleSequence == null ? Output.empty() : this.ruleSequence;
    }

    public ApplicationGatewayRewriteRuleArgs(
        @Nullable Output<ApplicationGatewayRewriteRuleActionSetArgs> actionSet,
        @Nullable Output<List<ApplicationGatewayRewriteRuleConditionArgs>> conditions,
        @Nullable Output<String> name,
        @Nullable Output<Integer> ruleSequence) {
        this.actionSet = actionSet;
        this.conditions = conditions;
        this.name = name;
        this.ruleSequence = ruleSequence;
    }

    private ApplicationGatewayRewriteRuleArgs() {
        this.actionSet = Output.empty();
        this.conditions = Output.empty();
        this.name = Output.empty();
        this.ruleSequence = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRewriteRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ApplicationGatewayRewriteRuleActionSetArgs> actionSet;
        private @Nullable Output<List<ApplicationGatewayRewriteRuleConditionArgs>> conditions;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> ruleSequence;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRewriteRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionSet = defaults.actionSet;
    	      this.conditions = defaults.conditions;
    	      this.name = defaults.name;
    	      this.ruleSequence = defaults.ruleSequence;
        }

        public Builder actionSet(@Nullable Output<ApplicationGatewayRewriteRuleActionSetArgs> actionSet) {
            this.actionSet = actionSet;
            return this;
        }

        public Builder actionSet(@Nullable ApplicationGatewayRewriteRuleActionSetArgs actionSet) {
            this.actionSet = Output.ofNullable(actionSet);
            return this;
        }

        public Builder conditions(@Nullable Output<List<ApplicationGatewayRewriteRuleConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder conditions(@Nullable List<ApplicationGatewayRewriteRuleConditionArgs> conditions) {
            this.conditions = Output.ofNullable(conditions);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder ruleSequence(@Nullable Output<Integer> ruleSequence) {
            this.ruleSequence = ruleSequence;
            return this;
        }

        public Builder ruleSequence(@Nullable Integer ruleSequence) {
            this.ruleSequence = Output.ofNullable(ruleSequence);
            return this;
        }
        public ApplicationGatewayRewriteRuleArgs build() {
            return new ApplicationGatewayRewriteRuleArgs(actionSet, conditions, name, ruleSequence);
        }
    }
}
