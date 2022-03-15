// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appautoscaling.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification {
    /**
     * The metric type.
     * 
     */
    private final String predefinedMetricType;
    /**
     * Reserved for future use. Must be less than or equal to 1023 characters in length.
     * 
     */
    private final @Nullable String resourceLabel;

    @CustomType.Constructor
    private PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification(
        @CustomType.Parameter("predefinedMetricType") String predefinedMetricType,
        @CustomType.Parameter("resourceLabel") @Nullable String resourceLabel) {
        this.predefinedMetricType = predefinedMetricType;
        this.resourceLabel = resourceLabel;
    }

    /**
     * The metric type.
     * 
    */
    public String getPredefinedMetricType() {
        return this.predefinedMetricType;
    }
    /**
     * Reserved for future use. Must be less than or equal to 1023 characters in length.
     * 
    */
    public Optional<String> getResourceLabel() {
        return Optional.ofNullable(this.resourceLabel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String predefinedMetricType;
        private @Nullable String resourceLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predefinedMetricType = defaults.predefinedMetricType;
    	      this.resourceLabel = defaults.resourceLabel;
        }

        public Builder predefinedMetricType(String predefinedMetricType) {
            this.predefinedMetricType = Objects.requireNonNull(predefinedMetricType);
            return this;
        }

        public Builder resourceLabel(@Nullable String resourceLabel) {
            this.resourceLabel = resourceLabel;
            return this;
        }
        public PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification build() {
            return new PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification(predefinedMetricType, resourceLabel);
        }
    }
}
