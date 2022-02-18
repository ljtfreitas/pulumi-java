// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.AutomaticOSUpgradePolicyResponse;
import io.pulumi.azurenative.compute.inputs.RollingUpgradePolicyResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an upgrade policy - automatic, manual, or rolling.
 * 
 */
public final class UpgradePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final UpgradePolicyResponse Empty = new UpgradePolicyResponse();

    /**
     * Configuration parameters used for performing automatic OS Upgrade.
     * 
     */
    @InputImport(name="automaticOSUpgradePolicy")
    private final @Nullable AutomaticOSUpgradePolicyResponse automaticOSUpgradePolicy;

    public Optional<AutomaticOSUpgradePolicyResponse> getAutomaticOSUpgradePolicy() {
        return this.automaticOSUpgradePolicy == null ? Optional.empty() : Optional.ofNullable(this.automaticOSUpgradePolicy);
    }

    /**
     * Specifies the mode of an upgrade to virtual machines in the scale set.<br /><br /> Possible values are:<br /><br /> **Manual** - You  control the application of updates to virtual machines in the scale set. You do this by using the manualUpgrade action.<br /><br /> **Automatic** - All virtual machines in the scale set are  automatically updated at the same time.
     * 
     */
    @InputImport(name="mode")
    private final @Nullable String mode;

    public Optional<String> getMode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    /**
     * The configuration parameters used while performing a rolling upgrade.
     * 
     */
    @InputImport(name="rollingUpgradePolicy")
    private final @Nullable RollingUpgradePolicyResponse rollingUpgradePolicy;

    public Optional<RollingUpgradePolicyResponse> getRollingUpgradePolicy() {
        return this.rollingUpgradePolicy == null ? Optional.empty() : Optional.ofNullable(this.rollingUpgradePolicy);
    }

    public UpgradePolicyResponse(
        @Nullable AutomaticOSUpgradePolicyResponse automaticOSUpgradePolicy,
        @Nullable String mode,
        @Nullable RollingUpgradePolicyResponse rollingUpgradePolicy) {
        this.automaticOSUpgradePolicy = automaticOSUpgradePolicy;
        this.mode = mode;
        this.rollingUpgradePolicy = rollingUpgradePolicy;
    }

    private UpgradePolicyResponse() {
        this.automaticOSUpgradePolicy = null;
        this.mode = null;
        this.rollingUpgradePolicy = null;
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
