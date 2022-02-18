// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.azurenative.recoveryservices.enums.CreateMode;
import io.pulumi.azurenative.recoveryservices.enums.DataSourceType;
import io.pulumi.azurenative.recoveryservices.enums.ProtectedItemState;
import io.pulumi.azurenative.recoveryservices.inputs.DPMProtectedItemExtendedInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Additional information on Backup engine specific backup item.
 * 
 */
public final class DPMProtectedItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final DPMProtectedItemArgs Empty = new DPMProtectedItemArgs();

    /**
     * Backup Management server protecting this backup item
     * 
     */
    @InputImport(name="backupEngineName")
    private final @Nullable Input<String> backupEngineName;

    public Input<String> getBackupEngineName() {
        return this.backupEngineName == null ? Input.empty() : this.backupEngineName;
    }

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
     * Extended info of the backup item.
     * 
     */
    @InputImport(name="extendedInfo")
    private final @Nullable Input<DPMProtectedItemExtendedInfoArgs> extendedInfo;

    public Input<DPMProtectedItemExtendedInfoArgs> getExtendedInfo() {
        return this.extendedInfo == null ? Input.empty() : this.extendedInfo;
    }

    /**
     * Friendly name of the managed item
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
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    @InputImport(name="lastRecoveryPoint")
    private final @Nullable Input<String> lastRecoveryPoint;

    public Input<String> getLastRecoveryPoint() {
        return this.lastRecoveryPoint == null ? Input.empty() : this.lastRecoveryPoint;
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
     * backup item type.
     * Expected value is 'DPMProtectedItem'.
     * 
     */
    @InputImport(name="protectedItemType", required=true)
    private final Input<String> protectedItemType;

    public Input<String> getProtectedItemType() {
        return this.protectedItemType;
    }

    /**
     * Protection state of the backup engine
     * 
     */
    @InputImport(name="protectionState")
    private final @Nullable Input<Either<String,ProtectedItemState>> protectionState;

    public Input<Either<String,ProtectedItemState>> getProtectionState() {
        return this.protectionState == null ? Input.empty() : this.protectionState;
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

    public DPMProtectedItemArgs(
        @Nullable Input<String> backupEngineName,
        @Nullable Input<Either<String,BackupManagementType>> backupManagementType,
        @Nullable Input<String> backupSetName,
        @Nullable Input<String> containerName,
        @Nullable Input<Either<String,CreateMode>> createMode,
        @Nullable Input<String> deferredDeleteTimeInUTC,
        @Nullable Input<String> deferredDeleteTimeRemaining,
        @Nullable Input<DPMProtectedItemExtendedInfoArgs> extendedInfo,
        @Nullable Input<String> friendlyName,
        @Nullable Input<Boolean> isDeferredDeleteScheduleUpcoming,
        @Nullable Input<Boolean> isRehydrate,
        @Nullable Input<Boolean> isScheduledForDeferredDelete,
        @Nullable Input<String> lastRecoveryPoint,
        @Nullable Input<String> policyId,
        Input<String> protectedItemType,
        @Nullable Input<Either<String,ProtectedItemState>> protectionState,
        @Nullable Input<String> sourceResourceId,
        @Nullable Input<Either<String,DataSourceType>> workloadType) {
        this.backupEngineName = backupEngineName;
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
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.policyId = policyId;
        this.protectedItemType = Objects.requireNonNull(protectedItemType, "expected parameter 'protectedItemType' to be non-null");
        this.protectionState = protectionState;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    private DPMProtectedItemArgs() {
        this.backupEngineName = Input.empty();
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
        this.lastRecoveryPoint = Input.empty();
        this.policyId = Input.empty();
        this.protectedItemType = Input.empty();
        this.protectionState = Input.empty();
        this.sourceResourceId = Input.empty();
        this.workloadType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DPMProtectedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> backupEngineName;
        private @Nullable Input<Either<String,BackupManagementType>> backupManagementType;
        private @Nullable Input<String> backupSetName;
        private @Nullable Input<String> containerName;
        private @Nullable Input<Either<String,CreateMode>> createMode;
        private @Nullable Input<String> deferredDeleteTimeInUTC;
        private @Nullable Input<String> deferredDeleteTimeRemaining;
        private @Nullable Input<DPMProtectedItemExtendedInfoArgs> extendedInfo;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<Boolean> isDeferredDeleteScheduleUpcoming;
        private @Nullable Input<Boolean> isRehydrate;
        private @Nullable Input<Boolean> isScheduledForDeferredDelete;
        private @Nullable Input<String> lastRecoveryPoint;
        private @Nullable Input<String> policyId;
        private Input<String> protectedItemType;
        private @Nullable Input<Either<String,ProtectedItemState>> protectionState;
        private @Nullable Input<String> sourceResourceId;
        private @Nullable Input<Either<String,DataSourceType>> workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(DPMProtectedItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupEngineName = defaults.backupEngineName;
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
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.policyId = defaults.policyId;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.workloadType = defaults.workloadType;
        }

        public Builder setBackupEngineName(@Nullable Input<String> backupEngineName) {
            this.backupEngineName = backupEngineName;
            return this;
        }

        public Builder setBackupEngineName(@Nullable String backupEngineName) {
            this.backupEngineName = Input.ofNullable(backupEngineName);
            return this;
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

        public Builder setExtendedInfo(@Nullable Input<DPMProtectedItemExtendedInfoArgs> extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder setExtendedInfo(@Nullable DPMProtectedItemExtendedInfoArgs extendedInfo) {
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

        public Builder setLastRecoveryPoint(@Nullable Input<String> lastRecoveryPoint) {
            this.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }

        public Builder setLastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            this.lastRecoveryPoint = Input.ofNullable(lastRecoveryPoint);
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

        public Builder setProtectedItemType(Input<String> protectedItemType) {
            this.protectedItemType = Objects.requireNonNull(protectedItemType);
            return this;
        }

        public Builder setProtectedItemType(String protectedItemType) {
            this.protectedItemType = Input.of(Objects.requireNonNull(protectedItemType));
            return this;
        }

        public Builder setProtectionState(@Nullable Input<Either<String,ProtectedItemState>> protectionState) {
            this.protectionState = protectionState;
            return this;
        }

        public Builder setProtectionState(@Nullable Either<String,ProtectedItemState> protectionState) {
            this.protectionState = Input.ofNullable(protectionState);
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

        public DPMProtectedItemArgs build() {
            return new DPMProtectedItemArgs(backupEngineName, backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, friendlyName, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, lastRecoveryPoint, policyId, protectedItemType, protectionState, sourceResourceId, workloadType);
        }
    }
}
