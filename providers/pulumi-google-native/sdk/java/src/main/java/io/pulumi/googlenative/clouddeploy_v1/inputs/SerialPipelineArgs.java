// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.clouddeploy_v1.inputs.StageArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
 * 
 */
public final class SerialPipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final SerialPipelineArgs Empty = new SerialPipelineArgs();

    /**
     * Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
     * 
     */
    @InputImport(name="stages")
      private final @Nullable Input<List<StageArgs>> stages;

    public Input<List<StageArgs>> getStages() {
        return this.stages == null ? Input.empty() : this.stages;
    }

    public SerialPipelineArgs(@Nullable Input<List<StageArgs>> stages) {
        this.stages = stages;
    }

    private SerialPipelineArgs() {
        this.stages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SerialPipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<StageArgs>> stages;

        public Builder() {
    	      // Empty
        }

        public Builder(SerialPipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stages = defaults.stages;
        }

        public Builder setStages(@Nullable Input<List<StageArgs>> stages) {
            this.stages = stages;
            return this;
        }

        public Builder setStages(@Nullable List<StageArgs> stages) {
            this.stages = Input.ofNullable(stages);
            return this;
        }
        public SerialPipelineArgs build() {
            return new SerialPipelineArgs(stages);
        }
    }
}
