// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.authorization.PolicySetDefinitionAtManagementGroupArgs;
import io.pulumi.azurenative.authorization.outputs.ParameterDefinitionsValueResponse;
import io.pulumi.azurenative.authorization.outputs.PolicyDefinitionGroupResponse;
import io.pulumi.azurenative.authorization.outputs.PolicyDefinitionReferenceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The policy set definition.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:authorization:PolicySetDefinitionAtManagementGroup CostManagement /providers/Microsoft.Management/managementgroups/MyManagementGroup/providers/Microsoft.Authorization/policySetDefinitions/CostManagement 
 * ```
 * 
 */
@ResourceType(type="azure-native:authorization:PolicySetDefinitionAtManagementGroup")
public class PolicySetDefinitionAtManagementGroup extends io.pulumi.resources.CustomResource {
    /**
     * The policy set definition description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The policy set definition description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The display name of the policy set definition.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name of the policy set definition.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The policy set definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    @OutputExport(name="metadata", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> metadata;

    /**
     * @return The policy set definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    public Output</* @Nullable */ Object> getMetadata() {
        return this.metadata;
    }
    /**
     * The name of the policy set definition.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the policy set definition.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The policy set definition parameters that can be used in policy definition references.
     * 
     */
    @OutputExport(name="parameters", type=Map.class, parameters={String.class, ParameterDefinitionsValueResponse.class})
    private Output</* @Nullable */ Map<String,ParameterDefinitionsValueResponse>> parameters;

    /**
     * @return The policy set definition parameters that can be used in policy definition references.
     * 
     */
    public Output</* @Nullable */ Map<String,ParameterDefinitionsValueResponse>> getParameters() {
        return this.parameters;
    }
    /**
     * The metadata describing groups of policy definition references within the policy set definition.
     * 
     */
    @OutputExport(name="policyDefinitionGroups", type=List.class, parameters={PolicyDefinitionGroupResponse.class})
    private Output</* @Nullable */ List<PolicyDefinitionGroupResponse>> policyDefinitionGroups;

    /**
     * @return The metadata describing groups of policy definition references within the policy set definition.
     * 
     */
    public Output</* @Nullable */ List<PolicyDefinitionGroupResponse>> getPolicyDefinitionGroups() {
        return this.policyDefinitionGroups;
    }
    /**
     * An array of policy definition references.
     * 
     */
    @OutputExport(name="policyDefinitions", type=List.class, parameters={PolicyDefinitionReferenceResponse.class})
    private Output<List<PolicyDefinitionReferenceResponse>> policyDefinitions;

    /**
     * @return An array of policy definition references.
     * 
     */
    public Output<List<PolicyDefinitionReferenceResponse>> getPolicyDefinitions() {
        return this.policyDefinitions;
    }
    /**
     * The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    @OutputExport(name="policyType", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyType;

    /**
     * @return The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    public Output</* @Nullable */ String> getPolicyType() {
        return this.policyType;
    }
    /**
     * The type of the resource (Microsoft.Authorization/policySetDefinitions).
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource (Microsoft.Authorization/policySetDefinitions).
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
    public PolicySetDefinitionAtManagementGroup(String name, PolicySetDefinitionAtManagementGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:PolicySetDefinitionAtManagementGroup", name, args == null ? PolicySetDefinitionAtManagementGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PolicySetDefinitionAtManagementGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:PolicySetDefinitionAtManagementGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:authorization/v20170601preview:PolicySetDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20180301:PolicySetDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20180501:PolicySetDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20190101:PolicySetDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20190601:PolicySetDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20190901:PolicySetDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20200301:PolicySetDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20200901:PolicySetDefinitionAtManagementGroup").build()),
                Input.of(Alias.builder().setType("azure-native:authorization/v20210601:PolicySetDefinitionAtManagementGroup").build())
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
    public static PolicySetDefinitionAtManagementGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PolicySetDefinitionAtManagementGroup(name, id, options);
    }
}
