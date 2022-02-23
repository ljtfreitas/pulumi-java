// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.RestorePointSourceVMDataDiskResponse;
import io.pulumi.azurenative.compute.inputs.RestorePointSourceVMOSDiskResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the storage profile.
 * 
 */
public final class RestorePointSourceVMStorageProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestorePointSourceVMStorageProfileResponse Empty = new RestorePointSourceVMStorageProfileResponse();

    /**
     * Gets the data disks of the VM captured at the time of the restore point creation.
     * 
     */
    @InputImport(name="dataDisks")
        private final @Nullable List<RestorePointSourceVMDataDiskResponse> dataDisks;

    public List<RestorePointSourceVMDataDiskResponse> getDataDisks() {
        return this.dataDisks == null ? List.of() : this.dataDisks;
    }

    /**
     * Gets the OS disk of the VM captured at the time of the restore point creation.
     * 
     */
    @InputImport(name="osDisk")
        private final @Nullable RestorePointSourceVMOSDiskResponse osDisk;

    public Optional<RestorePointSourceVMOSDiskResponse> getOsDisk() {
        return this.osDisk == null ? Optional.empty() : Optional.ofNullable(this.osDisk);
    }

    public RestorePointSourceVMStorageProfileResponse(
        @Nullable List<RestorePointSourceVMDataDiskResponse> dataDisks,
        @Nullable RestorePointSourceVMOSDiskResponse osDisk) {
        this.dataDisks = dataDisks;
        this.osDisk = osDisk;
    }

    private RestorePointSourceVMStorageProfileResponse() {
        this.dataDisks = List.of();
        this.osDisk = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointSourceVMStorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RestorePointSourceVMDataDiskResponse> dataDisks;
        private @Nullable RestorePointSourceVMOSDiskResponse osDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointSourceVMStorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDisks = defaults.dataDisks;
    	      this.osDisk = defaults.osDisk;
        }

        public Builder setDataDisks(@Nullable List<RestorePointSourceVMDataDiskResponse> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        public Builder setOsDisk(@Nullable RestorePointSourceVMOSDiskResponse osDisk) {
            this.osDisk = osDisk;
            return this;
        }
        public RestorePointSourceVMStorageProfileResponse build() {
            return new RestorePointSourceVMStorageProfileResponse(dataDisks, osDisk);
        }
    }
}
