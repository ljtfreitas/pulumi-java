// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationRuleResponse;
import io.pulumi.azurenative.network.inputs.FirewallPolicyNatRuleCollectionActionResponse;
import io.pulumi.azurenative.network.inputs.NatRuleResponse;
import io.pulumi.azurenative.network.inputs.NetworkRuleResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Firewall Policy NAT Rule Collection.
 * 
 */
public final class FirewallPolicyNatRuleCollectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyNatRuleCollectionResponse Empty = new FirewallPolicyNatRuleCollectionResponse();

    /**
     * The action type of a Nat rule collection.
     * 
     */
    @Import(name="action")
      private final @Nullable FirewallPolicyNatRuleCollectionActionResponse action;

    public Optional<FirewallPolicyNatRuleCollectionActionResponse> getAction() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    /**
     * The name of the rule collection.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Priority of the Firewall Policy Rule Collection resource.
     * 
     */
    @Import(name="priority")
      private final @Nullable Integer priority;

    public Optional<Integer> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    /**
     * The type of the rule collection.
     * Expected value is 'FirewallPolicyNatRuleCollection'.
     * 
     */
    @Import(name="ruleCollectionType", required=true)
      private final String ruleCollectionType;

    public String getRuleCollectionType() {
        return this.ruleCollectionType;
    }

    /**
     * List of rules included in a rule collection.
     * 
     */
    @Import(name="rules")
      private final @Nullable List<Object> rules;

    public List<Object> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public FirewallPolicyNatRuleCollectionResponse(
        @Nullable FirewallPolicyNatRuleCollectionActionResponse action,
        @Nullable String name,
        @Nullable Integer priority,
        String ruleCollectionType,
        @Nullable List<Object> rules) {
        this.action = action;
        this.name = name;
        this.priority = priority;
        this.ruleCollectionType = Objects.requireNonNull(ruleCollectionType, "expected parameter 'ruleCollectionType' to be non-null");
        this.rules = rules;
    }

    private FirewallPolicyNatRuleCollectionResponse() {
        this.action = null;
        this.name = null;
        this.priority = null;
        this.ruleCollectionType = null;
        this.rules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyNatRuleCollectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirewallPolicyNatRuleCollectionActionResponse action;
        private @Nullable String name;
        private @Nullable Integer priority;
        private String ruleCollectionType;
        private @Nullable List<Object> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyNatRuleCollectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleCollectionType = defaults.ruleCollectionType;
    	      this.rules = defaults.rules;
        }

        public Builder action(@Nullable FirewallPolicyNatRuleCollectionActionResponse action) {
            this.action = action;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder ruleCollectionType(String ruleCollectionType) {
            this.ruleCollectionType = Objects.requireNonNull(ruleCollectionType);
            return this;
        }

        public Builder rules(@Nullable List<Object> rules) {
            this.rules = rules;
            return this;
        }
        public FirewallPolicyNatRuleCollectionResponse build() {
            return new FirewallPolicyNatRuleCollectionResponse(action, name, priority, ruleCollectionType, rules);
        }
    }
}
