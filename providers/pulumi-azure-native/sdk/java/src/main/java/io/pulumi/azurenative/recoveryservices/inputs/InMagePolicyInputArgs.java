// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.SetMultiVmSyncStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VMWare Azure specific protection profile Input.
 * 
 */
public final class InMagePolicyInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final InMagePolicyInputArgs Empty = new InMagePolicyInputArgs();

    /**
     * The app consistent snapshot frequency (in minutes).
     * 
     */
    @Import(name="appConsistentFrequencyInMinutes")
      private final @Nullable Output<Integer> appConsistentFrequencyInMinutes;

    public Output<Integer> getAppConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes == null ? Output.empty() : this.appConsistentFrequencyInMinutes;
    }

    /**
     * The class type.
     * Expected value is 'InMage'.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Output.empty() : this.instanceType;
    }

    /**
     * A value indicating whether multi-VM sync has to be enabled. Value should be 'Enabled' or 'Disabled'.
     * 
     */
    @Import(name="multiVmSyncStatus", required=true)
      private final Output<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus;

    public Output<Either<String,SetMultiVmSyncStatus>> getMultiVmSyncStatus() {
        return this.multiVmSyncStatus;
    }

    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
     */
    @Import(name="recoveryPointHistory")
      private final @Nullable Output<Integer> recoveryPointHistory;

    public Output<Integer> getRecoveryPointHistory() {
        return this.recoveryPointHistory == null ? Output.empty() : this.recoveryPointHistory;
    }

    /**
     * The recovery point threshold in minutes.
     * 
     */
    @Import(name="recoveryPointThresholdInMinutes")
      private final @Nullable Output<Integer> recoveryPointThresholdInMinutes;

    public Output<Integer> getRecoveryPointThresholdInMinutes() {
        return this.recoveryPointThresholdInMinutes == null ? Output.empty() : this.recoveryPointThresholdInMinutes;
    }

    public InMagePolicyInputArgs(
        @Nullable Output<Integer> appConsistentFrequencyInMinutes,
        @Nullable Output<String> instanceType,
        Output<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus,
        @Nullable Output<Integer> recoveryPointHistory,
        @Nullable Output<Integer> recoveryPointThresholdInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        this.instanceType = instanceType;
        this.multiVmSyncStatus = Objects.requireNonNull(multiVmSyncStatus, "expected parameter 'multiVmSyncStatus' to be non-null");
        this.recoveryPointHistory = recoveryPointHistory;
        this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
    }

    private InMagePolicyInputArgs() {
        this.appConsistentFrequencyInMinutes = Output.empty();
        this.instanceType = Output.empty();
        this.multiVmSyncStatus = Output.empty();
        this.recoveryPointHistory = Output.empty();
        this.recoveryPointThresholdInMinutes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMagePolicyInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> appConsistentFrequencyInMinutes;
        private @Nullable Output<String> instanceType;
        private Output<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus;
        private @Nullable Output<Integer> recoveryPointHistory;
        private @Nullable Output<Integer> recoveryPointThresholdInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(InMagePolicyInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appConsistentFrequencyInMinutes = defaults.appConsistentFrequencyInMinutes;
    	      this.instanceType = defaults.instanceType;
    	      this.multiVmSyncStatus = defaults.multiVmSyncStatus;
    	      this.recoveryPointHistory = defaults.recoveryPointHistory;
    	      this.recoveryPointThresholdInMinutes = defaults.recoveryPointThresholdInMinutes;
        }

        public Builder appConsistentFrequencyInMinutes(@Nullable Output<Integer> appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
            return this;
        }

        public Builder appConsistentFrequencyInMinutes(@Nullable Integer appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = Output.ofNullable(appConsistentFrequencyInMinutes);
            return this;
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Output.ofNullable(instanceType);
            return this;
        }

        public Builder multiVmSyncStatus(Output<Either<String,SetMultiVmSyncStatus>> multiVmSyncStatus) {
            this.multiVmSyncStatus = Objects.requireNonNull(multiVmSyncStatus);
            return this;
        }

        public Builder multiVmSyncStatus(Either<String,SetMultiVmSyncStatus> multiVmSyncStatus) {
            this.multiVmSyncStatus = Output.of(Objects.requireNonNull(multiVmSyncStatus));
            return this;
        }

        public Builder recoveryPointHistory(@Nullable Output<Integer> recoveryPointHistory) {
            this.recoveryPointHistory = recoveryPointHistory;
            return this;
        }

        public Builder recoveryPointHistory(@Nullable Integer recoveryPointHistory) {
            this.recoveryPointHistory = Output.ofNullable(recoveryPointHistory);
            return this;
        }

        public Builder recoveryPointThresholdInMinutes(@Nullable Output<Integer> recoveryPointThresholdInMinutes) {
            this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
            return this;
        }

        public Builder recoveryPointThresholdInMinutes(@Nullable Integer recoveryPointThresholdInMinutes) {
            this.recoveryPointThresholdInMinutes = Output.ofNullable(recoveryPointThresholdInMinutes);
            return this;
        }
        public InMagePolicyInputArgs build() {
            return new InMagePolicyInputArgs(appConsistentFrequencyInMinutes, instanceType, multiVmSyncStatus, recoveryPointHistory, recoveryPointThresholdInMinutes);
        }
    }
}
