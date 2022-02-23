// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.inputs.AzureMachineLearningWebServiceFunctionBindingResponse;
import io.pulumi.azurenative.streamanalytics.inputs.FunctionInputResponse;
import io.pulumi.azurenative.streamanalytics.inputs.FunctionOutputResponse;
import io.pulumi.azurenative.streamanalytics.inputs.JavaScriptFunctionBindingResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that are associated with a scalar function.
 * 
 */
public final class ScalarFunctionPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScalarFunctionPropertiesResponse Empty = new ScalarFunctionPropertiesResponse();

    /**
     * The physical binding of the function. For example, in the Azure Machine Learning web service’s case, this describes the endpoint.
     * 
     */
    @InputImport(name="binding")
        private final @Nullable Either<AzureMachineLearningWebServiceFunctionBindingResponse,JavaScriptFunctionBindingResponse> binding;

    public Either<AzureMachineLearningWebServiceFunctionBindingResponse,JavaScriptFunctionBindingResponse> getBinding() {
        return this.binding == null ? null : this.binding;
    }

    /**
     * The current entity tag for the function. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    @InputImport(name="etag", required=true)
        private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * A list of inputs describing the parameters of the function.
     * 
     */
    @InputImport(name="inputs")
        private final @Nullable List<FunctionInputResponse> inputs;

    public List<FunctionInputResponse> getInputs() {
        return this.inputs == null ? List.of() : this.inputs;
    }

    /**
     * The output of the function.
     * 
     */
    @InputImport(name="output")
        private final @Nullable FunctionOutputResponse output;

    public Optional<FunctionOutputResponse> getOutput() {
        return this.output == null ? Optional.empty() : Optional.ofNullable(this.output);
    }

    /**
     * Indicates the type of function.
     * Expected value is 'Scalar'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public ScalarFunctionPropertiesResponse(
        @Nullable Either<AzureMachineLearningWebServiceFunctionBindingResponse,JavaScriptFunctionBindingResponse> binding,
        String etag,
        @Nullable List<FunctionInputResponse> inputs,
        @Nullable FunctionOutputResponse output,
        String type) {
        this.binding = binding;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.inputs = inputs;
        this.output = output;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ScalarFunctionPropertiesResponse() {
        this.binding = null;
        this.etag = null;
        this.inputs = List.of();
        this.output = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalarFunctionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<AzureMachineLearningWebServiceFunctionBindingResponse,JavaScriptFunctionBindingResponse> binding;
        private String etag;
        private @Nullable List<FunctionInputResponse> inputs;
        private @Nullable FunctionOutputResponse output;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalarFunctionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binding = defaults.binding;
    	      this.etag = defaults.etag;
    	      this.inputs = defaults.inputs;
    	      this.output = defaults.output;
    	      this.type = defaults.type;
        }

        public Builder setBinding(@Nullable Either<AzureMachineLearningWebServiceFunctionBindingResponse,JavaScriptFunctionBindingResponse> binding) {
            this.binding = binding;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setInputs(@Nullable List<FunctionInputResponse> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder setOutput(@Nullable FunctionOutputResponse output) {
            this.output = output;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ScalarFunctionPropertiesResponse build() {
            return new ScalarFunctionPropertiesResponse(binding, etag, inputs, output, type);
        }
    }
}
