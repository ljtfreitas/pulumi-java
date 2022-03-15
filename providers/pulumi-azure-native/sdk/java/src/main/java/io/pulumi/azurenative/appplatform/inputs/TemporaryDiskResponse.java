// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Temporary disk payload
 * 
 */
public final class TemporaryDiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final TemporaryDiskResponse Empty = new TemporaryDiskResponse();

    /**
     * Mount path of the temporary disk
     * 
     */
    @Import(name="mountPath")
      private final @Nullable String mountPath;

    public Optional<String> getMountPath() {
        return this.mountPath == null ? Optional.empty() : Optional.ofNullable(this.mountPath);
    }

    /**
     * Size of the temporary disk in GB
     * 
     */
    @Import(name="sizeInGB")
      private final @Nullable Integer sizeInGB;

    public Optional<Integer> getSizeInGB() {
        return this.sizeInGB == null ? Optional.empty() : Optional.ofNullable(this.sizeInGB);
    }

    public TemporaryDiskResponse(
        @Nullable String mountPath,
        @Nullable Integer sizeInGB) {
        this.mountPath = mountPath == null ? "/tmp" : mountPath;
        this.sizeInGB = sizeInGB;
    }

    private TemporaryDiskResponse() {
        this.mountPath = null;
        this.sizeInGB = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemporaryDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mountPath;
        private @Nullable Integer sizeInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(TemporaryDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.sizeInGB = defaults.sizeInGB;
        }

        public Builder mountPath(@Nullable String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        public Builder sizeInGB(@Nullable Integer sizeInGB) {
            this.sizeInGB = sizeInGB;
            return this;
        }
        public TemporaryDiskResponse build() {
            return new TemporaryDiskResponse(mountPath, sizeInGB);
        }
    }
}
