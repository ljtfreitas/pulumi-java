// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.blueprint.AssignmentArgs;
import io.pulumi.azurenative.blueprint.outputs.AssignmentLockSettingsResponse;
import io.pulumi.azurenative.blueprint.outputs.AssignmentStatusResponse;
import io.pulumi.azurenative.blueprint.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.blueprint.outputs.ParameterValueResponse;
import io.pulumi.azurenative.blueprint.outputs.ResourceGroupValueResponse;
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
 * Represents a blueprint assignment.
 * API Version: 2018-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:blueprint:Assignment assignSimpleBlueprint /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Blueprint/blueprintAssignments/assignSimpleBlueprint 
 * ```
 * 
 */
@ResourceType(type="azure-native:blueprint:Assignment")
public class Assignment extends io.pulumi.resources.CustomResource {
    /**
     * ID of the published version of a blueprint definition.
     * 
     */
    @OutputExport(name="blueprintId", type=String.class, parameters={})
    private Output</* @Nullable */ String> blueprintId;

    /**
     * @return ID of the published version of a blueprint definition.
     * 
     */
    public Output</* @Nullable */ String> getBlueprintId() {
        return this.blueprintId;
    }
    /**
     * Multi-line explain this resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Multi-line explain this resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * One-liner string explain this resource.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return One-liner string explain this resource.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Managed identity for this blueprint assignment.
     * 
     */
    @OutputExport(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output<ManagedServiceIdentityResponse> identity;

    /**
     * @return Managed identity for this blueprint assignment.
     * 
     */
    public Output<ManagedServiceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The location of this blueprint assignment.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of this blueprint assignment.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Defines how resources deployed by a blueprint assignment are locked.
     * 
     */
    @OutputExport(name="locks", type=AssignmentLockSettingsResponse.class, parameters={})
    private Output</* @Nullable */ AssignmentLockSettingsResponse> locks;

    /**
     * @return Defines how resources deployed by a blueprint assignment are locked.
     * 
     */
    public Output</* @Nullable */ AssignmentLockSettingsResponse> getLocks() {
        return this.locks;
    }
    /**
     * Name of this resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of this resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Blueprint assignment parameter values.
     * 
     */
    @OutputExport(name="parameters", type=Map.class, parameters={String.class, ParameterValueResponse.class})
    private Output<Map<String,ParameterValueResponse>> parameters;

    /**
     * @return Blueprint assignment parameter values.
     * 
     */
    public Output<Map<String,ParameterValueResponse>> getParameters() {
        return this.parameters;
    }
    /**
     * State of the blueprint assignment.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the blueprint assignment.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Names and locations of resource group placeholders.
     * 
     */
    @OutputExport(name="resourceGroups", type=Map.class, parameters={String.class, ResourceGroupValueResponse.class})
    private Output<Map<String,ResourceGroupValueResponse>> resourceGroups;

    /**
     * @return Names and locations of resource group placeholders.
     * 
     */
    public Output<Map<String,ResourceGroupValueResponse>> getResourceGroups() {
        return this.resourceGroups;
    }
    /**
     * The target subscription scope of the blueprint assignment (format: '/subscriptions/{subscriptionId}'). For management group level assignments, the property is required.
     * 
     */
    @OutputExport(name="scope", type=String.class, parameters={})
    private Output</* @Nullable */ String> scope;

    /**
     * @return The target subscription scope of the blueprint assignment (format: '/subscriptions/{subscriptionId}'). For management group level assignments, the property is required.
     * 
     */
    public Output</* @Nullable */ String> getScope() {
        return this.scope;
    }
    /**
     * Status of blueprint assignment. This field is readonly.
     * 
     */
    @OutputExport(name="status", type=AssignmentStatusResponse.class, parameters={})
    private Output<AssignmentStatusResponse> status;

    /**
     * @return Status of blueprint assignment. This field is readonly.
     * 
     */
    public Output<AssignmentStatusResponse> getStatus() {
        return this.status;
    }
    /**
     * Type of this resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of this resource.
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
    public Assignment(String name, AssignmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blueprint:Assignment", name, args == null ? AssignmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Assignment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blueprint:Assignment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:blueprint/v20181101preview:Assignment").build())
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
    public static Assignment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Assignment(name, id, options);
    }
}
