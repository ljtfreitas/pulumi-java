// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.AzureVmDiskDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.InitialReplicationDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.OSDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VMNicDetailsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HyperVReplicaAzureReplicationDetailsResponse {
    /**
     * Azure VM Disk details.
     * 
     */
    private final @Nullable List<AzureVmDiskDetailsResponse> azureVmDiskDetails;
    /**
     * The selected option to enable RDP\SSH on target vm after failover. String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     * 
     */
    private final @Nullable String enableRdpOnTargetOption;
    /**
     * The encryption info.
     * 
     */
    private final @Nullable String encryption;
    /**
     * Initial replication details.
     * 
     */
    private final @Nullable InitialReplicationDetailsResponse initialReplicationDetails;
    /**
     * Gets the Instance type.
     * Expected value is 'HyperVReplicaAzure'.
     * 
     */
    private final String instanceType;
    /**
     * The Last replication time.
     * 
     */
    private final @Nullable String lastReplicatedTime;
    /**
     * The last RPO calculated time.
     * 
     */
    private final @Nullable String lastRpoCalculatedTime;
    /**
     * License Type of the VM to be used.
     * 
     */
    private final @Nullable String licenseType;
    /**
     * The operating system info.
     * 
     */
    private final @Nullable OSDetailsResponse oSDetails;
    /**
     * The recovery availability set Id.
     * 
     */
    private final @Nullable String recoveryAvailabilitySetId;
    /**
     * The ARM id of the log storage account used for replication. This will be set to null if no log storage account was provided during enable protection.
     * 
     */
    private final @Nullable String recoveryAzureLogStorageAccountId;
    /**
     * The target resource group Id.
     * 
     */
    private final @Nullable String recoveryAzureResourceGroupId;
    /**
     * The recovery Azure storage account.
     * 
     */
    private final @Nullable String recoveryAzureStorageAccount;
    /**
     * The Recovery Azure VM size.
     * 
     */
    private final @Nullable String recoveryAzureVMSize;
    /**
     * Recovery Azure given name.
     * 
     */
    private final @Nullable String recoveryAzureVmName;
    /**
     * Last RPO value.
     * 
     */
    private final @Nullable Double rpoInSeconds;
    /**
     * The selected recovery azure network Id.
     * 
     */
    private final @Nullable String selectedRecoveryAzureNetworkId;
    /**
     * The selected source nic Id which will be used as the primary nic during failover.
     * 
     */
    private final @Nullable String selectedSourceNicId;
    /**
     * The CPU count of the VM on the primary side.
     * 
     */
    private final @Nullable Integer sourceVmCpuCount;
    /**
     * The RAM size of the VM on the primary side.
     * 
     */
    private final @Nullable Integer sourceVmRamSizeInMB;
    /**
     * The target availability zone.
     * 
     */
    private final @Nullable String targetAvailabilityZone;
    /**
     * The target proximity placement group Id.
     * 
     */
    private final @Nullable String targetProximityPlacementGroupId;
    /**
     * A value indicating whether managed disks should be used during failover.
     * 
     */
    private final @Nullable String useManagedDisks;
    /**
     * The virtual machine Id.
     * 
     */
    private final @Nullable String vmId;
    /**
     * The PE Network details.
     * 
     */
    private final @Nullable List<VMNicDetailsResponse> vmNics;
    /**
     * The protection state for the vm.
     * 
     */
    private final @Nullable String vmProtectionState;
    /**
     * The protection state description for the vm.
     * 
     */
    private final @Nullable String vmProtectionStateDescription;

    @CustomType.Constructor
    private HyperVReplicaAzureReplicationDetailsResponse(
        @CustomType.Parameter("azureVmDiskDetails") @Nullable List<AzureVmDiskDetailsResponse> azureVmDiskDetails,
        @CustomType.Parameter("enableRdpOnTargetOption") @Nullable String enableRdpOnTargetOption,
        @CustomType.Parameter("encryption") @Nullable String encryption,
        @CustomType.Parameter("initialReplicationDetails") @Nullable InitialReplicationDetailsResponse initialReplicationDetails,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("lastReplicatedTime") @Nullable String lastReplicatedTime,
        @CustomType.Parameter("lastRpoCalculatedTime") @Nullable String lastRpoCalculatedTime,
        @CustomType.Parameter("licenseType") @Nullable String licenseType,
        @CustomType.Parameter("oSDetails") @Nullable OSDetailsResponse oSDetails,
        @CustomType.Parameter("recoveryAvailabilitySetId") @Nullable String recoveryAvailabilitySetId,
        @CustomType.Parameter("recoveryAzureLogStorageAccountId") @Nullable String recoveryAzureLogStorageAccountId,
        @CustomType.Parameter("recoveryAzureResourceGroupId") @Nullable String recoveryAzureResourceGroupId,
        @CustomType.Parameter("recoveryAzureStorageAccount") @Nullable String recoveryAzureStorageAccount,
        @CustomType.Parameter("recoveryAzureVMSize") @Nullable String recoveryAzureVMSize,
        @CustomType.Parameter("recoveryAzureVmName") @Nullable String recoveryAzureVmName,
        @CustomType.Parameter("rpoInSeconds") @Nullable Double rpoInSeconds,
        @CustomType.Parameter("selectedRecoveryAzureNetworkId") @Nullable String selectedRecoveryAzureNetworkId,
        @CustomType.Parameter("selectedSourceNicId") @Nullable String selectedSourceNicId,
        @CustomType.Parameter("sourceVmCpuCount") @Nullable Integer sourceVmCpuCount,
        @CustomType.Parameter("sourceVmRamSizeInMB") @Nullable Integer sourceVmRamSizeInMB,
        @CustomType.Parameter("targetAvailabilityZone") @Nullable String targetAvailabilityZone,
        @CustomType.Parameter("targetProximityPlacementGroupId") @Nullable String targetProximityPlacementGroupId,
        @CustomType.Parameter("useManagedDisks") @Nullable String useManagedDisks,
        @CustomType.Parameter("vmId") @Nullable String vmId,
        @CustomType.Parameter("vmNics") @Nullable List<VMNicDetailsResponse> vmNics,
        @CustomType.Parameter("vmProtectionState") @Nullable String vmProtectionState,
        @CustomType.Parameter("vmProtectionStateDescription") @Nullable String vmProtectionStateDescription) {
        this.azureVmDiskDetails = azureVmDiskDetails;
        this.enableRdpOnTargetOption = enableRdpOnTargetOption;
        this.encryption = encryption;
        this.initialReplicationDetails = initialReplicationDetails;
        this.instanceType = instanceType;
        this.lastReplicatedTime = lastReplicatedTime;
        this.lastRpoCalculatedTime = lastRpoCalculatedTime;
        this.licenseType = licenseType;
        this.oSDetails = oSDetails;
        this.recoveryAvailabilitySetId = recoveryAvailabilitySetId;
        this.recoveryAzureLogStorageAccountId = recoveryAzureLogStorageAccountId;
        this.recoveryAzureResourceGroupId = recoveryAzureResourceGroupId;
        this.recoveryAzureStorageAccount = recoveryAzureStorageAccount;
        this.recoveryAzureVMSize = recoveryAzureVMSize;
        this.recoveryAzureVmName = recoveryAzureVmName;
        this.rpoInSeconds = rpoInSeconds;
        this.selectedRecoveryAzureNetworkId = selectedRecoveryAzureNetworkId;
        this.selectedSourceNicId = selectedSourceNicId;
        this.sourceVmCpuCount = sourceVmCpuCount;
        this.sourceVmRamSizeInMB = sourceVmRamSizeInMB;
        this.targetAvailabilityZone = targetAvailabilityZone;
        this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
        this.useManagedDisks = useManagedDisks;
        this.vmId = vmId;
        this.vmNics = vmNics;
        this.vmProtectionState = vmProtectionState;
        this.vmProtectionStateDescription = vmProtectionStateDescription;
    }

    /**
     * Azure VM Disk details.
     * 
    */
    public List<AzureVmDiskDetailsResponse> getAzureVmDiskDetails() {
        return this.azureVmDiskDetails == null ? List.of() : this.azureVmDiskDetails;
    }
    /**
     * The selected option to enable RDP\SSH on target vm after failover. String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     * 
    */
    public Optional<String> getEnableRdpOnTargetOption() {
        return Optional.ofNullable(this.enableRdpOnTargetOption);
    }
    /**
     * The encryption info.
     * 
    */
    public Optional<String> getEncryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * Initial replication details.
     * 
    */
    public Optional<InitialReplicationDetailsResponse> getInitialReplicationDetails() {
        return Optional.ofNullable(this.initialReplicationDetails);
    }
    /**
     * Gets the Instance type.
     * Expected value is 'HyperVReplicaAzure'.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The Last replication time.
     * 
    */
    public Optional<String> getLastReplicatedTime() {
        return Optional.ofNullable(this.lastReplicatedTime);
    }
    /**
     * The last RPO calculated time.
     * 
    */
    public Optional<String> getLastRpoCalculatedTime() {
        return Optional.ofNullable(this.lastRpoCalculatedTime);
    }
    /**
     * License Type of the VM to be used.
     * 
    */
    public Optional<String> getLicenseType() {
        return Optional.ofNullable(this.licenseType);
    }
    /**
     * The operating system info.
     * 
    */
    public Optional<OSDetailsResponse> getOSDetails() {
        return Optional.ofNullable(this.oSDetails);
    }
    /**
     * The recovery availability set Id.
     * 
    */
    public Optional<String> getRecoveryAvailabilitySetId() {
        return Optional.ofNullable(this.recoveryAvailabilitySetId);
    }
    /**
     * The ARM id of the log storage account used for replication. This will be set to null if no log storage account was provided during enable protection.
     * 
    */
    public Optional<String> getRecoveryAzureLogStorageAccountId() {
        return Optional.ofNullable(this.recoveryAzureLogStorageAccountId);
    }
    /**
     * The target resource group Id.
     * 
    */
    public Optional<String> getRecoveryAzureResourceGroupId() {
        return Optional.ofNullable(this.recoveryAzureResourceGroupId);
    }
    /**
     * The recovery Azure storage account.
     * 
    */
    public Optional<String> getRecoveryAzureStorageAccount() {
        return Optional.ofNullable(this.recoveryAzureStorageAccount);
    }
    /**
     * The Recovery Azure VM size.
     * 
    */
    public Optional<String> getRecoveryAzureVMSize() {
        return Optional.ofNullable(this.recoveryAzureVMSize);
    }
    /**
     * Recovery Azure given name.
     * 
    */
    public Optional<String> getRecoveryAzureVmName() {
        return Optional.ofNullable(this.recoveryAzureVmName);
    }
    /**
     * Last RPO value.
     * 
    */
    public Optional<Double> getRpoInSeconds() {
        return Optional.ofNullable(this.rpoInSeconds);
    }
    /**
     * The selected recovery azure network Id.
     * 
    */
    public Optional<String> getSelectedRecoveryAzureNetworkId() {
        return Optional.ofNullable(this.selectedRecoveryAzureNetworkId);
    }
    /**
     * The selected source nic Id which will be used as the primary nic during failover.
     * 
    */
    public Optional<String> getSelectedSourceNicId() {
        return Optional.ofNullable(this.selectedSourceNicId);
    }
    /**
     * The CPU count of the VM on the primary side.
     * 
    */
    public Optional<Integer> getSourceVmCpuCount() {
        return Optional.ofNullable(this.sourceVmCpuCount);
    }
    /**
     * The RAM size of the VM on the primary side.
     * 
    */
    public Optional<Integer> getSourceVmRamSizeInMB() {
        return Optional.ofNullable(this.sourceVmRamSizeInMB);
    }
    /**
     * The target availability zone.
     * 
    */
    public Optional<String> getTargetAvailabilityZone() {
        return Optional.ofNullable(this.targetAvailabilityZone);
    }
    /**
     * The target proximity placement group Id.
     * 
    */
    public Optional<String> getTargetProximityPlacementGroupId() {
        return Optional.ofNullable(this.targetProximityPlacementGroupId);
    }
    /**
     * A value indicating whether managed disks should be used during failover.
     * 
    */
    public Optional<String> getUseManagedDisks() {
        return Optional.ofNullable(this.useManagedDisks);
    }
    /**
     * The virtual machine Id.
     * 
    */
    public Optional<String> getVmId() {
        return Optional.ofNullable(this.vmId);
    }
    /**
     * The PE Network details.
     * 
    */
    public List<VMNicDetailsResponse> getVmNics() {
        return this.vmNics == null ? List.of() : this.vmNics;
    }
    /**
     * The protection state for the vm.
     * 
    */
    public Optional<String> getVmProtectionState() {
        return Optional.ofNullable(this.vmProtectionState);
    }
    /**
     * The protection state description for the vm.
     * 
    */
    public Optional<String> getVmProtectionStateDescription() {
        return Optional.ofNullable(this.vmProtectionStateDescription);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVReplicaAzureReplicationDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AzureVmDiskDetailsResponse> azureVmDiskDetails;
        private @Nullable String enableRdpOnTargetOption;
        private @Nullable String encryption;
        private @Nullable InitialReplicationDetailsResponse initialReplicationDetails;
        private String instanceType;
        private @Nullable String lastReplicatedTime;
        private @Nullable String lastRpoCalculatedTime;
        private @Nullable String licenseType;
        private @Nullable OSDetailsResponse oSDetails;
        private @Nullable String recoveryAvailabilitySetId;
        private @Nullable String recoveryAzureLogStorageAccountId;
        private @Nullable String recoveryAzureResourceGroupId;
        private @Nullable String recoveryAzureStorageAccount;
        private @Nullable String recoveryAzureVMSize;
        private @Nullable String recoveryAzureVmName;
        private @Nullable Double rpoInSeconds;
        private @Nullable String selectedRecoveryAzureNetworkId;
        private @Nullable String selectedSourceNicId;
        private @Nullable Integer sourceVmCpuCount;
        private @Nullable Integer sourceVmRamSizeInMB;
        private @Nullable String targetAvailabilityZone;
        private @Nullable String targetProximityPlacementGroupId;
        private @Nullable String useManagedDisks;
        private @Nullable String vmId;
        private @Nullable List<VMNicDetailsResponse> vmNics;
        private @Nullable String vmProtectionState;
        private @Nullable String vmProtectionStateDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVReplicaAzureReplicationDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureVmDiskDetails = defaults.azureVmDiskDetails;
    	      this.enableRdpOnTargetOption = defaults.enableRdpOnTargetOption;
    	      this.encryption = defaults.encryption;
    	      this.initialReplicationDetails = defaults.initialReplicationDetails;
    	      this.instanceType = defaults.instanceType;
    	      this.lastReplicatedTime = defaults.lastReplicatedTime;
    	      this.lastRpoCalculatedTime = defaults.lastRpoCalculatedTime;
    	      this.licenseType = defaults.licenseType;
    	      this.oSDetails = defaults.oSDetails;
    	      this.recoveryAvailabilitySetId = defaults.recoveryAvailabilitySetId;
    	      this.recoveryAzureLogStorageAccountId = defaults.recoveryAzureLogStorageAccountId;
    	      this.recoveryAzureResourceGroupId = defaults.recoveryAzureResourceGroupId;
    	      this.recoveryAzureStorageAccount = defaults.recoveryAzureStorageAccount;
    	      this.recoveryAzureVMSize = defaults.recoveryAzureVMSize;
    	      this.recoveryAzureVmName = defaults.recoveryAzureVmName;
    	      this.rpoInSeconds = defaults.rpoInSeconds;
    	      this.selectedRecoveryAzureNetworkId = defaults.selectedRecoveryAzureNetworkId;
    	      this.selectedSourceNicId = defaults.selectedSourceNicId;
    	      this.sourceVmCpuCount = defaults.sourceVmCpuCount;
    	      this.sourceVmRamSizeInMB = defaults.sourceVmRamSizeInMB;
    	      this.targetAvailabilityZone = defaults.targetAvailabilityZone;
    	      this.targetProximityPlacementGroupId = defaults.targetProximityPlacementGroupId;
    	      this.useManagedDisks = defaults.useManagedDisks;
    	      this.vmId = defaults.vmId;
    	      this.vmNics = defaults.vmNics;
    	      this.vmProtectionState = defaults.vmProtectionState;
    	      this.vmProtectionStateDescription = defaults.vmProtectionStateDescription;
        }

        public Builder azureVmDiskDetails(@Nullable List<AzureVmDiskDetailsResponse> azureVmDiskDetails) {
            this.azureVmDiskDetails = azureVmDiskDetails;
            return this;
        }

        public Builder enableRdpOnTargetOption(@Nullable String enableRdpOnTargetOption) {
            this.enableRdpOnTargetOption = enableRdpOnTargetOption;
            return this;
        }

        public Builder encryption(@Nullable String encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder initialReplicationDetails(@Nullable InitialReplicationDetailsResponse initialReplicationDetails) {
            this.initialReplicationDetails = initialReplicationDetails;
            return this;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder lastReplicatedTime(@Nullable String lastReplicatedTime) {
            this.lastReplicatedTime = lastReplicatedTime;
            return this;
        }

        public Builder lastRpoCalculatedTime(@Nullable String lastRpoCalculatedTime) {
            this.lastRpoCalculatedTime = lastRpoCalculatedTime;
            return this;
        }

        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder oSDetails(@Nullable OSDetailsResponse oSDetails) {
            this.oSDetails = oSDetails;
            return this;
        }

        public Builder recoveryAvailabilitySetId(@Nullable String recoveryAvailabilitySetId) {
            this.recoveryAvailabilitySetId = recoveryAvailabilitySetId;
            return this;
        }

        public Builder recoveryAzureLogStorageAccountId(@Nullable String recoveryAzureLogStorageAccountId) {
            this.recoveryAzureLogStorageAccountId = recoveryAzureLogStorageAccountId;
            return this;
        }

        public Builder recoveryAzureResourceGroupId(@Nullable String recoveryAzureResourceGroupId) {
            this.recoveryAzureResourceGroupId = recoveryAzureResourceGroupId;
            return this;
        }

        public Builder recoveryAzureStorageAccount(@Nullable String recoveryAzureStorageAccount) {
            this.recoveryAzureStorageAccount = recoveryAzureStorageAccount;
            return this;
        }

        public Builder recoveryAzureVMSize(@Nullable String recoveryAzureVMSize) {
            this.recoveryAzureVMSize = recoveryAzureVMSize;
            return this;
        }

        public Builder recoveryAzureVmName(@Nullable String recoveryAzureVmName) {
            this.recoveryAzureVmName = recoveryAzureVmName;
            return this;
        }

        public Builder rpoInSeconds(@Nullable Double rpoInSeconds) {
            this.rpoInSeconds = rpoInSeconds;
            return this;
        }

        public Builder selectedRecoveryAzureNetworkId(@Nullable String selectedRecoveryAzureNetworkId) {
            this.selectedRecoveryAzureNetworkId = selectedRecoveryAzureNetworkId;
            return this;
        }

        public Builder selectedSourceNicId(@Nullable String selectedSourceNicId) {
            this.selectedSourceNicId = selectedSourceNicId;
            return this;
        }

        public Builder sourceVmCpuCount(@Nullable Integer sourceVmCpuCount) {
            this.sourceVmCpuCount = sourceVmCpuCount;
            return this;
        }

        public Builder sourceVmRamSizeInMB(@Nullable Integer sourceVmRamSizeInMB) {
            this.sourceVmRamSizeInMB = sourceVmRamSizeInMB;
            return this;
        }

        public Builder targetAvailabilityZone(@Nullable String targetAvailabilityZone) {
            this.targetAvailabilityZone = targetAvailabilityZone;
            return this;
        }

        public Builder targetProximityPlacementGroupId(@Nullable String targetProximityPlacementGroupId) {
            this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
            return this;
        }

        public Builder useManagedDisks(@Nullable String useManagedDisks) {
            this.useManagedDisks = useManagedDisks;
            return this;
        }

        public Builder vmId(@Nullable String vmId) {
            this.vmId = vmId;
            return this;
        }

        public Builder vmNics(@Nullable List<VMNicDetailsResponse> vmNics) {
            this.vmNics = vmNics;
            return this;
        }

        public Builder vmProtectionState(@Nullable String vmProtectionState) {
            this.vmProtectionState = vmProtectionState;
            return this;
        }

        public Builder vmProtectionStateDescription(@Nullable String vmProtectionStateDescription) {
            this.vmProtectionStateDescription = vmProtectionStateDescription;
            return this;
        }
        public HyperVReplicaAzureReplicationDetailsResponse build() {
            return new HyperVReplicaAzureReplicationDetailsResponse(azureVmDiskDetails, enableRdpOnTargetOption, encryption, initialReplicationDetails, instanceType, lastReplicatedTime, lastRpoCalculatedTime, licenseType, oSDetails, recoveryAvailabilitySetId, recoveryAzureLogStorageAccountId, recoveryAzureResourceGroupId, recoveryAzureStorageAccount, recoveryAzureVMSize, recoveryAzureVmName, rpoInSeconds, selectedRecoveryAzureNetworkId, selectedSourceNicId, sourceVmCpuCount, sourceVmRamSizeInMB, targetAvailabilityZone, targetProximityPlacementGroupId, useManagedDisks, vmId, vmNics, vmProtectionState, vmProtectionStateDescription);
        }
    }
}
