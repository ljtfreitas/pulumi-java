// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v3beta1.enums.GoogleCloudDialogflowCxV3beta1NluSettingsModelTrainingMode;
import io.pulumi.googlenative.dialogflow_v3beta1.enums.GoogleCloudDialogflowCxV3beta1NluSettingsModelType;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings related to NLU.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1NluSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1NluSettingsArgs Empty = new GoogleCloudDialogflowCxV3beta1NluSettingsArgs();

    /**
     * To filter out false positive results and still get variety in matched natural language inputs for your agent, you can tune the machine learning classification threshold. If the returned score value is less than the threshold value, then a no-match event will be triggered. The score values range from 0.0 (completely uncertain) to 1.0 (completely certain). If set to 0.0, the default of 0.3 is used.
     * 
     */
    @Import(name="classificationThreshold")
      private final @Nullable Output<Double> classificationThreshold;

    public Output<Double> getClassificationThreshold() {
        return this.classificationThreshold == null ? Output.empty() : this.classificationThreshold;
    }

    /**
     * Indicates NLU model training mode.
     * 
     */
    @Import(name="modelTrainingMode")
      private final @Nullable Output<GoogleCloudDialogflowCxV3beta1NluSettingsModelTrainingMode> modelTrainingMode;

    public Output<GoogleCloudDialogflowCxV3beta1NluSettingsModelTrainingMode> getModelTrainingMode() {
        return this.modelTrainingMode == null ? Output.empty() : this.modelTrainingMode;
    }

    /**
     * Indicates the type of NLU model.
     * 
     */
    @Import(name="modelType")
      private final @Nullable Output<GoogleCloudDialogflowCxV3beta1NluSettingsModelType> modelType;

    public Output<GoogleCloudDialogflowCxV3beta1NluSettingsModelType> getModelType() {
        return this.modelType == null ? Output.empty() : this.modelType;
    }

    public GoogleCloudDialogflowCxV3beta1NluSettingsArgs(
        @Nullable Output<Double> classificationThreshold,
        @Nullable Output<GoogleCloudDialogflowCxV3beta1NluSettingsModelTrainingMode> modelTrainingMode,
        @Nullable Output<GoogleCloudDialogflowCxV3beta1NluSettingsModelType> modelType) {
        this.classificationThreshold = classificationThreshold;
        this.modelTrainingMode = modelTrainingMode;
        this.modelType = modelType;
    }

    private GoogleCloudDialogflowCxV3beta1NluSettingsArgs() {
        this.classificationThreshold = Output.empty();
        this.modelTrainingMode = Output.empty();
        this.modelType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1NluSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> classificationThreshold;
        private @Nullable Output<GoogleCloudDialogflowCxV3beta1NluSettingsModelTrainingMode> modelTrainingMode;
        private @Nullable Output<GoogleCloudDialogflowCxV3beta1NluSettingsModelType> modelType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1NluSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classificationThreshold = defaults.classificationThreshold;
    	      this.modelTrainingMode = defaults.modelTrainingMode;
    	      this.modelType = defaults.modelType;
        }

        public Builder classificationThreshold(@Nullable Output<Double> classificationThreshold) {
            this.classificationThreshold = classificationThreshold;
            return this;
        }

        public Builder classificationThreshold(@Nullable Double classificationThreshold) {
            this.classificationThreshold = Output.ofNullable(classificationThreshold);
            return this;
        }

        public Builder modelTrainingMode(@Nullable Output<GoogleCloudDialogflowCxV3beta1NluSettingsModelTrainingMode> modelTrainingMode) {
            this.modelTrainingMode = modelTrainingMode;
            return this;
        }

        public Builder modelTrainingMode(@Nullable GoogleCloudDialogflowCxV3beta1NluSettingsModelTrainingMode modelTrainingMode) {
            this.modelTrainingMode = Output.ofNullable(modelTrainingMode);
            return this;
        }

        public Builder modelType(@Nullable Output<GoogleCloudDialogflowCxV3beta1NluSettingsModelType> modelType) {
            this.modelType = modelType;
            return this;
        }

        public Builder modelType(@Nullable GoogleCloudDialogflowCxV3beta1NluSettingsModelType modelType) {
            this.modelType = Output.ofNullable(modelType);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1NluSettingsArgs build() {
            return new GoogleCloudDialogflowCxV3beta1NluSettingsArgs(classificationThreshold, modelTrainingMode, modelType);
        }
    }
}
