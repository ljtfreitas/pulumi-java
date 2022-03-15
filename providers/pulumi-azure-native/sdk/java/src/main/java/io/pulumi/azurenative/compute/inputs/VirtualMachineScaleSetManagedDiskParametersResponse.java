// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.DiskEncryptionSetParametersResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the parameters of a ScaleSet managed disk.
 * 
 */
public final class VirtualMachineScaleSetManagedDiskParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetManagedDiskParametersResponse Empty = new VirtualMachineScaleSetManagedDiskParametersResponse();

    /**
     * Specifies the customer managed disk encryption set resource id for the managed disk.
     * 
     */
    @Import(name="diskEncryptionSet")
      private final @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;

    public Optional<DiskEncryptionSetParametersResponse> getDiskEncryptionSet() {
        return this.diskEncryptionSet == null ? Optional.empty() : Optional.ofNullable(this.diskEncryptionSet);
    }

    /**
     * Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    @Import(name="storageAccountType")
      private final @Nullable String storageAccountType;

    public Optional<String> getStorageAccountType() {
        return this.storageAccountType == null ? Optional.empty() : Optional.ofNullable(this.storageAccountType);
    }

    public VirtualMachineScaleSetManagedDiskParametersResponse(
        @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet,
        @Nullable String storageAccountType) {
        this.diskEncryptionSet = diskEncryptionSet;
        this.storageAccountType = storageAccountType;
    }

    private VirtualMachineScaleSetManagedDiskParametersResponse() {
        this.diskEncryptionSet = null;
        this.storageAccountType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetManagedDiskParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;
        private @Nullable String storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetManagedDiskParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSet = defaults.diskEncryptionSet;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder diskEncryptionSet(@Nullable DiskEncryptionSetParametersResponse diskEncryptionSet) {
            this.diskEncryptionSet = diskEncryptionSet;
            return this;
        }

        public Builder storageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }
        public VirtualMachineScaleSetManagedDiskParametersResponse build() {
            return new VirtualMachineScaleSetManagedDiskParametersResponse(diskEncryptionSet, storageAccountType);
        }
    }
}
