// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.aws.waf.inputs.RuleGroupActivatedRuleActionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupActivatedRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupActivatedRuleArgs Empty = new RuleGroupActivatedRuleArgs();

    /**
     * Specifies the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.
     * 
     */
    @InputImport(name="action", required=true)
    private final Input<RuleGroupActivatedRuleActionArgs> action;

    public Input<RuleGroupActivatedRuleActionArgs> getAction() {
        return this.action;
    }

    /**
     * Specifies the order in which the rules are evaluated. Rules with a lower value are evaluated before rules with a higher value.
     * 
     */
    @InputImport(name="priority", required=true)
    private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    /**
     * The ID of a `waf_rule`
     * 
     */
    @InputImport(name="ruleId", required=true)
    private final Input<String> ruleId;

    public Input<String> getRuleId() {
        return this.ruleId;
    }

    /**
     * The rule type, either `REGULAR`, `RATE_BASED`, or `GROUP`. Defaults to `REGULAR`.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public RuleGroupActivatedRuleArgs(
        Input<RuleGroupActivatedRuleActionArgs> action,
        Input<Integer> priority,
        Input<String> ruleId,
        @Nullable Input<String> type) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.ruleId = Objects.requireNonNull(ruleId, "expected parameter 'ruleId' to be non-null");
        this.type = type;
    }

    private RuleGroupActivatedRuleArgs() {
        this.action = Input.empty();
        this.priority = Input.empty();
        this.ruleId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupActivatedRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RuleGroupActivatedRuleActionArgs> action;
        private Input<Integer> priority;
        private Input<String> ruleId;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupActivatedRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.priority = defaults.priority;
    	      this.ruleId = defaults.ruleId;
    	      this.type = defaults.type;
        }

        public Builder setAction(Input<RuleGroupActivatedRuleActionArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(RuleGroupActivatedRuleActionArgs action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder setRuleId(Input<String> ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }

        public Builder setRuleId(String ruleId) {
            this.ruleId = Input.of(Objects.requireNonNull(ruleId));
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public RuleGroupActivatedRuleArgs build() {
            return new RuleGroupActivatedRuleArgs(action, priority, ruleId, type);
        }
    }
}
