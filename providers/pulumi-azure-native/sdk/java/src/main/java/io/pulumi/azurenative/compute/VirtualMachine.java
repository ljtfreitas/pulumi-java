// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.VirtualMachineArgs;
import io.pulumi.azurenative.compute.outputs.AdditionalCapabilitiesResponse;
import io.pulumi.azurenative.compute.outputs.BillingProfileResponse;
import io.pulumi.azurenative.compute.outputs.DiagnosticsProfileResponse;
import io.pulumi.azurenative.compute.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.compute.outputs.HardwareProfileResponse;
import io.pulumi.azurenative.compute.outputs.NetworkProfileResponse;
import io.pulumi.azurenative.compute.outputs.OSProfileResponse;
import io.pulumi.azurenative.compute.outputs.PlanResponse;
import io.pulumi.azurenative.compute.outputs.ScheduledEventsProfileResponse;
import io.pulumi.azurenative.compute.outputs.SecurityProfileResponse;
import io.pulumi.azurenative.compute.outputs.StorageProfileResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineExtensionResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineIdentityResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineInstanceViewResponse;
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
 * Describes a Virtual Machine.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:VirtualMachine myVM /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachines/myVM 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:VirtualMachine")
public class VirtualMachine extends io.pulumi.resources.CustomResource {
    /**
     * Specifies additional capabilities enabled or disabled on the virtual machine.
     * 
     */
    @OutputExport(name="additionalCapabilities", type=AdditionalCapabilitiesResponse.class, parameters={})
    private Output</* @Nullable */ AdditionalCapabilitiesResponse> additionalCapabilities;

    /**
     * @return Specifies additional capabilities enabled or disabled on the virtual machine.
     * 
     */
    public Output</* @Nullable */ AdditionalCapabilitiesResponse> getAdditionalCapabilities() {
        return this.additionalCapabilities;
    }
    /**
     * Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Availability sets overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). <br><br> For more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) <br><br> Currently, a VM can only be added to availability set at creation time. The availability set to which the VM is being added should be under the same resource group as the availability set resource. An existing VM cannot be added to an availability set. <br><br>This property cannot exist along with a non-null properties.virtualMachineScaleSet reference.
     * 
     */
    @OutputExport(name="availabilitySet", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> availabilitySet;

    /**
     * @return Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Availability sets overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). <br><br> For more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) <br><br> Currently, a VM can only be added to availability set at creation time. The availability set to which the VM is being added should be under the same resource group as the availability set resource. An existing VM cannot be added to an availability set. <br><br>This property cannot exist along with a non-null properties.virtualMachineScaleSet reference.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getAvailabilitySet() {
        return this.availabilitySet;
    }
    /**
     * Specifies the billing related details of a Azure Spot virtual machine. <br><br>Minimum api-version: 2019-03-01.
     * 
     */
    @OutputExport(name="billingProfile", type=BillingProfileResponse.class, parameters={})
    private Output</* @Nullable */ BillingProfileResponse> billingProfile;

    /**
     * @return Specifies the billing related details of a Azure Spot virtual machine. <br><br>Minimum api-version: 2019-03-01.
     * 
     */
    public Output</* @Nullable */ BillingProfileResponse> getBillingProfile() {
        return this.billingProfile;
    }
    /**
     * Specifies the boot diagnostic settings state. <br><br>Minimum api-version: 2015-06-15.
     * 
     */
    @OutputExport(name="diagnosticsProfile", type=DiagnosticsProfileResponse.class, parameters={})
    private Output</* @Nullable */ DiagnosticsProfileResponse> diagnosticsProfile;

    /**
     * @return Specifies the boot diagnostic settings state. <br><br>Minimum api-version: 2015-06-15.
     * 
     */
    public Output</* @Nullable */ DiagnosticsProfileResponse> getDiagnosticsProfile() {
        return this.diagnosticsProfile;
    }
    /**
     * Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. <br><br>For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2019-03-01. <br><br>For Azure Spot scale sets, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     * 
     */
    @OutputExport(name="evictionPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> evictionPolicy;

    /**
     * @return Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. <br><br>For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2019-03-01. <br><br>For Azure Spot scale sets, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     * 
     */
    public Output</* @Nullable */ String> getEvictionPolicy() {
        return this.evictionPolicy;
    }
    /**
     * The extended location of the Virtual Machine.
     * 
     */
    @OutputExport(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location of the Virtual Machine.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    /**
     * Specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M). <br><br> Minimum api-version: 2020-06-01
     * 
     */
    @OutputExport(name="extensionsTimeBudget", type=String.class, parameters={})
    private Output</* @Nullable */ String> extensionsTimeBudget;

    /**
     * @return Specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M). <br><br> Minimum api-version: 2020-06-01
     * 
     */
    public Output</* @Nullable */ String> getExtensionsTimeBudget() {
        return this.extensionsTimeBudget;
    }
    /**
     * Specifies the hardware settings for the virtual machine.
     * 
     */
    @OutputExport(name="hardwareProfile", type=HardwareProfileResponse.class, parameters={})
    private Output</* @Nullable */ HardwareProfileResponse> hardwareProfile;

    /**
     * @return Specifies the hardware settings for the virtual machine.
     * 
     */
    public Output</* @Nullable */ HardwareProfileResponse> getHardwareProfile() {
        return this.hardwareProfile;
    }
    /**
     * Specifies information about the dedicated host that the virtual machine resides in. <br><br>Minimum api-version: 2018-10-01.
     * 
     */
    @OutputExport(name="host", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> host;

    /**
     * @return Specifies information about the dedicated host that the virtual machine resides in. <br><br>Minimum api-version: 2018-10-01.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getHost() {
        return this.host;
    }
    /**
     * Specifies information about the dedicated host group that the virtual machine resides in. <br><br>Minimum api-version: 2020-06-01. <br><br>NOTE: User cannot specify both host and hostGroup properties.
     * 
     */
    @OutputExport(name="hostGroup", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> hostGroup;

    /**
     * @return Specifies information about the dedicated host group that the virtual machine resides in. <br><br>Minimum api-version: 2020-06-01. <br><br>NOTE: User cannot specify both host and hostGroup properties.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getHostGroup() {
        return this.hostGroup;
    }
    /**
     * The identity of the virtual machine, if configured.
     * 
     */
    @OutputExport(name="identity", type=VirtualMachineIdentityResponse.class, parameters={})
    private Output</* @Nullable */ VirtualMachineIdentityResponse> identity;

    /**
     * @return The identity of the virtual machine, if configured.
     * 
     */
    public Output</* @Nullable */ VirtualMachineIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The virtual machine instance view.
     * 
     */
    @OutputExport(name="instanceView", type=VirtualMachineInstanceViewResponse.class, parameters={})
    private Output<VirtualMachineInstanceViewResponse> instanceView;

    /**
     * @return The virtual machine instance view.
     * 
     */
    public Output<VirtualMachineInstanceViewResponse> getInstanceView() {
        return this.instanceView;
    }
    /**
     * Specifies that the image or disk that is being used was licensed on-premises. <br><br> Possible values for Windows Server operating system are: <br><br> Windows_Client <br><br> Windows_Server <br><br> Possible values for Linux Server operating system are: <br><br> RHEL_BYOS (for RHEL) <br><br> SLES_BYOS (for SUSE) <br><br> For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) <br><br> [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) <br><br> Minimum api-version: 2015-06-15
     * 
     */
    @OutputExport(name="licenseType", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseType;

    /**
     * @return Specifies that the image or disk that is being used was licensed on-premises. <br><br> Possible values for Windows Server operating system are: <br><br> Windows_Client <br><br> Windows_Server <br><br> Possible values for Linux Server operating system are: <br><br> RHEL_BYOS (for RHEL) <br><br> SLES_BYOS (for SUSE) <br><br> For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) <br><br> [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) <br><br> Minimum api-version: 2015-06-15
     * 
     */
    public Output</* @Nullable */ String> getLicenseType() {
        return this.licenseType;
    }
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the network interfaces of the virtual machine.
     * 
     */
    @OutputExport(name="networkProfile", type=NetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ NetworkProfileResponse> networkProfile;

    /**
     * @return Specifies the network interfaces of the virtual machine.
     * 
     */
    public Output</* @Nullable */ NetworkProfileResponse> getNetworkProfile() {
        return this.networkProfile;
    }
    /**
     * Specifies the operating system settings used while creating the virtual machine. Some of the settings cannot be changed once VM is provisioned.
     * 
     */
    @OutputExport(name="osProfile", type=OSProfileResponse.class, parameters={})
    private Output</* @Nullable */ OSProfileResponse> osProfile;

    /**
     * @return Specifies the operating system settings used while creating the virtual machine. Some of the settings cannot be changed once VM is provisioned.
     * 
     */
    public Output</* @Nullable */ OSProfileResponse> getOsProfile() {
        return this.osProfile;
    }
    /**
     * Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started ->**. Enter any required information and then click **Save**.
     * 
     */
    @OutputExport(name="plan", type=PlanResponse.class, parameters={})
    private Output</* @Nullable */ PlanResponse> plan;

    /**
     * @return Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started ->**. Enter any required information and then click **Save**.
     * 
     */
    public Output</* @Nullable */ PlanResponse> getPlan() {
        return this.plan;
    }
    /**
     * Specifies the scale set logical fault domain into which the Virtual Machine will be created. By default, the Virtual Machine will by automatically assigned to a fault domain that best maintains balance across available fault domains.<br><li>This is applicable only if the 'virtualMachineScaleSet' property of this Virtual Machine is set.<li>The Virtual Machine Scale Set that is referenced, must have 'platformFaultDomainCount' &gt; 1.<li>This property cannot be updated once the Virtual Machine is created.<li>Fault domain assignment can be viewed in the Virtual Machine Instance View.<br><br>Minimum api‐version: 2020‐12‐01
     * 
     */
    @OutputExport(name="platformFaultDomain", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> platformFaultDomain;

    /**
     * @return Specifies the scale set logical fault domain into which the Virtual Machine will be created. By default, the Virtual Machine will by automatically assigned to a fault domain that best maintains balance across available fault domains.<br><li>This is applicable only if the 'virtualMachineScaleSet' property of this Virtual Machine is set.<li>The Virtual Machine Scale Set that is referenced, must have 'platformFaultDomainCount' &gt; 1.<li>This property cannot be updated once the Virtual Machine is created.<li>Fault domain assignment can be viewed in the Virtual Machine Instance View.<br><br>Minimum api‐version: 2020‐12‐01
     * 
     */
    public Output</* @Nullable */ Integer> getPlatformFaultDomain() {
        return this.platformFaultDomain;
    }
    /**
     * Specifies the priority for the virtual machine. <br><br>Minimum api-version: 2019-03-01
     * 
     */
    @OutputExport(name="priority", type=String.class, parameters={})
    private Output</* @Nullable */ String> priority;

    /**
     * @return Specifies the priority for the virtual machine. <br><br>Minimum api-version: 2019-03-01
     * 
     */
    public Output</* @Nullable */ String> getPriority() {
        return this.priority;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state, which only appears in the response.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Specifies information about the proximity placement group that the virtual machine should be assigned to. <br><br>Minimum api-version: 2018-04-01.
     * 
     */
    @OutputExport(name="proximityPlacementGroup", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> proximityPlacementGroup;

    /**
     * @return Specifies information about the proximity placement group that the virtual machine should be assigned to. <br><br>Minimum api-version: 2018-04-01.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getProximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }
    /**
     * The virtual machine child extension resources.
     * 
     */
    @OutputExport(name="resources", type=List.class, parameters={VirtualMachineExtensionResponse.class})
    private Output<List<VirtualMachineExtensionResponse>> resources;

    /**
     * @return The virtual machine child extension resources.
     * 
     */
    public Output<List<VirtualMachineExtensionResponse>> getResources() {
        return this.resources;
    }
    /**
     * Specifies Scheduled Event related configurations.
     * 
     */
    @OutputExport(name="scheduledEventsProfile", type=ScheduledEventsProfileResponse.class, parameters={})
    private Output</* @Nullable */ ScheduledEventsProfileResponse> scheduledEventsProfile;

    /**
     * @return Specifies Scheduled Event related configurations.
     * 
     */
    public Output</* @Nullable */ ScheduledEventsProfileResponse> getScheduledEventsProfile() {
        return this.scheduledEventsProfile;
    }
    /**
     * Specifies the Security related profile settings for the virtual machine.
     * 
     */
    @OutputExport(name="securityProfile", type=SecurityProfileResponse.class, parameters={})
    private Output</* @Nullable */ SecurityProfileResponse> securityProfile;

    /**
     * @return Specifies the Security related profile settings for the virtual machine.
     * 
     */
    public Output</* @Nullable */ SecurityProfileResponse> getSecurityProfile() {
        return this.securityProfile;
    }
    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    @OutputExport(name="storageProfile", type=StorageProfileResponse.class, parameters={})
    private Output</* @Nullable */ StorageProfileResponse> storageProfile;

    /**
     * @return Specifies the storage settings for the virtual machine disks.
     * 
     */
    public Output</* @Nullable */ StorageProfileResponse> getStorageProfile() {
        return this.storageProfile;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * UserData for the VM, which must be base-64 encoded. Customer should not pass any secrets in here. <br><br>Minimum api-version: 2021-03-01
     * 
     */
    @OutputExport(name="userData", type=String.class, parameters={})
    private Output</* @Nullable */ String> userData;

    /**
     * @return UserData for the VM, which must be base-64 encoded. Customer should not pass any secrets in here. <br><br>Minimum api-version: 2021-03-01
     * 
     */
    public Output</* @Nullable */ String> getUserData() {
        return this.userData;
    }
    /**
     * Specifies information about the virtual machine scale set that the virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale set at creation time. An existing VM cannot be added to a virtual machine scale set. <br><br>This property cannot exist along with a non-null properties.availabilitySet reference. <br><br>Minimum api‐version: 2019‐03‐01
     * 
     */
    @OutputExport(name="virtualMachineScaleSet", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> virtualMachineScaleSet;

    /**
     * @return Specifies information about the virtual machine scale set that the virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale set at creation time. An existing VM cannot be added to a virtual machine scale set. <br><br>This property cannot exist along with a non-null properties.availabilitySet reference. <br><br>Minimum api‐version: 2019‐03‐01
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getVirtualMachineScaleSet() {
        return this.virtualMachineScaleSet;
    }
    /**
     * Specifies the VM unique ID which is a 128-bits identifier that is encoded and stored in all Azure IaaS VMs SMBIOS and can be read using platform BIOS commands.
     * 
     */
    @OutputExport(name="vmId", type=String.class, parameters={})
    private Output<String> vmId;

    /**
     * @return Specifies the VM unique ID which is a 128-bits identifier that is encoded and stored in all Azure IaaS VMs SMBIOS and can be read using platform BIOS commands.
     * 
     */
    public Output<String> getVmId() {
        return this.vmId;
    }
    /**
     * The virtual machine zones.
     * 
     */
    @OutputExport(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return The virtual machine zones.
     * 
     */
    public Output</* @Nullable */ List<String>> getZones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachine(String name, VirtualMachineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachine", name, args == null ? VirtualMachineArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VirtualMachine(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachine", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:compute/v20150615:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20160330:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20160430preview:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20170330:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20171201:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20180401:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20180601:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20181001:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20190301:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20190701:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20191201:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20200601:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20201201:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210301:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210401:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210701:VirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20211101:VirtualMachine").build())
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
    public static VirtualMachine get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachine(name, id, options);
    }
}
