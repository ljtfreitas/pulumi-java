// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyPredictiveScalingConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyPredictiveScalingConfigurationGetArgs Empty = new PolicyPredictiveScalingConfigurationGetArgs();

    /**
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity of the Auto Scaling group. Valid values are `HonorMaxCapacity` or `IncreaseMaxCapacity`. Default is `HonorMaxCapacity`.
     * 
     */
    @Import(name="maxCapacityBreachBehavior")
      private final @Nullable Output<String> maxCapacityBreachBehavior;

    public Output<String> getMaxCapacityBreachBehavior() {
        return this.maxCapacityBreachBehavior == null ? Output.empty() : this.maxCapacityBreachBehavior;
    }

    /**
     * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity. Valid range is `0` to `100`. If set to `0`, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to equal but not exceed forecast capacity.
     * 
     */
    @Import(name="maxCapacityBuffer")
      private final @Nullable Output<String> maxCapacityBuffer;

    public Output<String> getMaxCapacityBuffer() {
        return this.maxCapacityBuffer == null ? Output.empty() : this.maxCapacityBuffer;
    }

    /**
     * This structure includes the metrics and target utilization to use for predictive scaling.
     * 
     */
    @Import(name="metricSpecification", required=true)
      private final Output<PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs> metricSpecification;

    public Output<PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs> getMetricSpecification() {
        return this.metricSpecification;
    }

    /**
     * The predictive scaling mode. Valid values are `ForecastAndScale` and `ForecastOnly`. Default is `ForecastOnly`.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    /**
     * The amount of time, in seconds, by which the instance launch time can be advanced. Minimum is `0`.
     * 
     */
    @Import(name="schedulingBufferTime")
      private final @Nullable Output<String> schedulingBufferTime;

    public Output<String> getSchedulingBufferTime() {
        return this.schedulingBufferTime == null ? Output.empty() : this.schedulingBufferTime;
    }

    public PolicyPredictiveScalingConfigurationGetArgs(
        @Nullable Output<String> maxCapacityBreachBehavior,
        @Nullable Output<String> maxCapacityBuffer,
        Output<PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs> metricSpecification,
        @Nullable Output<String> mode,
        @Nullable Output<String> schedulingBufferTime) {
        this.maxCapacityBreachBehavior = maxCapacityBreachBehavior;
        this.maxCapacityBuffer = maxCapacityBuffer;
        this.metricSpecification = Objects.requireNonNull(metricSpecification, "expected parameter 'metricSpecification' to be non-null");
        this.mode = mode;
        this.schedulingBufferTime = schedulingBufferTime;
    }

    private PolicyPredictiveScalingConfigurationGetArgs() {
        this.maxCapacityBreachBehavior = Output.empty();
        this.maxCapacityBuffer = Output.empty();
        this.metricSpecification = Output.empty();
        this.mode = Output.empty();
        this.schedulingBufferTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyPredictiveScalingConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> maxCapacityBreachBehavior;
        private @Nullable Output<String> maxCapacityBuffer;
        private Output<PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs> metricSpecification;
        private @Nullable Output<String> mode;
        private @Nullable Output<String> schedulingBufferTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyPredictiveScalingConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCapacityBreachBehavior = defaults.maxCapacityBreachBehavior;
    	      this.maxCapacityBuffer = defaults.maxCapacityBuffer;
    	      this.metricSpecification = defaults.metricSpecification;
    	      this.mode = defaults.mode;
    	      this.schedulingBufferTime = defaults.schedulingBufferTime;
        }

        public Builder maxCapacityBreachBehavior(@Nullable Output<String> maxCapacityBreachBehavior) {
            this.maxCapacityBreachBehavior = maxCapacityBreachBehavior;
            return this;
        }

        public Builder maxCapacityBreachBehavior(@Nullable String maxCapacityBreachBehavior) {
            this.maxCapacityBreachBehavior = Output.ofNullable(maxCapacityBreachBehavior);
            return this;
        }

        public Builder maxCapacityBuffer(@Nullable Output<String> maxCapacityBuffer) {
            this.maxCapacityBuffer = maxCapacityBuffer;
            return this;
        }

        public Builder maxCapacityBuffer(@Nullable String maxCapacityBuffer) {
            this.maxCapacityBuffer = Output.ofNullable(maxCapacityBuffer);
            return this;
        }

        public Builder metricSpecification(Output<PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs> metricSpecification) {
            this.metricSpecification = Objects.requireNonNull(metricSpecification);
            return this;
        }

        public Builder metricSpecification(PolicyPredictiveScalingConfigurationMetricSpecificationGetArgs metricSpecification) {
            this.metricSpecification = Output.of(Objects.requireNonNull(metricSpecification));
            return this;
        }

        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable String mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }

        public Builder schedulingBufferTime(@Nullable Output<String> schedulingBufferTime) {
            this.schedulingBufferTime = schedulingBufferTime;
            return this;
        }

        public Builder schedulingBufferTime(@Nullable String schedulingBufferTime) {
            this.schedulingBufferTime = Output.ofNullable(schedulingBufferTime);
            return this;
        }
        public PolicyPredictiveScalingConfigurationGetArgs build() {
            return new PolicyPredictiveScalingConfigurationGetArgs(maxCapacityBreachBehavior, maxCapacityBuffer, metricSpecification, mode, schedulingBufferTime);
        }
    }
}
