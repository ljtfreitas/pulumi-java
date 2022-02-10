// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureRecoveryServiceVaultProtectionIntentResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureRecoveryServiceVaultProtectionIntentResponse Empty = new AzureRecoveryServiceVaultProtectionIntentResponse();

    @InputImport(name="backupManagementType")
    private final @Nullable String backupManagementType;

    public Optional<String> getBackupManagementType() {
        return this.backupManagementType == null ? Optional.empty() : Optional.ofNullable(this.backupManagementType);
    }

    @InputImport(name="itemId")
    private final @Nullable String itemId;

    public Optional<String> getItemId() {
        return this.itemId == null ? Optional.empty() : Optional.ofNullable(this.itemId);
    }

    @InputImport(name="policyId")
    private final @Nullable String policyId;

    public Optional<String> getPolicyId() {
        return this.policyId == null ? Optional.empty() : Optional.ofNullable(this.policyId);
    }

    @InputImport(name="protectionIntentItemType", required=true)
    private final String protectionIntentItemType;

    public String getProtectionIntentItemType() {
        return this.protectionIntentItemType;
    }

    @InputImport(name="protectionState")
    private final @Nullable String protectionState;

    public Optional<String> getProtectionState() {
        return this.protectionState == null ? Optional.empty() : Optional.ofNullable(this.protectionState);
    }

    @InputImport(name="sourceResourceId")
    private final @Nullable String sourceResourceId;

    public Optional<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Optional.empty() : Optional.ofNullable(this.sourceResourceId);
    }

    public AzureRecoveryServiceVaultProtectionIntentResponse(
        @Nullable String backupManagementType,
        @Nullable String itemId,
        @Nullable String policyId,
        String protectionIntentItemType,
        @Nullable String protectionState,
        @Nullable String sourceResourceId) {
        this.backupManagementType = backupManagementType;
        this.itemId = itemId;
        this.policyId = policyId;
        this.protectionIntentItemType = Objects.requireNonNull(protectionIntentItemType, "expected parameter 'protectionIntentItemType' to be non-null");
        this.protectionState = protectionState;
        this.sourceResourceId = sourceResourceId;
    }

    private AzureRecoveryServiceVaultProtectionIntentResponse() {
        this.backupManagementType = null;
        this.itemId = null;
        this.policyId = null;
        this.protectionIntentItemType = null;
        this.protectionState = null;
        this.sourceResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureRecoveryServiceVaultProtectionIntentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable String itemId;
        private @Nullable String policyId;
        private String protectionIntentItemType;
        private @Nullable String protectionState;
        private @Nullable String sourceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureRecoveryServiceVaultProtectionIntentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.itemId = defaults.itemId;
    	      this.policyId = defaults.policyId;
    	      this.protectionIntentItemType = defaults.protectionIntentItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.sourceResourceId = defaults.sourceResourceId;
        }

        public Builder setBackupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setItemId(@Nullable String itemId) {
            this.itemId = itemId;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setProtectionIntentItemType(String protectionIntentItemType) {
            this.protectionIntentItemType = Objects.requireNonNull(protectionIntentItemType);
            return this;
        }

        public Builder setProtectionState(@Nullable String protectionState) {
            this.protectionState = protectionState;
            return this;
        }

        public Builder setSourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public AzureRecoveryServiceVaultProtectionIntentResponse build() {
            return new AzureRecoveryServiceVaultProtectionIntentResponse(backupManagementType, itemId, policyId, protectionIntentItemType, protectionState, sourceResourceId);
        }
    }
}