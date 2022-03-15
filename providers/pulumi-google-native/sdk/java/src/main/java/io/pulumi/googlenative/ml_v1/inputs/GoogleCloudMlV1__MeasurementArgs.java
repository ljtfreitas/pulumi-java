// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_Measurement_MetricArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A message representing a measurement.
 * 
 */
public final class GoogleCloudMlV1__MeasurementArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__MeasurementArgs Empty = new GoogleCloudMlV1__MeasurementArgs();

    /**
     * Provides a list of metrics that act as inputs into the objective function.
     * 
     */
    @Import(name="metrics")
      private final @Nullable Output<List<GoogleCloudMlV1_Measurement_MetricArgs>> metrics;

    public Output<List<GoogleCloudMlV1_Measurement_MetricArgs>> getMetrics() {
        return this.metrics == null ? Output.empty() : this.metrics;
    }

    /**
     * The number of steps a machine learning model has been trained for. Must be non-negative.
     * 
     */
    @Import(name="stepCount")
      private final @Nullable Output<String> stepCount;

    public Output<String> getStepCount() {
        return this.stepCount == null ? Output.empty() : this.stepCount;
    }

    public GoogleCloudMlV1__MeasurementArgs(
        @Nullable Output<List<GoogleCloudMlV1_Measurement_MetricArgs>> metrics,
        @Nullable Output<String> stepCount) {
        this.metrics = metrics;
        this.stepCount = stepCount;
    }

    private GoogleCloudMlV1__MeasurementArgs() {
        this.metrics = Output.empty();
        this.stepCount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__MeasurementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GoogleCloudMlV1_Measurement_MetricArgs>> metrics;
        private @Nullable Output<String> stepCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__MeasurementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metrics = defaults.metrics;
    	      this.stepCount = defaults.stepCount;
        }

        public Builder metrics(@Nullable Output<List<GoogleCloudMlV1_Measurement_MetricArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder metrics(@Nullable List<GoogleCloudMlV1_Measurement_MetricArgs> metrics) {
            this.metrics = Output.ofNullable(metrics);
            return this;
        }

        public Builder stepCount(@Nullable Output<String> stepCount) {
            this.stepCount = stepCount;
            return this;
        }

        public Builder stepCount(@Nullable String stepCount) {
            this.stepCount = Output.ofNullable(stepCount);
            return this;
        }
        public GoogleCloudMlV1__MeasurementArgs build() {
            return new GoogleCloudMlV1__MeasurementArgs(metrics, stepCount);
        }
    }
}
