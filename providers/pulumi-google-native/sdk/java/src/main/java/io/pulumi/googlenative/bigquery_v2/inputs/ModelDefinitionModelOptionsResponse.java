// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * [Output-only, Beta] Model options used for the first training run. These options are immutable for subsequent training runs. Default values are used for any options not specified in the input query.
 * 
 */
public final class ModelDefinitionModelOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ModelDefinitionModelOptionsResponse Empty = new ModelDefinitionModelOptionsResponse();

    @InputImport(name="labels", required=true)
      private final List<String> labels;

    public List<String> getLabels() {
        return this.labels;
    }

    @InputImport(name="lossType", required=true)
      private final String lossType;

    public String getLossType() {
        return this.lossType;
    }

    @InputImport(name="modelType", required=true)
      private final String modelType;

    public String getModelType() {
        return this.modelType;
    }

    public ModelDefinitionModelOptionsResponse(
        List<String> labels,
        String lossType,
        String modelType) {
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.lossType = Objects.requireNonNull(lossType, "expected parameter 'lossType' to be non-null");
        this.modelType = Objects.requireNonNull(modelType, "expected parameter 'modelType' to be non-null");
    }

    private ModelDefinitionModelOptionsResponse() {
        this.labels = List.of();
        this.lossType = null;
        this.modelType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelDefinitionModelOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> labels;
        private String lossType;
        private String modelType;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelDefinitionModelOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.lossType = defaults.lossType;
    	      this.modelType = defaults.modelType;
        }

        public Builder setLabels(List<String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLossType(String lossType) {
            this.lossType = Objects.requireNonNull(lossType);
            return this;
        }

        public Builder setModelType(String modelType) {
            this.modelType = Objects.requireNonNull(modelType);
            return this;
        }
        public ModelDefinitionModelOptionsResponse build() {
            return new ModelDefinitionModelOptionsResponse(labels, lossType, modelType);
        }
    }
}
