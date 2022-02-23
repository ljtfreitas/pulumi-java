// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ShieldedInstanceConfigResponse {
    /**
     * Defines whether the instance has integrity monitoring enabled. Enabled by default.
     * 
     */
    private final Boolean enableIntegrityMonitoring;
    /**
     * Defines whether the instance has Secure Boot enabled. Disabled by default.
     * 
     */
    private final Boolean enableSecureBoot;
    /**
     * Defines whether the instance has the vTPM enabled. Enabled by default.
     * 
     */
    private final Boolean enableVtpm;

    @OutputCustomType.Constructor({"enableIntegrityMonitoring","enableSecureBoot","enableVtpm"})
    private ShieldedInstanceConfigResponse(
        Boolean enableIntegrityMonitoring,
        Boolean enableSecureBoot,
        Boolean enableVtpm) {
        this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring);
        this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot);
        this.enableVtpm = Objects.requireNonNull(enableVtpm);
    }

    /**
     * Defines whether the instance has integrity monitoring enabled. Enabled by default.
     * 
     */
    public Boolean getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }
    /**
     * Defines whether the instance has Secure Boot enabled. Disabled by default.
     * 
     */
    public Boolean getEnableSecureBoot() {
        return this.enableSecureBoot;
    }
    /**
     * Defines whether the instance has the vTPM enabled. Enabled by default.
     * 
     */
    public Boolean getEnableVtpm() {
        return this.enableVtpm;
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

        public Builder setEnableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring);
            return this;
        }

        public Builder setEnableSecureBoot(Boolean enableSecureBoot) {
            this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot);
            return this;
        }

        public Builder setEnableVtpm(Boolean enableVtpm) {
            this.enableVtpm = Objects.requireNonNull(enableVtpm);
            return this;
        }
        public ShieldedInstanceConfigResponse build() {
            return new ShieldedInstanceConfigResponse(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
        }
    }
}
