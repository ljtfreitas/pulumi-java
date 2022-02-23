// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.InstanceCapacityReservationSpecificationCapacityReservationTarget;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceCapacityReservationSpecification {
    /**
     * Indicates the instance's Capacity Reservation preferences. Can be `"open"` or `"none"`. (Default: `"open"`).
     * 
     */
    private final @Nullable String capacityReservationPreference;
    /**
     * Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
     * 
     */
    private final @Nullable InstanceCapacityReservationSpecificationCapacityReservationTarget capacityReservationTarget;

    @OutputCustomType.Constructor({"capacityReservationPreference","capacityReservationTarget"})
    private InstanceCapacityReservationSpecification(
        @Nullable String capacityReservationPreference,
        @Nullable InstanceCapacityReservationSpecificationCapacityReservationTarget capacityReservationTarget) {
        this.capacityReservationPreference = capacityReservationPreference;
        this.capacityReservationTarget = capacityReservationTarget;
    }

    /**
     * Indicates the instance's Capacity Reservation preferences. Can be `"open"` or `"none"`. (Default: `"open"`).
     * 
     */
    public Optional<String> getCapacityReservationPreference() {
        return Optional.ofNullable(this.capacityReservationPreference);
    }
    /**
     * Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
     * 
     */
    public Optional<InstanceCapacityReservationSpecificationCapacityReservationTarget> getCapacityReservationTarget() {
        return Optional.ofNullable(this.capacityReservationTarget);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceCapacityReservationSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String capacityReservationPreference;
        private @Nullable InstanceCapacityReservationSpecificationCapacityReservationTarget capacityReservationTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceCapacityReservationSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationPreference = defaults.capacityReservationPreference;
    	      this.capacityReservationTarget = defaults.capacityReservationTarget;
        }

        public Builder setCapacityReservationPreference(@Nullable String capacityReservationPreference) {
            this.capacityReservationPreference = capacityReservationPreference;
            return this;
        }

        public Builder setCapacityReservationTarget(@Nullable InstanceCapacityReservationSpecificationCapacityReservationTarget capacityReservationTarget) {
            this.capacityReservationTarget = capacityReservationTarget;
            return this;
        }
        public InstanceCapacityReservationSpecification build() {
            return new InstanceCapacityReservationSpecification(capacityReservationPreference, capacityReservationTarget);
        }
    }
}
