// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceFromMachineImageShieldedInstanceConfig {
    private final @Nullable Boolean enableIntegrityMonitoring;
    private final @Nullable Boolean enableSecureBoot;
    private final @Nullable Boolean enableVtpm;

    @OutputCustomType.Constructor({"enableIntegrityMonitoring","enableSecureBoot","enableVtpm"})
    private InstanceFromMachineImageShieldedInstanceConfig(
        @Nullable Boolean enableIntegrityMonitoring,
        @Nullable Boolean enableSecureBoot,
        @Nullable Boolean enableVtpm) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
        this.enableVtpm = enableVtpm;
    }

    public Optional<Boolean> getEnableIntegrityMonitoring() {
        return Optional.ofNullable(this.enableIntegrityMonitoring);
    }
    public Optional<Boolean> getEnableSecureBoot() {
        return Optional.ofNullable(this.enableSecureBoot);
    }
    public Optional<Boolean> getEnableVtpm() {
        return Optional.ofNullable(this.enableVtpm);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromMachineImageShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableIntegrityMonitoring;
        private @Nullable Boolean enableSecureBoot;
        private @Nullable Boolean enableVtpm;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromMachineImageShieldedInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        public Builder setEnableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        public Builder setEnableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }

        public Builder setEnableVtpm(@Nullable Boolean enableVtpm) {
            this.enableVtpm = enableVtpm;
            return this;
        }
        public InstanceFromMachineImageShieldedInstanceConfig build() {
            return new InstanceFromMachineImageShieldedInstanceConfig(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
        }
    }
}
