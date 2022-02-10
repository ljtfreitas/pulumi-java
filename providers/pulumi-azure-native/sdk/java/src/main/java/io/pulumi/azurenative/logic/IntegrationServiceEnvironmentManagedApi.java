// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.IntegrationServiceEnvironmentManagedApiArgs;
import io.pulumi.azurenative.logic.outputs.ApiResourceBackendServiceResponse;
import io.pulumi.azurenative.logic.outputs.ApiResourceDefinitionsResponse;
import io.pulumi.azurenative.logic.outputs.ApiResourceGeneralInformationResponse;
import io.pulumi.azurenative.logic.outputs.ApiResourceMetadataResponse;
import io.pulumi.azurenative.logic.outputs.ApiResourcePoliciesResponse;
import io.pulumi.azurenative.logic.outputs.IntegrationServiceEnvironmentManagedApiDeploymentParametersResponse;
import io.pulumi.azurenative.logic.outputs.ResourceReferenceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:logic:IntegrationServiceEnvironmentManagedApi")
public class IntegrationServiceEnvironmentManagedApi extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiDefinitionUrl", type=String.class, parameters={})
    private Output<String> apiDefinitionUrl;

    public Output<String> getApiDefinitionUrl() {
        return this.apiDefinitionUrl;
    }
    @OutputExport(name="apiDefinitions", type=ApiResourceDefinitionsResponse.class, parameters={})
    private Output<ApiResourceDefinitionsResponse> apiDefinitions;

    public Output<ApiResourceDefinitionsResponse> getApiDefinitions() {
        return this.apiDefinitions;
    }
    @OutputExport(name="backendService", type=ApiResourceBackendServiceResponse.class, parameters={})
    private Output<ApiResourceBackendServiceResponse> backendService;

    public Output<ApiResourceBackendServiceResponse> getBackendService() {
        return this.backendService;
    }
    @OutputExport(name="capabilities", type=List.class, parameters={String.class})
    private Output<List<String>> capabilities;

    public Output<List<String>> getCapabilities() {
        return this.capabilities;
    }
    @OutputExport(name="category", type=String.class, parameters={})
    private Output<String> category;

    public Output<String> getCategory() {
        return this.category;
    }
    @OutputExport(name="connectionParameters", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> connectionParameters;

    public Output<Map<String,Object>> getConnectionParameters() {
        return this.connectionParameters;
    }
    @OutputExport(name="deploymentParameters", type=IntegrationServiceEnvironmentManagedApiDeploymentParametersResponse.class, parameters={})
    private Output</* @Nullable */ IntegrationServiceEnvironmentManagedApiDeploymentParametersResponse> deploymentParameters;

    public Output</* @Nullable */ IntegrationServiceEnvironmentManagedApiDeploymentParametersResponse> getDeploymentParameters() {
        return this.deploymentParameters;
    }
    @OutputExport(name="generalInformation", type=ApiResourceGeneralInformationResponse.class, parameters={})
    private Output<ApiResourceGeneralInformationResponse> generalInformation;

    public Output<ApiResourceGeneralInformationResponse> getGeneralInformation() {
        return this.generalInformation;
    }
    @OutputExport(name="integrationServiceEnvironment", type=ResourceReferenceResponse.class, parameters={})
    private Output</* @Nullable */ ResourceReferenceResponse> integrationServiceEnvironment;

    public Output</* @Nullable */ ResourceReferenceResponse> getIntegrationServiceEnvironment() {
        return this.integrationServiceEnvironment;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="metadata", type=ApiResourceMetadataResponse.class, parameters={})
    private Output<ApiResourceMetadataResponse> metadata;

    public Output<ApiResourceMetadataResponse> getMetadata() {
        return this.metadata;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="policies", type=ApiResourcePoliciesResponse.class, parameters={})
    private Output<ApiResourcePoliciesResponse> policies;

    public Output<ApiResourcePoliciesResponse> getPolicies() {
        return this.policies;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="runtimeUrls", type=List.class, parameters={String.class})
    private Output<List<String>> runtimeUrls;

    public Output<List<String>> getRuntimeUrls() {
        return this.runtimeUrls;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public IntegrationServiceEnvironmentManagedApi(String name, IntegrationServiceEnvironmentManagedApiArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationServiceEnvironmentManagedApi", name, args == null ? IntegrationServiceEnvironmentManagedApiArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IntegrationServiceEnvironmentManagedApi(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationServiceEnvironmentManagedApi", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:logic/v20190501:IntegrationServiceEnvironmentManagedApi").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static IntegrationServiceEnvironmentManagedApi get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationServiceEnvironmentManagedApi(name, id, options);
    }
}