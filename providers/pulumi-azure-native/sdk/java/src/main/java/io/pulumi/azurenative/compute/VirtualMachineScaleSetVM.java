// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.VirtualMachineScaleSetVMArgs;
import io.pulumi.azurenative.compute.outputs.AdditionalCapabilitiesResponse;
import io.pulumi.azurenative.compute.outputs.DiagnosticsProfileResponse;
import io.pulumi.azurenative.compute.outputs.HardwareProfileResponse;
import io.pulumi.azurenative.compute.outputs.NetworkProfileResponse;
import io.pulumi.azurenative.compute.outputs.OSProfileResponse;
import io.pulumi.azurenative.compute.outputs.PlanResponse;
import io.pulumi.azurenative.compute.outputs.SecurityProfileResponse;
import io.pulumi.azurenative.compute.outputs.SkuResponse;
import io.pulumi.azurenative.compute.outputs.StorageProfileResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineExtensionResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetVMInstanceViewResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetVMNetworkProfileConfigurationResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetVMProtectionPolicyResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Describes a virtual machine scale set virtual machine.
 * API Version: 2021-03-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:VirtualMachineScaleSetVM myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/virtualMachineScaleSets/{vmScaleSetName}/virtualmachines/{instanceId} 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:VirtualMachineScaleSetVM")
public class VirtualMachineScaleSetVM extends io.pulumi.resources.CustomResource {
    /**
     * Specifies additional capabilities enabled or disabled on the virtual machine in the scale set. For instance: whether the virtual machine has the capability to support attaching managed data disks with UltraSSD_LRS storage account type.
     * 
     */
    @Export(name="additionalCapabilities", type=AdditionalCapabilitiesResponse.class, parameters={})
    private Output</* @Nullable */ AdditionalCapabilitiesResponse> additionalCapabilities;

    /**
     * @return Specifies additional capabilities enabled or disabled on the virtual machine in the scale set. For instance: whether the virtual machine has the capability to support attaching managed data disks with UltraSSD_LRS storage account type.
     * 
     */
    public Output</* @Nullable */ AdditionalCapabilitiesResponse> getAdditionalCapabilities() {
        return this.additionalCapabilities;
    }
    /**
     * Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Availability sets overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). <br><br> For more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) <br><br> Currently, a VM can only be added to availability set at creation time. An existing VM cannot be added to an availability set.
     * 
     */
    @Export(name="availabilitySet", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> availabilitySet;

    /**
     * @return Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Availability sets overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). <br><br> For more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) <br><br> Currently, a VM can only be added to availability set at creation time. An existing VM cannot be added to an availability set.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getAvailabilitySet() {
        return this.availabilitySet;
    }
    /**
     * Specifies the boot diagnostic settings state. <br><br>Minimum api-version: 2015-06-15.
     * 
     */
    @Export(name="diagnosticsProfile", type=DiagnosticsProfileResponse.class, parameters={})
    private Output</* @Nullable */ DiagnosticsProfileResponse> diagnosticsProfile;

    /**
     * @return Specifies the boot diagnostic settings state. <br><br>Minimum api-version: 2015-06-15.
     * 
     */
    public Output</* @Nullable */ DiagnosticsProfileResponse> getDiagnosticsProfile() {
        return this.diagnosticsProfile;
    }
    /**
     * Specifies the hardware settings for the virtual machine.
     * 
     */
    @Export(name="hardwareProfile", type=HardwareProfileResponse.class, parameters={})
    private Output</* @Nullable */ HardwareProfileResponse> hardwareProfile;

    /**
     * @return Specifies the hardware settings for the virtual machine.
     * 
     */
    public Output</* @Nullable */ HardwareProfileResponse> getHardwareProfile() {
        return this.hardwareProfile;
    }
    /**
     * The virtual machine instance ID.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return The virtual machine instance ID.
     * 
     */
    public Output<String> getInstanceId() {
        return this.instanceId;
    }
    /**
     * The virtual machine instance view.
     * 
     */
    @Export(name="instanceView", type=VirtualMachineScaleSetVMInstanceViewResponse.class, parameters={})
    private Output<VirtualMachineScaleSetVMInstanceViewResponse> instanceView;

    /**
     * @return The virtual machine instance view.
     * 
     */
    public Output<VirtualMachineScaleSetVMInstanceViewResponse> getInstanceView() {
        return this.instanceView;
    }
    /**
     * Specifies whether the latest model has been applied to the virtual machine.
     * 
     */
    @Export(name="latestModelApplied", type=Boolean.class, parameters={})
    private Output<Boolean> latestModelApplied;

    /**
     * @return Specifies whether the latest model has been applied to the virtual machine.
     * 
     */
    public Output<Boolean> getLatestModelApplied() {
        return this.latestModelApplied;
    }
    /**
     * Specifies that the image or disk that is being used was licensed on-premises. <br><br> Possible values for Windows Server operating system are: <br><br> Windows_Client <br><br> Windows_Server <br><br> Possible values for Linux Server operating system are: <br><br> RHEL_BYOS (for RHEL) <br><br> SLES_BYOS (for SUSE) <br><br> For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) <br><br> [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) <br><br> Minimum api-version: 2015-06-15
     * 
     */
    @Export(name="licenseType", type=String.class, parameters={})
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
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Specifies whether the model applied to the virtual machine is the model of the virtual machine scale set or the customized model for the virtual machine.
     * 
     */
    @Export(name="modelDefinitionApplied", type=String.class, parameters={})
    private Output<String> modelDefinitionApplied;

    /**
     * @return Specifies whether the model applied to the virtual machine is the model of the virtual machine scale set or the customized model for the virtual machine.
     * 
     */
    public Output<String> getModelDefinitionApplied() {
        return this.modelDefinitionApplied;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
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
    @Export(name="networkProfile", type=NetworkProfileResponse.class, parameters={})
    private Output</* @Nullable */ NetworkProfileResponse> networkProfile;

    /**
     * @return Specifies the network interfaces of the virtual machine.
     * 
     */
    public Output</* @Nullable */ NetworkProfileResponse> getNetworkProfile() {
        return this.networkProfile;
    }
    /**
     * Specifies the network profile configuration of the virtual machine.
     * 
     */
    @Export(name="networkProfileConfiguration", type=VirtualMachineScaleSetVMNetworkProfileConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ VirtualMachineScaleSetVMNetworkProfileConfigurationResponse> networkProfileConfiguration;

    /**
     * @return Specifies the network profile configuration of the virtual machine.
     * 
     */
    public Output</* @Nullable */ VirtualMachineScaleSetVMNetworkProfileConfigurationResponse> getNetworkProfileConfiguration() {
        return this.networkProfileConfiguration;
    }
    /**
     * Specifies the operating system settings for the virtual machine.
     * 
     */
    @Export(name="osProfile", type=OSProfileResponse.class, parameters={})
    private Output</* @Nullable */ OSProfileResponse> osProfile;

    /**
     * @return Specifies the operating system settings for the virtual machine.
     * 
     */
    public Output</* @Nullable */ OSProfileResponse> getOsProfile() {
        return this.osProfile;
    }
    /**
     * Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started ->**. Enter any required information and then click **Save**.
     * 
     */
    @Export(name="plan", type=PlanResponse.class, parameters={})
    private Output</* @Nullable */ PlanResponse> plan;

    /**
     * @return Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started ->**. Enter any required information and then click **Save**.
     * 
     */
    public Output</* @Nullable */ PlanResponse> getPlan() {
        return this.plan;
    }
    /**
     * Specifies the protection policy of the virtual machine.
     * 
     */
    @Export(name="protectionPolicy", type=VirtualMachineScaleSetVMProtectionPolicyResponse.class, parameters={})
    private Output</* @Nullable */ VirtualMachineScaleSetVMProtectionPolicyResponse> protectionPolicy;

    /**
     * @return Specifies the protection policy of the virtual machine.
     * 
     */
    public Output</* @Nullable */ VirtualMachineScaleSetVMProtectionPolicyResponse> getProtectionPolicy() {
        return this.protectionPolicy;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state, which only appears in the response.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The virtual machine child extension resources.
     * 
     */
    @Export(name="resources", type=List.class, parameters={VirtualMachineExtensionResponse.class})
    private Output<List<VirtualMachineExtensionResponse>> resources;

    /**
     * @return The virtual machine child extension resources.
     * 
     */
    public Output<List<VirtualMachineExtensionResponse>> getResources() {
        return this.resources;
    }
    /**
     * Specifies the Security related profile settings for the virtual machine.
     * 
     */
    @Export(name="securityProfile", type=SecurityProfileResponse.class, parameters={})
    private Output</* @Nullable */ SecurityProfileResponse> securityProfile;

    /**
     * @return Specifies the Security related profile settings for the virtual machine.
     * 
     */
    public Output</* @Nullable */ SecurityProfileResponse> getSecurityProfile() {
        return this.securityProfile;
    }
    /**
     * The virtual machine SKU.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return The virtual machine SKU.
     * 
     */
    public Output<SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    @Export(name="storageProfile", type=StorageProfileResponse.class, parameters={})
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
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
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
    @Export(name="type", type=String.class, parameters={})
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
    @Export(name="userData", type=String.class, parameters={})
    private Output</* @Nullable */ String> userData;

    /**
     * @return UserData for the VM, which must be base-64 encoded. Customer should not pass any secrets in here. <br><br>Minimum api-version: 2021-03-01
     * 
     */
    public Output</* @Nullable */ String> getUserData() {
        return this.userData;
    }
    /**
     * Azure VM unique ID.
     * 
     */
    @Export(name="vmId", type=String.class, parameters={})
    private Output<String> vmId;

    /**
     * @return Azure VM unique ID.
     * 
     */
    public Output<String> getVmId() {
        return this.vmId;
    }
    /**
     * The virtual machine zones.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output<List<String>> zones;

    /**
     * @return The virtual machine zones.
     * 
     */
    public Output<List<String>> getZones() {
        return this.zones;
    }

    public interface BuilderApplicator {
        public void apply(VirtualMachineScaleSetVMArgs.Builder a);
    }
    private static io.pulumi.azurenative.compute.VirtualMachineScaleSetVMArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.compute.VirtualMachineScaleSetVMArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VirtualMachineScaleSetVM(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualMachineScaleSetVM(String name) {
        this(name, VirtualMachineScaleSetVMArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMachineScaleSetVM(String name, VirtualMachineScaleSetVMArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachineScaleSetVM(String name, VirtualMachineScaleSetVMArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineScaleSetVM", name, args == null ? VirtualMachineScaleSetVMArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VirtualMachineScaleSetVM(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineScaleSetVM", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:compute/v20171201:VirtualMachineScaleSetVM").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20180401:VirtualMachineScaleSetVM").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20180601:VirtualMachineScaleSetVM").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20181001:VirtualMachineScaleSetVM").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20190301:VirtualMachineScaleSetVM").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20190701:VirtualMachineScaleSetVM").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20191201:VirtualMachineScaleSetVM").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20200601:VirtualMachineScaleSetVM").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20201201:VirtualMachineScaleSetVM").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20210301:VirtualMachineScaleSetVM").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20210401:VirtualMachineScaleSetVM").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20210701:VirtualMachineScaleSetVM").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20211101:VirtualMachineScaleSetVM").build())
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
    public static VirtualMachineScaleSetVM get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachineScaleSetVM(name, id, options);
    }
}
