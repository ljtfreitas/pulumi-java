// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.clouddeploy_v1.outputs.StageResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SerialPipelineResponse {
    /**
     * Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
     * 
     */
    private final List<StageResponse> stages;

    @OutputCustomType.Constructor({"stages"})
    private SerialPipelineResponse(List<StageResponse> stages) {
        this.stages = Objects.requireNonNull(stages);
    }

    /**
     * Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
     * 
     */
    public List<StageResponse> getStages() {
        return this.stages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SerialPipelineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<StageResponse> stages;

        public Builder() {
    	      // Empty
        }

        public Builder(SerialPipelineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stages = defaults.stages;
        }

        public Builder setStages(List<StageResponse> stages) {
            this.stages = Objects.requireNonNull(stages);
            return this;
        }
        public SerialPipelineResponse build() {
            return new SerialPipelineResponse(stages);
        }
    }
}
