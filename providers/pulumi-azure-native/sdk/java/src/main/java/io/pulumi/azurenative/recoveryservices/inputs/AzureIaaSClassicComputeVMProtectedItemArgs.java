// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.azurenative.recoveryservices.enums.CreateMode;
import io.pulumi.azurenative.recoveryservices.enums.DataSourceType;
import io.pulumi.azurenative.recoveryservices.enums.HealthStatus;
import io.pulumi.azurenative.recoveryservices.enums.ProtectionState;
import io.pulumi.azurenative.recoveryservices.inputs.AzureIaaSVMProtectedItemExtendedInfoArgs;
import io.pulumi.azurenative.recoveryservices.inputs.ExtendedPropertiesArgs;
import io.pulumi.azurenative.recoveryservices.inputs.KPIResourceHealthDetailsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IaaS VM workload-specific backup item representing the Classic Compute VM.
 * 
 */
public final class AzureIaaSClassicComputeVMProtectedItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureIaaSClassicComputeVMProtectedItemArgs Empty = new AzureIaaSClassicComputeVMProtectedItemArgs();

    /**
     * Type of backup management for the backed up item.
     * 
     */
    @Import(name="backupManagementType")
      private final @Nullable Output<Either<String,BackupManagementType>> backupManagementType;

    public Output<Either<String,BackupManagementType>> getBackupManagementType() {
        return this.backupManagementType == null ? Output.empty() : this.backupManagementType;
    }

    /**
     * Name of the backup set the backup item belongs to
     * 
     */
    @Import(name="backupSetName")
      private final @Nullable Output<String> backupSetName;

    public Output<String> getBackupSetName() {
        return this.backupSetName == null ? Output.empty() : this.backupSetName;
    }

    /**
     * Unique name of container
     * 
     */
    @Import(name="containerName")
      private final @Nullable Output<String> containerName;

    public Output<String> getContainerName() {
        return this.containerName == null ? Output.empty() : this.containerName;
    }

    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
     */
    @Import(name="createMode")
      private final @Nullable Output<Either<String,CreateMode>> createMode;

    public Output<Either<String,CreateMode>> getCreateMode() {
        return this.createMode == null ? Output.empty() : this.createMode;
    }

    /**
     * Time for deferred deletion in UTC
     * 
     */
    @Import(name="deferredDeleteTimeInUTC")
      private final @Nullable Output<String> deferredDeleteTimeInUTC;

    public Output<String> getDeferredDeleteTimeInUTC() {
        return this.deferredDeleteTimeInUTC == null ? Output.empty() : this.deferredDeleteTimeInUTC;
    }

    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
     */
    @Import(name="deferredDeleteTimeRemaining")
      private final @Nullable Output<String> deferredDeleteTimeRemaining;

    public Output<String> getDeferredDeleteTimeRemaining() {
        return this.deferredDeleteTimeRemaining == null ? Output.empty() : this.deferredDeleteTimeRemaining;
    }

    /**
     * Additional information for this backup item.
     * 
     */
    @Import(name="extendedInfo")
      private final @Nullable Output<AzureIaaSVMProtectedItemExtendedInfoArgs> extendedInfo;

    public Output<AzureIaaSVMProtectedItemExtendedInfoArgs> getExtendedInfo() {
        return this.extendedInfo == null ? Output.empty() : this.extendedInfo;
    }

    /**
     * Extended Properties for Azure IaasVM Backup.
     * 
     */
    @Import(name="extendedProperties")
      private final @Nullable Output<ExtendedPropertiesArgs> extendedProperties;

    public Output<ExtendedPropertiesArgs> getExtendedProperties() {
        return this.extendedProperties == null ? Output.empty() : this.extendedProperties;
    }

    /**
     * Friendly name of the VM represented by this backup item.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName == null ? Output.empty() : this.friendlyName;
    }

    /**
     * Health status of protected item.
     * 
     */
    @Import(name="healthStatus")
      private final @Nullable Output<Either<String,HealthStatus>> healthStatus;

    public Output<Either<String,HealthStatus>> getHealthStatus() {
        return this.healthStatus == null ? Output.empty() : this.healthStatus;
    }

    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
     */
    @Import(name="isDeferredDeleteScheduleUpcoming")
      private final @Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming;

    public Output<Boolean> getIsDeferredDeleteScheduleUpcoming() {
        return this.isDeferredDeleteScheduleUpcoming == null ? Output.empty() : this.isDeferredDeleteScheduleUpcoming;
    }

    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
     */
    @Import(name="isRehydrate")
      private final @Nullable Output<Boolean> isRehydrate;

    public Output<Boolean> getIsRehydrate() {
        return this.isRehydrate == null ? Output.empty() : this.isRehydrate;
    }

    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
     */
    @Import(name="isScheduledForDeferredDelete")
      private final @Nullable Output<Boolean> isScheduledForDeferredDelete;

    public Output<Boolean> getIsScheduledForDeferredDelete() {
        return this.isScheduledForDeferredDelete == null ? Output.empty() : this.isScheduledForDeferredDelete;
    }

    /**
     * Health details of different KPIs
     * 
     */
    @Import(name="kpisHealths")
      private final @Nullable Output<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths;

    public Output<Map<String,KPIResourceHealthDetailsArgs>> getKpisHealths() {
        return this.kpisHealths == null ? Output.empty() : this.kpisHealths;
    }

    /**
     * Last backup operation status.
     * 
     */
    @Import(name="lastBackupStatus")
      private final @Nullable Output<String> lastBackupStatus;

    public Output<String> getLastBackupStatus() {
        return this.lastBackupStatus == null ? Output.empty() : this.lastBackupStatus;
    }

    /**
     * Timestamp of the last backup operation on this backup item.
     * 
     */
    @Import(name="lastBackupTime")
      private final @Nullable Output<String> lastBackupTime;

    public Output<String> getLastBackupTime() {
        return this.lastBackupTime == null ? Output.empty() : this.lastBackupTime;
    }

    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    @Import(name="lastRecoveryPoint")
      private final @Nullable Output<String> lastRecoveryPoint;

    public Output<String> getLastRecoveryPoint() {
        return this.lastRecoveryPoint == null ? Output.empty() : this.lastRecoveryPoint;
    }

    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    @Import(name="policyId")
      private final @Nullable Output<String> policyId;

    public Output<String> getPolicyId() {
        return this.policyId == null ? Output.empty() : this.policyId;
    }

    /**
     * Data ID of the protected item.
     * 
     */
    @Import(name="protectedItemDataId")
      private final @Nullable Output<String> protectedItemDataId;

    public Output<String> getProtectedItemDataId() {
        return this.protectedItemDataId == null ? Output.empty() : this.protectedItemDataId;
    }

    /**
     * backup item type.
     * Expected value is 'Microsoft.ClassicCompute/virtualMachines'.
     * 
     */
    @Import(name="protectedItemType", required=true)
      private final Output<String> protectedItemType;

    public Output<String> getProtectedItemType() {
        return this.protectedItemType;
    }

    /**
     * Backup state of this backup item.
     * 
     */
    @Import(name="protectionState")
      private final @Nullable Output<Either<String,ProtectionState>> protectionState;

    public Output<Either<String,ProtectionState>> getProtectionState() {
        return this.protectionState == null ? Output.empty() : this.protectionState;
    }

    /**
     * Backup status of this backup item.
     * 
     */
    @Import(name="protectionStatus")
      private final @Nullable Output<String> protectionStatus;

    public Output<String> getProtectionStatus() {
        return this.protectionStatus == null ? Output.empty() : this.protectionStatus;
    }

    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    @Import(name="sourceResourceId")
      private final @Nullable Output<String> sourceResourceId;

    public Output<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Output.empty() : this.sourceResourceId;
    }

    /**
     * Fully qualified ARM ID of the virtual machine represented by this item.
     * 
     */
    @Import(name="virtualMachineId")
      private final @Nullable Output<String> virtualMachineId;

    public Output<String> getVirtualMachineId() {
        return this.virtualMachineId == null ? Output.empty() : this.virtualMachineId;
    }

    /**
     * Type of workload this item represents.
     * 
     */
    @Import(name="workloadType")
      private final @Nullable Output<Either<String,DataSourceType>> workloadType;

    public Output<Either<String,DataSourceType>> getWorkloadType() {
        return this.workloadType == null ? Output.empty() : this.workloadType;
    }

    public AzureIaaSClassicComputeVMProtectedItemArgs(
        @Nullable Output<Either<String,BackupManagementType>> backupManagementType,
        @Nullable Output<String> backupSetName,
        @Nullable Output<String> containerName,
        @Nullable Output<Either<String,CreateMode>> createMode,
        @Nullable Output<String> deferredDeleteTimeInUTC,
        @Nullable Output<String> deferredDeleteTimeRemaining,
        @Nullable Output<AzureIaaSVMProtectedItemExtendedInfoArgs> extendedInfo,
        @Nullable Output<ExtendedPropertiesArgs> extendedProperties,
        @Nullable Output<String> friendlyName,
        @Nullable Output<Either<String,HealthStatus>> healthStatus,
        @Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming,
        @Nullable Output<Boolean> isRehydrate,
        @Nullable Output<Boolean> isScheduledForDeferredDelete,
        @Nullable Output<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths,
        @Nullable Output<String> lastBackupStatus,
        @Nullable Output<String> lastBackupTime,
        @Nullable Output<String> lastRecoveryPoint,
        @Nullable Output<String> policyId,
        @Nullable Output<String> protectedItemDataId,
        Output<String> protectedItemType,
        @Nullable Output<Either<String,ProtectionState>> protectionState,
        @Nullable Output<String> protectionStatus,
        @Nullable Output<String> sourceResourceId,
        @Nullable Output<String> virtualMachineId,
        @Nullable Output<Either<String,DataSourceType>> workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.extendedInfo = extendedInfo;
        this.extendedProperties = extendedProperties;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = isRehydrate;
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        this.kpisHealths = kpisHealths;
        this.lastBackupStatus = lastBackupStatus;
        this.lastBackupTime = lastBackupTime;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.policyId = policyId;
        this.protectedItemDataId = protectedItemDataId;
        this.protectedItemType = Objects.requireNonNull(protectedItemType, "expected parameter 'protectedItemType' to be non-null");
        this.protectionState = protectionState;
        this.protectionStatus = protectionStatus;
        this.sourceResourceId = sourceResourceId;
        this.virtualMachineId = virtualMachineId;
        this.workloadType = workloadType;
    }

    private AzureIaaSClassicComputeVMProtectedItemArgs() {
        this.backupManagementType = Output.empty();
        this.backupSetName = Output.empty();
        this.containerName = Output.empty();
        this.createMode = Output.empty();
        this.deferredDeleteTimeInUTC = Output.empty();
        this.deferredDeleteTimeRemaining = Output.empty();
        this.extendedInfo = Output.empty();
        this.extendedProperties = Output.empty();
        this.friendlyName = Output.empty();
        this.healthStatus = Output.empty();
        this.isDeferredDeleteScheduleUpcoming = Output.empty();
        this.isRehydrate = Output.empty();
        this.isScheduledForDeferredDelete = Output.empty();
        this.kpisHealths = Output.empty();
        this.lastBackupStatus = Output.empty();
        this.lastBackupTime = Output.empty();
        this.lastRecoveryPoint = Output.empty();
        this.policyId = Output.empty();
        this.protectedItemDataId = Output.empty();
        this.protectedItemType = Output.empty();
        this.protectionState = Output.empty();
        this.protectionStatus = Output.empty();
        this.sourceResourceId = Output.empty();
        this.virtualMachineId = Output.empty();
        this.workloadType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSClassicComputeVMProtectedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;
        private @Nullable Output<String> backupSetName;
        private @Nullable Output<String> containerName;
        private @Nullable Output<Either<String,CreateMode>> createMode;
        private @Nullable Output<String> deferredDeleteTimeInUTC;
        private @Nullable Output<String> deferredDeleteTimeRemaining;
        private @Nullable Output<AzureIaaSVMProtectedItemExtendedInfoArgs> extendedInfo;
        private @Nullable Output<ExtendedPropertiesArgs> extendedProperties;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<Either<String,HealthStatus>> healthStatus;
        private @Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming;
        private @Nullable Output<Boolean> isRehydrate;
        private @Nullable Output<Boolean> isScheduledForDeferredDelete;
        private @Nullable Output<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths;
        private @Nullable Output<String> lastBackupStatus;
        private @Nullable Output<String> lastBackupTime;
        private @Nullable Output<String> lastRecoveryPoint;
        private @Nullable Output<String> policyId;
        private @Nullable Output<String> protectedItemDataId;
        private Output<String> protectedItemType;
        private @Nullable Output<Either<String,ProtectionState>> protectionState;
        private @Nullable Output<String> protectionStatus;
        private @Nullable Output<String> sourceResourceId;
        private @Nullable Output<String> virtualMachineId;
        private @Nullable Output<Either<String,DataSourceType>> workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSClassicComputeVMProtectedItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.backupSetName = defaults.backupSetName;
    	      this.containerName = defaults.containerName;
    	      this.createMode = defaults.createMode;
    	      this.deferredDeleteTimeInUTC = defaults.deferredDeleteTimeInUTC;
    	      this.deferredDeleteTimeRemaining = defaults.deferredDeleteTimeRemaining;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.extendedProperties = defaults.extendedProperties;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.isDeferredDeleteScheduleUpcoming = defaults.isDeferredDeleteScheduleUpcoming;
    	      this.isRehydrate = defaults.isRehydrate;
    	      this.isScheduledForDeferredDelete = defaults.isScheduledForDeferredDelete;
    	      this.kpisHealths = defaults.kpisHealths;
    	      this.lastBackupStatus = defaults.lastBackupStatus;
    	      this.lastBackupTime = defaults.lastBackupTime;
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.policyId = defaults.policyId;
    	      this.protectedItemDataId = defaults.protectedItemDataId;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.protectionStatus = defaults.protectionStatus;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.virtualMachineId = defaults.virtualMachineId;
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

        public Builder backupSetName(@Nullable Output<String> backupSetName) {
            this.backupSetName = backupSetName;
            return this;
        }

        public Builder backupSetName(@Nullable String backupSetName) {
            this.backupSetName = Output.ofNullable(backupSetName);
            return this;
        }

        public Builder containerName(@Nullable Output<String> containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder containerName(@Nullable String containerName) {
            this.containerName = Output.ofNullable(containerName);
            return this;
        }

        public Builder createMode(@Nullable Output<Either<String,CreateMode>> createMode) {
            this.createMode = createMode;
            return this;
        }

        public Builder createMode(@Nullable Either<String,CreateMode> createMode) {
            this.createMode = Output.ofNullable(createMode);
            return this;
        }

        public Builder deferredDeleteTimeInUTC(@Nullable Output<String> deferredDeleteTimeInUTC) {
            this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
            return this;
        }

        public Builder deferredDeleteTimeInUTC(@Nullable String deferredDeleteTimeInUTC) {
            this.deferredDeleteTimeInUTC = Output.ofNullable(deferredDeleteTimeInUTC);
            return this;
        }

        public Builder deferredDeleteTimeRemaining(@Nullable Output<String> deferredDeleteTimeRemaining) {
            this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
            return this;
        }

        public Builder deferredDeleteTimeRemaining(@Nullable String deferredDeleteTimeRemaining) {
            this.deferredDeleteTimeRemaining = Output.ofNullable(deferredDeleteTimeRemaining);
            return this;
        }

        public Builder extendedInfo(@Nullable Output<AzureIaaSVMProtectedItemExtendedInfoArgs> extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder extendedInfo(@Nullable AzureIaaSVMProtectedItemExtendedInfoArgs extendedInfo) {
            this.extendedInfo = Output.ofNullable(extendedInfo);
            return this;
        }

        public Builder extendedProperties(@Nullable Output<ExtendedPropertiesArgs> extendedProperties) {
            this.extendedProperties = extendedProperties;
            return this;
        }

        public Builder extendedProperties(@Nullable ExtendedPropertiesArgs extendedProperties) {
            this.extendedProperties = Output.ofNullable(extendedProperties);
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

        public Builder healthStatus(@Nullable Output<Either<String,HealthStatus>> healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        public Builder healthStatus(@Nullable Either<String,HealthStatus> healthStatus) {
            this.healthStatus = Output.ofNullable(healthStatus);
            return this;
        }

        public Builder isDeferredDeleteScheduleUpcoming(@Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming) {
            this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
            return this;
        }

        public Builder isDeferredDeleteScheduleUpcoming(@Nullable Boolean isDeferredDeleteScheduleUpcoming) {
            this.isDeferredDeleteScheduleUpcoming = Output.ofNullable(isDeferredDeleteScheduleUpcoming);
            return this;
        }

        public Builder isRehydrate(@Nullable Output<Boolean> isRehydrate) {
            this.isRehydrate = isRehydrate;
            return this;
        }

        public Builder isRehydrate(@Nullable Boolean isRehydrate) {
            this.isRehydrate = Output.ofNullable(isRehydrate);
            return this;
        }

        public Builder isScheduledForDeferredDelete(@Nullable Output<Boolean> isScheduledForDeferredDelete) {
            this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
            return this;
        }

        public Builder isScheduledForDeferredDelete(@Nullable Boolean isScheduledForDeferredDelete) {
            this.isScheduledForDeferredDelete = Output.ofNullable(isScheduledForDeferredDelete);
            return this;
        }

        public Builder kpisHealths(@Nullable Output<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths) {
            this.kpisHealths = kpisHealths;
            return this;
        }

        public Builder kpisHealths(@Nullable Map<String,KPIResourceHealthDetailsArgs> kpisHealths) {
            this.kpisHealths = Output.ofNullable(kpisHealths);
            return this;
        }

        public Builder lastBackupStatus(@Nullable Output<String> lastBackupStatus) {
            this.lastBackupStatus = lastBackupStatus;
            return this;
        }

        public Builder lastBackupStatus(@Nullable String lastBackupStatus) {
            this.lastBackupStatus = Output.ofNullable(lastBackupStatus);
            return this;
        }

        public Builder lastBackupTime(@Nullable Output<String> lastBackupTime) {
            this.lastBackupTime = lastBackupTime;
            return this;
        }

        public Builder lastBackupTime(@Nullable String lastBackupTime) {
            this.lastBackupTime = Output.ofNullable(lastBackupTime);
            return this;
        }

        public Builder lastRecoveryPoint(@Nullable Output<String> lastRecoveryPoint) {
            this.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }

        public Builder lastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            this.lastRecoveryPoint = Output.ofNullable(lastRecoveryPoint);
            return this;
        }

        public Builder policyId(@Nullable Output<String> policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder policyId(@Nullable String policyId) {
            this.policyId = Output.ofNullable(policyId);
            return this;
        }

        public Builder protectedItemDataId(@Nullable Output<String> protectedItemDataId) {
            this.protectedItemDataId = protectedItemDataId;
            return this;
        }

        public Builder protectedItemDataId(@Nullable String protectedItemDataId) {
            this.protectedItemDataId = Output.ofNullable(protectedItemDataId);
            return this;
        }

        public Builder protectedItemType(Output<String> protectedItemType) {
            this.protectedItemType = Objects.requireNonNull(protectedItemType);
            return this;
        }

        public Builder protectedItemType(String protectedItemType) {
            this.protectedItemType = Output.of(Objects.requireNonNull(protectedItemType));
            return this;
        }

        public Builder protectionState(@Nullable Output<Either<String,ProtectionState>> protectionState) {
            this.protectionState = protectionState;
            return this;
        }

        public Builder protectionState(@Nullable Either<String,ProtectionState> protectionState) {
            this.protectionState = Output.ofNullable(protectionState);
            return this;
        }

        public Builder protectionStatus(@Nullable Output<String> protectionStatus) {
            this.protectionStatus = protectionStatus;
            return this;
        }

        public Builder protectionStatus(@Nullable String protectionStatus) {
            this.protectionStatus = Output.ofNullable(protectionStatus);
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

        public Builder virtualMachineId(@Nullable Output<String> virtualMachineId) {
            this.virtualMachineId = virtualMachineId;
            return this;
        }

        public Builder virtualMachineId(@Nullable String virtualMachineId) {
            this.virtualMachineId = Output.ofNullable(virtualMachineId);
            return this;
        }

        public Builder workloadType(@Nullable Output<Either<String,DataSourceType>> workloadType) {
            this.workloadType = workloadType;
            return this;
        }

        public Builder workloadType(@Nullable Either<String,DataSourceType> workloadType) {
            this.workloadType = Output.ofNullable(workloadType);
            return this;
        }
        public AzureIaaSClassicComputeVMProtectedItemArgs build() {
            return new AzureIaaSClassicComputeVMProtectedItemArgs(backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, extendedProperties, friendlyName, healthStatus, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, kpisHealths, lastBackupStatus, lastBackupTime, lastRecoveryPoint, policyId, protectedItemDataId, protectedItemType, protectionState, protectionStatus, sourceResourceId, virtualMachineId, workloadType);
        }
    }
}
