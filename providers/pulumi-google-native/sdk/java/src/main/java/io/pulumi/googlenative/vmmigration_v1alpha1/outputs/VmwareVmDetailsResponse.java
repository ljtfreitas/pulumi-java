// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VmwareVmDetailsResponse {
    /**
     * The VM Boot Option.
     * 
     */
    private final String bootOption;
    /**
     * The total size of the storage allocated to the VM in MB.
     * 
     */
    private final String committedStorage;
    /**
     * The total size of the storage allocated to the VM in MB.
     * 
     */
    private final String committedStorageMb;
    /**
     * The number of cpus in the VM.
     * 
     */
    private final Integer cpuCount;
    /**
     * The descriptive name of the vCenter's datacenter this VM is contained in.
     * 
     */
    private final String datacenterDescription;
    /**
     * The id of the vCenter's datacenter this VM is contained in.
     * 
     */
    private final String datacenterId;
    /**
     * The number of disks the VM has.
     * 
     */
    private final Integer diskCount;
    /**
     * The display name of the VM. Note that this is not necessarily unique.
     * 
     */
    private final String displayName;
    /**
     * The VM's OS. See for example https://pubs.vmware.com/vi-sdk/visdk250/ReferenceGuide/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html for types of strings this might hold.
     * 
     */
    private final String guestDescription;
    /**
     * The size of the memory of the VM in MB.
     * 
     */
    private final Integer memoryMb;
    /**
     * The power state of the VM at the moment list was taken.
     * 
     */
    private final String powerState;
    /**
     * The unique identifier of the VM in vCenter.
     * 
     */
    private final String uuid;
    /**
     * The VM's id in the source (note that this is not the MigratingVm's id). This is the moref id of the VM.
     * 
     */
    private final String vmId;

    @OutputCustomType.Constructor({"bootOption","committedStorage","committedStorageMb","cpuCount","datacenterDescription","datacenterId","diskCount","displayName","guestDescription","memoryMb","powerState","uuid","vmId"})
    private VmwareVmDetailsResponse(
        String bootOption,
        String committedStorage,
        String committedStorageMb,
        Integer cpuCount,
        String datacenterDescription,
        String datacenterId,
        Integer diskCount,
        String displayName,
        String guestDescription,
        Integer memoryMb,
        String powerState,
        String uuid,
        String vmId) {
        this.bootOption = Objects.requireNonNull(bootOption);
        this.committedStorage = Objects.requireNonNull(committedStorage);
        this.committedStorageMb = Objects.requireNonNull(committedStorageMb);
        this.cpuCount = Objects.requireNonNull(cpuCount);
        this.datacenterDescription = Objects.requireNonNull(datacenterDescription);
        this.datacenterId = Objects.requireNonNull(datacenterId);
        this.diskCount = Objects.requireNonNull(diskCount);
        this.displayName = Objects.requireNonNull(displayName);
        this.guestDescription = Objects.requireNonNull(guestDescription);
        this.memoryMb = Objects.requireNonNull(memoryMb);
        this.powerState = Objects.requireNonNull(powerState);
        this.uuid = Objects.requireNonNull(uuid);
        this.vmId = Objects.requireNonNull(vmId);
    }

    /**
     * The VM Boot Option.
     * 
     */
    public String getBootOption() {
        return this.bootOption;
    }
    /**
     * The total size of the storage allocated to the VM in MB.
     * 
     */
    public String getCommittedStorage() {
        return this.committedStorage;
    }
    /**
     * The total size of the storage allocated to the VM in MB.
     * 
     */
    public String getCommittedStorageMb() {
        return this.committedStorageMb;
    }
    /**
     * The number of cpus in the VM.
     * 
     */
    public Integer getCpuCount() {
        return this.cpuCount;
    }
    /**
     * The descriptive name of the vCenter's datacenter this VM is contained in.
     * 
     */
    public String getDatacenterDescription() {
        return this.datacenterDescription;
    }
    /**
     * The id of the vCenter's datacenter this VM is contained in.
     * 
     */
    public String getDatacenterId() {
        return this.datacenterId;
    }
    /**
     * The number of disks the VM has.
     * 
     */
    public Integer getDiskCount() {
        return this.diskCount;
    }
    /**
     * The display name of the VM. Note that this is not necessarily unique.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The VM's OS. See for example https://pubs.vmware.com/vi-sdk/visdk250/ReferenceGuide/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html for types of strings this might hold.
     * 
     */
    public String getGuestDescription() {
        return this.guestDescription;
    }
    /**
     * The size of the memory of the VM in MB.
     * 
     */
    public Integer getMemoryMb() {
        return this.memoryMb;
    }
    /**
     * The power state of the VM at the moment list was taken.
     * 
     */
    public String getPowerState() {
        return this.powerState;
    }
    /**
     * The unique identifier of the VM in vCenter.
     * 
     */
    public String getUuid() {
        return this.uuid;
    }
    /**
     * The VM's id in the source (note that this is not the MigratingVm's id). This is the moref id of the VM.
     * 
     */
    public String getVmId() {
        return this.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareVmDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bootOption;
        private String committedStorage;
        private String committedStorageMb;
        private Integer cpuCount;
        private String datacenterDescription;
        private String datacenterId;
        private Integer diskCount;
        private String displayName;
        private String guestDescription;
        private Integer memoryMb;
        private String powerState;
        private String uuid;
        private String vmId;

        public Builder() {
    	      // Empty
        }

        public Builder(VmwareVmDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootOption = defaults.bootOption;
    	      this.committedStorage = defaults.committedStorage;
    	      this.committedStorageMb = defaults.committedStorageMb;
    	      this.cpuCount = defaults.cpuCount;
    	      this.datacenterDescription = defaults.datacenterDescription;
    	      this.datacenterId = defaults.datacenterId;
    	      this.diskCount = defaults.diskCount;
    	      this.displayName = defaults.displayName;
    	      this.guestDescription = defaults.guestDescription;
    	      this.memoryMb = defaults.memoryMb;
    	      this.powerState = defaults.powerState;
    	      this.uuid = defaults.uuid;
    	      this.vmId = defaults.vmId;
        }

        public Builder setBootOption(String bootOption) {
            this.bootOption = Objects.requireNonNull(bootOption);
            return this;
        }

        public Builder setCommittedStorage(String committedStorage) {
            this.committedStorage = Objects.requireNonNull(committedStorage);
            return this;
        }

        public Builder setCommittedStorageMb(String committedStorageMb) {
            this.committedStorageMb = Objects.requireNonNull(committedStorageMb);
            return this;
        }

        public Builder setCpuCount(Integer cpuCount) {
            this.cpuCount = Objects.requireNonNull(cpuCount);
            return this;
        }

        public Builder setDatacenterDescription(String datacenterDescription) {
            this.datacenterDescription = Objects.requireNonNull(datacenterDescription);
            return this;
        }

        public Builder setDatacenterId(String datacenterId) {
            this.datacenterId = Objects.requireNonNull(datacenterId);
            return this;
        }

        public Builder setDiskCount(Integer diskCount) {
            this.diskCount = Objects.requireNonNull(diskCount);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setGuestDescription(String guestDescription) {
            this.guestDescription = Objects.requireNonNull(guestDescription);
            return this;
        }

        public Builder setMemoryMb(Integer memoryMb) {
            this.memoryMb = Objects.requireNonNull(memoryMb);
            return this;
        }

        public Builder setPowerState(String powerState) {
            this.powerState = Objects.requireNonNull(powerState);
            return this;
        }

        public Builder setUuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }

        public Builder setVmId(String vmId) {
            this.vmId = Objects.requireNonNull(vmId);
            return this;
        }
        public VmwareVmDetailsResponse build() {
            return new VmwareVmDetailsResponse(bootOption, committedStorage, committedStorageMb, cpuCount, datacenterDescription, datacenterId, diskCount, displayName, guestDescription, memoryMb, powerState, uuid, vmId);
        }
    }
}
