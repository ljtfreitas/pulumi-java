// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * A set of Shielded VM options.
 * 
 */
public final class ShieldedVmConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ShieldedVmConfigResponse Empty = new ShieldedVmConfigResponse();

    /**
     * Defines whether the instance has integrity monitoring enabled.
     * 
     */
    @Import(name="enableIntegrityMonitoring", required=true)
      private final Boolean enableIntegrityMonitoring;

    public Boolean getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }

    /**
     * Defines whether the instance has Secure Boot enabled.
     * 
     */
    @Import(name="enableSecureBoot", required=true)
      private final Boolean enableSecureBoot;

    public Boolean getEnableSecureBoot() {
        return this.enableSecureBoot;
    }

    /**
     * Defines whether the instance has the vTPM enabled.
     * 
     */
    @Import(name="enableVtpm", required=true)
      private final Boolean enableVtpm;

    public Boolean getEnableVtpm() {
        return this.enableVtpm;
    }

    public ShieldedVmConfigResponse(
        Boolean enableIntegrityMonitoring,
        Boolean enableSecureBoot,
        Boolean enableVtpm) {
        this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring, "expected parameter 'enableIntegrityMonitoring' to be non-null");
        this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot, "expected parameter 'enableSecureBoot' to be non-null");
        this.enableVtpm = Objects.requireNonNull(enableVtpm, "expected parameter 'enableVtpm' to be non-null");
    }

    private ShieldedVmConfigResponse() {
        this.enableIntegrityMonitoring = null;
        this.enableSecureBoot = null;
        this.enableVtpm = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShieldedVmConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableIntegrityMonitoring;
        private Boolean enableSecureBoot;
        private Boolean enableVtpm;

        public Builder() {
    	      // Empty
        }

        public Builder(ShieldedVmConfigResponse defaults) {
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
        public ShieldedVmConfigResponse build() {
            return new ShieldedVmConfigResponse(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
        }
    }
}
