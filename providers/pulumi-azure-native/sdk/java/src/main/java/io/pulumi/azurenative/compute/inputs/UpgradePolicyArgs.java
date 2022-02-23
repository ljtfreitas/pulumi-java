// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.UpgradeMode;
import io.pulumi.azurenative.compute.inputs.AutomaticOSUpgradePolicyArgs;
import io.pulumi.azurenative.compute.inputs.RollingUpgradePolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="automaticOSUpgradePolicy")
        private final @Nullable Input<AutomaticOSUpgradePolicyArgs> automaticOSUpgradePolicy;

    public Input<AutomaticOSUpgradePolicyArgs> getAutomaticOSUpgradePolicy() {
        return this.automaticOSUpgradePolicy == null ? Input.empty() : this.automaticOSUpgradePolicy;
    }

    /**
     * Specifies the mode of an upgrade to virtual machines in the scale set.<br /><br /> Possible values are:<br /><br /> **Manual** - You  control the application of updates to virtual machines in the scale set. You do this by using the manualUpgrade action.<br /><br /> **Automatic** - All virtual machines in the scale set are  automatically updated at the same time.
     * 
     */
    @InputImport(name="mode")
        private final @Nullable Input<UpgradeMode> mode;

    public Input<UpgradeMode> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * The configuration parameters used while performing a rolling upgrade.
     * 
     */
    @InputImport(name="rollingUpgradePolicy")
        private final @Nullable Input<RollingUpgradePolicyArgs> rollingUpgradePolicy;

    public Input<RollingUpgradePolicyArgs> getRollingUpgradePolicy() {
        return this.rollingUpgradePolicy == null ? Input.empty() : this.rollingUpgradePolicy;
    }

    public UpgradePolicyArgs(
        @Nullable Input<AutomaticOSUpgradePolicyArgs> automaticOSUpgradePolicy,
        @Nullable Input<UpgradeMode> mode,
        @Nullable Input<RollingUpgradePolicyArgs> rollingUpgradePolicy) {
        this.automaticOSUpgradePolicy = automaticOSUpgradePolicy;
        this.mode = mode;
        this.rollingUpgradePolicy = rollingUpgradePolicy;
    }

    private UpgradePolicyArgs() {
        this.automaticOSUpgradePolicy = Input.empty();
        this.mode = Input.empty();
        this.rollingUpgradePolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutomaticOSUpgradePolicyArgs> automaticOSUpgradePolicy;
        private @Nullable Input<UpgradeMode> mode;
        private @Nullable Input<RollingUpgradePolicyArgs> rollingUpgradePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticOSUpgradePolicy = defaults.automaticOSUpgradePolicy;
    	      this.mode = defaults.mode;
    	      this.rollingUpgradePolicy = defaults.rollingUpgradePolicy;
        }

        public Builder setAutomaticOSUpgradePolicy(@Nullable Input<AutomaticOSUpgradePolicyArgs> automaticOSUpgradePolicy) {
            this.automaticOSUpgradePolicy = automaticOSUpgradePolicy;
            return this;
        }

        public Builder setAutomaticOSUpgradePolicy(@Nullable AutomaticOSUpgradePolicyArgs automaticOSUpgradePolicy) {
            this.automaticOSUpgradePolicy = Input.ofNullable(automaticOSUpgradePolicy);
            return this;
        }

        public Builder setMode(@Nullable Input<UpgradeMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable UpgradeMode mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setRollingUpgradePolicy(@Nullable Input<RollingUpgradePolicyArgs> rollingUpgradePolicy) {
            this.rollingUpgradePolicy = rollingUpgradePolicy;
            return this;
        }

        public Builder setRollingUpgradePolicy(@Nullable RollingUpgradePolicyArgs rollingUpgradePolicy) {
            this.rollingUpgradePolicy = Input.ofNullable(rollingUpgradePolicy);
            return this;
        }
        public UpgradePolicyArgs build() {
            return new UpgradePolicyArgs(automaticOSUpgradePolicy, mode, rollingUpgradePolicy);
        }
    }
}
