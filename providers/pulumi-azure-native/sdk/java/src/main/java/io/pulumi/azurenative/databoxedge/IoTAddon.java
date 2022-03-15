// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.IoTAddonArgs;
import io.pulumi.azurenative.databoxedge.outputs.IoTDeviceInfoResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * IoT Addon.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:databoxedge:IoTAddon arcName /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourcegroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/addonExamples/roles/kubernetesRole/addons/arcName 
 * ```
 * 
 */
@ResourceType(type="azure-native:databoxedge:IoTAddon")
public class IoTAddon extends io.pulumi.resources.CustomResource {
    /**
     * Host OS supported by the IoT addon.
     * 
     */
    @Export(name="hostPlatform", type=String.class, parameters={})
    private Output<String> hostPlatform;

    /**
     * @return Host OS supported by the IoT addon.
     * 
     */
    public Output<String> getHostPlatform() {
        return this.hostPlatform;
    }
    /**
     * Platform where the runtime is hosted.
     * 
     */
    @Export(name="hostPlatformType", type=String.class, parameters={})
    private Output<String> hostPlatformType;

    /**
     * @return Platform where the runtime is hosted.
     * 
     */
    public Output<String> getHostPlatformType() {
        return this.hostPlatformType;
    }
    /**
     * IoT device metadata to which appliance needs to be connected.
     * 
     */
    @Export(name="ioTDeviceDetails", type=IoTDeviceInfoResponse.class, parameters={})
    private Output<IoTDeviceInfoResponse> ioTDeviceDetails;

    /**
     * @return IoT device metadata to which appliance needs to be connected.
     * 
     */
    public Output<IoTDeviceInfoResponse> getIoTDeviceDetails() {
        return this.ioTDeviceDetails;
    }
    /**
     * IoT edge device to which the IoT Addon needs to be configured.
     * 
     */
    @Export(name="ioTEdgeDeviceDetails", type=IoTDeviceInfoResponse.class, parameters={})
    private Output<IoTDeviceInfoResponse> ioTEdgeDeviceDetails;

    /**
     * @return IoT edge device to which the IoT Addon needs to be configured.
     * 
     */
    public Output<IoTDeviceInfoResponse> getIoTEdgeDeviceDetails() {
        return this.ioTEdgeDeviceDetails;
    }
    /**
     * Addon type.
     * Expected value is 'IotEdge'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Addon type.
     * Expected value is 'IotEdge'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The object name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The object name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Addon Provisioning State
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Addon Provisioning State
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Addon type
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Addon type
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Version of IoT running on the appliance.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Version of IoT running on the appliance.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(IoTAddonArgs.Builder a);
    }
    private static io.pulumi.azurenative.databoxedge.IoTAddonArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.databoxedge.IoTAddonArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IoTAddon(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IoTAddon(String name) {
        this(name, IoTAddonArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IoTAddon(String name, IoTAddonArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IoTAddon(String name, IoTAddonArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:IoTAddon", name, makeArgs(args), makeResourceOptions(options, Output.empty()));
    }

    private IoTAddon(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:IoTAddon", name, null, makeResourceOptions(options, id));
    }

    private static IoTAddonArgs makeArgs(IoTAddonArgs args) {
        var builder = args == null ? IoTAddonArgs.builder() : IoTAddonArgs.builder(args);
        return builder
            .kind("IotEdge")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20200901:IoTAddon").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20200901preview:IoTAddon").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20201201:IoTAddon").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20210201:IoTAddon").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20210201preview:IoTAddon").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20210601:IoTAddon").build()),
                Output.of(Alias.builder().setType("azure-native:databoxedge/v20210601preview:IoTAddon").build())
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
    public static IoTAddon get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IoTAddon(name, id, options);
    }
}
