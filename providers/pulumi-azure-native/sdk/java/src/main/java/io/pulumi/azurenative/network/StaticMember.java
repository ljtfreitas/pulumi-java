// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.StaticMemberArgs;
import io.pulumi.azurenative.network.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * StaticMember Item.
 * API Version: 2021-05-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:StaticMember testStaticMember /subscriptions/subscriptionC/resourceGroup/rg1/providers/Microsoft.Network/networkManagers/testNetworkManager/networkGroups/testNetworkGroup/staticMembers/testStaticMember 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:StaticMember")
public class StaticMember extends io.pulumi.resources.CustomResource {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource Id.
     * 
     */
    @OutputExport(name="resourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceId;

    /**
     * @return Resource Id.
     * 
     */
    public Output</* @Nullable */ String> getResourceId() {
        return this.resourceId;
    }
    /**
     * The system metadata related to this resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata related to this resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
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
    public StaticMember(String name, StaticMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:StaticMember", name, args == null ? StaticMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StaticMember(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:StaticMember", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20210501preview:StaticMember").build())
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
    public static StaticMember get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StaticMember(name, id, options);
    }
}
