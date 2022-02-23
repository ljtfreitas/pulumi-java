// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.apigateway_v1beta.inputs.ApigatewayApiConfigFileArgs;
import io.pulumi.googlenative.apigateway_v1beta.inputs.ApigatewayApiConfigGrpcServiceDefinitionArgs;
import io.pulumi.googlenative.apigateway_v1beta.inputs.ApigatewayApiConfigOpenApiDocumentArgs;
import io.pulumi.googlenative.apigateway_v1beta.inputs.ApigatewayGatewayConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigArgs Empty = new ConfigArgs();

    @InputImport(name="apiConfigId", required=true)
      private final Input<String> apiConfigId;

    public Input<String> getApiConfigId() {
        return this.apiConfigId;
    }

    @InputImport(name="apiId", required=true)
      private final Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId;
    }

    /**
     * Optional. Display name.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Immutable. Gateway specific configuration.
     * 
     */
    @InputImport(name="gatewayConfig")
      private final @Nullable Input<ApigatewayGatewayConfigArgs> gatewayConfig;

    public Input<ApigatewayGatewayConfigArgs> getGatewayConfig() {
        return this.gatewayConfig == null ? Input.empty() : this.gatewayConfig;
    }

    /**
     * Immutable. The Google Cloud IAM Service Account that Gateways serving this config should use to authenticate to other services. This may either be the Service Account's email (`{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com`) or its full resource name (`projects/{PROJECT}/accounts/{UNIQUE_ID}`). This is most often used when the service is a GCP resource such as a Cloud Run Service or an IAP-secured service.
     * 
     */
    @InputImport(name="gatewayServiceAccount")
      private final @Nullable Input<String> gatewayServiceAccount;

    public Input<String> getGatewayServiceAccount() {
        return this.gatewayServiceAccount == null ? Input.empty() : this.gatewayServiceAccount;
    }

    /**
     * Optional. gRPC service definition files. If specified, openapi_documents must not be included.
     * 
     */
    @InputImport(name="grpcServices")
      private final @Nullable Input<List<ApigatewayApiConfigGrpcServiceDefinitionArgs>> grpcServices;

    public Input<List<ApigatewayApiConfigGrpcServiceDefinitionArgs>> getGrpcServices() {
        return this.grpcServices == null ? Input.empty() : this.grpcServices;
    }

    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents. If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using "last one wins" semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     * 
     */
    @InputImport(name="managedServiceConfigs")
      private final @Nullable Input<List<ApigatewayApiConfigFileArgs>> managedServiceConfigs;

    public Input<List<ApigatewayApiConfigFileArgs>> getManagedServiceConfigs() {
        return this.managedServiceConfigs == null ? Input.empty() : this.managedServiceConfigs;
    }

    /**
     * Optional. OpenAPI specification documents. If specified, grpc_services and managed_service_configs must not be included.
     * 
     */
    @InputImport(name="openapiDocuments")
      private final @Nullable Input<List<ApigatewayApiConfigOpenApiDocumentArgs>> openapiDocuments;

    public Input<List<ApigatewayApiConfigOpenApiDocumentArgs>> getOpenapiDocuments() {
        return this.openapiDocuments == null ? Input.empty() : this.openapiDocuments;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public ConfigArgs(
        Input<String> apiConfigId,
        Input<String> apiId,
        @Nullable Input<String> displayName,
        @Nullable Input<ApigatewayGatewayConfigArgs> gatewayConfig,
        @Nullable Input<String> gatewayServiceAccount,
        @Nullable Input<List<ApigatewayApiConfigGrpcServiceDefinitionArgs>> grpcServices,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<List<ApigatewayApiConfigFileArgs>> managedServiceConfigs,
        @Nullable Input<List<ApigatewayApiConfigOpenApiDocumentArgs>> openapiDocuments,
        @Nullable Input<String> project) {
        this.apiConfigId = Objects.requireNonNull(apiConfigId, "expected parameter 'apiConfigId' to be non-null");
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.displayName = displayName;
        this.gatewayConfig = gatewayConfig;
        this.gatewayServiceAccount = gatewayServiceAccount;
        this.grpcServices = grpcServices;
        this.labels = labels;
        this.location = location;
        this.managedServiceConfigs = managedServiceConfigs;
        this.openapiDocuments = openapiDocuments;
        this.project = project;
    }

    private ConfigArgs() {
        this.apiConfigId = Input.empty();
        this.apiId = Input.empty();
        this.displayName = Input.empty();
        this.gatewayConfig = Input.empty();
        this.gatewayServiceAccount = Input.empty();
        this.grpcServices = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.managedServiceConfigs = Input.empty();
        this.openapiDocuments = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> apiConfigId;
        private Input<String> apiId;
        private @Nullable Input<String> displayName;
        private @Nullable Input<ApigatewayGatewayConfigArgs> gatewayConfig;
        private @Nullable Input<String> gatewayServiceAccount;
        private @Nullable Input<List<ApigatewayApiConfigGrpcServiceDefinitionArgs>> grpcServices;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<List<ApigatewayApiConfigFileArgs>> managedServiceConfigs;
        private @Nullable Input<List<ApigatewayApiConfigOpenApiDocumentArgs>> openapiDocuments;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiConfigId = defaults.apiConfigId;
    	      this.apiId = defaults.apiId;
    	      this.displayName = defaults.displayName;
    	      this.gatewayConfig = defaults.gatewayConfig;
    	      this.gatewayServiceAccount = defaults.gatewayServiceAccount;
    	      this.grpcServices = defaults.grpcServices;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.managedServiceConfigs = defaults.managedServiceConfigs;
    	      this.openapiDocuments = defaults.openapiDocuments;
    	      this.project = defaults.project;
        }

        public Builder setApiConfigId(Input<String> apiConfigId) {
            this.apiConfigId = Objects.requireNonNull(apiConfigId);
            return this;
        }

        public Builder setApiConfigId(String apiConfigId) {
            this.apiConfigId = Input.of(Objects.requireNonNull(apiConfigId));
            return this;
        }

        public Builder setApiId(Input<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Input.of(Objects.requireNonNull(apiId));
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

        public Builder setGatewayConfig(@Nullable Input<ApigatewayGatewayConfigArgs> gatewayConfig) {
            this.gatewayConfig = gatewayConfig;
            return this;
        }

        public Builder setGatewayConfig(@Nullable ApigatewayGatewayConfigArgs gatewayConfig) {
            this.gatewayConfig = Input.ofNullable(gatewayConfig);
            return this;
        }

        public Builder setGatewayServiceAccount(@Nullable Input<String> gatewayServiceAccount) {
            this.gatewayServiceAccount = gatewayServiceAccount;
            return this;
        }

        public Builder setGatewayServiceAccount(@Nullable String gatewayServiceAccount) {
            this.gatewayServiceAccount = Input.ofNullable(gatewayServiceAccount);
            return this;
        }

        public Builder setGrpcServices(@Nullable Input<List<ApigatewayApiConfigGrpcServiceDefinitionArgs>> grpcServices) {
            this.grpcServices = grpcServices;
            return this;
        }

        public Builder setGrpcServices(@Nullable List<ApigatewayApiConfigGrpcServiceDefinitionArgs> grpcServices) {
            this.grpcServices = Input.ofNullable(grpcServices);
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

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setManagedServiceConfigs(@Nullable Input<List<ApigatewayApiConfigFileArgs>> managedServiceConfigs) {
            this.managedServiceConfigs = managedServiceConfigs;
            return this;
        }

        public Builder setManagedServiceConfigs(@Nullable List<ApigatewayApiConfigFileArgs> managedServiceConfigs) {
            this.managedServiceConfigs = Input.ofNullable(managedServiceConfigs);
            return this;
        }

        public Builder setOpenapiDocuments(@Nullable Input<List<ApigatewayApiConfigOpenApiDocumentArgs>> openapiDocuments) {
            this.openapiDocuments = openapiDocuments;
            return this;
        }

        public Builder setOpenapiDocuments(@Nullable List<ApigatewayApiConfigOpenApiDocumentArgs> openapiDocuments) {
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
        public ConfigArgs build() {
            return new ConfigArgs(apiConfigId, apiId, displayName, gatewayConfig, gatewayServiceAccount, grpcServices, labels, location, managedServiceConfigs, openapiDocuments, project);
        }
    }
}
