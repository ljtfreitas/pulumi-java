// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * InMage Azure v2 specific protection profile details.
 * 
 */
public final class InMageAzureV2PolicyDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final InMageAzureV2PolicyDetailsResponse Empty = new InMageAzureV2PolicyDetailsResponse();

    /**
     * The app consistent snapshot frequency in minutes.
     * 
     */
    @InputImport(name="appConsistentFrequencyInMinutes")
    private final @Nullable Integer appConsistentFrequencyInMinutes;

    public Optional<Integer> getAppConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes == null ? Optional.empty() : Optional.ofNullable(this.appConsistentFrequencyInMinutes);
    }

    /**
     * The crash consistent snapshot frequency in minutes.
     * 
     */
    @InputImport(name="crashConsistentFrequencyInMinutes")
    private final @Nullable Integer crashConsistentFrequencyInMinutes;

    public Optional<Integer> getCrashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes == null ? Optional.empty() : Optional.ofNullable(this.crashConsistentFrequencyInMinutes);
    }

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'InMageAzureV2'.
     * 
     */
    @InputImport(name="instanceType", required=true)
    private final String instanceType;

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * A value indicating whether multi-VM sync has to be enabled.
     * 
     */
    @InputImport(name="multiVmSyncStatus")
    private final @Nullable String multiVmSyncStatus;

    public Optional<String> getMultiVmSyncStatus() {
        return this.multiVmSyncStatus == null ? Optional.empty() : Optional.ofNullable(this.multiVmSyncStatus);
    }

    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
     */
    @InputImport(name="recoveryPointHistory")
    private final @Nullable Integer recoveryPointHistory;

    public Optional<Integer> getRecoveryPointHistory() {
        return this.recoveryPointHistory == null ? Optional.empty() : Optional.ofNullable(this.recoveryPointHistory);
    }

    /**
     * The recovery point threshold in minutes.
     * 
     */
    @InputImport(name="recoveryPointThresholdInMinutes")
    private final @Nullable Integer recoveryPointThresholdInMinutes;

    public Optional<Integer> getRecoveryPointThresholdInMinutes() {
        return this.recoveryPointThresholdInMinutes == null ? Optional.empty() : Optional.ofNullable(this.recoveryPointThresholdInMinutes);
    }

    public InMageAzureV2PolicyDetailsResponse(
        @Nullable Integer appConsistentFrequencyInMinutes,
        @Nullable Integer crashConsistentFrequencyInMinutes,
        String instanceType,
        @Nullable String multiVmSyncStatus,
        @Nullable Integer recoveryPointHistory,
        @Nullable Integer recoveryPointThresholdInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.multiVmSyncStatus = multiVmSyncStatus;
        this.recoveryPointHistory = recoveryPointHistory;
        this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
    }

    private InMageAzureV2PolicyDetailsResponse() {
        this.appConsistentFrequencyInMinutes = null;
        this.crashConsistentFrequencyInMinutes = null;
        this.instanceType = null;
        this.multiVmSyncStatus = null;
        this.recoveryPointHistory = null;
        this.recoveryPointThresholdInMinutes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageAzureV2PolicyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer appConsistentFrequencyInMinutes;
        private @Nullable Integer crashConsistentFrequencyInMinutes;
        private String instanceType;
        private @Nullable String multiVmSyncStatus;
        private @Nullable Integer recoveryPointHistory;
        private @Nullable Integer recoveryPointThresholdInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageAzureV2PolicyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appConsistentFrequencyInMinutes = defaults.appConsistentFrequencyInMinutes;
    	      this.crashConsistentFrequencyInMinutes = defaults.crashConsistentFrequencyInMinutes;
    	      this.instanceType = defaults.instanceType;
    	      this.multiVmSyncStatus = defaults.multiVmSyncStatus;
    	      this.recoveryPointHistory = defaults.recoveryPointHistory;
    	      this.recoveryPointThresholdInMinutes = defaults.recoveryPointThresholdInMinutes;
        }

        public Builder setAppConsistentFrequencyInMinutes(@Nullable Integer appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
            return this;
        }

        public Builder setCrashConsistentFrequencyInMinutes(@Nullable Integer crashConsistentFrequencyInMinutes) {
            this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setMultiVmSyncStatus(@Nullable String multiVmSyncStatus) {
            this.multiVmSyncStatus = multiVmSyncStatus;
            return this;
        }

        public Builder setRecoveryPointHistory(@Nullable Integer recoveryPointHistory) {
            this.recoveryPointHistory = recoveryPointHistory;
            return this;
        }

        public Builder setRecoveryPointThresholdInMinutes(@Nullable Integer recoveryPointThresholdInMinutes) {
            this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
            return this;
        }

        public InMageAzureV2PolicyDetailsResponse build() {
            return new InMageAzureV2PolicyDetailsResponse(appConsistentFrequencyInMinutes, crashConsistentFrequencyInMinutes, instanceType, multiVmSyncStatus, recoveryPointHistory, recoveryPointThresholdInMinutes);
        }
    }
}
