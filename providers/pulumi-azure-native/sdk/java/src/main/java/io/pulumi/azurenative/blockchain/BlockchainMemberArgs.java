// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain;

import io.pulumi.azurenative.blockchain.enums.BlockchainProtocol;
import io.pulumi.azurenative.blockchain.inputs.BlockchainMemberNodesSkuArgs;
import io.pulumi.azurenative.blockchain.inputs.FirewallRuleArgs;
import io.pulumi.azurenative.blockchain.inputs.SkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BlockchainMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlockchainMemberArgs Empty = new BlockchainMemberArgs();

    /**
     * Blockchain member name.
     * 
     */
    @InputImport(name="blockchainMemberName")
        private final @Nullable Input<String> blockchainMemberName;

    public Input<String> getBlockchainMemberName() {
        return this.blockchainMemberName == null ? Input.empty() : this.blockchainMemberName;
    }

    /**
     * Gets or sets the consortium for the blockchain member.
     * 
     */
    @InputImport(name="consortium")
        private final @Nullable Input<String> consortium;

    public Input<String> getConsortium() {
        return this.consortium == null ? Input.empty() : this.consortium;
    }

    /**
     * Sets the managed consortium management account password.
     * 
     */
    @InputImport(name="consortiumManagementAccountPassword")
        private final @Nullable Input<String> consortiumManagementAccountPassword;

    public Input<String> getConsortiumManagementAccountPassword() {
        return this.consortiumManagementAccountPassword == null ? Input.empty() : this.consortiumManagementAccountPassword;
    }

    /**
     * Gets the display name of the member in the consortium.
     * 
     */
    @InputImport(name="consortiumMemberDisplayName")
        private final @Nullable Input<String> consortiumMemberDisplayName;

    public Input<String> getConsortiumMemberDisplayName() {
        return this.consortiumMemberDisplayName == null ? Input.empty() : this.consortiumMemberDisplayName;
    }

    /**
     * Gets the role of the member in the consortium.
     * 
     */
    @InputImport(name="consortiumRole")
        private final @Nullable Input<String> consortiumRole;

    public Input<String> getConsortiumRole() {
        return this.consortiumRole == null ? Input.empty() : this.consortiumRole;
    }

    /**
     * Gets or sets firewall rules
     * 
     */
    @InputImport(name="firewallRules")
        private final @Nullable Input<List<FirewallRuleArgs>> firewallRules;

    public Input<List<FirewallRuleArgs>> getFirewallRules() {
        return this.firewallRules == null ? Input.empty() : this.firewallRules;
    }

    /**
     * The GEO location of the blockchain service.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Sets the basic auth password of the blockchain member.
     * 
     */
    @InputImport(name="password")
        private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * Gets or sets the blockchain protocol.
     * 
     */
    @InputImport(name="protocol")
        private final @Nullable Input<Either<String,BlockchainProtocol>> protocol;

    public Input<Either<String,BlockchainProtocol>> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
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
     * Gets or sets the blockchain member Sku.
     * 
     */
    @InputImport(name="sku")
        private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Tags of the service which is a list of key value pairs that describes the resource.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Gets or sets the blockchain validator nodes Sku.
     * 
     */
    @InputImport(name="validatorNodesSku")
        private final @Nullable Input<BlockchainMemberNodesSkuArgs> validatorNodesSku;

    public Input<BlockchainMemberNodesSkuArgs> getValidatorNodesSku() {
        return this.validatorNodesSku == null ? Input.empty() : this.validatorNodesSku;
    }

    public BlockchainMemberArgs(
        @Nullable Input<String> blockchainMemberName,
        @Nullable Input<String> consortium,
        @Nullable Input<String> consortiumManagementAccountPassword,
        @Nullable Input<String> consortiumMemberDisplayName,
        @Nullable Input<String> consortiumRole,
        @Nullable Input<List<FirewallRuleArgs>> firewallRules,
        @Nullable Input<String> location,
        @Nullable Input<String> password,
        @Nullable Input<Either<String,BlockchainProtocol>> protocol,
        Input<String> resourceGroupName,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<BlockchainMemberNodesSkuArgs> validatorNodesSku) {
        this.blockchainMemberName = blockchainMemberName;
        this.consortium = consortium;
        this.consortiumManagementAccountPassword = consortiumManagementAccountPassword;
        this.consortiumMemberDisplayName = consortiumMemberDisplayName;
        this.consortiumRole = consortiumRole;
        this.firewallRules = firewallRules;
        this.location = location;
        this.password = password;
        this.protocol = protocol;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.validatorNodesSku = validatorNodesSku;
    }

    private BlockchainMemberArgs() {
        this.blockchainMemberName = Input.empty();
        this.consortium = Input.empty();
        this.consortiumManagementAccountPassword = Input.empty();
        this.consortiumMemberDisplayName = Input.empty();
        this.consortiumRole = Input.empty();
        this.firewallRules = Input.empty();
        this.location = Input.empty();
        this.password = Input.empty();
        this.protocol = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.validatorNodesSku = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlockchainMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> blockchainMemberName;
        private @Nullable Input<String> consortium;
        private @Nullable Input<String> consortiumManagementAccountPassword;
        private @Nullable Input<String> consortiumMemberDisplayName;
        private @Nullable Input<String> consortiumRole;
        private @Nullable Input<List<FirewallRuleArgs>> firewallRules;
        private @Nullable Input<String> location;
        private @Nullable Input<String> password;
        private @Nullable Input<Either<String,BlockchainProtocol>> protocol;
        private Input<String> resourceGroupName;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<BlockchainMemberNodesSkuArgs> validatorNodesSku;

        public Builder() {
    	      // Empty
        }

        public Builder(BlockchainMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockchainMemberName = defaults.blockchainMemberName;
    	      this.consortium = defaults.consortium;
    	      this.consortiumManagementAccountPassword = defaults.consortiumManagementAccountPassword;
    	      this.consortiumMemberDisplayName = defaults.consortiumMemberDisplayName;
    	      this.consortiumRole = defaults.consortiumRole;
    	      this.firewallRules = defaults.firewallRules;
    	      this.location = defaults.location;
    	      this.password = defaults.password;
    	      this.protocol = defaults.protocol;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.validatorNodesSku = defaults.validatorNodesSku;
        }

        public Builder setBlockchainMemberName(@Nullable Input<String> blockchainMemberName) {
            this.blockchainMemberName = blockchainMemberName;
            return this;
        }

        public Builder setBlockchainMemberName(@Nullable String blockchainMemberName) {
            this.blockchainMemberName = Input.ofNullable(blockchainMemberName);
            return this;
        }

        public Builder setConsortium(@Nullable Input<String> consortium) {
            this.consortium = consortium;
            return this;
        }

        public Builder setConsortium(@Nullable String consortium) {
            this.consortium = Input.ofNullable(consortium);
            return this;
        }

        public Builder setConsortiumManagementAccountPassword(@Nullable Input<String> consortiumManagementAccountPassword) {
            this.consortiumManagementAccountPassword = consortiumManagementAccountPassword;
            return this;
        }

        public Builder setConsortiumManagementAccountPassword(@Nullable String consortiumManagementAccountPassword) {
            this.consortiumManagementAccountPassword = Input.ofNullable(consortiumManagementAccountPassword);
            return this;
        }

        public Builder setConsortiumMemberDisplayName(@Nullable Input<String> consortiumMemberDisplayName) {
            this.consortiumMemberDisplayName = consortiumMemberDisplayName;
            return this;
        }

        public Builder setConsortiumMemberDisplayName(@Nullable String consortiumMemberDisplayName) {
            this.consortiumMemberDisplayName = Input.ofNullable(consortiumMemberDisplayName);
            return this;
        }

        public Builder setConsortiumRole(@Nullable Input<String> consortiumRole) {
            this.consortiumRole = consortiumRole;
            return this;
        }

        public Builder setConsortiumRole(@Nullable String consortiumRole) {
            this.consortiumRole = Input.ofNullable(consortiumRole);
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

        public Builder setProtocol(@Nullable Input<Either<String,BlockchainProtocol>> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable Either<String,BlockchainProtocol> protocol) {
            this.protocol = Input.ofNullable(protocol);
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

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setValidatorNodesSku(@Nullable Input<BlockchainMemberNodesSkuArgs> validatorNodesSku) {
            this.validatorNodesSku = validatorNodesSku;
            return this;
        }

        public Builder setValidatorNodesSku(@Nullable BlockchainMemberNodesSkuArgs validatorNodesSku) {
            this.validatorNodesSku = Input.ofNullable(validatorNodesSku);
            return this;
        }
        public BlockchainMemberArgs build() {
            return new BlockchainMemberArgs(blockchainMemberName, consortium, consortiumManagementAccountPassword, consortiumMemberDisplayName, consortiumRole, firewallRules, location, password, protocol, resourceGroupName, sku, tags, validatorNodesSku);
        }
    }
}
