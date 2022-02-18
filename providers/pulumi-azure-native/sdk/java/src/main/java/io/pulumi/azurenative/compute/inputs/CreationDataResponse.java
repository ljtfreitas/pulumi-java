// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.ImageDiskReferenceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Data used when creating a disk.
 * 
 */
public final class CreationDataResponse extends io.pulumi.resources.InvokeArgs {

    public static final CreationDataResponse Empty = new CreationDataResponse();

    /**
     * This enumerates the possible sources of a disk's creation.
     * 
     */
    @InputImport(name="createOption", required=true)
    private final String createOption;

    public String getCreateOption() {
        return this.createOption;
    }

    /**
     * Required if creating from a Gallery Image. The id of the ImageDiskReference will be the ARM id of the shared galley image version from which to create a disk.
     * 
     */
    @InputImport(name="galleryImageReference")
    private final @Nullable ImageDiskReferenceResponse galleryImageReference;

    public Optional<ImageDiskReferenceResponse> getGalleryImageReference() {
        return this.galleryImageReference == null ? Optional.empty() : Optional.ofNullable(this.galleryImageReference);
    }

    /**
     * Disk source information.
     * 
     */
    @InputImport(name="imageReference")
    private final @Nullable ImageDiskReferenceResponse imageReference;

    public Optional<ImageDiskReferenceResponse> getImageReference() {
        return this.imageReference == null ? Optional.empty() : Optional.ofNullable(this.imageReference);
    }

    /**
     * Logical sector size in bytes for Ultra disks. Supported values are 512 ad 4096. 4096 is the default.
     * 
     */
    @InputImport(name="logicalSectorSize")
    private final @Nullable Integer logicalSectorSize;

    public Optional<Integer> getLogicalSectorSize() {
        return this.logicalSectorSize == null ? Optional.empty() : Optional.ofNullable(this.logicalSectorSize);
    }

    /**
     * If createOption is Copy, this is the ARM id of the source snapshot or disk.
     * 
     */
    @InputImport(name="sourceResourceId")
    private final @Nullable String sourceResourceId;

    public Optional<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Optional.empty() : Optional.ofNullable(this.sourceResourceId);
    }

    /**
     * If this field is set, this is the unique id identifying the source of this resource.
     * 
     */
    @InputImport(name="sourceUniqueId", required=true)
    private final String sourceUniqueId;

    public String getSourceUniqueId() {
        return this.sourceUniqueId;
    }

    /**
     * If createOption is Import, this is the URI of a blob to be imported into a managed disk.
     * 
     */
    @InputImport(name="sourceUri")
    private final @Nullable String sourceUri;

    public Optional<String> getSourceUri() {
        return this.sourceUri == null ? Optional.empty() : Optional.ofNullable(this.sourceUri);
    }

    /**
     * Required if createOption is Import. The Azure Resource Manager identifier of the storage account containing the blob to import as a disk.
     * 
     */
    @InputImport(name="storageAccountId")
    private final @Nullable String storageAccountId;

    public Optional<String> getStorageAccountId() {
        return this.storageAccountId == null ? Optional.empty() : Optional.ofNullable(this.storageAccountId);
    }

    /**
     * If createOption is Upload, this is the size of the contents of the upload including the VHD footer. This value should be between 20972032 (20 MiB + 512 bytes for the VHD footer) and 35183298347520 bytes (32 TiB + 512 bytes for the VHD footer).
     * 
     */
    @InputImport(name="uploadSizeBytes")
    private final @Nullable Double uploadSizeBytes;

    public Optional<Double> getUploadSizeBytes() {
        return this.uploadSizeBytes == null ? Optional.empty() : Optional.ofNullable(this.uploadSizeBytes);
    }

    public CreationDataResponse(
        String createOption,
        @Nullable ImageDiskReferenceResponse galleryImageReference,
        @Nullable ImageDiskReferenceResponse imageReference,
        @Nullable Integer logicalSectorSize,
        @Nullable String sourceResourceId,
        String sourceUniqueId,
        @Nullable String sourceUri,
        @Nullable String storageAccountId,
        @Nullable Double uploadSizeBytes) {
        this.createOption = Objects.requireNonNull(createOption, "expected parameter 'createOption' to be non-null");
        this.galleryImageReference = galleryImageReference;
        this.imageReference = imageReference;
        this.logicalSectorSize = logicalSectorSize;
        this.sourceResourceId = sourceResourceId;
        this.sourceUniqueId = Objects.requireNonNull(sourceUniqueId, "expected parameter 'sourceUniqueId' to be non-null");
        this.sourceUri = sourceUri;
        this.storageAccountId = storageAccountId;
        this.uploadSizeBytes = uploadSizeBytes;
    }

    private CreationDataResponse() {
        this.createOption = null;
        this.galleryImageReference = null;
        this.imageReference = null;
        this.logicalSectorSize = null;
        this.sourceResourceId = null;
        this.sourceUniqueId = null;
        this.sourceUri = null;
        this.storageAccountId = null;
        this.uploadSizeBytes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreationDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createOption;
        private @Nullable ImageDiskReferenceResponse galleryImageReference;
        private @Nullable ImageDiskReferenceResponse imageReference;
        private @Nullable Integer logicalSectorSize;
        private @Nullable String sourceResourceId;
        private String sourceUniqueId;
        private @Nullable String sourceUri;
        private @Nullable String storageAccountId;
        private @Nullable Double uploadSizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(CreationDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createOption = defaults.createOption;
    	      this.galleryImageReference = defaults.galleryImageReference;
    	      this.imageReference = defaults.imageReference;
    	      this.logicalSectorSize = defaults.logicalSectorSize;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.sourceUniqueId = defaults.sourceUniqueId;
    	      this.sourceUri = defaults.sourceUri;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.uploadSizeBytes = defaults.uploadSizeBytes;
        }

        public Builder setCreateOption(String createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }

        public Builder setGalleryImageReference(@Nullable ImageDiskReferenceResponse galleryImageReference) {
            this.galleryImageReference = galleryImageReference;
            return this;
        }

        public Builder setImageReference(@Nullable ImageDiskReferenceResponse imageReference) {
            this.imageReference = imageReference;
            return this;
        }

        public Builder setLogicalSectorSize(@Nullable Integer logicalSectorSize) {
            this.logicalSectorSize = logicalSectorSize;
            return this;
        }

        public Builder setSourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder setSourceUniqueId(String sourceUniqueId) {
            this.sourceUniqueId = Objects.requireNonNull(sourceUniqueId);
            return this;
        }

        public Builder setSourceUri(@Nullable String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }

        public Builder setStorageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }

        public Builder setUploadSizeBytes(@Nullable Double uploadSizeBytes) {
            this.uploadSizeBytes = uploadSizeBytes;
            return this;
        }

        public CreationDataResponse build() {
            return new CreationDataResponse(createOption, galleryImageReference, imageReference, logicalSectorSize, sourceResourceId, sourceUniqueId, sourceUri, storageAccountId, uploadSizeBytes);
        }
    }
}
