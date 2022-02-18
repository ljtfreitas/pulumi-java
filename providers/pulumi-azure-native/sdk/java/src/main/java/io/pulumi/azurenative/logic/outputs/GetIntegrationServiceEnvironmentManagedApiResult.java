// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.ApiResourceBackendServiceResponse;
import io.pulumi.azurenative.logic.outputs.ApiResourceDefinitionsResponse;
import io.pulumi.azurenative.logic.outputs.ApiResourceGeneralInformationResponse;
import io.pulumi.azurenative.logic.outputs.ApiResourceMetadataResponse;
import io.pulumi.azurenative.logic.outputs.ApiResourcePoliciesResponse;
import io.pulumi.azurenative.logic.outputs.IntegrationServiceEnvironmentManagedApiDeploymentParametersResponse;
import io.pulumi.azurenative.logic.outputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIntegrationServiceEnvironmentManagedApiResult {
    /**
     * The API definition.
     * 
     */
    private final String apiDefinitionUrl;
    /**
     * The api definitions.
     * 
     */
    private final ApiResourceDefinitionsResponse apiDefinitions;
    /**
     * The backend service.
     * 
     */
    private final ApiResourceBackendServiceResponse backendService;
    /**
     * The capabilities.
     * 
     */
    private final List<String> capabilities;
    /**
     * The category.
     * 
     */
    private final String category;
    /**
     * The connection parameters.
     * 
     */
    private final Map<String,Object> connectionParameters;
    /**
     * The integration service environment managed api deployment parameters.
     * 
     */
    private final @Nullable IntegrationServiceEnvironmentManagedApiDeploymentParametersResponse deploymentParameters;
    /**
     * The api general information.
     * 
     */
    private final ApiResourceGeneralInformationResponse generalInformation;
    /**
     * The resource id.
     * 
     */
    private final String id;
    /**
     * The integration service environment reference.
     * 
     */
    private final @Nullable ResourceReferenceResponse integrationServiceEnvironment;
    /**
     * The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The metadata.
     * 
     */
    private final ApiResourceMetadataResponse metadata;
    /**
     * Gets the resource name.
     * 
     */
    private final String name;
    /**
     * The policies for the API.
     * 
     */
    private final ApiResourcePoliciesResponse policies;
    /**
     * The provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * The runtime urls.
     * 
     */
    private final List<String> runtimeUrls;
    /**
     * The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Gets the resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"apiDefinitionUrl","apiDefinitions","backendService","capabilities","category","connectionParameters","deploymentParameters","generalInformation","id","integrationServiceEnvironment","location","metadata","name","policies","provisioningState","runtimeUrls","tags","type"})
    private GetIntegrationServiceEnvironmentManagedApiResult(
        String apiDefinitionUrl,
        ApiResourceDefinitionsResponse apiDefinitions,
        ApiResourceBackendServiceResponse backendService,
        List<String> capabilities,
        String category,
        Map<String,Object> connectionParameters,
        @Nullable IntegrationServiceEnvironmentManagedApiDeploymentParametersResponse deploymentParameters,
        ApiResourceGeneralInformationResponse generalInformation,
        String id,
        @Nullable ResourceReferenceResponse integrationServiceEnvironment,
        @Nullable String location,
        ApiResourceMetadataResponse metadata,
        String name,
        ApiResourcePoliciesResponse policies,
        String provisioningState,
        List<String> runtimeUrls,
        @Nullable Map<String,String> tags,
        String type) {
        this.apiDefinitionUrl = Objects.requireNonNull(apiDefinitionUrl);
        this.apiDefinitions = Objects.requireNonNull(apiDefinitions);
        this.backendService = Objects.requireNonNull(backendService);
        this.capabilities = Objects.requireNonNull(capabilities);
        this.category = Objects.requireNonNull(category);
        this.connectionParameters = Objects.requireNonNull(connectionParameters);
        this.deploymentParameters = deploymentParameters;
        this.generalInformation = Objects.requireNonNull(generalInformation);
        this.id = Objects.requireNonNull(id);
        this.integrationServiceEnvironment = integrationServiceEnvironment;
        this.location = location;
        this.metadata = Objects.requireNonNull(metadata);
        this.name = Objects.requireNonNull(name);
        this.policies = Objects.requireNonNull(policies);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.runtimeUrls = Objects.requireNonNull(runtimeUrls);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The API definition.
     * 
     */
    public String getApiDefinitionUrl() {
        return this.apiDefinitionUrl;
    }
    /**
     * The api definitions.
     * 
     */
    public ApiResourceDefinitionsResponse getApiDefinitions() {
        return this.apiDefinitions;
    }
    /**
     * The backend service.
     * 
     */
    public ApiResourceBackendServiceResponse getBackendService() {
        return this.backendService;
    }
    /**
     * The capabilities.
     * 
     */
    public List<String> getCapabilities() {
        return this.capabilities;
    }
    /**
     * The category.
     * 
     */
    public String getCategory() {
        return this.category;
    }
    /**
     * The connection parameters.
     * 
     */
    public Map<String,Object> getConnectionParameters() {
        return this.connectionParameters;
    }
    /**
     * The integration service environment managed api deployment parameters.
     * 
     */
    public Optional<IntegrationServiceEnvironmentManagedApiDeploymentParametersResponse> getDeploymentParameters() {
        return Optional.ofNullable(this.deploymentParameters);
    }
    /**
     * The api general information.
     * 
     */
    public ApiResourceGeneralInformationResponse getGeneralInformation() {
        return this.generalInformation;
    }
    /**
     * The resource id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The integration service environment reference.
     * 
     */
    public Optional<ResourceReferenceResponse> getIntegrationServiceEnvironment() {
        return Optional.ofNullable(this.integrationServiceEnvironment);
    }
    /**
     * The resource location.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The metadata.
     * 
     */
    public ApiResourceMetadataResponse getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The policies for the API.
     * 
     */
    public ApiResourcePoliciesResponse getPolicies() {
        return this.policies;
    }
    /**
     * The provisioning state.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The runtime urls.
     * 
     */
    public List<String> getRuntimeUrls() {
        return this.runtimeUrls;
    }
    /**
     * The resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Gets the resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationServiceEnvironmentManagedApiResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiDefinitionUrl;
        private ApiResourceDefinitionsResponse apiDefinitions;
        private ApiResourceBackendServiceResponse backendService;
        private List<String> capabilities;
        private String category;
        private Map<String,Object> connectionParameters;
        private @Nullable IntegrationServiceEnvironmentManagedApiDeploymentParametersResponse deploymentParameters;
        private ApiResourceGeneralInformationResponse generalInformation;
        private String id;
        private @Nullable ResourceReferenceResponse integrationServiceEnvironment;
        private @Nullable String location;
        private ApiResourceMetadataResponse metadata;
        private String name;
        private ApiResourcePoliciesResponse policies;
        private String provisioningState;
        private List<String> runtimeUrls;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationServiceEnvironmentManagedApiResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiDefinitionUrl = defaults.apiDefinitionUrl;
    	      this.apiDefinitions = defaults.apiDefinitions;
    	      this.backendService = defaults.backendService;
    	      this.capabilities = defaults.capabilities;
    	      this.category = defaults.category;
    	      this.connectionParameters = defaults.connectionParameters;
    	      this.deploymentParameters = defaults.deploymentParameters;
    	      this.generalInformation = defaults.generalInformation;
    	      this.id = defaults.id;
    	      this.integrationServiceEnvironment = defaults.integrationServiceEnvironment;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.policies = defaults.policies;
    	      this.provisioningState = defaults.provisioningState;
    	      this.runtimeUrls = defaults.runtimeUrls;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setApiDefinitionUrl(String apiDefinitionUrl) {
            this.apiDefinitionUrl = Objects.requireNonNull(apiDefinitionUrl);
            return this;
        }

        public Builder setApiDefinitions(ApiResourceDefinitionsResponse apiDefinitions) {
            this.apiDefinitions = Objects.requireNonNull(apiDefinitions);
            return this;
        }

        public Builder setBackendService(ApiResourceBackendServiceResponse backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }

        public Builder setCapabilities(List<String> capabilities) {
            this.capabilities = Objects.requireNonNull(capabilities);
            return this;
        }

        public Builder setCategory(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }

        public Builder setConnectionParameters(Map<String,Object> connectionParameters) {
            this.connectionParameters = Objects.requireNonNull(connectionParameters);
            return this;
        }

        public Builder setDeploymentParameters(@Nullable IntegrationServiceEnvironmentManagedApiDeploymentParametersResponse deploymentParameters) {
            this.deploymentParameters = deploymentParameters;
            return this;
        }

        public Builder setGeneralInformation(ApiResourceGeneralInformationResponse generalInformation) {
            this.generalInformation = Objects.requireNonNull(generalInformation);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIntegrationServiceEnvironment(@Nullable ResourceReferenceResponse integrationServiceEnvironment) {
            this.integrationServiceEnvironment = integrationServiceEnvironment;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMetadata(ApiResourceMetadataResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicies(ApiResourcePoliciesResponse policies) {
            this.policies = Objects.requireNonNull(policies);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRuntimeUrls(List<String> runtimeUrls) {
            this.runtimeUrls = Objects.requireNonNull(runtimeUrls);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetIntegrationServiceEnvironmentManagedApiResult build() {
            return new GetIntegrationServiceEnvironmentManagedApiResult(apiDefinitionUrl, apiDefinitions, backendService, capabilities, category, connectionParameters, deploymentParameters, generalInformation, id, integrationServiceEnvironment, location, metadata, name, policies, provisioningState, runtimeUrls, tags, type);
        }
    }
}
