// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ShieldedVmConfigResponse {
    /**
     * Defines whether the instance has integrity monitoring enabled.
     * 
     */
    private final Boolean enableIntegrityMonitoring;
    /**
     * Defines whether the instance has Secure Boot enabled.
     * 
     */
    private final Boolean enableSecureBoot;
    /**
     * Defines whether the instance has the vTPM enabled.
     * 
     */
    private final Boolean enableVtpm;

    @CustomType.Constructor
    private ShieldedVmConfigResponse(
        @CustomType.Parameter("enableIntegrityMonitoring") Boolean enableIntegrityMonitoring,
        @CustomType.Parameter("enableSecureBoot") Boolean enableSecureBoot,
        @CustomType.Parameter("enableVtpm") Boolean enableVtpm) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
        this.enableVtpm = enableVtpm;
    }

    /**
     * Defines whether the instance has integrity monitoring enabled.
     * 
    */
    public Boolean getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }
    /**
     * Defines whether the instance has Secure Boot enabled.
     * 
    */
    public Boolean getEnableSecureBoot() {
        return this.enableSecureBoot;
    }
    /**
     * Defines whether the instance has the vTPM enabled.
     * 
    */
    public Boolean getEnableVtpm() {
        return this.enableVtpm;
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
