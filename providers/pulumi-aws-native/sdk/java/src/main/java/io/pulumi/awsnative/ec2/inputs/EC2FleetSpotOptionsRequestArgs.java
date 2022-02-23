// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.EC2FleetSpotOptionsRequestAllocationStrategy;
import io.pulumi.awsnative.ec2.enums.EC2FleetSpotOptionsRequestInstanceInterruptionBehavior;
import io.pulumi.awsnative.ec2.inputs.EC2FleetMaintenanceStrategiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetSpotOptionsRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetSpotOptionsRequestArgs Empty = new EC2FleetSpotOptionsRequestArgs();

    @InputImport(name="allocationStrategy")
        private final @Nullable Input<EC2FleetSpotOptionsRequestAllocationStrategy> allocationStrategy;

    public Input<EC2FleetSpotOptionsRequestAllocationStrategy> getAllocationStrategy() {
        return this.allocationStrategy == null ? Input.empty() : this.allocationStrategy;
    }

    @InputImport(name="instanceInterruptionBehavior")
        private final @Nullable Input<EC2FleetSpotOptionsRequestInstanceInterruptionBehavior> instanceInterruptionBehavior;

    public Input<EC2FleetSpotOptionsRequestInstanceInterruptionBehavior> getInstanceInterruptionBehavior() {
        return this.instanceInterruptionBehavior == null ? Input.empty() : this.instanceInterruptionBehavior;
    }

    @InputImport(name="instancePoolsToUseCount")
        private final @Nullable Input<Integer> instancePoolsToUseCount;

    public Input<Integer> getInstancePoolsToUseCount() {
        return this.instancePoolsToUseCount == null ? Input.empty() : this.instancePoolsToUseCount;
    }

    @InputImport(name="maintenanceStrategies")
        private final @Nullable Input<EC2FleetMaintenanceStrategiesArgs> maintenanceStrategies;

    public Input<EC2FleetMaintenanceStrategiesArgs> getMaintenanceStrategies() {
        return this.maintenanceStrategies == null ? Input.empty() : this.maintenanceStrategies;
    }

    @InputImport(name="maxTotalPrice")
        private final @Nullable Input<String> maxTotalPrice;

    public Input<String> getMaxTotalPrice() {
        return this.maxTotalPrice == null ? Input.empty() : this.maxTotalPrice;
    }

    @InputImport(name="minTargetCapacity")
        private final @Nullable Input<Integer> minTargetCapacity;

    public Input<Integer> getMinTargetCapacity() {
        return this.minTargetCapacity == null ? Input.empty() : this.minTargetCapacity;
    }

    @InputImport(name="singleAvailabilityZone")
        private final @Nullable Input<Boolean> singleAvailabilityZone;

    public Input<Boolean> getSingleAvailabilityZone() {
        return this.singleAvailabilityZone == null ? Input.empty() : this.singleAvailabilityZone;
    }

    @InputImport(name="singleInstanceType")
        private final @Nullable Input<Boolean> singleInstanceType;

    public Input<Boolean> getSingleInstanceType() {
        return this.singleInstanceType == null ? Input.empty() : this.singleInstanceType;
    }

    public EC2FleetSpotOptionsRequestArgs(
        @Nullable Input<EC2FleetSpotOptionsRequestAllocationStrategy> allocationStrategy,
        @Nullable Input<EC2FleetSpotOptionsRequestInstanceInterruptionBehavior> instanceInterruptionBehavior,
        @Nullable Input<Integer> instancePoolsToUseCount,
        @Nullable Input<EC2FleetMaintenanceStrategiesArgs> maintenanceStrategies,
        @Nullable Input<String> maxTotalPrice,
        @Nullable Input<Integer> minTargetCapacity,
        @Nullable Input<Boolean> singleAvailabilityZone,
        @Nullable Input<Boolean> singleInstanceType) {
        this.allocationStrategy = allocationStrategy;
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        this.instancePoolsToUseCount = instancePoolsToUseCount;
        this.maintenanceStrategies = maintenanceStrategies;
        this.maxTotalPrice = maxTotalPrice;
        this.minTargetCapacity = minTargetCapacity;
        this.singleAvailabilityZone = singleAvailabilityZone;
        this.singleInstanceType = singleInstanceType;
    }

    private EC2FleetSpotOptionsRequestArgs() {
        this.allocationStrategy = Input.empty();
        this.instanceInterruptionBehavior = Input.empty();
        this.instancePoolsToUseCount = Input.empty();
        this.maintenanceStrategies = Input.empty();
        this.maxTotalPrice = Input.empty();
        this.minTargetCapacity = Input.empty();
        this.singleAvailabilityZone = Input.empty();
        this.singleInstanceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetSpotOptionsRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EC2FleetSpotOptionsRequestAllocationStrategy> allocationStrategy;
        private @Nullable Input<EC2FleetSpotOptionsRequestInstanceInterruptionBehavior> instanceInterruptionBehavior;
        private @Nullable Input<Integer> instancePoolsToUseCount;
        private @Nullable Input<EC2FleetMaintenanceStrategiesArgs> maintenanceStrategies;
        private @Nullable Input<String> maxTotalPrice;
        private @Nullable Input<Integer> minTargetCapacity;
        private @Nullable Input<Boolean> singleAvailabilityZone;
        private @Nullable Input<Boolean> singleInstanceType;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetSpotOptionsRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.instanceInterruptionBehavior = defaults.instanceInterruptionBehavior;
    	      this.instancePoolsToUseCount = defaults.instancePoolsToUseCount;
    	      this.maintenanceStrategies = defaults.maintenanceStrategies;
    	      this.maxTotalPrice = defaults.maxTotalPrice;
    	      this.minTargetCapacity = defaults.minTargetCapacity;
    	      this.singleAvailabilityZone = defaults.singleAvailabilityZone;
    	      this.singleInstanceType = defaults.singleInstanceType;
        }

        public Builder setAllocationStrategy(@Nullable Input<EC2FleetSpotOptionsRequestAllocationStrategy> allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        public Builder setAllocationStrategy(@Nullable EC2FleetSpotOptionsRequestAllocationStrategy allocationStrategy) {
            this.allocationStrategy = Input.ofNullable(allocationStrategy);
            return this;
        }

        public Builder setInstanceInterruptionBehavior(@Nullable Input<EC2FleetSpotOptionsRequestInstanceInterruptionBehavior> instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = instanceInterruptionBehavior;
            return this;
        }

        public Builder setInstanceInterruptionBehavior(@Nullable EC2FleetSpotOptionsRequestInstanceInterruptionBehavior instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = Input.ofNullable(instanceInterruptionBehavior);
            return this;
        }

        public Builder setInstancePoolsToUseCount(@Nullable Input<Integer> instancePoolsToUseCount) {
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }

        public Builder setInstancePoolsToUseCount(@Nullable Integer instancePoolsToUseCount) {
            this.instancePoolsToUseCount = Input.ofNullable(instancePoolsToUseCount);
            return this;
        }

        public Builder setMaintenanceStrategies(@Nullable Input<EC2FleetMaintenanceStrategiesArgs> maintenanceStrategies) {
            this.maintenanceStrategies = maintenanceStrategies;
            return this;
        }

        public Builder setMaintenanceStrategies(@Nullable EC2FleetMaintenanceStrategiesArgs maintenanceStrategies) {
            this.maintenanceStrategies = Input.ofNullable(maintenanceStrategies);
            return this;
        }

        public Builder setMaxTotalPrice(@Nullable Input<String> maxTotalPrice) {
            this.maxTotalPrice = maxTotalPrice;
            return this;
        }

        public Builder setMaxTotalPrice(@Nullable String maxTotalPrice) {
            this.maxTotalPrice = Input.ofNullable(maxTotalPrice);
            return this;
        }

        public Builder setMinTargetCapacity(@Nullable Input<Integer> minTargetCapacity) {
            this.minTargetCapacity = minTargetCapacity;
            return this;
        }

        public Builder setMinTargetCapacity(@Nullable Integer minTargetCapacity) {
            this.minTargetCapacity = Input.ofNullable(minTargetCapacity);
            return this;
        }

        public Builder setSingleAvailabilityZone(@Nullable Input<Boolean> singleAvailabilityZone) {
            this.singleAvailabilityZone = singleAvailabilityZone;
            return this;
        }

        public Builder setSingleAvailabilityZone(@Nullable Boolean singleAvailabilityZone) {
            this.singleAvailabilityZone = Input.ofNullable(singleAvailabilityZone);
            return this;
        }

        public Builder setSingleInstanceType(@Nullable Input<Boolean> singleInstanceType) {
            this.singleInstanceType = singleInstanceType;
            return this;
        }

        public Builder setSingleInstanceType(@Nullable Boolean singleInstanceType) {
            this.singleInstanceType = Input.ofNullable(singleInstanceType);
            return this;
        }
        public EC2FleetSpotOptionsRequestArgs build() {
            return new EC2FleetSpotOptionsRequestArgs(allocationStrategy, instanceInterruptionBehavior, instancePoolsToUseCount, maintenanceStrategies, maxTotalPrice, minTargetCapacity, singleAvailabilityZone, singleInstanceType);
        }
    }
}
