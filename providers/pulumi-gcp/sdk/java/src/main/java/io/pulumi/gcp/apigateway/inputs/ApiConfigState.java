// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigGetArgs;
import io.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiConfigState extends io.pulumi.resources.ResourceArgs {

    public static final ApiConfigState Empty = new ApiConfigState();

    /**
     * The API to attach the config to.
     * 
     */
    @InputImport(name="api")
        private final @Nullable Input<String> api;

    public Input<String> getApi() {
        return this.api == null ? Input.empty() : this.api;
    }

    /**
     * Identifier to assign to the API Config. Must be unique within scope of the parent resource(api).
     * 
     */
    @InputImport(name="apiConfigId")
        private final @Nullable Input<String> apiConfigId;

    public Input<String> getApiConfigId() {
        return this.apiConfigId == null ? Input.empty() : this.apiConfigId;
    }

    /**
     * Creates a unique name beginning with the
     * specified prefix. If this and api_config_id are unspecified, a random value is chosen for the name.
     * 
     */
    @InputImport(name="apiConfigIdPrefix")
        private final @Nullable Input<String> apiConfigIdPrefix;

    public Input<String> getApiConfigIdPrefix() {
        return this.apiConfigIdPrefix == null ? Input.empty() : this.apiConfigIdPrefix;
    }

    /**
     * A user-visible name for the API.
     * 
     */
    @InputImport(name="displayName")
        private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Immutable. Gateway specific configuration.
     * If not specified, backend authentication will be set to use OIDC authentication using the default compute service account
     * Structure is documented below.
     * 
     */
    @InputImport(name="gatewayConfig")
        private final @Nullable Input<ApiConfigGatewayConfigGetArgs> gatewayConfig;

    public Input<ApiConfigGatewayConfigGetArgs> getGatewayConfig() {
        return this.gatewayConfig == null ? Input.empty() : this.gatewayConfig;
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @InputImport(name="labels")
        private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The resource name of the API Config.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * An OpenAPI Specification Document describing an API.
     * Structure is documented below.
     * 
     */
    @InputImport(name="openapiDocuments")
        private final @Nullable Input<List<ApiConfigOpenapiDocumentGetArgs>> openapiDocuments;

    public Input<List<ApiConfigOpenapiDocumentGetArgs>> getOpenapiDocuments() {
        return this.openapiDocuments == null ? Input.empty() : this.openapiDocuments;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The ID of the associated Service Config (https://cloud.google.com/service-infrastructure/docs/glossary#config).
     * 
     */
    @InputImport(name="serviceConfigId")
        private final @Nullable Input<String> serviceConfigId;

    public Input<String> getServiceConfigId() {
        return this.serviceConfigId == null ? Input.empty() : this.serviceConfigId;
    }

    public ApiConfigState(
        @Nullable Input<String> api,
        @Nullable Input<String> apiConfigId,
        @Nullable Input<String> apiConfigIdPrefix,
        @Nullable Input<String> displayName,
        @Nullable Input<ApiConfigGatewayConfigGetArgs> gatewayConfig,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<List<ApiConfigOpenapiDocumentGetArgs>> openapiDocuments,
        @Nullable Input<String> project,
        @Nullable Input<String> serviceConfigId) {
        this.api = api;
        this.apiConfigId = apiConfigId;
        this.apiConfigIdPrefix = apiConfigIdPrefix;
        this.displayName = displayName;
        this.gatewayConfig = gatewayConfig;
        this.labels = labels;
        this.name = name;
        this.openapiDocuments = openapiDocuments;
        this.project = project;
        this.serviceConfigId = serviceConfigId;
    }

    private ApiConfigState() {
        this.api = Input.empty();
        this.apiConfigId = Input.empty();
        this.apiConfigIdPrefix = Input.empty();
        this.displayName = Input.empty();
        this.gatewayConfig = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.openapiDocuments = Input.empty();
        this.project = Input.empty();
        this.serviceConfigId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> api;
        private @Nullable Input<String> apiConfigId;
        private @Nullable Input<String> apiConfigIdPrefix;
        private @Nullable Input<String> displayName;
        private @Nullable Input<ApiConfigGatewayConfigGetArgs> gatewayConfig;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ApiConfigOpenapiDocumentGetArgs>> openapiDocuments;
        private @Nullable Input<String> project;
        private @Nullable Input<String> serviceConfigId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.apiConfigId = defaults.apiConfigId;
    	      this.apiConfigIdPrefix = defaults.apiConfigIdPrefix;
    	      this.displayName = defaults.displayName;
    	      this.gatewayConfig = defaults.gatewayConfig;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.openapiDocuments = defaults.openapiDocuments;
    	      this.project = defaults.project;
    	      this.serviceConfigId = defaults.serviceConfigId;
        }

        public Builder setApi(@Nullable Input<String> api) {
            this.api = api;
            return this;
        }

        public Builder setApi(@Nullable String api) {
            this.api = Input.ofNullable(api);
            return this;
        }

        public Builder setApiConfigId(@Nullable Input<String> apiConfigId) {
            this.apiConfigId = apiConfigId;
            return this;
        }

        public Builder setApiConfigId(@Nullable String apiConfigId) {
            this.apiConfigId = Input.ofNullable(apiConfigId);
            return this;
        }

        public Builder setApiConfigIdPrefix(@Nullable Input<String> apiConfigIdPrefix) {
            this.apiConfigIdPrefix = apiConfigIdPrefix;
            return this;
        }

        public Builder setApiConfigIdPrefix(@Nullable String apiConfigIdPrefix) {
            this.apiConfigIdPrefix = Input.ofNullable(apiConfigIdPrefix);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setGatewayConfig(@Nullable Input<ApiConfigGatewayConfigGetArgs> gatewayConfig) {
            this.gatewayConfig = gatewayConfig;
            return this;
        }

        public Builder setGatewayConfig(@Nullable ApiConfigGatewayConfigGetArgs gatewayConfig) {
            this.gatewayConfig = Input.ofNullable(gatewayConfig);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOpenapiDocuments(@Nullable Input<List<ApiConfigOpenapiDocumentGetArgs>> openapiDocuments) {
            this.openapiDocuments = openapiDocuments;
            return this;
        }

        public Builder setOpenapiDocuments(@Nullable List<ApiConfigOpenapiDocumentGetArgs> openapiDocuments) {
            this.openapiDocuments = Input.ofNullable(openapiDocuments);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setServiceConfigId(@Nullable Input<String> serviceConfigId) {
            this.serviceConfigId = serviceConfigId;
            return this;
        }

        public Builder setServiceConfigId(@Nullable String serviceConfigId) {
            this.serviceConfigId = Input.ofNullable(serviceConfigId);
            return this;
        }
        public ApiConfigState build() {
            return new ApiConfigState(api, apiConfigId, apiConfigIdPrefix, displayName, gatewayConfig, labels, name, openapiDocuments, project, serviceConfigId);
        }
    }
}
