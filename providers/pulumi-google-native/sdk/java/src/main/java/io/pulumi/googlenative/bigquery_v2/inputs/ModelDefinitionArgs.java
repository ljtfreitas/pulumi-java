// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.bigquery_v2.inputs.BqmlTrainingRunArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.ModelDefinitionModelOptionsArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelDefinitionArgs Empty = new ModelDefinitionArgs();

    /**
     * [Output-only, Beta] Model options used for the first training run. These options are immutable for subsequent training runs. Default values are used for any options not specified in the input query.
     * 
     */
    @Import(name="modelOptions")
      private final @Nullable Output<ModelDefinitionModelOptionsArgs> modelOptions;

    public Output<ModelDefinitionModelOptionsArgs> getModelOptions() {
        return this.modelOptions == null ? Output.empty() : this.modelOptions;
    }

    /**
     * [Output-only, Beta] Information about ml training runs, each training run comprises of multiple iterations and there may be multiple training runs for the model if warm start is used or if a user decides to continue a previously cancelled query.
     * 
     */
    @Import(name="trainingRuns")
      private final @Nullable Output<List<BqmlTrainingRunArgs>> trainingRuns;

    public Output<List<BqmlTrainingRunArgs>> getTrainingRuns() {
        return this.trainingRuns == null ? Output.empty() : this.trainingRuns;
    }

    public ModelDefinitionArgs(
        @Nullable Output<ModelDefinitionModelOptionsArgs> modelOptions,
        @Nullable Output<List<BqmlTrainingRunArgs>> trainingRuns) {
        this.modelOptions = modelOptions;
        this.trainingRuns = trainingRuns;
    }

    private ModelDefinitionArgs() {
        this.modelOptions = Output.empty();
        this.trainingRuns = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ModelDefinitionModelOptionsArgs> modelOptions;
        private @Nullable Output<List<BqmlTrainingRunArgs>> trainingRuns;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modelOptions = defaults.modelOptions;
    	      this.trainingRuns = defaults.trainingRuns;
        }

        public Builder modelOptions(@Nullable Output<ModelDefinitionModelOptionsArgs> modelOptions) {
            this.modelOptions = modelOptions;
            return this;
        }

        public Builder modelOptions(@Nullable ModelDefinitionModelOptionsArgs modelOptions) {
            this.modelOptions = Output.ofNullable(modelOptions);
            return this;
        }

        public Builder trainingRuns(@Nullable Output<List<BqmlTrainingRunArgs>> trainingRuns) {
            this.trainingRuns = trainingRuns;
            return this;
        }

        public Builder trainingRuns(@Nullable List<BqmlTrainingRunArgs> trainingRuns) {
            this.trainingRuns = Output.ofNullable(trainingRuns);
            return this;
        }
        public ModelDefinitionArgs build() {
            return new ModelDefinitionArgs(modelOptions, trainingRuns);
        }
    }
}
