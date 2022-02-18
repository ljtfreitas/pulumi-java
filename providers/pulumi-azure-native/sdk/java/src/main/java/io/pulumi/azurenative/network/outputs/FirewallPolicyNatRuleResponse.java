// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ApplicationRuleConditionResponse;
import io.pulumi.azurenative.network.outputs.FirewallPolicyNatRuleActionResponse;
import io.pulumi.azurenative.network.outputs.NatRuleConditionResponse;
import io.pulumi.azurenative.network.outputs.NetworkRuleConditionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirewallPolicyNatRuleResponse {
    /**
     * The action type of a Nat rule.
     * 
     */
    private final @Nullable FirewallPolicyNatRuleActionResponse action;
    /**
     * The name of the rule.
     * 
     */
    private final @Nullable String name;
    /**
     * Priority of the Firewall Policy Rule resource.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * The match conditions for incoming traffic.
     * 
     */
    private final @Nullable Object ruleCondition;
    /**
     * The type of the rule.
     * Expected value is 'FirewallPolicyNatRule'.
     * 
     */
    private final String ruleType;
    /**
     * The translated address for this NAT rule.
     * 
     */
    private final @Nullable String translatedAddress;
    /**
     * The translated port for this NAT rule.
     * 
     */
    private final @Nullable String translatedPort;

    @OutputCustomType.Constructor({"action","name","priority","ruleCondition","ruleType","translatedAddress","translatedPort"})
    private FirewallPolicyNatRuleResponse(
        @Nullable FirewallPolicyNatRuleActionResponse action,
        @Nullable String name,
        @Nullable Integer priority,
        @Nullable Object ruleCondition,
        String ruleType,
        @Nullable String translatedAddress,
        @Nullable String translatedPort) {
        this.action = action;
        this.name = name;
        this.priority = priority;
        this.ruleCondition = ruleCondition;
        this.ruleType = Objects.requireNonNull(ruleType);
        this.translatedAddress = translatedAddress;
        this.translatedPort = translatedPort;
    }

    /**
     * The action type of a Nat rule.
     * 
     */
    public Optional<FirewallPolicyNatRuleActionResponse> getAction() {
        return Optional.ofNullable(this.action);
    }
    /**
     * The name of the rule.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Priority of the Firewall Policy Rule resource.
     * 
     */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The match conditions for incoming traffic.
     * 
     */
    public Optional<Object> getRuleCondition() {
        return Optional.ofNullable(this.ruleCondition);
    }
    /**
     * The type of the rule.
     * Expected value is 'FirewallPolicyNatRule'.
     * 
     */
    public String getRuleType() {
        return this.ruleType;
    }
    /**
     * The translated address for this NAT rule.
     * 
     */
    public Optional<String> getTranslatedAddress() {
        return Optional.ofNullable(this.translatedAddress);
    }
    /**
     * The translated port for this NAT rule.
     * 
     */
    public Optional<String> getTranslatedPort() {
        return Optional.ofNullable(this.translatedPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyNatRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirewallPolicyNatRuleActionResponse action;
        private @Nullable String name;
        private @Nullable Integer priority;
        private @Nullable Object ruleCondition;
        private String ruleType;
        private @Nullable String translatedAddress;
        private @Nullable String translatedPort;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyNatRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleCondition = defaults.ruleCondition;
    	      this.ruleType = defaults.ruleType;
    	      this.translatedAddress = defaults.translatedAddress;
    	      this.translatedPort = defaults.translatedPort;
        }

        public Builder setAction(@Nullable FirewallPolicyNatRuleActionResponse action) {
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

        public Builder setRuleCondition(@Nullable Object ruleCondition) {
            this.ruleCondition = ruleCondition;
            return this;
        }

        public Builder setRuleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder setTranslatedAddress(@Nullable String translatedAddress) {
            this.translatedAddress = translatedAddress;
            return this;
        }

        public Builder setTranslatedPort(@Nullable String translatedPort) {
            this.translatedPort = translatedPort;
            return this;
        }

        public FirewallPolicyNatRuleResponse build() {
            return new FirewallPolicyNatRuleResponse(action, name, priority, ruleCondition, ruleType, translatedAddress, translatedPort);
        }
    }
}
