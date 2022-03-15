// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.vmmigration_v1alpha1.enums.VmwareVmDetailsPowerState;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VmwareVmDetails describes a VM in vCenter.
 * 
 */
public final class VmwareVmDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VmwareVmDetailsArgs Empty = new VmwareVmDetailsArgs();

    /**
     * The total size of the storage allocated to the VM in MB.
     * 
     */
    @Import(name="committedStorage")
      private final @Nullable Output<String> committedStorage;

    public Output<String> getCommittedStorage() {
        return this.committedStorage == null ? Output.empty() : this.committedStorage;
    }

    /**
     * The total size of the storage allocated to the VM in MB.
     * 
     */
    @Import(name="committedStorageMb")
      private final @Nullable Output<String> committedStorageMb;

    public Output<String> getCommittedStorageMb() {
        return this.committedStorageMb == null ? Output.empty() : this.committedStorageMb;
    }

    /**
     * The number of cpus in the VM.
     * 
     */
    @Import(name="cpuCount")
      private final @Nullable Output<Integer> cpuCount;

    public Output<Integer> getCpuCount() {
        return this.cpuCount == null ? Output.empty() : this.cpuCount;
    }

    /**
     * The descriptive name of the vCenter's datacenter this VM is contained in.
     * 
     */
    @Import(name="datacenterDescription")
      private final @Nullable Output<String> datacenterDescription;

    public Output<String> getDatacenterDescription() {
        return this.datacenterDescription == null ? Output.empty() : this.datacenterDescription;
    }

    /**
     * The id of the vCenter's datacenter this VM is contained in.
     * 
     */
    @Import(name="datacenterId")
      private final @Nullable Output<String> datacenterId;

    public Output<String> getDatacenterId() {
        return this.datacenterId == null ? Output.empty() : this.datacenterId;
    }

    /**
     * The number of disks the VM has.
     * 
     */
    @Import(name="diskCount")
      private final @Nullable Output<Integer> diskCount;

    public Output<Integer> getDiskCount() {
        return this.diskCount == null ? Output.empty() : this.diskCount;
    }

    /**
     * The display name of the VM. Note that this is not necessarily unique.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * The VM's OS. See for example https://pubs.vmware.com/vi-sdk/visdk250/ReferenceGuide/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html for types of strings this might hold.
     * 
     */
    @Import(name="guestDescription")
      private final @Nullable Output<String> guestDescription;

    public Output<String> getGuestDescription() {
        return this.guestDescription == null ? Output.empty() : this.guestDescription;
    }

    /**
     * The size of the memory of the VM in MB.
     * 
     */
    @Import(name="memoryMb")
      private final @Nullable Output<Integer> memoryMb;

    public Output<Integer> getMemoryMb() {
        return this.memoryMb == null ? Output.empty() : this.memoryMb;
    }

    /**
     * The power state of the VM at the moment list was taken.
     * 
     */
    @Import(name="powerState")
      private final @Nullable Output<VmwareVmDetailsPowerState> powerState;

    public Output<VmwareVmDetailsPowerState> getPowerState() {
        return this.powerState == null ? Output.empty() : this.powerState;
    }

    /**
     * The unique identifier of the VM in vCenter.
     * 
     */
    @Import(name="uuid")
      private final @Nullable Output<String> uuid;

    public Output<String> getUuid() {
        return this.uuid == null ? Output.empty() : this.uuid;
    }

    /**
     * The VM's id in the source (note that this is not the MigratingVm's id). This is the moref id of the VM.
     * 
     */
    @Import(name="vmId")
      private final @Nullable Output<String> vmId;

    public Output<String> getVmId() {
        return this.vmId == null ? Output.empty() : this.vmId;
    }

    public VmwareVmDetailsArgs(
        @Nullable Output<String> committedStorage,
        @Nullable Output<String> committedStorageMb,
        @Nullable Output<Integer> cpuCount,
        @Nullable Output<String> datacenterDescription,
        @Nullable Output<String> datacenterId,
        @Nullable Output<Integer> diskCount,
        @Nullable Output<String> displayName,
        @Nullable Output<String> guestDescription,
        @Nullable Output<Integer> memoryMb,
        @Nullable Output<VmwareVmDetailsPowerState> powerState,
        @Nullable Output<String> uuid,
        @Nullable Output<String> vmId) {
        this.committedStorage = committedStorage;
        this.committedStorageMb = committedStorageMb;
        this.cpuCount = cpuCount;
        this.datacenterDescription = datacenterDescription;
        this.datacenterId = datacenterId;
        this.diskCount = diskCount;
        this.displayName = displayName;
        this.guestDescription = guestDescription;
        this.memoryMb = memoryMb;
        this.powerState = powerState;
        this.uuid = uuid;
        this.vmId = vmId;
    }

    private VmwareVmDetailsArgs() {
        this.committedStorage = Output.empty();
        this.committedStorageMb = Output.empty();
        this.cpuCount = Output.empty();
        this.datacenterDescription = Output.empty();
        this.datacenterId = Output.empty();
        this.diskCount = Output.empty();
        this.displayName = Output.empty();
        this.guestDescription = Output.empty();
        this.memoryMb = Output.empty();
        this.powerState = Output.empty();
        this.uuid = Output.empty();
        this.vmId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareVmDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> committedStorage;
        private @Nullable Output<String> committedStorageMb;
        private @Nullable Output<Integer> cpuCount;
        private @Nullable Output<String> datacenterDescription;
        private @Nullable Output<String> datacenterId;
        private @Nullable Output<Integer> diskCount;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> guestDescription;
        private @Nullable Output<Integer> memoryMb;
        private @Nullable Output<VmwareVmDetailsPowerState> powerState;
        private @Nullable Output<String> uuid;
        private @Nullable Output<String> vmId;

        public Builder() {
    	      // Empty
        }

        public Builder(VmwareVmDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
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

        public Builder committedStorage(@Nullable Output<String> committedStorage) {
            this.committedStorage = committedStorage;
            return this;
        }

        public Builder committedStorage(@Nullable String committedStorage) {
            this.committedStorage = Output.ofNullable(committedStorage);
            return this;
        }

        public Builder committedStorageMb(@Nullable Output<String> committedStorageMb) {
            this.committedStorageMb = committedStorageMb;
            return this;
        }

        public Builder committedStorageMb(@Nullable String committedStorageMb) {
            this.committedStorageMb = Output.ofNullable(committedStorageMb);
            return this;
        }

        public Builder cpuCount(@Nullable Output<Integer> cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        public Builder cpuCount(@Nullable Integer cpuCount) {
            this.cpuCount = Output.ofNullable(cpuCount);
            return this;
        }

        public Builder datacenterDescription(@Nullable Output<String> datacenterDescription) {
            this.datacenterDescription = datacenterDescription;
            return this;
        }

        public Builder datacenterDescription(@Nullable String datacenterDescription) {
            this.datacenterDescription = Output.ofNullable(datacenterDescription);
            return this;
        }

        public Builder datacenterId(@Nullable Output<String> datacenterId) {
            this.datacenterId = datacenterId;
            return this;
        }

        public Builder datacenterId(@Nullable String datacenterId) {
            this.datacenterId = Output.ofNullable(datacenterId);
            return this;
        }

        public Builder diskCount(@Nullable Output<Integer> diskCount) {
            this.diskCount = diskCount;
            return this;
        }

        public Builder diskCount(@Nullable Integer diskCount) {
            this.diskCount = Output.ofNullable(diskCount);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder guestDescription(@Nullable Output<String> guestDescription) {
            this.guestDescription = guestDescription;
            return this;
        }

        public Builder guestDescription(@Nullable String guestDescription) {
            this.guestDescription = Output.ofNullable(guestDescription);
            return this;
        }

        public Builder memoryMb(@Nullable Output<Integer> memoryMb) {
            this.memoryMb = memoryMb;
            return this;
        }

        public Builder memoryMb(@Nullable Integer memoryMb) {
            this.memoryMb = Output.ofNullable(memoryMb);
            return this;
        }

        public Builder powerState(@Nullable Output<VmwareVmDetailsPowerState> powerState) {
            this.powerState = powerState;
            return this;
        }

        public Builder powerState(@Nullable VmwareVmDetailsPowerState powerState) {
            this.powerState = Output.ofNullable(powerState);
            return this;
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            this.uuid = Output.ofNullable(uuid);
            return this;
        }

        public Builder vmId(@Nullable Output<String> vmId) {
            this.vmId = vmId;
            return this;
        }

        public Builder vmId(@Nullable String vmId) {
            this.vmId = Output.ofNullable(vmId);
            return this;
        }
        public VmwareVmDetailsArgs build() {
            return new VmwareVmDetailsArgs(committedStorage, committedStorageMb, cpuCount, datacenterDescription, datacenterId, diskCount, displayName, guestDescription, memoryMb, powerState, uuid, vmId);
        }
    }
}
