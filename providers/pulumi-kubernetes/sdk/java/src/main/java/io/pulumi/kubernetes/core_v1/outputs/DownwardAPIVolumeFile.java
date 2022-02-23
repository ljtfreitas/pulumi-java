// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.ObjectFieldSelector;
import io.pulumi.kubernetes.core_v1.outputs.ResourceFieldSelector;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DownwardAPIVolumeFile {
    /**
     * Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
     * 
     */
    private final @Nullable ObjectFieldSelector fieldRef;
    /**
     * Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    private final @Nullable Integer mode;
    /**
     * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
     * 
     */
    private final String path;
    /**
     * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
     * 
     */
    private final @Nullable ResourceFieldSelector resourceFieldRef;

    @OutputCustomType.Constructor({"fieldRef","mode","path","resourceFieldRef"})
    private DownwardAPIVolumeFile(
        @Nullable ObjectFieldSelector fieldRef,
        @Nullable Integer mode,
        String path,
        @Nullable ResourceFieldSelector resourceFieldRef) {
        this.fieldRef = fieldRef;
        this.mode = mode;
        this.path = Objects.requireNonNull(path);
        this.resourceFieldRef = resourceFieldRef;
    }

    /**
     * Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
     * 
     */
    public Optional<ObjectFieldSelector> getFieldRef() {
        return Optional.ofNullable(this.fieldRef);
    }
    /**
     * Optional: mode bits used to set permissions on this file, must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Optional<Integer> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'
     * 
     */
    public String getPath() {
        return this.path;
    }
    /**
     * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
     * 
     */
    public Optional<ResourceFieldSelector> getResourceFieldRef() {
        return Optional.ofNullable(this.resourceFieldRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DownwardAPIVolumeFile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ObjectFieldSelector fieldRef;
        private @Nullable Integer mode;
        private String path;
        private @Nullable ResourceFieldSelector resourceFieldRef;

        public Builder() {
    	      // Empty
        }

        public Builder(DownwardAPIVolumeFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldRef = defaults.fieldRef;
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
    	      this.resourceFieldRef = defaults.resourceFieldRef;
        }

        public Builder setFieldRef(@Nullable ObjectFieldSelector fieldRef) {
            this.fieldRef = fieldRef;
            return this;
        }

        public Builder setMode(@Nullable Integer mode) {
            this.mode = mode;
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setResourceFieldRef(@Nullable ResourceFieldSelector resourceFieldRef) {
            this.resourceFieldRef = resourceFieldRef;
            return this;
        }
        public DownwardAPIVolumeFile build() {
            return new DownwardAPIVolumeFile(fieldRef, mode, path, resourceFieldRef);
        }
    }
}
