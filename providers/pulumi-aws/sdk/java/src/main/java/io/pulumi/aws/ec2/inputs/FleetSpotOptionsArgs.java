// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.FleetSpotOptionsMaintenanceStrategiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetSpotOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetSpotOptionsArgs Empty = new FleetSpotOptionsArgs();

    /**
     * How to allocate the target capacity across the Spot pools. Valid values: `diversified`, `lowestPrice`. Default: `lowestPrice`.
     * 
     */
    @Import(name="allocationStrategy")
      private final @Nullable Output<String> allocationStrategy;

    public Output<String> getAllocationStrategy() {
        return this.allocationStrategy == null ? Output.empty() : this.allocationStrategy;
    }

    /**
     * Behavior when a Spot Instance is interrupted. Valid values: `hibernate`, `stop`, `terminate`. Default: `terminate`.
     * 
     */
    @Import(name="instanceInterruptionBehavior")
      private final @Nullable Output<String> instanceInterruptionBehavior;

    public Output<String> getInstanceInterruptionBehavior() {
        return this.instanceInterruptionBehavior == null ? Output.empty() : this.instanceInterruptionBehavior;
    }

    /**
     * Number of Spot pools across which to allocate your target Spot capacity. Valid only when Spot `allocation_strategy` is set to `lowestPrice`. Default: `1`.
     * 
     */
    @Import(name="instancePoolsToUseCount")
      private final @Nullable Output<Integer> instancePoolsToUseCount;

    public Output<Integer> getInstancePoolsToUseCount() {
        return this.instancePoolsToUseCount == null ? Output.empty() : this.instancePoolsToUseCount;
    }

    /**
     * Nested argument containing maintenance strategies for managing your Spot Instances that are at an elevated risk of being interrupted. Defined below.
     * 
     */
    @Import(name="maintenanceStrategies")
      private final @Nullable Output<FleetSpotOptionsMaintenanceStrategiesArgs> maintenanceStrategies;

    public Output<FleetSpotOptionsMaintenanceStrategiesArgs> getMaintenanceStrategies() {
        return this.maintenanceStrategies == null ? Output.empty() : this.maintenanceStrategies;
    }

    public FleetSpotOptionsArgs(
        @Nullable Output<String> allocationStrategy,
        @Nullable Output<String> instanceInterruptionBehavior,
        @Nullable Output<Integer> instancePoolsToUseCount,
        @Nullable Output<FleetSpotOptionsMaintenanceStrategiesArgs> maintenanceStrategies) {
        this.allocationStrategy = allocationStrategy;
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        this.instancePoolsToUseCount = instancePoolsToUseCount;
        this.maintenanceStrategies = maintenanceStrategies;
    }

    private FleetSpotOptionsArgs() {
        this.allocationStrategy = Output.empty();
        this.instanceInterruptionBehavior = Output.empty();
        this.instancePoolsToUseCount = Output.empty();
        this.maintenanceStrategies = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetSpotOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> allocationStrategy;
        private @Nullable Output<String> instanceInterruptionBehavior;
        private @Nullable Output<Integer> instancePoolsToUseCount;
        private @Nullable Output<FleetSpotOptionsMaintenanceStrategiesArgs> maintenanceStrategies;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetSpotOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.instanceInterruptionBehavior = defaults.instanceInterruptionBehavior;
    	      this.instancePoolsToUseCount = defaults.instancePoolsToUseCount;
    	      this.maintenanceStrategies = defaults.maintenanceStrategies;
        }

        public Builder allocationStrategy(@Nullable Output<String> allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        public Builder allocationStrategy(@Nullable String allocationStrategy) {
            this.allocationStrategy = Output.ofNullable(allocationStrategy);
            return this;
        }

        public Builder instanceInterruptionBehavior(@Nullable Output<String> instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = instanceInterruptionBehavior;
            return this;
        }

        public Builder instanceInterruptionBehavior(@Nullable String instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = Output.ofNullable(instanceInterruptionBehavior);
            return this;
        }

        public Builder instancePoolsToUseCount(@Nullable Output<Integer> instancePoolsToUseCount) {
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }

        public Builder instancePoolsToUseCount(@Nullable Integer instancePoolsToUseCount) {
            this.instancePoolsToUseCount = Output.ofNullable(instancePoolsToUseCount);
            return this;
        }

        public Builder maintenanceStrategies(@Nullable Output<FleetSpotOptionsMaintenanceStrategiesArgs> maintenanceStrategies) {
            this.maintenanceStrategies = maintenanceStrategies;
            return this;
        }

        public Builder maintenanceStrategies(@Nullable FleetSpotOptionsMaintenanceStrategiesArgs maintenanceStrategies) {
            this.maintenanceStrategies = Output.ofNullable(maintenanceStrategies);
            return this;
        }
        public FleetSpotOptionsArgs build() {
            return new FleetSpotOptionsArgs(allocationStrategy, instanceInterruptionBehavior, instancePoolsToUseCount, maintenanceStrategies);
        }
    }
}
