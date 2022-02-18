// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.StorageAccountTypes;
import io.pulumi.azurenative.compute.inputs.DiskEncryptionSetParametersArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters of a managed disk.
 * 
 */
public final class ManagedDiskParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedDiskParametersArgs Empty = new ManagedDiskParametersArgs();

    /**
     * Specifies the customer managed disk encryption set resource id for the managed disk.
     * 
     */
    @InputImport(name="diskEncryptionSet")
    private final @Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet;

    public Input<DiskEncryptionSetParametersArgs> getDiskEncryptionSet() {
        return this.diskEncryptionSet == null ? Input.empty() : this.diskEncryptionSet;
    }

    /**
     * Resource Id
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Specifies the storage account type for the managed disk. Managed OS disk storage account type can only be set when you create the scale set. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    @InputImport(name="storageAccountType")
    private final @Nullable Input<Either<String,StorageAccountTypes>> storageAccountType;

    public Input<Either<String,StorageAccountTypes>> getStorageAccountType() {
        return this.storageAccountType == null ? Input.empty() : this.storageAccountType;
    }

    public ManagedDiskParametersArgs(
        @Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet,
        @Nullable Input<String> id,
        @Nullable Input<Either<String,StorageAccountTypes>> storageAccountType) {
        this.diskEncryptionSet = diskEncryptionSet;
        this.id = id;
        this.storageAccountType = storageAccountType;
    }

    private ManagedDiskParametersArgs() {
        this.diskEncryptionSet = Input.empty();
        this.id = Input.empty();
        this.storageAccountType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDiskParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet;
        private @Nullable Input<String> id;
        private @Nullable Input<Either<String,StorageAccountTypes>> storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedDiskParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSet = defaults.diskEncryptionSet;
    	      this.id = defaults.id;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder setDiskEncryptionSet(@Nullable Input<DiskEncryptionSetParametersArgs> diskEncryptionSet) {
            this.diskEncryptionSet = diskEncryptionSet;
            return this;
        }

        public Builder setDiskEncryptionSet(@Nullable DiskEncryptionSetParametersArgs diskEncryptionSet) {
            this.diskEncryptionSet = Input.ofNullable(diskEncryptionSet);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setStorageAccountType(@Nullable Input<Either<String,StorageAccountTypes>> storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public Builder setStorageAccountType(@Nullable Either<String,StorageAccountTypes> storageAccountType) {
            this.storageAccountType = Input.ofNullable(storageAccountType);
            return this;
        }

        public ManagedDiskParametersArgs build() {
            return new ManagedDiskParametersArgs(diskEncryptionSet, id, storageAccountType);
        }
    }
}
