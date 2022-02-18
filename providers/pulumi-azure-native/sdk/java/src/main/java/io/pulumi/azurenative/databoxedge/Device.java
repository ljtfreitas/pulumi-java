// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.DeviceArgs;
import io.pulumi.azurenative.databoxedge.outputs.EdgeProfileResponse;
import io.pulumi.azurenative.databoxedge.outputs.ResourceIdentityResponse;
import io.pulumi.azurenative.databoxedge.outputs.ResourceMoveDetailsResponse;
import io.pulumi.azurenative.databoxedge.outputs.SkuResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The Data Box Edge/Gateway device.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:databoxedge:Device testedgedevice /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/{deviceName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:databoxedge:Device")
public class Device extends io.pulumi.resources.CustomResource {
    /**
     * Type of compute roles configured.
     * 
     */
    @OutputExport(name="configuredRoleTypes", type=List.class, parameters={String.class})
    private Output<List<String>> configuredRoleTypes;

    /**
     * @return Type of compute roles configured.
     * 
     */
    public Output<List<String>> getConfiguredRoleTypes() {
        return this.configuredRoleTypes;
    }
    /**
     * The Data Box Edge/Gateway device culture.
     * 
     */
    @OutputExport(name="culture", type=String.class, parameters={})
    private Output<String> culture;

    /**
     * @return The Data Box Edge/Gateway device culture.
     * 
     */
    public Output<String> getCulture() {
        return this.culture;
    }
    /**
     * The status of the Data Box Edge/Gateway device.
     * 
     */
    @OutputExport(name="dataBoxEdgeDeviceStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataBoxEdgeDeviceStatus;

    /**
     * @return The status of the Data Box Edge/Gateway device.
     * 
     */
    public Output</* @Nullable */ String> getDataBoxEdgeDeviceStatus() {
        return this.dataBoxEdgeDeviceStatus;
    }
    /**
     * The Description of the Data Box Edge/Gateway device.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The Description of the Data Box Edge/Gateway device.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The device software version number of the device (eg: 1.2.18105.6).
     * 
     */
    @OutputExport(name="deviceHcsVersion", type=String.class, parameters={})
    private Output<String> deviceHcsVersion;

    /**
     * @return The device software version number of the device (eg: 1.2.18105.6).
     * 
     */
    public Output<String> getDeviceHcsVersion() {
        return this.deviceHcsVersion;
    }
    /**
     * The Data Box Edge/Gateway device local capacity in MB.
     * 
     */
    @OutputExport(name="deviceLocalCapacity", type=Double.class, parameters={})
    private Output<Double> deviceLocalCapacity;

    /**
     * @return The Data Box Edge/Gateway device local capacity in MB.
     * 
     */
    public Output<Double> getDeviceLocalCapacity() {
        return this.deviceLocalCapacity;
    }
    /**
     * The Data Box Edge/Gateway device model.
     * 
     */
    @OutputExport(name="deviceModel", type=String.class, parameters={})
    private Output<String> deviceModel;

    /**
     * @return The Data Box Edge/Gateway device model.
     * 
     */
    public Output<String> getDeviceModel() {
        return this.deviceModel;
    }
    /**
     * The Data Box Edge/Gateway device software version.
     * 
     */
    @OutputExport(name="deviceSoftwareVersion", type=String.class, parameters={})
    private Output<String> deviceSoftwareVersion;

    /**
     * @return The Data Box Edge/Gateway device software version.
     * 
     */
    public Output<String> getDeviceSoftwareVersion() {
        return this.deviceSoftwareVersion;
    }
    /**
     * The type of the Data Box Edge/Gateway device.
     * 
     */
    @OutputExport(name="deviceType", type=String.class, parameters={})
    private Output<String> deviceType;

    /**
     * @return The type of the Data Box Edge/Gateway device.
     * 
     */
    public Output<String> getDeviceType() {
        return this.deviceType;
    }
    /**
     * The details of Edge Profile for this resource
     * 
     */
    @OutputExport(name="edgeProfile", type=EdgeProfileResponse.class, parameters={})
    private Output<EdgeProfileResponse> edgeProfile;

    /**
     * @return The details of Edge Profile for this resource
     * 
     */
    public Output<EdgeProfileResponse> getEdgeProfile() {
        return this.edgeProfile;
    }
    /**
     * The etag for the devices.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return The etag for the devices.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * The Data Box Edge/Gateway device name.
     * 
     */
    @OutputExport(name="friendlyName", type=String.class, parameters={})
    private Output<String> friendlyName;

    /**
     * @return The Data Box Edge/Gateway device name.
     * 
     */
    public Output<String> getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * Msi identity of the resource
     * 
     */
    @OutputExport(name="identity", type=ResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ResourceIdentityResponse> identity;

    /**
     * @return Msi identity of the resource
     * 
     */
    public Output</* @Nullable */ ResourceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The etag for the devices.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The etag for the devices.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The location of the device. This is a supported and registered Azure geographical region (for example, West US, East US, or Southeast Asia). The geographical region of a device cannot be changed once it is created, but if an identical geographical region is specified on update, the request will succeed.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the device. This is a supported and registered Azure geographical region (for example, West US, East US, or Southeast Asia). The geographical region of a device cannot be changed once it is created, but if an identical geographical region is specified on update, the request will succeed.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The description of the Data Box Edge/Gateway device model.
     * 
     */
    @OutputExport(name="modelDescription", type=String.class, parameters={})
    private Output<String> modelDescription;

    /**
     * @return The description of the Data Box Edge/Gateway device model.
     * 
     */
    public Output<String> getModelDescription() {
        return this.modelDescription;
    }
    /**
     * The object name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The object name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The number of nodes in the cluster.
     * 
     */
    @OutputExport(name="nodeCount", type=Integer.class, parameters={})
    private Output<Integer> nodeCount;

    /**
     * @return The number of nodes in the cluster.
     * 
     */
    public Output<Integer> getNodeCount() {
        return this.nodeCount;
    }
    /**
     * The details of the move operation on this resource.
     * 
     */
    @OutputExport(name="resourceMoveDetails", type=ResourceMoveDetailsResponse.class, parameters={})
    private Output<ResourceMoveDetailsResponse> resourceMoveDetails;

    /**
     * @return The details of the move operation on this resource.
     * 
     */
    public Output<ResourceMoveDetailsResponse> getResourceMoveDetails() {
        return this.resourceMoveDetails;
    }
    /**
     * The Serial Number of Data Box Edge/Gateway device.
     * 
     */
    @OutputExport(name="serialNumber", type=String.class, parameters={})
    private Output<String> serialNumber;

    /**
     * @return The Serial Number of Data Box Edge/Gateway device.
     * 
     */
    public Output<String> getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * The SKU type.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The SKU type.
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * DataBoxEdge Resource
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return DataBoxEdge Resource
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The list of tags that describe the device. These tags can be used to view and group this device (across resource groups).
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The list of tags that describe the device. These tags can be used to view and group this device (across resource groups).
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The Data Box Edge/Gateway device timezone.
     * 
     */
    @OutputExport(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    /**
     * @return The Data Box Edge/Gateway device timezone.
     * 
     */
    public Output<String> getTimeZone() {
        return this.timeZone;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
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
        super("azure-native:databoxedge:Device", name, args == null ? DeviceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Device(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:Device", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190301:Device").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190701:Device").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20190801:Device").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200501preview:Device").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901:Device").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901preview:Device").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20201201:Device").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201:Device").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201preview:Device").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601:Device").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601preview:Device").build())
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
