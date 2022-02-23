// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.SecurityProfileMetricDimension;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The metric you want to retain. Dimensions are optional.
 * 
 */
public final class SecurityProfileMetricToRetain extends io.pulumi.resources.InvokeArgs {

    public static final SecurityProfileMetricToRetain Empty = new SecurityProfileMetricToRetain();

    /**
     * What is measured by the behavior.
     * 
     */
    @InputImport(name="metric", required=true)
        private final String metric;

    public String getMetric() {
        return this.metric;
    }

    @InputImport(name="metricDimension")
        private final @Nullable SecurityProfileMetricDimension metricDimension;

    public Optional<SecurityProfileMetricDimension> getMetricDimension() {
        return this.metricDimension == null ? Optional.empty() : Optional.ofNullable(this.metricDimension);
    }

    public SecurityProfileMetricToRetain(
        String metric,
        @Nullable SecurityProfileMetricDimension metricDimension) {
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
        this.metricDimension = metricDimension;
    }

    private SecurityProfileMetricToRetain() {
        this.metric = null;
        this.metricDimension = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileMetricToRetain defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metric;
        private @Nullable SecurityProfileMetricDimension metricDimension;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileMetricToRetain defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.metricDimension = defaults.metricDimension;
        }

        public Builder setMetric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder setMetricDimension(@Nullable SecurityProfileMetricDimension metricDimension) {
            this.metricDimension = metricDimension;
            return this;
        }
        public SecurityProfileMetricToRetain build() {
            return new SecurityProfileMetricToRetain(metric, metricDimension);
        }
    }
}
