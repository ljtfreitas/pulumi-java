// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A set of Shielded Instance options.
 * 
 */
public final class ShieldedInstanceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ShieldedInstanceConfigArgs Empty = new ShieldedInstanceConfigArgs();

    /**
     * Defines whether the instance has integrity monitoring enabled. Enabled by default.
     * 
     */
    @Import(name="enableIntegrityMonitoring")
      private final @Nullable Output<Boolean> enableIntegrityMonitoring;

    public Output<Boolean> getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring == null ? Output.empty() : this.enableIntegrityMonitoring;
    }

    /**
     * Defines whether the instance has Secure Boot enabled. Disabled by default.
     * 
     */
    @Import(name="enableSecureBoot")
      private final @Nullable Output<Boolean> enableSecureBoot;

    public Output<Boolean> getEnableSecureBoot() {
        return this.enableSecureBoot == null ? Output.empty() : this.enableSecureBoot;
    }

    /**
     * Defines whether the instance has the vTPM enabled. Enabled by default.
     * 
     */
    @Import(name="enableVtpm")
      private final @Nullable Output<Boolean> enableVtpm;

    public Output<Boolean> getEnableVtpm() {
        return this.enableVtpm == null ? Output.empty() : this.enableVtpm;
    }

    public ShieldedInstanceConfigArgs(
        @Nullable Output<Boolean> enableIntegrityMonitoring,
        @Nullable Output<Boolean> enableSecureBoot,
        @Nullable Output<Boolean> enableVtpm) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
        this.enableVtpm = enableVtpm;
    }

    private ShieldedInstanceConfigArgs() {
        this.enableIntegrityMonitoring = Output.empty();
        this.enableSecureBoot = Output.empty();
        this.enableVtpm = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShieldedInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableIntegrityMonitoring;
        private @Nullable Output<Boolean> enableSecureBoot;
        private @Nullable Output<Boolean> enableVtpm;

        public Builder() {
    	      // Empty
        }

        public Builder(ShieldedInstanceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        public Builder enableIntegrityMonitoring(@Nullable Output<Boolean> enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        public Builder enableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Output.ofNullable(enableIntegrityMonitoring);
            return this;
        }

        public Builder enableSecureBoot(@Nullable Output<Boolean> enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }

        public Builder enableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = Output.ofNullable(enableSecureBoot);
            return this;
        }

        public Builder enableVtpm(@Nullable Output<Boolean> enableVtpm) {
            this.enableVtpm = enableVtpm;
            return this;
        }

        public Builder enableVtpm(@Nullable Boolean enableVtpm) {
            this.enableVtpm = Output.ofNullable(enableVtpm);
            return this;
        }
        public ShieldedInstanceConfigArgs build() {
            return new ShieldedInstanceConfigArgs(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
        }
    }
}
