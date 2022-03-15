// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallRuleArgs Empty = new FirewallRuleArgs();

    /**
     * The end IP address of the server firewall rule. Must be IPv4 format.
     * 
     */
    @Import(name="endIpAddress", required=true)
      private final Output<String> endIpAddress;

    public Output<String> getEndIpAddress() {
        return this.endIpAddress;
    }

    /**
     * The name of the server firewall rule.
     * 
     */
    @Import(name="firewallRuleName")
      private final @Nullable Output<String> firewallRuleName;

    public Output<String> getFirewallRuleName() {
        return this.firewallRuleName == null ? Output.empty() : this.firewallRuleName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName;
    }

    /**
     * The start IP address of the server firewall rule. Must be IPv4 format.
     * 
     */
    @Import(name="startIpAddress", required=true)
      private final Output<String> startIpAddress;

    public Output<String> getStartIpAddress() {
        return this.startIpAddress;
    }

    public FirewallRuleArgs(
        Output<String> endIpAddress,
        @Nullable Output<String> firewallRuleName,
        Output<String> resourceGroupName,
        Output<String> serverName,
        Output<String> startIpAddress) {
        this.endIpAddress = Objects.requireNonNull(endIpAddress, "expected parameter 'endIpAddress' to be non-null");
        this.firewallRuleName = firewallRuleName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.startIpAddress = Objects.requireNonNull(startIpAddress, "expected parameter 'startIpAddress' to be non-null");
    }

    private FirewallRuleArgs() {
        this.endIpAddress = Output.empty();
        this.firewallRuleName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.serverName = Output.empty();
        this.startIpAddress = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> endIpAddress;
        private @Nullable Output<String> firewallRuleName;
        private Output<String> resourceGroupName;
        private Output<String> serverName;
        private Output<String> startIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.firewallRuleName = defaults.firewallRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.startIpAddress = defaults.startIpAddress;
        }

        public Builder endIpAddress(Output<String> endIpAddress) {
            this.endIpAddress = Objects.requireNonNull(endIpAddress);
            return this;
        }

        public Builder endIpAddress(String endIpAddress) {
            this.endIpAddress = Output.of(Objects.requireNonNull(endIpAddress));
            return this;
        }

        public Builder firewallRuleName(@Nullable Output<String> firewallRuleName) {
            this.firewallRuleName = firewallRuleName;
            return this;
        }

        public Builder firewallRuleName(@Nullable String firewallRuleName) {
            this.firewallRuleName = Output.ofNullable(firewallRuleName);
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

        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder startIpAddress(Output<String> startIpAddress) {
            this.startIpAddress = Objects.requireNonNull(startIpAddress);
            return this;
        }

        public Builder startIpAddress(String startIpAddress) {
            this.startIpAddress = Output.of(Objects.requireNonNull(startIpAddress));
            return this;
        }
        public FirewallRuleArgs build() {
            return new FirewallRuleArgs(endIpAddress, firewallRuleName, resourceGroupName, serverName, startIpAddress);
        }
    }
}
