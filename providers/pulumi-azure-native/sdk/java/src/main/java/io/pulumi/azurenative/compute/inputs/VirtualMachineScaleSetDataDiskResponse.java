// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetManagedDiskParametersResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set data disk.
 * 
 */
public final class VirtualMachineScaleSetDataDiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetDataDiskResponse Empty = new VirtualMachineScaleSetDataDiskResponse();

    /**
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br> Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    @InputImport(name="caching")
    private final @Nullable String caching;

    public Optional<String> getCaching() {
        return this.caching == null ? Optional.empty() : Optional.ofNullable(this.caching);
    }

    /**
     * The create option.
     * 
     */
    @InputImport(name="createOption", required=true)
    private final String createOption;

    public String getCreateOption() {
        return this.createOption;
    }

    /**
     * Specifies the Read-Write IOPS for the managed disk. Should be used only when StorageAccountType is UltraSSD_LRS. If not specified, a default value would be assigned based on diskSizeGB.
     * 
     */
    @InputImport(name="diskIOPSReadWrite")
    private final @Nullable Double diskIOPSReadWrite;

    public Optional<Double> getDiskIOPSReadWrite() {
        return this.diskIOPSReadWrite == null ? Optional.empty() : Optional.ofNullable(this.diskIOPSReadWrite);
    }

    /**
     * Specifies the bandwidth in MB per second for the managed disk. Should be used only when StorageAccountType is UltraSSD_LRS. If not specified, a default value would be assigned based on diskSizeGB.
     * 
     */
    @InputImport(name="diskMBpsReadWrite")
    private final @Nullable Double diskMBpsReadWrite;

    public Optional<Double> getDiskMBpsReadWrite() {
        return this.diskMBpsReadWrite == null ? Optional.empty() : Optional.ofNullable(this.diskMBpsReadWrite);
    }

    /**
     * Specifies the size of an empty data disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
     */
    @InputImport(name="diskSizeGB")
    private final @Nullable Integer diskSizeGB;

    public Optional<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Optional.empty() : Optional.ofNullable(this.diskSizeGB);
    }

    /**
     * Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     * 
     */
    @InputImport(name="lun", required=true)
    private final Integer lun;

    public Integer getLun() {
        return this.lun;
    }

    /**
     * The managed disk parameters.
     * 
     */
    @InputImport(name="managedDisk")
    private final @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk;

    public Optional<VirtualMachineScaleSetManagedDiskParametersResponse> getManagedDisk() {
        return this.managedDisk == null ? Optional.empty() : Optional.ofNullable(this.managedDisk);
    }

    /**
     * The disk name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
     */
    @InputImport(name="writeAcceleratorEnabled")
    private final @Nullable Boolean writeAcceleratorEnabled;

    public Optional<Boolean> getWriteAcceleratorEnabled() {
        return this.writeAcceleratorEnabled == null ? Optional.empty() : Optional.ofNullable(this.writeAcceleratorEnabled);
    }

    public VirtualMachineScaleSetDataDiskResponse(
        @Nullable String caching,
        String createOption,
        @Nullable Double diskIOPSReadWrite,
        @Nullable Double diskMBpsReadWrite,
        @Nullable Integer diskSizeGB,
        Integer lun,
        @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk,
        @Nullable String name,
        @Nullable Boolean writeAcceleratorEnabled) {
        this.caching = caching;
        this.createOption = Objects.requireNonNull(createOption, "expected parameter 'createOption' to be non-null");
        this.diskIOPSReadWrite = diskIOPSReadWrite;
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        this.diskSizeGB = diskSizeGB;
        this.lun = Objects.requireNonNull(lun, "expected parameter 'lun' to be non-null");
        this.managedDisk = managedDisk;
        this.name = name;
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
    }

    private VirtualMachineScaleSetDataDiskResponse() {
        this.caching = null;
        this.createOption = null;
        this.diskIOPSReadWrite = null;
        this.diskMBpsReadWrite = null;
        this.diskSizeGB = null;
        this.lun = null;
        this.managedDisk = null;
        this.name = null;
        this.writeAcceleratorEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetDataDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caching;
        private String createOption;
        private @Nullable Double diskIOPSReadWrite;
        private @Nullable Double diskMBpsReadWrite;
        private @Nullable Integer diskSizeGB;
        private Integer lun;
        private @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk;
        private @Nullable String name;
        private @Nullable Boolean writeAcceleratorEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetDataDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.createOption = defaults.createOption;
    	      this.diskIOPSReadWrite = defaults.diskIOPSReadWrite;
    	      this.diskMBpsReadWrite = defaults.diskMBpsReadWrite;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.lun = defaults.lun;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
    	      this.writeAcceleratorEnabled = defaults.writeAcceleratorEnabled;
        }

        public Builder setCaching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }

        public Builder setCreateOption(String createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }

        public Builder setDiskIOPSReadWrite(@Nullable Double diskIOPSReadWrite) {
            this.diskIOPSReadWrite = diskIOPSReadWrite;
            return this;
        }

        public Builder setDiskMBpsReadWrite(@Nullable Double diskMBpsReadWrite) {
            this.diskMBpsReadWrite = diskMBpsReadWrite;
            return this;
        }

        public Builder setDiskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder setLun(Integer lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }

        public Builder setManagedDisk(@Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setWriteAcceleratorEnabled(@Nullable Boolean writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }

        public VirtualMachineScaleSetDataDiskResponse build() {
            return new VirtualMachineScaleSetDataDiskResponse(caching, createOption, diskIOPSReadWrite, diskMBpsReadWrite, diskSizeGB, lun, managedDisk, name, writeAcceleratorEnabled);
        }
    }
}
