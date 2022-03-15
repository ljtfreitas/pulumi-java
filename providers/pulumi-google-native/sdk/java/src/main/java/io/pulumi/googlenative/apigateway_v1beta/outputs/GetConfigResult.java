// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.apigateway_v1beta.outputs.ApigatewayApiConfigFileResponse;
import io.pulumi.googlenative.apigateway_v1beta.outputs.ApigatewayApiConfigGrpcServiceDefinitionResponse;
import io.pulumi.googlenative.apigateway_v1beta.outputs.ApigatewayApiConfigOpenApiDocumentResponse;
import io.pulumi.googlenative.apigateway_v1beta.outputs.ApigatewayGatewayConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetConfigResult {
    /**
     * Created time.
     * 
     */
    private final String createTime;
    /**
     * Optional. Display name.
     * 
     */
    private final String displayName;
    /**
     * Immutable. Gateway specific configuration.
     * 
     */
    private final ApigatewayGatewayConfigResponse gatewayConfig;
    /**
     * Immutable. The Google Cloud IAM Service Account that Gateways serving this config should use to authenticate to other services. This may either be the Service Account's email (`{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com`) or its full resource name (`projects/{PROJECT}/accounts/{UNIQUE_ID}`). This is most often used when the service is a GCP resource such as a Cloud Run Service or an IAP-secured service.
     * 
     */
    private final String gatewayServiceAccount;
    /**
     * Optional. gRPC service definition files. If specified, openapi_documents must not be included.
     * 
     */
    private final List<ApigatewayApiConfigGrpcServiceDefinitionResponse> grpcServices;
    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    private final Map<String,String> labels;
    /**
     * Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents. If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using "last one wins" semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     * 
     */
    private final List<ApigatewayApiConfigFileResponse> managedServiceConfigs;
    /**
     * Resource name of the API Config. Format: projects/{project}/locations/global/apis/{api}/configs/{api_config}
     * 
     */
    private final String name;
    /**
     * Optional. OpenAPI specification documents. If specified, grpc_services and managed_service_configs must not be included.
     * 
     */
    private final List<ApigatewayApiConfigOpenApiDocumentResponse> openapiDocuments;
    /**
     * The ID of the associated Service Config ( https://cloud.google.com/service-infrastructure/docs/glossary#config).
     * 
     */
    private final String serviceConfigId;
    /**
     * State of the API Config.
     * 
     */
    private final String state;
    /**
     * Updated time.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetConfigResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("gatewayConfig") ApigatewayGatewayConfigResponse gatewayConfig,
        @CustomType.Parameter("gatewayServiceAccount") String gatewayServiceAccount,
        @CustomType.Parameter("grpcServices") List<ApigatewayApiConfigGrpcServiceDefinitionResponse> grpcServices,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("managedServiceConfigs") List<ApigatewayApiConfigFileResponse> managedServiceConfigs,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("openapiDocuments") List<ApigatewayApiConfigOpenApiDocumentResponse> openapiDocuments,
        @CustomType.Parameter("serviceConfigId") String serviceConfigId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.displayName = displayName;
        this.gatewayConfig = gatewayConfig;
        this.gatewayServiceAccount = gatewayServiceAccount;
        this.grpcServices = grpcServices;
        this.labels = labels;
        this.managedServiceConfigs = managedServiceConfigs;
        this.name = name;
        this.openapiDocuments = openapiDocuments;
        this.serviceConfigId = serviceConfigId;
        this.state = state;
        this.updateTime = updateTime;
    }

    /**
     * Created time.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Optional. Display name.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Immutable. Gateway specific configuration.
     * 
    */
    public ApigatewayGatewayConfigResponse getGatewayConfig() {
        return this.gatewayConfig;
    }
    /**
     * Immutable. The Google Cloud IAM Service Account that Gateways serving this config should use to authenticate to other services. This may either be the Service Account's email (`{ACCOUNT_ID}@{PROJECT}.iam.gserviceaccount.com`) or its full resource name (`projects/{PROJECT}/accounts/{UNIQUE_ID}`). This is most often used when the service is a GCP resource such as a Cloud Run Service or an IAP-secured service.
     * 
    */
    public String getGatewayServiceAccount() {
        return this.gatewayServiceAccount;
    }
    /**
     * Optional. gRPC service definition files. If specified, openapi_documents must not be included.
     * 
    */
    public List<ApigatewayApiConfigGrpcServiceDefinitionResponse> getGrpcServices() {
        return this.grpcServices;
    }
    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents. If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using "last one wins" semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     * 
    */
    public List<ApigatewayApiConfigFileResponse> getManagedServiceConfigs() {
        return this.managedServiceConfigs;
    }
    /**
     * Resource name of the API Config. Format: projects/{project}/locations/global/apis/{api}/configs/{api_config}
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. OpenAPI specification documents. If specified, grpc_services and managed_service_configs must not be included.
     * 
    */
    public List<ApigatewayApiConfigOpenApiDocumentResponse> getOpenapiDocuments() {
        return this.openapiDocuments;
    }
    /**
     * The ID of the associated Service Config ( https://cloud.google.com/service-infrastructure/docs/glossary#config).
     * 
    */
    public String getServiceConfigId() {
        return this.serviceConfigId;
    }
    /**
     * State of the API Config.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Updated time.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String displayName;
        private ApigatewayGatewayConfigResponse gatewayConfig;
        private String gatewayServiceAccount;
        private List<ApigatewayApiConfigGrpcServiceDefinitionResponse> grpcServices;
        private Map<String,String> labels;
        private List<ApigatewayApiConfigFileResponse> managedServiceConfigs;
        private String name;
        private List<ApigatewayApiConfigOpenApiDocumentResponse> openapiDocuments;
        private String serviceConfigId;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.gatewayConfig = defaults.gatewayConfig;
    	      this.gatewayServiceAccount = defaults.gatewayServiceAccount;
    	      this.grpcServices = defaults.grpcServices;
    	      this.labels = defaults.labels;
    	      this.managedServiceConfigs = defaults.managedServiceConfigs;
    	      this.name = defaults.name;
    	      this.openapiDocuments = defaults.openapiDocuments;
    	      this.serviceConfigId = defaults.serviceConfigId;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder gatewayConfig(ApigatewayGatewayConfigResponse gatewayConfig) {
            this.gatewayConfig = Objects.requireNonNull(gatewayConfig);
            return this;
        }

        public Builder gatewayServiceAccount(String gatewayServiceAccount) {
            this.gatewayServiceAccount = Objects.requireNonNull(gatewayServiceAccount);
            return this;
        }

        public Builder grpcServices(List<ApigatewayApiConfigGrpcServiceDefinitionResponse> grpcServices) {
            this.grpcServices = Objects.requireNonNull(grpcServices);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder managedServiceConfigs(List<ApigatewayApiConfigFileResponse> managedServiceConfigs) {
            this.managedServiceConfigs = Objects.requireNonNull(managedServiceConfigs);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder openapiDocuments(List<ApigatewayApiConfigOpenApiDocumentResponse> openapiDocuments) {
            this.openapiDocuments = Objects.requireNonNull(openapiDocuments);
            return this;
        }

        public Builder serviceConfigId(String serviceConfigId) {
            this.serviceConfigId = Objects.requireNonNull(serviceConfigId);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetConfigResult build() {
            return new GetConfigResult(createTime, displayName, gatewayConfig, gatewayServiceAccount, grpcServices, labels, managedServiceConfigs, name, openapiDocuments, serviceConfigId, state, updateTime);
        }
    }
}
