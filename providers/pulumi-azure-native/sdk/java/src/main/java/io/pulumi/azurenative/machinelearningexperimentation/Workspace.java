// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningexperimentation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningexperimentation.WorkspaceArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An object that represents a machine learning team account workspace.
 * API Version: 2017-05-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:machinelearningexperimentation:Workspace testworkspace /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.MachineLearningExperimentation/accounts/testaccount/workspaces/testworkspace 
 * ```
 * 
 */
@ResourceType(type="azure-native:machinelearningexperimentation:Workspace")
public class Workspace extends io.pulumi.resources.CustomResource {
    /**
     * The immutable id of the team account which contains this workspace.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The immutable id of the team account which contains this workspace.
     * 
     */
    public Output<String> getAccountId() {
        return this.accountId;
    }
    /**
     * The creation date of the machine learning workspace in ISO8601 format.
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The creation date of the machine learning workspace in ISO8601 format.
     * 
     */
    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    /**
     * The description of this workspace.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of this workspace.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The friendly name for this workspace. This will be the workspace name in the arm id when the workspace object gets created
     * 
     */
    @Export(name="friendlyName", type=String.class, parameters={})
    private Output<String> friendlyName;

    /**
     * @return The friendly name for this workspace. This will be the workspace name in the arm id when the workspace object gets created
     * 
     */
    public Output<String> getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The current deployment state of team account workspace resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The current deployment state of team account workspace resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The tags of the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
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
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The immutable id of this workspace.
     * 
     */
    @Export(name="workspaceId", type=String.class, parameters={})
    private Output<String> workspaceId;

    /**
     * @return The immutable id of this workspace.
     * 
     */
    public Output<String> getWorkspaceId() {
        return this.workspaceId;
    }

    public interface BuilderApplicator {
        public void apply(WorkspaceArgs.Builder a);
    }
    private static io.pulumi.azurenative.machinelearningexperimentation.WorkspaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.machinelearningexperimentation.WorkspaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Workspace(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workspace(String name) {
        this(name, WorkspaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workspace(String name, WorkspaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workspace(String name, WorkspaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningexperimentation:Workspace", name, args == null ? WorkspaceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Workspace(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningexperimentation:Workspace", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:machinelearningexperimentation/v20170501preview:Workspace").build())
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
    public static Workspace get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Workspace(name, id, options);
    }
}
