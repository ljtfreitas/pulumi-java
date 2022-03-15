// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.azurenative.recoveryservices.enums.OperationType;
import io.pulumi.azurenative.recoveryservices.enums.WorkloadType;
import io.pulumi.azurenative.recoveryservices.inputs.AzureWorkloadContainerExtendedInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container for SQL workloads under Azure Virtual Machines.
 * 
 */
public final class AzureVMAppContainerProtectionContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureVMAppContainerProtectionContainerArgs Empty = new AzureVMAppContainerProtectionContainerArgs();

    /**
     * Type of backup management for the container.
     * 
     */
    @Import(name="backupManagementType")
      private final @Nullable Output<Either<String,BackupManagementType>> backupManagementType;

    public Output<Either<String,BackupManagementType>> getBackupManagementType() {
        return this.backupManagementType == null ? Output.empty() : this.backupManagementType;
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
      private final Output<String> containerType;

    public Output<String> getContainerType() {
        return this.containerType;
    }

    /**
     * Additional details of a workload container.
     * 
     */
    @Import(name="extendedInfo")
      private final @Nullable Output<AzureWorkloadContainerExtendedInfoArgs> extendedInfo;

    public Output<AzureWorkloadContainerExtendedInfoArgs> getExtendedInfo() {
        return this.extendedInfo == null ? Output.empty() : this.extendedInfo;
    }

    /**
     * Friendly name of the container.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName == null ? Output.empty() : this.friendlyName;
    }

    /**
     * Status of health of the container.
     * 
     */
    @Import(name="healthStatus")
      private final @Nullable Output<String> healthStatus;

    public Output<String> getHealthStatus() {
        return this.healthStatus == null ? Output.empty() : this.healthStatus;
    }

    /**
     * Time stamp when this container was updated.
     * 
     */
    @Import(name="lastUpdatedTime")
      private final @Nullable Output<String> lastUpdatedTime;

    public Output<String> getLastUpdatedTime() {
        return this.lastUpdatedTime == null ? Output.empty() : this.lastUpdatedTime;
    }

    /**
     * Re-Do Operation
     * 
     */
    @Import(name="operationType")
      private final @Nullable Output<Either<String,OperationType>> operationType;

    public Output<Either<String,OperationType>> getOperationType() {
        return this.operationType == null ? Output.empty() : this.operationType;
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @Import(name="registrationStatus")
      private final @Nullable Output<String> registrationStatus;

    public Output<String> getRegistrationStatus() {
        return this.registrationStatus == null ? Output.empty() : this.registrationStatus;
    }

    /**
     * ARM ID of the virtual machine represented by this Azure Workload Container
     * 
     */
    @Import(name="sourceResourceId")
      private final @Nullable Output<String> sourceResourceId;

    public Output<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Output.empty() : this.sourceResourceId;
    }

    /**
     * Workload type for which registration was sent.
     * 
     */
    @Import(name="workloadType")
      private final @Nullable Output<Either<String,WorkloadType>> workloadType;

    public Output<Either<String,WorkloadType>> getWorkloadType() {
        return this.workloadType == null ? Output.empty() : this.workloadType;
    }

    public AzureVMAppContainerProtectionContainerArgs(
        @Nullable Output<Either<String,BackupManagementType>> backupManagementType,
        Output<String> containerType,
        @Nullable Output<AzureWorkloadContainerExtendedInfoArgs> extendedInfo,
        @Nullable Output<String> friendlyName,
        @Nullable Output<String> healthStatus,
        @Nullable Output<String> lastUpdatedTime,
        @Nullable Output<Either<String,OperationType>> operationType,
        @Nullable Output<String> registrationStatus,
        @Nullable Output<String> sourceResourceId,
        @Nullable Output<Either<String,WorkloadType>> workloadType) {
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

    private AzureVMAppContainerProtectionContainerArgs() {
        this.backupManagementType = Output.empty();
        this.containerType = Output.empty();
        this.extendedInfo = Output.empty();
        this.friendlyName = Output.empty();
        this.healthStatus = Output.empty();
        this.lastUpdatedTime = Output.empty();
        this.operationType = Output.empty();
        this.registrationStatus = Output.empty();
        this.sourceResourceId = Output.empty();
        this.workloadType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureVMAppContainerProtectionContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;
        private Output<String> containerType;
        private @Nullable Output<AzureWorkloadContainerExtendedInfoArgs> extendedInfo;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<String> healthStatus;
        private @Nullable Output<String> lastUpdatedTime;
        private @Nullable Output<Either<String,OperationType>> operationType;
        private @Nullable Output<String> registrationStatus;
        private @Nullable Output<String> sourceResourceId;
        private @Nullable Output<Either<String,WorkloadType>> workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureVMAppContainerProtectionContainerArgs defaults) {
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

        public Builder backupManagementType(@Nullable Output<Either<String,BackupManagementType>> backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder backupManagementType(@Nullable Either<String,BackupManagementType> backupManagementType) {
            this.backupManagementType = Output.ofNullable(backupManagementType);
            return this;
        }

        public Builder containerType(Output<String> containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }

        public Builder containerType(String containerType) {
            this.containerType = Output.of(Objects.requireNonNull(containerType));
            return this;
        }

        public Builder extendedInfo(@Nullable Output<AzureWorkloadContainerExtendedInfoArgs> extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder extendedInfo(@Nullable AzureWorkloadContainerExtendedInfoArgs extendedInfo) {
            this.extendedInfo = Output.ofNullable(extendedInfo);
            return this;
        }

        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Output.ofNullable(friendlyName);
            return this;
        }

        public Builder healthStatus(@Nullable Output<String> healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        public Builder healthStatus(@Nullable String healthStatus) {
            this.healthStatus = Output.ofNullable(healthStatus);
            return this;
        }

        public Builder lastUpdatedTime(@Nullable Output<String> lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = Output.ofNullable(lastUpdatedTime);
            return this;
        }

        public Builder operationType(@Nullable Output<Either<String,OperationType>> operationType) {
            this.operationType = operationType;
            return this;
        }

        public Builder operationType(@Nullable Either<String,OperationType> operationType) {
            this.operationType = Output.ofNullable(operationType);
            return this;
        }

        public Builder registrationStatus(@Nullable Output<String> registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }

        public Builder registrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = Output.ofNullable(registrationStatus);
            return this;
        }

        public Builder sourceResourceId(@Nullable Output<String> sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = Output.ofNullable(sourceResourceId);
            return this;
        }

        public Builder workloadType(@Nullable Output<Either<String,WorkloadType>> workloadType) {
            this.workloadType = workloadType;
            return this;
        }

        public Builder workloadType(@Nullable Either<String,WorkloadType> workloadType) {
            this.workloadType = Output.ofNullable(workloadType);
            return this;
        }
        public AzureVMAppContainerProtectionContainerArgs build() {
            return new AzureVMAppContainerProtectionContainerArgs(backupManagementType, containerType, extendedInfo, friendlyName, healthStatus, lastUpdatedTime, operationType, registrationStatus, sourceResourceId, workloadType);
        }
    }
}
