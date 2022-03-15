// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information about VMSS VM
 * 
 */
public final class VMSSVMInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final VMSSVMInfoResponse Empty = new VMSSVMInfoResponse();

    /**
     * A value indicating compliance status of the machine for the assigned guest configuration.
     * 
     */
    @Import(name="complianceStatus", required=true)
      private final String complianceStatus;

    public String getComplianceStatus() {
        return this.complianceStatus;
    }

    /**
     * Date and time when last compliance status was checked.
     * 
     */
    @Import(name="lastComplianceChecked", required=true)
      private final String lastComplianceChecked;

    public String getLastComplianceChecked() {
        return this.lastComplianceChecked;
    }

    /**
     * Id of the latest report for the guest configuration assignment.
     * 
     */
    @Import(name="latestReportId", required=true)
      private final String latestReportId;

    public String getLatestReportId() {
        return this.latestReportId;
    }

    /**
     * UUID of the VM.
     * 
     */
    @Import(name="vmId", required=true)
      private final String vmId;

    public String getVmId() {
        return this.vmId;
    }

    /**
     * Azure resource Id of the VM.
     * 
     */
    @Import(name="vmResourceId", required=true)
      private final String vmResourceId;

    public String getVmResourceId() {
        return this.vmResourceId;
    }

    public VMSSVMInfoResponse(
        String complianceStatus,
        String lastComplianceChecked,
        String latestReportId,
        String vmId,
        String vmResourceId) {
        this.complianceStatus = Objects.requireNonNull(complianceStatus, "expected parameter 'complianceStatus' to be non-null");
        this.lastComplianceChecked = Objects.requireNonNull(lastComplianceChecked, "expected parameter 'lastComplianceChecked' to be non-null");
        this.latestReportId = Objects.requireNonNull(latestReportId, "expected parameter 'latestReportId' to be non-null");
        this.vmId = Objects.requireNonNull(vmId, "expected parameter 'vmId' to be non-null");
        this.vmResourceId = Objects.requireNonNull(vmResourceId, "expected parameter 'vmResourceId' to be non-null");
    }

    private VMSSVMInfoResponse() {
        this.complianceStatus = null;
        this.lastComplianceChecked = null;
        this.latestReportId = null;
        this.vmId = null;
        this.vmResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMSSVMInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String complianceStatus;
        private String lastComplianceChecked;
        private String latestReportId;
        private String vmId;
        private String vmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VMSSVMInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceStatus = defaults.complianceStatus;
    	      this.lastComplianceChecked = defaults.lastComplianceChecked;
    	      this.latestReportId = defaults.latestReportId;
    	      this.vmId = defaults.vmId;
    	      this.vmResourceId = defaults.vmResourceId;
        }

        public Builder complianceStatus(String complianceStatus) {
            this.complianceStatus = Objects.requireNonNull(complianceStatus);
            return this;
        }

        public Builder lastComplianceChecked(String lastComplianceChecked) {
            this.lastComplianceChecked = Objects.requireNonNull(lastComplianceChecked);
            return this;
        }

        public Builder latestReportId(String latestReportId) {
            this.latestReportId = Objects.requireNonNull(latestReportId);
            return this;
        }

        public Builder vmId(String vmId) {
            this.vmId = Objects.requireNonNull(vmId);
            return this;
        }

        public Builder vmResourceId(String vmResourceId) {
            this.vmResourceId = Objects.requireNonNull(vmResourceId);
            return this;
        }
        public VMSSVMInfoResponse build() {
            return new VMSSVMInfoResponse(complianceStatus, lastComplianceChecked, latestReportId, vmId, vmResourceId);
        }
    }
}
