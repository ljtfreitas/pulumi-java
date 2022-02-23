// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appautoscaling.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyStepScalingPolicyConfigurationStepAdjustmentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyStepScalingPolicyConfigurationStepAdjustmentGetArgs Empty = new PolicyStepScalingPolicyConfigurationStepAdjustmentGetArgs();

    /**
     * The lower bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as negative infinity.
     * 
     */
    @InputImport(name="metricIntervalLowerBound")
    private final @Nullable Input<String> metricIntervalLowerBound;

    public Input<String> getMetricIntervalLowerBound() {
        return this.metricIntervalLowerBound == null ? Input.empty() : this.metricIntervalLowerBound;
    }

    /**
     * The upper bound for the difference between the alarm threshold and the CloudWatch metric. Without a value, AWS will treat this bound as infinity. The upper bound must be greater than the lower bound.
     * 
     */
    @InputImport(name="metricIntervalUpperBound")
    private final @Nullable Input<String> metricIntervalUpperBound;

    public Input<String> getMetricIntervalUpperBound() {
        return this.metricIntervalUpperBound == null ? Input.empty() : this.metricIntervalUpperBound;
    }

    /**
     * The number of members by which to scale, when the adjustment bounds are breached. A positive value scales up. A negative value scales down.
     * 
     */
    @InputImport(name="scalingAdjustment", required=true)
    private final Input<Integer> scalingAdjustment;

    public Input<Integer> getScalingAdjustment() {
        return this.scalingAdjustment;
    }

    public PolicyStepScalingPolicyConfigurationStepAdjustmentGetArgs(
        @Nullable Input<String> metricIntervalLowerBound,
        @Nullable Input<String> metricIntervalUpperBound,
        Input<Integer> scalingAdjustment) {
        this.metricIntervalLowerBound = metricIntervalLowerBound;
        this.metricIntervalUpperBound = metricIntervalUpperBound;
        this.scalingAdjustment = Objects.requireNonNull(scalingAdjustment, "expected parameter 'scalingAdjustment' to be non-null");
    }

    private PolicyStepScalingPolicyConfigurationStepAdjustmentGetArgs() {
        this.metricIntervalLowerBound = Input.empty();
        this.metricIntervalUpperBound = Input.empty();
        this.scalingAdjustment = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyStepScalingPolicyConfigurationStepAdjustmentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> metricIntervalLowerBound;
        private @Nullable Input<String> metricIntervalUpperBound;
        private Input<Integer> scalingAdjustment;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyStepScalingPolicyConfigurationStepAdjustmentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricIntervalLowerBound = defaults.metricIntervalLowerBound;
    	      this.metricIntervalUpperBound = defaults.metricIntervalUpperBound;
    	      this.scalingAdjustment = defaults.scalingAdjustment;
        }

        public Builder setMetricIntervalLowerBound(@Nullable Input<String> metricIntervalLowerBound) {
            this.metricIntervalLowerBound = metricIntervalLowerBound;
            return this;
        }

        public Builder setMetricIntervalLowerBound(@Nullable String metricIntervalLowerBound) {
            this.metricIntervalLowerBound = Input.ofNullable(metricIntervalLowerBound);
            return this;
        }

        public Builder setMetricIntervalUpperBound(@Nullable Input<String> metricIntervalUpperBound) {
            this.metricIntervalUpperBound = metricIntervalUpperBound;
            return this;
        }

        public Builder setMetricIntervalUpperBound(@Nullable String metricIntervalUpperBound) {
            this.metricIntervalUpperBound = Input.ofNullable(metricIntervalUpperBound);
            return this;
        }

        public Builder setScalingAdjustment(Input<Integer> scalingAdjustment) {
            this.scalingAdjustment = Objects.requireNonNull(scalingAdjustment);
            return this;
        }

        public Builder setScalingAdjustment(Integer scalingAdjustment) {
            this.scalingAdjustment = Input.of(Objects.requireNonNull(scalingAdjustment));
            return this;
        }
        public PolicyStepScalingPolicyConfigurationStepAdjustmentGetArgs build() {
            return new PolicyStepScalingPolicyConfigurationStepAdjustmentGetArgs(metricIntervalLowerBound, metricIntervalUpperBound, scalingAdjustment);
        }
    }
}
