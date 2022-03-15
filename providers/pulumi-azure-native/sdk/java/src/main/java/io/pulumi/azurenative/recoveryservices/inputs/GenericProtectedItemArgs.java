// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.azurenative.recoveryservices.enums.CreateMode;
import io.pulumi.azurenative.recoveryservices.enums.DataSourceType;
import io.pulumi.azurenative.recoveryservices.enums.ProtectionState;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Base class for backup items.
 * 
 */
public final class GenericProtectedItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final GenericProtectedItemArgs Empty = new GenericProtectedItemArgs();

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
     * Name of this backup item's fabric.
     * 
     */
    @Import(name="fabricName")
      private final @Nullable Output<String> fabricName;

    public Output<String> getFabricName() {
        return this.fabricName == null ? Output.empty() : this.fabricName;
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
     * Indicates consistency of policy object and policy applied to this backup item.
     * 
     */
    @Import(name="policyState")
      private final @Nullable Output<String> policyState;

    public Output<String> getPolicyState() {
        return this.policyState == null ? Output.empty() : this.policyState;
    }

    /**
     * Data Plane Service ID of the protected item.
     * 
     */
    @Import(name="protectedItemId")
      private final @Nullable Output<Double> protectedItemId;

    public Output<Double> getProtectedItemId() {
        return this.protectedItemId == null ? Output.empty() : this.protectedItemId;
    }

    /**
     * backup item type.
     * Expected value is 'GenericProtectedItem'.
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
     * Loosely coupled (type, value) associations (example - parent of a protected item)
     * 
     */
    @Import(name="sourceAssociations")
      private final @Nullable Output<Map<String,String>> sourceAssociations;

    public Output<Map<String,String>> getSourceAssociations() {
        return this.sourceAssociations == null ? Output.empty() : this.sourceAssociations;
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
     * Type of workload this item represents.
     * 
     */
    @Import(name="workloadType")
      private final @Nullable Output<Either<String,DataSourceType>> workloadType;

    public Output<Either<String,DataSourceType>> getWorkloadType() {
        return this.workloadType == null ? Output.empty() : this.workloadType;
    }

    public GenericProtectedItemArgs(
        @Nullable Output<Either<String,BackupManagementType>> backupManagementType,
        @Nullable Output<String> backupSetName,
        @Nullable Output<String> containerName,
        @Nullable Output<Either<String,CreateMode>> createMode,
        @Nullable Output<String> deferredDeleteTimeInUTC,
        @Nullable Output<String> deferredDeleteTimeRemaining,
        @Nullable Output<String> fabricName,
        @Nullable Output<String> friendlyName,
        @Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming,
        @Nullable Output<Boolean> isRehydrate,
        @Nullable Output<Boolean> isScheduledForDeferredDelete,
        @Nullable Output<String> lastRecoveryPoint,
        @Nullable Output<String> policyId,
        @Nullable Output<String> policyState,
        @Nullable Output<Double> protectedItemId,
        Output<String> protectedItemType,
        @Nullable Output<Either<String,ProtectionState>> protectionState,
        @Nullable Output<Map<String,String>> sourceAssociations,
        @Nullable Output<String> sourceResourceId,
        @Nullable Output<Either<String,DataSourceType>> workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.fabricName = fabricName;
        this.friendlyName = friendlyName;
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = isRehydrate;
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.policyId = policyId;
        this.policyState = policyState;
        this.protectedItemId = protectedItemId;
        this.protectedItemType = Objects.requireNonNull(protectedItemType, "expected parameter 'protectedItemType' to be non-null");
        this.protectionState = protectionState;
        this.sourceAssociations = sourceAssociations;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    private GenericProtectedItemArgs() {
        this.backupManagementType = Output.empty();
        this.backupSetName = Output.empty();
        this.containerName = Output.empty();
        this.createMode = Output.empty();
        this.deferredDeleteTimeInUTC = Output.empty();
        this.deferredDeleteTimeRemaining = Output.empty();
        this.fabricName = Output.empty();
        this.friendlyName = Output.empty();
        this.isDeferredDeleteScheduleUpcoming = Output.empty();
        this.isRehydrate = Output.empty();
        this.isScheduledForDeferredDelete = Output.empty();
        this.lastRecoveryPoint = Output.empty();
        this.policyId = Output.empty();
        this.policyState = Output.empty();
        this.protectedItemId = Output.empty();
        this.protectedItemType = Output.empty();
        this.protectionState = Output.empty();
        this.sourceAssociations = Output.empty();
        this.sourceResourceId = Output.empty();
        this.workloadType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericProtectedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;
        private @Nullable Output<String> backupSetName;
        private @Nullable Output<String> containerName;
        private @Nullable Output<Either<String,CreateMode>> createMode;
        private @Nullable Output<String> deferredDeleteTimeInUTC;
        private @Nullable Output<String> deferredDeleteTimeRemaining;
        private @Nullable Output<String> fabricName;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<Boolean> isDeferredDeleteScheduleUpcoming;
        private @Nullable Output<Boolean> isRehydrate;
        private @Nullable Output<Boolean> isScheduledForDeferredDelete;
        private @Nullable Output<String> lastRecoveryPoint;
        private @Nullable Output<String> policyId;
        private @Nullable Output<String> policyState;
        private @Nullable Output<Double> protectedItemId;
        private Output<String> protectedItemType;
        private @Nullable Output<Either<String,ProtectionState>> protectionState;
        private @Nullable Output<Map<String,String>> sourceAssociations;
        private @Nullable Output<String> sourceResourceId;
        private @Nullable Output<Either<String,DataSourceType>> workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(GenericProtectedItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.backupSetName = defaults.backupSetName;
    	      this.containerName = defaults.containerName;
    	      this.createMode = defaults.createMode;
    	      this.deferredDeleteTimeInUTC = defaults.deferredDeleteTimeInUTC;
    	      this.deferredDeleteTimeRemaining = defaults.deferredDeleteTimeRemaining;
    	      this.fabricName = defaults.fabricName;
    	      this.friendlyName = defaults.friendlyName;
    	      this.isDeferredDeleteScheduleUpcoming = defaults.isDeferredDeleteScheduleUpcoming;
    	      this.isRehydrate = defaults.isRehydrate;
    	      this.isScheduledForDeferredDelete = defaults.isScheduledForDeferredDelete;
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.policyId = defaults.policyId;
    	      this.policyState = defaults.policyState;
    	      this.protectedItemId = defaults.protectedItemId;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.sourceAssociations = defaults.sourceAssociations;
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

        public Builder fabricName(@Nullable Output<String> fabricName) {
            this.fabricName = fabricName;
            return this;
        }

        public Builder fabricName(@Nullable String fabricName) {
            this.fabricName = Output.ofNullable(fabricName);
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

        public Builder policyState(@Nullable Output<String> policyState) {
            this.policyState = policyState;
            return this;
        }

        public Builder policyState(@Nullable String policyState) {
            this.policyState = Output.ofNullable(policyState);
            return this;
        }

        public Builder protectedItemId(@Nullable Output<Double> protectedItemId) {
            this.protectedItemId = protectedItemId;
            return this;
        }

        public Builder protectedItemId(@Nullable Double protectedItemId) {
            this.protectedItemId = Output.ofNullable(protectedItemId);
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

        public Builder sourceAssociations(@Nullable Output<Map<String,String>> sourceAssociations) {
            this.sourceAssociations = sourceAssociations;
            return this;
        }

        public Builder sourceAssociations(@Nullable Map<String,String> sourceAssociations) {
            this.sourceAssociations = Output.ofNullable(sourceAssociations);
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

        public Builder workloadType(@Nullable Output<Either<String,DataSourceType>> workloadType) {
            this.workloadType = workloadType;
            return this;
        }

        public Builder workloadType(@Nullable Either<String,DataSourceType> workloadType) {
            this.workloadType = Output.ofNullable(workloadType);
            return this;
        }
        public GenericProtectedItemArgs build() {
            return new GenericProtectedItemArgs(backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, fabricName, friendlyName, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, lastRecoveryPoint, policyId, policyState, protectedItemId, protectedItemType, protectionState, sourceAssociations, sourceResourceId, workloadType);
        }
    }
}
