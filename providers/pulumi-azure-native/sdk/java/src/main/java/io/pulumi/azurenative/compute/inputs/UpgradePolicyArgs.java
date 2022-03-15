// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.UpgradeMode;
import io.pulumi.azurenative.compute.inputs.AutomaticOSUpgradePolicyArgs;
import io.pulumi.azurenative.compute.inputs.RollingUpgradePolicyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes an upgrade policy - automatic, manual, or rolling.
 * 
 */
public final class UpgradePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final UpgradePolicyArgs Empty = new UpgradePolicyArgs();

    /**
     * Configuration parameters used for performing automatic OS Upgrade.
     * 
     */
    @Import(name="automaticOSUpgradePolicy")
      private final @Nullable Output<AutomaticOSUpgradePolicyArgs> automaticOSUpgradePolicy;

    public Output<AutomaticOSUpgradePolicyArgs> getAutomaticOSUpgradePolicy() {
        return this.automaticOSUpgradePolicy == null ? Output.empty() : this.automaticOSUpgradePolicy;
    }

    /**
     * Specifies the mode of an upgrade to virtual machines in the scale set.<br /><br /> Possible values are:<br /><br /> **Manual** - You  control the application of updates to virtual machines in the scale set. You do this by using the manualUpgrade action.<br /><br /> **Automatic** - All virtual machines in the scale set are  automatically updated at the same time.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<UpgradeMode> mode;

    public Output<UpgradeMode> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    /**
     * The configuration parameters used while performing a rolling upgrade.
     * 
     */
    @Import(name="rollingUpgradePolicy")
      private final @Nullable Output<RollingUpgradePolicyArgs> rollingUpgradePolicy;

    public Output<RollingUpgradePolicyArgs> getRollingUpgradePolicy() {
        return this.rollingUpgradePolicy == null ? Output.empty() : this.rollingUpgradePolicy;
    }

    public UpgradePolicyArgs(
        @Nullable Output<AutomaticOSUpgradePolicyArgs> automaticOSUpgradePolicy,
        @Nullable Output<UpgradeMode> mode,
        @Nullable Output<RollingUpgradePolicyArgs> rollingUpgradePolicy) {
        this.automaticOSUpgradePolicy = automaticOSUpgradePolicy;
        this.mode = mode;
        this.rollingUpgradePolicy = rollingUpgradePolicy;
    }

    private UpgradePolicyArgs() {
        this.automaticOSUpgradePolicy = Output.empty();
        this.mode = Output.empty();
        this.rollingUpgradePolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AutomaticOSUpgradePolicyArgs> automaticOSUpgradePolicy;
        private @Nullable Output<UpgradeMode> mode;
        private @Nullable Output<RollingUpgradePolicyArgs> rollingUpgradePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticOSUpgradePolicy = defaults.automaticOSUpgradePolicy;
    	      this.mode = defaults.mode;
    	      this.rollingUpgradePolicy = defaults.rollingUpgradePolicy;
        }

        public Builder automaticOSUpgradePolicy(@Nullable Output<AutomaticOSUpgradePolicyArgs> automaticOSUpgradePolicy) {
            this.automaticOSUpgradePolicy = automaticOSUpgradePolicy;
            return this;
        }

        public Builder automaticOSUpgradePolicy(@Nullable AutomaticOSUpgradePolicyArgs automaticOSUpgradePolicy) {
            this.automaticOSUpgradePolicy = Output.ofNullable(automaticOSUpgradePolicy);
            return this;
        }

        public Builder mode(@Nullable Output<UpgradeMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable UpgradeMode mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }

        public Builder rollingUpgradePolicy(@Nullable Output<RollingUpgradePolicyArgs> rollingUpgradePolicy) {
            this.rollingUpgradePolicy = rollingUpgradePolicy;
            return this;
        }

        public Builder rollingUpgradePolicy(@Nullable RollingUpgradePolicyArgs rollingUpgradePolicy) {
            this.rollingUpgradePolicy = Output.ofNullable(rollingUpgradePolicy);
            return this;
        }
        public UpgradePolicyArgs build() {
            return new UpgradePolicyArgs(automaticOSUpgradePolicy, mode, rollingUpgradePolicy);
        }
    }
}
