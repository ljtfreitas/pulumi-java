// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetLaunchTemplateConfigOverrideGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetLaunchTemplateConfigOverrideGetArgs Empty = new FleetLaunchTemplateConfigOverrideGetArgs();

    /**
     * Availability Zone in which to launch the instances.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Output.empty() : this.availabilityZone;
    }

    /**
     * Instance type.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Output.empty() : this.instanceType;
    }

    /**
     * Maximum price per unit hour that you are willing to pay for a Spot Instance.
     * 
     */
    @Import(name="maxPrice")
      private final @Nullable Output<String> maxPrice;

    public Output<String> getMaxPrice() {
        return this.maxPrice == null ? Output.empty() : this.maxPrice;
    }

    /**
     * Priority for the launch template override. If `on_demand_options` `allocation_strategy` is set to `prioritized`, EC2 Fleet uses priority to determine which launch template override to use first in fulfilling On-Demand capacity. The highest priority is launched first. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority. Valid values are whole numbers starting at 0.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Double> priority;

    public Output<Double> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    /**
     * ID of the subnet in which to launch the instances.
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId == null ? Output.empty() : this.subnetId;
    }

    /**
     * Number of units provided by the specified instance type.
     * 
     */
    @Import(name="weightedCapacity")
      private final @Nullable Output<Double> weightedCapacity;

    public Output<Double> getWeightedCapacity() {
        return this.weightedCapacity == null ? Output.empty() : this.weightedCapacity;
    }

    public FleetLaunchTemplateConfigOverrideGetArgs(
        @Nullable Output<String> availabilityZone,
        @Nullable Output<String> instanceType,
        @Nullable Output<String> maxPrice,
        @Nullable Output<Double> priority,
        @Nullable Output<String> subnetId,
        @Nullable Output<Double> weightedCapacity) {
        this.availabilityZone = availabilityZone;
        this.instanceType = instanceType;
        this.maxPrice = maxPrice;
        this.priority = priority;
        this.subnetId = subnetId;
        this.weightedCapacity = weightedCapacity;
    }

    private FleetLaunchTemplateConfigOverrideGetArgs() {
        this.availabilityZone = Output.empty();
        this.instanceType = Output.empty();
        this.maxPrice = Output.empty();
        this.priority = Output.empty();
        this.subnetId = Output.empty();
        this.weightedCapacity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetLaunchTemplateConfigOverrideGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<String> maxPrice;
        private @Nullable Output<Double> priority;
        private @Nullable Output<String> subnetId;
        private @Nullable Output<Double> weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetLaunchTemplateConfigOverrideGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.instanceType = defaults.instanceType;
    	      this.maxPrice = defaults.maxPrice;
    	      this.priority = defaults.priority;
    	      this.subnetId = defaults.subnetId;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Output.ofNullable(availabilityZone);
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

        public Builder maxPrice(@Nullable Output<String> maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }

        public Builder maxPrice(@Nullable String maxPrice) {
            this.maxPrice = Output.ofNullable(maxPrice);
            return this;
        }

        public Builder priority(@Nullable Output<Double> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Double priority) {
            this.priority = Output.ofNullable(priority);
            return this;
        }

        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Output.ofNullable(subnetId);
            return this;
        }

        public Builder weightedCapacity(@Nullable Output<Double> weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }

        public Builder weightedCapacity(@Nullable Double weightedCapacity) {
            this.weightedCapacity = Output.ofNullable(weightedCapacity);
            return this;
        }
        public FleetLaunchTemplateConfigOverrideGetArgs build() {
            return new FleetLaunchTemplateConfigOverrideGetArgs(availabilityZone, instanceType, maxPrice, priority, subnetId, weightedCapacity);
        }
    }
}
