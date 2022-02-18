// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.ApiEntityReferenceResponse;
import io.pulumi.azurenative.compute.outputs.DiskEncryptionSettingsResponse;
import io.pulumi.azurenative.compute.outputs.ManagedDiskParametersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RestorePointSourceVMOSDiskResponse {
    /**
     * Gets the caching type.
     * 
     */
    private final @Nullable String caching;
    /**
     * Gets the disk restore point Id.
     * 
     */
    private final @Nullable ApiEntityReferenceResponse diskRestorePoint;
    /**
     * Gets the disk size in GB.
     * 
     */
    private final @Nullable Integer diskSizeGB;
    /**
     * Gets the disk encryption settings.
     * 
     */
    private final @Nullable DiskEncryptionSettingsResponse encryptionSettings;
    /**
     * Gets the managed disk details
     * 
     */
    private final @Nullable ManagedDiskParametersResponse managedDisk;
    /**
     * Gets the disk name.
     * 
     */
    private final @Nullable String name;
    /**
     * Gets the Operating System type.
     * 
     */
    private final @Nullable String osType;

    @OutputCustomType.Constructor({"caching","diskRestorePoint","diskSizeGB","encryptionSettings","managedDisk","name","osType"})
    private RestorePointSourceVMOSDiskResponse(
        @Nullable String caching,
        @Nullable ApiEntityReferenceResponse diskRestorePoint,
        @Nullable Integer diskSizeGB,
        @Nullable DiskEncryptionSettingsResponse encryptionSettings,
        @Nullable ManagedDiskParametersResponse managedDisk,
        @Nullable String name,
        @Nullable String osType) {
        this.caching = caching;
        this.diskRestorePoint = diskRestorePoint;
        this.diskSizeGB = diskSizeGB;
        this.encryptionSettings = encryptionSettings;
        this.managedDisk = managedDisk;
        this.name = name;
        this.osType = osType;
    }

    /**
     * Gets the caching type.
     * 
     */
    public Optional<String> getCaching() {
        return Optional.ofNullable(this.caching);
    }
    /**
     * Gets the disk restore point Id.
     * 
     */
    public Optional<ApiEntityReferenceResponse> getDiskRestorePoint() {
        return Optional.ofNullable(this.diskRestorePoint);
    }
    /**
     * Gets the disk size in GB.
     * 
     */
    public Optional<Integer> getDiskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    /**
     * Gets the disk encryption settings.
     * 
     */
    public Optional<DiskEncryptionSettingsResponse> getEncryptionSettings() {
        return Optional.ofNullable(this.encryptionSettings);
    }
    /**
     * Gets the managed disk details
     * 
     */
    public Optional<ManagedDiskParametersResponse> getManagedDisk() {
        return Optional.ofNullable(this.managedDisk);
    }
    /**
     * Gets the disk name.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Gets the Operating System type.
     * 
     */
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointSourceVMOSDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caching;
        private @Nullable ApiEntityReferenceResponse diskRestorePoint;
        private @Nullable Integer diskSizeGB;
        private @Nullable DiskEncryptionSettingsResponse encryptionSettings;
        private @Nullable ManagedDiskParametersResponse managedDisk;
        private @Nullable String name;
        private @Nullable String osType;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointSourceVMOSDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.diskRestorePoint = defaults.diskRestorePoint;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.encryptionSettings = defaults.encryptionSettings;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
        }

        public Builder setCaching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }

        public Builder setDiskRestorePoint(@Nullable ApiEntityReferenceResponse diskRestorePoint) {
            this.diskRestorePoint = diskRestorePoint;
            return this;
        }

        public Builder setDiskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder setEncryptionSettings(@Nullable DiskEncryptionSettingsResponse encryptionSettings) {
            this.encryptionSettings = encryptionSettings;
            return this;
        }

        public Builder setManagedDisk(@Nullable ManagedDiskParametersResponse managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOsType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public RestorePointSourceVMOSDiskResponse build() {
            return new RestorePointSourceVMOSDiskResponse(caching, diskRestorePoint, diskSizeGB, encryptionSettings, managedDisk, name, osType);
        }
    }
}
