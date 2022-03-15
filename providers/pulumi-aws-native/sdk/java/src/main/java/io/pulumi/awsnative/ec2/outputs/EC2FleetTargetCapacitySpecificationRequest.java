// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.enums.EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType;
import io.pulumi.awsnative.ec2.enums.EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EC2FleetTargetCapacitySpecificationRequest {
    private final @Nullable EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType defaultTargetCapacityType;
    private final @Nullable Integer onDemandTargetCapacity;
    private final @Nullable Integer spotTargetCapacity;
    private final @Nullable EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType targetCapacityUnitType;
    private final Integer totalTargetCapacity;

    @CustomType.Constructor
    private EC2FleetTargetCapacitySpecificationRequest(
        @CustomType.Parameter("defaultTargetCapacityType") @Nullable EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType defaultTargetCapacityType,
        @CustomType.Parameter("onDemandTargetCapacity") @Nullable Integer onDemandTargetCapacity,
        @CustomType.Parameter("spotTargetCapacity") @Nullable Integer spotTargetCapacity,
        @CustomType.Parameter("targetCapacityUnitType") @Nullable EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType targetCapacityUnitType,
        @CustomType.Parameter("totalTargetCapacity") Integer totalTargetCapacity) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
        this.onDemandTargetCapacity = onDemandTargetCapacity;
        this.spotTargetCapacity = spotTargetCapacity;
        this.targetCapacityUnitType = targetCapacityUnitType;
        this.totalTargetCapacity = totalTargetCapacity;
    }

    public Optional<EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType> getDefaultTargetCapacityType() {
        return Optional.ofNullable(this.defaultTargetCapacityType);
    }
    public Optional<Integer> getOnDemandTargetCapacity() {
        return Optional.ofNullable(this.onDemandTargetCapacity);
    }
    public Optional<Integer> getSpotTargetCapacity() {
        return Optional.ofNullable(this.spotTargetCapacity);
    }
    public Optional<EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType> getTargetCapacityUnitType() {
        return Optional.ofNullable(this.targetCapacityUnitType);
    }
    public Integer getTotalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetTargetCapacitySpecificationRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType defaultTargetCapacityType;
        private @Nullable Integer onDemandTargetCapacity;
        private @Nullable Integer spotTargetCapacity;
        private @Nullable EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType targetCapacityUnitType;
        private Integer totalTargetCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetTargetCapacitySpecificationRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultTargetCapacityType = defaults.defaultTargetCapacityType;
    	      this.onDemandTargetCapacity = defaults.onDemandTargetCapacity;
    	      this.spotTargetCapacity = defaults.spotTargetCapacity;
    	      this.targetCapacityUnitType = defaults.targetCapacityUnitType;
    	      this.totalTargetCapacity = defaults.totalTargetCapacity;
        }

        public Builder defaultTargetCapacityType(@Nullable EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType defaultTargetCapacityType) {
            this.defaultTargetCapacityType = defaultTargetCapacityType;
            return this;
        }

        public Builder onDemandTargetCapacity(@Nullable Integer onDemandTargetCapacity) {
            this.onDemandTargetCapacity = onDemandTargetCapacity;
            return this;
        }

        public Builder spotTargetCapacity(@Nullable Integer spotTargetCapacity) {
            this.spotTargetCapacity = spotTargetCapacity;
            return this;
        }

        public Builder targetCapacityUnitType(@Nullable EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType targetCapacityUnitType) {
            this.targetCapacityUnitType = targetCapacityUnitType;
            return this;
        }

        public Builder totalTargetCapacity(Integer totalTargetCapacity) {
            this.totalTargetCapacity = Objects.requireNonNull(totalTargetCapacity);
            return this;
        }
        public EC2FleetTargetCapacitySpecificationRequest build() {
            return new EC2FleetTargetCapacitySpecificationRequest(defaultTargetCapacityType, onDemandTargetCapacity, spotTargetCapacity, targetCapacityUnitType, totalTargetCapacity);
        }
    }
}
