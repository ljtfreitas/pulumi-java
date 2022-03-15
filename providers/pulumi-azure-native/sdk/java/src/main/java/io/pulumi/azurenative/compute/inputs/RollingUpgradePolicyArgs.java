// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration parameters used while performing a rolling upgrade.
 * 
 */
public final class RollingUpgradePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RollingUpgradePolicyArgs Empty = new RollingUpgradePolicyArgs();

    /**
     * Allow VMSS to ignore AZ boundaries when constructing upgrade batches. Take into consideration the Update Domain and maxBatchInstancePercent to determine the batch size.
     * 
     */
    @Import(name="enableCrossZoneUpgrade")
      private final @Nullable Output<Boolean> enableCrossZoneUpgrade;

    public Output<Boolean> getEnableCrossZoneUpgrade() {
        return this.enableCrossZoneUpgrade == null ? Output.empty() : this.enableCrossZoneUpgrade;
    }

    /**
     * The maximum percent of total virtual machine instances that will be upgraded simultaneously by the rolling upgrade in one batch. As this is a maximum, unhealthy instances in previous or future batches can cause the percentage of instances in a batch to decrease to ensure higher reliability. The default value for this parameter is 20%.
     * 
     */
    @Import(name="maxBatchInstancePercent")
      private final @Nullable Output<Integer> maxBatchInstancePercent;

    public Output<Integer> getMaxBatchInstancePercent() {
        return this.maxBatchInstancePercent == null ? Output.empty() : this.maxBatchInstancePercent;
    }

    /**
     * The maximum percentage of the total virtual machine instances in the scale set that can be simultaneously unhealthy, either as a result of being upgraded, or by being found in an unhealthy state by the virtual machine health checks before the rolling upgrade aborts. This constraint will be checked prior to starting any batch. The default value for this parameter is 20%.
     * 
     */
    @Import(name="maxUnhealthyInstancePercent")
      private final @Nullable Output<Integer> maxUnhealthyInstancePercent;

    public Output<Integer> getMaxUnhealthyInstancePercent() {
        return this.maxUnhealthyInstancePercent == null ? Output.empty() : this.maxUnhealthyInstancePercent;
    }

    /**
     * The maximum percentage of upgraded virtual machine instances that can be found to be in an unhealthy state. This check will happen after each batch is upgraded. If this percentage is ever exceeded, the rolling update aborts. The default value for this parameter is 20%.
     * 
     */
    @Import(name="maxUnhealthyUpgradedInstancePercent")
      private final @Nullable Output<Integer> maxUnhealthyUpgradedInstancePercent;

    public Output<Integer> getMaxUnhealthyUpgradedInstancePercent() {
        return this.maxUnhealthyUpgradedInstancePercent == null ? Output.empty() : this.maxUnhealthyUpgradedInstancePercent;
    }

    /**
     * The wait time between completing the update for all virtual machines in one batch and starting the next batch. The time duration should be specified in ISO 8601 format. The default value is 0 seconds (PT0S).
     * 
     */
    @Import(name="pauseTimeBetweenBatches")
      private final @Nullable Output<String> pauseTimeBetweenBatches;

    public Output<String> getPauseTimeBetweenBatches() {
        return this.pauseTimeBetweenBatches == null ? Output.empty() : this.pauseTimeBetweenBatches;
    }

    /**
     * Upgrade all unhealthy instances in a scale set before any healthy instances.
     * 
     */
    @Import(name="prioritizeUnhealthyInstances")
      private final @Nullable Output<Boolean> prioritizeUnhealthyInstances;

    public Output<Boolean> getPrioritizeUnhealthyInstances() {
        return this.prioritizeUnhealthyInstances == null ? Output.empty() : this.prioritizeUnhealthyInstances;
    }

    public RollingUpgradePolicyArgs(
        @Nullable Output<Boolean> enableCrossZoneUpgrade,
        @Nullable Output<Integer> maxBatchInstancePercent,
        @Nullable Output<Integer> maxUnhealthyInstancePercent,
        @Nullable Output<Integer> maxUnhealthyUpgradedInstancePercent,
        @Nullable Output<String> pauseTimeBetweenBatches,
        @Nullable Output<Boolean> prioritizeUnhealthyInstances) {
        this.enableCrossZoneUpgrade = enableCrossZoneUpgrade;
        this.maxBatchInstancePercent = maxBatchInstancePercent;
        this.maxUnhealthyInstancePercent = maxUnhealthyInstancePercent;
        this.maxUnhealthyUpgradedInstancePercent = maxUnhealthyUpgradedInstancePercent;
        this.pauseTimeBetweenBatches = pauseTimeBetweenBatches;
        this.prioritizeUnhealthyInstances = prioritizeUnhealthyInstances;
    }

    private RollingUpgradePolicyArgs() {
        this.enableCrossZoneUpgrade = Output.empty();
        this.maxBatchInstancePercent = Output.empty();
        this.maxUnhealthyInstancePercent = Output.empty();
        this.maxUnhealthyUpgradedInstancePercent = Output.empty();
        this.pauseTimeBetweenBatches = Output.empty();
        this.prioritizeUnhealthyInstances = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollingUpgradePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableCrossZoneUpgrade;
        private @Nullable Output<Integer> maxBatchInstancePercent;
        private @Nullable Output<Integer> maxUnhealthyInstancePercent;
        private @Nullable Output<Integer> maxUnhealthyUpgradedInstancePercent;
        private @Nullable Output<String> pauseTimeBetweenBatches;
        private @Nullable Output<Boolean> prioritizeUnhealthyInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(RollingUpgradePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableCrossZoneUpgrade = defaults.enableCrossZoneUpgrade;
    	      this.maxBatchInstancePercent = defaults.maxBatchInstancePercent;
    	      this.maxUnhealthyInstancePercent = defaults.maxUnhealthyInstancePercent;
    	      this.maxUnhealthyUpgradedInstancePercent = defaults.maxUnhealthyUpgradedInstancePercent;
    	      this.pauseTimeBetweenBatches = defaults.pauseTimeBetweenBatches;
    	      this.prioritizeUnhealthyInstances = defaults.prioritizeUnhealthyInstances;
        }

        public Builder enableCrossZoneUpgrade(@Nullable Output<Boolean> enableCrossZoneUpgrade) {
            this.enableCrossZoneUpgrade = enableCrossZoneUpgrade;
            return this;
        }

        public Builder enableCrossZoneUpgrade(@Nullable Boolean enableCrossZoneUpgrade) {
            this.enableCrossZoneUpgrade = Output.ofNullable(enableCrossZoneUpgrade);
            return this;
        }

        public Builder maxBatchInstancePercent(@Nullable Output<Integer> maxBatchInstancePercent) {
            this.maxBatchInstancePercent = maxBatchInstancePercent;
            return this;
        }

        public Builder maxBatchInstancePercent(@Nullable Integer maxBatchInstancePercent) {
            this.maxBatchInstancePercent = Output.ofNullable(maxBatchInstancePercent);
            return this;
        }

        public Builder maxUnhealthyInstancePercent(@Nullable Output<Integer> maxUnhealthyInstancePercent) {
            this.maxUnhealthyInstancePercent = maxUnhealthyInstancePercent;
            return this;
        }

        public Builder maxUnhealthyInstancePercent(@Nullable Integer maxUnhealthyInstancePercent) {
            this.maxUnhealthyInstancePercent = Output.ofNullable(maxUnhealthyInstancePercent);
            return this;
        }

        public Builder maxUnhealthyUpgradedInstancePercent(@Nullable Output<Integer> maxUnhealthyUpgradedInstancePercent) {
            this.maxUnhealthyUpgradedInstancePercent = maxUnhealthyUpgradedInstancePercent;
            return this;
        }

        public Builder maxUnhealthyUpgradedInstancePercent(@Nullable Integer maxUnhealthyUpgradedInstancePercent) {
            this.maxUnhealthyUpgradedInstancePercent = Output.ofNullable(maxUnhealthyUpgradedInstancePercent);
            return this;
        }

        public Builder pauseTimeBetweenBatches(@Nullable Output<String> pauseTimeBetweenBatches) {
            this.pauseTimeBetweenBatches = pauseTimeBetweenBatches;
            return this;
        }

        public Builder pauseTimeBetweenBatches(@Nullable String pauseTimeBetweenBatches) {
            this.pauseTimeBetweenBatches = Output.ofNullable(pauseTimeBetweenBatches);
            return this;
        }

        public Builder prioritizeUnhealthyInstances(@Nullable Output<Boolean> prioritizeUnhealthyInstances) {
            this.prioritizeUnhealthyInstances = prioritizeUnhealthyInstances;
            return this;
        }

        public Builder prioritizeUnhealthyInstances(@Nullable Boolean prioritizeUnhealthyInstances) {
            this.prioritizeUnhealthyInstances = Output.ofNullable(prioritizeUnhealthyInstances);
            return this;
        }
        public RollingUpgradePolicyArgs build() {
            return new RollingUpgradePolicyArgs(enableCrossZoneUpgrade, maxBatchInstancePercent, maxUnhealthyInstancePercent, maxUnhealthyUpgradedInstancePercent, pauseTimeBetweenBatches, prioritizeUnhealthyInstances);
        }
    }
}
