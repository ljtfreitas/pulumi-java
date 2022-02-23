// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.AzureIaaSVMHealthDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.AzureIaaSVMProtectedItemExtendedInfoResponse;
import io.pulumi.azurenative.recoveryservices.inputs.ExtendedPropertiesResponse;
import io.pulumi.azurenative.recoveryservices.inputs.KPIResourceHealthDetailsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IaaS VM workload-specific backup item.
 * 
 */
public final class AzureIaaSVMProtectedItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureIaaSVMProtectedItemResponse Empty = new AzureIaaSVMProtectedItemResponse();

    /**
     * Type of backup management for the backed up item.
     * 
     */
    @InputImport(name="backupManagementType")
        private final @Nullable String backupManagementType;

    public Optional<String> getBackupManagementType() {
        return this.backupManagementType == null ? Optional.empty() : Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Name of the backup set the backup item belongs to
     * 
     */
    @InputImport(name="backupSetName")
        private final @Nullable String backupSetName;

    public Optional<String> getBackupSetName() {
        return this.backupSetName == null ? Optional.empty() : Optional.ofNullable(this.backupSetName);
    }

    /**
     * Unique name of container
     * 
     */
    @InputImport(name="containerName")
        private final @Nullable String containerName;

    public Optional<String> getContainerName() {
        return this.containerName == null ? Optional.empty() : Optional.ofNullable(this.containerName);
    }

    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
     */
    @InputImport(name="createMode")
        private final @Nullable String createMode;

    public Optional<String> getCreateMode() {
        return this.createMode == null ? Optional.empty() : Optional.ofNullable(this.createMode);
    }

    /**
     * Time for deferred deletion in UTC
     * 
     */
    @InputImport(name="deferredDeleteTimeInUTC")
        private final @Nullable String deferredDeleteTimeInUTC;

    public Optional<String> getDeferredDeleteTimeInUTC() {
        return this.deferredDeleteTimeInUTC == null ? Optional.empty() : Optional.ofNullable(this.deferredDeleteTimeInUTC);
    }

    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
     */
    @InputImport(name="deferredDeleteTimeRemaining")
        private final @Nullable String deferredDeleteTimeRemaining;

    public Optional<String> getDeferredDeleteTimeRemaining() {
        return this.deferredDeleteTimeRemaining == null ? Optional.empty() : Optional.ofNullable(this.deferredDeleteTimeRemaining);
    }

    /**
     * Additional information for this backup item.
     * 
     */
    @InputImport(name="extendedInfo")
        private final @Nullable AzureIaaSVMProtectedItemExtendedInfoResponse extendedInfo;

    public Optional<AzureIaaSVMProtectedItemExtendedInfoResponse> getExtendedInfo() {
        return this.extendedInfo == null ? Optional.empty() : Optional.ofNullable(this.extendedInfo);
    }

    /**
     * Extended Properties for Azure IaasVM Backup.
     * 
     */
    @InputImport(name="extendedProperties")
        private final @Nullable ExtendedPropertiesResponse extendedProperties;

    public Optional<ExtendedPropertiesResponse> getExtendedProperties() {
        return this.extendedProperties == null ? Optional.empty() : Optional.ofNullable(this.extendedProperties);
    }

    /**
     * Friendly name of the VM represented by this backup item.
     * 
     */
    @InputImport(name="friendlyName")
        private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    /**
     * Health details on this backup item.
     * 
     */
    @InputImport(name="healthDetails")
        private final @Nullable List<AzureIaaSVMHealthDetailsResponse> healthDetails;

    public List<AzureIaaSVMHealthDetailsResponse> getHealthDetails() {
        return this.healthDetails == null ? List.of() : this.healthDetails;
    }

    /**
     * Health status of protected item.
     * 
     */
    @InputImport(name="healthStatus")
        private final @Nullable String healthStatus;

    public Optional<String> getHealthStatus() {
        return this.healthStatus == null ? Optional.empty() : Optional.ofNullable(this.healthStatus);
    }

    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
     */
    @InputImport(name="isDeferredDeleteScheduleUpcoming")
        private final @Nullable Boolean isDeferredDeleteScheduleUpcoming;

    public Optional<Boolean> getIsDeferredDeleteScheduleUpcoming() {
        return this.isDeferredDeleteScheduleUpcoming == null ? Optional.empty() : Optional.ofNullable(this.isDeferredDeleteScheduleUpcoming);
    }

    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
     */
    @InputImport(name="isRehydrate")
        private final @Nullable Boolean isRehydrate;

    public Optional<Boolean> getIsRehydrate() {
        return this.isRehydrate == null ? Optional.empty() : Optional.ofNullable(this.isRehydrate);
    }

    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
     */
    @InputImport(name="isScheduledForDeferredDelete")
        private final @Nullable Boolean isScheduledForDeferredDelete;

    public Optional<Boolean> getIsScheduledForDeferredDelete() {
        return this.isScheduledForDeferredDelete == null ? Optional.empty() : Optional.ofNullable(this.isScheduledForDeferredDelete);
    }

    /**
     * Health details of different KPIs
     * 
     */
    @InputImport(name="kpisHealths")
        private final @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths;

    public Map<String,KPIResourceHealthDetailsResponse> getKpisHealths() {
        return this.kpisHealths == null ? Map.of() : this.kpisHealths;
    }

    /**
     * Last backup operation status.
     * 
     */
    @InputImport(name="lastBackupStatus")
        private final @Nullable String lastBackupStatus;

    public Optional<String> getLastBackupStatus() {
        return this.lastBackupStatus == null ? Optional.empty() : Optional.ofNullable(this.lastBackupStatus);
    }

    /**
     * Timestamp of the last backup operation on this backup item.
     * 
     */
    @InputImport(name="lastBackupTime")
        private final @Nullable String lastBackupTime;

    public Optional<String> getLastBackupTime() {
        return this.lastBackupTime == null ? Optional.empty() : Optional.ofNullable(this.lastBackupTime);
    }

    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    @InputImport(name="lastRecoveryPoint")
        private final @Nullable String lastRecoveryPoint;

    public Optional<String> getLastRecoveryPoint() {
        return this.lastRecoveryPoint == null ? Optional.empty() : Optional.ofNullable(this.lastRecoveryPoint);
    }

    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    @InputImport(name="policyId")
        private final @Nullable String policyId;

    public Optional<String> getPolicyId() {
        return this.policyId == null ? Optional.empty() : Optional.ofNullable(this.policyId);
    }

    /**
     * Data ID of the protected item.
     * 
     */
    @InputImport(name="protectedItemDataId")
        private final @Nullable String protectedItemDataId;

    public Optional<String> getProtectedItemDataId() {
        return this.protectedItemDataId == null ? Optional.empty() : Optional.ofNullable(this.protectedItemDataId);
    }

    /**
     * backup item type.
     * Expected value is 'AzureIaaSVMProtectedItem'.
     * 
     */
    @InputImport(name="protectedItemType", required=true)
        private final String protectedItemType;

    public String getProtectedItemType() {
        return this.protectedItemType;
    }

    /**
     * Backup state of this backup item.
     * 
     */
    @InputImport(name="protectionState")
        private final @Nullable String protectionState;

    public Optional<String> getProtectionState() {
        return this.protectionState == null ? Optional.empty() : Optional.ofNullable(this.protectionState);
    }

    /**
     * Backup status of this backup item.
     * 
     */
    @InputImport(name="protectionStatus")
        private final @Nullable String protectionStatus;

    public Optional<String> getProtectionStatus() {
        return this.protectionStatus == null ? Optional.empty() : Optional.ofNullable(this.protectionStatus);
    }

    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    @InputImport(name="sourceResourceId")
        private final @Nullable String sourceResourceId;

    public Optional<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Optional.empty() : Optional.ofNullable(this.sourceResourceId);
    }

    /**
     * Fully qualified ARM ID of the virtual machine represented by this item.
     * 
     */
    @InputImport(name="virtualMachineId")
        private final @Nullable String virtualMachineId;

    public Optional<String> getVirtualMachineId() {
        return this.virtualMachineId == null ? Optional.empty() : Optional.ofNullable(this.virtualMachineId);
    }

    /**
     * Type of workload this item represents.
     * 
     */
    @InputImport(name="workloadType")
        private final @Nullable String workloadType;

    public Optional<String> getWorkloadType() {
        return this.workloadType == null ? Optional.empty() : Optional.ofNullable(this.workloadType);
    }

    public AzureIaaSVMProtectedItemResponse(
        @Nullable String backupManagementType,
        @Nullable String backupSetName,
        @Nullable String containerName,
        @Nullable String createMode,
        @Nullable String deferredDeleteTimeInUTC,
        @Nullable String deferredDeleteTimeRemaining,
        @Nullable AzureIaaSVMProtectedItemExtendedInfoResponse extendedInfo,
        @Nullable ExtendedPropertiesResponse extendedProperties,
        @Nullable String friendlyName,
        @Nullable List<AzureIaaSVMHealthDetailsResponse> healthDetails,
        @Nullable String healthStatus,
        @Nullable Boolean isDeferredDeleteScheduleUpcoming,
        @Nullable Boolean isRehydrate,
        @Nullable Boolean isScheduledForDeferredDelete,
        @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths,
        @Nullable String lastBackupStatus,
        @Nullable String lastBackupTime,
        @Nullable String lastRecoveryPoint,
        @Nullable String policyId,
        @Nullable String protectedItemDataId,
        String protectedItemType,
        @Nullable String protectionState,
        @Nullable String protectionStatus,
        @Nullable String sourceResourceId,
        @Nullable String virtualMachineId,
        @Nullable String workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.extendedInfo = extendedInfo;
        this.extendedProperties = extendedProperties;
        this.friendlyName = friendlyName;
        this.healthDetails = healthDetails;
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

    private AzureIaaSVMProtectedItemResponse() {
        this.backupManagementType = null;
        this.backupSetName = null;
        this.containerName = null;
        this.createMode = null;
        this.deferredDeleteTimeInUTC = null;
        this.deferredDeleteTimeRemaining = null;
        this.extendedInfo = null;
        this.extendedProperties = null;
        this.friendlyName = null;
        this.healthDetails = List.of();
        this.healthStatus = null;
        this.isDeferredDeleteScheduleUpcoming = null;
        this.isRehydrate = null;
        this.isScheduledForDeferredDelete = null;
        this.kpisHealths = Map.of();
        this.lastBackupStatus = null;
        this.lastBackupTime = null;
        this.lastRecoveryPoint = null;
        this.policyId = null;
        this.protectedItemDataId = null;
        this.protectedItemType = null;
        this.protectionState = null;
        this.protectionStatus = null;
        this.sourceResourceId = null;
        this.virtualMachineId = null;
        this.workloadType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSVMProtectedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable String backupSetName;
        private @Nullable String containerName;
        private @Nullable String createMode;
        private @Nullable String deferredDeleteTimeInUTC;
        private @Nullable String deferredDeleteTimeRemaining;
        private @Nullable AzureIaaSVMProtectedItemExtendedInfoResponse extendedInfo;
        private @Nullable ExtendedPropertiesResponse extendedProperties;
        private @Nullable String friendlyName;
        private @Nullable List<AzureIaaSVMHealthDetailsResponse> healthDetails;
        private @Nullable String healthStatus;
        private @Nullable Boolean isDeferredDeleteScheduleUpcoming;
        private @Nullable Boolean isRehydrate;
        private @Nullable Boolean isScheduledForDeferredDelete;
        private @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths;
        private @Nullable String lastBackupStatus;
        private @Nullable String lastBackupTime;
        private @Nullable String lastRecoveryPoint;
        private @Nullable String policyId;
        private @Nullable String protectedItemDataId;
        private String protectedItemType;
        private @Nullable String protectionState;
        private @Nullable String protectionStatus;
        private @Nullable String sourceResourceId;
        private @Nullable String virtualMachineId;
        private @Nullable String workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSVMProtectedItemResponse defaults) {
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
    	      this.healthDetails = defaults.healthDetails;
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

        public Builder setBackupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setBackupSetName(@Nullable String backupSetName) {
            this.backupSetName = backupSetName;
            return this;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setCreateMode(@Nullable String createMode) {
            this.createMode = createMode;
            return this;
        }

        public Builder setDeferredDeleteTimeInUTC(@Nullable String deferredDeleteTimeInUTC) {
            this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
            return this;
        }

        public Builder setDeferredDeleteTimeRemaining(@Nullable String deferredDeleteTimeRemaining) {
            this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
            return this;
        }

        public Builder setExtendedInfo(@Nullable AzureIaaSVMProtectedItemExtendedInfoResponse extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder setExtendedProperties(@Nullable ExtendedPropertiesResponse extendedProperties) {
            this.extendedProperties = extendedProperties;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setHealthDetails(@Nullable List<AzureIaaSVMHealthDetailsResponse> healthDetails) {
            this.healthDetails = healthDetails;
            return this;
        }

        public Builder setHealthStatus(@Nullable String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        public Builder setIsDeferredDeleteScheduleUpcoming(@Nullable Boolean isDeferredDeleteScheduleUpcoming) {
            this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
            return this;
        }

        public Builder setIsRehydrate(@Nullable Boolean isRehydrate) {
            this.isRehydrate = isRehydrate;
            return this;
        }

        public Builder setIsScheduledForDeferredDelete(@Nullable Boolean isScheduledForDeferredDelete) {
            this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
            return this;
        }

        public Builder setKpisHealths(@Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths) {
            this.kpisHealths = kpisHealths;
            return this;
        }

        public Builder setLastBackupStatus(@Nullable String lastBackupStatus) {
            this.lastBackupStatus = lastBackupStatus;
            return this;
        }

        public Builder setLastBackupTime(@Nullable String lastBackupTime) {
            this.lastBackupTime = lastBackupTime;
            return this;
        }

        public Builder setLastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            this.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setProtectedItemDataId(@Nullable String protectedItemDataId) {
            this.protectedItemDataId = protectedItemDataId;
            return this;
        }

        public Builder setProtectedItemType(String protectedItemType) {
            this.protectedItemType = Objects.requireNonNull(protectedItemType);
            return this;
        }

        public Builder setProtectionState(@Nullable String protectionState) {
            this.protectionState = protectionState;
            return this;
        }

        public Builder setProtectionStatus(@Nullable String protectionStatus) {
            this.protectionStatus = protectionStatus;
            return this;
        }

        public Builder setSourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder setVirtualMachineId(@Nullable String virtualMachineId) {
            this.virtualMachineId = virtualMachineId;
            return this;
        }

        public Builder setWorkloadType(@Nullable String workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public AzureIaaSVMProtectedItemResponse build() {
            return new AzureIaaSVMProtectedItemResponse(backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, extendedProperties, friendlyName, healthDetails, healthStatus, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, kpisHealths, lastBackupStatus, lastBackupTime, lastRecoveryPoint, policyId, protectedItemDataId, protectedItemType, protectionState, protectionStatus, sourceResourceId, virtualMachineId, workloadType);
        }
    }
}
