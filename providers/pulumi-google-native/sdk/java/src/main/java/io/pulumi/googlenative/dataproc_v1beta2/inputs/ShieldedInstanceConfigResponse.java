// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Shielded Instance Config for clusters using Compute Engine Shielded VMs (https://cloud.google.com/security/shielded-cloud/shielded-vm).
 * 
 */
public final class ShieldedInstanceConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ShieldedInstanceConfigResponse Empty = new ShieldedInstanceConfigResponse();

    /**
     * Optional. Defines whether instances have integrity monitoring enabled.
     * 
     */
    @Import(name="enableIntegrityMonitoring", required=true)
      private final Boolean enableIntegrityMonitoring;

    public Boolean getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }

    /**
     * Optional. Defines whether instances have Secure Boot enabled.
     * 
     */
    @Import(name="enableSecureBoot", required=true)
      private final Boolean enableSecureBoot;

    public Boolean getEnableSecureBoot() {
        return this.enableSecureBoot;
    }

    /**
     * Optional. Defines whether instances have the vTPM enabled.
     * 
     */
    @Import(name="enableVtpm", required=true)
      private final Boolean enableVtpm;

    public Boolean getEnableVtpm() {
        return this.enableVtpm;
    }

    public ShieldedInstanceConfigResponse(
        Boolean enableIntegrityMonitoring,
        Boolean enableSecureBoot,
        Boolean enableVtpm) {
        this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring, "expected parameter 'enableIntegrityMonitoring' to be non-null");
        this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot, "expected parameter 'enableSecureBoot' to be non-null");
        this.enableVtpm = Objects.requireNonNull(enableVtpm, "expected parameter 'enableVtpm' to be non-null");
    }

    private ShieldedInstanceConfigResponse() {
        this.enableIntegrityMonitoring = null;
        this.enableSecureBoot = null;
        this.enableVtpm = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShieldedInstanceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableIntegrityMonitoring;
        private Boolean enableSecureBoot;
        private Boolean enableVtpm;

        public Builder() {
    	      // Empty
        }

        public Builder(ShieldedInstanceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        public Builder enableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring);
            return this;
        }

        public Builder enableSecureBoot(Boolean enableSecureBoot) {
            this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot);
            return this;
        }

        public Builder enableVtpm(Boolean enableVtpm) {
            this.enableVtpm = Objects.requireNonNull(enableVtpm);
            return this;
        }
        public ShieldedInstanceConfigResponse build() {
            return new ShieldedInstanceConfigResponse(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
        }
    }
}
