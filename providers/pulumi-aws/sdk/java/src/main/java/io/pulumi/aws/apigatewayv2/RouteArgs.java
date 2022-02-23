// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.aws.apigatewayv2.inputs.RouteRequestParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * The API identifier.
     * 
     */
    @InputImport(name="apiId", required=true)
    private final Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId;
    }

    /**
     * Boolean whether an API key is required for the route. Defaults to `false`. Supported only for WebSocket APIs.
     * 
     */
    @InputImport(name="apiKeyRequired")
    private final @Nullable Input<Boolean> apiKeyRequired;

    public Input<Boolean> getApiKeyRequired() {
        return this.apiKeyRequired == null ? Input.empty() : this.apiKeyRequired;
    }

    /**
     * The authorization scopes supported by this route. The scopes are used with a JWT authorizer to authorize the method invocation.
     * 
     */
    @InputImport(name="authorizationScopes")
    private final @Nullable Input<List<String>> authorizationScopes;

    public Input<List<String>> getAuthorizationScopes() {
        return this.authorizationScopes == null ? Input.empty() : this.authorizationScopes;
    }

    /**
     * The authorization type for the route.
     * For WebSocket APIs, valid values are `NONE` for open access, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
     * For HTTP APIs, valid values are `NONE` for open access, `JWT` for using JSON Web Tokens, `AWS_IAM` for using AWS IAM permissions, and `CUSTOM` for using a Lambda authorizer.
     * Defaults to `NONE`.
     * 
     */
    @InputImport(name="authorizationType")
    private final @Nullable Input<String> authorizationType;

    public Input<String> getAuthorizationType() {
        return this.authorizationType == null ? Input.empty() : this.authorizationType;
    }

    /**
     * The identifier of the `aws.apigatewayv2.Authorizer` resource to be associated with this route.
     * 
     */
    @InputImport(name="authorizerId")
    private final @Nullable Input<String> authorizerId;

    public Input<String> getAuthorizerId() {
        return this.authorizerId == null ? Input.empty() : this.authorizerId;
    }

    /**
     * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route. Supported only for WebSocket APIs.
     * 
     */
    @InputImport(name="modelSelectionExpression")
    private final @Nullable Input<String> modelSelectionExpression;

    public Input<String> getModelSelectionExpression() {
        return this.modelSelectionExpression == null ? Input.empty() : this.modelSelectionExpression;
    }

    /**
     * The operation name for the route. Must be between 1 and 64 characters in length.
     * 
     */
    @InputImport(name="operationName")
    private final @Nullable Input<String> operationName;

    public Input<String> getOperationName() {
        return this.operationName == null ? Input.empty() : this.operationName;
    }

    /**
     * The request models for the route. Supported only for WebSocket APIs.
     * 
     */
    @InputImport(name="requestModels")
    private final @Nullable Input<Map<String,String>> requestModels;

    public Input<Map<String,String>> getRequestModels() {
        return this.requestModels == null ? Input.empty() : this.requestModels;
    }

    /**
     * The request parameters for the route. Supported only for WebSocket APIs.
     * 
     */
    @InputImport(name="requestParameters")
    private final @Nullable Input<List<RouteRequestParameterArgs>> requestParameters;

    public Input<List<RouteRequestParameterArgs>> getRequestParameters() {
        return this.requestParameters == null ? Input.empty() : this.requestParameters;
    }

    /**
     * The route key for the route. For HTTP APIs, the route key can be either `$default`, or a combination of an HTTP method and resource path, for example, `GET /pets`.
     * 
     */
    @InputImport(name="routeKey", required=true)
    private final Input<String> routeKey;

    public Input<String> getRouteKey() {
        return this.routeKey;
    }

    /**
     * The [route response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-route-response-selection-expressions) for the route. Supported only for WebSocket APIs.
     * 
     */
    @InputImport(name="routeResponseSelectionExpression")
    private final @Nullable Input<String> routeResponseSelectionExpression;

    public Input<String> getRouteResponseSelectionExpression() {
        return this.routeResponseSelectionExpression == null ? Input.empty() : this.routeResponseSelectionExpression;
    }

    /**
     * The target for the route, of the form `integrations/`*`IntegrationID`*, where *`IntegrationID`* is the identifier of an `aws.apigatewayv2.Integration` resource.
     * 
     */
    @InputImport(name="target")
    private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    public RouteArgs(
        Input<String> apiId,
        @Nullable Input<Boolean> apiKeyRequired,
        @Nullable Input<List<String>> authorizationScopes,
        @Nullable Input<String> authorizationType,
        @Nullable Input<String> authorizerId,
        @Nullable Input<String> modelSelectionExpression,
        @Nullable Input<String> operationName,
        @Nullable Input<Map<String,String>> requestModels,
        @Nullable Input<List<RouteRequestParameterArgs>> requestParameters,
        Input<String> routeKey,
        @Nullable Input<String> routeResponseSelectionExpression,
        @Nullable Input<String> target) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.apiKeyRequired = apiKeyRequired;
        this.authorizationScopes = authorizationScopes;
        this.authorizationType = authorizationType;
        this.authorizerId = authorizerId;
        this.modelSelectionExpression = modelSelectionExpression;
        this.operationName = operationName;
        this.requestModels = requestModels;
        this.requestParameters = requestParameters;
        this.routeKey = Objects.requireNonNull(routeKey, "expected parameter 'routeKey' to be non-null");
        this.routeResponseSelectionExpression = routeResponseSelectionExpression;
        this.target = target;
    }

    private RouteArgs() {
        this.apiId = Input.empty();
        this.apiKeyRequired = Input.empty();
        this.authorizationScopes = Input.empty();
        this.authorizationType = Input.empty();
        this.authorizerId = Input.empty();
        this.modelSelectionExpression = Input.empty();
        this.operationName = Input.empty();
        this.requestModels = Input.empty();
        this.requestParameters = Input.empty();
        this.routeKey = Input.empty();
        this.routeResponseSelectionExpression = Input.empty();
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> apiId;
        private @Nullable Input<Boolean> apiKeyRequired;
        private @Nullable Input<List<String>> authorizationScopes;
        private @Nullable Input<String> authorizationType;
        private @Nullable Input<String> authorizerId;
        private @Nullable Input<String> modelSelectionExpression;
        private @Nullable Input<String> operationName;
        private @Nullable Input<Map<String,String>> requestModels;
        private @Nullable Input<List<RouteRequestParameterArgs>> requestParameters;
        private Input<String> routeKey;
        private @Nullable Input<String> routeResponseSelectionExpression;
        private @Nullable Input<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.apiKeyRequired = defaults.apiKeyRequired;
    	      this.authorizationScopes = defaults.authorizationScopes;
    	      this.authorizationType = defaults.authorizationType;
    	      this.authorizerId = defaults.authorizerId;
    	      this.modelSelectionExpression = defaults.modelSelectionExpression;
    	      this.operationName = defaults.operationName;
    	      this.requestModels = defaults.requestModels;
    	      this.requestParameters = defaults.requestParameters;
    	      this.routeKey = defaults.routeKey;
    	      this.routeResponseSelectionExpression = defaults.routeResponseSelectionExpression;
    	      this.target = defaults.target;
        }

        public Builder setApiId(Input<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Input.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder setApiKeyRequired(@Nullable Input<Boolean> apiKeyRequired) {
            this.apiKeyRequired = apiKeyRequired;
            return this;
        }

        public Builder setApiKeyRequired(@Nullable Boolean apiKeyRequired) {
            this.apiKeyRequired = Input.ofNullable(apiKeyRequired);
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

        public Builder setAuthorizationType(@Nullable Input<String> authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }

        public Builder setAuthorizationType(@Nullable String authorizationType) {
            this.authorizationType = Input.ofNullable(authorizationType);
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

        public Builder setModelSelectionExpression(@Nullable Input<String> modelSelectionExpression) {
            this.modelSelectionExpression = modelSelectionExpression;
            return this;
        }

        public Builder setModelSelectionExpression(@Nullable String modelSelectionExpression) {
            this.modelSelectionExpression = Input.ofNullable(modelSelectionExpression);
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

        public Builder setRequestParameters(@Nullable Input<List<RouteRequestParameterArgs>> requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }

        public Builder setRequestParameters(@Nullable List<RouteRequestParameterArgs> requestParameters) {
            this.requestParameters = Input.ofNullable(requestParameters);
            return this;
        }

        public Builder setRouteKey(Input<String> routeKey) {
            this.routeKey = Objects.requireNonNull(routeKey);
            return this;
        }

        public Builder setRouteKey(String routeKey) {
            this.routeKey = Input.of(Objects.requireNonNull(routeKey));
            return this;
        }

        public Builder setRouteResponseSelectionExpression(@Nullable Input<String> routeResponseSelectionExpression) {
            this.routeResponseSelectionExpression = routeResponseSelectionExpression;
            return this;
        }

        public Builder setRouteResponseSelectionExpression(@Nullable String routeResponseSelectionExpression) {
            this.routeResponseSelectionExpression = Input.ofNullable(routeResponseSelectionExpression);
            return this;
        }

        public Builder setTarget(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }
        public RouteArgs build() {
            return new RouteArgs(apiId, apiKeyRequired, authorizationScopes, authorizationType, authorizerId, modelSelectionExpression, operationName, requestModels, requestParameters, routeKey, routeResponseSelectionExpression, target);
        }
    }
}
