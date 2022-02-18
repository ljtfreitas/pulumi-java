// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.WorkspaceConnectionArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Workspace connection.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:machinelearningservices:WorkspaceConnection connection-1 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/resourceGroup-1/providers/Microsoft.MachineLearningServices/workspaces/workspace-1/connections/connection-1 
 * ```
 * 
 */
@ResourceType(type="azure-native:machinelearningservices:WorkspaceConnection")
public class WorkspaceConnection extends io.pulumi.resources.CustomResource {
    /**
     * Authorization type of the workspace connection.
     * 
     */
    @OutputExport(name="authType", type=String.class, parameters={})
    private Output</* @Nullable */ String> authType;

    /**
     * @return Authorization type of the workspace connection.
     * 
     */
    public Output</* @Nullable */ String> getAuthType() {
        return this.authType;
    }
    /**
     * Category of the workspace connection.
     * 
     */
    @OutputExport(name="category", type=String.class, parameters={})
    private Output</* @Nullable */ String> category;

    /**
     * @return Category of the workspace connection.
     * 
     */
    public Output</* @Nullable */ String> getCategory() {
        return this.category;
    }
    /**
     * Friendly name of the workspace connection.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Friendly name of the workspace connection.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Target of the workspace connection.
     * 
     */
    @OutputExport(name="target", type=String.class, parameters={})
    private Output</* @Nullable */ String> target;

    /**
     * @return Target of the workspace connection.
     * 
     */
    public Output</* @Nullable */ String> getTarget() {
        return this.target;
    }
    /**
     * Resource type of workspace connection.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type of workspace connection.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Value details of the workspace connection.
     * 
     */
    @OutputExport(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    /**
     * @return Value details of the workspace connection.
     * 
     */
    public Output</* @Nullable */ String> getValue() {
        return this.value;
    }
    /**
     * format for the workspace connection value
     * 
     */
    @OutputExport(name="valueFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> valueFormat;

    /**
     * @return format for the workspace connection value
     * 
     */
    public Output</* @Nullable */ String> getValueFormat() {
        return this.valueFormat;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkspaceConnection(String name, WorkspaceConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:WorkspaceConnection", name, args == null ? WorkspaceConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WorkspaceConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:WorkspaceConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200601:WorkspaceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200801:WorkspaceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200901preview:WorkspaceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20210101:WorkspaceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20210301preview:WorkspaceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20210401:WorkspaceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20210701:WorkspaceConnection").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20220101preview:WorkspaceConnection").build())
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
    public static WorkspaceConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkspaceConnection(name, id, options);
    }
}
