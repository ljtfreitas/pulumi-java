// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appautoscaling.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs Empty = new PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs();

    /**
     * The metric type.
     * 
     */
    @InputImport(name="predefinedMetricType", required=true)
    private final Input<String> predefinedMetricType;

    public Input<String> getPredefinedMetricType() {
        return this.predefinedMetricType;
    }

    /**
     * Reserved for future use. Must be less than or equal to 1023 characters in length.
     * 
     */
    @InputImport(name="resourceLabel")
    private final @Nullable Input<String> resourceLabel;

    public Input<String> getResourceLabel() {
        return this.resourceLabel == null ? Input.empty() : this.resourceLabel;
    }

    public PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs(
        Input<String> predefinedMetricType,
        @Nullable Input<String> resourceLabel) {
        this.predefinedMetricType = Objects.requireNonNull(predefinedMetricType, "expected parameter 'predefinedMetricType' to be non-null");
        this.resourceLabel = resourceLabel;
    }

    private PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs() {
        this.predefinedMetricType = Input.empty();
        this.resourceLabel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> predefinedMetricType;
        private @Nullable Input<String> resourceLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predefinedMetricType = defaults.predefinedMetricType;
    	      this.resourceLabel = defaults.resourceLabel;
        }

        public Builder setPredefinedMetricType(Input<String> predefinedMetricType) {
            this.predefinedMetricType = Objects.requireNonNull(predefinedMetricType);
            return this;
        }

        public Builder setPredefinedMetricType(String predefinedMetricType) {
            this.predefinedMetricType = Input.of(Objects.requireNonNull(predefinedMetricType));
            return this;
        }

        public Builder setResourceLabel(@Nullable Input<String> resourceLabel) {
            this.resourceLabel = resourceLabel;
            return this;
        }

        public Builder setResourceLabel(@Nullable String resourceLabel) {
            this.resourceLabel = Input.ofNullable(resourceLabel);
            return this;
        }
        public PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs build() {
            return new PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecificationArgs(predefinedMetricType, resourceLabel);
        }
    }
}
