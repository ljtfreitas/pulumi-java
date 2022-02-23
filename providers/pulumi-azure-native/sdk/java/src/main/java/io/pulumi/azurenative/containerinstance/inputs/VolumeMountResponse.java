// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of the volume mount.
 * 
 */
public final class VolumeMountResponse extends io.pulumi.resources.InvokeArgs {

    public static final VolumeMountResponse Empty = new VolumeMountResponse();

    /**
     * The path within the container where the volume should be mounted. Must not contain colon (:).
     * 
     */
    @InputImport(name="mountPath", required=true)
        private final String mountPath;

    public String getMountPath() {
        return this.mountPath;
    }

    /**
     * The name of the volume mount.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The flag indicating whether the volume mount is read-only.
     * 
     */
    @InputImport(name="readOnly")
        private final @Nullable Boolean readOnly;

    public Optional<Boolean> getReadOnly() {
        return this.readOnly == null ? Optional.empty() : Optional.ofNullable(this.readOnly);
    }

    public VolumeMountResponse(
        String mountPath,
        String name,
        @Nullable Boolean readOnly) {
        this.mountPath = Objects.requireNonNull(mountPath, "expected parameter 'mountPath' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.readOnly = readOnly;
    }

    private VolumeMountResponse() {
        this.mountPath = null;
        this.name = null;
        this.readOnly = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeMountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mountPath;
        private String name;
        private @Nullable Boolean readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeMountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder setMountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public VolumeMountResponse build() {
            return new VolumeMountResponse(mountPath, name, readOnly);
        }
    }
}
