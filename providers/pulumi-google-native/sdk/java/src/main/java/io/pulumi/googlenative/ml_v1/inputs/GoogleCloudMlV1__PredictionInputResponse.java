// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents input parameters for a prediction job.
 * 
 */
public final class GoogleCloudMlV1__PredictionInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__PredictionInputResponse Empty = new GoogleCloudMlV1__PredictionInputResponse();

    /**
     * Optional. Number of records per batch, defaults to 64. The service will buffer batch_size number of records in memory before invoking one Tensorflow prediction call internally. So take the record size and memory available into consideration when setting this parameter.
     * 
     */
    @Import(name="batchSize", required=true)
      private final String batchSize;

    public String getBatchSize() {
        return this.batchSize;
    }

    /**
     * The format of the input data files.
     * 
     */
    @Import(name="dataFormat", required=true)
      private final String dataFormat;

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * The Cloud Storage location of the input data files. May contain wildcards.
     * 
     */
    @Import(name="inputPaths", required=true)
      private final List<String> inputPaths;

    public List<String> getInputPaths() {
        return this.inputPaths;
    }

    /**
     * Optional. The maximum number of workers to be used for parallel processing. Defaults to 10 if not specified.
     * 
     */
    @Import(name="maxWorkerCount", required=true)
      private final String maxWorkerCount;

    public String getMaxWorkerCount() {
        return this.maxWorkerCount;
    }

    /**
     * Use this field if you want to use the default version for the specified model. The string must use the following format: `"projects/YOUR_PROJECT/models/YOUR_MODEL"`
     * 
     */
    @Import(name="modelName", required=true)
      private final String modelName;

    public String getModelName() {
        return this.modelName;
    }

    /**
     * Optional. Format of the output data files, defaults to JSON.
     * 
     */
    @Import(name="outputDataFormat", required=true)
      private final String outputDataFormat;

    public String getOutputDataFormat() {
        return this.outputDataFormat;
    }

    /**
     * The output Google Cloud Storage location.
     * 
     */
    @Import(name="outputPath", required=true)
      private final String outputPath;

    public String getOutputPath() {
        return this.outputPath;
    }

    /**
     * The Google Compute Engine region to run the prediction job in. See the available regions for AI Platform services.
     * 
     */
    @Import(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    /**
     * Optional. The AI Platform runtime version to use for this batch prediction. If not set, AI Platform will pick the runtime version used during the CreateVersion request for this model version, or choose the latest stable version when model version information is not available such as when the model is specified by uri.
     * 
     */
    @Import(name="runtimeVersion", required=true)
      private final String runtimeVersion;

    public String getRuntimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Optional. The name of the signature defined in the SavedModel to use for this job. Please refer to [SavedModel](https://tensorflow.github.io/serving/serving_basic.html) for information about how to use signatures. Defaults to [DEFAULT_SERVING_SIGNATURE_DEF_KEY](https://www.tensorflow.org/api_docs/python/tf/saved_model/signature_constants) , which is "serving_default".
     * 
     */
    @Import(name="signatureName", required=true)
      private final String signatureName;

    public String getSignatureName() {
        return this.signatureName;
    }

    /**
     * Use this field if you want to specify a Google Cloud Storage path for the model to use.
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String getUri() {
        return this.uri;
    }

    /**
     * Use this field if you want to specify a version of the model to use. The string is formatted the same way as `model_version`, with the addition of the version information: `"projects/YOUR_PROJECT/models/YOUR_MODEL/versions/YOUR_VERSION"`
     * 
     */
    @Import(name="versionName", required=true)
      private final String versionName;

    public String getVersionName() {
        return this.versionName;
    }

    public GoogleCloudMlV1__PredictionInputResponse(
        String batchSize,
        String dataFormat,
        List<String> inputPaths,
        String maxWorkerCount,
        String modelName,
        String outputDataFormat,
        String outputPath,
        String region,
        String runtimeVersion,
        String signatureName,
        String uri,
        String versionName) {
        this.batchSize = Objects.requireNonNull(batchSize, "expected parameter 'batchSize' to be non-null");
        this.dataFormat = Objects.requireNonNull(dataFormat, "expected parameter 'dataFormat' to be non-null");
        this.inputPaths = Objects.requireNonNull(inputPaths, "expected parameter 'inputPaths' to be non-null");
        this.maxWorkerCount = Objects.requireNonNull(maxWorkerCount, "expected parameter 'maxWorkerCount' to be non-null");
        this.modelName = Objects.requireNonNull(modelName, "expected parameter 'modelName' to be non-null");
        this.outputDataFormat = Objects.requireNonNull(outputDataFormat, "expected parameter 'outputDataFormat' to be non-null");
        this.outputPath = Objects.requireNonNull(outputPath, "expected parameter 'outputPath' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.runtimeVersion = Objects.requireNonNull(runtimeVersion, "expected parameter 'runtimeVersion' to be non-null");
        this.signatureName = Objects.requireNonNull(signatureName, "expected parameter 'signatureName' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.versionName = Objects.requireNonNull(versionName, "expected parameter 'versionName' to be non-null");
    }

    private GoogleCloudMlV1__PredictionInputResponse() {
        this.batchSize = null;
        this.dataFormat = null;
        this.inputPaths = List.of();
        this.maxWorkerCount = null;
        this.modelName = null;
        this.outputDataFormat = null;
        this.outputPath = null;
        this.region = null;
        this.runtimeVersion = null;
        this.signatureName = null;
        this.uri = null;
        this.versionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__PredictionInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String batchSize;
        private String dataFormat;
        private List<String> inputPaths;
        private String maxWorkerCount;
        private String modelName;
        private String outputDataFormat;
        private String outputPath;
        private String region;
        private String runtimeVersion;
        private String signatureName;
        private String uri;
        private String versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__PredictionInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchSize = defaults.batchSize;
    	      this.dataFormat = defaults.dataFormat;
    	      this.inputPaths = defaults.inputPaths;
    	      this.maxWorkerCount = defaults.maxWorkerCount;
    	      this.modelName = defaults.modelName;
    	      this.outputDataFormat = defaults.outputDataFormat;
    	      this.outputPath = defaults.outputPath;
    	      this.region = defaults.region;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.signatureName = defaults.signatureName;
    	      this.uri = defaults.uri;
    	      this.versionName = defaults.versionName;
        }

        public Builder batchSize(String batchSize) {
            this.batchSize = Objects.requireNonNull(batchSize);
            return this;
        }

        public Builder dataFormat(String dataFormat) {
            this.dataFormat = Objects.requireNonNull(dataFormat);
            return this;
        }

        public Builder inputPaths(List<String> inputPaths) {
            this.inputPaths = Objects.requireNonNull(inputPaths);
            return this;
        }

        public Builder maxWorkerCount(String maxWorkerCount) {
            this.maxWorkerCount = Objects.requireNonNull(maxWorkerCount);
            return this;
        }

        public Builder modelName(String modelName) {
            this.modelName = Objects.requireNonNull(modelName);
            return this;
        }

        public Builder outputDataFormat(String outputDataFormat) {
            this.outputDataFormat = Objects.requireNonNull(outputDataFormat);
            return this;
        }

        public Builder outputPath(String outputPath) {
            this.outputPath = Objects.requireNonNull(outputPath);
            return this;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder runtimeVersion(String runtimeVersion) {
            this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
            return this;
        }

        public Builder signatureName(String signatureName) {
            this.signatureName = Objects.requireNonNull(signatureName);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder versionName(String versionName) {
            this.versionName = Objects.requireNonNull(versionName);
            return this;
        }
        public GoogleCloudMlV1__PredictionInputResponse build() {
            return new GoogleCloudMlV1__PredictionInputResponse(batchSize, dataFormat, inputPaths, maxWorkerCount, modelName, outputDataFormat, outputPath, region, runtimeVersion, signatureName, uri, versionName);
        }
    }
}
