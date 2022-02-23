// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.aws.autoscaling.inputs.PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyTargetTrackingConfigurationCustomizedMetricSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyTargetTrackingConfigurationCustomizedMetricSpecificationGetArgs Empty = new PolicyTargetTrackingConfigurationCustomizedMetricSpecificationGetArgs();

    /**
     * The dimensions of the metric.
     * 
     */
    @InputImport(name="metricDimensions")
    private final @Nullable Input<List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionGetArgs>> metricDimensions;

    public Input<List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionGetArgs>> getMetricDimensions() {
        return this.metricDimensions == null ? Input.empty() : this.metricDimensions;
    }

    /**
     * The name of the metric.
     * 
     */
    @InputImport(name="metricName", required=true)
    private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    /**
     * The namespace of the metric.
     * 
     */
    @InputImport(name="namespace", required=true)
    private final Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace;
    }

    /**
     * The statistic of the metric.
     * 
     */
    @InputImport(name="statistic", required=true)
    private final Input<String> statistic;

    public Input<String> getStatistic() {
        return this.statistic;
    }

    /**
     * The unit of the metric.
     * 
     */
    @InputImport(name="unit")
    private final @Nullable Input<String> unit;

    public Input<String> getUnit() {
        return this.unit == null ? Input.empty() : this.unit;
    }

    public PolicyTargetTrackingConfigurationCustomizedMetricSpecificationGetArgs(
        @Nullable Input<List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionGetArgs>> metricDimensions,
        Input<String> metricName,
        Input<String> namespace,
        Input<String> statistic,
        @Nullable Input<String> unit) {
        this.metricDimensions = metricDimensions;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
        this.statistic = Objects.requireNonNull(statistic, "expected parameter 'statistic' to be non-null");
        this.unit = unit;
    }

    private PolicyTargetTrackingConfigurationCustomizedMetricSpecificationGetArgs() {
        this.metricDimensions = Input.empty();
        this.metricName = Input.empty();
        this.namespace = Input.empty();
        this.statistic = Input.empty();
        this.unit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTargetTrackingConfigurationCustomizedMetricSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionGetArgs>> metricDimensions;
        private Input<String> metricName;
        private Input<String> namespace;
        private Input<String> statistic;
        private @Nullable Input<String> unit;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTargetTrackingConfigurationCustomizedMetricSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricDimensions = defaults.metricDimensions;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.statistic = defaults.statistic;
    	      this.unit = defaults.unit;
        }

        public Builder setMetricDimensions(@Nullable Input<List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionGetArgs>> metricDimensions) {
            this.metricDimensions = metricDimensions;
            return this;
        }

        public Builder setMetricDimensions(@Nullable List<PolicyTargetTrackingConfigurationCustomizedMetricSpecificationMetricDimensionGetArgs> metricDimensions) {
            this.metricDimensions = Input.ofNullable(metricDimensions);
            return this;
        }

        public Builder setMetricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder setNamespace(Input<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Input.of(Objects.requireNonNull(namespace));
            return this;
        }

        public Builder setStatistic(Input<String> statistic) {
            this.statistic = Objects.requireNonNull(statistic);
            return this;
        }

        public Builder setStatistic(String statistic) {
            this.statistic = Input.of(Objects.requireNonNull(statistic));
            return this;
        }

        public Builder setUnit(@Nullable Input<String> unit) {
            this.unit = unit;
            return this;
        }

        public Builder setUnit(@Nullable String unit) {
            this.unit = Input.ofNullable(unit);
            return this;
        }
        public PolicyTargetTrackingConfigurationCustomizedMetricSpecificationGetArgs build() {
            return new PolicyTargetTrackingConfigurationCustomizedMetricSpecificationGetArgs(metricDimensions, metricName, namespace, statistic, unit);
        }
    }
}
