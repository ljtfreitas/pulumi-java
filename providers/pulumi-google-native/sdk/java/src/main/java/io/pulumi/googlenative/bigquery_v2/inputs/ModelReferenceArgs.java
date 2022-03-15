// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelReferenceArgs Empty = new ModelReferenceArgs();

    /**
     * [Required] The ID of the dataset containing this model.
     * 
     */
    @Import(name="datasetId")
      private final @Nullable Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId == null ? Output.empty() : this.datasetId;
    }

    /**
     * [Required] The ID of the model. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
     * 
     */
    @Import(name="modelId")
      private final @Nullable Output<String> modelId;

    public Output<String> getModelId() {
        return this.modelId == null ? Output.empty() : this.modelId;
    }

    /**
     * [Required] The ID of the project containing this model.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public ModelReferenceArgs(
        @Nullable Output<String> datasetId,
        @Nullable Output<String> modelId,
        @Nullable Output<String> project) {
        this.datasetId = datasetId;
        this.modelId = modelId;
        this.project = project;
    }

    private ModelReferenceArgs() {
        this.datasetId = Output.empty();
        this.modelId = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> datasetId;
        private @Nullable Output<String> modelId;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.modelId = defaults.modelId;
    	      this.project = defaults.project;
        }

        public Builder datasetId(@Nullable Output<String> datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(@Nullable String datasetId) {
            this.datasetId = Output.ofNullable(datasetId);
            return this;
        }

        public Builder modelId(@Nullable Output<String> modelId) {
            this.modelId = modelId;
            return this;
        }

        public Builder modelId(@Nullable String modelId) {
            this.modelId = Output.ofNullable(modelId);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public ModelReferenceArgs build() {
            return new ModelReferenceArgs(datasetId, modelId, project);
        }
    }
}
