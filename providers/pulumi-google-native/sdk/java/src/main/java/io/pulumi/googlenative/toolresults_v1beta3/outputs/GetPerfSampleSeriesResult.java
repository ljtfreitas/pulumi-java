// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.BasicPerfSampleSeriesResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPerfSampleSeriesResult {
    /**
     * Basic series represented by a line chart
     * 
     */
    private final BasicPerfSampleSeriesResponse basicPerfSampleSeries;
    /**
     * A tool results execution ID.
     * 
     */
    private final String executionId;
    /**
     * A tool results history ID.
     * 
     */
    private final String historyId;
    /**
     * The cloud project
     * 
     */
    private final String project;
    /**
     * A sample series id
     * 
     */
    private final String sampleSeriesId;
    /**
     * A tool results step ID.
     * 
     */
    private final String stepId;

    @CustomType.Constructor
    private GetPerfSampleSeriesResult(
        @CustomType.Parameter("basicPerfSampleSeries") BasicPerfSampleSeriesResponse basicPerfSampleSeries,
        @CustomType.Parameter("executionId") String executionId,
        @CustomType.Parameter("historyId") String historyId,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("sampleSeriesId") String sampleSeriesId,
        @CustomType.Parameter("stepId") String stepId) {
        this.basicPerfSampleSeries = basicPerfSampleSeries;
        this.executionId = executionId;
        this.historyId = historyId;
        this.project = project;
        this.sampleSeriesId = sampleSeriesId;
        this.stepId = stepId;
    }

    /**
     * Basic series represented by a line chart
     * 
    */
    public BasicPerfSampleSeriesResponse getBasicPerfSampleSeries() {
        return this.basicPerfSampleSeries;
    }
    /**
     * A tool results execution ID.
     * 
    */
    public String getExecutionId() {
        return this.executionId;
    }
    /**
     * A tool results history ID.
     * 
    */
    public String getHistoryId() {
        return this.historyId;
    }
    /**
     * The cloud project
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * A sample series id
     * 
    */
    public String getSampleSeriesId() {
        return this.sampleSeriesId;
    }
    /**
     * A tool results step ID.
     * 
    */
    public String getStepId() {
        return this.stepId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPerfSampleSeriesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicPerfSampleSeriesResponse basicPerfSampleSeries;
        private String executionId;
        private String historyId;
        private String project;
        private String sampleSeriesId;
        private String stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPerfSampleSeriesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicPerfSampleSeries = defaults.basicPerfSampleSeries;
    	      this.executionId = defaults.executionId;
    	      this.historyId = defaults.historyId;
    	      this.project = defaults.project;
    	      this.sampleSeriesId = defaults.sampleSeriesId;
    	      this.stepId = defaults.stepId;
        }

        public Builder basicPerfSampleSeries(BasicPerfSampleSeriesResponse basicPerfSampleSeries) {
            this.basicPerfSampleSeries = Objects.requireNonNull(basicPerfSampleSeries);
            return this;
        }

        public Builder executionId(String executionId) {
            this.executionId = Objects.requireNonNull(executionId);
            return this;
        }

        public Builder historyId(String historyId) {
            this.historyId = Objects.requireNonNull(historyId);
            return this;
        }

        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder sampleSeriesId(String sampleSeriesId) {
            this.sampleSeriesId = Objects.requireNonNull(sampleSeriesId);
            return this;
        }

        public Builder stepId(String stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }
        public GetPerfSampleSeriesResult build() {
            return new GetPerfSampleSeriesResult(basicPerfSampleSeries, executionId, historyId, project, sampleSeriesId, stepId);
        }
    }
}
