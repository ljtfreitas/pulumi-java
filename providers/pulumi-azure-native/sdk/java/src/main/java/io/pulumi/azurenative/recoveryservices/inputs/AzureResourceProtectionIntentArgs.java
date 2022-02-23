// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.azurenative.recoveryservices.enums.ProtectionStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IaaS VM specific backup protection intent item.
 * 
 */
public final class AzureResourceProtectionIntentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureResourceProtectionIntentArgs Empty = new AzureResourceProtectionIntentArgs();

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
     * Friendly name of the VM represented by this backup item.
     * 
     */
    @InputImport(name="friendlyName")
        private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    /**
     * ID of the item which is getting protected, In case of Azure Vm , it is ProtectedItemId
     * 
     */
    @InputImport(name="itemId")
        private final @Nullable Input<String> itemId;

    public Input<String> getItemId() {
        return this.itemId == null ? Input.empty() : this.itemId;
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
     * backup protectionIntent type.
     * Expected value is 'AzureResourceItem'.
     * 
     */
    @InputImport(name="protectionIntentItemType", required=true)
        private final Input<String> protectionIntentItemType;

    public Input<String> getProtectionIntentItemType() {
        return this.protectionIntentItemType;
    }

    /**
     * Backup state of this backup item.
     * 
     */
    @InputImport(name="protectionState")
        private final @Nullable Input<Either<String,ProtectionStatus>> protectionState;

    public Input<Either<String,ProtectionStatus>> getProtectionState() {
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

    public AzureResourceProtectionIntentArgs(
        @Nullable Input<Either<String,BackupManagementType>> backupManagementType,
        @Nullable Input<String> friendlyName,
        @Nullable Input<String> itemId,
        @Nullable Input<String> policyId,
        Input<String> protectionIntentItemType,
        @Nullable Input<Either<String,ProtectionStatus>> protectionState,
        @Nullable Input<String> sourceResourceId) {
        this.backupManagementType = backupManagementType;
        this.friendlyName = friendlyName;
        this.itemId = itemId;
        this.policyId = policyId;
        this.protectionIntentItemType = Objects.requireNonNull(protectionIntentItemType, "expected parameter 'protectionIntentItemType' to be non-null");
        this.protectionState = protectionState;
        this.sourceResourceId = sourceResourceId;
    }

    private AzureResourceProtectionIntentArgs() {
        this.backupManagementType = Input.empty();
        this.friendlyName = Input.empty();
        this.itemId = Input.empty();
        this.policyId = Input.empty();
        this.protectionIntentItemType = Input.empty();
        this.protectionState = Input.empty();
        this.sourceResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureResourceProtectionIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,BackupManagementType>> backupManagementType;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<String> itemId;
        private @Nullable Input<String> policyId;
        private Input<String> protectionIntentItemType;
        private @Nullable Input<Either<String,ProtectionStatus>> protectionState;
        private @Nullable Input<String> sourceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureResourceProtectionIntentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.friendlyName = defaults.friendlyName;
    	      this.itemId = defaults.itemId;
    	      this.policyId = defaults.policyId;
    	      this.protectionIntentItemType = defaults.protectionIntentItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.sourceResourceId = defaults.sourceResourceId;
        }

        public Builder setBackupManagementType(@Nullable Input<Either<String,BackupManagementType>> backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setBackupManagementType(@Nullable Either<String,BackupManagementType> backupManagementType) {
            this.backupManagementType = Input.ofNullable(backupManagementType);
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

        public Builder setItemId(@Nullable Input<String> itemId) {
            this.itemId = itemId;
            return this;
        }

        public Builder setItemId(@Nullable String itemId) {
            this.itemId = Input.ofNullable(itemId);
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

        public Builder setProtectionIntentItemType(Input<String> protectionIntentItemType) {
            this.protectionIntentItemType = Objects.requireNonNull(protectionIntentItemType);
            return this;
        }

        public Builder setProtectionIntentItemType(String protectionIntentItemType) {
            this.protectionIntentItemType = Input.of(Objects.requireNonNull(protectionIntentItemType));
            return this;
        }

        public Builder setProtectionState(@Nullable Input<Either<String,ProtectionStatus>> protectionState) {
            this.protectionState = protectionState;
            return this;
        }

        public Builder setProtectionState(@Nullable Either<String,ProtectionStatus> protectionState) {
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
        public AzureResourceProtectionIntentArgs build() {
            return new AzureResourceProtectionIntentArgs(backupManagementType, friendlyName, itemId, policyId, protectionIntentItemType, protectionState, sourceResourceId);
        }
    }
}
