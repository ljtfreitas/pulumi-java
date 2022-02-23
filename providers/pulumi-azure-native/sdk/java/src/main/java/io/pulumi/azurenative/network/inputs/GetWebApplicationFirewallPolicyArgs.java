// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWebApplicationFirewallPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebApplicationFirewallPolicyArgs Empty = new GetWebApplicationFirewallPolicyArgs();

    /**
     * The name of the policy.
     * 
     */
    @InputImport(name="policyName", required=true)
        private final String policyName;

    public String getPolicyName() {
        return this.policyName;
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

    public GetWebApplicationFirewallPolicyArgs(
        String policyName,
        String resourceGroupName) {
        this.policyName = Objects.requireNonNull(policyName, "expected parameter 'policyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetWebApplicationFirewallPolicyArgs() {
        this.policyName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebApplicationFirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String policyName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebApplicationFirewallPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyName = defaults.policyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setPolicyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetWebApplicationFirewallPolicyArgs build() {
            return new GetWebApplicationFirewallPolicyArgs(policyName, resourceGroupName);
        }
    }
}
