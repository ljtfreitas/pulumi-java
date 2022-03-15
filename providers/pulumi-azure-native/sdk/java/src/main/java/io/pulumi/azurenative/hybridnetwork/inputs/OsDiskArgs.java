// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.enums.OperatingSystemTypes;
import io.pulumi.azurenative.hybridnetwork.inputs.VirtualHardDiskArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="diskSizeGB")
      private final @Nullable Output<Integer> diskSizeGB;

    public Output<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Output.empty() : this.diskSizeGB;
    }

    /**
     * The VHD name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The OS type.
     * 
     */
    @Import(name="osType")
      private final @Nullable Output<Either<String,OperatingSystemTypes>> osType;

    public Output<Either<String,OperatingSystemTypes>> getOsType() {
        return this.osType == null ? Output.empty() : this.osType;
    }

    /**
     * The virtual hard disk.
     * 
     */
    @Import(name="vhd")
      private final @Nullable Output<VirtualHardDiskArgs> vhd;

    public Output<VirtualHardDiskArgs> getVhd() {
        return this.vhd == null ? Output.empty() : this.vhd;
    }

    public OsDiskArgs(
        @Nullable Output<Integer> diskSizeGB,
        @Nullable Output<String> name,
        @Nullable Output<Either<String,OperatingSystemTypes>> osType,
        @Nullable Output<VirtualHardDiskArgs> vhd) {
        this.diskSizeGB = diskSizeGB;
        this.name = name;
        this.osType = osType;
        this.vhd = vhd;
    }

    private OsDiskArgs() {
        this.diskSizeGB = Output.empty();
        this.name = Output.empty();
        this.osType = Output.empty();
        this.vhd = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> diskSizeGB;
        private @Nullable Output<String> name;
        private @Nullable Output<Either<String,OperatingSystemTypes>> osType;
        private @Nullable Output<VirtualHardDiskArgs> vhd;

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

        public Builder diskSizeGB(@Nullable Output<Integer> diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = Output.ofNullable(diskSizeGB);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder osType(@Nullable Output<Either<String,OperatingSystemTypes>> osType) {
            this.osType = osType;
            return this;
        }

        public Builder osType(@Nullable Either<String,OperatingSystemTypes> osType) {
            this.osType = Output.ofNullable(osType);
            return this;
        }

        public Builder vhd(@Nullable Output<VirtualHardDiskArgs> vhd) {
            this.vhd = vhd;
            return this;
        }

        public Builder vhd(@Nullable VirtualHardDiskArgs vhd) {
            this.vhd = Output.ofNullable(vhd);
            return this;
        }
        public OsDiskArgs build() {
            return new OsDiskArgs(diskSizeGB, name, osType, vhd);
        }
    }
}
