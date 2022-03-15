// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupRuleDefinition;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class RuleGroupStatelessRule extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupStatelessRule Empty = new RuleGroupStatelessRule();

    @Import(name="priority", required=true)
      private final Integer priority;

    public Integer getPriority() {
        return this.priority;
    }

    @Import(name="ruleDefinition", required=true)
      private final RuleGroupRuleDefinition ruleDefinition;

    public RuleGroupRuleDefinition getRuleDefinition() {
        return this.ruleDefinition;
    }

    public RuleGroupStatelessRule(
        Integer priority,
        RuleGroupRuleDefinition ruleDefinition) {
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleDefinition = Objects.requireNonNull(ruleDefinition, "expected parameter 'ruleDefinition' to be non-null");
    }

    private RuleGroupStatelessRule() {
        this.priority = null;
        this.ruleDefinition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupStatelessRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer priority;
        private RuleGroupRuleDefinition ruleDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupStatelessRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.ruleDefinition = defaults.ruleDefinition;
        }

        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder ruleDefinition(RuleGroupRuleDefinition ruleDefinition) {
            this.ruleDefinition = Objects.requireNonNull(ruleDefinition);
            return this;
        }
        public RuleGroupStatelessRule build() {
            return new RuleGroupStatelessRule(priority, ruleDefinition);
        }
    }
}
