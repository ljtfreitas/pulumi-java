// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a vSphere volume resource.
 * 
 */
public final class VsphereVirtualDiskVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final VsphereVirtualDiskVolumeSourceArgs Empty = new VsphereVirtualDiskVolumeSourceArgs();

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @InputImport(name="fsType")
        private final @Nullable Input<String> fsType;

    public Input<String> getFsType() {
        return this.fsType == null ? Input.empty() : this.fsType;
    }

    /**
     * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
     * 
     */
    @InputImport(name="storagePolicyID")
        private final @Nullable Input<String> storagePolicyID;

    public Input<String> getStoragePolicyID() {
        return this.storagePolicyID == null ? Input.empty() : this.storagePolicyID;
    }

    /**
     * Storage Policy Based Management (SPBM) profile name.
     * 
     */
    @InputImport(name="storagePolicyName")
        private final @Nullable Input<String> storagePolicyName;

    public Input<String> getStoragePolicyName() {
        return this.storagePolicyName == null ? Input.empty() : this.storagePolicyName;
    }

    /**
     * Path that identifies vSphere volume vmdk
     * 
     */
    @InputImport(name="volumePath", required=true)
        private final Input<String> volumePath;

    public Input<String> getVolumePath() {
        return this.volumePath;
    }

    public VsphereVirtualDiskVolumeSourceArgs(
        @Nullable Input<String> fsType,
        @Nullable Input<String> storagePolicyID,
        @Nullable Input<String> storagePolicyName,
        Input<String> volumePath) {
        this.fsType = fsType;
        this.storagePolicyID = storagePolicyID;
        this.storagePolicyName = storagePolicyName;
        this.volumePath = Objects.requireNonNull(volumePath, "expected parameter 'volumePath' to be non-null");
    }

    private VsphereVirtualDiskVolumeSourceArgs() {
        this.fsType = Input.empty();
        this.storagePolicyID = Input.empty();
        this.storagePolicyName = Input.empty();
        this.volumePath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VsphereVirtualDiskVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fsType;
        private @Nullable Input<String> storagePolicyID;
        private @Nullable Input<String> storagePolicyName;
        private Input<String> volumePath;

        public Builder() {
    	      // Empty
        }

        public Builder(VsphereVirtualDiskVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.storagePolicyID = defaults.storagePolicyID;
    	      this.storagePolicyName = defaults.storagePolicyName;
    	      this.volumePath = defaults.volumePath;
        }

        public Builder setFsType(@Nullable Input<String> fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = Input.ofNullable(fsType);
            return this;
        }

        public Builder setStoragePolicyID(@Nullable Input<String> storagePolicyID) {
            this.storagePolicyID = storagePolicyID;
            return this;
        }

        public Builder setStoragePolicyID(@Nullable String storagePolicyID) {
            this.storagePolicyID = Input.ofNullable(storagePolicyID);
            return this;
        }

        public Builder setStoragePolicyName(@Nullable Input<String> storagePolicyName) {
            this.storagePolicyName = storagePolicyName;
            return this;
        }

        public Builder setStoragePolicyName(@Nullable String storagePolicyName) {
            this.storagePolicyName = Input.ofNullable(storagePolicyName);
            return this;
        }

        public Builder setVolumePath(Input<String> volumePath) {
            this.volumePath = Objects.requireNonNull(volumePath);
            return this;
        }

        public Builder setVolumePath(String volumePath) {
            this.volumePath = Input.of(Objects.requireNonNull(volumePath));
            return this;
        }
        public VsphereVirtualDiskVolumeSourceArgs build() {
            return new VsphereVirtualDiskVolumeSourceArgs(fsType, storagePolicyID, storagePolicyName, volumePath);
        }
    }
}
