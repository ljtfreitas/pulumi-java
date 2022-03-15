// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListFirewallPolicyIdpsSignaturesFilterValueArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListFirewallPolicyIdpsSignaturesFilterValueArgs Empty = new ListFirewallPolicyIdpsSignaturesFilterValueArgs();

    /**
     * Describes the name of the column which values will be returned
     * 
     */
    @Import(name="filterName")
      private final @Nullable String filterName;

    public Optional<String> getFilterName() {
        return this.filterName == null ? Optional.empty() : Optional.ofNullable(this.filterName);
    }

    /**
     * The name of the Firewall Policy.
     * 
     */
    @Import(name="firewallPolicyName", required=true)
      private final String firewallPolicyName;

    public String getFirewallPolicyName() {
        return this.firewallPolicyName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListFirewallPolicyIdpsSignaturesFilterValueArgs(
        @Nullable String filterName,
        String firewallPolicyName,
        String resourceGroupName) {
        this.filterName = filterName;
        this.firewallPolicyName = Objects.requireNonNull(firewallPolicyName, "expected parameter 'firewallPolicyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListFirewallPolicyIdpsSignaturesFilterValueArgs() {
        this.filterName = null;
        this.firewallPolicyName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListFirewallPolicyIdpsSignaturesFilterValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filterName;
        private String firewallPolicyName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListFirewallPolicyIdpsSignaturesFilterValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterName = defaults.filterName;
    	      this.firewallPolicyName = defaults.firewallPolicyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder filterName(@Nullable String filterName) {
            this.filterName = filterName;
            return this;
        }

        public Builder firewallPolicyName(String firewallPolicyName) {
            this.firewallPolicyName = Objects.requireNonNull(firewallPolicyName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public ListFirewallPolicyIdpsSignaturesFilterValueArgs build() {
            return new ListFirewallPolicyIdpsSignaturesFilterValueArgs(filterName, firewallPolicyName, resourceGroupName);
        }
    }
}
