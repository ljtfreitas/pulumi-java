// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.SecurityProfileBehaviorCriteria;
import io.pulumi.awsnative.iot.inputs.SecurityProfileMetricDimension;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A security profile behavior.
 * 
 */
public final class SecurityProfileBehavior extends io.pulumi.resources.InvokeArgs {

    public static final SecurityProfileBehavior Empty = new SecurityProfileBehavior();

    @InputImport(name="criteria")
        private final @Nullable SecurityProfileBehaviorCriteria criteria;

    public Optional<SecurityProfileBehaviorCriteria> getCriteria() {
        return this.criteria == null ? Optional.empty() : Optional.ofNullable(this.criteria);
    }

    /**
     * What is measured by the behavior.
     * 
     */
    @InputImport(name="metric")
        private final @Nullable String metric;

    public Optional<String> getMetric() {
        return this.metric == null ? Optional.empty() : Optional.ofNullable(this.metric);
    }

    @InputImport(name="metricDimension")
        private final @Nullable SecurityProfileMetricDimension metricDimension;

    public Optional<SecurityProfileMetricDimension> getMetricDimension() {
        return this.metricDimension == null ? Optional.empty() : Optional.ofNullable(this.metricDimension);
    }

    /**
     * The name for the behavior.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Manage Detect alarm SNS notifications by setting behavior notification to on or suppressed. Detect will continue to performing device behavior evaluations. However, suppressed alarms wouldn't be forwarded for SNS notification.
     * 
     */
    @InputImport(name="suppressAlerts")
        private final @Nullable Boolean suppressAlerts;

    public Optional<Boolean> getSuppressAlerts() {
        return this.suppressAlerts == null ? Optional.empty() : Optional.ofNullable(this.suppressAlerts);
    }

    public SecurityProfileBehavior(
        @Nullable SecurityProfileBehaviorCriteria criteria,
        @Nullable String metric,
        @Nullable SecurityProfileMetricDimension metricDimension,
        String name,
        @Nullable Boolean suppressAlerts) {
        this.criteria = criteria;
        this.metric = metric;
        this.metricDimension = metricDimension;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.suppressAlerts = suppressAlerts;
    }

    private SecurityProfileBehavior() {
        this.criteria = null;
        this.metric = null;
        this.metricDimension = null;
        this.name = null;
        this.suppressAlerts = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileBehavior defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SecurityProfileBehaviorCriteria criteria;
        private @Nullable String metric;
        private @Nullable SecurityProfileMetricDimension metricDimension;
        private String name;
        private @Nullable Boolean suppressAlerts;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileBehavior defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteria = defaults.criteria;
    	      this.metric = defaults.metric;
    	      this.metricDimension = defaults.metricDimension;
    	      this.name = defaults.name;
    	      this.suppressAlerts = defaults.suppressAlerts;
        }

        public Builder setCriteria(@Nullable SecurityProfileBehaviorCriteria criteria) {
            this.criteria = criteria;
            return this;
        }

        public Builder setMetric(@Nullable String metric) {
            this.metric = metric;
            return this;
        }

        public Builder setMetricDimension(@Nullable SecurityProfileMetricDimension metricDimension) {
            this.metricDimension = metricDimension;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSuppressAlerts(@Nullable Boolean suppressAlerts) {
            this.suppressAlerts = suppressAlerts;
            return this;
        }
        public SecurityProfileBehavior build() {
            return new SecurityProfileBehavior(criteria, metric, metricDimension, name, suppressAlerts);
        }
    }
}
