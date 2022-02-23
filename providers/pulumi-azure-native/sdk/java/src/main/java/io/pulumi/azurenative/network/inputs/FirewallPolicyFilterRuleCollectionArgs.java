// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationRuleArgs;
import io.pulumi.azurenative.network.inputs.FirewallPolicyFilterRuleCollectionActionArgs;
import io.pulumi.azurenative.network.inputs.NatRuleArgs;
import io.pulumi.azurenative.network.inputs.NetworkRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Firewall Policy Filter Rule Collection.
 * 
 */
public final class FirewallPolicyFilterRuleCollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFilterRuleCollectionArgs Empty = new FirewallPolicyFilterRuleCollectionArgs();

    /**
     * The action type of a Filter rule collection.
     * 
     */
    @InputImport(name="action")
        private final @Nullable Input<FirewallPolicyFilterRuleCollectionActionArgs> action;

    public Input<FirewallPolicyFilterRuleCollectionActionArgs> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * The name of the rule collection.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Priority of the Firewall Policy Rule Collection resource.
     * 
     */
    @InputImport(name="priority")
        private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * The type of the rule collection.
     * Expected value is 'FirewallPolicyFilterRuleCollection'.
     * 
     */
    @InputImport(name="ruleCollectionType", required=true)
        private final Input<String> ruleCollectionType;

    public Input<String> getRuleCollectionType() {
        return this.ruleCollectionType;
    }

    /**
     * List of rules included in a rule collection.
     * 
     */
    @InputImport(name="rules")
        private final @Nullable Input<List<Object>> rules;

    public Input<List<Object>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    public FirewallPolicyFilterRuleCollectionArgs(
        @Nullable Input<FirewallPolicyFilterRuleCollectionActionArgs> action,
        @Nullable Input<String> name,
        @Nullable Input<Integer> priority,
        Input<String> ruleCollectionType,
        @Nullable Input<List<Object>> rules) {
        this.action = action;
        this.name = name;
        this.priority = priority;
        this.ruleCollectionType = Objects.requireNonNull(ruleCollectionType, "expected parameter 'ruleCollectionType' to be non-null");
        this.rules = rules;
    }

    private FirewallPolicyFilterRuleCollectionArgs() {
        this.action = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
        this.ruleCollectionType = Input.empty();
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFilterRuleCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FirewallPolicyFilterRuleCollectionActionArgs> action;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> priority;
        private Input<String> ruleCollectionType;
        private @Nullable Input<List<Object>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFilterRuleCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleCollectionType = defaults.ruleCollectionType;
    	      this.rules = defaults.rules;
        }

        public Builder setAction(@Nullable Input<FirewallPolicyFilterRuleCollectionActionArgs> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable FirewallPolicyFilterRuleCollectionActionArgs action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setRuleCollectionType(Input<String> ruleCollectionType) {
            this.ruleCollectionType = Objects.requireNonNull(ruleCollectionType);
            return this;
        }

        public Builder setRuleCollectionType(String ruleCollectionType) {
            this.ruleCollectionType = Input.of(Objects.requireNonNull(ruleCollectionType));
            return this;
        }

        public Builder setRules(@Nullable Input<List<Object>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<Object> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }
        public FirewallPolicyFilterRuleCollectionArgs build() {
            return new FirewallPolicyFilterRuleCollectionArgs(action, name, priority, ruleCollectionType, rules);
        }
    }
}
