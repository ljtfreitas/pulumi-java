// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.DscpConfigurationArgs;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceResponse;
import io.pulumi.azurenative.network.outputs.QosIpRangeResponse;
import io.pulumi.azurenative.network.outputs.QosPortRangeResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * DSCP Configuration in a resource group.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:DscpConfiguration mydscpConfig /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/dscpConfiguration/mydscpConfig 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:DscpConfiguration")
public class DscpConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * Associated Network Interfaces to the DSCP Configuration.
     * 
     */
    @OutputExport(name="associatedNetworkInterfaces", type=List.class, parameters={NetworkInterfaceResponse.class})
    private Output<List<NetworkInterfaceResponse>> associatedNetworkInterfaces;

    /**
     * @return Associated Network Interfaces to the DSCP Configuration.
     * 
     */
    public Output<List<NetworkInterfaceResponse>> getAssociatedNetworkInterfaces() {
        return this.associatedNetworkInterfaces;
    }
    /**
     * Destination IP ranges.
     * 
     */
    @OutputExport(name="destinationIpRanges", type=List.class, parameters={QosIpRangeResponse.class})
    private Output</* @Nullable */ List<QosIpRangeResponse>> destinationIpRanges;

    /**
     * @return Destination IP ranges.
     * 
     */
    public Output</* @Nullable */ List<QosIpRangeResponse>> getDestinationIpRanges() {
        return this.destinationIpRanges;
    }
    /**
     * Destination port ranges.
     * 
     */
    @OutputExport(name="destinationPortRanges", type=List.class, parameters={QosPortRangeResponse.class})
    private Output</* @Nullable */ List<QosPortRangeResponse>> destinationPortRanges;

    /**
     * @return Destination port ranges.
     * 
     */
    public Output</* @Nullable */ List<QosPortRangeResponse>> getDestinationPortRanges() {
        return this.destinationPortRanges;
    }
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
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * List of markings to be used in the configuration.
     * 
     */
    @OutputExport(name="markings", type=List.class, parameters={Integer.class})
    private Output</* @Nullable */ List<Integer>> markings;

    /**
     * @return List of markings to be used in the configuration.
     * 
     */
    public Output</* @Nullable */ List<Integer>> getMarkings() {
        return this.markings;
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
     * RNM supported protocol types.
     * 
     */
    @OutputExport(name="protocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> protocol;

    /**
     * @return RNM supported protocol types.
     * 
     */
    public Output</* @Nullable */ String> getProtocol() {
        return this.protocol;
    }
    /**
     * The provisioning state of the DSCP Configuration resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the DSCP Configuration resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Qos Collection ID generated by RNM.
     * 
     */
    @OutputExport(name="qosCollectionId", type=String.class, parameters={})
    private Output<String> qosCollectionId;

    /**
     * @return Qos Collection ID generated by RNM.
     * 
     */
    public Output<String> getQosCollectionId() {
        return this.qosCollectionId;
    }
    /**
     * The resource GUID property of the DSCP Configuration resource.
     * 
     */
    @OutputExport(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the DSCP Configuration resource.
     * 
     */
    public Output<String> getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * Source IP ranges.
     * 
     */
    @OutputExport(name="sourceIpRanges", type=List.class, parameters={QosIpRangeResponse.class})
    private Output</* @Nullable */ List<QosIpRangeResponse>> sourceIpRanges;

    /**
     * @return Source IP ranges.
     * 
     */
    public Output</* @Nullable */ List<QosIpRangeResponse>> getSourceIpRanges() {
        return this.sourceIpRanges;
    }
    /**
     * Sources port ranges.
     * 
     */
    @OutputExport(name="sourcePortRanges", type=List.class, parameters={QosPortRangeResponse.class})
    private Output</* @Nullable */ List<QosPortRangeResponse>> sourcePortRanges;

    /**
     * @return Sources port ranges.
     * 
     */
    public Output</* @Nullable */ List<QosPortRangeResponse>> getSourcePortRanges() {
        return this.sourcePortRanges;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
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
    public DscpConfiguration(String name, DscpConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:DscpConfiguration", name, args == null ? DscpConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DscpConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:DscpConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20200601:DscpConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:DscpConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:DscpConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:DscpConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:DscpConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:DscpConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:DscpConfiguration").build())
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
    public static DscpConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DscpConfiguration(name, id, options);
    }
}
