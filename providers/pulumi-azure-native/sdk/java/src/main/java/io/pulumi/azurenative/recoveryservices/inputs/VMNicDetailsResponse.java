// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.IPConfigResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Hyper V VM network details.
 * 
 */
public final class VMNicDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VMNicDetailsResponse Empty = new VMNicDetailsResponse();

    /**
     * A value indicating whether the NIC has accelerated networking enabled.
     * 
     */
    @Import(name="enableAcceleratedNetworkingOnRecovery")
      private final @Nullable Boolean enableAcceleratedNetworkingOnRecovery;

    public Optional<Boolean> getEnableAcceleratedNetworkingOnRecovery() {
        return this.enableAcceleratedNetworkingOnRecovery == null ? Optional.empty() : Optional.ofNullable(this.enableAcceleratedNetworkingOnRecovery);
    }

    /**
     * Whether the test failover NIC has accelerated networking enabled.
     * 
     */
    @Import(name="enableAcceleratedNetworkingOnTfo")
      private final @Nullable Boolean enableAcceleratedNetworkingOnTfo;

    public Optional<Boolean> getEnableAcceleratedNetworkingOnTfo() {
        return this.enableAcceleratedNetworkingOnTfo == null ? Optional.empty() : Optional.ofNullable(this.enableAcceleratedNetworkingOnTfo);
    }

    /**
     * Ip address type.
     * 
     */
    @Import(name="ipAddressType")
      private final @Nullable String ipAddressType;

    public Optional<String> getIpAddressType() {
        return this.ipAddressType == null ? Optional.empty() : Optional.ofNullable(this.ipAddressType);
    }

    /**
     * The nic Id.
     * 
     */
    @Import(name="nicId")
      private final @Nullable String nicId;

    public Optional<String> getNicId() {
        return this.nicId == null ? Optional.empty() : Optional.ofNullable(this.nicId);
    }

    /**
     * Primary nic static IP address.
     * 
     */
    @Import(name="primaryNicStaticIPAddress")
      private final @Nullable String primaryNicStaticIPAddress;

    public Optional<String> getPrimaryNicStaticIPAddress() {
        return this.primaryNicStaticIPAddress == null ? Optional.empty() : Optional.ofNullable(this.primaryNicStaticIPAddress);
    }

    /**
     * The target backend address pools for the NIC.
     * 
     */
    @Import(name="recoveryLBBackendAddressPoolIds")
      private final @Nullable List<String> recoveryLBBackendAddressPoolIds;

    public List<String> getRecoveryLBBackendAddressPoolIds() {
        return this.recoveryLBBackendAddressPoolIds == null ? List.of() : this.recoveryLBBackendAddressPoolIds;
    }

    /**
     * The id of the NSG associated with the NIC.
     * 
     */
    @Import(name="recoveryNetworkSecurityGroupId")
      private final @Nullable String recoveryNetworkSecurityGroupId;

    public Optional<String> getRecoveryNetworkSecurityGroupId() {
        return this.recoveryNetworkSecurityGroupId == null ? Optional.empty() : Optional.ofNullable(this.recoveryNetworkSecurityGroupId);
    }

    /**
     * IP allocation type for recovery VM.
     * 
     */
    @Import(name="recoveryNicIpAddressType")
      private final @Nullable String recoveryNicIpAddressType;

    public Optional<String> getRecoveryNicIpAddressType() {
        return this.recoveryNicIpAddressType == null ? Optional.empty() : Optional.ofNullable(this.recoveryNicIpAddressType);
    }

    /**
     * The name of the NIC to be used when creating target NICs.
     * 
     */
    @Import(name="recoveryNicName")
      private final @Nullable String recoveryNicName;

    public Optional<String> getRecoveryNicName() {
        return this.recoveryNicName == null ? Optional.empty() : Optional.ofNullable(this.recoveryNicName);
    }

    /**
     * The resource group of the NIC to be used when creating target NICs.
     * 
     */
    @Import(name="recoveryNicResourceGroupName")
      private final @Nullable String recoveryNicResourceGroupName;

    public Optional<String> getRecoveryNicResourceGroupName() {
        return this.recoveryNicResourceGroupName == null ? Optional.empty() : Optional.ofNullable(this.recoveryNicResourceGroupName);
    }

    /**
     * The id of the public IP address resource associated with the NIC.
     * 
     */
    @Import(name="recoveryPublicIpAddressId")
      private final @Nullable String recoveryPublicIpAddressId;

    public Optional<String> getRecoveryPublicIpAddressId() {
        return this.recoveryPublicIpAddressId == null ? Optional.empty() : Optional.ofNullable(this.recoveryPublicIpAddressId);
    }

    /**
     * Recovery VM network Id.
     * 
     */
    @Import(name="recoveryVMNetworkId")
      private final @Nullable String recoveryVMNetworkId;

    public Optional<String> getRecoveryVMNetworkId() {
        return this.recoveryVMNetworkId == null ? Optional.empty() : Optional.ofNullable(this.recoveryVMNetworkId);
    }

    /**
     * Recovery VM subnet name.
     * 
     */
    @Import(name="recoveryVMSubnetName")
      private final @Nullable String recoveryVMSubnetName;

    public Optional<String> getRecoveryVMSubnetName() {
        return this.recoveryVMSubnetName == null ? Optional.empty() : Optional.ofNullable(this.recoveryVMSubnetName);
    }

    /**
     * The replica nic Id.
     * 
     */
    @Import(name="replicaNicId")
      private final @Nullable String replicaNicId;

    public Optional<String> getReplicaNicId() {
        return this.replicaNicId == null ? Optional.empty() : Optional.ofNullable(this.replicaNicId);
    }

    /**
     * Replica nic static IP address.
     * 
     */
    @Import(name="replicaNicStaticIPAddress")
      private final @Nullable String replicaNicStaticIPAddress;

    public Optional<String> getReplicaNicStaticIPAddress() {
        return this.replicaNicStaticIPAddress == null ? Optional.empty() : Optional.ofNullable(this.replicaNicStaticIPAddress);
    }

    /**
     * A value indicating whether an existing NIC is allowed to be reused during failover subject to availability.
     * 
     */
    @Import(name="reuseExistingNic")
      private final @Nullable Boolean reuseExistingNic;

    public Optional<Boolean> getReuseExistingNic() {
        return this.reuseExistingNic == null ? Optional.empty() : Optional.ofNullable(this.reuseExistingNic);
    }

    /**
     * Selection type for failover.
     * 
     */
    @Import(name="selectionType")
      private final @Nullable String selectionType;

    public Optional<String> getSelectionType() {
        return this.selectionType == null ? Optional.empty() : Optional.ofNullable(this.selectionType);
    }

    /**
     * The source nic ARM Id.
     * 
     */
    @Import(name="sourceNicArmId")
      private final @Nullable String sourceNicArmId;

    public Optional<String> getSourceNicArmId() {
        return this.sourceNicArmId == null ? Optional.empty() : Optional.ofNullable(this.sourceNicArmId);
    }

    /**
     * The IP configurations to be used by NIC during test failover.
     * 
     */
    @Import(name="tfoIPConfigs")
      private final @Nullable List<IPConfigResponse> tfoIPConfigs;

    public List<IPConfigResponse> getTfoIPConfigs() {
        return this.tfoIPConfigs == null ? List.of() : this.tfoIPConfigs;
    }

    /**
     * The NSG to be used by NIC during test failover.
     * 
     */
    @Import(name="tfoNetworkSecurityGroupId")
      private final @Nullable String tfoNetworkSecurityGroupId;

    public Optional<String> getTfoNetworkSecurityGroupId() {
        return this.tfoNetworkSecurityGroupId == null ? Optional.empty() : Optional.ofNullable(this.tfoNetworkSecurityGroupId);
    }

    /**
     * The name of the NIC to be used when creating target NICs in TFO.
     * 
     */
    @Import(name="tfoRecoveryNicName")
      private final @Nullable String tfoRecoveryNicName;

    public Optional<String> getTfoRecoveryNicName() {
        return this.tfoRecoveryNicName == null ? Optional.empty() : Optional.ofNullable(this.tfoRecoveryNicName);
    }

    /**
     * The resource group of the NIC to be used when creating target NICs in TFO.
     * 
     */
    @Import(name="tfoRecoveryNicResourceGroupName")
      private final @Nullable String tfoRecoveryNicResourceGroupName;

    public Optional<String> getTfoRecoveryNicResourceGroupName() {
        return this.tfoRecoveryNicResourceGroupName == null ? Optional.empty() : Optional.ofNullable(this.tfoRecoveryNicResourceGroupName);
    }

    /**
     * A value indicating whether an existing NIC is allowed to be reused during test failover subject to availability.
     * 
     */
    @Import(name="tfoReuseExistingNic")
      private final @Nullable Boolean tfoReuseExistingNic;

    public Optional<Boolean> getTfoReuseExistingNic() {
        return this.tfoReuseExistingNic == null ? Optional.empty() : Optional.ofNullable(this.tfoReuseExistingNic);
    }

    /**
     * The network to be used by NIC during test failover.
     * 
     */
    @Import(name="tfoVMNetworkId")
      private final @Nullable String tfoVMNetworkId;

    public Optional<String> getTfoVMNetworkId() {
        return this.tfoVMNetworkId == null ? Optional.empty() : Optional.ofNullable(this.tfoVMNetworkId);
    }

    /**
     * The subnet to be used by NIC during test failover.
     * 
     */
    @Import(name="tfoVMSubnetName")
      private final @Nullable String tfoVMSubnetName;

    public Optional<String> getTfoVMSubnetName() {
        return this.tfoVMSubnetName == null ? Optional.empty() : Optional.ofNullable(this.tfoVMSubnetName);
    }

    /**
     * VM network name.
     * 
     */
    @Import(name="vMNetworkName")
      private final @Nullable String vMNetworkName;

    public Optional<String> getVMNetworkName() {
        return this.vMNetworkName == null ? Optional.empty() : Optional.ofNullable(this.vMNetworkName);
    }

    /**
     * VM subnet name.
     * 
     */
    @Import(name="vMSubnetName")
      private final @Nullable String vMSubnetName;

    public Optional<String> getVMSubnetName() {
        return this.vMSubnetName == null ? Optional.empty() : Optional.ofNullable(this.vMSubnetName);
    }

    public VMNicDetailsResponse(
        @Nullable Boolean enableAcceleratedNetworkingOnRecovery,
        @Nullable Boolean enableAcceleratedNetworkingOnTfo,
        @Nullable String ipAddressType,
        @Nullable String nicId,
        @Nullable String primaryNicStaticIPAddress,
        @Nullable List<String> recoveryLBBackendAddressPoolIds,
        @Nullable String recoveryNetworkSecurityGroupId,
        @Nullable String recoveryNicIpAddressType,
        @Nullable String recoveryNicName,
        @Nullable String recoveryNicResourceGroupName,
        @Nullable String recoveryPublicIpAddressId,
        @Nullable String recoveryVMNetworkId,
        @Nullable String recoveryVMSubnetName,
        @Nullable String replicaNicId,
        @Nullable String replicaNicStaticIPAddress,
        @Nullable Boolean reuseExistingNic,
        @Nullable String selectionType,
        @Nullable String sourceNicArmId,
        @Nullable List<IPConfigResponse> tfoIPConfigs,
        @Nullable String tfoNetworkSecurityGroupId,
        @Nullable String tfoRecoveryNicName,
        @Nullable String tfoRecoveryNicResourceGroupName,
        @Nullable Boolean tfoReuseExistingNic,
        @Nullable String tfoVMNetworkId,
        @Nullable String tfoVMSubnetName,
        @Nullable String vMNetworkName,
        @Nullable String vMSubnetName) {
        this.enableAcceleratedNetworkingOnRecovery = enableAcceleratedNetworkingOnRecovery;
        this.enableAcceleratedNetworkingOnTfo = enableAcceleratedNetworkingOnTfo;
        this.ipAddressType = ipAddressType;
        this.nicId = nicId;
        this.primaryNicStaticIPAddress = primaryNicStaticIPAddress;
        this.recoveryLBBackendAddressPoolIds = recoveryLBBackendAddressPoolIds;
        this.recoveryNetworkSecurityGroupId = recoveryNetworkSecurityGroupId;
        this.recoveryNicIpAddressType = recoveryNicIpAddressType;
        this.recoveryNicName = recoveryNicName;
        this.recoveryNicResourceGroupName = recoveryNicResourceGroupName;
        this.recoveryPublicIpAddressId = recoveryPublicIpAddressId;
        this.recoveryVMNetworkId = recoveryVMNetworkId;
        this.recoveryVMSubnetName = recoveryVMSubnetName;
        this.replicaNicId = replicaNicId;
        this.replicaNicStaticIPAddress = replicaNicStaticIPAddress;
        this.reuseExistingNic = reuseExistingNic == null ? false : reuseExistingNic;
        this.selectionType = selectionType;
        this.sourceNicArmId = sourceNicArmId;
        this.tfoIPConfigs = tfoIPConfigs;
        this.tfoNetworkSecurityGroupId = tfoNetworkSecurityGroupId;
        this.tfoRecoveryNicName = tfoRecoveryNicName;
        this.tfoRecoveryNicResourceGroupName = tfoRecoveryNicResourceGroupName;
        this.tfoReuseExistingNic = tfoReuseExistingNic == null ? false : tfoReuseExistingNic;
        this.tfoVMNetworkId = tfoVMNetworkId;
        this.tfoVMSubnetName = tfoVMSubnetName;
        this.vMNetworkName = vMNetworkName;
        this.vMSubnetName = vMSubnetName;
    }

    private VMNicDetailsResponse() {
        this.enableAcceleratedNetworkingOnRecovery = null;
        this.enableAcceleratedNetworkingOnTfo = null;
        this.ipAddressType = null;
        this.nicId = null;
        this.primaryNicStaticIPAddress = null;
        this.recoveryLBBackendAddressPoolIds = List.of();
        this.recoveryNetworkSecurityGroupId = null;
        this.recoveryNicIpAddressType = null;
        this.recoveryNicName = null;
        this.recoveryNicResourceGroupName = null;
        this.recoveryPublicIpAddressId = null;
        this.recoveryVMNetworkId = null;
        this.recoveryVMSubnetName = null;
        this.replicaNicId = null;
        this.replicaNicStaticIPAddress = null;
        this.reuseExistingNic = null;
        this.selectionType = null;
        this.sourceNicArmId = null;
        this.tfoIPConfigs = List.of();
        this.tfoNetworkSecurityGroupId = null;
        this.tfoRecoveryNicName = null;
        this.tfoRecoveryNicResourceGroupName = null;
        this.tfoReuseExistingNic = null;
        this.tfoVMNetworkId = null;
        this.tfoVMSubnetName = null;
        this.vMNetworkName = null;
        this.vMSubnetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMNicDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableAcceleratedNetworkingOnRecovery;
        private @Nullable Boolean enableAcceleratedNetworkingOnTfo;
        private @Nullable String ipAddressType;
        private @Nullable String nicId;
        private @Nullable String primaryNicStaticIPAddress;
        private @Nullable List<String> recoveryLBBackendAddressPoolIds;
        private @Nullable String recoveryNetworkSecurityGroupId;
        private @Nullable String recoveryNicIpAddressType;
        private @Nullable String recoveryNicName;
        private @Nullable String recoveryNicResourceGroupName;
        private @Nullable String recoveryPublicIpAddressId;
        private @Nullable String recoveryVMNetworkId;
        private @Nullable String recoveryVMSubnetName;
        private @Nullable String replicaNicId;
        private @Nullable String replicaNicStaticIPAddress;
        private @Nullable Boolean reuseExistingNic;
        private @Nullable String selectionType;
        private @Nullable String sourceNicArmId;
        private @Nullable List<IPConfigResponse> tfoIPConfigs;
        private @Nullable String tfoNetworkSecurityGroupId;
        private @Nullable String tfoRecoveryNicName;
        private @Nullable String tfoRecoveryNicResourceGroupName;
        private @Nullable Boolean tfoReuseExistingNic;
        private @Nullable String tfoVMNetworkId;
        private @Nullable String tfoVMSubnetName;
        private @Nullable String vMNetworkName;
        private @Nullable String vMSubnetName;

        public Builder() {
    	      // Empty
        }

        public Builder(VMNicDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableAcceleratedNetworkingOnRecovery = defaults.enableAcceleratedNetworkingOnRecovery;
    	      this.enableAcceleratedNetworkingOnTfo = defaults.enableAcceleratedNetworkingOnTfo;
    	      this.ipAddressType = defaults.ipAddressType;
    	      this.nicId = defaults.nicId;
    	      this.primaryNicStaticIPAddress = defaults.primaryNicStaticIPAddress;
    	      this.recoveryLBBackendAddressPoolIds = defaults.recoveryLBBackendAddressPoolIds;
    	      this.recoveryNetworkSecurityGroupId = defaults.recoveryNetworkSecurityGroupId;
    	      this.recoveryNicIpAddressType = defaults.recoveryNicIpAddressType;
    	      this.recoveryNicName = defaults.recoveryNicName;
    	      this.recoveryNicResourceGroupName = defaults.recoveryNicResourceGroupName;
    	      this.recoveryPublicIpAddressId = defaults.recoveryPublicIpAddressId;
    	      this.recoveryVMNetworkId = defaults.recoveryVMNetworkId;
    	      this.recoveryVMSubnetName = defaults.recoveryVMSubnetName;
    	      this.replicaNicId = defaults.replicaNicId;
    	      this.replicaNicStaticIPAddress = defaults.replicaNicStaticIPAddress;
    	      this.reuseExistingNic = defaults.reuseExistingNic;
    	      this.selectionType = defaults.selectionType;
    	      this.sourceNicArmId = defaults.sourceNicArmId;
    	      this.tfoIPConfigs = defaults.tfoIPConfigs;
    	      this.tfoNetworkSecurityGroupId = defaults.tfoNetworkSecurityGroupId;
    	      this.tfoRecoveryNicName = defaults.tfoRecoveryNicName;
    	      this.tfoRecoveryNicResourceGroupName = defaults.tfoRecoveryNicResourceGroupName;
    	      this.tfoReuseExistingNic = defaults.tfoReuseExistingNic;
    	      this.tfoVMNetworkId = defaults.tfoVMNetworkId;
    	      this.tfoVMSubnetName = defaults.tfoVMSubnetName;
    	      this.vMNetworkName = defaults.vMNetworkName;
    	      this.vMSubnetName = defaults.vMSubnetName;
        }

        public Builder enableAcceleratedNetworkingOnRecovery(@Nullable Boolean enableAcceleratedNetworkingOnRecovery) {
            this.enableAcceleratedNetworkingOnRecovery = enableAcceleratedNetworkingOnRecovery;
            return this;
        }

        public Builder enableAcceleratedNetworkingOnTfo(@Nullable Boolean enableAcceleratedNetworkingOnTfo) {
            this.enableAcceleratedNetworkingOnTfo = enableAcceleratedNetworkingOnTfo;
            return this;
        }

        public Builder ipAddressType(@Nullable String ipAddressType) {
            this.ipAddressType = ipAddressType;
            return this;
        }

        public Builder nicId(@Nullable String nicId) {
            this.nicId = nicId;
            return this;
        }

        public Builder primaryNicStaticIPAddress(@Nullable String primaryNicStaticIPAddress) {
            this.primaryNicStaticIPAddress = primaryNicStaticIPAddress;
            return this;
        }

        public Builder recoveryLBBackendAddressPoolIds(@Nullable List<String> recoveryLBBackendAddressPoolIds) {
            this.recoveryLBBackendAddressPoolIds = recoveryLBBackendAddressPoolIds;
            return this;
        }

        public Builder recoveryNetworkSecurityGroupId(@Nullable String recoveryNetworkSecurityGroupId) {
            this.recoveryNetworkSecurityGroupId = recoveryNetworkSecurityGroupId;
            return this;
        }

        public Builder recoveryNicIpAddressType(@Nullable String recoveryNicIpAddressType) {
            this.recoveryNicIpAddressType = recoveryNicIpAddressType;
            return this;
        }

        public Builder recoveryNicName(@Nullable String recoveryNicName) {
            this.recoveryNicName = recoveryNicName;
            return this;
        }

        public Builder recoveryNicResourceGroupName(@Nullable String recoveryNicResourceGroupName) {
            this.recoveryNicResourceGroupName = recoveryNicResourceGroupName;
            return this;
        }

        public Builder recoveryPublicIpAddressId(@Nullable String recoveryPublicIpAddressId) {
            this.recoveryPublicIpAddressId = recoveryPublicIpAddressId;
            return this;
        }

        public Builder recoveryVMNetworkId(@Nullable String recoveryVMNetworkId) {
            this.recoveryVMNetworkId = recoveryVMNetworkId;
            return this;
        }

        public Builder recoveryVMSubnetName(@Nullable String recoveryVMSubnetName) {
            this.recoveryVMSubnetName = recoveryVMSubnetName;
            return this;
        }

        public Builder replicaNicId(@Nullable String replicaNicId) {
            this.replicaNicId = replicaNicId;
            return this;
        }

        public Builder replicaNicStaticIPAddress(@Nullable String replicaNicStaticIPAddress) {
            this.replicaNicStaticIPAddress = replicaNicStaticIPAddress;
            return this;
        }

        public Builder reuseExistingNic(@Nullable Boolean reuseExistingNic) {
            this.reuseExistingNic = reuseExistingNic;
            return this;
        }

        public Builder selectionType(@Nullable String selectionType) {
            this.selectionType = selectionType;
            return this;
        }

        public Builder sourceNicArmId(@Nullable String sourceNicArmId) {
            this.sourceNicArmId = sourceNicArmId;
            return this;
        }

        public Builder tfoIPConfigs(@Nullable List<IPConfigResponse> tfoIPConfigs) {
            this.tfoIPConfigs = tfoIPConfigs;
            return this;
        }

        public Builder tfoNetworkSecurityGroupId(@Nullable String tfoNetworkSecurityGroupId) {
            this.tfoNetworkSecurityGroupId = tfoNetworkSecurityGroupId;
            return this;
        }

        public Builder tfoRecoveryNicName(@Nullable String tfoRecoveryNicName) {
            this.tfoRecoveryNicName = tfoRecoveryNicName;
            return this;
        }

        public Builder tfoRecoveryNicResourceGroupName(@Nullable String tfoRecoveryNicResourceGroupName) {
            this.tfoRecoveryNicResourceGroupName = tfoRecoveryNicResourceGroupName;
            return this;
        }

        public Builder tfoReuseExistingNic(@Nullable Boolean tfoReuseExistingNic) {
            this.tfoReuseExistingNic = tfoReuseExistingNic;
            return this;
        }

        public Builder tfoVMNetworkId(@Nullable String tfoVMNetworkId) {
            this.tfoVMNetworkId = tfoVMNetworkId;
            return this;
        }

        public Builder tfoVMSubnetName(@Nullable String tfoVMSubnetName) {
            this.tfoVMSubnetName = tfoVMSubnetName;
            return this;
        }

        public Builder vMNetworkName(@Nullable String vMNetworkName) {
            this.vMNetworkName = vMNetworkName;
            return this;
        }

        public Builder vMSubnetName(@Nullable String vMSubnetName) {
            this.vMSubnetName = vMSubnetName;
            return this;
        }
        public VMNicDetailsResponse build() {
            return new VMNicDetailsResponse(enableAcceleratedNetworkingOnRecovery, enableAcceleratedNetworkingOnTfo, ipAddressType, nicId, primaryNicStaticIPAddress, recoveryLBBackendAddressPoolIds, recoveryNetworkSecurityGroupId, recoveryNicIpAddressType, recoveryNicName, recoveryNicResourceGroupName, recoveryPublicIpAddressId, recoveryVMNetworkId, recoveryVMSubnetName, replicaNicId, replicaNicStaticIPAddress, reuseExistingNic, selectionType, sourceNicArmId, tfoIPConfigs, tfoNetworkSecurityGroupId, tfoRecoveryNicName, tfoRecoveryNicResourceGroupName, tfoReuseExistingNic, tfoVMNetworkId, tfoVMSubnetName, vMNetworkName, vMSubnetName);
        }
    }
}
