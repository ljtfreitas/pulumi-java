// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.ml_v1.enums.GoogleCloudMlV1_StudyConfig_MetricSpecGoal;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a metric to optimize.
 * 
 */
public final class GoogleCloudMlV1_StudyConfig_MetricSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1_StudyConfig_MetricSpecArgs Empty = new GoogleCloudMlV1_StudyConfig_MetricSpecArgs();

    /**
     * The optimization goal of the metric.
     * 
     */
    @Import(name="goal", required=true)
      private final Output<GoogleCloudMlV1_StudyConfig_MetricSpecGoal> goal;

    public Output<GoogleCloudMlV1_StudyConfig_MetricSpecGoal> getGoal() {
        return this.goal;
    }

    /**
     * The name of the metric.
     * 
     */
    @Import(name="metric", required=true)
      private final Output<String> metric;

    public Output<String> getMetric() {
        return this.metric;
    }

    public GoogleCloudMlV1_StudyConfig_MetricSpecArgs(
        Output<GoogleCloudMlV1_StudyConfig_MetricSpecGoal> goal,
        Output<String> metric) {
        this.goal = Objects.requireNonNull(goal, "expected parameter 'goal' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
    }

    private GoogleCloudMlV1_StudyConfig_MetricSpecArgs() {
        this.goal = Output.empty();
        this.metric = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfig_MetricSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GoogleCloudMlV1_StudyConfig_MetricSpecGoal> goal;
        private Output<String> metric;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfig_MetricSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.goal = defaults.goal;
    	      this.metric = defaults.metric;
        }

        public Builder goal(Output<GoogleCloudMlV1_StudyConfig_MetricSpecGoal> goal) {
            this.goal = Objects.requireNonNull(goal);
            return this;
        }

        public Builder goal(GoogleCloudMlV1_StudyConfig_MetricSpecGoal goal) {
            this.goal = Output.of(Objects.requireNonNull(goal));
            return this;
        }

        public Builder metric(Output<String> metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder metric(String metric) {
            this.metric = Output.of(Objects.requireNonNull(metric));
            return this;
        }
        public GoogleCloudMlV1_StudyConfig_MetricSpecArgs build() {
            return new GoogleCloudMlV1_StudyConfig_MetricSpecArgs(goal, metric);
        }
    }
}
