// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.AutoScalingResourceMetricArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the average load trigger used for auto scaling.
 * 
 */
public final class AverageLoadScalingTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AverageLoadScalingTriggerArgs Empty = new AverageLoadScalingTriggerArgs();

    /**
     * Enumerates the triggers for auto scaling.
     * Expected value is 'AverageLoad'.
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * Lower load threshold (if average load is below this threshold, service will scale down).
     * 
     */
    @InputImport(name="lowerLoadThreshold", required=true)
    private final Input<Double> lowerLoadThreshold;

    public Input<Double> getLowerLoadThreshold() {
        return this.lowerLoadThreshold;
    }

    /**
     * Description of the metric that is used for scaling.
     * 
     */
    @InputImport(name="metric", required=true)
    private final Input<AutoScalingResourceMetricArgs> metric;

    public Input<AutoScalingResourceMetricArgs> getMetric() {
        return this.metric;
    }

    /**
     * Scale interval that indicates how often will this trigger be checked.
     * 
     */
    @InputImport(name="scaleIntervalInSeconds", required=true)
    private final Input<Integer> scaleIntervalInSeconds;

    public Input<Integer> getScaleIntervalInSeconds() {
        return this.scaleIntervalInSeconds;
    }

    /**
     * Upper load threshold (if average load is above this threshold, service will scale up).
     * 
     */
    @InputImport(name="upperLoadThreshold", required=true)
    private final Input<Double> upperLoadThreshold;

    public Input<Double> getUpperLoadThreshold() {
        return this.upperLoadThreshold;
    }

    public AverageLoadScalingTriggerArgs(
        Input<String> kind,
        Input<Double> lowerLoadThreshold,
        Input<AutoScalingResourceMetricArgs> metric,
        Input<Integer> scaleIntervalInSeconds,
        Input<Double> upperLoadThreshold) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.lowerLoadThreshold = Objects.requireNonNull(lowerLoadThreshold, "expected parameter 'lowerLoadThreshold' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
        this.scaleIntervalInSeconds = Objects.requireNonNull(scaleIntervalInSeconds, "expected parameter 'scaleIntervalInSeconds' to be non-null");
        this.upperLoadThreshold = Objects.requireNonNull(upperLoadThreshold, "expected parameter 'upperLoadThreshold' to be non-null");
    }

    private AverageLoadScalingTriggerArgs() {
        this.kind = Input.empty();
        this.lowerLoadThreshold = Input.empty();
        this.metric = Input.empty();
        this.scaleIntervalInSeconds = Input.empty();
        this.upperLoadThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AverageLoadScalingTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> kind;
        private Input<Double> lowerLoadThreshold;
        private Input<AutoScalingResourceMetricArgs> metric;
        private Input<Integer> scaleIntervalInSeconds;
        private Input<Double> upperLoadThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(AverageLoadScalingTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.lowerLoadThreshold = defaults.lowerLoadThreshold;
    	      this.metric = defaults.metric;
    	      this.scaleIntervalInSeconds = defaults.scaleIntervalInSeconds;
    	      this.upperLoadThreshold = defaults.upperLoadThreshold;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setLowerLoadThreshold(Input<Double> lowerLoadThreshold) {
            this.lowerLoadThreshold = Objects.requireNonNull(lowerLoadThreshold);
            return this;
        }

        public Builder setLowerLoadThreshold(Double lowerLoadThreshold) {
            this.lowerLoadThreshold = Input.of(Objects.requireNonNull(lowerLoadThreshold));
            return this;
        }

        public Builder setMetric(Input<AutoScalingResourceMetricArgs> metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder setMetric(AutoScalingResourceMetricArgs metric) {
            this.metric = Input.of(Objects.requireNonNull(metric));
            return this;
        }

        public Builder setScaleIntervalInSeconds(Input<Integer> scaleIntervalInSeconds) {
            this.scaleIntervalInSeconds = Objects.requireNonNull(scaleIntervalInSeconds);
            return this;
        }

        public Builder setScaleIntervalInSeconds(Integer scaleIntervalInSeconds) {
            this.scaleIntervalInSeconds = Input.of(Objects.requireNonNull(scaleIntervalInSeconds));
            return this;
        }

        public Builder setUpperLoadThreshold(Input<Double> upperLoadThreshold) {
            this.upperLoadThreshold = Objects.requireNonNull(upperLoadThreshold);
            return this;
        }

        public Builder setUpperLoadThreshold(Double upperLoadThreshold) {
            this.upperLoadThreshold = Input.of(Objects.requireNonNull(upperLoadThreshold));
            return this;
        }

        public AverageLoadScalingTriggerArgs build() {
            return new AverageLoadScalingTriggerArgs(kind, lowerLoadThreshold, metric, scaleIntervalInSeconds, upperLoadThreshold);
        }
    }
}
