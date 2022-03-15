// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.outputs;

import io.pulumi.azurenative.vmwarecloudsimple.outputs.GuestOSCustomizationResponse;
import io.pulumi.azurenative.vmwarecloudsimple.outputs.ResourcePoolResponse;
import io.pulumi.azurenative.vmwarecloudsimple.outputs.VirtualDiskControllerResponse;
import io.pulumi.azurenative.vmwarecloudsimple.outputs.VirtualDiskResponse;
import io.pulumi.azurenative.vmwarecloudsimple.outputs.VirtualNicResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualMachineResult {
    /**
     * The amount of memory
     * 
     */
    private final Integer amountOfRam;
    /**
     * The list of Virtual Disks' Controllers
     * 
     */
    private final List<VirtualDiskControllerResponse> controllers;
    /**
     * Virtual machine properties
     * 
     */
    private final @Nullable GuestOSCustomizationResponse customization;
    /**
     * The list of Virtual Disks
     * 
     */
    private final @Nullable List<VirtualDiskResponse> disks;
    /**
     * The DNS name of Virtual Machine in VCenter
     * 
     */
    private final String dnsname;
    /**
     * Expose Guest OS or not
     * 
     */
    private final @Nullable Boolean exposeToGuestVM;
    /**
     * The path to virtual machine folder in VCenter
     * 
     */
    private final String folder;
    /**
     * The name of Guest OS
     * 
     */
    private final String guestOS;
    /**
     * The Guest OS type
     * 
     */
    private final String guestOSType;
    /**
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/virtualMachines/{virtualMachineName}
     * 
     */
    private final String id;
    /**
     * Azure region
     * 
     */
    private final String location;
    /**
     * {virtualMachineName}
     * 
     */
    private final String name;
    /**
     * The list of Virtual NICs
     * 
     */
    private final @Nullable List<VirtualNicResponse> nics;
    /**
     * The number of CPU cores
     * 
     */
    private final Integer numberOfCores;
    /**
     * Password for login. Deprecated - use customization property
     * 
     */
    private final @Nullable String password;
    /**
     * Private Cloud Id
     * 
     */
    private final String privateCloudId;
    /**
     * The provisioning status of the resource
     * 
     */
    private final String provisioningState;
    /**
     * The public ip of Virtual Machine
     * 
     */
    private final String publicIP;
    /**
     * Virtual Machines Resource Pool
     * 
     */
    private final @Nullable ResourcePoolResponse resourcePool;
    /**
     * The status of Virtual machine
     * 
     */
    private final String status;
    /**
     * The list of tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Virtual Machine Template Id
     * 
     */
    private final @Nullable String templateId;
    /**
     * {resourceProviderNamespace}/{resourceType}
     * 
     */
    private final String type;
    /**
     * Username for login. Deprecated - use customization property
     * 
     */
    private final @Nullable String username;
    /**
     * The list of Virtual VSphere Networks
     * 
     */
    private final @Nullable List<String> vSphereNetworks;
    /**
     * The internal id of Virtual Machine in VCenter
     * 
     */
    private final String vmId;
    /**
     * VMware tools version
     * 
     */
    private final String vmwaretools;

    @CustomType.Constructor
    private GetVirtualMachineResult(
        @CustomType.Parameter("amountOfRam") Integer amountOfRam,
        @CustomType.Parameter("controllers") List<VirtualDiskControllerResponse> controllers,
        @CustomType.Parameter("customization") @Nullable GuestOSCustomizationResponse customization,
        @CustomType.Parameter("disks") @Nullable List<VirtualDiskResponse> disks,
        @CustomType.Parameter("dnsname") String dnsname,
        @CustomType.Parameter("exposeToGuestVM") @Nullable Boolean exposeToGuestVM,
        @CustomType.Parameter("folder") String folder,
        @CustomType.Parameter("guestOS") String guestOS,
        @CustomType.Parameter("guestOSType") String guestOSType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nics") @Nullable List<VirtualNicResponse> nics,
        @CustomType.Parameter("numberOfCores") Integer numberOfCores,
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("privateCloudId") String privateCloudId,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicIP") String publicIP,
        @CustomType.Parameter("resourcePool") @Nullable ResourcePoolResponse resourcePool,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("templateId") @Nullable String templateId,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("username") @Nullable String username,
        @CustomType.Parameter("vSphereNetworks") @Nullable List<String> vSphereNetworks,
        @CustomType.Parameter("vmId") String vmId,
        @CustomType.Parameter("vmwaretools") String vmwaretools) {
        this.amountOfRam = amountOfRam;
        this.controllers = controllers;
        this.customization = customization;
        this.disks = disks;
        this.dnsname = dnsname;
        this.exposeToGuestVM = exposeToGuestVM;
        this.folder = folder;
        this.guestOS = guestOS;
        this.guestOSType = guestOSType;
        this.id = id;
        this.location = location;
        this.name = name;
        this.nics = nics;
        this.numberOfCores = numberOfCores;
        this.password = password;
        this.privateCloudId = privateCloudId;
        this.provisioningState = provisioningState;
        this.publicIP = publicIP;
        this.resourcePool = resourcePool;
        this.status = status;
        this.tags = tags;
        this.templateId = templateId;
        this.type = type;
        this.username = username;
        this.vSphereNetworks = vSphereNetworks;
        this.vmId = vmId;
        this.vmwaretools = vmwaretools;
    }

    /**
     * The amount of memory
     * 
    */
    public Integer getAmountOfRam() {
        return this.amountOfRam;
    }
    /**
     * The list of Virtual Disks' Controllers
     * 
    */
    public List<VirtualDiskControllerResponse> getControllers() {
        return this.controllers;
    }
    /**
     * Virtual machine properties
     * 
    */
    public Optional<GuestOSCustomizationResponse> getCustomization() {
        return Optional.ofNullable(this.customization);
    }
    /**
     * The list of Virtual Disks
     * 
    */
    public List<VirtualDiskResponse> getDisks() {
        return this.disks == null ? List.of() : this.disks;
    }
    /**
     * The DNS name of Virtual Machine in VCenter
     * 
    */
    public String getDnsname() {
        return this.dnsname;
    }
    /**
     * Expose Guest OS or not
     * 
    */
    public Optional<Boolean> getExposeToGuestVM() {
        return Optional.ofNullable(this.exposeToGuestVM);
    }
    /**
     * The path to virtual machine folder in VCenter
     * 
    */
    public String getFolder() {
        return this.folder;
    }
    /**
     * The name of Guest OS
     * 
    */
    public String getGuestOS() {
        return this.guestOS;
    }
    /**
     * The Guest OS type
     * 
    */
    public String getGuestOSType() {
        return this.guestOSType;
    }
    /**
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/virtualMachines/{virtualMachineName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Azure region
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * {virtualMachineName}
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The list of Virtual NICs
     * 
    */
    public List<VirtualNicResponse> getNics() {
        return this.nics == null ? List.of() : this.nics;
    }
    /**
     * The number of CPU cores
     * 
    */
    public Integer getNumberOfCores() {
        return this.numberOfCores;
    }
    /**
     * Password for login. Deprecated - use customization property
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Private Cloud Id
     * 
    */
    public String getPrivateCloudId() {
        return this.privateCloudId;
    }
    /**
     * The provisioning status of the resource
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The public ip of Virtual Machine
     * 
    */
    public String getPublicIP() {
        return this.publicIP;
    }
    /**
     * Virtual Machines Resource Pool
     * 
    */
    public Optional<ResourcePoolResponse> getResourcePool() {
        return Optional.ofNullable(this.resourcePool);
    }
    /**
     * The status of Virtual machine
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * The list of tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Virtual Machine Template Id
     * 
    */
    public Optional<String> getTemplateId() {
        return Optional.ofNullable(this.templateId);
    }
    /**
     * {resourceProviderNamespace}/{resourceType}
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Username for login. Deprecated - use customization property
     * 
    */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }
    /**
     * The list of Virtual VSphere Networks
     * 
    */
    public List<String> getVSphereNetworks() {
        return this.vSphereNetworks == null ? List.of() : this.vSphereNetworks;
    }
    /**
     * The internal id of Virtual Machine in VCenter
     * 
    */
    public String getVmId() {
        return this.vmId;
    }
    /**
     * VMware tools version
     * 
    */
    public String getVmwaretools() {
        return this.vmwaretools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer amountOfRam;
        private List<VirtualDiskControllerResponse> controllers;
        private @Nullable GuestOSCustomizationResponse customization;
        private @Nullable List<VirtualDiskResponse> disks;
        private String dnsname;
        private @Nullable Boolean exposeToGuestVM;
        private String folder;
        private String guestOS;
        private String guestOSType;
        private String id;
        private String location;
        private String name;
        private @Nullable List<VirtualNicResponse> nics;
        private Integer numberOfCores;
        private @Nullable String password;
        private String privateCloudId;
        private String provisioningState;
        private String publicIP;
        private @Nullable ResourcePoolResponse resourcePool;
        private String status;
        private @Nullable Map<String,String> tags;
        private @Nullable String templateId;
        private String type;
        private @Nullable String username;
        private @Nullable List<String> vSphereNetworks;
        private String vmId;
        private String vmwaretools;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amountOfRam = defaults.amountOfRam;
    	      this.controllers = defaults.controllers;
    	      this.customization = defaults.customization;
    	      this.disks = defaults.disks;
    	      this.dnsname = defaults.dnsname;
    	      this.exposeToGuestVM = defaults.exposeToGuestVM;
    	      this.folder = defaults.folder;
    	      this.guestOS = defaults.guestOS;
    	      this.guestOSType = defaults.guestOSType;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.nics = defaults.nics;
    	      this.numberOfCores = defaults.numberOfCores;
    	      this.password = defaults.password;
    	      this.privateCloudId = defaults.privateCloudId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIP = defaults.publicIP;
    	      this.resourcePool = defaults.resourcePool;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.templateId = defaults.templateId;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
    	      this.vSphereNetworks = defaults.vSphereNetworks;
    	      this.vmId = defaults.vmId;
    	      this.vmwaretools = defaults.vmwaretools;
        }

        public Builder amountOfRam(Integer amountOfRam) {
            this.amountOfRam = Objects.requireNonNull(amountOfRam);
            return this;
        }

        public Builder controllers(List<VirtualDiskControllerResponse> controllers) {
            this.controllers = Objects.requireNonNull(controllers);
            return this;
        }

        public Builder customization(@Nullable GuestOSCustomizationResponse customization) {
            this.customization = customization;
            return this;
        }

        public Builder disks(@Nullable List<VirtualDiskResponse> disks) {
            this.disks = disks;
            return this;
        }

        public Builder dnsname(String dnsname) {
            this.dnsname = Objects.requireNonNull(dnsname);
            return this;
        }

        public Builder exposeToGuestVM(@Nullable Boolean exposeToGuestVM) {
            this.exposeToGuestVM = exposeToGuestVM;
            return this;
        }

        public Builder folder(String folder) {
            this.folder = Objects.requireNonNull(folder);
            return this;
        }

        public Builder guestOS(String guestOS) {
            this.guestOS = Objects.requireNonNull(guestOS);
            return this;
        }

        public Builder guestOSType(String guestOSType) {
            this.guestOSType = Objects.requireNonNull(guestOSType);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder nics(@Nullable List<VirtualNicResponse> nics) {
            this.nics = nics;
            return this;
        }

        public Builder numberOfCores(Integer numberOfCores) {
            this.numberOfCores = Objects.requireNonNull(numberOfCores);
            return this;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder privateCloudId(String privateCloudId) {
            this.privateCloudId = Objects.requireNonNull(privateCloudId);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder publicIP(String publicIP) {
            this.publicIP = Objects.requireNonNull(publicIP);
            return this;
        }

        public Builder resourcePool(@Nullable ResourcePoolResponse resourcePool) {
            this.resourcePool = resourcePool;
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder templateId(@Nullable String templateId) {
            this.templateId = templateId;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }

        public Builder vSphereNetworks(@Nullable List<String> vSphereNetworks) {
            this.vSphereNetworks = vSphereNetworks;
            return this;
        }

        public Builder vmId(String vmId) {
            this.vmId = Objects.requireNonNull(vmId);
            return this;
        }

        public Builder vmwaretools(String vmwaretools) {
            this.vmwaretools = Objects.requireNonNull(vmwaretools);
            return this;
        }
        public GetVirtualMachineResult build() {
            return new GetVirtualMachineResult(amountOfRam, controllers, customization, disks, dnsname, exposeToGuestVM, folder, guestOS, guestOSType, id, location, name, nics, numberOfCores, password, privateCloudId, provisioningState, publicIP, resourcePool, status, tags, templateId, type, username, vSphereNetworks, vmId, vmwaretools);
        }
    }
}
