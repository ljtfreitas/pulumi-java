// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs Empty = new ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs();

    /**
     * Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
     * 
     */
    @Import(name="allocationStrategy", required=true)
      private final Output<String> allocationStrategy;

    public Output<String> getAllocationStrategy() {
        return this.allocationStrategy;
    }

    public ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs(Output<String> allocationStrategy) {
        this.allocationStrategy = Objects.requireNonNull(allocationStrategy, "expected parameter 'allocationStrategy' to be non-null");
    }

    private ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs() {
        this.allocationStrategy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> allocationStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
        }

        public Builder allocationStrategy(Output<String> allocationStrategy) {
            this.allocationStrategy = Objects.requireNonNull(allocationStrategy);
            return this;
        }

        public Builder allocationStrategy(String allocationStrategy) {
            this.allocationStrategy = Output.of(Objects.requireNonNull(allocationStrategy));
            return this;
        }
        public ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs build() {
            return new ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecificationGetArgs(allocationStrategy);
        }
    }
}
