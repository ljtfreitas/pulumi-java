// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataflow_v1b3.outputs.DisplayDataResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.ExecutionStageSummaryResponse;
import io.pulumi.googlenative.dataflow_v1b3.outputs.TransformSummaryResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class PipelineDescriptionResponse {
    /**
     * Pipeline level display data.
     * 
     */
    private final List<DisplayDataResponse> displayData;
    /**
     * Description of each stage of execution of the pipeline.
     * 
     */
    private final List<ExecutionStageSummaryResponse> executionPipelineStage;
    /**
     * Description of each transform in the pipeline and collections between them.
     * 
     */
    private final List<TransformSummaryResponse> originalPipelineTransform;

    @OutputCustomType.Constructor({"displayData","executionPipelineStage","originalPipelineTransform"})
    private PipelineDescriptionResponse(
        List<DisplayDataResponse> displayData,
        List<ExecutionStageSummaryResponse> executionPipelineStage,
        List<TransformSummaryResponse> originalPipelineTransform) {
        this.displayData = Objects.requireNonNull(displayData);
        this.executionPipelineStage = Objects.requireNonNull(executionPipelineStage);
        this.originalPipelineTransform = Objects.requireNonNull(originalPipelineTransform);
    }

    /**
     * Pipeline level display data.
     * 
     */
    public List<DisplayDataResponse> getDisplayData() {
        return this.displayData;
    }
    /**
     * Description of each stage of execution of the pipeline.
     * 
     */
    public List<ExecutionStageSummaryResponse> getExecutionPipelineStage() {
        return this.executionPipelineStage;
    }
    /**
     * Description of each transform in the pipeline and collections between them.
     * 
     */
    public List<TransformSummaryResponse> getOriginalPipelineTransform() {
        return this.originalPipelineTransform;
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
