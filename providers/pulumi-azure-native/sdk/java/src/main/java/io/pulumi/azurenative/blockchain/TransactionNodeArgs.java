// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain;

import io.pulumi.azurenative.blockchain.inputs.FirewallRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransactionNodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransactionNodeArgs Empty = new TransactionNodeArgs();

    /**
     * Blockchain member name.
     * 
     */
    @InputImport(name="blockchainMemberName", required=true)
        private final Input<String> blockchainMemberName;

    public Input<String> getBlockchainMemberName() {
        return this.blockchainMemberName;
    }

    /**
     * Gets or sets the firewall rules.
     * 
     */
    @InputImport(name="firewallRules")
        private final @Nullable Input<List<FirewallRuleArgs>> firewallRules;

    public Input<List<FirewallRuleArgs>> getFirewallRules() {
        return this.firewallRules == null ? Input.empty() : this.firewallRules;
    }

    /**
     * Gets or sets the transaction node location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Sets the transaction node dns endpoint basic auth password.
     * 
     */
    @InputImport(name="password")
        private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Transaction node name.
     * 
     */
    @InputImport(name="transactionNodeName")
        private final @Nullable Input<String> transactionNodeName;

    public Input<String> getTransactionNodeName() {
        return this.transactionNodeName == null ? Input.empty() : this.transactionNodeName;
    }

    public TransactionNodeArgs(
        Input<String> blockchainMemberName,
        @Nullable Input<List<FirewallRuleArgs>> firewallRules,
        @Nullable Input<String> location,
        @Nullable Input<String> password,
        Input<String> resourceGroupName,
        @Nullable Input<String> transactionNodeName) {
        this.blockchainMemberName = Objects.requireNonNull(blockchainMemberName, "expected parameter 'blockchainMemberName' to be non-null");
        this.firewallRules = firewallRules;
        this.location = location;
        this.password = password;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.transactionNodeName = transactionNodeName;
    }

    private TransactionNodeArgs() {
        this.blockchainMemberName = Input.empty();
        this.firewallRules = Input.empty();
        this.location = Input.empty();
        this.password = Input.empty();
        this.resourceGroupName = Input.empty();
        this.transactionNodeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransactionNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> blockchainMemberName;
        private @Nullable Input<List<FirewallRuleArgs>> firewallRules;
        private @Nullable Input<String> location;
        private @Nullable Input<String> password;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> transactionNodeName;

        public Builder() {
    	      // Empty
        }

        public Builder(TransactionNodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockchainMemberName = defaults.blockchainMemberName;
    	      this.firewallRules = defaults.firewallRules;
    	      this.location = defaults.location;
    	      this.password = defaults.password;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.transactionNodeName = defaults.transactionNodeName;
        }

        public Builder setBlockchainMemberName(Input<String> blockchainMemberName) {
            this.blockchainMemberName = Objects.requireNonNull(blockchainMemberName);
            return this;
        }

        public Builder setBlockchainMemberName(String blockchainMemberName) {
            this.blockchainMemberName = Input.of(Objects.requireNonNull(blockchainMemberName));
            return this;
        }

        public Builder setFirewallRules(@Nullable Input<List<FirewallRuleArgs>> firewallRules) {
            this.firewallRules = firewallRules;
            return this;
        }

        public Builder setFirewallRules(@Nullable List<FirewallRuleArgs> firewallRules) {
            this.firewallRules = Input.ofNullable(firewallRules);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
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

        public Builder setTransactionNodeName(@Nullable Input<String> transactionNodeName) {
            this.transactionNodeName = transactionNodeName;
            return this;
        }

        public Builder setTransactionNodeName(@Nullable String transactionNodeName) {
            this.transactionNodeName = Input.ofNullable(transactionNodeName);
            return this;
        }
        public TransactionNodeArgs build() {
            return new TransactionNodeArgs(blockchainMemberName, firewallRules, location, password, resourceGroupName, transactionNodeName);
        }
    }
}
