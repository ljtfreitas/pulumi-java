// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.inputs;

import io.pulumi.azurenative.guestconfiguration.inputs.AssignmentReportResponse;
import io.pulumi.azurenative.guestconfiguration.inputs.GuestConfigurationNavigationResponse;
import io.pulumi.azurenative.guestconfiguration.inputs.VMSSVMInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Guest configuration assignment properties.
 * 
 */
public final class GuestConfigurationAssignmentPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GuestConfigurationAssignmentPropertiesResponse Empty = new GuestConfigurationAssignmentPropertiesResponse();

    /**
     * Combined hash of the configuration package and parameters.
     * 
     */
    @InputImport(name="assignmentHash", required=true)
        private final String assignmentHash;

    public String getAssignmentHash() {
        return this.assignmentHash;
    }

    /**
     * A value indicating compliance status of the machine for the assigned guest configuration.
     * 
     */
    @InputImport(name="complianceStatus", required=true)
        private final String complianceStatus;

    public String getComplianceStatus() {
        return this.complianceStatus;
    }

    /**
     * The source which initiated the guest configuration assignment. Ex: Azure Policy
     * 
     */
    @InputImport(name="context")
        private final @Nullable String context;

    public Optional<String> getContext() {
        return this.context == null ? Optional.empty() : Optional.ofNullable(this.context);
    }

    /**
     * The guest configuration to assign.
     * 
     */
    @InputImport(name="guestConfiguration")
        private final @Nullable GuestConfigurationNavigationResponse guestConfiguration;

    public Optional<GuestConfigurationNavigationResponse> getGuestConfiguration() {
        return this.guestConfiguration == null ? Optional.empty() : Optional.ofNullable(this.guestConfiguration);
    }

    /**
     * Date and time when last compliance status was checked.
     * 
     */
    @InputImport(name="lastComplianceStatusChecked", required=true)
        private final String lastComplianceStatusChecked;

    public String getLastComplianceStatusChecked() {
        return this.lastComplianceStatusChecked;
    }

    /**
     * Last reported guest configuration assignment report.
     * 
     */
    @InputImport(name="latestAssignmentReport")
        private final @Nullable AssignmentReportResponse latestAssignmentReport;

    public Optional<AssignmentReportResponse> getLatestAssignmentReport() {
        return this.latestAssignmentReport == null ? Optional.empty() : Optional.ofNullable(this.latestAssignmentReport);
    }

    /**
     * Id of the latest report for the guest configuration assignment.
     * 
     */
    @InputImport(name="latestReportId", required=true)
        private final String latestReportId;

    public String getLatestReportId() {
        return this.latestReportId;
    }

    /**
     * parameter hash for the guest configuration assignment.
     * 
     */
    @InputImport(name="parameterHash", required=true)
        private final String parameterHash;

    public String getParameterHash() {
        return this.parameterHash;
    }

    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    @InputImport(name="provisioningState", required=true)
        private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Type of the resource - VMSS / VM
     * 
     */
    @InputImport(name="resourceType", required=true)
        private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    /**
     * VM resource Id.
     * 
     */
    @InputImport(name="targetResourceId", required=true)
        private final String targetResourceId;

    public String getTargetResourceId() {
        return this.targetResourceId;
    }

    /**
     * The list of VM Compliance data for VMSS
     * 
     */
    @InputImport(name="vmssVMList")
        private final @Nullable List<VMSSVMInfoResponse> vmssVMList;

    public List<VMSSVMInfoResponse> getVmssVMList() {
        return this.vmssVMList == null ? List.of() : this.vmssVMList;
    }

    public GuestConfigurationAssignmentPropertiesResponse(
        String assignmentHash,
        String complianceStatus,
        @Nullable String context,
        @Nullable GuestConfigurationNavigationResponse guestConfiguration,
        String lastComplianceStatusChecked,
        @Nullable AssignmentReportResponse latestAssignmentReport,
        String latestReportId,
        String parameterHash,
        String provisioningState,
        String resourceType,
        String targetResourceId,
        @Nullable List<VMSSVMInfoResponse> vmssVMList) {
        this.assignmentHash = Objects.requireNonNull(assignmentHash, "expected parameter 'assignmentHash' to be non-null");
        this.complianceStatus = Objects.requireNonNull(complianceStatus, "expected parameter 'complianceStatus' to be non-null");
        this.context = context;
        this.guestConfiguration = guestConfiguration;
        this.lastComplianceStatusChecked = Objects.requireNonNull(lastComplianceStatusChecked, "expected parameter 'lastComplianceStatusChecked' to be non-null");
        this.latestAssignmentReport = latestAssignmentReport;
        this.latestReportId = Objects.requireNonNull(latestReportId, "expected parameter 'latestReportId' to be non-null");
        this.parameterHash = Objects.requireNonNull(parameterHash, "expected parameter 'parameterHash' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.targetResourceId = Objects.requireNonNull(targetResourceId, "expected parameter 'targetResourceId' to be non-null");
        this.vmssVMList = vmssVMList;
    }

    private GuestConfigurationAssignmentPropertiesResponse() {
        this.assignmentHash = null;
        this.complianceStatus = null;
        this.context = null;
        this.guestConfiguration = null;
        this.lastComplianceStatusChecked = null;
        this.latestAssignmentReport = null;
        this.latestReportId = null;
        this.parameterHash = null;
        this.provisioningState = null;
        this.resourceType = null;
        this.targetResourceId = null;
        this.vmssVMList = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestConfigurationAssignmentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assignmentHash;
        private String complianceStatus;
        private @Nullable String context;
        private @Nullable GuestConfigurationNavigationResponse guestConfiguration;
        private String lastComplianceStatusChecked;
        private @Nullable AssignmentReportResponse latestAssignmentReport;
        private String latestReportId;
        private String parameterHash;
        private String provisioningState;
        private String resourceType;
        private String targetResourceId;
        private @Nullable List<VMSSVMInfoResponse> vmssVMList;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestConfigurationAssignmentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignmentHash = defaults.assignmentHash;
    	      this.complianceStatus = defaults.complianceStatus;
    	      this.context = defaults.context;
    	      this.guestConfiguration = defaults.guestConfiguration;
    	      this.lastComplianceStatusChecked = defaults.lastComplianceStatusChecked;
    	      this.latestAssignmentReport = defaults.latestAssignmentReport;
    	      this.latestReportId = defaults.latestReportId;
    	      this.parameterHash = defaults.parameterHash;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceType = defaults.resourceType;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.vmssVMList = defaults.vmssVMList;
        }

        public Builder setAssignmentHash(String assignmentHash) {
            this.assignmentHash = Objects.requireNonNull(assignmentHash);
            return this;
        }

        public Builder setComplianceStatus(String complianceStatus) {
            this.complianceStatus = Objects.requireNonNull(complianceStatus);
            return this;
        }

        public Builder setContext(@Nullable String context) {
            this.context = context;
            return this;
        }

        public Builder setGuestConfiguration(@Nullable GuestConfigurationNavigationResponse guestConfiguration) {
            this.guestConfiguration = guestConfiguration;
            return this;
        }

        public Builder setLastComplianceStatusChecked(String lastComplianceStatusChecked) {
            this.lastComplianceStatusChecked = Objects.requireNonNull(lastComplianceStatusChecked);
            return this;
        }

        public Builder setLatestAssignmentReport(@Nullable AssignmentReportResponse latestAssignmentReport) {
            this.latestAssignmentReport = latestAssignmentReport;
            return this;
        }

        public Builder setLatestReportId(String latestReportId) {
            this.latestReportId = Objects.requireNonNull(latestReportId);
            return this;
        }

        public Builder setParameterHash(String parameterHash) {
            this.parameterHash = Objects.requireNonNull(parameterHash);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setTargetResourceId(String targetResourceId) {
            this.targetResourceId = Objects.requireNonNull(targetResourceId);
            return this;
        }

        public Builder setVmssVMList(@Nullable List<VMSSVMInfoResponse> vmssVMList) {
            this.vmssVMList = vmssVMList;
            return this;
        }
        public GuestConfigurationAssignmentPropertiesResponse build() {
            return new GuestConfigurationAssignmentPropertiesResponse(assignmentHash, complianceStatus, context, guestConfiguration, lastComplianceStatusChecked, latestAssignmentReport, latestReportId, parameterHash, provisioningState, resourceType, targetResourceId, vmssVMList);
        }
    }
}
