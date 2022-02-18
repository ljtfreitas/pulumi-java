// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.enums.RollingUpgradeMode;
import io.pulumi.azurenative.servicefabric.inputs.ArmApplicationHealthPolicyArgs;
import io.pulumi.azurenative.servicefabric.inputs.ArmRollingUpgradeMonitoringPolicyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the policy for a monitored application upgrade.
 * 
 */
public final class ApplicationUpgradePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationUpgradePolicyArgs Empty = new ApplicationUpgradePolicyArgs();

    /**
     * Defines a health policy used to evaluate the health of an application or one of its children entities.
     * 
     */
    @InputImport(name="applicationHealthPolicy")
    private final @Nullable Input<ArmApplicationHealthPolicyArgs> applicationHealthPolicy;

    public Input<ArmApplicationHealthPolicyArgs> getApplicationHealthPolicy() {
        return this.applicationHealthPolicy == null ? Input.empty() : this.applicationHealthPolicy;
    }

    /**
     * If true, then processes are forcefully restarted during upgrade even when the code version has not changed (the upgrade only changes configuration or data).
     * 
     */
    @InputImport(name="forceRestart")
    private final @Nullable Input<Boolean> forceRestart;

    public Input<Boolean> getForceRestart() {
        return this.forceRestart == null ? Input.empty() : this.forceRestart;
    }

    /**
     * Determines whether the application should be recreated on update. If value=true, the rest of the upgrade policy parameters are not allowed and it will result in availability loss.
     * 
     */
    @InputImport(name="recreateApplication")
    private final @Nullable Input<Boolean> recreateApplication;

    public Input<Boolean> getRecreateApplication() {
        return this.recreateApplication == null ? Input.empty() : this.recreateApplication;
    }

    /**
     * The policy used for monitoring the application upgrade
     * 
     */
    @InputImport(name="rollingUpgradeMonitoringPolicy")
    private final @Nullable Input<ArmRollingUpgradeMonitoringPolicyArgs> rollingUpgradeMonitoringPolicy;

    public Input<ArmRollingUpgradeMonitoringPolicyArgs> getRollingUpgradeMonitoringPolicy() {
        return this.rollingUpgradeMonitoringPolicy == null ? Input.empty() : this.rollingUpgradeMonitoringPolicy;
    }

    /**
     * The mode used to monitor health during a rolling upgrade. The values are UnmonitoredAuto, UnmonitoredManual, and Monitored.
     * 
     */
    @InputImport(name="upgradeMode")
    private final @Nullable Input<Either<String,RollingUpgradeMode>> upgradeMode;

    public Input<Either<String,RollingUpgradeMode>> getUpgradeMode() {
        return this.upgradeMode == null ? Input.empty() : this.upgradeMode;
    }

    /**
     * The maximum amount of time to block processing of an upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires, processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     * 
     */
    @InputImport(name="upgradeReplicaSetCheckTimeout")
    private final @Nullable Input<String> upgradeReplicaSetCheckTimeout;

    public Input<String> getUpgradeReplicaSetCheckTimeout() {
        return this.upgradeReplicaSetCheckTimeout == null ? Input.empty() : this.upgradeReplicaSetCheckTimeout;
    }

    public ApplicationUpgradePolicyArgs(
        @Nullable Input<ArmApplicationHealthPolicyArgs> applicationHealthPolicy,
        @Nullable Input<Boolean> forceRestart,
        @Nullable Input<Boolean> recreateApplication,
        @Nullable Input<ArmRollingUpgradeMonitoringPolicyArgs> rollingUpgradeMonitoringPolicy,
        @Nullable Input<Either<String,RollingUpgradeMode>> upgradeMode,
        @Nullable Input<String> upgradeReplicaSetCheckTimeout) {
        this.applicationHealthPolicy = applicationHealthPolicy;
        this.forceRestart = forceRestart;
        this.recreateApplication = recreateApplication;
        this.rollingUpgradeMonitoringPolicy = rollingUpgradeMonitoringPolicy;
        this.upgradeMode = upgradeMode;
        this.upgradeReplicaSetCheckTimeout = upgradeReplicaSetCheckTimeout;
    }

    private ApplicationUpgradePolicyArgs() {
        this.applicationHealthPolicy = Input.empty();
        this.forceRestart = Input.empty();
        this.recreateApplication = Input.empty();
        this.rollingUpgradeMonitoringPolicy = Input.empty();
        this.upgradeMode = Input.empty();
        this.upgradeReplicaSetCheckTimeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationUpgradePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ArmApplicationHealthPolicyArgs> applicationHealthPolicy;
        private @Nullable Input<Boolean> forceRestart;
        private @Nullable Input<Boolean> recreateApplication;
        private @Nullable Input<ArmRollingUpgradeMonitoringPolicyArgs> rollingUpgradeMonitoringPolicy;
        private @Nullable Input<Either<String,RollingUpgradeMode>> upgradeMode;
        private @Nullable Input<String> upgradeReplicaSetCheckTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationUpgradePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationHealthPolicy = defaults.applicationHealthPolicy;
    	      this.forceRestart = defaults.forceRestart;
    	      this.recreateApplication = defaults.recreateApplication;
    	      this.rollingUpgradeMonitoringPolicy = defaults.rollingUpgradeMonitoringPolicy;
    	      this.upgradeMode = defaults.upgradeMode;
    	      this.upgradeReplicaSetCheckTimeout = defaults.upgradeReplicaSetCheckTimeout;
        }

        public Builder setApplicationHealthPolicy(@Nullable Input<ArmApplicationHealthPolicyArgs> applicationHealthPolicy) {
            this.applicationHealthPolicy = applicationHealthPolicy;
            return this;
        }

        public Builder setApplicationHealthPolicy(@Nullable ArmApplicationHealthPolicyArgs applicationHealthPolicy) {
            this.applicationHealthPolicy = Input.ofNullable(applicationHealthPolicy);
            return this;
        }

        public Builder setForceRestart(@Nullable Input<Boolean> forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }

        public Builder setForceRestart(@Nullable Boolean forceRestart) {
            this.forceRestart = Input.ofNullable(forceRestart);
            return this;
        }

        public Builder setRecreateApplication(@Nullable Input<Boolean> recreateApplication) {
            this.recreateApplication = recreateApplication;
            return this;
        }

        public Builder setRecreateApplication(@Nullable Boolean recreateApplication) {
            this.recreateApplication = Input.ofNullable(recreateApplication);
            return this;
        }

        public Builder setRollingUpgradeMonitoringPolicy(@Nullable Input<ArmRollingUpgradeMonitoringPolicyArgs> rollingUpgradeMonitoringPolicy) {
            this.rollingUpgradeMonitoringPolicy = rollingUpgradeMonitoringPolicy;
            return this;
        }

        public Builder setRollingUpgradeMonitoringPolicy(@Nullable ArmRollingUpgradeMonitoringPolicyArgs rollingUpgradeMonitoringPolicy) {
            this.rollingUpgradeMonitoringPolicy = Input.ofNullable(rollingUpgradeMonitoringPolicy);
            return this;
        }

        public Builder setUpgradeMode(@Nullable Input<Either<String,RollingUpgradeMode>> upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }

        public Builder setUpgradeMode(@Nullable Either<String,RollingUpgradeMode> upgradeMode) {
            this.upgradeMode = Input.ofNullable(upgradeMode);
            return this;
        }

        public Builder setUpgradeReplicaSetCheckTimeout(@Nullable Input<String> upgradeReplicaSetCheckTimeout) {
            this.upgradeReplicaSetCheckTimeout = upgradeReplicaSetCheckTimeout;
            return this;
        }

        public Builder setUpgradeReplicaSetCheckTimeout(@Nullable String upgradeReplicaSetCheckTimeout) {
            this.upgradeReplicaSetCheckTimeout = Input.ofNullable(upgradeReplicaSetCheckTimeout);
            return this;
        }

        public ApplicationUpgradePolicyArgs build() {
            return new ApplicationUpgradePolicyArgs(applicationHealthPolicy, forceRestart, recreateApplication, rollingUpgradeMonitoringPolicy, upgradeMode, upgradeReplicaSetCheckTimeout);
        }
    }
}
