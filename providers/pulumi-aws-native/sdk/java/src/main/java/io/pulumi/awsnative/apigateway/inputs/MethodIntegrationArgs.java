// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.awsnative.apigateway.enums.MethodIntegrationConnectionType;
import io.pulumi.awsnative.apigateway.enums.MethodIntegrationContentHandling;
import io.pulumi.awsnative.apigateway.enums.MethodIntegrationPassthroughBehavior;
import io.pulumi.awsnative.apigateway.enums.MethodIntegrationType;
import io.pulumi.awsnative.apigateway.inputs.MethodIntegrationResponseArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MethodIntegrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MethodIntegrationArgs Empty = new MethodIntegrationArgs();

    /**
     * A list of request parameters whose values API Gateway caches.
     * 
     */
    @Import(name="cacheKeyParameters")
      private final @Nullable Output<List<String>> cacheKeyParameters;

    public Output<List<String>> getCacheKeyParameters() {
        return this.cacheKeyParameters == null ? Output.empty() : this.cacheKeyParameters;
    }

    /**
     * An API-specific tag group of related cached parameters.
     * 
     */
    @Import(name="cacheNamespace")
      private final @Nullable Output<String> cacheNamespace;

    public Output<String> getCacheNamespace() {
        return this.cacheNamespace == null ? Output.empty() : this.cacheNamespace;
    }

    /**
     * The ID of the VpcLink used for the integration when connectionType=VPC_LINK, otherwise undefined.
     * 
     */
    @Import(name="connectionId")
      private final @Nullable Output<String> connectionId;

    public Output<String> getConnectionId() {
        return this.connectionId == null ? Output.empty() : this.connectionId;
    }

    /**
     * The type of the network connection to the integration endpoint.
     * 
     */
    @Import(name="connectionType")
      private final @Nullable Output<MethodIntegrationConnectionType> connectionType;

    public Output<MethodIntegrationConnectionType> getConnectionType() {
        return this.connectionType == null ? Output.empty() : this.connectionType;
    }

    /**
     * Specifies how to handle request payload content type conversions.
     * 
     */
    @Import(name="contentHandling")
      private final @Nullable Output<MethodIntegrationContentHandling> contentHandling;

    public Output<MethodIntegrationContentHandling> getContentHandling() {
        return this.contentHandling == null ? Output.empty() : this.contentHandling;
    }

    /**
     * The credentials that are required for the integration.
     * 
     */
    @Import(name="credentials")
      private final @Nullable Output<String> credentials;

    public Output<String> getCredentials() {
        return this.credentials == null ? Output.empty() : this.credentials;
    }

    /**
     * The integration's HTTP method type.
     * 
     */
    @Import(name="integrationHttpMethod")
      private final @Nullable Output<String> integrationHttpMethod;

    public Output<String> getIntegrationHttpMethod() {
        return this.integrationHttpMethod == null ? Output.empty() : this.integrationHttpMethod;
    }

    /**
     * The response that API Gateway provides after a method's backend completes processing a request.
     * 
     */
    @Import(name="integrationResponses")
      private final @Nullable Output<List<MethodIntegrationResponseArgs>> integrationResponses;

    public Output<List<MethodIntegrationResponseArgs>> getIntegrationResponses() {
        return this.integrationResponses == null ? Output.empty() : this.integrationResponses;
    }

    /**
     * Indicates when API Gateway passes requests to the targeted backend.
     * 
     */
    @Import(name="passthroughBehavior")
      private final @Nullable Output<MethodIntegrationPassthroughBehavior> passthroughBehavior;

    public Output<MethodIntegrationPassthroughBehavior> getPassthroughBehavior() {
        return this.passthroughBehavior == null ? Output.empty() : this.passthroughBehavior;
    }

    /**
     * The request parameters that API Gateway sends with the backend request.
     * 
     */
    @Import(name="requestParameters")
      private final @Nullable Output<Object> requestParameters;

    public Output<Object> getRequestParameters() {
        return this.requestParameters == null ? Output.empty() : this.requestParameters;
    }

    /**
     * A map of Apache Velocity templates that are applied on the request payload.
     * 
     */
    @Import(name="requestTemplates")
      private final @Nullable Output<Object> requestTemplates;

    public Output<Object> getRequestTemplates() {
        return this.requestTemplates == null ? Output.empty() : this.requestTemplates;
    }

    /**
     * Custom timeout between 50 and 29,000 milliseconds.
     * 
     */
    @Import(name="timeoutInMillis")
      private final @Nullable Output<Integer> timeoutInMillis;

    public Output<Integer> getTimeoutInMillis() {
        return this.timeoutInMillis == null ? Output.empty() : this.timeoutInMillis;
    }

    /**
     * The type of backend that your method is running.
     * 
     */
    @Import(name="type", required=true)
      private final Output<MethodIntegrationType> type;

    public Output<MethodIntegrationType> getType() {
        return this.type;
    }

    /**
     * The Uniform Resource Identifier (URI) for the integration.
     * 
     */
    @Import(name="uri")
      private final @Nullable Output<String> uri;

    public Output<String> getUri() {
        return this.uri == null ? Output.empty() : this.uri;
    }

    public MethodIntegrationArgs(
        @Nullable Output<List<String>> cacheKeyParameters,
        @Nullable Output<String> cacheNamespace,
        @Nullable Output<String> connectionId,
        @Nullable Output<MethodIntegrationConnectionType> connectionType,
        @Nullable Output<MethodIntegrationContentHandling> contentHandling,
        @Nullable Output<String> credentials,
        @Nullable Output<String> integrationHttpMethod,
        @Nullable Output<List<MethodIntegrationResponseArgs>> integrationResponses,
        @Nullable Output<MethodIntegrationPassthroughBehavior> passthroughBehavior,
        @Nullable Output<Object> requestParameters,
        @Nullable Output<Object> requestTemplates,
        @Nullable Output<Integer> timeoutInMillis,
        Output<MethodIntegrationType> type,
        @Nullable Output<String> uri) {
        this.cacheKeyParameters = cacheKeyParameters;
        this.cacheNamespace = cacheNamespace;
        this.connectionId = connectionId;
        this.connectionType = connectionType;
        this.contentHandling = contentHandling;
        this.credentials = credentials;
        this.integrationHttpMethod = integrationHttpMethod;
        this.integrationResponses = integrationResponses;
        this.passthroughBehavior = passthroughBehavior;
        this.requestParameters = requestParameters;
        this.requestTemplates = requestTemplates;
        this.timeoutInMillis = timeoutInMillis;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.uri = uri;
    }

    private MethodIntegrationArgs() {
        this.cacheKeyParameters = Output.empty();
        this.cacheNamespace = Output.empty();
        this.connectionId = Output.empty();
        this.connectionType = Output.empty();
        this.contentHandling = Output.empty();
        this.credentials = Output.empty();
        this.integrationHttpMethod = Output.empty();
        this.integrationResponses = Output.empty();
        this.passthroughBehavior = Output.empty();
        this.requestParameters = Output.empty();
        this.requestTemplates = Output.empty();
        this.timeoutInMillis = Output.empty();
        this.type = Output.empty();
        this.uri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> cacheKeyParameters;
        private @Nullable Output<String> cacheNamespace;
        private @Nullable Output<String> connectionId;
        private @Nullable Output<MethodIntegrationConnectionType> connectionType;
        private @Nullable Output<MethodIntegrationContentHandling> contentHandling;
        private @Nullable Output<String> credentials;
        private @Nullable Output<String> integrationHttpMethod;
        private @Nullable Output<List<MethodIntegrationResponseArgs>> integrationResponses;
        private @Nullable Output<MethodIntegrationPassthroughBehavior> passthroughBehavior;
        private @Nullable Output<Object> requestParameters;
        private @Nullable Output<Object> requestTemplates;
        private @Nullable Output<Integer> timeoutInMillis;
        private Output<MethodIntegrationType> type;
        private @Nullable Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodIntegrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheKeyParameters = defaults.cacheKeyParameters;
    	      this.cacheNamespace = defaults.cacheNamespace;
    	      this.connectionId = defaults.connectionId;
    	      this.connectionType = defaults.connectionType;
    	      this.contentHandling = defaults.contentHandling;
    	      this.credentials = defaults.credentials;
    	      this.integrationHttpMethod = defaults.integrationHttpMethod;
    	      this.integrationResponses = defaults.integrationResponses;
    	      this.passthroughBehavior = defaults.passthroughBehavior;
    	      this.requestParameters = defaults.requestParameters;
    	      this.requestTemplates = defaults.requestTemplates;
    	      this.timeoutInMillis = defaults.timeoutInMillis;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder cacheKeyParameters(@Nullable Output<List<String>> cacheKeyParameters) {
            this.cacheKeyParameters = cacheKeyParameters;
            return this;
        }

        public Builder cacheKeyParameters(@Nullable List<String> cacheKeyParameters) {
            this.cacheKeyParameters = Output.ofNullable(cacheKeyParameters);
            return this;
        }

        public Builder cacheNamespace(@Nullable Output<String> cacheNamespace) {
            this.cacheNamespace = cacheNamespace;
            return this;
        }

        public Builder cacheNamespace(@Nullable String cacheNamespace) {
            this.cacheNamespace = Output.ofNullable(cacheNamespace);
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

        public Builder connectionType(@Nullable Output<MethodIntegrationConnectionType> connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        public Builder connectionType(@Nullable MethodIntegrationConnectionType connectionType) {
            this.connectionType = Output.ofNullable(connectionType);
            return this;
        }

        public Builder contentHandling(@Nullable Output<MethodIntegrationContentHandling> contentHandling) {
            this.contentHandling = contentHandling;
            return this;
        }

        public Builder contentHandling(@Nullable MethodIntegrationContentHandling contentHandling) {
            this.contentHandling = Output.ofNullable(contentHandling);
            return this;
        }

        public Builder credentials(@Nullable Output<String> credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder credentials(@Nullable String credentials) {
            this.credentials = Output.ofNullable(credentials);
            return this;
        }

        public Builder integrationHttpMethod(@Nullable Output<String> integrationHttpMethod) {
            this.integrationHttpMethod = integrationHttpMethod;
            return this;
        }

        public Builder integrationHttpMethod(@Nullable String integrationHttpMethod) {
            this.integrationHttpMethod = Output.ofNullable(integrationHttpMethod);
            return this;
        }

        public Builder integrationResponses(@Nullable Output<List<MethodIntegrationResponseArgs>> integrationResponses) {
            this.integrationResponses = integrationResponses;
            return this;
        }

        public Builder integrationResponses(@Nullable List<MethodIntegrationResponseArgs> integrationResponses) {
            this.integrationResponses = Output.ofNullable(integrationResponses);
            return this;
        }

        public Builder passthroughBehavior(@Nullable Output<MethodIntegrationPassthroughBehavior> passthroughBehavior) {
            this.passthroughBehavior = passthroughBehavior;
            return this;
        }

        public Builder passthroughBehavior(@Nullable MethodIntegrationPassthroughBehavior passthroughBehavior) {
            this.passthroughBehavior = Output.ofNullable(passthroughBehavior);
            return this;
        }

        public Builder requestParameters(@Nullable Output<Object> requestParameters) {
            this.requestParameters = requestParameters;
            return this;
        }

        public Builder requestParameters(@Nullable Object requestParameters) {
            this.requestParameters = Output.ofNullable(requestParameters);
            return this;
        }

        public Builder requestTemplates(@Nullable Output<Object> requestTemplates) {
            this.requestTemplates = requestTemplates;
            return this;
        }

        public Builder requestTemplates(@Nullable Object requestTemplates) {
            this.requestTemplates = Output.ofNullable(requestTemplates);
            return this;
        }

        public Builder timeoutInMillis(@Nullable Output<Integer> timeoutInMillis) {
            this.timeoutInMillis = timeoutInMillis;
            return this;
        }

        public Builder timeoutInMillis(@Nullable Integer timeoutInMillis) {
            this.timeoutInMillis = Output.ofNullable(timeoutInMillis);
            return this;
        }

        public Builder type(Output<MethodIntegrationType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(MethodIntegrationType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder uri(@Nullable Output<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder uri(@Nullable String uri) {
            this.uri = Output.ofNullable(uri);
            return this;
        }
        public MethodIntegrationArgs build() {
            return new MethodIntegrationArgs(cacheKeyParameters, cacheNamespace, connectionId, connectionType, contentHandling, credentials, integrationHttpMethod, integrationResponses, passthroughBehavior, requestParameters, requestTemplates, timeoutInMillis, type, uri);
        }
    }
}
