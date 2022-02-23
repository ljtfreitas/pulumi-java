// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs Empty = new ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs();

    /**
     * Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
     * 
     */
    @InputImport(name="allocationStrategy", required=true)
    private final Input<String> allocationStrategy;

    public Input<String> getAllocationStrategy() {
        return this.allocationStrategy;
    }

    public ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs(Input<String> allocationStrategy) {
        this.allocationStrategy = Objects.requireNonNull(allocationStrategy, "expected parameter 'allocationStrategy' to be non-null");
    }

    private ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs() {
        this.allocationStrategy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> allocationStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
        }

        public Builder setAllocationStrategy(Input<String> allocationStrategy) {
            this.allocationStrategy = Objects.requireNonNull(allocationStrategy);
            return this;
        }

        public Builder setAllocationStrategy(String allocationStrategy) {
            this.allocationStrategy = Input.of(Objects.requireNonNull(allocationStrategy));
            return this;
        }
        public ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs build() {
            return new ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs(allocationStrategy);
        }
    }
}
