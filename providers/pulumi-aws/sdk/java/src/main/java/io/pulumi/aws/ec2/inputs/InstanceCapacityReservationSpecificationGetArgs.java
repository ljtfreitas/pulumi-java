// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceCapacityReservationSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceCapacityReservationSpecificationGetArgs Empty = new InstanceCapacityReservationSpecificationGetArgs();

    /**
     * Indicates the instance's Capacity Reservation preferences. Can be `"open"` or `"none"`. (Default: `"open"`).
     * 
     */
    @Import(name="capacityReservationPreference")
      private final @Nullable Output<String> capacityReservationPreference;

    public Output<String> getCapacityReservationPreference() {
        return this.capacityReservationPreference == null ? Output.empty() : this.capacityReservationPreference;
    }

    /**
     * Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
     * 
     */
    @Import(name="capacityReservationTarget")
      private final @Nullable Output<InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs> capacityReservationTarget;

    public Output<InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs> getCapacityReservationTarget() {
        return this.capacityReservationTarget == null ? Output.empty() : this.capacityReservationTarget;
    }

    public InstanceCapacityReservationSpecificationGetArgs(
        @Nullable Output<String> capacityReservationPreference,
        @Nullable Output<InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs> capacityReservationTarget) {
        this.capacityReservationPreference = capacityReservationPreference;
        this.capacityReservationTarget = capacityReservationTarget;
    }

    private InstanceCapacityReservationSpecificationGetArgs() {
        this.capacityReservationPreference = Output.empty();
        this.capacityReservationTarget = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceCapacityReservationSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> capacityReservationPreference;
        private @Nullable Output<InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs> capacityReservationTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceCapacityReservationSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationPreference = defaults.capacityReservationPreference;
    	      this.capacityReservationTarget = defaults.capacityReservationTarget;
        }

        public Builder capacityReservationPreference(@Nullable Output<String> capacityReservationPreference) {
            this.capacityReservationPreference = capacityReservationPreference;
            return this;
        }

        public Builder capacityReservationPreference(@Nullable String capacityReservationPreference) {
            this.capacityReservationPreference = Output.ofNullable(capacityReservationPreference);
            return this;
        }

        public Builder capacityReservationTarget(@Nullable Output<InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs> capacityReservationTarget) {
            this.capacityReservationTarget = capacityReservationTarget;
            return this;
        }

        public Builder capacityReservationTarget(@Nullable InstanceCapacityReservationSpecificationCapacityReservationTargetGetArgs capacityReservationTarget) {
            this.capacityReservationTarget = Output.ofNullable(capacityReservationTarget);
            return this;
        }
        public InstanceCapacityReservationSpecificationGetArgs build() {
            return new InstanceCapacityReservationSpecificationGetArgs(capacityReservationPreference, capacityReservationTarget);
        }
    }
}
