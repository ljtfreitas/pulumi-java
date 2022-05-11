// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.management;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.management.GroupPolicyRemediationArgs;
import com.pulumi.azure.management.inputs.GroupPolicyRemediationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="azure:management/groupPolicyRemediation:GroupPolicyRemediation")
public class GroupPolicyRemediation extends com.pulumi.resources.CustomResource {
    @Export(name="locationFilters", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> locationFilters;

    public Output<Optional<List<String>>> locationFilters() {
        return Codegen.optional(this.locationFilters);
    }
    @Export(name="managementGroupId", type=String.class, parameters={})
    private Output<String> managementGroupId;

    public Output<String> managementGroupId() {
        return this.managementGroupId;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="policyAssignmentId", type=String.class, parameters={})
    private Output<String> policyAssignmentId;

    public Output<String> policyAssignmentId() {
        return this.policyAssignmentId;
    }
    @Export(name="policyDefinitionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyDefinitionId;

    public Output<Optional<String>> policyDefinitionId() {
        return Codegen.optional(this.policyDefinitionId);
    }
    @Export(name="resourceDiscoveryMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceDiscoveryMode;

    public Output<Optional<String>> resourceDiscoveryMode() {
        return Codegen.optional(this.resourceDiscoveryMode);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupPolicyRemediation(String name) {
        this(name, GroupPolicyRemediationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupPolicyRemediation(String name, GroupPolicyRemediationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupPolicyRemediation(String name, GroupPolicyRemediationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:management/groupPolicyRemediation:GroupPolicyRemediation", name, args == null ? GroupPolicyRemediationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GroupPolicyRemediation(String name, Output<String> id, @Nullable GroupPolicyRemediationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:management/groupPolicyRemediation:GroupPolicyRemediation", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GroupPolicyRemediation get(String name, Output<String> id, @Nullable GroupPolicyRemediationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GroupPolicyRemediation(name, id, state, options);
    }
}
