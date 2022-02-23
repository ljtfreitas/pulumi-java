// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationArgs Empty = new ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationArgs();

    /**
     * Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
     * 
     */
    @InputImport(name="allocationStrategy", required=true)
    private final Input<String> allocationStrategy;

    public Input<String> getAllocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * Defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
     * 
     */
    @InputImport(name="blockDurationMinutes")
    private final @Nullable Input<Integer> blockDurationMinutes;

    public Input<Integer> getBlockDurationMinutes() {
        return this.blockDurationMinutes == null ? Input.empty() : this.blockDurationMinutes;
    }

    /**
     * Action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired; that is, when all Spot instances could not be provisioned within the Spot provisioning timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND`. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * 
     */
    @InputImport(name="timeoutAction", required=true)
    private final Input<String> timeoutAction;

    public Input<String> getTimeoutAction() {
        return this.timeoutAction;
    }

    /**
     * Spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
     * 
     */
    @InputImport(name="timeoutDurationMinutes", required=true)
    private final Input<Integer> timeoutDurationMinutes;

    public Input<Integer> getTimeoutDurationMinutes() {
        return this.timeoutDurationMinutes;
    }

    public ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationArgs(
        Input<String> allocationStrategy,
        @Nullable Input<Integer> blockDurationMinutes,
        Input<String> timeoutAction,
        Input<Integer> timeoutDurationMinutes) {
        this.allocationStrategy = Objects.requireNonNull(allocationStrategy, "expected parameter 'allocationStrategy' to be non-null");
        this.blockDurationMinutes = blockDurationMinutes;
        this.timeoutAction = Objects.requireNonNull(timeoutAction, "expected parameter 'timeoutAction' to be non-null");
        this.timeoutDurationMinutes = Objects.requireNonNull(timeoutDurationMinutes, "expected parameter 'timeoutDurationMinutes' to be non-null");
    }

    private ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationArgs() {
        this.allocationStrategy = Input.empty();
        this.blockDurationMinutes = Input.empty();
        this.timeoutAction = Input.empty();
        this.timeoutDurationMinutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> allocationStrategy;
        private @Nullable Input<Integer> blockDurationMinutes;
        private Input<String> timeoutAction;
        private Input<Integer> timeoutDurationMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.blockDurationMinutes = defaults.blockDurationMinutes;
    	      this.timeoutAction = defaults.timeoutAction;
    	      this.timeoutDurationMinutes = defaults.timeoutDurationMinutes;
        }

        public Builder setAllocationStrategy(Input<String> allocationStrategy) {
            this.allocationStrategy = Objects.requireNonNull(allocationStrategy);
            return this;
        }

        public Builder setAllocationStrategy(String allocationStrategy) {
            this.allocationStrategy = Input.of(Objects.requireNonNull(allocationStrategy));
            return this;
        }

        public Builder setBlockDurationMinutes(@Nullable Input<Integer> blockDurationMinutes) {
            this.blockDurationMinutes = blockDurationMinutes;
            return this;
        }

        public Builder setBlockDurationMinutes(@Nullable Integer blockDurationMinutes) {
            this.blockDurationMinutes = Input.ofNullable(blockDurationMinutes);
            return this;
        }

        public Builder setTimeoutAction(Input<String> timeoutAction) {
            this.timeoutAction = Objects.requireNonNull(timeoutAction);
            return this;
        }

        public Builder setTimeoutAction(String timeoutAction) {
            this.timeoutAction = Input.of(Objects.requireNonNull(timeoutAction));
            return this;
        }

        public Builder setTimeoutDurationMinutes(Input<Integer> timeoutDurationMinutes) {
            this.timeoutDurationMinutes = Objects.requireNonNull(timeoutDurationMinutes);
            return this;
        }

        public Builder setTimeoutDurationMinutes(Integer timeoutDurationMinutes) {
            this.timeoutDurationMinutes = Input.of(Objects.requireNonNull(timeoutDurationMinutes));
            return this;
        }
        public ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationArgs build() {
            return new ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecificationArgs(allocationStrategy, blockDurationMinutes, timeoutAction, timeoutDurationMinutes);
        }
    }
}
