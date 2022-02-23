// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.AutomaticOSUpgradePolicyResponse;
import io.pulumi.azurenative.compute.outputs.RollingUpgradePolicyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UpgradePolicyResponse {
    /**
     * Configuration parameters used for performing automatic OS Upgrade.
     * 
     */
    private final @Nullable AutomaticOSUpgradePolicyResponse automaticOSUpgradePolicy;
    /**
     * Specifies the mode of an upgrade to virtual machines in the scale set.<br /><br /> Possible values are:<br /><br /> **Manual** - You  control the application of updates to virtual machines in the scale set. You do this by using the manualUpgrade action.<br /><br /> **Automatic** - All virtual machines in the scale set are  automatically updated at the same time.
     * 
     */
    private final @Nullable String mode;
    /**
     * The configuration parameters used while performing a rolling upgrade.
     * 
     */
    private final @Nullable RollingUpgradePolicyResponse rollingUpgradePolicy;

    @OutputCustomType.Constructor({"automaticOSUpgradePolicy","mode","rollingUpgradePolicy"})
    private UpgradePolicyResponse(
        @Nullable AutomaticOSUpgradePolicyResponse automaticOSUpgradePolicy,
        @Nullable String mode,
        @Nullable RollingUpgradePolicyResponse rollingUpgradePolicy) {
        this.automaticOSUpgradePolicy = automaticOSUpgradePolicy;
        this.mode = mode;
        this.rollingUpgradePolicy = rollingUpgradePolicy;
    }

    /**
     * Configuration parameters used for performing automatic OS Upgrade.
     * 
     */
    public Optional<AutomaticOSUpgradePolicyResponse> getAutomaticOSUpgradePolicy() {
        return Optional.ofNullable(this.automaticOSUpgradePolicy);
    }
    /**
     * Specifies the mode of an upgrade to virtual machines in the scale set.<br /><br /> Possible values are:<br /><br /> **Manual** - You  control the application of updates to virtual machines in the scale set. You do this by using the manualUpgrade action.<br /><br /> **Automatic** - All virtual machines in the scale set are  automatically updated at the same time.
     * 
     */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * The configuration parameters used while performing a rolling upgrade.
     * 
     */
    public Optional<RollingUpgradePolicyResponse> getRollingUpgradePolicy() {
        return Optional.ofNullable(this.rollingUpgradePolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutomaticOSUpgradePolicyResponse automaticOSUpgradePolicy;
        private @Nullable String mode;
        private @Nullable RollingUpgradePolicyResponse rollingUpgradePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticOSUpgradePolicy = defaults.automaticOSUpgradePolicy;
    	      this.mode = defaults.mode;
    	      this.rollingUpgradePolicy = defaults.rollingUpgradePolicy;
        }

        public Builder setAutomaticOSUpgradePolicy(@Nullable AutomaticOSUpgradePolicyResponse automaticOSUpgradePolicy) {
            this.automaticOSUpgradePolicy = automaticOSUpgradePolicy;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setRollingUpgradePolicy(@Nullable RollingUpgradePolicyResponse rollingUpgradePolicy) {
            this.rollingUpgradePolicy = rollingUpgradePolicy;
            return this;
        }
        public UpgradePolicyResponse build() {
            return new UpgradePolicyResponse(automaticOSUpgradePolicy, mode, rollingUpgradePolicy);
        }
    }
}
