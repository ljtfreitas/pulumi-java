// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.enums.OperatingSystemTypes;
import io.pulumi.azurenative.hybridnetwork.inputs.VirtualHardDiskArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies information about the operating system disk used by the virtual machine. <br><br> For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
 * 
 */
public final class OsDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsDiskArgs Empty = new OsDiskArgs();

    /**
     * Specifies the size of os disk in gigabytes. This is the fully expanded disk size needed of the VHD image on the ASE. This disk size should be greater than the size of the VHD provided in vhdUri.
     * 
     */
    @InputImport(name="diskSizeGB")
        private final @Nullable Input<Integer> diskSizeGB;

    public Input<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Input.empty() : this.diskSizeGB;
    }

    /**
     * The VHD name.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The OS type.
     * 
     */
    @InputImport(name="osType")
        private final @Nullable Input<Either<String,OperatingSystemTypes>> osType;

    public Input<Either<String,OperatingSystemTypes>> getOsType() {
        return this.osType == null ? Input.empty() : this.osType;
    }

    /**
     * The virtual hard disk.
     * 
     */
    @InputImport(name="vhd")
        private final @Nullable Input<VirtualHardDiskArgs> vhd;

    public Input<VirtualHardDiskArgs> getVhd() {
        return this.vhd == null ? Input.empty() : this.vhd;
    }

    public OsDiskArgs(
        @Nullable Input<Integer> diskSizeGB,
        @Nullable Input<String> name,
        @Nullable Input<Either<String,OperatingSystemTypes>> osType,
        @Nullable Input<VirtualHardDiskArgs> vhd) {
        this.diskSizeGB = diskSizeGB;
        this.name = name;
        this.osType = osType;
        this.vhd = vhd;
    }

    private OsDiskArgs() {
        this.diskSizeGB = Input.empty();
        this.name = Input.empty();
        this.osType = Input.empty();
        this.vhd = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> diskSizeGB;
        private @Nullable Input<String> name;
        private @Nullable Input<Either<String,OperatingSystemTypes>> osType;
        private @Nullable Input<VirtualHardDiskArgs> vhd;

        public Builder() {
    	      // Empty
        }

        public Builder(OsDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.vhd = defaults.vhd;
        }

        public Builder setDiskSizeGB(@Nullable Input<Integer> diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder setDiskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = Input.ofNullable(diskSizeGB);
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

        public Builder setOsType(@Nullable Input<Either<String,OperatingSystemTypes>> osType) {
            this.osType = osType;
            return this;
        }

        public Builder setOsType(@Nullable Either<String,OperatingSystemTypes> osType) {
            this.osType = Input.ofNullable(osType);
            return this;
        }

        public Builder setVhd(@Nullable Input<VirtualHardDiskArgs> vhd) {
            this.vhd = vhd;
            return this;
        }

        public Builder setVhd(@Nullable VirtualHardDiskArgs vhd) {
            this.vhd = Input.ofNullable(vhd);
            return this;
        }
        public OsDiskArgs build() {
            return new OsDiskArgs(diskSizeGB, name, osType, vhd);
        }
    }
}
