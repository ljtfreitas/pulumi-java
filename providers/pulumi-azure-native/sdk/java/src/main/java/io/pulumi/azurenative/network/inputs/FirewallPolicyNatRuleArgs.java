// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationRuleConditionArgs;
import io.pulumi.azurenative.network.inputs.FirewallPolicyNatRuleActionArgs;
import io.pulumi.azurenative.network.inputs.NatRuleConditionArgs;
import io.pulumi.azurenative.network.inputs.NetworkRuleConditionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Firewall Policy NAT Rule.
 * 
 */
public final class FirewallPolicyNatRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyNatRuleArgs Empty = new FirewallPolicyNatRuleArgs();

    /**
     * The action type of a Nat rule.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<FirewallPolicyNatRuleActionArgs> action;

    public Output<FirewallPolicyNatRuleActionArgs> getAction() {
        return this.action == null ? Output.empty() : this.action;
    }

    /**
     * The name of the rule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Priority of the Firewall Policy Rule resource.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    /**
     * The match conditions for incoming traffic.
     * 
     */
    @Import(name="ruleCondition")
      private final @Nullable Output<Object> ruleCondition;

    public Output<Object> getRuleCondition() {
        return this.ruleCondition == null ? Output.empty() : this.ruleCondition;
    }

    /**
     * The type of the rule.
     * Expected value is 'FirewallPolicyNatRule'.
     * 
     */
    @Import(name="ruleType", required=true)
      private final Output<String> ruleType;

    public Output<String> getRuleType() {
        return this.ruleType;
    }

    /**
     * The translated address for this NAT rule.
     * 
     */
    @Import(name="translatedAddress")
      private final @Nullable Output<String> translatedAddress;

    public Output<String> getTranslatedAddress() {
        return this.translatedAddress == null ? Output.empty() : this.translatedAddress;
    }

    /**
     * The translated port for this NAT rule.
     * 
     */
    @Import(name="translatedPort")
      private final @Nullable Output<String> translatedPort;

    public Output<String> getTranslatedPort() {
        return this.translatedPort == null ? Output.empty() : this.translatedPort;
    }

    public FirewallPolicyNatRuleArgs(
        @Nullable Output<FirewallPolicyNatRuleActionArgs> action,
        @Nullable Output<String> name,
        @Nullable Output<Integer> priority,
        @Nullable Output<Object> ruleCondition,
        Output<String> ruleType,
        @Nullable Output<String> translatedAddress,
        @Nullable Output<String> translatedPort) {
        this.action = action;
        this.name = name;
        this.priority = priority;
        this.ruleCondition = ruleCondition;
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
        this.translatedAddress = translatedAddress;
        this.translatedPort = translatedPort;
    }

    private FirewallPolicyNatRuleArgs() {
        this.action = Output.empty();
        this.name = Output.empty();
        this.priority = Output.empty();
        this.ruleCondition = Output.empty();
        this.ruleType = Output.empty();
        this.translatedAddress = Output.empty();
        this.translatedPort = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyNatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FirewallPolicyNatRuleActionArgs> action;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<Object> ruleCondition;
        private Output<String> ruleType;
        private @Nullable Output<String> translatedAddress;
        private @Nullable Output<String> translatedPort;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyNatRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleCondition = defaults.ruleCondition;
    	      this.ruleType = defaults.ruleType;
    	      this.translatedAddress = defaults.translatedAddress;
    	      this.translatedPort = defaults.translatedPort;
        }

        public Builder action(@Nullable Output<FirewallPolicyNatRuleActionArgs> action) {
            this.action = action;
            return this;
        }

        public Builder action(@Nullable FirewallPolicyNatRuleActionArgs action) {
            this.action = Output.ofNullable(action);
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

        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = Output.ofNullable(priority);
            return this;
        }

        public Builder ruleCondition(@Nullable Output<Object> ruleCondition) {
            this.ruleCondition = ruleCondition;
            return this;
        }

        public Builder ruleCondition(@Nullable Object ruleCondition) {
            this.ruleCondition = Output.ofNullable(ruleCondition);
            return this;
        }

        public Builder ruleType(Output<String> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder ruleType(String ruleType) {
            this.ruleType = Output.of(Objects.requireNonNull(ruleType));
            return this;
        }

        public Builder translatedAddress(@Nullable Output<String> translatedAddress) {
            this.translatedAddress = translatedAddress;
            return this;
        }

        public Builder translatedAddress(@Nullable String translatedAddress) {
            this.translatedAddress = Output.ofNullable(translatedAddress);
            return this;
        }

        public Builder translatedPort(@Nullable Output<String> translatedPort) {
            this.translatedPort = translatedPort;
            return this;
        }

        public Builder translatedPort(@Nullable String translatedPort) {
            this.translatedPort = Output.ofNullable(translatedPort);
            return this;
        }
        public FirewallPolicyNatRuleArgs build() {
            return new FirewallPolicyNatRuleArgs(action, name, priority, ruleCondition, ruleType, translatedAddress, translatedPort);
        }
    }
}
