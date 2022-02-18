// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.EnvironmentArgs;
import io.pulumi.azurenative.devtestlab.outputs.EnvironmentDeploymentPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An environment, which is essentially an ARM template deployment.
 * API Version: 2018-09-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:devtestlab:Environment {environmentName} /subscriptions/{subscriptionId}/resourcegroups/resourceGroupName/providers/microsoft.devtestlab/labs/{labName}/users/{uniqueIdentifier}/environments/{environmentName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:devtestlab:Environment")
public class Environment extends io.pulumi.resources.CustomResource {
    /**
     * The display name of the Azure Resource Manager template that produced the environment.
     * 
     */
    @OutputExport(name="armTemplateDisplayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> armTemplateDisplayName;

    /**
     * @return The display name of the Azure Resource Manager template that produced the environment.
     * 
     */
    public Output</* @Nullable */ String> getArmTemplateDisplayName() {
        return this.armTemplateDisplayName;
    }
    /**
     * The creator of the environment.
     * 
     */
    @OutputExport(name="createdByUser", type=String.class, parameters={})
    private Output<String> createdByUser;

    /**
     * @return The creator of the environment.
     * 
     */
    public Output<String> getCreatedByUser() {
        return this.createdByUser;
    }
    /**
     * The deployment properties of the environment.
     * 
     */
    @OutputExport(name="deploymentProperties", type=EnvironmentDeploymentPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ EnvironmentDeploymentPropertiesResponse> deploymentProperties;

    /**
     * @return The deployment properties of the environment.
     * 
     */
    public Output</* @Nullable */ EnvironmentDeploymentPropertiesResponse> getDeploymentProperties() {
        return this.deploymentProperties;
    }
    /**
     * The location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The identifier of the resource group containing the environment's resources.
     * 
     */
    @OutputExport(name="resourceGroupId", type=String.class, parameters={})
    private Output<String> resourceGroupId;

    /**
     * @return The identifier of the resource group containing the environment's resources.
     * 
     */
    public Output<String> getResourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The tags of the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @OutputExport(name="uniqueIdentifier", type=String.class, parameters={})
    private Output<String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Output<String> getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Environment(String name, EnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:Environment", name, args == null ? EnvironmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Environment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:Environment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:devtestlab/v20160515:Environment").build()),
                Input.of(Alias.builder().setType("azure-native:devtestlab/v20180915:Environment").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Environment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Environment(name, id, options);
    }
}
