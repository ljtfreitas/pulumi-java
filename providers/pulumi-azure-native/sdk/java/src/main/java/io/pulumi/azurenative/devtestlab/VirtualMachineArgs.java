// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.devtestlab.inputs.ArtifactInstallPropertiesArgs;
import io.pulumi.azurenative.devtestlab.inputs.DataDiskPropertiesArgs;
import io.pulumi.azurenative.devtestlab.inputs.GalleryImageReferenceArgs;
import io.pulumi.azurenative.devtestlab.inputs.NetworkInterfacePropertiesArgs;
import io.pulumi.azurenative.devtestlab.inputs.ScheduleCreationParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachineArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineArgs Empty = new VirtualMachineArgs();

    /**
     * Indicates whether another user can take ownership of the virtual machine
     * 
     */
    @InputImport(name="allowClaim")
        private final @Nullable Input<Boolean> allowClaim;

    public Input<Boolean> getAllowClaim() {
        return this.allowClaim == null ? Input.empty() : this.allowClaim;
    }

    /**
     * The artifacts to be installed on the virtual machine.
     * 
     */
    @InputImport(name="artifacts")
        private final @Nullable Input<List<ArtifactInstallPropertiesArgs>> artifacts;

    public Input<List<ArtifactInstallPropertiesArgs>> getArtifacts() {
        return this.artifacts == null ? Input.empty() : this.artifacts;
    }

    /**
     * The creation date of the virtual machine.
     * 
     */
    @InputImport(name="createdDate")
        private final @Nullable Input<String> createdDate;

    public Input<String> getCreatedDate() {
        return this.createdDate == null ? Input.empty() : this.createdDate;
    }

    /**
     * The custom image identifier of the virtual machine.
     * 
     */
    @InputImport(name="customImageId")
        private final @Nullable Input<String> customImageId;

    public Input<String> getCustomImageId() {
        return this.customImageId == null ? Input.empty() : this.customImageId;
    }

    /**
     * New or existing data disks to attach to the virtual machine after creation
     * 
     */
    @InputImport(name="dataDiskParameters")
        private final @Nullable Input<List<DataDiskPropertiesArgs>> dataDiskParameters;

    public Input<List<DataDiskPropertiesArgs>> getDataDiskParameters() {
        return this.dataDiskParameters == null ? Input.empty() : this.dataDiskParameters;
    }

    /**
     * Indicates whether the virtual machine is to be created without a public IP address.
     * 
     */
    @InputImport(name="disallowPublicIpAddress")
        private final @Nullable Input<Boolean> disallowPublicIpAddress;

    public Input<Boolean> getDisallowPublicIpAddress() {
        return this.disallowPublicIpAddress == null ? Input.empty() : this.disallowPublicIpAddress;
    }

    /**
     * The resource ID of the environment that contains this virtual machine, if any.
     * 
     */
    @InputImport(name="environmentId")
        private final @Nullable Input<String> environmentId;

    public Input<String> getEnvironmentId() {
        return this.environmentId == null ? Input.empty() : this.environmentId;
    }

    /**
     * The expiration date for VM.
     * 
     */
    @InputImport(name="expirationDate")
        private final @Nullable Input<String> expirationDate;

    public Input<String> getExpirationDate() {
        return this.expirationDate == null ? Input.empty() : this.expirationDate;
    }

    /**
     * The Microsoft Azure Marketplace image reference of the virtual machine.
     * 
     */
    @InputImport(name="galleryImageReference")
        private final @Nullable Input<GalleryImageReferenceArgs> galleryImageReference;

    public Input<GalleryImageReferenceArgs> getGalleryImageReference() {
        return this.galleryImageReference == null ? Input.empty() : this.galleryImageReference;
    }

    /**
     * Indicates whether this virtual machine uses an SSH key for authentication.
     * 
     */
    @InputImport(name="isAuthenticationWithSshKey")
        private final @Nullable Input<Boolean> isAuthenticationWithSshKey;

    public Input<Boolean> getIsAuthenticationWithSshKey() {
        return this.isAuthenticationWithSshKey == null ? Input.empty() : this.isAuthenticationWithSshKey;
    }

    /**
     * The name of the lab.
     * 
     */
    @InputImport(name="labName", required=true)
        private final Input<String> labName;

    public Input<String> getLabName() {
        return this.labName;
    }

    /**
     * The lab subnet name of the virtual machine.
     * 
     */
    @InputImport(name="labSubnetName")
        private final @Nullable Input<String> labSubnetName;

    public Input<String> getLabSubnetName() {
        return this.labSubnetName == null ? Input.empty() : this.labSubnetName;
    }

    /**
     * The lab virtual network identifier of the virtual machine.
     * 
     */
    @InputImport(name="labVirtualNetworkId")
        private final @Nullable Input<String> labVirtualNetworkId;

    public Input<String> getLabVirtualNetworkId() {
        return this.labVirtualNetworkId == null ? Input.empty() : this.labVirtualNetworkId;
    }

    /**
     * The location of the resource.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the virtual machine.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The network interface properties.
     * 
     */
    @InputImport(name="networkInterface")
        private final @Nullable Input<NetworkInterfacePropertiesArgs> networkInterface;

    public Input<NetworkInterfacePropertiesArgs> getNetworkInterface() {
        return this.networkInterface == null ? Input.empty() : this.networkInterface;
    }

    /**
     * The notes of the virtual machine.
     * 
     */
    @InputImport(name="notes")
        private final @Nullable Input<String> notes;

    public Input<String> getNotes() {
        return this.notes == null ? Input.empty() : this.notes;
    }

    /**
     * The object identifier of the owner of the virtual machine.
     * 
     */
    @InputImport(name="ownerObjectId")
        private final @Nullable Input<String> ownerObjectId;

    public Input<String> getOwnerObjectId() {
        return this.ownerObjectId == null ? Input.empty() : this.ownerObjectId;
    }

    /**
     * The user principal name of the virtual machine owner.
     * 
     */
    @InputImport(name="ownerUserPrincipalName")
        private final @Nullable Input<String> ownerUserPrincipalName;

    public Input<String> getOwnerUserPrincipalName() {
        return this.ownerUserPrincipalName == null ? Input.empty() : this.ownerUserPrincipalName;
    }

    /**
     * The password of the virtual machine administrator.
     * 
     */
    @InputImport(name="password")
        private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The id of the plan associated with the virtual machine image
     * 
     */
    @InputImport(name="planId")
        private final @Nullable Input<String> planId;

    public Input<String> getPlanId() {
        return this.planId == null ? Input.empty() : this.planId;
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
     * Virtual Machine schedules to be created
     * 
     */
    @InputImport(name="scheduleParameters")
        private final @Nullable Input<List<ScheduleCreationParameterArgs>> scheduleParameters;

    public Input<List<ScheduleCreationParameterArgs>> getScheduleParameters() {
        return this.scheduleParameters == null ? Input.empty() : this.scheduleParameters;
    }

    /**
     * The size of the virtual machine.
     * 
     */
    @InputImport(name="size")
        private final @Nullable Input<String> size;

    public Input<String> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    /**
     * The SSH key of the virtual machine administrator.
     * 
     */
    @InputImport(name="sshKey")
        private final @Nullable Input<String> sshKey;

    public Input<String> getSshKey() {
        return this.sshKey == null ? Input.empty() : this.sshKey;
    }

    /**
     * Storage type to use for virtual machine (i.e. Standard, Premium).
     * 
     */
    @InputImport(name="storageType")
        private final @Nullable Input<String> storageType;

    public Input<String> getStorageType() {
        return this.storageType == null ? Input.empty() : this.storageType;
    }

    /**
     * The tags of the resource.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The user name of the virtual machine.
     * 
     */
    @InputImport(name="userName")
        private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public VirtualMachineArgs(
        @Nullable Input<Boolean> allowClaim,
        @Nullable Input<List<ArtifactInstallPropertiesArgs>> artifacts,
        @Nullable Input<String> createdDate,
        @Nullable Input<String> customImageId,
        @Nullable Input<List<DataDiskPropertiesArgs>> dataDiskParameters,
        @Nullable Input<Boolean> disallowPublicIpAddress,
        @Nullable Input<String> environmentId,
        @Nullable Input<String> expirationDate,
        @Nullable Input<GalleryImageReferenceArgs> galleryImageReference,
        @Nullable Input<Boolean> isAuthenticationWithSshKey,
        Input<String> labName,
        @Nullable Input<String> labSubnetName,
        @Nullable Input<String> labVirtualNetworkId,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<NetworkInterfacePropertiesArgs> networkInterface,
        @Nullable Input<String> notes,
        @Nullable Input<String> ownerObjectId,
        @Nullable Input<String> ownerUserPrincipalName,
        @Nullable Input<String> password,
        @Nullable Input<String> planId,
        Input<String> resourceGroupName,
        @Nullable Input<List<ScheduleCreationParameterArgs>> scheduleParameters,
        @Nullable Input<String> size,
        @Nullable Input<String> sshKey,
        @Nullable Input<String> storageType,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> userName) {
        this.allowClaim = allowClaim == null ? Input.ofNullable(false) : allowClaim;
        this.artifacts = artifacts;
        this.createdDate = createdDate;
        this.customImageId = customImageId;
        this.dataDiskParameters = dataDiskParameters;
        this.disallowPublicIpAddress = disallowPublicIpAddress == null ? Input.ofNullable(false) : disallowPublicIpAddress;
        this.environmentId = environmentId;
        this.expirationDate = expirationDate;
        this.galleryImageReference = galleryImageReference;
        this.isAuthenticationWithSshKey = isAuthenticationWithSshKey;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.labSubnetName = labSubnetName;
        this.labVirtualNetworkId = labVirtualNetworkId;
        this.location = location;
        this.name = name;
        this.networkInterface = networkInterface;
        this.notes = notes;
        this.ownerObjectId = ownerObjectId == null ? Input.ofNullable("dynamicValue") : ownerObjectId;
        this.ownerUserPrincipalName = ownerUserPrincipalName;
        this.password = password;
        this.planId = planId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scheduleParameters = scheduleParameters;
        this.size = size;
        this.sshKey = sshKey;
        this.storageType = storageType == null ? Input.ofNullable("labStorageType") : storageType;
        this.tags = tags;
        this.userName = userName;
    }

    private VirtualMachineArgs() {
        this.allowClaim = Input.empty();
        this.artifacts = Input.empty();
        this.createdDate = Input.empty();
        this.customImageId = Input.empty();
        this.dataDiskParameters = Input.empty();
        this.disallowPublicIpAddress = Input.empty();
        this.environmentId = Input.empty();
        this.expirationDate = Input.empty();
        this.galleryImageReference = Input.empty();
        this.isAuthenticationWithSshKey = Input.empty();
        this.labName = Input.empty();
        this.labSubnetName = Input.empty();
        this.labVirtualNetworkId = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.networkInterface = Input.empty();
        this.notes = Input.empty();
        this.ownerObjectId = Input.empty();
        this.ownerUserPrincipalName = Input.empty();
        this.password = Input.empty();
        this.planId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scheduleParameters = Input.empty();
        this.size = Input.empty();
        this.sshKey = Input.empty();
        this.storageType = Input.empty();
        this.tags = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowClaim;
        private @Nullable Input<List<ArtifactInstallPropertiesArgs>> artifacts;
        private @Nullable Input<String> createdDate;
        private @Nullable Input<String> customImageId;
        private @Nullable Input<List<DataDiskPropertiesArgs>> dataDiskParameters;
        private @Nullable Input<Boolean> disallowPublicIpAddress;
        private @Nullable Input<String> environmentId;
        private @Nullable Input<String> expirationDate;
        private @Nullable Input<GalleryImageReferenceArgs> galleryImageReference;
        private @Nullable Input<Boolean> isAuthenticationWithSshKey;
        private Input<String> labName;
        private @Nullable Input<String> labSubnetName;
        private @Nullable Input<String> labVirtualNetworkId;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<NetworkInterfacePropertiesArgs> networkInterface;
        private @Nullable Input<String> notes;
        private @Nullable Input<String> ownerObjectId;
        private @Nullable Input<String> ownerUserPrincipalName;
        private @Nullable Input<String> password;
        private @Nullable Input<String> planId;
        private Input<String> resourceGroupName;
        private @Nullable Input<List<ScheduleCreationParameterArgs>> scheduleParameters;
        private @Nullable Input<String> size;
        private @Nullable Input<String> sshKey;
        private @Nullable Input<String> storageType;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowClaim = defaults.allowClaim;
    	      this.artifacts = defaults.artifacts;
    	      this.createdDate = defaults.createdDate;
    	      this.customImageId = defaults.customImageId;
    	      this.dataDiskParameters = defaults.dataDiskParameters;
    	      this.disallowPublicIpAddress = defaults.disallowPublicIpAddress;
    	      this.environmentId = defaults.environmentId;
    	      this.expirationDate = defaults.expirationDate;
    	      this.galleryImageReference = defaults.galleryImageReference;
    	      this.isAuthenticationWithSshKey = defaults.isAuthenticationWithSshKey;
    	      this.labName = defaults.labName;
    	      this.labSubnetName = defaults.labSubnetName;
    	      this.labVirtualNetworkId = defaults.labVirtualNetworkId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkInterface = defaults.networkInterface;
    	      this.notes = defaults.notes;
    	      this.ownerObjectId = defaults.ownerObjectId;
    	      this.ownerUserPrincipalName = defaults.ownerUserPrincipalName;
    	      this.password = defaults.password;
    	      this.planId = defaults.planId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scheduleParameters = defaults.scheduleParameters;
    	      this.size = defaults.size;
    	      this.sshKey = defaults.sshKey;
    	      this.storageType = defaults.storageType;
    	      this.tags = defaults.tags;
    	      this.userName = defaults.userName;
        }

        public Builder setAllowClaim(@Nullable Input<Boolean> allowClaim) {
            this.allowClaim = allowClaim;
            return this;
        }

        public Builder setAllowClaim(@Nullable Boolean allowClaim) {
            this.allowClaim = Input.ofNullable(allowClaim);
            return this;
        }

        public Builder setArtifacts(@Nullable Input<List<ArtifactInstallPropertiesArgs>> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        public Builder setArtifacts(@Nullable List<ArtifactInstallPropertiesArgs> artifacts) {
            this.artifacts = Input.ofNullable(artifacts);
            return this;
        }

        public Builder setCreatedDate(@Nullable Input<String> createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder setCreatedDate(@Nullable String createdDate) {
            this.createdDate = Input.ofNullable(createdDate);
            return this;
        }

        public Builder setCustomImageId(@Nullable Input<String> customImageId) {
            this.customImageId = customImageId;
            return this;
        }

        public Builder setCustomImageId(@Nullable String customImageId) {
            this.customImageId = Input.ofNullable(customImageId);
            return this;
        }

        public Builder setDataDiskParameters(@Nullable Input<List<DataDiskPropertiesArgs>> dataDiskParameters) {
            this.dataDiskParameters = dataDiskParameters;
            return this;
        }

        public Builder setDataDiskParameters(@Nullable List<DataDiskPropertiesArgs> dataDiskParameters) {
            this.dataDiskParameters = Input.ofNullable(dataDiskParameters);
            return this;
        }

        public Builder setDisallowPublicIpAddress(@Nullable Input<Boolean> disallowPublicIpAddress) {
            this.disallowPublicIpAddress = disallowPublicIpAddress;
            return this;
        }

        public Builder setDisallowPublicIpAddress(@Nullable Boolean disallowPublicIpAddress) {
            this.disallowPublicIpAddress = Input.ofNullable(disallowPublicIpAddress);
            return this;
        }

        public Builder setEnvironmentId(@Nullable Input<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder setEnvironmentId(@Nullable String environmentId) {
            this.environmentId = Input.ofNullable(environmentId);
            return this;
        }

        public Builder setExpirationDate(@Nullable Input<String> expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder setExpirationDate(@Nullable String expirationDate) {
            this.expirationDate = Input.ofNullable(expirationDate);
            return this;
        }

        public Builder setGalleryImageReference(@Nullable Input<GalleryImageReferenceArgs> galleryImageReference) {
            this.galleryImageReference = galleryImageReference;
            return this;
        }

        public Builder setGalleryImageReference(@Nullable GalleryImageReferenceArgs galleryImageReference) {
            this.galleryImageReference = Input.ofNullable(galleryImageReference);
            return this;
        }

        public Builder setIsAuthenticationWithSshKey(@Nullable Input<Boolean> isAuthenticationWithSshKey) {
            this.isAuthenticationWithSshKey = isAuthenticationWithSshKey;
            return this;
        }

        public Builder setIsAuthenticationWithSshKey(@Nullable Boolean isAuthenticationWithSshKey) {
            this.isAuthenticationWithSshKey = Input.ofNullable(isAuthenticationWithSshKey);
            return this;
        }

        public Builder setLabName(Input<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder setLabName(String labName) {
            this.labName = Input.of(Objects.requireNonNull(labName));
            return this;
        }

        public Builder setLabSubnetName(@Nullable Input<String> labSubnetName) {
            this.labSubnetName = labSubnetName;
            return this;
        }

        public Builder setLabSubnetName(@Nullable String labSubnetName) {
            this.labSubnetName = Input.ofNullable(labSubnetName);
            return this;
        }

        public Builder setLabVirtualNetworkId(@Nullable Input<String> labVirtualNetworkId) {
            this.labVirtualNetworkId = labVirtualNetworkId;
            return this;
        }

        public Builder setLabVirtualNetworkId(@Nullable String labVirtualNetworkId) {
            this.labVirtualNetworkId = Input.ofNullable(labVirtualNetworkId);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetworkInterface(@Nullable Input<NetworkInterfacePropertiesArgs> networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }

        public Builder setNetworkInterface(@Nullable NetworkInterfacePropertiesArgs networkInterface) {
            this.networkInterface = Input.ofNullable(networkInterface);
            return this;
        }

        public Builder setNotes(@Nullable Input<String> notes) {
            this.notes = notes;
            return this;
        }

        public Builder setNotes(@Nullable String notes) {
            this.notes = Input.ofNullable(notes);
            return this;
        }

        public Builder setOwnerObjectId(@Nullable Input<String> ownerObjectId) {
            this.ownerObjectId = ownerObjectId;
            return this;
        }

        public Builder setOwnerObjectId(@Nullable String ownerObjectId) {
            this.ownerObjectId = Input.ofNullable(ownerObjectId);
            return this;
        }

        public Builder setOwnerUserPrincipalName(@Nullable Input<String> ownerUserPrincipalName) {
            this.ownerUserPrincipalName = ownerUserPrincipalName;
            return this;
        }

        public Builder setOwnerUserPrincipalName(@Nullable String ownerUserPrincipalName) {
            this.ownerUserPrincipalName = Input.ofNullable(ownerUserPrincipalName);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setPlanId(@Nullable Input<String> planId) {
            this.planId = planId;
            return this;
        }

        public Builder setPlanId(@Nullable String planId) {
            this.planId = Input.ofNullable(planId);
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

        public Builder setScheduleParameters(@Nullable Input<List<ScheduleCreationParameterArgs>> scheduleParameters) {
            this.scheduleParameters = scheduleParameters;
            return this;
        }

        public Builder setScheduleParameters(@Nullable List<ScheduleCreationParameterArgs> scheduleParameters) {
            this.scheduleParameters = Input.ofNullable(scheduleParameters);
            return this;
        }

        public Builder setSize(@Nullable Input<String> size) {
            this.size = size;
            return this;
        }

        public Builder setSize(@Nullable String size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder setSshKey(@Nullable Input<String> sshKey) {
            this.sshKey = sshKey;
            return this;
        }

        public Builder setSshKey(@Nullable String sshKey) {
            this.sshKey = Input.ofNullable(sshKey);
            return this;
        }

        public Builder setStorageType(@Nullable Input<String> storageType) {
            this.storageType = storageType;
            return this;
        }

        public Builder setStorageType(@Nullable String storageType) {
            this.storageType = Input.ofNullable(storageType);
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

        public Builder setUserName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }
        public VirtualMachineArgs build() {
            return new VirtualMachineArgs(allowClaim, artifacts, createdDate, customImageId, dataDiskParameters, disallowPublicIpAddress, environmentId, expirationDate, galleryImageReference, isAuthenticationWithSshKey, labName, labSubnetName, labVirtualNetworkId, location, name, networkInterface, notes, ownerObjectId, ownerUserPrincipalName, password, planId, resourceGroupName, scheduleParameters, size, sshKey, storageType, tags, userName);
        }
    }
}
