// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs Empty = new FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs();

    /**
     * Indicates how to manage the order of stateful rule evaluation for the policy. Default value: `DEFAULT_ACTION_ORDER`. Valid values: `DEFAULT_ACTION_ORDER`, `STRICT_ORDER`.
     * 
     */
    @InputImport(name="ruleOrder", required=true)
    private final Input<String> ruleOrder;

    public Input<String> getRuleOrder() {
        return this.ruleOrder;
    }

    public FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs(Input<String> ruleOrder) {
        this.ruleOrder = Objects.requireNonNull(ruleOrder, "expected parameter 'ruleOrder' to be non-null");
    }

    private FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs() {
        this.ruleOrder = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ruleOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleOrder = defaults.ruleOrder;
        }

        public Builder setRuleOrder(Input<String> ruleOrder) {
            this.ruleOrder = Objects.requireNonNull(ruleOrder);
            return this;
        }

        public Builder setRuleOrder(String ruleOrder) {
            this.ruleOrder = Input.of(Objects.requireNonNull(ruleOrder));
            return this;
        }
        public FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs build() {
            return new FirewallPolicyFirewallPolicyStatefulEngineOptionsArgs(ruleOrder);
        }
    }
}
