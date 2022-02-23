// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.enums.VirtualMachineEvictionPolicyTypes;
import io.pulumi.azurenative.compute.enums.VirtualMachinePriorityTypes;
import io.pulumi.azurenative.compute.inputs.AdditionalCapabilitiesArgs;
import io.pulumi.azurenative.compute.inputs.BillingProfileArgs;
import io.pulumi.azurenative.compute.inputs.DiagnosticsProfileArgs;
import io.pulumi.azurenative.compute.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.compute.inputs.HardwareProfileArgs;
import io.pulumi.azurenative.compute.inputs.NetworkProfileArgs;
import io.pulumi.azurenative.compute.inputs.OSProfileArgs;
import io.pulumi.azurenative.compute.inputs.PlanArgs;
import io.pulumi.azurenative.compute.inputs.ScheduledEventsProfileArgs;
import io.pulumi.azurenative.compute.inputs.SecurityProfileArgs;
import io.pulumi.azurenative.compute.inputs.StorageProfileArgs;
import io.pulumi.azurenative.compute.inputs.SubResourceArgs;
import io.pulumi.azurenative.compute.inputs.VirtualMachineIdentityArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachineArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineArgs Empty = new VirtualMachineArgs();

    /**
     * Specifies additional capabilities enabled or disabled on the virtual machine.
     * 
     */
    @InputImport(name="additionalCapabilities")
        private final @Nullable Input<AdditionalCapabilitiesArgs> additionalCapabilities;

    public Input<AdditionalCapabilitiesArgs> getAdditionalCapabilities() {
        return this.additionalCapabilities == null ? Input.empty() : this.additionalCapabilities;
    }

    /**
     * Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Availability sets overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). <br><br> For more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) <br><br> Currently, a VM can only be added to availability set at creation time. The availability set to which the VM is being added should be under the same resource group as the availability set resource. An existing VM cannot be added to an availability set. <br><br>This property cannot exist along with a non-null properties.virtualMachineScaleSet reference.
     * 
     */
    @InputImport(name="availabilitySet")
        private final @Nullable Input<SubResourceArgs> availabilitySet;

    public Input<SubResourceArgs> getAvailabilitySet() {
        return this.availabilitySet == null ? Input.empty() : this.availabilitySet;
    }

    /**
     * Specifies the billing related details of a Azure Spot virtual machine. <br><br>Minimum api-version: 2019-03-01.
     * 
     */
    @InputImport(name="billingProfile")
        private final @Nullable Input<BillingProfileArgs> billingProfile;

    public Input<BillingProfileArgs> getBillingProfile() {
        return this.billingProfile == null ? Input.empty() : this.billingProfile;
    }

    /**
     * Specifies the boot diagnostic settings state. <br><br>Minimum api-version: 2015-06-15.
     * 
     */
    @InputImport(name="diagnosticsProfile")
        private final @Nullable Input<DiagnosticsProfileArgs> diagnosticsProfile;

    public Input<DiagnosticsProfileArgs> getDiagnosticsProfile() {
        return this.diagnosticsProfile == null ? Input.empty() : this.diagnosticsProfile;
    }

    /**
     * Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. <br><br>For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2019-03-01. <br><br>For Azure Spot scale sets, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     * 
     */
    @InputImport(name="evictionPolicy")
        private final @Nullable Input<Either<String,VirtualMachineEvictionPolicyTypes>> evictionPolicy;

    public Input<Either<String,VirtualMachineEvictionPolicyTypes>> getEvictionPolicy() {
        return this.evictionPolicy == null ? Input.empty() : this.evictionPolicy;
    }

    /**
     * The extended location of the Virtual Machine.
     * 
     */
    @InputImport(name="extendedLocation")
        private final @Nullable Input<ExtendedLocationArgs> extendedLocation;

    public Input<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Input.empty() : this.extendedLocation;
    }

    /**
     * Specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M). <br><br> Minimum api-version: 2020-06-01
     * 
     */
    @InputImport(name="extensionsTimeBudget")
        private final @Nullable Input<String> extensionsTimeBudget;

    public Input<String> getExtensionsTimeBudget() {
        return this.extensionsTimeBudget == null ? Input.empty() : this.extensionsTimeBudget;
    }

    /**
     * Specifies the hardware settings for the virtual machine.
     * 
     */
    @InputImport(name="hardwareProfile")
        private final @Nullable Input<HardwareProfileArgs> hardwareProfile;

    public Input<HardwareProfileArgs> getHardwareProfile() {
        return this.hardwareProfile == null ? Input.empty() : this.hardwareProfile;
    }

    /**
     * Specifies information about the dedicated host that the virtual machine resides in. <br><br>Minimum api-version: 2018-10-01.
     * 
     */
    @InputImport(name="host")
        private final @Nullable Input<SubResourceArgs> host;

    public Input<SubResourceArgs> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    /**
     * Specifies information about the dedicated host group that the virtual machine resides in. <br><br>Minimum api-version: 2020-06-01. <br><br>NOTE: User cannot specify both host and hostGroup properties.
     * 
     */
    @InputImport(name="hostGroup")
        private final @Nullable Input<SubResourceArgs> hostGroup;

    public Input<SubResourceArgs> getHostGroup() {
        return this.hostGroup == null ? Input.empty() : this.hostGroup;
    }

    /**
     * The identity of the virtual machine, if configured.
     * 
     */
    @InputImport(name="identity")
        private final @Nullable Input<VirtualMachineIdentityArgs> identity;

    public Input<VirtualMachineIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Specifies that the image or disk that is being used was licensed on-premises. <br><br> Possible values for Windows Server operating system are: <br><br> Windows_Client <br><br> Windows_Server <br><br> Possible values for Linux Server operating system are: <br><br> RHEL_BYOS (for RHEL) <br><br> SLES_BYOS (for SUSE) <br><br> For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) <br><br> [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) <br><br> Minimum api-version: 2015-06-15
     * 
     */
    @InputImport(name="licenseType")
        private final @Nullable Input<String> licenseType;

    public Input<String> getLicenseType() {
        return this.licenseType == null ? Input.empty() : this.licenseType;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Specifies the network interfaces of the virtual machine.
     * 
     */
    @InputImport(name="networkProfile")
        private final @Nullable Input<NetworkProfileArgs> networkProfile;

    public Input<NetworkProfileArgs> getNetworkProfile() {
        return this.networkProfile == null ? Input.empty() : this.networkProfile;
    }

    /**
     * Specifies the operating system settings used while creating the virtual machine. Some of the settings cannot be changed once VM is provisioned.
     * 
     */
    @InputImport(name="osProfile")
        private final @Nullable Input<OSProfileArgs> osProfile;

    public Input<OSProfileArgs> getOsProfile() {
        return this.osProfile == null ? Input.empty() : this.osProfile;
    }

    /**
     * Specifies information about the marketplace image used to create the virtual machine. This element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable the image for programmatic use.  In the Azure portal, find the marketplace image that you want to use and then click **Want to deploy programmatically, Get Started ->**. Enter any required information and then click **Save**.
     * 
     */
    @InputImport(name="plan")
        private final @Nullable Input<PlanArgs> plan;

    public Input<PlanArgs> getPlan() {
        return this.plan == null ? Input.empty() : this.plan;
    }

    /**
     * Specifies the scale set logical fault domain into which the Virtual Machine will be created. By default, the Virtual Machine will by automatically assigned to a fault domain that best maintains balance across available fault domains.<br><li>This is applicable only if the 'virtualMachineScaleSet' property of this Virtual Machine is set.<li>The Virtual Machine Scale Set that is referenced, must have 'platformFaultDomainCount' &gt; 1.<li>This property cannot be updated once the Virtual Machine is created.<li>Fault domain assignment can be viewed in the Virtual Machine Instance View.<br><br>Minimum api‐version: 2020‐12‐01
     * 
     */
    @InputImport(name="platformFaultDomain")
        private final @Nullable Input<Integer> platformFaultDomain;

    public Input<Integer> getPlatformFaultDomain() {
        return this.platformFaultDomain == null ? Input.empty() : this.platformFaultDomain;
    }

    /**
     * Specifies the priority for the virtual machine. <br><br>Minimum api-version: 2019-03-01
     * 
     */
    @InputImport(name="priority")
        private final @Nullable Input<Either<String,VirtualMachinePriorityTypes>> priority;

    public Input<Either<String,VirtualMachinePriorityTypes>> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * Specifies information about the proximity placement group that the virtual machine should be assigned to. <br><br>Minimum api-version: 2018-04-01.
     * 
     */
    @InputImport(name="proximityPlacementGroup")
        private final @Nullable Input<SubResourceArgs> proximityPlacementGroup;

    public Input<SubResourceArgs> getProximityPlacementGroup() {
        return this.proximityPlacementGroup == null ? Input.empty() : this.proximityPlacementGroup;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies Scheduled Event related configurations.
     * 
     */
    @InputImport(name="scheduledEventsProfile")
        private final @Nullable Input<ScheduledEventsProfileArgs> scheduledEventsProfile;

    public Input<ScheduledEventsProfileArgs> getScheduledEventsProfile() {
        return this.scheduledEventsProfile == null ? Input.empty() : this.scheduledEventsProfile;
    }

    /**
     * Specifies the Security related profile settings for the virtual machine.
     * 
     */
    @InputImport(name="securityProfile")
        private final @Nullable Input<SecurityProfileArgs> securityProfile;

    public Input<SecurityProfileArgs> getSecurityProfile() {
        return this.securityProfile == null ? Input.empty() : this.securityProfile;
    }

    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    @InputImport(name="storageProfile")
        private final @Nullable Input<StorageProfileArgs> storageProfile;

    public Input<StorageProfileArgs> getStorageProfile() {
        return this.storageProfile == null ? Input.empty() : this.storageProfile;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * UserData for the VM, which must be base-64 encoded. Customer should not pass any secrets in here. <br><br>Minimum api-version: 2021-03-01
     * 
     */
    @InputImport(name="userData")
        private final @Nullable Input<String> userData;

    public Input<String> getUserData() {
        return this.userData == null ? Input.empty() : this.userData;
    }

    /**
     * Specifies information about the virtual machine scale set that the virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale set at creation time. An existing VM cannot be added to a virtual machine scale set. <br><br>This property cannot exist along with a non-null properties.availabilitySet reference. <br><br>Minimum api‐version: 2019‐03‐01
     * 
     */
    @InputImport(name="virtualMachineScaleSet")
        private final @Nullable Input<SubResourceArgs> virtualMachineScaleSet;

    public Input<SubResourceArgs> getVirtualMachineScaleSet() {
        return this.virtualMachineScaleSet == null ? Input.empty() : this.virtualMachineScaleSet;
    }

    /**
     * The name of the virtual machine.
     * 
     */
    @InputImport(name="vmName")
        private final @Nullable Input<String> vmName;

    public Input<String> getVmName() {
        return this.vmName == null ? Input.empty() : this.vmName;
    }

    /**
     * The virtual machine zones.
     * 
     */
    @InputImport(name="zones")
        private final @Nullable Input<List<String>> zones;

    public Input<List<String>> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public VirtualMachineArgs(
        @Nullable Input<AdditionalCapabilitiesArgs> additionalCapabilities,
        @Nullable Input<SubResourceArgs> availabilitySet,
        @Nullable Input<BillingProfileArgs> billingProfile,
        @Nullable Input<DiagnosticsProfileArgs> diagnosticsProfile,
        @Nullable Input<Either<String,VirtualMachineEvictionPolicyTypes>> evictionPolicy,
        @Nullable Input<ExtendedLocationArgs> extendedLocation,
        @Nullable Input<String> extensionsTimeBudget,
        @Nullable Input<HardwareProfileArgs> hardwareProfile,
        @Nullable Input<SubResourceArgs> host,
        @Nullable Input<SubResourceArgs> hostGroup,
        @Nullable Input<VirtualMachineIdentityArgs> identity,
        @Nullable Input<String> licenseType,
        @Nullable Input<String> location,
        @Nullable Input<NetworkProfileArgs> networkProfile,
        @Nullable Input<OSProfileArgs> osProfile,
        @Nullable Input<PlanArgs> plan,
        @Nullable Input<Integer> platformFaultDomain,
        @Nullable Input<Either<String,VirtualMachinePriorityTypes>> priority,
        @Nullable Input<SubResourceArgs> proximityPlacementGroup,
        Input<String> resourceGroupName,
        @Nullable Input<ScheduledEventsProfileArgs> scheduledEventsProfile,
        @Nullable Input<SecurityProfileArgs> securityProfile,
        @Nullable Input<StorageProfileArgs> storageProfile,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> userData,
        @Nullable Input<SubResourceArgs> virtualMachineScaleSet,
        @Nullable Input<String> vmName,
        @Nullable Input<List<String>> zones) {
        this.additionalCapabilities = additionalCapabilities;
        this.availabilitySet = availabilitySet;
        this.billingProfile = billingProfile;
        this.diagnosticsProfile = diagnosticsProfile;
        this.evictionPolicy = evictionPolicy;
        this.extendedLocation = extendedLocation;
        this.extensionsTimeBudget = extensionsTimeBudget;
        this.hardwareProfile = hardwareProfile;
        this.host = host;
        this.hostGroup = hostGroup;
        this.identity = identity;
        this.licenseType = licenseType;
        this.location = location;
        this.networkProfile = networkProfile;
        this.osProfile = osProfile;
        this.plan = plan;
        this.platformFaultDomain = platformFaultDomain;
        this.priority = priority;
        this.proximityPlacementGroup = proximityPlacementGroup;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scheduledEventsProfile = scheduledEventsProfile;
        this.securityProfile = securityProfile;
        this.storageProfile = storageProfile;
        this.tags = tags;
        this.userData = userData;
        this.virtualMachineScaleSet = virtualMachineScaleSet;
        this.vmName = vmName;
        this.zones = zones;
    }

    private VirtualMachineArgs() {
        this.additionalCapabilities = Input.empty();
        this.availabilitySet = Input.empty();
        this.billingProfile = Input.empty();
        this.diagnosticsProfile = Input.empty();
        this.evictionPolicy = Input.empty();
        this.extendedLocation = Input.empty();
        this.extensionsTimeBudget = Input.empty();
        this.hardwareProfile = Input.empty();
        this.host = Input.empty();
        this.hostGroup = Input.empty();
        this.identity = Input.empty();
        this.licenseType = Input.empty();
        this.location = Input.empty();
        this.networkProfile = Input.empty();
        this.osProfile = Input.empty();
        this.plan = Input.empty();
        this.platformFaultDomain = Input.empty();
        this.priority = Input.empty();
        this.proximityPlacementGroup = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scheduledEventsProfile = Input.empty();
        this.securityProfile = Input.empty();
        this.storageProfile = Input.empty();
        this.tags = Input.empty();
        this.userData = Input.empty();
        this.virtualMachineScaleSet = Input.empty();
        this.vmName = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AdditionalCapabilitiesArgs> additionalCapabilities;
        private @Nullable Input<SubResourceArgs> availabilitySet;
        private @Nullable Input<BillingProfileArgs> billingProfile;
        private @Nullable Input<DiagnosticsProfileArgs> diagnosticsProfile;
        private @Nullable Input<Either<String,VirtualMachineEvictionPolicyTypes>> evictionPolicy;
        private @Nullable Input<ExtendedLocationArgs> extendedLocation;
        private @Nullable Input<String> extensionsTimeBudget;
        private @Nullable Input<HardwareProfileArgs> hardwareProfile;
        private @Nullable Input<SubResourceArgs> host;
        private @Nullable Input<SubResourceArgs> hostGroup;
        private @Nullable Input<VirtualMachineIdentityArgs> identity;
        private @Nullable Input<String> licenseType;
        private @Nullable Input<String> location;
        private @Nullable Input<NetworkProfileArgs> networkProfile;
        private @Nullable Input<OSProfileArgs> osProfile;
        private @Nullable Input<PlanArgs> plan;
        private @Nullable Input<Integer> platformFaultDomain;
        private @Nullable Input<Either<String,VirtualMachinePriorityTypes>> priority;
        private @Nullable Input<SubResourceArgs> proximityPlacementGroup;
        private Input<String> resourceGroupName;
        private @Nullable Input<ScheduledEventsProfileArgs> scheduledEventsProfile;
        private @Nullable Input<SecurityProfileArgs> securityProfile;
        private @Nullable Input<StorageProfileArgs> storageProfile;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> userData;
        private @Nullable Input<SubResourceArgs> virtualMachineScaleSet;
        private @Nullable Input<String> vmName;
        private @Nullable Input<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalCapabilities = defaults.additionalCapabilities;
    	      this.availabilitySet = defaults.availabilitySet;
    	      this.billingProfile = defaults.billingProfile;
    	      this.diagnosticsProfile = defaults.diagnosticsProfile;
    	      this.evictionPolicy = defaults.evictionPolicy;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.extensionsTimeBudget = defaults.extensionsTimeBudget;
    	      this.hardwareProfile = defaults.hardwareProfile;
    	      this.host = defaults.host;
    	      this.hostGroup = defaults.hostGroup;
    	      this.identity = defaults.identity;
    	      this.licenseType = defaults.licenseType;
    	      this.location = defaults.location;
    	      this.networkProfile = defaults.networkProfile;
    	      this.osProfile = defaults.osProfile;
    	      this.plan = defaults.plan;
    	      this.platformFaultDomain = defaults.platformFaultDomain;
    	      this.priority = defaults.priority;
    	      this.proximityPlacementGroup = defaults.proximityPlacementGroup;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scheduledEventsProfile = defaults.scheduledEventsProfile;
    	      this.securityProfile = defaults.securityProfile;
    	      this.storageProfile = defaults.storageProfile;
    	      this.tags = defaults.tags;
    	      this.userData = defaults.userData;
    	      this.virtualMachineScaleSet = defaults.virtualMachineScaleSet;
    	      this.vmName = defaults.vmName;
    	      this.zones = defaults.zones;
        }

        public Builder setAdditionalCapabilities(@Nullable Input<AdditionalCapabilitiesArgs> additionalCapabilities) {
            this.additionalCapabilities = additionalCapabilities;
            return this;
        }

        public Builder setAdditionalCapabilities(@Nullable AdditionalCapabilitiesArgs additionalCapabilities) {
            this.additionalCapabilities = Input.ofNullable(additionalCapabilities);
            return this;
        }

        public Builder setAvailabilitySet(@Nullable Input<SubResourceArgs> availabilitySet) {
            this.availabilitySet = availabilitySet;
            return this;
        }

        public Builder setAvailabilitySet(@Nullable SubResourceArgs availabilitySet) {
            this.availabilitySet = Input.ofNullable(availabilitySet);
            return this;
        }

        public Builder setBillingProfile(@Nullable Input<BillingProfileArgs> billingProfile) {
            this.billingProfile = billingProfile;
            return this;
        }

        public Builder setBillingProfile(@Nullable BillingProfileArgs billingProfile) {
            this.billingProfile = Input.ofNullable(billingProfile);
            return this;
        }

        public Builder setDiagnosticsProfile(@Nullable Input<DiagnosticsProfileArgs> diagnosticsProfile) {
            this.diagnosticsProfile = diagnosticsProfile;
            return this;
        }

        public Builder setDiagnosticsProfile(@Nullable DiagnosticsProfileArgs diagnosticsProfile) {
            this.diagnosticsProfile = Input.ofNullable(diagnosticsProfile);
            return this;
        }

        public Builder setEvictionPolicy(@Nullable Input<Either<String,VirtualMachineEvictionPolicyTypes>> evictionPolicy) {
            this.evictionPolicy = evictionPolicy;
            return this;
        }

        public Builder setEvictionPolicy(@Nullable Either<String,VirtualMachineEvictionPolicyTypes> evictionPolicy) {
            this.evictionPolicy = Input.ofNullable(evictionPolicy);
            return this;
        }

        public Builder setExtendedLocation(@Nullable Input<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Input.ofNullable(extendedLocation);
            return this;
        }

        public Builder setExtensionsTimeBudget(@Nullable Input<String> extensionsTimeBudget) {
            this.extensionsTimeBudget = extensionsTimeBudget;
            return this;
        }

        public Builder setExtensionsTimeBudget(@Nullable String extensionsTimeBudget) {
            this.extensionsTimeBudget = Input.ofNullable(extensionsTimeBudget);
            return this;
        }

        public Builder setHardwareProfile(@Nullable Input<HardwareProfileArgs> hardwareProfile) {
            this.hardwareProfile = hardwareProfile;
            return this;
        }

        public Builder setHardwareProfile(@Nullable HardwareProfileArgs hardwareProfile) {
            this.hardwareProfile = Input.ofNullable(hardwareProfile);
            return this;
        }

        public Builder setHost(@Nullable Input<SubResourceArgs> host) {
            this.host = host;
            return this;
        }

        public Builder setHost(@Nullable SubResourceArgs host) {
            this.host = Input.ofNullable(host);
            return this;
        }

        public Builder setHostGroup(@Nullable Input<SubResourceArgs> hostGroup) {
            this.hostGroup = hostGroup;
            return this;
        }

        public Builder setHostGroup(@Nullable SubResourceArgs hostGroup) {
            this.hostGroup = Input.ofNullable(hostGroup);
            return this;
        }

        public Builder setIdentity(@Nullable Input<VirtualMachineIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable VirtualMachineIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setLicenseType(@Nullable Input<String> licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setLicenseType(@Nullable String licenseType) {
            this.licenseType = Input.ofNullable(licenseType);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setNetworkProfile(@Nullable Input<NetworkProfileArgs> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setNetworkProfile(@Nullable NetworkProfileArgs networkProfile) {
            this.networkProfile = Input.ofNullable(networkProfile);
            return this;
        }

        public Builder setOsProfile(@Nullable Input<OSProfileArgs> osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder setOsProfile(@Nullable OSProfileArgs osProfile) {
            this.osProfile = Input.ofNullable(osProfile);
            return this;
        }

        public Builder setPlan(@Nullable Input<PlanArgs> plan) {
            this.plan = plan;
            return this;
        }

        public Builder setPlan(@Nullable PlanArgs plan) {
            this.plan = Input.ofNullable(plan);
            return this;
        }

        public Builder setPlatformFaultDomain(@Nullable Input<Integer> platformFaultDomain) {
            this.platformFaultDomain = platformFaultDomain;
            return this;
        }

        public Builder setPlatformFaultDomain(@Nullable Integer platformFaultDomain) {
            this.platformFaultDomain = Input.ofNullable(platformFaultDomain);
            return this;
        }

        public Builder setPriority(@Nullable Input<Either<String,VirtualMachinePriorityTypes>> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Either<String,VirtualMachinePriorityTypes> priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setProximityPlacementGroup(@Nullable Input<SubResourceArgs> proximityPlacementGroup) {
            this.proximityPlacementGroup = proximityPlacementGroup;
            return this;
        }

        public Builder setProximityPlacementGroup(@Nullable SubResourceArgs proximityPlacementGroup) {
            this.proximityPlacementGroup = Input.ofNullable(proximityPlacementGroup);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setScheduledEventsProfile(@Nullable Input<ScheduledEventsProfileArgs> scheduledEventsProfile) {
            this.scheduledEventsProfile = scheduledEventsProfile;
            return this;
        }

        public Builder setScheduledEventsProfile(@Nullable ScheduledEventsProfileArgs scheduledEventsProfile) {
            this.scheduledEventsProfile = Input.ofNullable(scheduledEventsProfile);
            return this;
        }

        public Builder setSecurityProfile(@Nullable Input<SecurityProfileArgs> securityProfile) {
            this.securityProfile = securityProfile;
            return this;
        }

        public Builder setSecurityProfile(@Nullable SecurityProfileArgs securityProfile) {
            this.securityProfile = Input.ofNullable(securityProfile);
            return this;
        }

        public Builder setStorageProfile(@Nullable Input<StorageProfileArgs> storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder setStorageProfile(@Nullable StorageProfileArgs storageProfile) {
            this.storageProfile = Input.ofNullable(storageProfile);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUserData(@Nullable Input<String> userData) {
            this.userData = userData;
            return this;
        }

        public Builder setUserData(@Nullable String userData) {
            this.userData = Input.ofNullable(userData);
            return this;
        }

        public Builder setVirtualMachineScaleSet(@Nullable Input<SubResourceArgs> virtualMachineScaleSet) {
            this.virtualMachineScaleSet = virtualMachineScaleSet;
            return this;
        }

        public Builder setVirtualMachineScaleSet(@Nullable SubResourceArgs virtualMachineScaleSet) {
            this.virtualMachineScaleSet = Input.ofNullable(virtualMachineScaleSet);
            return this;
        }

        public Builder setVmName(@Nullable Input<String> vmName) {
            this.vmName = vmName;
            return this;
        }

        public Builder setVmName(@Nullable String vmName) {
            this.vmName = Input.ofNullable(vmName);
            return this;
        }

        public Builder setZones(@Nullable Input<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }
        public VirtualMachineArgs build() {
            return new VirtualMachineArgs(additionalCapabilities, availabilitySet, billingProfile, diagnosticsProfile, evictionPolicy, extendedLocation, extensionsTimeBudget, hardwareProfile, host, hostGroup, identity, licenseType, location, networkProfile, osProfile, plan, platformFaultDomain, priority, proximityPlacementGroup, resourceGroupName, scheduledEventsProfile, securityProfile, storageProfile, tags, userData, virtualMachineScaleSet, vmName, zones);
        }
    }
}
