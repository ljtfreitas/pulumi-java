// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPerfSampleSeriesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPerfSampleSeriesArgs Empty = new GetPerfSampleSeriesArgs();

    @InputImport(name="executionId", required=true)
    private final String executionId;

    public String getExecutionId() {
        return this.executionId;
    }

    @InputImport(name="historyId", required=true)
    private final String historyId;

    public String getHistoryId() {
        return this.historyId;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="sampleSeriesId", required=true)
    private final String sampleSeriesId;

    public String getSampleSeriesId() {
        return this.sampleSeriesId;
    }

    @InputImport(name="stepId", required=true)
    private final String stepId;

    public String getStepId() {
        return this.stepId;
    }

    public GetPerfSampleSeriesArgs(
        String executionId,
        String historyId,
        @Nullable String project,
        String sampleSeriesId,
        String stepId) {
        this.executionId = Objects.requireNonNull(executionId, "expected parameter 'executionId' to be non-null");
        this.historyId = Objects.requireNonNull(historyId, "expected parameter 'historyId' to be non-null");
        this.project = project;
        this.sampleSeriesId = Objects.requireNonNull(sampleSeriesId, "expected parameter 'sampleSeriesId' to be non-null");
        this.stepId = Objects.requireNonNull(stepId, "expected parameter 'stepId' to be non-null");
    }

    private GetPerfSampleSeriesArgs() {
        this.executionId = null;
        this.historyId = null;
        this.project = null;
        this.sampleSeriesId = null;
        this.stepId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPerfSampleSeriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String executionId;
        private String historyId;
        private @Nullable String project;
        private String sampleSeriesId;
        private String stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPerfSampleSeriesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionId = defaults.executionId;
    	      this.historyId = defaults.historyId;
    	      this.project = defaults.project;
    	      this.sampleSeriesId = defaults.sampleSeriesId;
    	      this.stepId = defaults.stepId;
        }

        public Builder setExecutionId(String executionId) {
            this.executionId = Objects.requireNonNull(executionId);
            return this;
        }

        public Builder setHistoryId(String historyId) {
            this.historyId = Objects.requireNonNull(historyId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setSampleSeriesId(String sampleSeriesId) {
            this.sampleSeriesId = Objects.requireNonNull(sampleSeriesId);
            return this;
        }

        public Builder setStepId(String stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }

        public GetPerfSampleSeriesArgs build() {
            return new GetPerfSampleSeriesArgs(executionId, historyId, project, sampleSeriesId, stepId);
        }
    }
}