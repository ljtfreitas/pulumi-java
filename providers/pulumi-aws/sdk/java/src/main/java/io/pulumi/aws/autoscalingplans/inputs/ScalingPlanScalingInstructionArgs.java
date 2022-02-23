// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscalingplans.inputs;

import io.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs;
import io.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationArgs;
import io.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScalingPlanScalingInstructionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScalingPlanScalingInstructionArgs Empty = new ScalingPlanScalingInstructionArgs();

    /**
     * The customized load metric to use for predictive scaling. You must specify either `customized_load_metric_specification` or `predefined_load_metric_specification` when configuring predictive scaling.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedLoadMetricSpecification.html).
     * 
     */
    @InputImport(name="customizedLoadMetricSpecification")
    private final @Nullable Input<ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs> customizedLoadMetricSpecification;

    public Input<ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs> getCustomizedLoadMetricSpecification() {
        return this.customizedLoadMetricSpecification == null ? Input.empty() : this.customizedLoadMetricSpecification;
    }

    /**
     * Boolean controlling whether dynamic scaling by AWS Auto Scaling is disabled. Defaults to `false`.
     * 
     */
    @InputImport(name="disableDynamicScaling")
    private final @Nullable Input<Boolean> disableDynamicScaling;

    public Input<Boolean> getDisableDynamicScaling() {
        return this.disableDynamicScaling == null ? Input.empty() : this.disableDynamicScaling;
    }

    /**
     * The maximum capacity of the resource. The exception to this upper limit is if you specify a non-default setting for `predictive_scaling_max_capacity_behavior`.
     * 
     */
    @InputImport(name="maxCapacity", required=true)
    private final Input<Integer> maxCapacity;

    public Input<Integer> getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * The minimum capacity of the resource.
     * 
     */
    @InputImport(name="minCapacity", required=true)
    private final Input<Integer> minCapacity;

    public Input<Integer> getMinCapacity() {
        return this.minCapacity;
    }

    /**
     * The predefined load metric to use for predictive scaling. You must specify either `predefined_load_metric_specification` or `customized_load_metric_specification` when configuring predictive scaling.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedLoadMetricSpecification.html).
     * 
     */
    @InputImport(name="predefinedLoadMetricSpecification")
    private final @Nullable Input<ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationArgs> predefinedLoadMetricSpecification;

    public Input<ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationArgs> getPredefinedLoadMetricSpecification() {
        return this.predefinedLoadMetricSpecification == null ? Input.empty() : this.predefinedLoadMetricSpecification;
    }

    /**
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds the maximum capacity specified for the resource.
     * Valid values: `SetForecastCapacityToMaxCapacity`, `SetMaxCapacityAboveForecastCapacity`, `SetMaxCapacityToForecastCapacity`.
     * 
     */
    @InputImport(name="predictiveScalingMaxCapacityBehavior")
    private final @Nullable Input<String> predictiveScalingMaxCapacityBehavior;

    public Input<String> getPredictiveScalingMaxCapacityBehavior() {
        return this.predictiveScalingMaxCapacityBehavior == null ? Input.empty() : this.predictiveScalingMaxCapacityBehavior;
    }

    /**
     * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the maximum capacity.
     * 
     */
    @InputImport(name="predictiveScalingMaxCapacityBuffer")
    private final @Nullable Input<Integer> predictiveScalingMaxCapacityBuffer;

    public Input<Integer> getPredictiveScalingMaxCapacityBuffer() {
        return this.predictiveScalingMaxCapacityBuffer == null ? Input.empty() : this.predictiveScalingMaxCapacityBuffer;
    }

    /**
     * The predictive scaling mode. Valid values: `ForecastAndScale`, `ForecastOnly`.
     * 
     */
    @InputImport(name="predictiveScalingMode")
    private final @Nullable Input<String> predictiveScalingMode;

    public Input<String> getPredictiveScalingMode() {
        return this.predictiveScalingMode == null ? Input.empty() : this.predictiveScalingMode;
    }

    /**
     * The ID of the resource. This string consists of the resource type and unique identifier.
     * 
     */
    @InputImport(name="resourceId", required=true)
    private final Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * The scalable dimension associated with the resource. Valid values: `autoscaling:autoScalingGroup:DesiredCapacity`, `dynamodb:index:ReadCapacityUnits`, `dynamodb:index:WriteCapacityUnits`, `dynamodb:table:ReadCapacityUnits`, `dynamodb:table:WriteCapacityUnits`, `ecs:service:DesiredCount`, `ec2:spot-fleet-request:TargetCapacity`, `rds:cluster:ReadReplicaCount`.
     * 
     */
    @InputImport(name="scalableDimension", required=true)
    private final Input<String> scalableDimension;

    public Input<String> getScalableDimension() {
        return this.scalableDimension;
    }

    /**
     * Controls whether a resource's externally created scaling policies are kept or replaced. Valid values: `KeepExternalPolicies`, `ReplaceExternalPolicies`. Defaults to `KeepExternalPolicies`.
     * 
     */
    @InputImport(name="scalingPolicyUpdateBehavior")
    private final @Nullable Input<String> scalingPolicyUpdateBehavior;

    public Input<String> getScalingPolicyUpdateBehavior() {
        return this.scalingPolicyUpdateBehavior == null ? Input.empty() : this.scalingPolicyUpdateBehavior;
    }

    /**
     * The amount of time, in seconds, to buffer the run time of scheduled scaling actions when scaling out.
     * 
     */
    @InputImport(name="scheduledActionBufferTime")
    private final @Nullable Input<Integer> scheduledActionBufferTime;

    public Input<Integer> getScheduledActionBufferTime() {
        return this.scheduledActionBufferTime == null ? Input.empty() : this.scheduledActionBufferTime;
    }

    /**
     * The namespace of the AWS service. Valid values: `autoscaling`, `dynamodb`, `ecs`, `ec2`, `rds`.
     * 
     */
    @InputImport(name="serviceNamespace", required=true)
    private final Input<String> serviceNamespace;

    public Input<String> getServiceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * The structure that defines new target tracking configurations. Each of these structures includes a specific scaling metric and a target value for the metric, along with various parameters to use with dynamic scaling.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_TargetTrackingConfiguration.html).
     * 
     */
    @InputImport(name="targetTrackingConfigurations", required=true)
    private final Input<List<ScalingPlanScalingInstructionTargetTrackingConfigurationArgs>> targetTrackingConfigurations;

    public Input<List<ScalingPlanScalingInstructionTargetTrackingConfigurationArgs>> getTargetTrackingConfigurations() {
        return this.targetTrackingConfigurations;
    }

    public ScalingPlanScalingInstructionArgs(
        @Nullable Input<ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs> customizedLoadMetricSpecification,
        @Nullable Input<Boolean> disableDynamicScaling,
        Input<Integer> maxCapacity,
        Input<Integer> minCapacity,
        @Nullable Input<ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationArgs> predefinedLoadMetricSpecification,
        @Nullable Input<String> predictiveScalingMaxCapacityBehavior,
        @Nullable Input<Integer> predictiveScalingMaxCapacityBuffer,
        @Nullable Input<String> predictiveScalingMode,
        Input<String> resourceId,
        Input<String> scalableDimension,
        @Nullable Input<String> scalingPolicyUpdateBehavior,
        @Nullable Input<Integer> scheduledActionBufferTime,
        Input<String> serviceNamespace,
        Input<List<ScalingPlanScalingInstructionTargetTrackingConfigurationArgs>> targetTrackingConfigurations) {
        this.customizedLoadMetricSpecification = customizedLoadMetricSpecification;
        this.disableDynamicScaling = disableDynamicScaling;
        this.maxCapacity = Objects.requireNonNull(maxCapacity, "expected parameter 'maxCapacity' to be non-null");
        this.minCapacity = Objects.requireNonNull(minCapacity, "expected parameter 'minCapacity' to be non-null");
        this.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
        this.predictiveScalingMaxCapacityBehavior = predictiveScalingMaxCapacityBehavior;
        this.predictiveScalingMaxCapacityBuffer = predictiveScalingMaxCapacityBuffer;
        this.predictiveScalingMode = predictiveScalingMode;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.scalableDimension = Objects.requireNonNull(scalableDimension, "expected parameter 'scalableDimension' to be non-null");
        this.scalingPolicyUpdateBehavior = scalingPolicyUpdateBehavior;
        this.scheduledActionBufferTime = scheduledActionBufferTime;
        this.serviceNamespace = Objects.requireNonNull(serviceNamespace, "expected parameter 'serviceNamespace' to be non-null");
        this.targetTrackingConfigurations = Objects.requireNonNull(targetTrackingConfigurations, "expected parameter 'targetTrackingConfigurations' to be non-null");
    }

    private ScalingPlanScalingInstructionArgs() {
        this.customizedLoadMetricSpecification = Input.empty();
        this.disableDynamicScaling = Input.empty();
        this.maxCapacity = Input.empty();
        this.minCapacity = Input.empty();
        this.predefinedLoadMetricSpecification = Input.empty();
        this.predictiveScalingMaxCapacityBehavior = Input.empty();
        this.predictiveScalingMaxCapacityBuffer = Input.empty();
        this.predictiveScalingMode = Input.empty();
        this.resourceId = Input.empty();
        this.scalableDimension = Input.empty();
        this.scalingPolicyUpdateBehavior = Input.empty();
        this.scheduledActionBufferTime = Input.empty();
        this.serviceNamespace = Input.empty();
        this.targetTrackingConfigurations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanScalingInstructionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs> customizedLoadMetricSpecification;
        private @Nullable Input<Boolean> disableDynamicScaling;
        private Input<Integer> maxCapacity;
        private Input<Integer> minCapacity;
        private @Nullable Input<ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationArgs> predefinedLoadMetricSpecification;
        private @Nullable Input<String> predictiveScalingMaxCapacityBehavior;
        private @Nullable Input<Integer> predictiveScalingMaxCapacityBuffer;
        private @Nullable Input<String> predictiveScalingMode;
        private Input<String> resourceId;
        private Input<String> scalableDimension;
        private @Nullable Input<String> scalingPolicyUpdateBehavior;
        private @Nullable Input<Integer> scheduledActionBufferTime;
        private Input<String> serviceNamespace;
        private Input<List<ScalingPlanScalingInstructionTargetTrackingConfigurationArgs>> targetTrackingConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanScalingInstructionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customizedLoadMetricSpecification = defaults.customizedLoadMetricSpecification;
    	      this.disableDynamicScaling = defaults.disableDynamicScaling;
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
    	      this.predefinedLoadMetricSpecification = defaults.predefinedLoadMetricSpecification;
    	      this.predictiveScalingMaxCapacityBehavior = defaults.predictiveScalingMaxCapacityBehavior;
    	      this.predictiveScalingMaxCapacityBuffer = defaults.predictiveScalingMaxCapacityBuffer;
    	      this.predictiveScalingMode = defaults.predictiveScalingMode;
    	      this.resourceId = defaults.resourceId;
    	      this.scalableDimension = defaults.scalableDimension;
    	      this.scalingPolicyUpdateBehavior = defaults.scalingPolicyUpdateBehavior;
    	      this.scheduledActionBufferTime = defaults.scheduledActionBufferTime;
    	      this.serviceNamespace = defaults.serviceNamespace;
    	      this.targetTrackingConfigurations = defaults.targetTrackingConfigurations;
        }

        public Builder setCustomizedLoadMetricSpecification(@Nullable Input<ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs> customizedLoadMetricSpecification) {
            this.customizedLoadMetricSpecification = customizedLoadMetricSpecification;
            return this;
        }

        public Builder setCustomizedLoadMetricSpecification(@Nullable ScalingPlanScalingInstructionCustomizedLoadMetricSpecificationArgs customizedLoadMetricSpecification) {
            this.customizedLoadMetricSpecification = Input.ofNullable(customizedLoadMetricSpecification);
            return this;
        }

        public Builder setDisableDynamicScaling(@Nullable Input<Boolean> disableDynamicScaling) {
            this.disableDynamicScaling = disableDynamicScaling;
            return this;
        }

        public Builder setDisableDynamicScaling(@Nullable Boolean disableDynamicScaling) {
            this.disableDynamicScaling = Input.ofNullable(disableDynamicScaling);
            return this;
        }

        public Builder setMaxCapacity(Input<Integer> maxCapacity) {
            this.maxCapacity = Objects.requireNonNull(maxCapacity);
            return this;
        }

        public Builder setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = Input.of(Objects.requireNonNull(maxCapacity));
            return this;
        }

        public Builder setMinCapacity(Input<Integer> minCapacity) {
            this.minCapacity = Objects.requireNonNull(minCapacity);
            return this;
        }

        public Builder setMinCapacity(Integer minCapacity) {
            this.minCapacity = Input.of(Objects.requireNonNull(minCapacity));
            return this;
        }

        public Builder setPredefinedLoadMetricSpecification(@Nullable Input<ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationArgs> predefinedLoadMetricSpecification) {
            this.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
            return this;
        }

        public Builder setPredefinedLoadMetricSpecification(@Nullable ScalingPlanScalingInstructionPredefinedLoadMetricSpecificationArgs predefinedLoadMetricSpecification) {
            this.predefinedLoadMetricSpecification = Input.ofNullable(predefinedLoadMetricSpecification);
            return this;
        }

        public Builder setPredictiveScalingMaxCapacityBehavior(@Nullable Input<String> predictiveScalingMaxCapacityBehavior) {
            this.predictiveScalingMaxCapacityBehavior = predictiveScalingMaxCapacityBehavior;
            return this;
        }

        public Builder setPredictiveScalingMaxCapacityBehavior(@Nullable String predictiveScalingMaxCapacityBehavior) {
            this.predictiveScalingMaxCapacityBehavior = Input.ofNullable(predictiveScalingMaxCapacityBehavior);
            return this;
        }

        public Builder setPredictiveScalingMaxCapacityBuffer(@Nullable Input<Integer> predictiveScalingMaxCapacityBuffer) {
            this.predictiveScalingMaxCapacityBuffer = predictiveScalingMaxCapacityBuffer;
            return this;
        }

        public Builder setPredictiveScalingMaxCapacityBuffer(@Nullable Integer predictiveScalingMaxCapacityBuffer) {
            this.predictiveScalingMaxCapacityBuffer = Input.ofNullable(predictiveScalingMaxCapacityBuffer);
            return this;
        }

        public Builder setPredictiveScalingMode(@Nullable Input<String> predictiveScalingMode) {
            this.predictiveScalingMode = predictiveScalingMode;
            return this;
        }

        public Builder setPredictiveScalingMode(@Nullable String predictiveScalingMode) {
            this.predictiveScalingMode = Input.ofNullable(predictiveScalingMode);
            return this;
        }

        public Builder setResourceId(Input<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Input.of(Objects.requireNonNull(resourceId));
            return this;
        }

        public Builder setScalableDimension(Input<String> scalableDimension) {
            this.scalableDimension = Objects.requireNonNull(scalableDimension);
            return this;
        }

        public Builder setScalableDimension(String scalableDimension) {
            this.scalableDimension = Input.of(Objects.requireNonNull(scalableDimension));
            return this;
        }

        public Builder setScalingPolicyUpdateBehavior(@Nullable Input<String> scalingPolicyUpdateBehavior) {
            this.scalingPolicyUpdateBehavior = scalingPolicyUpdateBehavior;
            return this;
        }

        public Builder setScalingPolicyUpdateBehavior(@Nullable String scalingPolicyUpdateBehavior) {
            this.scalingPolicyUpdateBehavior = Input.ofNullable(scalingPolicyUpdateBehavior);
            return this;
        }

        public Builder setScheduledActionBufferTime(@Nullable Input<Integer> scheduledActionBufferTime) {
            this.scheduledActionBufferTime = scheduledActionBufferTime;
            return this;
        }

        public Builder setScheduledActionBufferTime(@Nullable Integer scheduledActionBufferTime) {
            this.scheduledActionBufferTime = Input.ofNullable(scheduledActionBufferTime);
            return this;
        }

        public Builder setServiceNamespace(Input<String> serviceNamespace) {
            this.serviceNamespace = Objects.requireNonNull(serviceNamespace);
            return this;
        }

        public Builder setServiceNamespace(String serviceNamespace) {
            this.serviceNamespace = Input.of(Objects.requireNonNull(serviceNamespace));
            return this;
        }

        public Builder setTargetTrackingConfigurations(Input<List<ScalingPlanScalingInstructionTargetTrackingConfigurationArgs>> targetTrackingConfigurations) {
            this.targetTrackingConfigurations = Objects.requireNonNull(targetTrackingConfigurations);
            return this;
        }

        public Builder setTargetTrackingConfigurations(List<ScalingPlanScalingInstructionTargetTrackingConfigurationArgs> targetTrackingConfigurations) {
            this.targetTrackingConfigurations = Input.of(Objects.requireNonNull(targetTrackingConfigurations));
            return this;
        }
        public ScalingPlanScalingInstructionArgs build() {
            return new ScalingPlanScalingInstructionArgs(customizedLoadMetricSpecification, disableDynamicScaling, maxCapacity, minCapacity, predefinedLoadMetricSpecification, predictiveScalingMaxCapacityBehavior, predictiveScalingMaxCapacityBuffer, predictiveScalingMode, resourceId, scalableDimension, scalingPolicyUpdateBehavior, scheduledActionBufferTime, serviceNamespace, targetTrackingConfigurations);
        }
    }
}
