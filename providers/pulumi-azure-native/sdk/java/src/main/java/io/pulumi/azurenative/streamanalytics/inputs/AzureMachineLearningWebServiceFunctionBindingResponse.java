// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.inputs.AzureMachineLearningWebServiceInputsResponse;
import io.pulumi.azurenative.streamanalytics.inputs.AzureMachineLearningWebServiceOutputColumnResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The binding to an Azure Machine Learning web service.
 * 
 */
public final class AzureMachineLearningWebServiceFunctionBindingResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureMachineLearningWebServiceFunctionBindingResponse Empty = new AzureMachineLearningWebServiceFunctionBindingResponse();

    /**
     * The API key used to authenticate with Request-Response endpoint.
     * 
     */
    @Import(name="apiKey")
      private final @Nullable String apiKey;

    public Optional<String> getApiKey() {
        return this.apiKey == null ? Optional.empty() : Optional.ofNullable(this.apiKey);
    }

    /**
     * Number between 1 and 10000 describing maximum number of rows for every Azure ML RRS execute request. Default is 1000.
     * 
     */
    @Import(name="batchSize")
      private final @Nullable Integer batchSize;

    public Optional<Integer> getBatchSize() {
        return this.batchSize == null ? Optional.empty() : Optional.ofNullable(this.batchSize);
    }

    /**
     * The Request-Response execute endpoint of the Azure Machine Learning web service. Find out more here: https://docs.microsoft.com/en-us/azure/machine-learning/machine-learning-consume-web-services#request-response-service-rrs
     * 
     */
    @Import(name="endpoint")
      private final @Nullable String endpoint;

    public Optional<String> getEndpoint() {
        return this.endpoint == null ? Optional.empty() : Optional.ofNullable(this.endpoint);
    }

    /**
     * The inputs for the Azure Machine Learning web service endpoint.
     * 
     */
    @Import(name="inputs")
      private final @Nullable AzureMachineLearningWebServiceInputsResponse inputs;

    public Optional<AzureMachineLearningWebServiceInputsResponse> getInputs() {
        return this.inputs == null ? Optional.empty() : Optional.ofNullable(this.inputs);
    }

    /**
     * A list of outputs from the Azure Machine Learning web service endpoint execution.
     * 
     */
    @Import(name="outputs")
      private final @Nullable List<AzureMachineLearningWebServiceOutputColumnResponse> outputs;

    public List<AzureMachineLearningWebServiceOutputColumnResponse> getOutputs() {
        return this.outputs == null ? List.of() : this.outputs;
    }

    /**
     * Indicates the function binding type.
     * Expected value is 'Microsoft.MachineLearning/WebService'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public AzureMachineLearningWebServiceFunctionBindingResponse(
        @Nullable String apiKey,
        @Nullable Integer batchSize,
        @Nullable String endpoint,
        @Nullable AzureMachineLearningWebServiceInputsResponse inputs,
        @Nullable List<AzureMachineLearningWebServiceOutputColumnResponse> outputs,
        String type) {
        this.apiKey = apiKey;
        this.batchSize = batchSize;
        this.endpoint = endpoint;
        this.inputs = inputs;
        this.outputs = outputs;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureMachineLearningWebServiceFunctionBindingResponse() {
        this.apiKey = null;
        this.batchSize = null;
        this.endpoint = null;
        this.inputs = null;
        this.outputs = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMachineLearningWebServiceFunctionBindingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiKey;
        private @Nullable Integer batchSize;
        private @Nullable String endpoint;
        private @Nullable AzureMachineLearningWebServiceInputsResponse inputs;
        private @Nullable List<AzureMachineLearningWebServiceOutputColumnResponse> outputs;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMachineLearningWebServiceFunctionBindingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.batchSize = defaults.batchSize;
    	      this.endpoint = defaults.endpoint;
    	      this.inputs = defaults.inputs;
    	      this.outputs = defaults.outputs;
    	      this.type = defaults.type;
        }

        public Builder apiKey(@Nullable String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder batchSize(@Nullable Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder inputs(@Nullable AzureMachineLearningWebServiceInputsResponse inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder outputs(@Nullable List<AzureMachineLearningWebServiceOutputColumnResponse> outputs) {
            this.outputs = outputs;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AzureMachineLearningWebServiceFunctionBindingResponse build() {
            return new AzureMachineLearningWebServiceFunctionBindingResponse(apiKey, batchSize, endpoint, inputs, outputs, type);
        }
    }
}
