// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.DiskEncryptionSetParametersResponse;
import io.pulumi.azurenative.compute.inputs.SubResourceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an Operating System disk.
 * 
 */
public final class ImageOSDiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageOSDiskResponse Empty = new ImageOSDiskResponse();

    /**
     * The Virtual Hard Disk.
     * 
     */
    @InputImport(name="blobUri")
        private final @Nullable String blobUri;

    public Optional<String> getBlobUri() {
        return this.blobUri == null ? Optional.empty() : Optional.ofNullable(this.blobUri);
    }

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
     * Specifies the customer managed disk encryption set resource id for the managed image disk.
     * 
     */
    @InputImport(name="diskEncryptionSet")
        private final @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;

    public Optional<DiskEncryptionSetParametersResponse> getDiskEncryptionSet() {
        return this.diskEncryptionSet == null ? Optional.empty() : Optional.ofNullable(this.diskEncryptionSet);
    }

    /**
     * Specifies the size of empty data disks in gigabytes. This element can be used to overwrite the name of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
     */
    @InputImport(name="diskSizeGB")
        private final @Nullable Integer diskSizeGB;

    public Optional<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Optional.empty() : Optional.ofNullable(this.diskSizeGB);
    }

    /**
     * The managedDisk.
     * 
     */
    @InputImport(name="managedDisk")
        private final @Nullable SubResourceResponse managedDisk;

    public Optional<SubResourceResponse> getManagedDisk() {
        return this.managedDisk == null ? Optional.empty() : Optional.ofNullable(this.managedDisk);
    }

    /**
     * The OS State.
     * 
     */
    @InputImport(name="osState", required=true)
        private final String osState;

    public String getOsState() {
        return this.osState;
    }

    /**
     * This property allows you to specify the type of the OS that is included in the disk if creating a VM from a custom image. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     * 
     */
    @InputImport(name="osType", required=true)
        private final String osType;

    public String getOsType() {
        return this.osType;
    }

    /**
     * The snapshot.
     * 
     */
    @InputImport(name="snapshot")
        private final @Nullable SubResourceResponse snapshot;

    public Optional<SubResourceResponse> getSnapshot() {
        return this.snapshot == null ? Optional.empty() : Optional.ofNullable(this.snapshot);
    }

    /**
     * Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    @InputImport(name="storageAccountType")
        private final @Nullable String storageAccountType;

    public Optional<String> getStorageAccountType() {
        return this.storageAccountType == null ? Optional.empty() : Optional.ofNullable(this.storageAccountType);
    }

    public ImageOSDiskResponse(
        @Nullable String blobUri,
        @Nullable String caching,
        @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet,
        @Nullable Integer diskSizeGB,
        @Nullable SubResourceResponse managedDisk,
        String osState,
        String osType,
        @Nullable SubResourceResponse snapshot,
        @Nullable String storageAccountType) {
        this.blobUri = blobUri;
        this.caching = caching;
        this.diskEncryptionSet = diskEncryptionSet;
        this.diskSizeGB = diskSizeGB;
        this.managedDisk = managedDisk;
        this.osState = Objects.requireNonNull(osState, "expected parameter 'osState' to be non-null");
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
        this.snapshot = snapshot;
        this.storageAccountType = storageAccountType;
    }

    private ImageOSDiskResponse() {
        this.blobUri = null;
        this.caching = null;
        this.diskEncryptionSet = null;
        this.diskSizeGB = null;
        this.managedDisk = null;
        this.osState = null;
        this.osType = null;
        this.snapshot = null;
        this.storageAccountType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageOSDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blobUri;
        private @Nullable String caching;
        private @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;
        private @Nullable Integer diskSizeGB;
        private @Nullable SubResourceResponse managedDisk;
        private String osState;
        private String osType;
        private @Nullable SubResourceResponse snapshot;
        private @Nullable String storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageOSDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobUri = defaults.blobUri;
    	      this.caching = defaults.caching;
    	      this.diskEncryptionSet = defaults.diskEncryptionSet;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.managedDisk = defaults.managedDisk;
    	      this.osState = defaults.osState;
    	      this.osType = defaults.osType;
    	      this.snapshot = defaults.snapshot;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder setBlobUri(@Nullable String blobUri) {
            this.blobUri = blobUri;
            return this;
        }

        public Builder setCaching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }

        public Builder setDiskEncryptionSet(@Nullable DiskEncryptionSetParametersResponse diskEncryptionSet) {
            this.diskEncryptionSet = diskEncryptionSet;
            return this;
        }

        public Builder setDiskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder setManagedDisk(@Nullable SubResourceResponse managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }

        public Builder setOsState(String osState) {
            this.osState = Objects.requireNonNull(osState);
            return this;
        }

        public Builder setOsType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder setSnapshot(@Nullable SubResourceResponse snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public Builder setStorageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }
        public ImageOSDiskResponse build() {
            return new ImageOSDiskResponse(blobUri, caching, diskEncryptionSet, diskSizeGB, managedDisk, osState, osType, snapshot, storageAccountType);
        }
    }
}
