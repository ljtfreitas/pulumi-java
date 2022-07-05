// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A set of Shielded Instance options.
 * 
 */
public final class ShieldedInstanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShieldedInstanceConfigArgs Empty = new ShieldedInstanceConfigArgs();

    /**
     * Defines whether the instance has integrity monitoring enabled. Enabled by default.
     * 
     */
    @Import(name="enableIntegrityMonitoring")
    private @Nullable Output<Boolean> enableIntegrityMonitoring;

    /**
     * @return Defines whether the instance has integrity monitoring enabled. Enabled by default.
     * 
     */
    public Optional<Output<Boolean>> enableIntegrityMonitoring() {
        return Optional.ofNullable(this.enableIntegrityMonitoring);
    }

    /**
     * Defines whether the instance has Secure Boot enabled. Disabled by default.
     * 
     */
    @Import(name="enableSecureBoot")
    private @Nullable Output<Boolean> enableSecureBoot;

    /**
     * @return Defines whether the instance has Secure Boot enabled. Disabled by default.
     * 
     */
    public Optional<Output<Boolean>> enableSecureBoot() {
        return Optional.ofNullable(this.enableSecureBoot);
    }

    /**
     * Defines whether the instance has the vTPM enabled. Enabled by default.
     * 
     */
    @Import(name="enableVtpm")
    private @Nullable Output<Boolean> enableVtpm;

    /**
     * @return Defines whether the instance has the vTPM enabled. Enabled by default.
     * 
     */
    public Optional<Output<Boolean>> enableVtpm() {
        return Optional.ofNullable(this.enableVtpm);
    }

    private ShieldedInstanceConfigArgs() {}

    private ShieldedInstanceConfigArgs(ShieldedInstanceConfigArgs $) {
        this.enableIntegrityMonitoring = $.enableIntegrityMonitoring;
        this.enableSecureBoot = $.enableSecureBoot;
        this.enableVtpm = $.enableVtpm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShieldedInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShieldedInstanceConfigArgs $;

        public Builder() {
            $ = new ShieldedInstanceConfigArgs();
        }

        public Builder(ShieldedInstanceConfigArgs defaults) {
            $ = new ShieldedInstanceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableIntegrityMonitoring Defines whether the instance has integrity monitoring enabled. Enabled by default.
         * 
         * @return builder
         * 
         */
        public Builder enableIntegrityMonitoring(@Nullable Output<Boolean> enableIntegrityMonitoring) {
            $.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        /**
         * @param enableIntegrityMonitoring Defines whether the instance has integrity monitoring enabled. Enabled by default.
         * 
         * @return builder
         * 
         */
        public Builder enableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            return enableIntegrityMonitoring(Output.of(enableIntegrityMonitoring));
        }

        /**
         * @param enableSecureBoot Defines whether the instance has Secure Boot enabled. Disabled by default.
         * 
         * @return builder
         * 
         */
        public Builder enableSecureBoot(@Nullable Output<Boolean> enableSecureBoot) {
            $.enableSecureBoot = enableSecureBoot;
            return this;
        }

        /**
         * @param enableSecureBoot Defines whether the instance has Secure Boot enabled. Disabled by default.
         * 
         * @return builder
         * 
         */
        public Builder enableSecureBoot(Boolean enableSecureBoot) {
            return enableSecureBoot(Output.of(enableSecureBoot));
        }

        /**
         * @param enableVtpm Defines whether the instance has the vTPM enabled. Enabled by default.
         * 
         * @return builder
         * 
         */
        public Builder enableVtpm(@Nullable Output<Boolean> enableVtpm) {
            $.enableVtpm = enableVtpm;
            return this;
        }

        /**
         * @param enableVtpm Defines whether the instance has the vTPM enabled. Enabled by default.
         * 
         * @return builder
         * 
         */
        public Builder enableVtpm(Boolean enableVtpm) {
            return enableVtpm(Output.of(enableVtpm));
        }

        public ShieldedInstanceConfigArgs build() {
            return $;
        }
    }

}
