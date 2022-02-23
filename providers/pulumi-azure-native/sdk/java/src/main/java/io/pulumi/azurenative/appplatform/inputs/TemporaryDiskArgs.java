// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Temporary disk payload
 * 
 */
public final class TemporaryDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final TemporaryDiskArgs Empty = new TemporaryDiskArgs();

    /**
     * Mount path of the temporary disk
     * 
     */
    @InputImport(name="mountPath")
        private final @Nullable Input<String> mountPath;

    public Input<String> getMountPath() {
        return this.mountPath == null ? Input.empty() : this.mountPath;
    }

    /**
     * Size of the temporary disk in GB
     * 
     */
    @InputImport(name="sizeInGB")
        private final @Nullable Input<Integer> sizeInGB;

    public Input<Integer> getSizeInGB() {
        return this.sizeInGB == null ? Input.empty() : this.sizeInGB;
    }

    public TemporaryDiskArgs(
        @Nullable Input<String> mountPath,
        @Nullable Input<Integer> sizeInGB) {
        this.mountPath = mountPath == null ? Input.ofNullable("/tmp") : mountPath;
        this.sizeInGB = sizeInGB;
    }

    private TemporaryDiskArgs() {
        this.mountPath = Input.empty();
        this.sizeInGB = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemporaryDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> mountPath;
        private @Nullable Input<Integer> sizeInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(TemporaryDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.sizeInGB = defaults.sizeInGB;
        }

        public Builder setMountPath(@Nullable Input<String> mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        public Builder setMountPath(@Nullable String mountPath) {
            this.mountPath = Input.ofNullable(mountPath);
            return this;
        }

        public Builder setSizeInGB(@Nullable Input<Integer> sizeInGB) {
            this.sizeInGB = sizeInGB;
            return this;
        }

        public Builder setSizeInGB(@Nullable Integer sizeInGB) {
            this.sizeInGB = Input.ofNullable(sizeInGB);
            return this;
        }
        public TemporaryDiskArgs build() {
            return new TemporaryDiskArgs(mountPath, sizeInGB);
        }
    }
}
