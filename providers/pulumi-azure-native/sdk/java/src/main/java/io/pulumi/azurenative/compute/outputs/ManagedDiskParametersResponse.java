// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.DiskEncryptionSetParametersResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedDiskParametersResponse {
    /**
     * Specifies the customer managed disk encryption set resource id for the managed disk.
     * 
     */
    private final @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;
    /**
     * Resource Id
     * 
     */
    private final @Nullable String id;
    /**
     * Specifies the storage account type for the managed disk. Managed OS disk storage account type can only be set when you create the scale set. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    private final @Nullable String storageAccountType;

    @CustomType.Constructor
    private ManagedDiskParametersResponse(
        @CustomType.Parameter("diskEncryptionSet") @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("storageAccountType") @Nullable String storageAccountType) {
        this.diskEncryptionSet = diskEncryptionSet;
        this.id = id;
        this.storageAccountType = storageAccountType;
    }

    /**
     * Specifies the customer managed disk encryption set resource id for the managed disk.
     * 
    */
    public Optional<DiskEncryptionSetParametersResponse> getDiskEncryptionSet() {
        return Optional.ofNullable(this.diskEncryptionSet);
    }
    /**
     * Resource Id
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Specifies the storage account type for the managed disk. Managed OS disk storage account type can only be set when you create the scale set. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
    */
    public Optional<String> getStorageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDiskParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;
        private @Nullable String id;
        private @Nullable String storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedDiskParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSet = defaults.diskEncryptionSet;
    	      this.id = defaults.id;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder diskEncryptionSet(@Nullable DiskEncryptionSetParametersResponse diskEncryptionSet) {
            this.diskEncryptionSet = diskEncryptionSet;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder storageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }
        public ManagedDiskParametersResponse build() {
            return new ManagedDiskParametersResponse(diskEncryptionSet, id, storageAccountType);
        }
    }
}
