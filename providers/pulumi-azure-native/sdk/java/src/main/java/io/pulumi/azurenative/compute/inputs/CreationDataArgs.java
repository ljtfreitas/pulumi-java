// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.DiskCreateOption;
import io.pulumi.azurenative.compute.inputs.ImageDiskReferenceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Data used when creating a disk.
 * 
 */
public final class CreationDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreationDataArgs Empty = new CreationDataArgs();

    /**
     * This enumerates the possible sources of a disk's creation.
     * 
     */
    @InputImport(name="createOption", required=true)
    private final Input<Either<String,DiskCreateOption>> createOption;

    public Input<Either<String,DiskCreateOption>> getCreateOption() {
        return this.createOption;
    }

    /**
     * Required if creating from a Gallery Image. The id of the ImageDiskReference will be the ARM id of the shared galley image version from which to create a disk.
     * 
     */
    @InputImport(name="galleryImageReference")
    private final @Nullable Input<ImageDiskReferenceArgs> galleryImageReference;

    public Input<ImageDiskReferenceArgs> getGalleryImageReference() {
        return this.galleryImageReference == null ? Input.empty() : this.galleryImageReference;
    }

    /**
     * Disk source information.
     * 
     */
    @InputImport(name="imageReference")
    private final @Nullable Input<ImageDiskReferenceArgs> imageReference;

    public Input<ImageDiskReferenceArgs> getImageReference() {
        return this.imageReference == null ? Input.empty() : this.imageReference;
    }

    /**
     * Logical sector size in bytes for Ultra disks. Supported values are 512 ad 4096. 4096 is the default.
     * 
     */
    @InputImport(name="logicalSectorSize")
    private final @Nullable Input<Integer> logicalSectorSize;

    public Input<Integer> getLogicalSectorSize() {
        return this.logicalSectorSize == null ? Input.empty() : this.logicalSectorSize;
    }

    /**
     * If createOption is Copy, this is the ARM id of the source snapshot or disk.
     * 
     */
    @InputImport(name="sourceResourceId")
    private final @Nullable Input<String> sourceResourceId;

    public Input<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Input.empty() : this.sourceResourceId;
    }

    /**
     * If createOption is Import, this is the URI of a blob to be imported into a managed disk.
     * 
     */
    @InputImport(name="sourceUri")
    private final @Nullable Input<String> sourceUri;

    public Input<String> getSourceUri() {
        return this.sourceUri == null ? Input.empty() : this.sourceUri;
    }

    /**
     * Required if createOption is Import. The Azure Resource Manager identifier of the storage account containing the blob to import as a disk.
     * 
     */
    @InputImport(name="storageAccountId")
    private final @Nullable Input<String> storageAccountId;

    public Input<String> getStorageAccountId() {
        return this.storageAccountId == null ? Input.empty() : this.storageAccountId;
    }

    /**
     * If createOption is Upload, this is the size of the contents of the upload including the VHD footer. This value should be between 20972032 (20 MiB + 512 bytes for the VHD footer) and 35183298347520 bytes (32 TiB + 512 bytes for the VHD footer).
     * 
     */
    @InputImport(name="uploadSizeBytes")
    private final @Nullable Input<Double> uploadSizeBytes;

    public Input<Double> getUploadSizeBytes() {
        return this.uploadSizeBytes == null ? Input.empty() : this.uploadSizeBytes;
    }

    public CreationDataArgs(
        Input<Either<String,DiskCreateOption>> createOption,
        @Nullable Input<ImageDiskReferenceArgs> galleryImageReference,
        @Nullable Input<ImageDiskReferenceArgs> imageReference,
        @Nullable Input<Integer> logicalSectorSize,
        @Nullable Input<String> sourceResourceId,
        @Nullable Input<String> sourceUri,
        @Nullable Input<String> storageAccountId,
        @Nullable Input<Double> uploadSizeBytes) {
        this.createOption = Objects.requireNonNull(createOption, "expected parameter 'createOption' to be non-null");
        this.galleryImageReference = galleryImageReference;
        this.imageReference = imageReference;
        this.logicalSectorSize = logicalSectorSize;
        this.sourceResourceId = sourceResourceId;
        this.sourceUri = sourceUri;
        this.storageAccountId = storageAccountId;
        this.uploadSizeBytes = uploadSizeBytes;
    }

    private CreationDataArgs() {
        this.createOption = Input.empty();
        this.galleryImageReference = Input.empty();
        this.imageReference = Input.empty();
        this.logicalSectorSize = Input.empty();
        this.sourceResourceId = Input.empty();
        this.sourceUri = Input.empty();
        this.storageAccountId = Input.empty();
        this.uploadSizeBytes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreationDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,DiskCreateOption>> createOption;
        private @Nullable Input<ImageDiskReferenceArgs> galleryImageReference;
        private @Nullable Input<ImageDiskReferenceArgs> imageReference;
        private @Nullable Input<Integer> logicalSectorSize;
        private @Nullable Input<String> sourceResourceId;
        private @Nullable Input<String> sourceUri;
        private @Nullable Input<String> storageAccountId;
        private @Nullable Input<Double> uploadSizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(CreationDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createOption = defaults.createOption;
    	      this.galleryImageReference = defaults.galleryImageReference;
    	      this.imageReference = defaults.imageReference;
    	      this.logicalSectorSize = defaults.logicalSectorSize;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.sourceUri = defaults.sourceUri;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.uploadSizeBytes = defaults.uploadSizeBytes;
        }

        public Builder setCreateOption(Input<Either<String,DiskCreateOption>> createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }

        public Builder setCreateOption(Either<String,DiskCreateOption> createOption) {
            this.createOption = Input.of(Objects.requireNonNull(createOption));
            return this;
        }

        public Builder setGalleryImageReference(@Nullable Input<ImageDiskReferenceArgs> galleryImageReference) {
            this.galleryImageReference = galleryImageReference;
            return this;
        }

        public Builder setGalleryImageReference(@Nullable ImageDiskReferenceArgs galleryImageReference) {
            this.galleryImageReference = Input.ofNullable(galleryImageReference);
            return this;
        }

        public Builder setImageReference(@Nullable Input<ImageDiskReferenceArgs> imageReference) {
            this.imageReference = imageReference;
            return this;
        }

        public Builder setImageReference(@Nullable ImageDiskReferenceArgs imageReference) {
            this.imageReference = Input.ofNullable(imageReference);
            return this;
        }

        public Builder setLogicalSectorSize(@Nullable Input<Integer> logicalSectorSize) {
            this.logicalSectorSize = logicalSectorSize;
            return this;
        }

        public Builder setLogicalSectorSize(@Nullable Integer logicalSectorSize) {
            this.logicalSectorSize = Input.ofNullable(logicalSectorSize);
            return this;
        }

        public Builder setSourceResourceId(@Nullable Input<String> sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder setSourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = Input.ofNullable(sourceResourceId);
            return this;
        }

        public Builder setSourceUri(@Nullable Input<String> sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }

        public Builder setSourceUri(@Nullable String sourceUri) {
            this.sourceUri = Input.ofNullable(sourceUri);
            return this;
        }

        public Builder setStorageAccountId(@Nullable Input<String> storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }

        public Builder setStorageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = Input.ofNullable(storageAccountId);
            return this;
        }

        public Builder setUploadSizeBytes(@Nullable Input<Double> uploadSizeBytes) {
            this.uploadSizeBytes = uploadSizeBytes;
            return this;
        }

        public Builder setUploadSizeBytes(@Nullable Double uploadSizeBytes) {
            this.uploadSizeBytes = Input.ofNullable(uploadSizeBytes);
            return this;
        }

        public CreationDataArgs build() {
            return new CreationDataArgs(createOption, galleryImageReference, imageReference, logicalSectorSize, sourceResourceId, sourceUri, storageAccountId, uploadSizeBytes);
        }
    }
}
