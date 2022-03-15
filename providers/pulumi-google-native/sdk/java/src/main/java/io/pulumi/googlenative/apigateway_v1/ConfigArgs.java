// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.apigateway_v1.inputs.ApigatewayApiConfigFileArgs;
import io.pulumi.googlenative.apigateway_v1.inputs.ApigatewayApiConfigGrpcServiceDefinitionArgs;
import io.pulumi.googlenative.apigateway_v1.inputs.ApigatewayApiConfigOpenApiDocumentArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigArgs Empty = new ConfigArgs();

    @Import(name="apiConfigId", required=true)
      private final Output<String> apiConfigId;

    public Output<String> getApiConfigId() {
        return this.apiConfigId;
    }

    @Import(name="apiId", required=true)
      private final Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId;
    }

    /**
     * Optional. Display name.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Immutable. The Google Cloud IAM Service Account that Gateways serving this config should use to authenticate to other services. This may either be the Service Account's email (`{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com`) or its full resource name (`projects/{PROJECT}/accounts/{UNIQUE_ID}`). This is most often used when the service is a GCP resource such as a Cloud Run Service or an IAP-secured service.
     * 
     */
    @Import(name="gatewayServiceAccount")
      private final @Nullable Output<String> gatewayServiceAccount;

    public Output<String> getGatewayServiceAccount() {
        return this.gatewayServiceAccount == null ? Output.empty() : this.gatewayServiceAccount;
    }

    /**
     * Optional. gRPC service definition files. If specified, openapi_documents must not be included.
     * 
     */
    @Import(name="grpcServices")
      private final @Nullable Output<List<ApigatewayApiConfigGrpcServiceDefinitionArgs>> grpcServices;

    public Output<List<ApigatewayApiConfigGrpcServiceDefinitionArgs>> getGrpcServices() {
        return this.grpcServices == null ? Output.empty() : this.grpcServices;
    }

    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents. If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using "last one wins" semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     * 
     */
    @Import(name="managedServiceConfigs")
      private final @Nullable Output<List<ApigatewayApiConfigFileArgs>> managedServiceConfigs;

    public Output<List<ApigatewayApiConfigFileArgs>> getManagedServiceConfigs() {
        return this.managedServiceConfigs == null ? Output.empty() : this.managedServiceConfigs;
    }

    /**
     * Optional. OpenAPI specification documents. If specified, grpc_services and managed_service_configs must not be included.
     * 
     */
    @Import(name="openapiDocuments")
      private final @Nullable Output<List<ApigatewayApiConfigOpenApiDocumentArgs>> openapiDocuments;

    public Output<List<ApigatewayApiConfigOpenApiDocumentArgs>> getOpenapiDocuments() {
        return this.openapiDocuments == null ? Output.empty() : this.openapiDocuments;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public ConfigArgs(
        Output<String> apiConfigId,
        Output<String> apiId,
        @Nullable Output<String> displayName,
        @Nullable Output<String> gatewayServiceAccount,
        @Nullable Output<List<ApigatewayApiConfigGrpcServiceDefinitionArgs>> grpcServices,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<List<ApigatewayApiConfigFileArgs>> managedServiceConfigs,
        @Nullable Output<List<ApigatewayApiConfigOpenApiDocumentArgs>> openapiDocuments,
        @Nullable Output<String> project) {
        this.apiConfigId = Objects.requireNonNull(apiConfigId, "expected parameter 'apiConfigId' to be non-null");
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.displayName = displayName;
        this.gatewayServiceAccount = gatewayServiceAccount;
        this.grpcServices = grpcServices;
        this.labels = labels;
        this.location = location;
        this.managedServiceConfigs = managedServiceConfigs;
        this.openapiDocuments = openapiDocuments;
        this.project = project;
    }

    private ConfigArgs() {
        this.apiConfigId = Output.empty();
        this.apiId = Output.empty();
        this.displayName = Output.empty();
        this.gatewayServiceAccount = Output.empty();
        this.grpcServices = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.managedServiceConfigs = Output.empty();
        this.openapiDocuments = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiConfigId;
        private Output<String> apiId;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> gatewayServiceAccount;
        private @Nullable Output<List<ApigatewayApiConfigGrpcServiceDefinitionArgs>> grpcServices;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<List<ApigatewayApiConfigFileArgs>> managedServiceConfigs;
        private @Nullable Output<List<ApigatewayApiConfigOpenApiDocumentArgs>> openapiDocuments;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiConfigId = defaults.apiConfigId;
    	      this.apiId = defaults.apiId;
    	      this.displayName = defaults.displayName;
    	      this.gatewayServiceAccount = defaults.gatewayServiceAccount;
    	      this.grpcServices = defaults.grpcServices;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.managedServiceConfigs = defaults.managedServiceConfigs;
    	      this.openapiDocuments = defaults.openapiDocuments;
    	      this.project = defaults.project;
        }

        public Builder apiConfigId(Output<String> apiConfigId) {
            this.apiConfigId = Objects.requireNonNull(apiConfigId);
            return this;
        }

        public Builder apiConfigId(String apiConfigId) {
            this.apiConfigId = Output.of(Objects.requireNonNull(apiConfigId));
            return this;
        }

        public Builder apiId(Output<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder apiId(String apiId) {
            this.apiId = Output.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder gatewayServiceAccount(@Nullable Output<String> gatewayServiceAccount) {
            this.gatewayServiceAccount = gatewayServiceAccount;
            return this;
        }

        public Builder gatewayServiceAccount(@Nullable String gatewayServiceAccount) {
            this.gatewayServiceAccount = Output.ofNullable(gatewayServiceAccount);
            return this;
        }

        public Builder grpcServices(@Nullable Output<List<ApigatewayApiConfigGrpcServiceDefinitionArgs>> grpcServices) {
            this.grpcServices = grpcServices;
            return this;
        }

        public Builder grpcServices(@Nullable List<ApigatewayApiConfigGrpcServiceDefinitionArgs> grpcServices) {
            this.grpcServices = Output.ofNullable(grpcServices);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder managedServiceConfigs(@Nullable Output<List<ApigatewayApiConfigFileArgs>> managedServiceConfigs) {
            this.managedServiceConfigs = managedServiceConfigs;
            return this;
        }

        public Builder managedServiceConfigs(@Nullable List<ApigatewayApiConfigFileArgs> managedServiceConfigs) {
            this.managedServiceConfigs = Output.ofNullable(managedServiceConfigs);
            return this;
        }

        public Builder openapiDocuments(@Nullable Output<List<ApigatewayApiConfigOpenApiDocumentArgs>> openapiDocuments) {
            this.openapiDocuments = openapiDocuments;
            return this;
        }

        public Builder openapiDocuments(@Nullable List<ApigatewayApiConfigOpenApiDocumentArgs> openapiDocuments) {
            this.openapiDocuments = Output.ofNullable(openapiDocuments);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public ConfigArgs build() {
            return new ConfigArgs(apiConfigId, apiId, displayName, gatewayServiceAccount, grpcServices, labels, location, managedServiceConfigs, openapiDocuments, project);
        }
    }
}
