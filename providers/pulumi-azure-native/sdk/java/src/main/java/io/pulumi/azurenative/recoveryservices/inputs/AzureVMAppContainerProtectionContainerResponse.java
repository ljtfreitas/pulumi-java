// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.AzureWorkloadContainerExtendedInfoResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container for SQL workloads under Azure Virtual Machines.
 * 
 */
public final class AzureVMAppContainerProtectionContainerResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureVMAppContainerProtectionContainerResponse Empty = new AzureVMAppContainerProtectionContainerResponse();

    /**
     * Type of backup management for the container.
     * 
     */
    @Import(name="backupManagementType")
      private final @Nullable String backupManagementType;

    public Optional<String> getBackupManagementType() {
        return this.backupManagementType == null ? Optional.empty() : Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'VMAppContainer'.
     * 
     */
    @Import(name="containerType", required=true)
      private final String containerType;

    public String getContainerType() {
        return this.containerType;
    }

    /**
     * Additional details of a workload container.
     * 
     */
    @Import(name="extendedInfo")
      private final @Nullable AzureWorkloadContainerExtendedInfoResponse extendedInfo;

    public Optional<AzureWorkloadContainerExtendedInfoResponse> getExtendedInfo() {
        return this.extendedInfo == null ? Optional.empty() : Optional.ofNullable(this.extendedInfo);
    }

    /**
     * Friendly name of the container.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    /**
     * Status of health of the container.
     * 
     */
    @Import(name="healthStatus")
      private final @Nullable String healthStatus;

    public Optional<String> getHealthStatus() {
        return this.healthStatus == null ? Optional.empty() : Optional.ofNullable(this.healthStatus);
    }

    /**
     * Time stamp when this container was updated.
     * 
     */
    @Import(name="lastUpdatedTime")
      private final @Nullable String lastUpdatedTime;

    public Optional<String> getLastUpdatedTime() {
        return this.lastUpdatedTime == null ? Optional.empty() : Optional.ofNullable(this.lastUpdatedTime);
    }

    /**
     * Re-Do Operation
     * 
     */
    @Import(name="operationType")
      private final @Nullable String operationType;

    public Optional<String> getOperationType() {
        return this.operationType == null ? Optional.empty() : Optional.ofNullable(this.operationType);
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @Import(name="registrationStatus")
      private final @Nullable String registrationStatus;

    public Optional<String> getRegistrationStatus() {
        return this.registrationStatus == null ? Optional.empty() : Optional.ofNullable(this.registrationStatus);
    }

    /**
     * ARM ID of the virtual machine represented by this Azure Workload Container
     * 
     */
    @Import(name="sourceResourceId")
      private final @Nullable String sourceResourceId;

    public Optional<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Optional.empty() : Optional.ofNullable(this.sourceResourceId);
    }

    /**
     * Workload type for which registration was sent.
     * 
     */
    @Import(name="workloadType")
      private final @Nullable String workloadType;

    public Optional<String> getWorkloadType() {
        return this.workloadType == null ? Optional.empty() : Optional.ofNullable(this.workloadType);
    }

    public AzureVMAppContainerProtectionContainerResponse(
        @Nullable String backupManagementType,
        String containerType,
        @Nullable AzureWorkloadContainerExtendedInfoResponse extendedInfo,
        @Nullable String friendlyName,
        @Nullable String healthStatus,
        @Nullable String lastUpdatedTime,
        @Nullable String operationType,
        @Nullable String registrationStatus,
        @Nullable String sourceResourceId,
        @Nullable String workloadType) {
        this.backupManagementType = backupManagementType;
        this.containerType = Objects.requireNonNull(containerType, "expected parameter 'containerType' to be non-null");
        this.extendedInfo = extendedInfo;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.lastUpdatedTime = lastUpdatedTime;
        this.operationType = operationType;
        this.registrationStatus = registrationStatus;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    private AzureVMAppContainerProtectionContainerResponse() {
        this.backupManagementType = null;
        this.containerType = null;
        this.extendedInfo = null;
        this.friendlyName = null;
        this.healthStatus = null;
        this.lastUpdatedTime = null;
        this.operationType = null;
        this.registrationStatus = null;
        this.sourceResourceId = null;
        this.workloadType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureVMAppContainerProtectionContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private String containerType;
        private @Nullable AzureWorkloadContainerExtendedInfoResponse extendedInfo;
        private @Nullable String friendlyName;
        private @Nullable String healthStatus;
        private @Nullable String lastUpdatedTime;
        private @Nullable String operationType;
        private @Nullable String registrationStatus;
        private @Nullable String sourceResourceId;
        private @Nullable String workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureVMAppContainerProtectionContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.containerType = defaults.containerType;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.operationType = defaults.operationType;
    	      this.registrationStatus = defaults.registrationStatus;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.workloadType = defaults.workloadType;
        }

        public Builder backupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder containerType(String containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }

        public Builder extendedInfo(@Nullable AzureWorkloadContainerExtendedInfoResponse extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder healthStatus(@Nullable String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder operationType(@Nullable String operationType) {
            this.operationType = operationType;
            return this;
        }

        public Builder registrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }

        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder workloadType(@Nullable String workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public AzureVMAppContainerProtectionContainerResponse build() {
            return new AzureVMAppContainerProtectionContainerResponse(backupManagementType, containerType, extendedInfo, friendlyName, healthStatus, lastUpdatedTime, operationType, registrationStatus, sourceResourceId, workloadType);
        }
    }
}
