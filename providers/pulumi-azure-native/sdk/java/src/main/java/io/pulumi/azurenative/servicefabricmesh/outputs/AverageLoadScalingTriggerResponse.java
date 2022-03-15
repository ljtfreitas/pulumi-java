// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.AutoScalingResourceMetricResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AverageLoadScalingTriggerResponse {
    /**
     * Enumerates the triggers for auto scaling.
     * Expected value is 'AverageLoad'.
     * 
     */
    private final String kind;
    /**
     * Lower load threshold (if average load is below this threshold, service will scale down).
     * 
     */
    private final Double lowerLoadThreshold;
    /**
     * Description of the metric that is used for scaling.
     * 
     */
    private final AutoScalingResourceMetricResponse metric;
    /**
     * Scale interval that indicates how often will this trigger be checked.
     * 
     */
    private final Integer scaleIntervalInSeconds;
    /**
     * Upper load threshold (if average load is above this threshold, service will scale up).
     * 
     */
    private final Double upperLoadThreshold;

    @CustomType.Constructor
    private AverageLoadScalingTriggerResponse(
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("lowerLoadThreshold") Double lowerLoadThreshold,
        @CustomType.Parameter("metric") AutoScalingResourceMetricResponse metric,
        @CustomType.Parameter("scaleIntervalInSeconds") Integer scaleIntervalInSeconds,
        @CustomType.Parameter("upperLoadThreshold") Double upperLoadThreshold) {
        this.kind = kind;
        this.lowerLoadThreshold = lowerLoadThreshold;
        this.metric = metric;
        this.scaleIntervalInSeconds = scaleIntervalInSeconds;
        this.upperLoadThreshold = upperLoadThreshold;
    }

    /**
     * Enumerates the triggers for auto scaling.
     * Expected value is 'AverageLoad'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Lower load threshold (if average load is below this threshold, service will scale down).
     * 
    */
    public Double getLowerLoadThreshold() {
        return this.lowerLoadThreshold;
    }
    /**
     * Description of the metric that is used for scaling.
     * 
    */
    public AutoScalingResourceMetricResponse getMetric() {
        return this.metric;
    }
    /**
     * Scale interval that indicates how often will this trigger be checked.
     * 
    */
    public Integer getScaleIntervalInSeconds() {
        return this.scaleIntervalInSeconds;
    }
    /**
     * Upper load threshold (if average load is above this threshold, service will scale up).
     * 
    */
    public Double getUpperLoadThreshold() {
        return this.upperLoadThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AverageLoadScalingTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private Double lowerLoadThreshold;
        private AutoScalingResourceMetricResponse metric;
        private Integer scaleIntervalInSeconds;
        private Double upperLoadThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(AverageLoadScalingTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.lowerLoadThreshold = defaults.lowerLoadThreshold;
    	      this.metric = defaults.metric;
    	      this.scaleIntervalInSeconds = defaults.scaleIntervalInSeconds;
    	      this.upperLoadThreshold = defaults.upperLoadThreshold;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder lowerLoadThreshold(Double lowerLoadThreshold) {
            this.lowerLoadThreshold = Objects.requireNonNull(lowerLoadThreshold);
            return this;
        }

        public Builder metric(AutoScalingResourceMetricResponse metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder scaleIntervalInSeconds(Integer scaleIntervalInSeconds) {
            this.scaleIntervalInSeconds = Objects.requireNonNull(scaleIntervalInSeconds);
            return this;
        }

        public Builder upperLoadThreshold(Double upperLoadThreshold) {
            this.upperLoadThreshold = Objects.requireNonNull(upperLoadThreshold);
            return this;
        }
        public AverageLoadScalingTriggerResponse build() {
            return new AverageLoadScalingTriggerResponse(kind, lowerLoadThreshold, metric, scaleIntervalInSeconds, upperLoadThreshold);
        }
    }
}
