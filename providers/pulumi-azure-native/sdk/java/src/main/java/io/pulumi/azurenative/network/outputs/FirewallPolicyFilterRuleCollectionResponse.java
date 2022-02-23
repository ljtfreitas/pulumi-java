// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ApplicationRuleResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicyFilterRuleCollectionActionResponse;
import io.pulumi.azurenative.network.outputs.NatRuleResponse;
import io.pulumi.azurenative.network.outputs.NetworkRuleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirewallPolicyFilterRuleCollectionResponse {
    /**
     * The action type of a Filter rule collection.
     * 
     */
    private final @Nullable FirewallPolicyFilterRuleCollectionActionResponse action;
    /**
     * The name of the rule collection.
     * 
     */
    private final @Nullable String name;
    /**
     * Priority of the Firewall Policy Rule Collection resource.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * The type of the rule collection.
     * Expected value is 'FirewallPolicyFilterRuleCollection'.
     * 
     */
    private final String ruleCollectionType;
    /**
     * List of rules included in a rule collection.
     * 
     */
    private final @Nullable List<Object> rules;

    @OutputCustomType.Constructor({"action","name","priority","ruleCollectionType","rules"})
    private FirewallPolicyFilterRuleCollectionResponse(
        @Nullable FirewallPolicyFilterRuleCollectionActionResponse action,
        @Nullable String name,
        @Nullable Integer priority,
        String ruleCollectionType,
        @Nullable List<Object> rules) {
        this.action = action;
        this.name = name;
        this.priority = priority;
        this.ruleCollectionType = Objects.requireNonNull(ruleCollectionType);
        this.rules = rules;
    }

    /**
     * The action type of a Filter rule collection.
     * 
     */
    public Optional<FirewallPolicyFilterRuleCollectionActionResponse> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * The name of the rule collection.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Priority of the Firewall Policy Rule Collection resource.
     * 
     */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The type of the rule collection.
     * Expected value is 'FirewallPolicyFilterRuleCollection'.
     * 
     */
    public String getRuleCollectionType() {
        return this.ruleCollectionType;
    }
    /**
     * List of rules included in a rule collection.
     * 
     */
    public List<Object> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFilterRuleCollectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirewallPolicyFilterRuleCollectionActionResponse action;
        private @Nullable String name;
        private @Nullable Integer priority;
        private String ruleCollectionType;
        private @Nullable List<Object> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFilterRuleCollectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleCollectionType = defaults.ruleCollectionType;
    	      this.rules = defaults.rules;
        }

        public Builder setAction(@Nullable FirewallPolicyFilterRuleCollectionActionResponse action) {
            this.action = action;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setRuleCollectionType(String ruleCollectionType) {
            this.ruleCollectionType = Objects.requireNonNull(ruleCollectionType);
            return this;
        }

        public Builder setRules(@Nullable List<Object> rules) {
            this.rules = rules;
            return this;
        }
        public FirewallPolicyFilterRuleCollectionResponse build() {
            return new FirewallPolicyFilterRuleCollectionResponse(action, name, priority, ruleCollectionType, rules);
        }
    }
}
