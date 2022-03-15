// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LocalVolumeSource {
    /**
     * Filesystem type to mount. It applies only when the Path is a block device. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default value is to auto-select a filesystem if unspecified.
     * 
     */
    private final @Nullable String fsType;
    /**
     * The full path to the volume on the node. It can be either a directory or block device (disk, partition, ...).
     * 
     */
    private final String path;

    @CustomType.Constructor
    private LocalVolumeSource(
        @CustomType.Parameter("fsType") @Nullable String fsType,
        @CustomType.Parameter("path") String path) {
        this.fsType = fsType;
        this.path = path;
    }

    /**
     * Filesystem type to mount. It applies only when the Path is a block device. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". The default value is to auto-select a filesystem if unspecified.
     * 
    */
    public Optional<String> getFsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * The full path to the volume on the node. It can be either a directory or block device (disk, partition, ...).
     * 
    */
    public String getPath() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fsType;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.path = defaults.path;
        }

        public Builder fsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public LocalVolumeSource build() {
            return new LocalVolumeSource(fsType, path);
        }
    }
}
