// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.aws.apigatewayv2.inputs.IntegrationResponseParameterArgs;
import io.pulumi.aws.apigatewayv2.inputs.IntegrationTlsConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationArgs Empty = new IntegrationArgs();

    /**
     * The API identifier.
     * 
     */
    @Import(name="apiId", required=true)
      private final Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId;
    }

    /**
     * The ID of the VPC link for a private integration. Supported only for HTTP APIs. Must be between 1 and 1024 characters in length.
     * 
     */
    @Import(name="connectionId")
      private final @Nullable Output<String> connectionId;

    public Output<String> getConnectionId() {
        return this.connectionId == null ? Output.empty() : this.connectionId;
    }

    /**
     * The type of the network connection to the integration endpoint. Valid values: `INTERNET`, `VPC_LINK`. Default is `INTERNET`.
     * 
     */
    @Import(name="connectionType")
      private final @Nullable Output<String> connectionType;

    public Output<String> getConnectionType() {
        return this.connectionType == null ? Output.empty() : this.connectionType;
    }

    /**
     * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`. Supported only for WebSocket APIs.
     * 
     */
    @Import(name="contentHandlingStrategy")
      private final @Nullable Output<String> contentHandlingStrategy;

    public Output<String> getContentHandlingStrategy() {
        return this.contentHandlingStrategy == null ? Output.empty() : this.contentHandlingStrategy;
    }

    /**
     * The credentials required for the integration, if any.
     * 
     */
    @Import(name="credentialsArn")
      private final @Nullable Output<String> credentialsArn;

    public Output<String> getCredentialsArn() {
        return this.credentialsArn == null ? Output.empty() : this.credentialsArn;
    }

    /**
     * The description of the integration.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The integration's HTTP method. Must be specified if `integration_type` is not `MOCK`.
     * 
     */
    @Import(name="integrationMethod")
      private final @Nullable Output<String> integrationMethod;

    public Output<String> getIntegrationMethod() {
        return this.integrationMethod == null ? Output.empty() : this.integrationMethod;
    }

    /**
     * Specifies the AWS service action to invoke. Supported only for HTTP APIs when `integration_type` is `AWS_PROXY`. See the [AWS service integration reference](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html) documentation for supported values. Must be between 1 and 128 characters in length.
     * 
     */
    @Import(name="integrationSubtype")
      private final @Nullable Output<String> integrationSubtype;

    public Output<String> getIntegrationSubtype() {
        return this.integrationSubtype == null ? Output.empty() : this.integrationSubtype;
    }

    /**
     * The integration type of an integration.
     * Valid values: `AWS` (supported only for WebSocket APIs), `AWS_PROXY`, `HTTP` (supported only for WebSocket APIs), `HTTP_PROXY`, `MOCK` (supported only for WebSocket APIs). For an HTTP API private integration, use `HTTP_PROXY`.
     * 
     */
    @Import(name="integrationType", required=true)
      private final Output<String> integrationType;

    public Output<String> getIntegrationType() {
        return this.integrationType;
    }

    /**
     * The URI of the Lambda function for a Lambda proxy integration, when `integration_type` is `AWS_PROXY`.
     * For an `HTTP` integration, specify a fully-qualified URL. For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map service.
     * 
     */
    @Import(name="integrationUri")
      private final @Nullable Output<String> integrationUri;

    public Output<String> getIntegrationUri() {
        return this.integrationUri == null ? Output.empty() : this.integrationUri;
    }

    /**
     * The pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the `request_templates` attribute.
     * Valid values: `WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`. Default is `WHEN_NO_MATCH`. Supported only for WebSocket APIs.
     * 
     */
    @Import(name="passthroughBehavior")
      private final @Nullable Output<String> passthroughBehavior;

    public Output<String> getPassthroughBehavior() {
        return this.passthroughBehavior == null ? Output.empty() : this.passthroughBehavior;
    }

    /**
     * The [format of the payload](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html#http-api-develop-integrations-lambda.proxy-format) sent to an integration. Valid values: `1.0`, `2.0`. Default is `1.0`.
     * 
     */
    @Import(name="payloadFormatVersion")
      private final @Nullable Output<String> payloadFormatVersion;

    public Output<String> getPayloadFormatVersion() {
        return this.payloadFormatVersion == null ? Output.empty() : this.payloadFormatVersion;
    }

    /**
     * For WebSocket APIs, a key-value map specifying request parameters that are passed from the method request to the backend.
     * For HTTP APIs with a specified `integration_subtype`, a key-value map specifying parameters that are passed to `AWS_PROXY` integrations.
     * For HTTP APIs without a specified `integration_subtype`, a key-value map specifying how to transform HTTP requests before sending them to the backend.
     * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html) for details.
     * 
     */
    @Import(name="requestParameters")
      private final @Nullable Output<Map<String,String>> requestParameters;

    public Output<Map<String,String>> getRequestParameters() {
        return this.requestParameters == null ? Output.empty() : this.requestParameters;
    }

    /**
     * A map of [Velocity](https://velocity.apache.org/) templates that are applied on the request payload based on the value of the Content-Type header sent by the client. Supported only for WebSocket APIs.
     * 
     */
    @Import(name="requestTemplates")
      private final @Nullable Output<Map<String,String>> requestTemplates;

    public Output<Map<String,String>> getRequestTemplates() {
        return this.requestTemplates == null ? Output.empty() : this.requestTemplates;
    }

    /**
     * Mappings to transform the HTTP response from a backend integration before returning the response to clients. Supported only for HTTP APIs.
     * 
     */
    @Import(name="responseParameters")
      private final @Nullable Output<List<IntegrationResponseParameterArgs>> responseParameters;

    public Output<List<IntegrationResponseParameterArgs>> getResponseParameters() {
        return this.responseParameters == null ? Output.empty() : this.responseParameters;
    }

    /**
     * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration.
     * 
     */
    @Import(name="templateSelectionExpression")
      private final @Nullable Output<String> templateSelectionExpression;

    public Output<String> getTemplateSelectionExpression() {
        return this.templateSelectionExpression == null ? Output.empty() : this.templateSelectionExpression;
    }

    /**
     * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000 milliseconds for HTTP APIs.
     * The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     * this provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Import(name="timeoutMilliseconds")
      private final @Nullable Output<Integer> timeoutMilliseconds;

    public Output<Integer> getTimeoutMilliseconds() {
        return this.timeoutMilliseconds == null ? Output.empty() : this.timeoutMilliseconds;
    }

    /**
     * The TLS configuration for a private integration. Supported only for HTTP APIs.
     * 
     */
    @Import(name="tlsConfig")
      private final @Nullable Output<IntegrationTlsConfigArgs> tlsConfig;

    public Output<IntegrationTlsConfigArgs> getTlsConfig() {
        return this.tlsConfig == null ? Output.empty() : this.tlsConfig;
    }

    public IntegrationArgs(
        Output<String> apiId,
        @Nullable Output<String> connectionId,
        @Nullable Output<String> connectionType,
        @Nullable Output<String> contentHandlingStrategy,
        @Nullable Output<String> credentialsArn,
        @Nullable Output<String> description,
        @Nullable Output<String> integrationMethod,
        @Nullable Output<String> integrationSubtype,
        Output<String> integrationType,
        @Nullable Output<String> integrationUri,
        @Nullable Output<String> passthroughBehavior,
        @Nullable Output<String> payloadFormatVersion,
        @Nullable Output<Map<String,String>> requestParameters,
        @Nullable Output<Map<String,String>> requestTemplates,
        @Nullable Output<List<IntegrationResponseParameterArgs>> responseParameters,
        @Nullable Output<String> templateSelectionExpression,
        @Nullable Output<Integer> timeoutMilliseconds,
        @Nullable Output<IntegrationTlsConfigArgs> tlsConfig) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.connectionId = connectionId;
        this.connectionType = connectionType;
        this.contentHandlingStrategy = contentHandlingStrategy;
        this.credentialsArn = credentialsArn;
        this.description = description;
        this.integrationMethod = integrationMethod;
        this.integrationSubtype = integrationSubtype;
        this.integrationType = Objects.requireNonNull(integrationType, "expected parameter 'integrationType' to be non-null");
        this.integrationUri = integrationUri;
        this.passthroughBehavior = passthroughBehavior;
        this.payloadFormatVersion = payloadFormatVersion;
        this.requestParameters = requestParameters;
        this.requestTemplates = requestTemplates;
        this.responseParameters = responseParameters;
        this.templateSelectionExpression = templateSelectionExpression;
        this.timeoutMilliseconds = timeoutMilliseconds;
        this.tlsConfig = tlsConfig;
    }

    private IntegrationArgs() {
        this.apiId = Output.empty();
        this.connectionId = Output.empty();
        this.connectionType = Output.empty();
        this.contentHandlingStrategy = Output.empty();
        this.credentialsArn = Output.empty();
        this.description = Output.empty();
        this.integrationMethod = Output.empty();
        this.integrationSubtype = Output.empty();
        this.integrationType = Output.empty();
        this.integrationUri = Output.empty();
        this.passthroughBehavior = Output.empty();
        this.payloadFormatVersion = Output.empty();
        this.requestParameters = Output.empty();
        this.requestTemplates = Output.empty();
        this.responseParameters = Output.empty();
        this.templateSelectionExpression = Output.empty();
        this.timeoutMilliseconds = Output.empty();
        this.tlsConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiId;
        private @Nullable Output<String> connectionId;
        private @Nullable Output<String> connectionType;
        private @Nullable Output<String> contentHandlingStrategy;
        private @Nullable Output<String> credentialsArn;
        private @Nullable Output<String> description;
        private @Nullable Output<String> integrationMethod;
        private @Nullable Output<String> integrationSubtype;
        private Output<String> integrationType;
        private @Nullable Output<String> integrationUri;
        private @Nullable Output<String> passthroughBehavior;
        private @Nullable Output<String> payloadFormatVersion;
        private @Nullable Output<Map<String,String>> requestParameters;
        private @Nullable Output<Map<String,String>> requestTemplates;
        private @Nullable Output<List<IntegrationResponseParameterArgs>> responseParameters;
        private @Nullable Output<String> templateSelectionExpression;
        private @Nullable Output<Integer> timeoutMilliseconds;
        private @Nullable Output<IntegrationTlsConfigArgs> tlsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.connectionId = defaults.connectionId;
    	      this.connectionType = defaults.connectionType;
    	      this.contentHandlingStrategy = defaults.contentHandlingStrategy;
    	      this.credentialsArn = defaults.credentialsArn;
    	      this.description = defaults.description;
    	      this.integrationMethod = defaults.integrationMethod;
    	      this.integrationSubtype = defaults.integrationSubtype;
    	      this.integrationType = defaults.integrationType;
    	      this.integrationUri = defaults.integrationUri;
    	      this.passthroughBehavior = defaults.passthroughBehavior;
    	      this.payloadFormatVersion = defaults.payloadFormatVersion;
    	      this.requestParameters = defaults.requestParameters;
    	      this.requestTemplates = defaults.requestTemplates;
    	      this.responseParameters = defaults.responseParameters;
    	      this.templateSelectionExpression = defaults.templateSelectionExpression;
    	      this.timeoutMilliseconds = defaults.timeoutMilliseconds;
    	      this.tlsConfig = defaults.tlsConfig;
        }

        public Builder apiId(Output<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder apiId(String apiId) {
            this.apiId = Output.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder connectionId(@Nullable Output<String> connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        public Builder connectionId(@Nullable String connectionId) {
            this.connectionId = Output.ofNullable(connectionId);
            return this;
        }

        public Builder connectionType(@Nullable Output<String> connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        public Builder connectionType(@Nullable String connectionType) {
            this.connectionType = Output.ofNullable(connectionType);
            return this;
        }

        public Builder contentHandlingStrategy(@Nullable Output<String> contentHandlingStrategy) {
            this.contentHandlingStrategy = contentHandlingStrategy;
            return this;
        }

        public Builder contentHandlingStrategy(@Nullable String contentHandlingStrategy) {
            this.contentHandlingStrategy = Output.ofNullable(contentHandlingStrategy);
            return this;
        }

        public Builder credentialsArn(@Nullable Output<String> credentialsArn) {
            this.credentialsArn = credentialsArn;
            return this;
        }

        public Builder credentialsArn(@Nullable String credentialsArn) {
            this.credentialsArn = Output.ofNullable(credentialsArn);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder integrationMethod(@Nullable Output<String> integrationMethod) {
            this.integrationMethod = integrationMethod;
            return this;
        }

        public Builder integrationMethod(@Nullable String integrationMethod) {
            this.integrationMethod = Output.ofNullable(integrationMethod);
            return this;
        }

        public Builder integrationSubtype(@Nullable Output<String> integrationSubtype) {
            this.integrationSubtype = integrationSubtype;
            return this;
        }

        public Builder integrationSubtype(@Nullable String integrationSubtype) {
            this.integrationSubtype = Output.ofNullable(integrationSubtype);
            return this;
        }

        public Builder integrationType(Output<String> integrationType) {
            this.integrationType = Objects.requireNonNull(integrationType);
            return this;
        }

        public Builder integrationType(String integrationType) {
            this.integrationType = Output.of(Objects.requireNonNull(integrationType));
            return this;
        }

        public Builder integrationUri(@Nullable Output<String> integrationUri) {
            this.integrationUri = integrationUri;
            return this;
        }

        public Builder integrationUri(@Nullable String integrationUri) {
            this.integrationUri = Output.ofNullable(integrationUri);
            return this;
        }

        public Builder passthroughBehavior(@Nullable Output<String> passthroughBehavior) {
            this.passthroughBehavior = passthroughBehavior;
            return this;
        }

        public Builder passthroughBehavior(@Nullable String passthroughBehavior) {
            this.passthroughBehavior = Output.ofNullable(passthroughBehavior);
            return this;
        }

        public Builder payloadFormatVersion(@Nullable Output<String> payloadFormatVersion) {
            this.payloadFormatVersion = payloadFormatVersion;
            return this;
        }

        public Builder payloadFormatVersion(@Nullable String payloadFormatVersion) {
            this.payloadFormatVersion = Output.ofNullable(payloadFormatVersion);
            return this;
        }

        public Builder requestParameters(@Nullable Output<Map<String,String>> requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }

        public Builder requestParameters(@Nullable Map<String,String> requestParameters) {
            this.requestParameters = Output.ofNullable(requestParameters);
            return this;
        }

        public Builder requestTemplates(@Nullable Output<Map<String,String>> requestTemplates) {
            this.requestTemplates = requestTemplates;
            return this;
        }

        public Builder requestTemplates(@Nullable Map<String,String> requestTemplates) {
            this.requestTemplates = Output.ofNullable(requestTemplates);
            return this;
        }

        public Builder responseParameters(@Nullable Output<List<IntegrationResponseParameterArgs>> responseParameters) {
            this.responseParameters = responseParameters;
            return this;
        }

        public Builder responseParameters(@Nullable List<IntegrationResponseParameterArgs> responseParameters) {
            this.responseParameters = Output.ofNullable(responseParameters);
            return this;
        }

        public Builder templateSelectionExpression(@Nullable Output<String> templateSelectionExpression) {
            this.templateSelectionExpression = templateSelectionExpression;
            return this;
        }

        public Builder templateSelectionExpression(@Nullable String templateSelectionExpression) {
            this.templateSelectionExpression = Output.ofNullable(templateSelectionExpression);
            return this;
        }

        public Builder timeoutMilliseconds(@Nullable Output<Integer> timeoutMilliseconds) {
            this.timeoutMilliseconds = timeoutMilliseconds;
            return this;
        }

        public Builder timeoutMilliseconds(@Nullable Integer timeoutMilliseconds) {
            this.timeoutMilliseconds = Output.ofNullable(timeoutMilliseconds);
            return this;
        }

        public Builder tlsConfig(@Nullable Output<IntegrationTlsConfigArgs> tlsConfig) {
            this.tlsConfig = tlsConfig;
            return this;
        }

        public Builder tlsConfig(@Nullable IntegrationTlsConfigArgs tlsConfig) {
            this.tlsConfig = Output.ofNullable(tlsConfig);
            return this;
        }
        public IntegrationArgs build() {
            return new IntegrationArgs(apiId, connectionId, connectionType, contentHandlingStrategy, credentialsArn, description, integrationMethod, integrationSubtype, integrationType, integrationUri, passthroughBehavior, payloadFormatVersion, requestParameters, requestTemplates, responseParameters, templateSelectionExpression, timeoutMilliseconds, tlsConfig);
        }
    }
}
