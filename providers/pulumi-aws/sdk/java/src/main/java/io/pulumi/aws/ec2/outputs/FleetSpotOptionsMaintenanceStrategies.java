// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.FleetSpotOptionsMaintenanceStrategiesCapacityRebalance;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FleetSpotOptionsMaintenanceStrategies {
    /**
     * Nested argument containing the capacity rebalance for your fleet request. Defined below.
     * 
     */
    private final @Nullable FleetSpotOptionsMaintenanceStrategiesCapacityRebalance capacityRebalance;

    @OutputCustomType.Constructor({"capacityRebalance"})
    private FleetSpotOptionsMaintenanceStrategies(@Nullable FleetSpotOptionsMaintenanceStrategiesCapacityRebalance capacityRebalance) {
        this.capacityRebalance = capacityRebalance;
    }

    /**
     * Nested argument containing the capacity rebalance for your fleet request. Defined below.
     * 
     */
    public Optional<FleetSpotOptionsMaintenanceStrategiesCapacityRebalance> getCapacityRebalance() {
        return Optional.ofNullable(this.capacityRebalance);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetSpotOptionsMaintenanceStrategies defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FleetSpotOptionsMaintenanceStrategiesCapacityRebalance capacityRebalance;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetSpotOptionsMaintenanceStrategies defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityRebalance = defaults.capacityRebalance;
        }

        public Builder setCapacityRebalance(@Nullable FleetSpotOptionsMaintenanceStrategiesCapacityRebalance capacityRebalance) {
            this.capacityRebalance = capacityRebalance;
            return this;
        }
        public FleetSpotOptionsMaintenanceStrategies build() {
            return new FleetSpotOptionsMaintenanceStrategies(capacityRebalance);
        }
    }
}