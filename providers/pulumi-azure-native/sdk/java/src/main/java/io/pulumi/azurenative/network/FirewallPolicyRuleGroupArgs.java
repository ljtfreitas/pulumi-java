// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.FirewallPolicyFilterRuleArgs;
import io.pulumi.azurenative.network.inputs.FirewallPolicyNatRuleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyRuleGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleGroupArgs Empty = new FirewallPolicyRuleGroupArgs();

    /**
     * The name of the Firewall Policy.
     * 
     */
    @Import(name="firewallPolicyName", required=true)
      private final Output<String> firewallPolicyName;

    public Output<String> getFirewallPolicyName() {
        return this.firewallPolicyName;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Priority of the Firewall Policy Rule Group resource.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the FirewallPolicyRuleGroup.
     * 
     */
    @Import(name="ruleGroupName")
      private final @Nullable Output<String> ruleGroupName;

    public Output<String> getRuleGroupName() {
        return this.ruleGroupName == null ? Output.empty() : this.ruleGroupName;
    }

    /**
     * Group of Firewall Policy rules.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<Either<FirewallPolicyFilterRuleArgs,FirewallPolicyNatRuleArgs>>> rules;

    public Output<List<Either<FirewallPolicyFilterRuleArgs,FirewallPolicyNatRuleArgs>>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
    }

    public FirewallPolicyRuleGroupArgs(
        Output<String> firewallPolicyName,
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<Integer> priority,
        Output<String> resourceGroupName,
        @Nullable Output<String> ruleGroupName,
        @Nullable Output<List<Either<FirewallPolicyFilterRuleArgs,FirewallPolicyNatRuleArgs>>> rules) {
        this.firewallPolicyName = Objects.requireNonNull(firewallPolicyName, "expected parameter 'firewallPolicyName' to be non-null");
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleGroupName = ruleGroupName;
        this.rules = rules;
    }

    private FirewallPolicyRuleGroupArgs() {
        this.firewallPolicyName = Output.empty();
        this.id = Output.empty();
        this.name = Output.empty();
        this.priority = Output.empty();
        this.resourceGroupName = Output.empty();
        this.ruleGroupName = Output.empty();
        this.rules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> firewallPolicyName;
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> priority;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> ruleGroupName;
        private @Nullable Output<List<Either<FirewallPolicyFilterRuleArgs,FirewallPolicyNatRuleArgs>>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallPolicyName = defaults.firewallPolicyName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleGroupName = defaults.ruleGroupName;
    	      this.rules = defaults.rules;
        }

        public Builder firewallPolicyName(Output<String> firewallPolicyName) {
            this.firewallPolicyName = Objects.requireNonNull(firewallPolicyName);
            return this;
        }

        public Builder firewallPolicyName(String firewallPolicyName) {
            this.firewallPolicyName = Output.of(Objects.requireNonNull(firewallPolicyName));
            return this;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
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

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder ruleGroupName(@Nullable Output<String> ruleGroupName) {
            this.ruleGroupName = ruleGroupName;
            return this;
        }

        public Builder ruleGroupName(@Nullable String ruleGroupName) {
            this.ruleGroupName = Output.ofNullable(ruleGroupName);
            return this;
        }

        public Builder rules(@Nullable Output<List<Either<FirewallPolicyFilterRuleArgs,FirewallPolicyNatRuleArgs>>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder rules(@Nullable List<Either<FirewallPolicyFilterRuleArgs,FirewallPolicyNatRuleArgs>> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }
        public FirewallPolicyRuleGroupArgs build() {
            return new FirewallPolicyRuleGroupArgs(firewallPolicyName, id, name, priority, resourceGroupName, ruleGroupName, rules);
        }
    }
}
