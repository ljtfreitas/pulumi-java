// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.azurenative.recoveryservices.enums.CreateMode;
import io.pulumi.azurenative.recoveryservices.enums.DataSourceType;
import io.pulumi.azurenative.recoveryservices.enums.LastBackupStatus;
import io.pulumi.azurenative.recoveryservices.enums.ProtectedItemHealthStatus;
import io.pulumi.azurenative.recoveryservices.enums.ProtectionState;
import io.pulumi.azurenative.recoveryservices.inputs.AzureVmWorkloadProtectedItemExtendedInfoArgs;
import io.pulumi.azurenative.recoveryservices.inputs.KPIResourceHealthDetailsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure VM workload-specific protected item representing SAP ASE Database.
 * 
 */
public final class AzureVmWorkloadSAPAseDatabaseProtectedItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureVmWorkloadSAPAseDatabaseProtectedItemArgs Empty = new AzureVmWorkloadSAPAseDatabaseProtectedItemArgs();

    /**
     * Type of backup management for the backed up item.
     * 
     */
    @InputImport(name="backupManagementType")
    private final @Nullable Input<Either<String,BackupManagementType>> backupManagementType;

    public Input<Either<String,BackupManagementType>> getBackupManagementType() {
        return this.backupManagementType == null ? Input.empty() : this.backupManagementType;
    }

    /**
     * Name of the backup set the backup item belongs to
     * 
     */
    @InputImport(name="backupSetName")
    private final @Nullable Input<String> backupSetName;

    public Input<String> getBackupSetName() {
        return this.backupSetName == null ? Input.empty() : this.backupSetName;
    }

    /**
     * Unique name of container
     * 
     */
    @InputImport(name="containerName")
    private final @Nullable Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName == null ? Input.empty() : this.containerName;
    }

    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
     */
    @InputImport(name="createMode")
    private final @Nullable Input<Either<String,CreateMode>> createMode;

    public Input<Either<String,CreateMode>> getCreateMode() {
        return this.createMode == null ? Input.empty() : this.createMode;
    }

    /**
     * Time for deferred deletion in UTC
     * 
     */
    @InputImport(name="deferredDeleteTimeInUTC")
    private final @Nullable Input<String> deferredDeleteTimeInUTC;

    public Input<String> getDeferredDeleteTimeInUTC() {
        return this.deferredDeleteTimeInUTC == null ? Input.empty() : this.deferredDeleteTimeInUTC;
    }

    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
     */
    @InputImport(name="deferredDeleteTimeRemaining")
    private final @Nullable Input<String> deferredDeleteTimeRemaining;

    public Input<String> getDeferredDeleteTimeRemaining() {
        return this.deferredDeleteTimeRemaining == null ? Input.empty() : this.deferredDeleteTimeRemaining;
    }

    /**
     * Additional information for this backup item.
     * 
     */
    @InputImport(name="extendedInfo")
    private final @Nullable Input<AzureVmWorkloadProtectedItemExtendedInfoArgs> extendedInfo;

    public Input<AzureVmWorkloadProtectedItemExtendedInfoArgs> getExtendedInfo() {
        return this.extendedInfo == null ? Input.empty() : this.extendedInfo;
    }

    /**
     * Friendly name of the DB represented by this backup item.
     * 
     */
    @InputImport(name="friendlyName")
    private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
     */
    @InputImport(name="isDeferredDeleteScheduleUpcoming")
    private final @Nullable Input<Boolean> isDeferredDeleteScheduleUpcoming;

    public Input<Boolean> getIsDeferredDeleteScheduleUpcoming() {
        return this.isDeferredDeleteScheduleUpcoming == null ? Input.empty() : this.isDeferredDeleteScheduleUpcoming;
    }

    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
     */
    @InputImport(name="isRehydrate")
    private final @Nullable Input<Boolean> isRehydrate;

    public Input<Boolean> getIsRehydrate() {
        return this.isRehydrate == null ? Input.empty() : this.isRehydrate;
    }

    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
     */
    @InputImport(name="isScheduledForDeferredDelete")
    private final @Nullable Input<Boolean> isScheduledForDeferredDelete;

    public Input<Boolean> getIsScheduledForDeferredDelete() {
        return this.isScheduledForDeferredDelete == null ? Input.empty() : this.isScheduledForDeferredDelete;
    }

    /**
     * Health details of different KPIs
     * 
     */
    @InputImport(name="kpisHealths")
    private final @Nullable Input<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths;

    public Input<Map<String,KPIResourceHealthDetailsArgs>> getKpisHealths() {
        return this.kpisHealths == null ? Input.empty() : this.kpisHealths;
    }

    /**
     * Last backup operation status. Possible values: Healthy, Unhealthy.
     * 
     */
    @InputImport(name="lastBackupStatus")
    private final @Nullable Input<Either<String,LastBackupStatus>> lastBackupStatus;

    public Input<Either<String,LastBackupStatus>> getLastBackupStatus() {
        return this.lastBackupStatus == null ? Input.empty() : this.lastBackupStatus;
    }

    /**
     * Timestamp of the last backup operation on this backup item.
     * 
     */
    @InputImport(name="lastBackupTime")
    private final @Nullable Input<String> lastBackupTime;

    public Input<String> getLastBackupTime() {
        return this.lastBackupTime == null ? Input.empty() : this.lastBackupTime;
    }

    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    @InputImport(name="lastRecoveryPoint")
    private final @Nullable Input<String> lastRecoveryPoint;

    public Input<String> getLastRecoveryPoint() {
        return this.lastRecoveryPoint == null ? Input.empty() : this.lastRecoveryPoint;
    }

    /**
     * Parent name of the DB such as Instance or Availability Group.
     * 
     */
    @InputImport(name="parentName")
    private final @Nullable Input<String> parentName;

    public Input<String> getParentName() {
        return this.parentName == null ? Input.empty() : this.parentName;
    }

    /**
     * Parent type of protected item, example: for a DB, standalone server or distributed
     * 
     */
    @InputImport(name="parentType")
    private final @Nullable Input<String> parentType;

    public Input<String> getParentType() {
        return this.parentType == null ? Input.empty() : this.parentType;
    }

    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    @InputImport(name="policyId")
    private final @Nullable Input<String> policyId;

    public Input<String> getPolicyId() {
        return this.policyId == null ? Input.empty() : this.policyId;
    }

    /**
     * Data ID of the protected item.
     * 
     */
    @InputImport(name="protectedItemDataSourceId")
    private final @Nullable Input<String> protectedItemDataSourceId;

    public Input<String> getProtectedItemDataSourceId() {
        return this.protectedItemDataSourceId == null ? Input.empty() : this.protectedItemDataSourceId;
    }

    /**
     * Health status of the backup item, evaluated based on last heartbeat received
     * 
     */
    @InputImport(name="protectedItemHealthStatus")
    private final @Nullable Input<Either<String,ProtectedItemHealthStatus>> protectedItemHealthStatus;

    public Input<Either<String,ProtectedItemHealthStatus>> getProtectedItemHealthStatus() {
        return this.protectedItemHealthStatus == null ? Input.empty() : this.protectedItemHealthStatus;
    }

    /**
     * backup item type.
     * Expected value is 'AzureVmWorkloadSAPAseDatabase'.
     * 
     */
    @InputImport(name="protectedItemType", required=true)
    private final Input<String> protectedItemType;

    public Input<String> getProtectedItemType() {
        return this.protectedItemType;
    }

    /**
     * Backup state of this backup item.
     * 
     */
    @InputImport(name="protectionState")
    private final @Nullable Input<Either<String,ProtectionState>> protectionState;

    public Input<Either<String,ProtectionState>> getProtectionState() {
        return this.protectionState == null ? Input.empty() : this.protectionState;
    }

    /**
     * Backup status of this backup item.
     * 
     */
    @InputImport(name="protectionStatus")
    private final @Nullable Input<String> protectionStatus;

    public Input<String> getProtectionStatus() {
        return this.protectionStatus == null ? Input.empty() : this.protectionStatus;
    }

    /**
     * Host/Cluster Name for instance or AG
     * 
     */
    @InputImport(name="serverName")
    private final @Nullable Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName == null ? Input.empty() : this.serverName;
    }

    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    @InputImport(name="sourceResourceId")
    private final @Nullable Input<String> sourceResourceId;

    public Input<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Input.empty() : this.sourceResourceId;
    }

    /**
     * Type of workload this item represents.
     * 
     */
    @InputImport(name="workloadType")
    private final @Nullable Input<Either<String,DataSourceType>> workloadType;

    public Input<Either<String,DataSourceType>> getWorkloadType() {
        return this.workloadType == null ? Input.empty() : this.workloadType;
    }

    public AzureVmWorkloadSAPAseDatabaseProtectedItemArgs(
        @Nullable Input<Either<String,BackupManagementType>> backupManagementType,
        @Nullable Input<String> backupSetName,
        @Nullable Input<String> containerName,
        @Nullable Input<Either<String,CreateMode>> createMode,
        @Nullable Input<String> deferredDeleteTimeInUTC,
        @Nullable Input<String> deferredDeleteTimeRemaining,
        @Nullable Input<AzureVmWorkloadProtectedItemExtendedInfoArgs> extendedInfo,
        @Nullable Input<String> friendlyName,
        @Nullable Input<Boolean> isDeferredDeleteScheduleUpcoming,
        @Nullable Input<Boolean> isRehydrate,
        @Nullable Input<Boolean> isScheduledForDeferredDelete,
        @Nullable Input<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths,
        @Nullable Input<Either<String,LastBackupStatus>> lastBackupStatus,
        @Nullable Input<String> lastBackupTime,
        @Nullable Input<String> lastRecoveryPoint,
        @Nullable Input<String> parentName,
        @Nullable Input<String> parentType,
        @Nullable Input<String> policyId,
        @Nullable Input<String> protectedItemDataSourceId,
        @Nullable Input<Either<String,ProtectedItemHealthStatus>> protectedItemHealthStatus,
        Input<String> protectedItemType,
        @Nullable Input<Either<String,ProtectionState>> protectionState,
        @Nullable Input<String> protectionStatus,
        @Nullable Input<String> serverName,
        @Nullable Input<String> sourceResourceId,
        @Nullable Input<Either<String,DataSourceType>> workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.extendedInfo = extendedInfo;
        this.friendlyName = friendlyName;
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = isRehydrate;
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        this.kpisHealths = kpisHealths;
        this.lastBackupStatus = lastBackupStatus;
        this.lastBackupTime = lastBackupTime;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.parentName = parentName;
        this.parentType = parentType;
        this.policyId = policyId;
        this.protectedItemDataSourceId = protectedItemDataSourceId;
        this.protectedItemHealthStatus = protectedItemHealthStatus;
        this.protectedItemType = Objects.requireNonNull(protectedItemType, "expected parameter 'protectedItemType' to be non-null");
        this.protectionState = protectionState;
        this.protectionStatus = protectionStatus;
        this.serverName = serverName;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    private AzureVmWorkloadSAPAseDatabaseProtectedItemArgs() {
        this.backupManagementType = Input.empty();
        this.backupSetName = Input.empty();
        this.containerName = Input.empty();
        this.createMode = Input.empty();
        this.deferredDeleteTimeInUTC = Input.empty();
        this.deferredDeleteTimeRemaining = Input.empty();
        this.extendedInfo = Input.empty();
        this.friendlyName = Input.empty();
        this.isDeferredDeleteScheduleUpcoming = Input.empty();
        this.isRehydrate = Input.empty();
        this.isScheduledForDeferredDelete = Input.empty();
        this.kpisHealths = Input.empty();
        this.lastBackupStatus = Input.empty();
        this.lastBackupTime = Input.empty();
        this.lastRecoveryPoint = Input.empty();
        this.parentName = Input.empty();
        this.parentType = Input.empty();
        this.policyId = Input.empty();
        this.protectedItemDataSourceId = Input.empty();
        this.protectedItemHealthStatus = Input.empty();
        this.protectedItemType = Input.empty();
        this.protectionState = Input.empty();
        this.protectionStatus = Input.empty();
        this.serverName = Input.empty();
        this.sourceResourceId = Input.empty();
        this.workloadType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureVmWorkloadSAPAseDatabaseProtectedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,BackupManagementType>> backupManagementType;
        private @Nullable Input<String> backupSetName;
        private @Nullable Input<String> containerName;
        private @Nullable Input<Either<String,CreateMode>> createMode;
        private @Nullable Input<String> deferredDeleteTimeInUTC;
        private @Nullable Input<String> deferredDeleteTimeRemaining;
        private @Nullable Input<AzureVmWorkloadProtectedItemExtendedInfoArgs> extendedInfo;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<Boolean> isDeferredDeleteScheduleUpcoming;
        private @Nullable Input<Boolean> isRehydrate;
        private @Nullable Input<Boolean> isScheduledForDeferredDelete;
        private @Nullable Input<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths;
        private @Nullable Input<Either<String,LastBackupStatus>> lastBackupStatus;
        private @Nullable Input<String> lastBackupTime;
        private @Nullable Input<String> lastRecoveryPoint;
        private @Nullable Input<String> parentName;
        private @Nullable Input<String> parentType;
        private @Nullable Input<String> policyId;
        private @Nullable Input<String> protectedItemDataSourceId;
        private @Nullable Input<Either<String,ProtectedItemHealthStatus>> protectedItemHealthStatus;
        private Input<String> protectedItemType;
        private @Nullable Input<Either<String,ProtectionState>> protectionState;
        private @Nullable Input<String> protectionStatus;
        private @Nullable Input<String> serverName;
        private @Nullable Input<String> sourceResourceId;
        private @Nullable Input<Either<String,DataSourceType>> workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureVmWorkloadSAPAseDatabaseProtectedItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.backupSetName = defaults.backupSetName;
    	      this.containerName = defaults.containerName;
    	      this.createMode = defaults.createMode;
    	      this.deferredDeleteTimeInUTC = defaults.deferredDeleteTimeInUTC;
    	      this.deferredDeleteTimeRemaining = defaults.deferredDeleteTimeRemaining;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.isDeferredDeleteScheduleUpcoming = defaults.isDeferredDeleteScheduleUpcoming;
    	      this.isRehydrate = defaults.isRehydrate;
    	      this.isScheduledForDeferredDelete = defaults.isScheduledForDeferredDelete;
    	      this.kpisHealths = defaults.kpisHealths;
    	      this.lastBackupStatus = defaults.lastBackupStatus;
    	      this.lastBackupTime = defaults.lastBackupTime;
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.parentName = defaults.parentName;
    	      this.parentType = defaults.parentType;
    	      this.policyId = defaults.policyId;
    	      this.protectedItemDataSourceId = defaults.protectedItemDataSourceId;
    	      this.protectedItemHealthStatus = defaults.protectedItemHealthStatus;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.protectionStatus = defaults.protectionStatus;
    	      this.serverName = defaults.serverName;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.workloadType = defaults.workloadType;
        }

        public Builder setBackupManagementType(@Nullable Input<Either<String,BackupManagementType>> backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setBackupManagementType(@Nullable Either<String,BackupManagementType> backupManagementType) {
            this.backupManagementType = Input.ofNullable(backupManagementType);
            return this;
        }

        public Builder setBackupSetName(@Nullable Input<String> backupSetName) {
            this.backupSetName = backupSetName;
            return this;
        }

        public Builder setBackupSetName(@Nullable String backupSetName) {
            this.backupSetName = Input.ofNullable(backupSetName);
            return this;
        }

        public Builder setContainerName(@Nullable Input<String> containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = Input.ofNullable(containerName);
            return this;
        }

        public Builder setCreateMode(@Nullable Input<Either<String,CreateMode>> createMode) {
            this.createMode = createMode;
            return this;
        }

        public Builder setCreateMode(@Nullable Either<String,CreateMode> createMode) {
            this.createMode = Input.ofNullable(createMode);
            return this;
        }

        public Builder setDeferredDeleteTimeInUTC(@Nullable Input<String> deferredDeleteTimeInUTC) {
            this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
            return this;
        }

        public Builder setDeferredDeleteTimeInUTC(@Nullable String deferredDeleteTimeInUTC) {
            this.deferredDeleteTimeInUTC = Input.ofNullable(deferredDeleteTimeInUTC);
            return this;
        }

        public Builder setDeferredDeleteTimeRemaining(@Nullable Input<String> deferredDeleteTimeRemaining) {
            this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
            return this;
        }

        public Builder setDeferredDeleteTimeRemaining(@Nullable String deferredDeleteTimeRemaining) {
            this.deferredDeleteTimeRemaining = Input.ofNullable(deferredDeleteTimeRemaining);
            return this;
        }

        public Builder setExtendedInfo(@Nullable Input<AzureVmWorkloadProtectedItemExtendedInfoArgs> extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder setExtendedInfo(@Nullable AzureVmWorkloadProtectedItemExtendedInfoArgs extendedInfo) {
            this.extendedInfo = Input.ofNullable(extendedInfo);
            return this;
        }

        public Builder setFriendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder setIsDeferredDeleteScheduleUpcoming(@Nullable Input<Boolean> isDeferredDeleteScheduleUpcoming) {
            this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
            return this;
        }

        public Builder setIsDeferredDeleteScheduleUpcoming(@Nullable Boolean isDeferredDeleteScheduleUpcoming) {
            this.isDeferredDeleteScheduleUpcoming = Input.ofNullable(isDeferredDeleteScheduleUpcoming);
            return this;
        }

        public Builder setIsRehydrate(@Nullable Input<Boolean> isRehydrate) {
            this.isRehydrate = isRehydrate;
            return this;
        }

        public Builder setIsRehydrate(@Nullable Boolean isRehydrate) {
            this.isRehydrate = Input.ofNullable(isRehydrate);
            return this;
        }

        public Builder setIsScheduledForDeferredDelete(@Nullable Input<Boolean> isScheduledForDeferredDelete) {
            this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
            return this;
        }

        public Builder setIsScheduledForDeferredDelete(@Nullable Boolean isScheduledForDeferredDelete) {
            this.isScheduledForDeferredDelete = Input.ofNullable(isScheduledForDeferredDelete);
            return this;
        }

        public Builder setKpisHealths(@Nullable Input<Map<String,KPIResourceHealthDetailsArgs>> kpisHealths) {
            this.kpisHealths = kpisHealths;
            return this;
        }

        public Builder setKpisHealths(@Nullable Map<String,KPIResourceHealthDetailsArgs> kpisHealths) {
            this.kpisHealths = Input.ofNullable(kpisHealths);
            return this;
        }

        public Builder setLastBackupStatus(@Nullable Input<Either<String,LastBackupStatus>> lastBackupStatus) {
            this.lastBackupStatus = lastBackupStatus;
            return this;
        }

        public Builder setLastBackupStatus(@Nullable Either<String,LastBackupStatus> lastBackupStatus) {
            this.lastBackupStatus = Input.ofNullable(lastBackupStatus);
            return this;
        }

        public Builder setLastBackupTime(@Nullable Input<String> lastBackupTime) {
            this.lastBackupTime = lastBackupTime;
            return this;
        }

        public Builder setLastBackupTime(@Nullable String lastBackupTime) {
            this.lastBackupTime = Input.ofNullable(lastBackupTime);
            return this;
        }

        public Builder setLastRecoveryPoint(@Nullable Input<String> lastRecoveryPoint) {
            this.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }

        public Builder setLastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            this.lastRecoveryPoint = Input.ofNullable(lastRecoveryPoint);
            return this;
        }

        public Builder setParentName(@Nullable Input<String> parentName) {
            this.parentName = parentName;
            return this;
        }

        public Builder setParentName(@Nullable String parentName) {
            this.parentName = Input.ofNullable(parentName);
            return this;
        }

        public Builder setParentType(@Nullable Input<String> parentType) {
            this.parentType = parentType;
            return this;
        }

        public Builder setParentType(@Nullable String parentType) {
            this.parentType = Input.ofNullable(parentType);
            return this;
        }

        public Builder setPolicyId(@Nullable Input<String> policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = Input.ofNullable(policyId);
            return this;
        }

        public Builder setProtectedItemDataSourceId(@Nullable Input<String> protectedItemDataSourceId) {
            this.protectedItemDataSourceId = protectedItemDataSourceId;
            return this;
        }

        public Builder setProtectedItemDataSourceId(@Nullable String protectedItemDataSourceId) {
            this.protectedItemDataSourceId = Input.ofNullable(protectedItemDataSourceId);
            return this;
        }

        public Builder setProtectedItemHealthStatus(@Nullable Input<Either<String,ProtectedItemHealthStatus>> protectedItemHealthStatus) {
            this.protectedItemHealthStatus = protectedItemHealthStatus;
            return this;
        }

        public Builder setProtectedItemHealthStatus(@Nullable Either<String,ProtectedItemHealthStatus> protectedItemHealthStatus) {
            this.protectedItemHealthStatus = Input.ofNullable(protectedItemHealthStatus);
            return this;
        }

        public Builder setProtectedItemType(Input<String> protectedItemType) {
            this.protectedItemType = Objects.requireNonNull(protectedItemType);
            return this;
        }

        public Builder setProtectedItemType(String protectedItemType) {
            this.protectedItemType = Input.of(Objects.requireNonNull(protectedItemType));
            return this;
        }

        public Builder setProtectionState(@Nullable Input<Either<String,ProtectionState>> protectionState) {
            this.protectionState = protectionState;
            return this;
        }

        public Builder setProtectionState(@Nullable Either<String,ProtectionState> protectionState) {
            this.protectionState = Input.ofNullable(protectionState);
            return this;
        }

        public Builder setProtectionStatus(@Nullable Input<String> protectionStatus) {
            this.protectionStatus = protectionStatus;
            return this;
        }

        public Builder setProtectionStatus(@Nullable String protectionStatus) {
            this.protectionStatus = Input.ofNullable(protectionStatus);
            return this;
        }

        public Builder setServerName(@Nullable Input<String> serverName) {
            this.serverName = serverName;
            return this;
        }

        public Builder setServerName(@Nullable String serverName) {
            this.serverName = Input.ofNullable(serverName);
            return this;
        }

        public Builder setSourceResourceId(@Nullable Input<String> sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder setSourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = Input.ofNullable(sourceResourceId);
            return this;
        }

        public Builder setWorkloadType(@Nullable Input<Either<String,DataSourceType>> workloadType) {
            this.workloadType = workloadType;
            return this;
        }

        public Builder setWorkloadType(@Nullable Either<String,DataSourceType> workloadType) {
            this.workloadType = Input.ofNullable(workloadType);
            return this;
        }

        public AzureVmWorkloadSAPAseDatabaseProtectedItemArgs build() {
            return new AzureVmWorkloadSAPAseDatabaseProtectedItemArgs(backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, friendlyName, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, kpisHealths, lastBackupStatus, lastBackupTime, lastRecoveryPoint, parentName, parentType, policyId, protectedItemDataSourceId, protectedItemHealthStatus, protectedItemType, protectionState, protectionStatus, serverName, sourceResourceId, workloadType);
        }
    }
}
