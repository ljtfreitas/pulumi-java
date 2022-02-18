// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.inputs.DataDiskArgs;
import io.pulumi.azurenative.hybridnetwork.inputs.ImageReferenceArgs;
import io.pulumi.azurenative.hybridnetwork.inputs.OsDiskArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the storage settings for the virtual machine disks.
 * 
 */
public final class StorageProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageProfileArgs Empty = new StorageProfileArgs();

    /**
     * Specifies the parameters that are used to add a data disk to a virtual machine.
     * 
     */
    @InputImport(name="dataDisks")
    private final @Nullable Input<List<DataDiskArgs>> dataDisks;

    public Input<List<DataDiskArgs>> getDataDisks() {
        return this.dataDisks == null ? Input.empty() : this.dataDisks;
    }

    /**
     * The image reference properties.
     * 
     */
    @InputImport(name="imageReference")
    private final @Nullable Input<ImageReferenceArgs> imageReference;

    public Input<ImageReferenceArgs> getImageReference() {
        return this.imageReference == null ? Input.empty() : this.imageReference;
    }

    /**
     * Specifies information about the operating system disk used by the virtual machine.
     * 
     */
    @InputImport(name="osDisk")
    private final @Nullable Input<OsDiskArgs> osDisk;

    public Input<OsDiskArgs> getOsDisk() {
        return this.osDisk == null ? Input.empty() : this.osDisk;
    }

    public StorageProfileArgs(
        @Nullable Input<List<DataDiskArgs>> dataDisks,
        @Nullable Input<ImageReferenceArgs> imageReference,
        @Nullable Input<OsDiskArgs> osDisk) {
        this.dataDisks = dataDisks;
        this.imageReference = imageReference;
        this.osDisk = osDisk;
    }

    private StorageProfileArgs() {
        this.dataDisks = Input.empty();
        this.imageReference = Input.empty();
        this.osDisk = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DataDiskArgs>> dataDisks;
        private @Nullable Input<ImageReferenceArgs> imageReference;
        private @Nullable Input<OsDiskArgs> osDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDisks = defaults.dataDisks;
    	      this.imageReference = defaults.imageReference;
    	      this.osDisk = defaults.osDisk;
        }

        public Builder setDataDisks(@Nullable Input<List<DataDiskArgs>> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        public Builder setDataDisks(@Nullable List<DataDiskArgs> dataDisks) {
            this.dataDisks = Input.ofNullable(dataDisks);
            return this;
        }

        public Builder setImageReference(@Nullable Input<ImageReferenceArgs> imageReference) {
            this.imageReference = imageReference;
            return this;
        }

        public Builder setImageReference(@Nullable ImageReferenceArgs imageReference) {
            this.imageReference = Input.ofNullable(imageReference);
            return this;
        }

        public Builder setOsDisk(@Nullable Input<OsDiskArgs> osDisk) {
            this.osDisk = osDisk;
            return this;
        }

        public Builder setOsDisk(@Nullable OsDiskArgs osDisk) {
            this.osDisk = Input.ofNullable(osDisk);
            return this;
        }

        public StorageProfileArgs build() {
            return new StorageProfileArgs(dataDisks, imageReference, osDisk);
        }
    }
}
