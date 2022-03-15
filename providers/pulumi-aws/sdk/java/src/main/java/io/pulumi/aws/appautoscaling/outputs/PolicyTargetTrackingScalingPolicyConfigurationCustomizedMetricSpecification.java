// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appautoscaling.outputs;

import io.pulumi.aws.appautoscaling.outputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification {
    /**
     * Configuration block(s) with the dimensions of the metric if the metric was published with dimensions. Detailed below.
     * 
     */
    private final @Nullable List<PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension> dimensions;
    /**
     * The name of the metric.
     * 
     */
    private final String metricName;
    /**
     * The namespace of the metric.
     * 
     */
    private final String namespace;
    /**
     * The statistic of the metric. Valid values: `Average`, `Minimum`, `Maximum`, `SampleCount`, and `Sum`.
     * 
     */
    private final String statistic;
    /**
     * The unit of the metric.
     * 
     */
    private final @Nullable String unit;

    @CustomType.Constructor
    private PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification(
        @CustomType.Parameter("dimensions") @Nullable List<PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension> dimensions,
        @CustomType.Parameter("metricName") String metricName,
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("statistic") String statistic,
        @CustomType.Parameter("unit") @Nullable String unit) {
        this.dimensions = dimensions;
        this.metricName = metricName;
        this.namespace = namespace;
        this.statistic = statistic;
        this.unit = unit;
    }

    /**
     * Configuration block(s) with the dimensions of the metric if the metric was published with dimensions. Detailed below.
     * 
    */
    public List<PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension> getDimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }
    /**
     * The name of the metric.
     * 
    */
    public String getMetricName() {
        return this.metricName;
    }
    /**
     * The namespace of the metric.
     * 
    */
    public String getNamespace() {
        return this.namespace;
    }
    /**
     * The statistic of the metric. Valid values: `Average`, `Minimum`, `Maximum`, `SampleCount`, and `Sum`.
     * 
    */
    public String getStatistic() {
        return this.statistic;
    }
    /**
     * The unit of the metric.
     * 
    */
    public Optional<String> getUnit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension> dimensions;
        private String metricName;
        private String namespace;
        private String statistic;
        private @Nullable String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.statistic = defaults.statistic;
    	      this.unit = defaults.unit;
        }

        public Builder dimensions(@Nullable List<PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder statistic(String statistic) {
            this.statistic = Objects.requireNonNull(statistic);
            return this;
        }

        public Builder unit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        public PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification build() {
            return new PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification(dimensions, metricName, namespace, statistic, unit);
        }
    }
}
