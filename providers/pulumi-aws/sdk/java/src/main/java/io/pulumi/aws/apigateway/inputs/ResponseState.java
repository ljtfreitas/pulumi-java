// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponseState extends io.pulumi.resources.ResourceArgs {

    public static final ResponseState Empty = new ResponseState();

    /**
     * A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
     * 
     */
    @InputImport(name="responseParameters")
    private final @Nullable Input<Map<String,String>> responseParameters;

    public Input<Map<String,String>> getResponseParameters() {
        return this.responseParameters == null ? Input.empty() : this.responseParameters;
    }

    /**
     * A map specifying the templates used to transform the response body.
     * 
     */
    @InputImport(name="responseTemplates")
    private final @Nullable Input<Map<String,String>> responseTemplates;

    public Input<Map<String,String>> getResponseTemplates() {
        return this.responseTemplates == null ? Input.empty() : this.responseTemplates;
    }

    /**
     * The response type of the associated GatewayResponse.
     * 
     */
    @InputImport(name="responseType")
    private final @Nullable Input<String> responseType;

    public Input<String> getResponseType() {
        return this.responseType == null ? Input.empty() : this.responseType;
    }

    /**
     * The string identifier of the associated REST API.
     * 
     */
    @InputImport(name="restApiId")
    private final @Nullable Input<String> restApiId;

    public Input<String> getRestApiId() {
        return this.restApiId == null ? Input.empty() : this.restApiId;
    }

    /**
     * The HTTP status code of the Gateway Response.
     * 
     */
    @InputImport(name="statusCode")
    private final @Nullable Input<String> statusCode;

    public Input<String> getStatusCode() {
        return this.statusCode == null ? Input.empty() : this.statusCode;
    }

    public ResponseState(
        @Nullable Input<Map<String,String>> responseParameters,
        @Nullable Input<Map<String,String>> responseTemplates,
        @Nullable Input<String> responseType,
        @Nullable Input<String> restApiId,
        @Nullable Input<String> statusCode) {
        this.responseParameters = responseParameters;
        this.responseTemplates = responseTemplates;
        this.responseType = responseType;
        this.restApiId = restApiId;
        this.statusCode = statusCode;
    }

    private ResponseState() {
        this.responseParameters = Input.empty();
        this.responseTemplates = Input.empty();
        this.responseType = Input.empty();
        this.restApiId = Input.empty();
        this.statusCode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> responseParameters;
        private @Nullable Input<Map<String,String>> responseTemplates;
        private @Nullable Input<String> responseType;
        private @Nullable Input<String> restApiId;
        private @Nullable Input<String> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.responseParameters = defaults.responseParameters;
    	      this.responseTemplates = defaults.responseTemplates;
    	      this.responseType = defaults.responseType;
    	      this.restApiId = defaults.restApiId;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder setResponseParameters(@Nullable Input<Map<String,String>> responseParameters) {
            this.responseParameters = responseParameters;
            return this;
        }

        public Builder setResponseParameters(@Nullable Map<String,String> responseParameters) {
            this.responseParameters = Input.ofNullable(responseParameters);
            return this;
        }

        public Builder setResponseTemplates(@Nullable Input<Map<String,String>> responseTemplates) {
            this.responseTemplates = responseTemplates;
            return this;
        }

        public Builder setResponseTemplates(@Nullable Map<String,String> responseTemplates) {
            this.responseTemplates = Input.ofNullable(responseTemplates);
            return this;
        }

        public Builder setResponseType(@Nullable Input<String> responseType) {
            this.responseType = responseType;
            return this;
        }

        public Builder setResponseType(@Nullable String responseType) {
            this.responseType = Input.ofNullable(responseType);
            return this;
        }

        public Builder setRestApiId(@Nullable Input<String> restApiId) {
            this.restApiId = restApiId;
            return this;
        }

        public Builder setRestApiId(@Nullable String restApiId) {
            this.restApiId = Input.ofNullable(restApiId);
            return this;
        }

        public Builder setStatusCode(@Nullable Input<String> statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public Builder setStatusCode(@Nullable String statusCode) {
            this.statusCode = Input.ofNullable(statusCode);
            return this;
        }
        public ResponseState build() {
            return new ResponseState(responseParameters, responseTemplates, responseType, restApiId, statusCode);
        }
    }
}
