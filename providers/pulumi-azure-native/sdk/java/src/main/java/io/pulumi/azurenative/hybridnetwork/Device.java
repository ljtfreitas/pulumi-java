// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridnetwork.DeviceArgs;
import io.pulumi.azurenative.hybridnetwork.outputs.SubResourceResponse;
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
 * Device resource.
 * API Version: 2020-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:hybridnetwork:Device TestDevice /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.HybridNetwork/devices/TestDevice 
 * ```
 * 
 */
@ResourceType(type="azure-native:hybridnetwork:Device")
public class Device extends io.pulumi.resources.CustomResource {
    /**
     * The type of the device.
     * 
     */
    @OutputExport(name="deviceType", type=String.class, parameters={})
    private Output<String> deviceType;

    /**
     * @return The type of the device.
     * 
     */
    public Output<String> getDeviceType() {
        return this.deviceType;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The list of network functions deployed on the device.
     * 
     */
    @OutputExport(name="networkFunctions", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> networkFunctions;

    /**
     * @return The list of network functions deployed on the device.
     * 
     */
    public Output<List<SubResourceResponse>> getNetworkFunctions() {
        return this.networkFunctions;
    }
    /**
     * The provisioning state of the device resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the device resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The current device status.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The current device status.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
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
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
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
    public Device(String name, DeviceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridnetwork:Device", name, args == null ? DeviceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Device(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridnetwork:Device", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:hybridnetwork/v20200101preview:Device").build()),
                Input.of(Alias.builder().setType("azure-native:hybridnetwork/v20210501:Device").build())
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
    public static Device get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Device(name, id, options);
    }
}
