// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.DataDiskImageEncryptionResponse;
import io.pulumi.azurenative.compute.inputs.OSDiskImageEncryptionResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Optional. Allows users to provide customer managed keys for encrypting the OS and data disks in the gallery artifact.
 * 
 */
public final class EncryptionImagesResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionImagesResponse Empty = new EncryptionImagesResponse();

    /**
     * A list of encryption specifications for data disk images.
     * 
     */
    @InputImport(name="dataDiskImages")
        private final @Nullable List<DataDiskImageEncryptionResponse> dataDiskImages;

    public List<DataDiskImageEncryptionResponse> getDataDiskImages() {
        return this.dataDiskImages == null ? List.of() : this.dataDiskImages;
    }

    /**
     * Contains encryption settings for an OS disk image.
     * 
     */
    @InputImport(name="osDiskImage")
        private final @Nullable OSDiskImageEncryptionResponse osDiskImage;

    public Optional<OSDiskImageEncryptionResponse> getOsDiskImage() {
        return this.osDiskImage == null ? Optional.empty() : Optional.ofNullable(this.osDiskImage);
    }

    public EncryptionImagesResponse(
        @Nullable List<DataDiskImageEncryptionResponse> dataDiskImages,
        @Nullable OSDiskImageEncryptionResponse osDiskImage) {
        this.dataDiskImages = dataDiskImages;
        this.osDiskImage = osDiskImage;
    }

    private EncryptionImagesResponse() {
        this.dataDiskImages = List.of();
        this.osDiskImage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionImagesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataDiskImageEncryptionResponse> dataDiskImages;
        private @Nullable OSDiskImageEncryptionResponse osDiskImage;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionImagesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDiskImages = defaults.dataDiskImages;
    	      this.osDiskImage = defaults.osDiskImage;
        }

        public Builder setDataDiskImages(@Nullable List<DataDiskImageEncryptionResponse> dataDiskImages) {
            this.dataDiskImages = dataDiskImages;
            return this;
        }

        public Builder setOsDiskImage(@Nullable OSDiskImageEncryptionResponse osDiskImage) {
            this.osDiskImage = osDiskImage;
            return this;
        }
        public EncryptionImagesResponse build() {
            return new EncryptionImagesResponse(dataDiskImages, osDiskImage);
        }
    }
}
