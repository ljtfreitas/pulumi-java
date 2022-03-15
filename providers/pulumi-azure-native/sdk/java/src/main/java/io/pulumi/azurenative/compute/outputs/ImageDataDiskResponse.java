// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.DiskEncryptionSetParametersResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImageDataDiskResponse {
    /**
     * The Virtual Hard Disk.
     * 
     */
    private final @Nullable String blobUri;
    /**
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br> Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    private final @Nullable String caching;
    /**
     * Specifies the customer managed disk encryption set resource id for the managed image disk.
     * 
     */
    private final @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;
    /**
     * Specifies the size of empty data disks in gigabytes. This element can be used to overwrite the name of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
     */
    private final @Nullable Integer diskSizeGB;
    /**
     * Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     * 
     */
    private final Integer lun;
    /**
     * The managedDisk.
     * 
     */
    private final @Nullable SubResourceResponse managedDisk;
    /**
     * The snapshot.
     * 
     */
    private final @Nullable SubResourceResponse snapshot;
    /**
     * Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    private final @Nullable String storageAccountType;

    @CustomType.Constructor
    private ImageDataDiskResponse(
        @CustomType.Parameter("blobUri") @Nullable String blobUri,
        @CustomType.Parameter("caching") @Nullable String caching,
        @CustomType.Parameter("diskEncryptionSet") @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet,
        @CustomType.Parameter("diskSizeGB") @Nullable Integer diskSizeGB,
        @CustomType.Parameter("lun") Integer lun,
        @CustomType.Parameter("managedDisk") @Nullable SubResourceResponse managedDisk,
        @CustomType.Parameter("snapshot") @Nullable SubResourceResponse snapshot,
        @CustomType.Parameter("storageAccountType") @Nullable String storageAccountType) {
        this.blobUri = blobUri;
        this.caching = caching;
        this.diskEncryptionSet = diskEncryptionSet;
        this.diskSizeGB = diskSizeGB;
        this.lun = lun;
        this.managedDisk = managedDisk;
        this.snapshot = snapshot;
        this.storageAccountType = storageAccountType;
    }

    /**
     * The Virtual Hard Disk.
     * 
    */
    public Optional<String> getBlobUri() {
        return Optional.ofNullable(this.blobUri);
    }
    /**
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br> Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
    */
    public Optional<String> getCaching() {
        return Optional.ofNullable(this.caching);
    }
    /**
     * Specifies the customer managed disk encryption set resource id for the managed image disk.
     * 
    */
    public Optional<DiskEncryptionSetParametersResponse> getDiskEncryptionSet() {
        return Optional.ofNullable(this.diskEncryptionSet);
    }
    /**
     * Specifies the size of empty data disks in gigabytes. This element can be used to overwrite the name of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
    */
    public Optional<Integer> getDiskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    /**
     * Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     * 
    */
    public Integer getLun() {
        return this.lun;
    }
    /**
     * The managedDisk.
     * 
    */
    public Optional<SubResourceResponse> getManagedDisk() {
        return Optional.ofNullable(this.managedDisk);
    }
    /**
     * The snapshot.
     * 
    */
    public Optional<SubResourceResponse> getSnapshot() {
        return Optional.ofNullable(this.snapshot);
    }
    /**
     * Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
    */
    public Optional<String> getStorageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageDataDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blobUri;
        private @Nullable String caching;
        private @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;
        private @Nullable Integer diskSizeGB;
        private Integer lun;
        private @Nullable SubResourceResponse managedDisk;
        private @Nullable SubResourceResponse snapshot;
        private @Nullable String storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageDataDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobUri = defaults.blobUri;
    	      this.caching = defaults.caching;
    	      this.diskEncryptionSet = defaults.diskEncryptionSet;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.lun = defaults.lun;
    	      this.managedDisk = defaults.managedDisk;
    	      this.snapshot = defaults.snapshot;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder blobUri(@Nullable String blobUri) {
            this.blobUri = blobUri;
            return this;
        }

        public Builder caching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }

        public Builder diskEncryptionSet(@Nullable DiskEncryptionSetParametersResponse diskEncryptionSet) {
            this.diskEncryptionSet = diskEncryptionSet;
            return this;
        }

        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder lun(Integer lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }

        public Builder managedDisk(@Nullable SubResourceResponse managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }

        public Builder snapshot(@Nullable SubResourceResponse snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public Builder storageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }
        public ImageDataDiskResponse build() {
            return new ImageDataDiskResponse(blobUri, caching, diskEncryptionSet, diskSizeGB, lun, managedDisk, snapshot, storageAccountType);
        }
    }
}
