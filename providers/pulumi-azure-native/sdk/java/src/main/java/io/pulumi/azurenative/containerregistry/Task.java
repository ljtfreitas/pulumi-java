// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.TaskArgs;
import io.pulumi.azurenative.containerregistry.outputs.AgentPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.CredentialsResponse;
import io.pulumi.azurenative.containerregistry.outputs.DockerBuildStepResponse;
import io.pulumi.azurenative.containerregistry.outputs.EncodedTaskStepResponse;
import io.pulumi.azurenative.containerregistry.outputs.FileTaskStepResponse;
import io.pulumi.azurenative.containerregistry.outputs.IdentityPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.PlatformPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.azurenative.containerregistry.outputs.TriggerPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The task that has the ARM resource and task properties.
 * The task will have all information to schedule a run against it.
 * API Version: 2019-06-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:containerregistry:Task myTask /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/tasks/myTask 
 * ```
 * 
 */
@ResourceType(type="azure-native:containerregistry:Task")
public class Task extends io.pulumi.resources.CustomResource {
    /**
     * The machine configuration of the run agent.
     * 
     */
    @OutputExport(name="agentConfiguration", type=AgentPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ AgentPropertiesResponse> agentConfiguration;

    /**
     * @return The machine configuration of the run agent.
     * 
     */
    public Output</* @Nullable */ AgentPropertiesResponse> getAgentConfiguration() {
        return this.agentConfiguration;
    }
    /**
     * The dedicated agent pool for the task.
     * 
     */
    @OutputExport(name="agentPoolName", type=String.class, parameters={})
    private Output</* @Nullable */ String> agentPoolName;

    /**
     * @return The dedicated agent pool for the task.
     * 
     */
    public Output</* @Nullable */ String> getAgentPoolName() {
        return this.agentPoolName;
    }
    /**
     * The creation date of task.
     * 
     */
    @OutputExport(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The creation date of task.
     * 
     */
    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    @OutputExport(name="credentials", type=CredentialsResponse.class, parameters={})
    private Output</* @Nullable */ CredentialsResponse> credentials;

    /**
     * @return The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    public Output</* @Nullable */ CredentialsResponse> getCredentials() {
        return this.credentials;
    }
    /**
     * Identity for the resource.
     * 
     */
    @OutputExport(name="identity", type=IdentityPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ IdentityPropertiesResponse> identity;

    /**
     * @return Identity for the resource.
     * 
     */
    public Output</* @Nullable */ IdentityPropertiesResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The value of this property indicates whether the task resource is system task or not.
     * 
     */
    @OutputExport(name="isSystemTask", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isSystemTask;

    /**
     * @return The value of this property indicates whether the task resource is system task or not.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsSystemTask() {
        return this.isSystemTask;
    }
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
     */
    @OutputExport(name="logTemplate", type=String.class, parameters={})
    private Output</* @Nullable */ String> logTemplate;

    /**
     * @return The template that describes the repository and tag information for run log artifact.
     * 
     */
    public Output</* @Nullable */ String> getLogTemplate() {
        return this.logTemplate;
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
     * The platform properties against which the run has to happen.
     * 
     */
    @OutputExport(name="platform", type=PlatformPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ PlatformPropertiesResponse> platform;

    /**
     * @return The platform properties against which the run has to happen.
     * 
     */
    public Output</* @Nullable */ PlatformPropertiesResponse> getPlatform() {
        return this.platform;
    }
    /**
     * The provisioning state of the task.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the task.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The current status of task.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return The current status of task.
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * The properties of a task step.
     * 
     */
    @OutputExport(name="step", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> step;

    /**
     * @return The properties of a task step.
     * 
     */
    public Output</* @Nullable */ Object> getStep() {
        return this.step;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
     * Run timeout in seconds.
     * 
     */
    @OutputExport(name="timeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeout;

    /**
     * @return Run timeout in seconds.
     * 
     */
    public Output</* @Nullable */ Integer> getTimeout() {
        return this.timeout;
    }
    /**
     * The properties that describe all triggers for the task.
     * 
     */
    @OutputExport(name="trigger", type=TriggerPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ TriggerPropertiesResponse> trigger;

    /**
     * @return The properties that describe all triggers for the task.
     * 
     */
    public Output</* @Nullable */ TriggerPropertiesResponse> getTrigger() {
        return this.trigger;
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
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Task(String name, TaskArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:Task", name, args == null ? TaskArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Task(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:containerregistry:Task", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20180201preview:Task").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20180901:Task").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20190401:Task").build()),
                Input.of(Alias.builder().setType("azure-native:containerregistry/v20190601preview:Task").build())
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
    public static Task get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Task(name, id, options);
    }
}
