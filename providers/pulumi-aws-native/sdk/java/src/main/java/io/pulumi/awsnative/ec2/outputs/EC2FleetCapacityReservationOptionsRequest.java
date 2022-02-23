// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.enums.EC2FleetCapacityReservationOptionsRequestUsageStrategy;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EC2FleetCapacityReservationOptionsRequest {
    private final @Nullable EC2FleetCapacityReservationOptionsRequestUsageStrategy usageStrategy;

    @OutputCustomType.Constructor({"usageStrategy"})
    private EC2FleetCapacityReservationOptionsRequest(@Nullable EC2FleetCapacityReservationOptionsRequestUsageStrategy usageStrategy) {
        this.usageStrategy = usageStrategy;
    }

    public Optional<EC2FleetCapacityReservationOptionsRequestUsageStrategy> getUsageStrategy() {
        return Optional.ofNullable(this.usageStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetCapacityReservationOptionsRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EC2FleetCapacityReservationOptionsRequestUsageStrategy usageStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetCapacityReservationOptionsRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.usageStrategy = defaults.usageStrategy;
        }

        public Builder setUsageStrategy(@Nullable EC2FleetCapacityReservationOptionsRequestUsageStrategy usageStrategy) {
            this.usageStrategy = usageStrategy;
            return this;
        }
        public EC2FleetCapacityReservationOptionsRequest build() {
            return new EC2FleetCapacityReservationOptionsRequest(usageStrategy);
        }
    }
}
