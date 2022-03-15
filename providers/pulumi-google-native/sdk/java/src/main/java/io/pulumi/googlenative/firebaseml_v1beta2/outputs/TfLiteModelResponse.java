// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaseml_v1beta2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TfLiteModelResponse {
    /**
     * The AutoML model id referencing a model you created with the AutoML API. The name should have format 'projects//locations//models/' (This is the model resource name returned from the AutoML API)
     * 
     */
    private final String automlModel;
    /**
     * The TfLite file containing the model. (Stored in Google Cloud). The gcs_tflite_uri should have form: gs://some-bucket/some-model.tflite Note: If you update the file in the original location, it is necessary to call UpdateModel for ML to pick up and validate the updated file.
     * 
     */
    private final String gcsTfliteUri;
    /**
     * The size of the TFLite model
     * 
     */
    private final String sizeBytes;

    @CustomType.Constructor
    private TfLiteModelResponse(
        @CustomType.Parameter("automlModel") String automlModel,
        @CustomType.Parameter("gcsTfliteUri") String gcsTfliteUri,
        @CustomType.Parameter("sizeBytes") String sizeBytes) {
        this.automlModel = automlModel;
        this.gcsTfliteUri = gcsTfliteUri;
        this.sizeBytes = sizeBytes;
    }

    /**
     * The AutoML model id referencing a model you created with the AutoML API. The name should have format 'projects//locations//models/' (This is the model resource name returned from the AutoML API)
     * 
    */
    public String getAutomlModel() {
        return this.automlModel;
    }
    /**
     * The TfLite file containing the model. (Stored in Google Cloud). The gcs_tflite_uri should have form: gs://some-bucket/some-model.tflite Note: If you update the file in the original location, it is necessary to call UpdateModel for ML to pick up and validate the updated file.
     * 
    */
    public String getGcsTfliteUri() {
        return this.gcsTfliteUri;
    }
    /**
     * The size of the TFLite model
     * 
    */
    public String getSizeBytes() {
        return this.sizeBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TfLiteModelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automlModel;
        private String gcsTfliteUri;
        private String sizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(TfLiteModelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automlModel = defaults.automlModel;
    	      this.gcsTfliteUri = defaults.gcsTfliteUri;
    	      this.sizeBytes = defaults.sizeBytes;
        }

        public Builder automlModel(String automlModel) {
            this.automlModel = Objects.requireNonNull(automlModel);
            return this;
        }

        public Builder gcsTfliteUri(String gcsTfliteUri) {
            this.gcsTfliteUri = Objects.requireNonNull(gcsTfliteUri);
            return this;
        }

        public Builder sizeBytes(String sizeBytes) {
            this.sizeBytes = Objects.requireNonNull(sizeBytes);
            return this;
        }
        public TfLiteModelResponse build() {
            return new TfLiteModelResponse(automlModel, gcsTfliteUri, sizeBytes);
        }
    }
}
