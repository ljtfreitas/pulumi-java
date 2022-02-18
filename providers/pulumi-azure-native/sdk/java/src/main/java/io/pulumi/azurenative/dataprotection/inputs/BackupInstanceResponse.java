// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.DatasourceResponse;
import io.pulumi.azurenative.dataprotection.inputs.DatasourceSetResponse;
import io.pulumi.azurenative.dataprotection.inputs.PolicyInfoResponse;
import io.pulumi.azurenative.dataprotection.inputs.ProtectionStatusDetailsResponse;
import io.pulumi.azurenative.dataprotection.inputs.UserFacingErrorResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Backup Instance
 * 
 */
public final class BackupInstanceResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackupInstanceResponse Empty = new BackupInstanceResponse();

    /**
     * Specifies the current protection state of the resource
     * 
     */
    @InputImport(name="currentProtectionState", required=true)
    private final String currentProtectionState;

    public String getCurrentProtectionState() {
        return this.currentProtectionState;
    }

    /**
     * Gets or sets the data source information.
     * 
     */
    @InputImport(name="dataSourceInfo", required=true)
    private final DatasourceResponse dataSourceInfo;

    public DatasourceResponse getDataSourceInfo() {
        return this.dataSourceInfo;
    }

    /**
     * Gets or sets the data source set information.
     * 
     */
    @InputImport(name="dataSourceSetInfo")
    private final @Nullable DatasourceSetResponse dataSourceSetInfo;

    public Optional<DatasourceSetResponse> getDataSourceSetInfo() {
        return this.dataSourceSetInfo == null ? Optional.empty() : Optional.ofNullable(this.dataSourceSetInfo);
    }

    /**
     * Gets or sets the Backup Instance friendly name.
     * 
     */
    @InputImport(name="friendlyName")
    private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    @InputImport(name="objectType", required=true)
    private final String objectType;

    public String getObjectType() {
        return this.objectType;
    }

    /**
     * Gets or sets the policy information.
     * 
     */
    @InputImport(name="policyInfo", required=true)
    private final PolicyInfoResponse policyInfo;

    public PolicyInfoResponse getPolicyInfo() {
        return this.policyInfo;
    }

    /**
     * Specifies the protection error of the resource
     * 
     */
    @InputImport(name="protectionErrorDetails", required=true)
    private final UserFacingErrorResponse protectionErrorDetails;

    public UserFacingErrorResponse getProtectionErrorDetails() {
        return this.protectionErrorDetails;
    }

    /**
     * Specifies the protection status of the resource
     * 
     */
    @InputImport(name="protectionStatus", required=true)
    private final ProtectionStatusDetailsResponse protectionStatus;

    public ProtectionStatusDetailsResponse getProtectionStatus() {
        return this.protectionStatus;
    }

    /**
     * Specifies the provisioning state of the resource i.e. provisioning/updating/Succeeded/Failed
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public BackupInstanceResponse(
        String currentProtectionState,
        DatasourceResponse dataSourceInfo,
        @Nullable DatasourceSetResponse dataSourceSetInfo,
        @Nullable String friendlyName,
        String objectType,
        PolicyInfoResponse policyInfo,
        UserFacingErrorResponse protectionErrorDetails,
        ProtectionStatusDetailsResponse protectionStatus,
        String provisioningState) {
        this.currentProtectionState = Objects.requireNonNull(currentProtectionState, "expected parameter 'currentProtectionState' to be non-null");
        this.dataSourceInfo = Objects.requireNonNull(dataSourceInfo, "expected parameter 'dataSourceInfo' to be non-null");
        this.dataSourceSetInfo = dataSourceSetInfo;
        this.friendlyName = friendlyName;
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.policyInfo = Objects.requireNonNull(policyInfo, "expected parameter 'policyInfo' to be non-null");
        this.protectionErrorDetails = Objects.requireNonNull(protectionErrorDetails, "expected parameter 'protectionErrorDetails' to be non-null");
        this.protectionStatus = Objects.requireNonNull(protectionStatus, "expected parameter 'protectionStatus' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private BackupInstanceResponse() {
        this.currentProtectionState = null;
        this.dataSourceInfo = null;
        this.dataSourceSetInfo = null;
        this.friendlyName = null;
        this.objectType = null;
        this.policyInfo = null;
        this.protectionErrorDetails = null;
        this.protectionStatus = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String currentProtectionState;
        private DatasourceResponse dataSourceInfo;
        private @Nullable DatasourceSetResponse dataSourceSetInfo;
        private @Nullable String friendlyName;
        private String objectType;
        private PolicyInfoResponse policyInfo;
        private UserFacingErrorResponse protectionErrorDetails;
        private ProtectionStatusDetailsResponse protectionStatus;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentProtectionState = defaults.currentProtectionState;
    	      this.dataSourceInfo = defaults.dataSourceInfo;
    	      this.dataSourceSetInfo = defaults.dataSourceSetInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.objectType = defaults.objectType;
    	      this.policyInfo = defaults.policyInfo;
    	      this.protectionErrorDetails = defaults.protectionErrorDetails;
    	      this.protectionStatus = defaults.protectionStatus;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setCurrentProtectionState(String currentProtectionState) {
            this.currentProtectionState = Objects.requireNonNull(currentProtectionState);
            return this;
        }

        public Builder setDataSourceInfo(DatasourceResponse dataSourceInfo) {
            this.dataSourceInfo = Objects.requireNonNull(dataSourceInfo);
            return this;
        }

        public Builder setDataSourceSetInfo(@Nullable DatasourceSetResponse dataSourceSetInfo) {
            this.dataSourceSetInfo = dataSourceSetInfo;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder setPolicyInfo(PolicyInfoResponse policyInfo) {
            this.policyInfo = Objects.requireNonNull(policyInfo);
            return this;
        }

        public Builder setProtectionErrorDetails(UserFacingErrorResponse protectionErrorDetails) {
            this.protectionErrorDetails = Objects.requireNonNull(protectionErrorDetails);
            return this;
        }

        public Builder setProtectionStatus(ProtectionStatusDetailsResponse protectionStatus) {
            this.protectionStatus = Objects.requireNonNull(protectionStatus);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public BackupInstanceResponse build() {
            return new BackupInstanceResponse(currentProtectionState, dataSourceInfo, dataSourceSetInfo, friendlyName, objectType, policyInfo, protectionErrorDetails, protectionStatus, provisioningState);
        }
    }
}
