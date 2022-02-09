// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.BasicPerfSampleSeriesArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PerfSampleSeriesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PerfSampleSeriesArgs Empty = new PerfSampleSeriesArgs();

    @InputImport(name="basicPerfSampleSeries")
    private final @Nullable Input<BasicPerfSampleSeriesArgs> basicPerfSampleSeries;

    public Input<BasicPerfSampleSeriesArgs> getBasicPerfSampleSeries() {
        return this.basicPerfSampleSeries == null ? Input.empty() : this.basicPerfSampleSeries;
    }

    @InputImport(name="executionId", required=true)
    private final Input<String> executionId;

    public Input<String> getExecutionId() {
        return this.executionId;
    }

    @InputImport(name="historyId", required=true)
    private final Input<String> historyId;

    public Input<String> getHistoryId() {
        return this.historyId;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="stepId", required=true)
    private final Input<String> stepId;

    public Input<String> getStepId() {
        return this.stepId;
    }

    public PerfSampleSeriesArgs(
        @Nullable Input<BasicPerfSampleSeriesArgs> basicPerfSampleSeries,
        Input<String> executionId,
        Input<String> historyId,
        @Nullable Input<String> project,
        Input<String> stepId) {
        this.basicPerfSampleSeries = basicPerfSampleSeries;
        this.executionId = Objects.requireNonNull(executionId, "expected parameter 'executionId' to be non-null");
        this.historyId = Objects.requireNonNull(historyId, "expected parameter 'historyId' to be non-null");
        this.project = project;
        this.stepId = Objects.requireNonNull(stepId, "expected parameter 'stepId' to be non-null");
    }

    private PerfSampleSeriesArgs() {
        this.basicPerfSampleSeries = Input.empty();
        this.executionId = Input.empty();
        this.historyId = Input.empty();
        this.project = Input.empty();
        this.stepId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerfSampleSeriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BasicPerfSampleSeriesArgs> basicPerfSampleSeries;
        private Input<String> executionId;
        private Input<String> historyId;
        private @Nullable Input<String> project;
        private Input<String> stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(PerfSampleSeriesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicPerfSampleSeries = defaults.basicPerfSampleSeries;
    	      this.executionId = defaults.executionId;
    	      this.historyId = defaults.historyId;
    	      this.project = defaults.project;
    	      this.stepId = defaults.stepId;
        }

        public Builder setBasicPerfSampleSeries(@Nullable Input<BasicPerfSampleSeriesArgs> basicPerfSampleSeries) {
            this.basicPerfSampleSeries = basicPerfSampleSeries;
            return this;
        }

        public Builder setBasicPerfSampleSeries(@Nullable BasicPerfSampleSeriesArgs basicPerfSampleSeries) {
            this.basicPerfSampleSeries = Input.ofNullable(basicPerfSampleSeries);
            return this;
        }

        public Builder setExecutionId(Input<String> executionId) {
            this.executionId = Objects.requireNonNull(executionId);
            return this;
        }

        public Builder setExecutionId(String executionId) {
            this.executionId = Input.of(Objects.requireNonNull(executionId));
            return this;
        }

        public Builder setHistoryId(Input<String> historyId) {
            this.historyId = Objects.requireNonNull(historyId);
            return this;
        }

        public Builder setHistoryId(String historyId) {
            this.historyId = Input.of(Objects.requireNonNull(historyId));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setStepId(Input<String> stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }

        public Builder setStepId(String stepId) {
            this.stepId = Input.of(Objects.requireNonNull(stepId));
            return this;
        }

        public PerfSampleSeriesArgs build() {
            return new PerfSampleSeriesArgs(basicPerfSampleSeries, executionId, historyId, project, stepId);
        }
    }
}