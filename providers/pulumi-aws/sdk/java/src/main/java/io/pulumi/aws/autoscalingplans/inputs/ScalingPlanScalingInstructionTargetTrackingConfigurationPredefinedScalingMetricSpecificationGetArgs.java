// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscalingplans.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs Empty = new ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs();

    /**
     * The metric type. Valid values: `ALBRequestCountPerTarget`, `ASGAverageCPUUtilization`, `ASGAverageNetworkIn`, `ASGAverageNetworkOut`, `DynamoDBReadCapacityUtilization`, `DynamoDBWriteCapacityUtilization`, `ECSServiceAverageCPUUtilization`, `ECSServiceAverageMemoryUtilization`, `EC2SpotFleetRequestAverageCPUUtilization`, `EC2SpotFleetRequestAverageNetworkIn`, `EC2SpotFleetRequestAverageNetworkOut`, `RDSReaderAverageCPUUtilization`, `RDSReaderAverageDatabaseConnections`.
     * 
     */
    @Import(name="predefinedScalingMetricType", required=true)
      private final Output<String> predefinedScalingMetricType;

    public Output<String> getPredefinedScalingMetricType() {
        return this.predefinedScalingMetricType;
    }

    /**
     * Identifies the resource associated with the metric type.
     * 
     */
    @Import(name="resourceLabel")
      private final @Nullable Output<String> resourceLabel;

    public Output<String> getResourceLabel() {
        return this.resourceLabel == null ? Output.empty() : this.resourceLabel;
    }

    public ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs(
        Output<String> predefinedScalingMetricType,
        @Nullable Output<String> resourceLabel) {
        this.predefinedScalingMetricType = Objects.requireNonNull(predefinedScalingMetricType, "expected parameter 'predefinedScalingMetricType' to be non-null");
        this.resourceLabel = resourceLabel;
    }

    private ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs() {
        this.predefinedScalingMetricType = Output.empty();
        this.resourceLabel = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> predefinedScalingMetricType;
        private @Nullable Output<String> resourceLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predefinedScalingMetricType = defaults.predefinedScalingMetricType;
    	      this.resourceLabel = defaults.resourceLabel;
        }

        public Builder predefinedScalingMetricType(Output<String> predefinedScalingMetricType) {
            this.predefinedScalingMetricType = Objects.requireNonNull(predefinedScalingMetricType);
            return this;
        }

        public Builder predefinedScalingMetricType(String predefinedScalingMetricType) {
            this.predefinedScalingMetricType = Output.of(Objects.requireNonNull(predefinedScalingMetricType));
            return this;
        }

        public Builder resourceLabel(@Nullable Output<String> resourceLabel) {
            this.resourceLabel = resourceLabel;
            return this;
        }

        public Builder resourceLabel(@Nullable String resourceLabel) {
            this.resourceLabel = Output.ofNullable(resourceLabel);
            return this;
        }
        public ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs build() {
            return new ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs(predefinedScalingMetricType, resourceLabel);
        }
    }
}
