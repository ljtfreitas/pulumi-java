// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataflow_v1b3.inputs.DisplayDataResponse;
import io.pulumi.googlenative.dataflow_v1b3.inputs.ExecutionStageSummaryResponse;
import io.pulumi.googlenative.dataflow_v1b3.inputs.TransformSummaryResponse;
import java.util.List;
import java.util.Objects;


/**
 * A descriptive representation of submitted pipeline as well as the executed form. This data is provided by the Dataflow service for ease of visualizing the pipeline and interpreting Dataflow provided metrics.
 * 
 */
public final class PipelineDescriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final PipelineDescriptionResponse Empty = new PipelineDescriptionResponse();

    /**
     * Pipeline level display data.
     * 
     */
    @InputImport(name="displayData", required=true)
      private final List<DisplayDataResponse> displayData;

    public List<DisplayDataResponse> getDisplayData() {
        return this.displayData;
    }

    /**
     * Description of each stage of execution of the pipeline.
     * 
     */
    @InputImport(name="executionPipelineStage", required=true)
      private final List<ExecutionStageSummaryResponse> executionPipelineStage;

    public List<ExecutionStageSummaryResponse> getExecutionPipelineStage() {
        return this.executionPipelineStage;
    }

    /**
     * Description of each transform in the pipeline and collections between them.
     * 
     */
    @InputImport(name="originalPipelineTransform", required=true)
      private final List<TransformSummaryResponse> originalPipelineTransform;

    public List<TransformSummaryResponse> getOriginalPipelineTransform() {
        return this.originalPipelineTransform;
    }

    public PipelineDescriptionResponse(
        List<DisplayDataResponse> displayData,
        List<ExecutionStageSummaryResponse> executionPipelineStage,
        List<TransformSummaryResponse> originalPipelineTransform) {
        this.displayData = Objects.requireNonNull(displayData, "expected parameter 'displayData' to be non-null");
        this.executionPipelineStage = Objects.requireNonNull(executionPipelineStage, "expected parameter 'executionPipelineStage' to be non-null");
        this.originalPipelineTransform = Objects.requireNonNull(originalPipelineTransform, "expected parameter 'originalPipelineTransform' to be non-null");
    }

    private PipelineDescriptionResponse() {
        this.displayData = List.of();
        this.executionPipelineStage = List.of();
        this.originalPipelineTransform = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DisplayDataResponse> displayData;
        private List<ExecutionStageSummaryResponse> executionPipelineStage;
        private List<TransformSummaryResponse> originalPipelineTransform;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayData = defaults.displayData;
    	      this.executionPipelineStage = defaults.executionPipelineStage;
    	      this.originalPipelineTransform = defaults.originalPipelineTransform;
        }

        public Builder setDisplayData(List<DisplayDataResponse> displayData) {
            this.displayData = Objects.requireNonNull(displayData);
            return this;
        }

        public Builder setExecutionPipelineStage(List<ExecutionStageSummaryResponse> executionPipelineStage) {
            this.executionPipelineStage = Objects.requireNonNull(executionPipelineStage);
            return this;
        }

        public Builder setOriginalPipelineTransform(List<TransformSummaryResponse> originalPipelineTransform) {
            this.originalPipelineTransform = Objects.requireNonNull(originalPipelineTransform);
            return this;
        }
        public PipelineDescriptionResponse build() {
            return new PipelineDescriptionResponse(displayData, executionPipelineStage, originalPipelineTransform);
        }
    }
}
