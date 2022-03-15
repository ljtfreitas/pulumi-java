// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscalerAutoscalingPolicyCpuUtilization {
    /**
     * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are:
     * - NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics.
     * - OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * 
     */
    private final @Nullable String predictiveMethod;
    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    private final Double target;

    @CustomType.Constructor
    private AutoscalerAutoscalingPolicyCpuUtilization(
        @CustomType.Parameter("predictiveMethod") @Nullable String predictiveMethod,
        @CustomType.Parameter("target") Double target) {
        this.predictiveMethod = predictiveMethod;
        this.target = target;
    }

    /**
     * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are:
     * - NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics.
     * - OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * 
    */
    public Optional<String> getPredictiveMethod() {
        return Optional.ofNullable(this.predictiveMethod);
    }
    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
    */
    public Double getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerAutoscalingPolicyCpuUtilization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String predictiveMethod;
        private Double target;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerAutoscalingPolicyCpuUtilization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predictiveMethod = defaults.predictiveMethod;
    	      this.target = defaults.target;
        }

        public Builder predictiveMethod(@Nullable String predictiveMethod) {
            this.predictiveMethod = predictiveMethod;
            return this;
        }

        public Builder target(Double target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public AutoscalerAutoscalingPolicyCpuUtilization build() {
            return new AutoscalerAutoscalingPolicyCpuUtilization(predictiveMethod, target);
        }
    }
}
