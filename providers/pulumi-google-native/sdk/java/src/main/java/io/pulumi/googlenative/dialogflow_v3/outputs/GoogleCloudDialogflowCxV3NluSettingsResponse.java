// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3NluSettingsResponse {
    /**
     * To filter out false positive results and still get variety in matched natural language inputs for your agent, you can tune the machine learning classification threshold. If the returned score value is less than the threshold value, then a no-match event will be triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the default of 0.3 is used.
     * 
     */
    private final Double classificationThreshold;
    /**
     * Indicates NLU model training mode.
     * 
     */
    private final String modelTrainingMode;
    /**
     * Indicates the type of NLU model.
     * 
     */
    private final String modelType;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3NluSettingsResponse(
        @CustomType.Parameter("classificationThreshold") Double classificationThreshold,
        @CustomType.Parameter("modelTrainingMode") String modelTrainingMode,
        @CustomType.Parameter("modelType") String modelType) {
        this.classificationThreshold = classificationThreshold;
        this.modelTrainingMode = modelTrainingMode;
        this.modelType = modelType;
    }

    /**
     * To filter out false positive results and still get variety in matched natural language inputs for your agent, you can tune the machine learning classification threshold. If the returned score value is less than the threshold value, then a no-match event will be triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the default of 0.3 is used.
     * 
    */
    public Double getClassificationThreshold() {
        return this.classificationThreshold;
    }
    /**
     * Indicates NLU model training mode.
     * 
    */
    public String getModelTrainingMode() {
        return this.modelTrainingMode;
    }
    /**
     * Indicates the type of NLU model.
     * 
    */
    public String getModelType() {
        return this.modelType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3NluSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double classificationThreshold;
        private String modelTrainingMode;
        private String modelType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3NluSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classificationThreshold = defaults.classificationThreshold;
    	      this.modelTrainingMode = defaults.modelTrainingMode;
    	      this.modelType = defaults.modelType;
        }

        public Builder classificationThreshold(Double classificationThreshold) {
            this.classificationThreshold = Objects.requireNonNull(classificationThreshold);
            return this;
        }

        public Builder modelTrainingMode(String modelTrainingMode) {
            this.modelTrainingMode = Objects.requireNonNull(modelTrainingMode);
            return this;
        }

        public Builder modelType(String modelType) {
            this.modelType = Objects.requireNonNull(modelType);
            return this;
        }
        public GoogleCloudDialogflowCxV3NluSettingsResponse build() {
            return new GoogleCloudDialogflowCxV3NluSettingsResponse(classificationThreshold, modelTrainingMode, modelType);
        }
    }
}
