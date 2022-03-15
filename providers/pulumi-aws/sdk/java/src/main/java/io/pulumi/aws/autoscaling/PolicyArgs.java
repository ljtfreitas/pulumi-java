// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling;

import io.pulumi.aws.autoscaling.inputs.PolicyPredictiveScalingConfigurationArgs;
import io.pulumi.aws.autoscaling.inputs.PolicyStepAdjustmentArgs;
import io.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * Specifies whether the adjustment is an absolute number or a percentage of the current capacity. Valid values are `ChangeInCapacity`, `ExactCapacity`, and `PercentChangeInCapacity`.
     * 
     */
    @Import(name="adjustmentType")
      private final @Nullable Output<String> adjustmentType;

    public Output<String> getAdjustmentType() {
        return this.adjustmentType == null ? Output.empty() : this.adjustmentType;
    }

    /**
     * The name of the autoscaling group.
     * 
     */
    @Import(name="autoscalingGroupName", required=true)
      private final Output<String> autoscalingGroupName;

    public Output<String> getAutoscalingGroupName() {
        return this.autoscalingGroupName;
    }

    /**
     * The amount of time, in seconds, after a scaling activity completes and before the next scaling activity can start.
     * 
     */
    @Import(name="cooldown")
      private final @Nullable Output<Integer> cooldown;

    public Output<Integer> getCooldown() {
        return this.cooldown == null ? Output.empty() : this.cooldown;
    }

    /**
     * The estimated time, in seconds, until a newly launched instance will contribute CloudWatch metrics. Without a value, AWS will default to the group's specified cooldown period.
     * 
     */
    @Import(name="estimatedInstanceWarmup")
      private final @Nullable Output<Integer> estimatedInstanceWarmup;

    public Output<Integer> getEstimatedInstanceWarmup() {
        return this.estimatedInstanceWarmup == null ? Output.empty() : this.estimatedInstanceWarmup;
    }

    /**
     * The aggregation type for the policy's metrics. Valid values are "Minimum", "Maximum", and "Average". Without a value, AWS will treat the aggregation type as "Average".
     * 
     */
    @Import(name="metricAggregationType")
      private final @Nullable Output<String> metricAggregationType;

    public Output<String> getMetricAggregationType() {
        return this.metricAggregationType == null ? Output.empty() : this.metricAggregationType;
    }

    /**
     * Minimum value to scale by when `adjustment_type` is set to `PercentChangeInCapacity`.
     * 
     */
    @Import(name="minAdjustmentMagnitude")
      private final @Nullable Output<Integer> minAdjustmentMagnitude;

    public Output<Integer> getMinAdjustmentMagnitude() {
        return this.minAdjustmentMagnitude == null ? Output.empty() : this.minAdjustmentMagnitude;
    }

    /**
     * The name of the dimension.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The policy type, either "SimpleScaling", "StepScaling", "TargetTrackingScaling", or "PredictiveScaling". If this value isn't provided, AWS will default to "SimpleScaling."
     * 
     */
    @Import(name="policyType")
      private final @Nullable Output<String> policyType;

    public Output<String> getPolicyType() {
        return this.policyType == null ? Output.empty() : this.policyType;
    }

    /**
     * The predictive scaling policy configuration to use with Amazon EC2 Auto Scaling.
     * 
     */
    @Import(name="predictiveScalingConfiguration")
      private final @Nullable Output<PolicyPredictiveScalingConfigurationArgs> predictiveScalingConfiguration;

    public Output<PolicyPredictiveScalingConfigurationArgs> getPredictiveScalingConfiguration() {
        return this.predictiveScalingConfiguration == null ? Output.empty() : this.predictiveScalingConfiguration;
    }

    /**
     * The number of members by which to
     * scale, when the adjustment bounds are breached. A positive value scales
     * up. A negative value scales down.
     * 
     */
    @Import(name="scalingAdjustment")
      private final @Nullable Output<Integer> scalingAdjustment;

    public Output<Integer> getScalingAdjustment() {
        return this.scalingAdjustment == null ? Output.empty() : this.scalingAdjustment;
    }

    /**
     * A set of adjustments that manage
     * group scaling. These have the following structure:
     * 
     */
    @Import(name="stepAdjustments")
      private final @Nullable Output<List<PolicyStepAdjustmentArgs>> stepAdjustments;

    public Output<List<PolicyStepAdjustmentArgs>> getStepAdjustments() {
        return this.stepAdjustments == null ? Output.empty() : this.stepAdjustments;
    }

    /**
     * A target tracking policy. These have the following structure:
     * 
     */
    @Import(name="targetTrackingConfiguration")
      private final @Nullable Output<PolicyTargetTrackingConfigurationArgs> targetTrackingConfiguration;

    public Output<PolicyTargetTrackingConfigurationArgs> getTargetTrackingConfiguration() {
        return this.targetTrackingConfiguration == null ? Output.empty() : this.targetTrackingConfiguration;
    }

    public PolicyArgs(
        @Nullable Output<String> adjustmentType,
        Output<String> autoscalingGroupName,
        @Nullable Output<Integer> cooldown,
        @Nullable Output<Integer> estimatedInstanceWarmup,
        @Nullable Output<String> metricAggregationType,
        @Nullable Output<Integer> minAdjustmentMagnitude,
        @Nullable Output<String> name,
        @Nullable Output<String> policyType,
        @Nullable Output<PolicyPredictiveScalingConfigurationArgs> predictiveScalingConfiguration,
        @Nullable Output<Integer> scalingAdjustment,
        @Nullable Output<List<PolicyStepAdjustmentArgs>> stepAdjustments,
        @Nullable Output<PolicyTargetTrackingConfigurationArgs> targetTrackingConfiguration) {
        this.adjustmentType = adjustmentType;
        this.autoscalingGroupName = Objects.requireNonNull(autoscalingGroupName, "expected parameter 'autoscalingGroupName' to be non-null");
        this.cooldown = cooldown;
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        this.metricAggregationType = metricAggregationType;
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
        this.name = name;
        this.policyType = policyType;
        this.predictiveScalingConfiguration = predictiveScalingConfiguration;
        this.scalingAdjustment = scalingAdjustment;
        this.stepAdjustments = stepAdjustments;
        this.targetTrackingConfiguration = targetTrackingConfiguration;
    }

    private PolicyArgs() {
        this.adjustmentType = Output.empty();
        this.autoscalingGroupName = Output.empty();
        this.cooldown = Output.empty();
        this.estimatedInstanceWarmup = Output.empty();
        this.metricAggregationType = Output.empty();
        this.minAdjustmentMagnitude = Output.empty();
        this.name = Output.empty();
        this.policyType = Output.empty();
        this.predictiveScalingConfiguration = Output.empty();
        this.scalingAdjustment = Output.empty();
        this.stepAdjustments = Output.empty();
        this.targetTrackingConfiguration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> adjustmentType;
        private Output<String> autoscalingGroupName;
        private @Nullable Output<Integer> cooldown;
        private @Nullable Output<Integer> estimatedInstanceWarmup;
        private @Nullable Output<String> metricAggregationType;
        private @Nullable Output<Integer> minAdjustmentMagnitude;
        private @Nullable Output<String> name;
        private @Nullable Output<String> policyType;
        private @Nullable Output<PolicyPredictiveScalingConfigurationArgs> predictiveScalingConfiguration;
        private @Nullable Output<Integer> scalingAdjustment;
        private @Nullable Output<List<PolicyStepAdjustmentArgs>> stepAdjustments;
        private @Nullable Output<PolicyTargetTrackingConfigurationArgs> targetTrackingConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adjustmentType = defaults.adjustmentType;
    	      this.autoscalingGroupName = defaults.autoscalingGroupName;
    	      this.cooldown = defaults.cooldown;
    	      this.estimatedInstanceWarmup = defaults.estimatedInstanceWarmup;
    	      this.metricAggregationType = defaults.metricAggregationType;
    	      this.minAdjustmentMagnitude = defaults.minAdjustmentMagnitude;
    	      this.name = defaults.name;
    	      this.policyType = defaults.policyType;
    	      this.predictiveScalingConfiguration = defaults.predictiveScalingConfiguration;
    	      this.scalingAdjustment = defaults.scalingAdjustment;
    	      this.stepAdjustments = defaults.stepAdjustments;
    	      this.targetTrackingConfiguration = defaults.targetTrackingConfiguration;
        }

        public Builder adjustmentType(@Nullable Output<String> adjustmentType) {
            this.adjustmentType = adjustmentType;
            return this;
        }

        public Builder adjustmentType(@Nullable String adjustmentType) {
            this.adjustmentType = Output.ofNullable(adjustmentType);
            return this;
        }

        public Builder autoscalingGroupName(Output<String> autoscalingGroupName) {
            this.autoscalingGroupName = Objects.requireNonNull(autoscalingGroupName);
            return this;
        }

        public Builder autoscalingGroupName(String autoscalingGroupName) {
            this.autoscalingGroupName = Output.of(Objects.requireNonNull(autoscalingGroupName));
            return this;
        }

        public Builder cooldown(@Nullable Output<Integer> cooldown) {
            this.cooldown = cooldown;
            return this;
        }

        public Builder cooldown(@Nullable Integer cooldown) {
            this.cooldown = Output.ofNullable(cooldown);
            return this;
        }

        public Builder estimatedInstanceWarmup(@Nullable Output<Integer> estimatedInstanceWarmup) {
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }

        public Builder estimatedInstanceWarmup(@Nullable Integer estimatedInstanceWarmup) {
            this.estimatedInstanceWarmup = Output.ofNullable(estimatedInstanceWarmup);
            return this;
        }

        public Builder metricAggregationType(@Nullable Output<String> metricAggregationType) {
            this.metricAggregationType = metricAggregationType;
            return this;
        }

        public Builder metricAggregationType(@Nullable String metricAggregationType) {
            this.metricAggregationType = Output.ofNullable(metricAggregationType);
            return this;
        }

        public Builder minAdjustmentMagnitude(@Nullable Output<Integer> minAdjustmentMagnitude) {
            this.minAdjustmentMagnitude = minAdjustmentMagnitude;
            return this;
        }

        public Builder minAdjustmentMagnitude(@Nullable Integer minAdjustmentMagnitude) {
            this.minAdjustmentMagnitude = Output.ofNullable(minAdjustmentMagnitude);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder policyType(@Nullable Output<String> policyType) {
            this.policyType = policyType;
            return this;
        }

        public Builder policyType(@Nullable String policyType) {
            this.policyType = Output.ofNullable(policyType);
            return this;
        }

        public Builder predictiveScalingConfiguration(@Nullable Output<PolicyPredictiveScalingConfigurationArgs> predictiveScalingConfiguration) {
            this.predictiveScalingConfiguration = predictiveScalingConfiguration;
            return this;
        }

        public Builder predictiveScalingConfiguration(@Nullable PolicyPredictiveScalingConfigurationArgs predictiveScalingConfiguration) {
            this.predictiveScalingConfiguration = Output.ofNullable(predictiveScalingConfiguration);
            return this;
        }

        public Builder scalingAdjustment(@Nullable Output<Integer> scalingAdjustment) {
            this.scalingAdjustment = scalingAdjustment;
            return this;
        }

        public Builder scalingAdjustment(@Nullable Integer scalingAdjustment) {
            this.scalingAdjustment = Output.ofNullable(scalingAdjustment);
            return this;
        }

        public Builder stepAdjustments(@Nullable Output<List<PolicyStepAdjustmentArgs>> stepAdjustments) {
            this.stepAdjustments = stepAdjustments;
            return this;
        }

        public Builder stepAdjustments(@Nullable List<PolicyStepAdjustmentArgs> stepAdjustments) {
            this.stepAdjustments = Output.ofNullable(stepAdjustments);
            return this;
        }

        public Builder targetTrackingConfiguration(@Nullable Output<PolicyTargetTrackingConfigurationArgs> targetTrackingConfiguration) {
            this.targetTrackingConfiguration = targetTrackingConfiguration;
            return this;
        }

        public Builder targetTrackingConfiguration(@Nullable PolicyTargetTrackingConfigurationArgs targetTrackingConfiguration) {
            this.targetTrackingConfiguration = Output.ofNullable(targetTrackingConfiguration);
            return this;
        }
        public PolicyArgs build() {
            return new PolicyArgs(adjustmentType, autoscalingGroupName, cooldown, estimatedInstanceWarmup, metricAggregationType, minAdjustmentMagnitude, name, policyType, predictiveScalingConfiguration, scalingAdjustment, stepAdjustments, targetTrackingConfiguration);
        }
    }
}
