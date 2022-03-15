// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IaaS VM specific backup protection intent item.
 * 
 */
public final class AzureResourceProtectionIntentResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureResourceProtectionIntentResponse Empty = new AzureResourceProtectionIntentResponse();

    /**
     * Type of backup management for the backed up item.
     * 
     */
    @Import(name="backupManagementType")
      private final @Nullable String backupManagementType;

    public Optional<String> getBackupManagementType() {
        return this.backupManagementType == null ? Optional.empty() : Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Friendly name of the VM represented by this backup item.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    /**
     * ID of the item which is getting protected, In case of Azure Vm , it is ProtectedItemId
     * 
     */
    @Import(name="itemId")
      private final @Nullable String itemId;

    public Optional<String> getItemId() {
        return this.itemId == null ? Optional.empty() : Optional.ofNullable(this.itemId);
    }

    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    @Import(name="policyId")
      private final @Nullable String policyId;

    public Optional<String> getPolicyId() {
        return this.policyId == null ? Optional.empty() : Optional.ofNullable(this.policyId);
    }

    /**
     * backup protectionIntent type.
     * Expected value is 'AzureResourceItem'.
     * 
     */
    @Import(name="protectionIntentItemType", required=true)
      private final String protectionIntentItemType;

    public String getProtectionIntentItemType() {
        return this.protectionIntentItemType;
    }

    /**
     * Backup state of this backup item.
     * 
     */
    @Import(name="protectionState")
      private final @Nullable String protectionState;

    public Optional<String> getProtectionState() {
        return this.protectionState == null ? Optional.empty() : Optional.ofNullable(this.protectionState);
    }

    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    @Import(name="sourceResourceId")
      private final @Nullable String sourceResourceId;

    public Optional<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Optional.empty() : Optional.ofNullable(this.sourceResourceId);
    }

    public AzureResourceProtectionIntentResponse(
        @Nullable String backupManagementType,
        @Nullable String friendlyName,
        @Nullable String itemId,
        @Nullable String policyId,
        String protectionIntentItemType,
        @Nullable String protectionState,
        @Nullable String sourceResourceId) {
        this.backupManagementType = backupManagementType;
        this.friendlyName = friendlyName;
        this.itemId = itemId;
        this.policyId = policyId;
        this.protectionIntentItemType = Objects.requireNonNull(protectionIntentItemType, "expected parameter 'protectionIntentItemType' to be non-null");
        this.protectionState = protectionState;
        this.sourceResourceId = sourceResourceId;
    }

    private AzureResourceProtectionIntentResponse() {
        this.backupManagementType = null;
        this.friendlyName = null;
        this.itemId = null;
        this.policyId = null;
        this.protectionIntentItemType = null;
        this.protectionState = null;
        this.sourceResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureResourceProtectionIntentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable String friendlyName;
        private @Nullable String itemId;
        private @Nullable String policyId;
        private String protectionIntentItemType;
        private @Nullable String protectionState;
        private @Nullable String sourceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureResourceProtectionIntentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.friendlyName = defaults.friendlyName;
    	      this.itemId = defaults.itemId;
    	      this.policyId = defaults.policyId;
    	      this.protectionIntentItemType = defaults.protectionIntentItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.sourceResourceId = defaults.sourceResourceId;
        }

        public Builder backupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder itemId(@Nullable String itemId) {
            this.itemId = itemId;
            return this;
        }

        public Builder policyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder protectionIntentItemType(String protectionIntentItemType) {
            this.protectionIntentItemType = Objects.requireNonNull(protectionIntentItemType);
            return this;
        }

        public Builder protectionState(@Nullable String protectionState) {
            this.protectionState = protectionState;
            return this;
        }

        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }
        public AzureResourceProtectionIntentResponse build() {
            return new AzureResourceProtectionIntentResponse(backupManagementType, friendlyName, itemId, policyId, protectionIntentItemType, protectionState, sourceResourceId);
        }
    }
}
