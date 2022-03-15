// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.AutoScalingResourceMetricArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * Lower load threshold (if average load is below this threshold, service will scale down).
     * 
     */
    @Import(name="lowerLoadThreshold", required=true)
      private final Output<Double> lowerLoadThreshold;

    public Output<Double> getLowerLoadThreshold() {
        return this.lowerLoadThreshold;
    }

    /**
     * Description of the metric that is used for scaling.
     * 
     */
    @Import(name="metric", required=true)
      private final Output<AutoScalingResourceMetricArgs> metric;

    public Output<AutoScalingResourceMetricArgs> getMetric() {
        return this.metric;
    }

    /**
     * Scale interval that indicates how often will this trigger be checked.
     * 
     */
    @Import(name="scaleIntervalInSeconds", required=true)
      private final Output<Integer> scaleIntervalInSeconds;

    public Output<Integer> getScaleIntervalInSeconds() {
        return this.scaleIntervalInSeconds;
    }

    /**
     * Upper load threshold (if average load is above this threshold, service will scale up).
     * 
     */
    @Import(name="upperLoadThreshold", required=true)
      private final Output<Double> upperLoadThreshold;

    public Output<Double> getUpperLoadThreshold() {
        return this.upperLoadThreshold;
    }

    public AverageLoadScalingTriggerArgs(
        Output<String> kind,
        Output<Double> lowerLoadThreshold,
        Output<AutoScalingResourceMetricArgs> metric,
        Output<Integer> scaleIntervalInSeconds,
        Output<Double> upperLoadThreshold) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.lowerLoadThreshold = Objects.requireNonNull(lowerLoadThreshold, "expected parameter 'lowerLoadThreshold' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
        this.scaleIntervalInSeconds = Objects.requireNonNull(scaleIntervalInSeconds, "expected parameter 'scaleIntervalInSeconds' to be non-null");
        this.upperLoadThreshold = Objects.requireNonNull(upperLoadThreshold, "expected parameter 'upperLoadThreshold' to be non-null");
    }

    private AverageLoadScalingTriggerArgs() {
        this.kind = Output.empty();
        this.lowerLoadThreshold = Output.empty();
        this.metric = Output.empty();
        this.scaleIntervalInSeconds = Output.empty();
        this.upperLoadThreshold = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AverageLoadScalingTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> kind;
        private Output<Double> lowerLoadThreshold;
        private Output<AutoScalingResourceMetricArgs> metric;
        private Output<Integer> scaleIntervalInSeconds;
        private Output<Double> upperLoadThreshold;

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

        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder lowerLoadThreshold(Output<Double> lowerLoadThreshold) {
            this.lowerLoadThreshold = Objects.requireNonNull(lowerLoadThreshold);
            return this;
        }

        public Builder lowerLoadThreshold(Double lowerLoadThreshold) {
            this.lowerLoadThreshold = Output.of(Objects.requireNonNull(lowerLoadThreshold));
            return this;
        }

        public Builder metric(Output<AutoScalingResourceMetricArgs> metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder metric(AutoScalingResourceMetricArgs metric) {
            this.metric = Output.of(Objects.requireNonNull(metric));
            return this;
        }

        public Builder scaleIntervalInSeconds(Output<Integer> scaleIntervalInSeconds) {
            this.scaleIntervalInSeconds = Objects.requireNonNull(scaleIntervalInSeconds);
            return this;
        }

        public Builder scaleIntervalInSeconds(Integer scaleIntervalInSeconds) {
            this.scaleIntervalInSeconds = Output.of(Objects.requireNonNull(scaleIntervalInSeconds));
            return this;
        }

        public Builder upperLoadThreshold(Output<Double> upperLoadThreshold) {
            this.upperLoadThreshold = Objects.requireNonNull(upperLoadThreshold);
            return this;
        }

        public Builder upperLoadThreshold(Double upperLoadThreshold) {
            this.upperLoadThreshold = Output.of(Objects.requireNonNull(upperLoadThreshold));
            return this;
        }
        public AverageLoadScalingTriggerArgs build() {
            return new AverageLoadScalingTriggerArgs(kind, lowerLoadThreshold, metric, scaleIntervalInSeconds, upperLoadThreshold);
        }
    }
}
