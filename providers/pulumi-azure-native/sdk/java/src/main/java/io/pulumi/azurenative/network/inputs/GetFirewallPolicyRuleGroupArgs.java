// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallPolicyRuleGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyRuleGroupArgs Empty = new GetFirewallPolicyRuleGroupArgs();

    /**
     * The name of the Firewall Policy.
     * 
     */
    @InputImport(name="firewallPolicyName", required=true)
    private final String firewallPolicyName;

    public String getFirewallPolicyName() {
        return this.firewallPolicyName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the FirewallPolicyRuleGroup.
     * 
     */
    @InputImport(name="ruleGroupName", required=true)
    private final String ruleGroupName;

    public String getRuleGroupName() {
        return this.ruleGroupName;
    }

    public GetFirewallPolicyRuleGroupArgs(
        String firewallPolicyName,
        String resourceGroupName,
        String ruleGroupName) {
        this.firewallPolicyName = Objects.requireNonNull(firewallPolicyName, "expected parameter 'firewallPolicyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleGroupName = Objects.requireNonNull(ruleGroupName, "expected parameter 'ruleGroupName' to be non-null");
    }

    private GetFirewallPolicyRuleGroupArgs() {
        this.firewallPolicyName = null;
        this.resourceGroupName = null;
        this.ruleGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyRuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String firewallPolicyName;
        private String resourceGroupName;
        private String ruleGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallPolicyRuleGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallPolicyName = defaults.firewallPolicyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleGroupName = defaults.ruleGroupName;
        }

        public Builder setFirewallPolicyName(String firewallPolicyName) {
            this.firewallPolicyName = Objects.requireNonNull(firewallPolicyName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setRuleGroupName(String ruleGroupName) {
            this.ruleGroupName = Objects.requireNonNull(ruleGroupName);
            return this;
        }

        public GetFirewallPolicyRuleGroupArgs build() {
            return new GetFirewallPolicyRuleGroupArgs(firewallPolicyName, resourceGroupName, ruleGroupName);
        }
    }
}
