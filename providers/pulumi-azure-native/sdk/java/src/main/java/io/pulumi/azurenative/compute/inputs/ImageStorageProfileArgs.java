// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.ImageDataDiskArgs;
import io.pulumi.azurenative.compute.inputs.ImageOSDiskArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a storage profile.
 * 
 */
public final class ImageStorageProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageStorageProfileArgs Empty = new ImageStorageProfileArgs();

    /**
     * Specifies the parameters that are used to add a data disk to a virtual machine. <br><br> For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * 
     */
    @InputImport(name="dataDisks")
        private final @Nullable Input<List<ImageDataDiskArgs>> dataDisks;

    public Input<List<ImageDataDiskArgs>> getDataDisks() {
        return this.dataDisks == null ? Input.empty() : this.dataDisks;
    }

    /**
     * Specifies information about the operating system disk used by the virtual machine. <br><br> For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-about-disks-vhds?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json).
     * 
     */
    @InputImport(name="osDisk")
        private final @Nullable Input<ImageOSDiskArgs> osDisk;

    public Input<ImageOSDiskArgs> getOsDisk() {
        return this.osDisk == null ? Input.empty() : this.osDisk;
    }

    /**
     * Specifies whether an image is zone resilient or not. Default is false. Zone resilient images can be created only in regions that provide Zone Redundant Storage (ZRS).
     * 
     */
    @InputImport(name="zoneResilient")
        private final @Nullable Input<Boolean> zoneResilient;

    public Input<Boolean> getZoneResilient() {
        return this.zoneResilient == null ? Input.empty() : this.zoneResilient;
    }

    public ImageStorageProfileArgs(
        @Nullable Input<List<ImageDataDiskArgs>> dataDisks,
        @Nullable Input<ImageOSDiskArgs> osDisk,
        @Nullable Input<Boolean> zoneResilient) {
        this.dataDisks = dataDisks;
        this.osDisk = osDisk;
        this.zoneResilient = zoneResilient;
    }

    private ImageStorageProfileArgs() {
        this.dataDisks = Input.empty();
        this.osDisk = Input.empty();
        this.zoneResilient = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageStorageProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ImageDataDiskArgs>> dataDisks;
        private @Nullable Input<ImageOSDiskArgs> osDisk;
        private @Nullable Input<Boolean> zoneResilient;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageStorageProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDisks = defaults.dataDisks;
    	      this.osDisk = defaults.osDisk;
    	      this.zoneResilient = defaults.zoneResilient;
        }

        public Builder setDataDisks(@Nullable Input<List<ImageDataDiskArgs>> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        public Builder setDataDisks(@Nullable List<ImageDataDiskArgs> dataDisks) {
            this.dataDisks = Input.ofNullable(dataDisks);
            return this;
        }

        public Builder setOsDisk(@Nullable Input<ImageOSDiskArgs> osDisk) {
            this.osDisk = osDisk;
            return this;
        }

        public Builder setOsDisk(@Nullable ImageOSDiskArgs osDisk) {
            this.osDisk = Input.ofNullable(osDisk);
            return this;
        }

        public Builder setZoneResilient(@Nullable Input<Boolean> zoneResilient) {
            this.zoneResilient = zoneResilient;
            return this;
        }

        public Builder setZoneResilient(@Nullable Boolean zoneResilient) {
            this.zoneResilient = Input.ofNullable(zoneResilient);
            return this;
        }
        public ImageStorageProfileArgs build() {
            return new ImageStorageProfileArgs(dataDisks, osDisk, zoneResilient);
        }
    }
}
