// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupRuleDefinitionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class RuleGroupStatelessRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupStatelessRuleArgs Empty = new RuleGroupStatelessRuleArgs();

    @InputImport(name="priority", required=true)
        private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    @InputImport(name="ruleDefinition", required=true)
        private final Input<RuleGroupRuleDefinitionArgs> ruleDefinition;

    public Input<RuleGroupRuleDefinitionArgs> getRuleDefinition() {
        return this.ruleDefinition;
    }

    public RuleGroupStatelessRuleArgs(
        Input<Integer> priority,
        Input<RuleGroupRuleDefinitionArgs> ruleDefinition) {
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleDefinition = Objects.requireNonNull(ruleDefinition, "expected parameter 'ruleDefinition' to be non-null");
    }

    private RuleGroupStatelessRuleArgs() {
        this.priority = Input.empty();
        this.ruleDefinition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupStatelessRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> priority;
        private Input<RuleGroupRuleDefinitionArgs> ruleDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupStatelessRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.ruleDefinition = defaults.ruleDefinition;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder setRuleDefinition(Input<RuleGroupRuleDefinitionArgs> ruleDefinition) {
            this.ruleDefinition = Objects.requireNonNull(ruleDefinition);
            return this;
        }

        public Builder setRuleDefinition(RuleGroupRuleDefinitionArgs ruleDefinition) {
            this.ruleDefinition = Input.of(Objects.requireNonNull(ruleDefinition));
            return this;
        }
        public RuleGroupStatelessRuleArgs build() {
            return new RuleGroupStatelessRuleArgs(priority, ruleDefinition);
        }
    }
}
