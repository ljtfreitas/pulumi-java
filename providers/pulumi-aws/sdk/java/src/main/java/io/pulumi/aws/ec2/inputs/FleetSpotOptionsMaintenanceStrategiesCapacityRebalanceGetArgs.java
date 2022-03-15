// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs Empty = new FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs();

    /**
     * The replacement strategy to use. Only available for fleets of `type` set to `maintain`. Valid values: `launch`.
     * 
     */
    @Import(name="replacementStrategy")
      private final @Nullable Output<String> replacementStrategy;

    public Output<String> getReplacementStrategy() {
        return this.replacementStrategy == null ? Output.empty() : this.replacementStrategy;
    }

    public FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs(@Nullable Output<String> replacementStrategy) {
        this.replacementStrategy = replacementStrategy;
    }

    private FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs() {
        this.replacementStrategy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> replacementStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replacementStrategy = defaults.replacementStrategy;
        }

        public Builder replacementStrategy(@Nullable Output<String> replacementStrategy) {
            this.replacementStrategy = replacementStrategy;
            return this;
        }

        public Builder replacementStrategy(@Nullable String replacementStrategy) {
            this.replacementStrategy = Output.ofNullable(replacementStrategy);
            return this;
        }
        public FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs build() {
            return new FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs(replacementStrategy);
        }
    }
}
