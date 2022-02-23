// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MethodArgs extends io.pulumi.resources.ResourceArgs {

    public static final MethodArgs Empty = new MethodArgs();

    /**
     * Specify if the method requires an API key
     * 
     */
    @InputImport(name="apiKeyRequired")
    private final @Nullable Input<Boolean> apiKeyRequired;

    public Input<Boolean> getApiKeyRequired() {
        return this.apiKeyRequired == null ? Input.empty() : this.apiKeyRequired;
    }

    /**
     * The type of authorization used for the method (`NONE`, `CUSTOM`, `AWS_IAM`, `COGNITO_USER_POOLS`)
     * 
     */
    @InputImport(name="authorization", required=true)
    private final Input<String> authorization;

    public Input<String> getAuthorization() {
        return this.authorization;
    }

    /**
     * The authorization scopes used when the authorization is `COGNITO_USER_POOLS`
     * 
     */
    @InputImport(name="authorizationScopes")
    private final @Nullable Input<List<String>> authorizationScopes;

    public Input<List<String>> getAuthorizationScopes() {
        return this.authorizationScopes == null ? Input.empty() : this.authorizationScopes;
    }

    /**
     * The authorizer id to be used when the authorization is `CUSTOM` or `COGNITO_USER_POOLS`
     * 
     */
    @InputImport(name="authorizerId")
    private final @Nullable Input<String> authorizerId;

    public Input<String> getAuthorizerId() {
        return this.authorizerId == null ? Input.empty() : this.authorizerId;
    }

    /**
     * The HTTP Method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONS`, `ANY`)
     * 
     */
    @InputImport(name="httpMethod", required=true)
    private final Input<String> httpMethod;

    public Input<String> getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * The function name that will be given to the method when generating an SDK through API Gateway. If omitted, API Gateway will generate a function name based on the resource path and HTTP verb.
     * 
     */
    @InputImport(name="operationName")
    private final @Nullable Input<String> operationName;

    public Input<String> getOperationName() {
        return this.operationName == null ? Input.empty() : this.operationName;
    }

    /**
     * A map of the API models used for the request's content type
     * where key is the content type (e.g., `application/json`)
     * and value is either `Error`, `Empty` (built-in models) or `aws.apigateway.Model`'s `name`.
     * 
     */
    @InputImport(name="requestModels")
    private final @Nullable Input<Map<String,String>> requestModels;

    public Input<Map<String,String>> getRequestModels() {
        return this.requestModels == null ? Input.empty() : this.requestModels;
    }

    /**
     * A map of request parameters (from the path, query string and headers) that should be passed to the integration. The boolean value indicates whether the parameter is required (`true`) or optional (`false`).
     * For example: `request_parameters = {"method.request.header.X-Some-Header" = true "method.request.querystring.some-query-param" = true}` would define that the header `X-Some-Header` and the query string `some-query-param` must be provided in the request.
     * 
     */
    @InputImport(name="requestParameters")
    private final @Nullable Input<Map<String,Boolean>> requestParameters;

    public Input<Map<String,Boolean>> getRequestParameters() {
        return this.requestParameters == null ? Input.empty() : this.requestParameters;
    }

    /**
     * The ID of a `aws.apigateway.RequestValidator`
     * 
     */
    @InputImport(name="requestValidatorId")
    private final @Nullable Input<String> requestValidatorId;

    public Input<String> getRequestValidatorId() {
        return this.requestValidatorId == null ? Input.empty() : this.requestValidatorId;
    }

    /**
     * The API resource ID
     * 
     */
    @InputImport(name="resourceId", required=true)
    private final Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * The ID of the associated REST API
     * 
     */
    @InputImport(name="restApi", required=true)
    private final Input<String> restApi;

    public Input<String> getRestApi() {
        return this.restApi;
    }

    public MethodArgs(
        @Nullable Input<Boolean> apiKeyRequired,
        Input<String> authorization,
        @Nullable Input<List<String>> authorizationScopes,
        @Nullable Input<String> authorizerId,
        Input<String> httpMethod,
        @Nullable Input<String> operationName,
        @Nullable Input<Map<String,String>> requestModels,
        @Nullable Input<Map<String,Boolean>> requestParameters,
        @Nullable Input<String> requestValidatorId,
        Input<String> resourceId,
        Input<String> restApi) {
        this.apiKeyRequired = apiKeyRequired;
        this.authorization = Objects.requireNonNull(authorization, "expected parameter 'authorization' to be non-null");
        this.authorizationScopes = authorizationScopes;
        this.authorizerId = authorizerId;
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.operationName = operationName;
        this.requestModels = requestModels;
        this.requestParameters = requestParameters;
        this.requestValidatorId = requestValidatorId;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.restApi = Objects.requireNonNull(restApi, "expected parameter 'restApi' to be non-null");
    }

    private MethodArgs() {
        this.apiKeyRequired = Input.empty();
        this.authorization = Input.empty();
        this.authorizationScopes = Input.empty();
        this.authorizerId = Input.empty();
        this.httpMethod = Input.empty();
        this.operationName = Input.empty();
        this.requestModels = Input.empty();
        this.requestParameters = Input.empty();
        this.requestValidatorId = Input.empty();
        this.resourceId = Input.empty();
        this.restApi = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> apiKeyRequired;
        private Input<String> authorization;
        private @Nullable Input<List<String>> authorizationScopes;
        private @Nullable Input<String> authorizerId;
        private Input<String> httpMethod;
        private @Nullable Input<String> operationName;
        private @Nullable Input<Map<String,String>> requestModels;
        private @Nullable Input<Map<String,Boolean>> requestParameters;
        private @Nullable Input<String> requestValidatorId;
        private Input<String> resourceId;
        private Input<String> restApi;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyRequired = defaults.apiKeyRequired;
    	      this.authorization = defaults.authorization;
    	      this.authorizationScopes = defaults.authorizationScopes;
    	      this.authorizerId = defaults.authorizerId;
    	      this.httpMethod = defaults.httpMethod;
    	      this.operationName = defaults.operationName;
    	      this.requestModels = defaults.requestModels;
    	      this.requestParameters = defaults.requestParameters;
    	      this.requestValidatorId = defaults.requestValidatorId;
    	      this.resourceId = defaults.resourceId;
    	      this.restApi = defaults.restApi;
        }

        public Builder setApiKeyRequired(@Nullable Input<Boolean> apiKeyRequired) {
            this.apiKeyRequired = apiKeyRequired;
            return this;
        }

        public Builder setApiKeyRequired(@Nullable Boolean apiKeyRequired) {
            this.apiKeyRequired = Input.ofNullable(apiKeyRequired);
            return this;
        }

        public Builder setAuthorization(Input<String> authorization) {
            this.authorization = Objects.requireNonNull(authorization);
            return this;
        }

        public Builder setAuthorization(String authorization) {
            this.authorization = Input.of(Objects.requireNonNull(authorization));
            return this;
        }

        public Builder setAuthorizationScopes(@Nullable Input<List<String>> authorizationScopes) {
            this.authorizationScopes = authorizationScopes;
            return this;
        }

        public Builder setAuthorizationScopes(@Nullable List<String> authorizationScopes) {
            this.authorizationScopes = Input.ofNullable(authorizationScopes);
            return this;
        }

        public Builder setAuthorizerId(@Nullable Input<String> authorizerId) {
            this.authorizerId = authorizerId;
            return this;
        }

        public Builder setAuthorizerId(@Nullable String authorizerId) {
            this.authorizerId = Input.ofNullable(authorizerId);
            return this;
        }

        public Builder setHttpMethod(Input<String> httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = Input.of(Objects.requireNonNull(httpMethod));
            return this;
        }

        public Builder setOperationName(@Nullable Input<String> operationName) {
            this.operationName = operationName;
            return this;
        }

        public Builder setOperationName(@Nullable String operationName) {
            this.operationName = Input.ofNullable(operationName);
            return this;
        }

        public Builder setRequestModels(@Nullable Input<Map<String,String>> requestModels) {
            this.requestModels = requestModels;
            return this;
        }

        public Builder setRequestModels(@Nullable Map<String,String> requestModels) {
            this.requestModels = Input.ofNullable(requestModels);
            return this;
        }

        public Builder setRequestParameters(@Nullable Input<Map<String,Boolean>> requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }

        public Builder setRequestParameters(@Nullable Map<String,Boolean> requestParameters) {
            this.requestParameters = Input.ofNullable(requestParameters);
            return this;
        }

        public Builder setRequestValidatorId(@Nullable Input<String> requestValidatorId) {
            this.requestValidatorId = requestValidatorId;
            return this;
        }

        public Builder setRequestValidatorId(@Nullable String requestValidatorId) {
            this.requestValidatorId = Input.ofNullable(requestValidatorId);
            return this;
        }

        public Builder setResourceId(Input<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Input.of(Objects.requireNonNull(resourceId));
            return this;
        }

        public Builder setRestApi(Input<String> restApi) {
            this.restApi = Objects.requireNonNull(restApi);
            return this;
        }
        public MethodArgs build() {
            return new MethodArgs(apiKeyRequired, authorization, authorizationScopes, authorizerId, httpMethod, operationName, requestModels, requestParameters, requestValidatorId, resourceId, restApi);
        }
    }
}
