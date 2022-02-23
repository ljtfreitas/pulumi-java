// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FCVolumeSource {
    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    private final @Nullable String fsType;
    /**
     * Optional: FC target lun number
     * 
     */
    private final @Nullable Integer lun;
    /**
     * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * Optional: FC target worldwide names (WWNs)
     * 
     */
    private final @Nullable List<String> targetWWNs;
    /**
     * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
     * 
     */
    private final @Nullable List<String> wwids;

    @OutputCustomType.Constructor({"fsType","lun","readOnly","targetWWNs","wwids"})
    private FCVolumeSource(
        @Nullable String fsType,
        @Nullable Integer lun,
        @Nullable Boolean readOnly,
        @Nullable List<String> targetWWNs,
        @Nullable List<String> wwids) {
        this.fsType = fsType;
        this.lun = lun;
        this.readOnly = readOnly;
        this.targetWWNs = targetWWNs;
        this.wwids = wwids;
    }

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    public Optional<String> getFsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * Optional: FC target lun number
     * 
     */
    public Optional<Integer> getLun() {
        return Optional.ofNullable(this.lun);
    }
    /**
     * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * Optional: FC target worldwide names (WWNs)
     * 
     */
    public List<String> getTargetWWNs() {
        return this.targetWWNs == null ? List.of() : this.targetWWNs;
    }
    /**
     * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
     * 
     */
    public List<String> getWwids() {
        return this.wwids == null ? List.of() : this.wwids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FCVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fsType;
        private @Nullable Integer lun;
        private @Nullable Boolean readOnly;
        private @Nullable List<String> targetWWNs;
        private @Nullable List<String> wwids;

        public Builder() {
    	      // Empty
        }

        public Builder(FCVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.lun = defaults.lun;
    	      this.readOnly = defaults.readOnly;
    	      this.targetWWNs = defaults.targetWWNs;
    	      this.wwids = defaults.wwids;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setLun(@Nullable Integer lun) {
            this.lun = lun;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setTargetWWNs(@Nullable List<String> targetWWNs) {
            this.targetWWNs = targetWWNs;
            return this;
        }

        public Builder setWwids(@Nullable List<String> wwids) {
            this.wwids = wwids;
            return this;
        }
        public FCVolumeSource build() {
            return new FCVolumeSource(fsType, lun, readOnly, targetWWNs, wwids);
        }
    }
}
