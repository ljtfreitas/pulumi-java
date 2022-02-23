// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.DataDiskResponse;
import io.pulumi.azurenative.compute.inputs.ImageReferenceResponse;
import io.pulumi.azurenative.compute.inputs.OSDiskResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the storage settings for the virtual machine disks.
 * 
 */
public final class StorageProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageProfileResponse Empty = new StorageProfileResponse();

    /**
     * Specifies the parameters that are used to add a data disk to a virtual machine. <br><br> For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     */
    @InputImport(name="dataDisks")
        private final @Nullable List<DataDiskResponse> dataDisks;

    public List<DataDiskResponse> getDataDisks() {
        return this.dataDisks == null ? List.of() : this.dataDisks;
    }

    /**
     * Specifies information about the image to use. You can specify information about platform images, marketplace images, or virtual machine images. This element is required when you want to use a platform image, marketplace image, or virtual machine image, but is not used in other creation operations.
     * 
     */
    @InputImport(name="imageReference")
        private final @Nullable ImageReferenceResponse imageReference;

    public Optional<ImageReferenceResponse> getImageReference() {
        return this.imageReference == null ? Optional.empty() : Optional.ofNullable(this.imageReference);
    }

    /**
     * Specifies information about the operating system disk used by the virtual machine. <br><br> For more information about disks, see [About disks and VHDs for Azure virtual machines](https://docs.microsoft.com/azure/virtual-machines/managed-disks-overview).
     * 
     */
    @InputImport(name="osDisk")
        private final @Nullable OSDiskResponse osDisk;

    public Optional<OSDiskResponse> getOsDisk() {
        return this.osDisk == null ? Optional.empty() : Optional.ofNullable(this.osDisk);
    }

    public StorageProfileResponse(
        @Nullable List<DataDiskResponse> dataDisks,
        @Nullable ImageReferenceResponse imageReference,
        @Nullable OSDiskResponse osDisk) {
        this.dataDisks = dataDisks;
        this.imageReference = imageReference;
        this.osDisk = osDisk;
    }

    private StorageProfileResponse() {
        this.dataDisks = List.of();
        this.imageReference = null;
        this.osDisk = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataDiskResponse> dataDisks;
        private @Nullable ImageReferenceResponse imageReference;
        private @Nullable OSDiskResponse osDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDisks = defaults.dataDisks;
    	      this.imageReference = defaults.imageReference;
    	      this.osDisk = defaults.osDisk;
        }

        public Builder setDataDisks(@Nullable List<DataDiskResponse> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        public Builder setImageReference(@Nullable ImageReferenceResponse imageReference) {
            this.imageReference = imageReference;
            return this;
        }

        public Builder setOsDisk(@Nullable OSDiskResponse osDisk) {
            this.osDisk = osDisk;
            return this;
        }
        public StorageProfileResponse build() {
            return new StorageProfileResponse(dataDisks, imageReference, osDisk);
        }
    }
}
