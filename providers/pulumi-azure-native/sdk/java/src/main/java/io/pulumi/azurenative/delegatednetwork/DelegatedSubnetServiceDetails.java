// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.delegatednetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.delegatednetwork.DelegatedSubnetServiceDetailsArgs;
import io.pulumi.azurenative.delegatednetwork.outputs.ControllerDetailsResponse;
import io.pulumi.azurenative.delegatednetwork.outputs.SubnetDetailsResponse;
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
 * Represents an instance of a orchestrator.
 * API Version: 2021-03-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:delegatednetwork:DelegatedSubnetServiceDetails delegated1 /subscriptions/613192d7-503f-477a-9cfe-4efc3ee2bd60/resourceGroups/TestRG/providers/Microsoft.DelegatedNetwork/delegatedSubnets/delegated1 
 * ```
 * 
 */
@ResourceType(type="azure-native:delegatednetwork:DelegatedSubnetServiceDetails")
public class DelegatedSubnetServiceDetails extends io.pulumi.resources.CustomResource {
    /**
     * Properties of the controller.
     * 
     */
    @OutputExport(name="controllerDetails", type=ControllerDetailsResponse.class, parameters={})
    private Output</* @Nullable */ ControllerDetailsResponse> controllerDetails;

    /**
     * @return Properties of the controller.
     * 
     */
    public Output</* @Nullable */ ControllerDetailsResponse> getControllerDetails() {
        return this.controllerDetails;
    }
    /**
     * Location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location of the resource.
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
     * The current state of dnc delegated subnet resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The current state of dnc delegated subnet resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource guid.
     * 
     */
    @OutputExport(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return Resource guid.
     * 
     */
    public Output<String> getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * subnet details
     * 
     */
    @OutputExport(name="subnetDetails", type=SubnetDetailsResponse.class, parameters={})
    private Output</* @Nullable */ SubnetDetailsResponse> subnetDetails;

    /**
     * @return subnet details
     * 
     */
    public Output</* @Nullable */ SubnetDetailsResponse> getSubnetDetails() {
        return this.subnetDetails;
    }
    /**
     * The resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of resource.
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
    public DelegatedSubnetServiceDetails(String name, DelegatedSubnetServiceDetailsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:delegatednetwork:DelegatedSubnetServiceDetails", name, args == null ? DelegatedSubnetServiceDetailsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DelegatedSubnetServiceDetails(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:delegatednetwork:DelegatedSubnetServiceDetails", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:delegatednetwork/v20200808preview:DelegatedSubnetServiceDetails").build()),
                Input.of(Alias.builder().setType("azure-native:delegatednetwork/v20210315:DelegatedSubnetServiceDetails").build())
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
    public static DelegatedSubnetServiceDetails get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DelegatedSubnetServiceDetails(name, id, options);
    }
}
