// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallRuleArgs Empty = new FirewallRuleArgs();

    /**
     * The name of the Data Lake Store account.
     * 
     */
    @InputImport(name="accountName", required=true)
        private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    @InputImport(name="endIpAddress", required=true)
        private final Input<String> endIpAddress;

    public Input<String> getEndIpAddress() {
        return this.endIpAddress;
    }

    /**
     * The name of the firewall rule to create or update.
     * 
     */
    @InputImport(name="firewallRuleName")
        private final @Nullable Input<String> firewallRuleName;

    public Input<String> getFirewallRuleName() {
        return this.firewallRuleName == null ? Input.empty() : this.firewallRuleName;
    }

    /**
     * The name of the Azure resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    @InputImport(name="startIpAddress", required=true)
        private final Input<String> startIpAddress;

    public Input<String> getStartIpAddress() {
        return this.startIpAddress;
    }

    public FirewallRuleArgs(
        Input<String> accountName,
        Input<String> endIpAddress,
        @Nullable Input<String> firewallRuleName,
        Input<String> resourceGroupName,
        Input<String> startIpAddress) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.endIpAddress = Objects.requireNonNull(endIpAddress, "expected parameter 'endIpAddress' to be non-null");
        this.firewallRuleName = firewallRuleName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.startIpAddress = Objects.requireNonNull(startIpAddress, "expected parameter 'startIpAddress' to be non-null");
    }

    private FirewallRuleArgs() {
        this.accountName = Input.empty();
        this.endIpAddress = Input.empty();
        this.firewallRuleName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.startIpAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private Input<String> endIpAddress;
        private @Nullable Input<String> firewallRuleName;
        private Input<String> resourceGroupName;
        private Input<String> startIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.firewallRuleName = defaults.firewallRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.startIpAddress = defaults.startIpAddress;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setEndIpAddress(Input<String> endIpAddress) {
            this.endIpAddress = Objects.requireNonNull(endIpAddress);
            return this;
        }

        public Builder setEndIpAddress(String endIpAddress) {
            this.endIpAddress = Input.of(Objects.requireNonNull(endIpAddress));
            return this;
        }

        public Builder setFirewallRuleName(@Nullable Input<String> firewallRuleName) {
            this.firewallRuleName = firewallRuleName;
            return this;
        }

        public Builder setFirewallRuleName(@Nullable String firewallRuleName) {
            this.firewallRuleName = Input.ofNullable(firewallRuleName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setStartIpAddress(Input<String> startIpAddress) {
            this.startIpAddress = Objects.requireNonNull(startIpAddress);
            return this;
        }

        public Builder setStartIpAddress(String startIpAddress) {
            this.startIpAddress = Input.of(Objects.requireNonNull(startIpAddress));
            return this;
        }
        public FirewallRuleArgs build() {
            return new FirewallRuleArgs(accountName, endIpAddress, firewallRuleName, resourceGroupName, startIpAddress);
        }
    }
}
