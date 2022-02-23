// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationResponseArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationResponseArgs Empty = new IntegrationResponseArgs();

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
     * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`.
     * 
     */
    @InputImport(name="contentHandlingStrategy")
    private final @Nullable Input<String> contentHandlingStrategy;

    public Input<String> getContentHandlingStrategy() {
        return this.contentHandlingStrategy == null ? Input.empty() : this.contentHandlingStrategy;
    }

    /**
     * The identifier of the `aws.apigatewayv2.Integration`.
     * 
     */
    @InputImport(name="integrationId", required=true)
    private final Input<String> integrationId;

    public Input<String> getIntegrationId() {
        return this.integrationId;
    }

    /**
     * The integration response key.
     * 
     */
    @InputImport(name="integrationResponseKey", required=true)
    private final Input<String> integrationResponseKey;

    public Input<String> getIntegrationResponseKey() {
        return this.integrationResponseKey;
    }

    /**
     * A map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client.
     * 
     */
    @InputImport(name="responseTemplates")
    private final @Nullable Input<Map<String,String>> responseTemplates;

    public Input<Map<String,String>> getResponseTemplates() {
        return this.responseTemplates == null ? Input.empty() : this.responseTemplates;
    }

    /**
     * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration response.
     * 
     */
    @InputImport(name="templateSelectionExpression")
    private final @Nullable Input<String> templateSelectionExpression;

    public Input<String> getTemplateSelectionExpression() {
        return this.templateSelectionExpression == null ? Input.empty() : this.templateSelectionExpression;
    }

    public IntegrationResponseArgs(
        Input<String> apiId,
        @Nullable Input<String> contentHandlingStrategy,
        Input<String> integrationId,
        Input<String> integrationResponseKey,
        @Nullable Input<Map<String,String>> responseTemplates,
        @Nullable Input<String> templateSelectionExpression) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.contentHandlingStrategy = contentHandlingStrategy;
        this.integrationId = Objects.requireNonNull(integrationId, "expected parameter 'integrationId' to be non-null");
        this.integrationResponseKey = Objects.requireNonNull(integrationResponseKey, "expected parameter 'integrationResponseKey' to be non-null");
        this.responseTemplates = responseTemplates;
        this.templateSelectionExpression = templateSelectionExpression;
    }

    private IntegrationResponseArgs() {
        this.apiId = Input.empty();
        this.contentHandlingStrategy = Input.empty();
        this.integrationId = Input.empty();
        this.integrationResponseKey = Input.empty();
        this.responseTemplates = Input.empty();
        this.templateSelectionExpression = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> apiId;
        private @Nullable Input<String> contentHandlingStrategy;
        private Input<String> integrationId;
        private Input<String> integrationResponseKey;
        private @Nullable Input<Map<String,String>> responseTemplates;
        private @Nullable Input<String> templateSelectionExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.contentHandlingStrategy = defaults.contentHandlingStrategy;
    	      this.integrationId = defaults.integrationId;
    	      this.integrationResponseKey = defaults.integrationResponseKey;
    	      this.responseTemplates = defaults.responseTemplates;
    	      this.templateSelectionExpression = defaults.templateSelectionExpression;
        }

        public Builder setApiId(Input<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Input.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder setContentHandlingStrategy(@Nullable Input<String> contentHandlingStrategy) {
            this.contentHandlingStrategy = contentHandlingStrategy;
            return this;
        }

        public Builder setContentHandlingStrategy(@Nullable String contentHandlingStrategy) {
            this.contentHandlingStrategy = Input.ofNullable(contentHandlingStrategy);
            return this;
        }

        public Builder setIntegrationId(Input<String> integrationId) {
            this.integrationId = Objects.requireNonNull(integrationId);
            return this;
        }

        public Builder setIntegrationId(String integrationId) {
            this.integrationId = Input.of(Objects.requireNonNull(integrationId));
            return this;
        }

        public Builder setIntegrationResponseKey(Input<String> integrationResponseKey) {
            this.integrationResponseKey = Objects.requireNonNull(integrationResponseKey);
            return this;
        }

        public Builder setIntegrationResponseKey(String integrationResponseKey) {
            this.integrationResponseKey = Input.of(Objects.requireNonNull(integrationResponseKey));
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

        public Builder setTemplateSelectionExpression(@Nullable Input<String> templateSelectionExpression) {
            this.templateSelectionExpression = templateSelectionExpression;
            return this;
        }

        public Builder setTemplateSelectionExpression(@Nullable String templateSelectionExpression) {
            this.templateSelectionExpression = Input.ofNullable(templateSelectionExpression);
            return this;
        }
        public IntegrationResponseArgs build() {
            return new IntegrationResponseArgs(apiId, contentHandlingStrategy, integrationId, integrationResponseKey, responseTemplates, templateSelectionExpression);
        }
    }
}
