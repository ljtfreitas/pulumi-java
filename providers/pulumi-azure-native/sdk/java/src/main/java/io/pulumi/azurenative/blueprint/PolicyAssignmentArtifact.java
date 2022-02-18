// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.blueprint.PolicyAssignmentArtifactArgs;
import io.pulumi.azurenative.blueprint.outputs.ParameterValueResponse;
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
 * Blueprint artifact that applies a Policy assignment.
 * API Version: 2018-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:blueprint:PolicyAssignmentArtifact ownerAssignment /subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Blueprint/blueprints/simpleBlueprint/artifacts/ownerAssignment 
 * ```
 * 
 */
@ResourceType(type="azure-native:blueprint:PolicyAssignmentArtifact")
public class PolicyAssignmentArtifact extends io.pulumi.resources.CustomResource {
    /**
     * Artifacts which need to be deployed before the specified artifact.
     * 
     */
    @OutputExport(name="dependsOn", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> dependsOn;

    /**
     * @return Artifacts which need to be deployed before the specified artifact.
     * 
     */
    public Output</* @Nullable */ List<String>> getDependsOn() {
        return this.dependsOn;
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
     * Specifies the kind of blueprint artifact.
     * Expected value is 'policyAssignment'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Specifies the kind of blueprint artifact.
     * Expected value is 'policyAssignment'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
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
     * Parameter values for the policy definition.
     * 
     */
    @OutputExport(name="parameters", type=Map.class, parameters={String.class, ParameterValueResponse.class})
    private Output<Map<String,ParameterValueResponse>> parameters;

    /**
     * @return Parameter values for the policy definition.
     * 
     */
    public Output<Map<String,ParameterValueResponse>> getParameters() {
        return this.parameters;
    }
    /**
     * Azure resource ID of the policy definition.
     * 
     */
    @OutputExport(name="policyDefinitionId", type=String.class, parameters={})
    private Output<String> policyDefinitionId;

    /**
     * @return Azure resource ID of the policy definition.
     * 
     */
    public Output<String> getPolicyDefinitionId() {
        return this.policyDefinitionId;
    }
    /**
     * Name of the resource group placeholder to which the policy will be assigned.
     * 
     */
    @OutputExport(name="resourceGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroup;

    /**
     * @return Name of the resource group placeholder to which the policy will be assigned.
     * 
     */
    public Output</* @Nullable */ String> getResourceGroup() {
        return this.resourceGroup;
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
    public PolicyAssignmentArtifact(String name, PolicyAssignmentArtifactArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blueprint:PolicyAssignmentArtifact", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private PolicyAssignmentArtifact(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:blueprint:PolicyAssignmentArtifact", name, null, makeResourceOptions(options, id));
    }

    private static PolicyAssignmentArtifactArgs makeArgs(PolicyAssignmentArtifactArgs args) {
        var builder = args == null ? PolicyAssignmentArtifactArgs.builder() : PolicyAssignmentArtifactArgs.builder(args);
        return builder
            .setKind("policyAssignment")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:blueprint/v20181101preview:PolicyAssignmentArtifact").build())
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
    public static PolicyAssignmentArtifact get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PolicyAssignmentArtifact(name, id, options);
    }
}
