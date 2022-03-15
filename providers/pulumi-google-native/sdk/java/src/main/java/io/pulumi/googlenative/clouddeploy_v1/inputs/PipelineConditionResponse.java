// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.clouddeploy_v1.inputs.PipelineReadyConditionResponse;
import io.pulumi.googlenative.clouddeploy_v1.inputs.TargetsPresentConditionResponse;
import java.util.Objects;


/**
 * PipelineCondition contains all conditions relevant to a Delivery Pipeline.
 * 
 */
public final class PipelineConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final PipelineConditionResponse Empty = new PipelineConditionResponse();

    /**
     * Details around the Pipeline's overall status.
     * 
     */
    @Import(name="pipelineReadyCondition", required=true)
      private final PipelineReadyConditionResponse pipelineReadyCondition;

    public PipelineReadyConditionResponse getPipelineReadyCondition() {
        return this.pipelineReadyCondition;
    }

    /**
     * Detalis around targets enumerated in the pipeline.
     * 
     */
    @Import(name="targetsPresentCondition", required=true)
      private final TargetsPresentConditionResponse targetsPresentCondition;

    public TargetsPresentConditionResponse getTargetsPresentCondition() {
        return this.targetsPresentCondition;
    }

    public PipelineConditionResponse(
        PipelineReadyConditionResponse pipelineReadyCondition,
        TargetsPresentConditionResponse targetsPresentCondition) {
        this.pipelineReadyCondition = Objects.requireNonNull(pipelineReadyCondition, "expected parameter 'pipelineReadyCondition' to be non-null");
        this.targetsPresentCondition = Objects.requireNonNull(targetsPresentCondition, "expected parameter 'targetsPresentCondition' to be non-null");
    }

    private PipelineConditionResponse() {
        this.pipelineReadyCondition = null;
        this.targetsPresentCondition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineReadyConditionResponse pipelineReadyCondition;
        private TargetsPresentConditionResponse targetsPresentCondition;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineReadyCondition = defaults.pipelineReadyCondition;
    	      this.targetsPresentCondition = defaults.targetsPresentCondition;
        }

        public Builder pipelineReadyCondition(PipelineReadyConditionResponse pipelineReadyCondition) {
            this.pipelineReadyCondition = Objects.requireNonNull(pipelineReadyCondition);
            return this;
        }

        public Builder targetsPresentCondition(TargetsPresentConditionResponse targetsPresentCondition) {
            this.targetsPresentCondition = Objects.requireNonNull(targetsPresentCondition);
            return this;
        }
        public PipelineConditionResponse build() {
            return new PipelineConditionResponse(pipelineReadyCondition, targetsPresentCondition);
        }
    }
}
