// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ExperimentResultMetricArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Version variant and associated metrics.
 * 
 */
public final class GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs Empty = new GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs();

    /**
     * The metrics and corresponding confidence intervals in the inference result.
     * 
     */
    @InputImport(name="metrics")
      private final @Nullable Input<List<GoogleCloudDialogflowCxV3ExperimentResultMetricArgs>> metrics;

    public Input<List<GoogleCloudDialogflowCxV3ExperimentResultMetricArgs>> getMetrics() {
        return this.metrics == null ? Input.empty() : this.metrics;
    }

    /**
     * Number of sessions that were allocated to this version.
     * 
     */
    @InputImport(name="sessionCount")
      private final @Nullable Input<Integer> sessionCount;

    public Input<Integer> getSessionCount() {
        return this.sessionCount == null ? Input.empty() : this.sessionCount;
    }

    /**
     * The name of the flow Version. Format: `projects//locations//agents//flows//versions/`.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs(
        @Nullable Input<List<GoogleCloudDialogflowCxV3ExperimentResultMetricArgs>> metrics,
        @Nullable Input<Integer> sessionCount,
        @Nullable Input<String> version) {
        this.metrics = metrics;
        this.sessionCount = sessionCount;
        this.version = version;
    }

    private GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs() {
        this.metrics = Input.empty();
        this.sessionCount = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GoogleCloudDialogflowCxV3ExperimentResultMetricArgs>> metrics;
        private @Nullable Input<Integer> sessionCount;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metrics = defaults.metrics;
    	      this.sessionCount = defaults.sessionCount;
    	      this.version = defaults.version;
        }

        public Builder setMetrics(@Nullable Input<List<GoogleCloudDialogflowCxV3ExperimentResultMetricArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setMetrics(@Nullable List<GoogleCloudDialogflowCxV3ExperimentResultMetricArgs> metrics) {
            this.metrics = Input.ofNullable(metrics);
            return this;
        }

        public Builder setSessionCount(@Nullable Input<Integer> sessionCount) {
            this.sessionCount = sessionCount;
            return this;
        }

        public Builder setSessionCount(@Nullable Integer sessionCount) {
            this.sessionCount = Input.ofNullable(sessionCount);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs build() {
            return new GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs(metrics, sessionCount, version);
        }
    }
}
