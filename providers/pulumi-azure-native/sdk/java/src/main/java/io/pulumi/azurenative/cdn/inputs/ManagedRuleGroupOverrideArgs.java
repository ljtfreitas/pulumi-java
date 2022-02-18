// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.ManagedRuleOverrideArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines a managed rule group override setting.
 * 
 */
public final class ManagedRuleGroupOverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedRuleGroupOverrideArgs Empty = new ManagedRuleGroupOverrideArgs();

    /**
     * Describes the managed rule group within the rule set to override
     * 
     */
    @InputImport(name="ruleGroupName", required=true)
    private final Input<String> ruleGroupName;

    public Input<String> getRuleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * List of rules that will be disabled. If none specified, all rules in the group will be disabled.
     * 
     */
    @InputImport(name="rules")
    private final @Nullable Input<List<ManagedRuleOverrideArgs>> rules;

    public Input<List<ManagedRuleOverrideArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    public ManagedRuleGroupOverrideArgs(
        Input<String> ruleGroupName,
        @Nullable Input<List<ManagedRuleOverrideArgs>> rules) {
        this.ruleGroupName = Objects.requireNonNull(ruleGroupName, "expected parameter 'ruleGroupName' to be non-null");
        this.rules = rules;
    }

    private ManagedRuleGroupOverrideArgs() {
        this.ruleGroupName = Input.empty();
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleGroupOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ruleGroupName;
        private @Nullable Input<List<ManagedRuleOverrideArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleGroupOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleGroupName = defaults.ruleGroupName;
    	      this.rules = defaults.rules;
        }

        public Builder setRuleGroupName(Input<String> ruleGroupName) {
            this.ruleGroupName = Objects.requireNonNull(ruleGroupName);
            return this;
        }

        public Builder setRuleGroupName(String ruleGroupName) {
            this.ruleGroupName = Input.of(Objects.requireNonNull(ruleGroupName));
            return this;
        }

        public Builder setRules(@Nullable Input<List<ManagedRuleOverrideArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<ManagedRuleOverrideArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public ManagedRuleGroupOverrideArgs build() {
            return new ManagedRuleGroupOverrideArgs(ruleGroupName, rules);
        }
    }
}
