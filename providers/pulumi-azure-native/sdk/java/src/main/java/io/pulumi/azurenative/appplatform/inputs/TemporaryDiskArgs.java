// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="mountPath")
      private final @Nullable Output<String> mountPath;

    public Output<String> getMountPath() {
        return this.mountPath == null ? Output.empty() : this.mountPath;
    }

    /**
     * Size of the temporary disk in GB
     * 
     */
    @Import(name="sizeInGB")
      private final @Nullable Output<Integer> sizeInGB;

    public Output<Integer> getSizeInGB() {
        return this.sizeInGB == null ? Output.empty() : this.sizeInGB;
    }

    public TemporaryDiskArgs(
        @Nullable Output<String> mountPath,
        @Nullable Output<Integer> sizeInGB) {
        this.mountPath = mountPath == null ? Output.ofNullable("/tmp") : mountPath;
        this.sizeInGB = sizeInGB;
    }

    private TemporaryDiskArgs() {
        this.mountPath = Output.empty();
        this.sizeInGB = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemporaryDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> mountPath;
        private @Nullable Output<Integer> sizeInGB;

        public Builder() {
    	      // Empty
        }

        public Builder(TemporaryDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.sizeInGB = defaults.sizeInGB;
        }

        public Builder mountPath(@Nullable Output<String> mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        public Builder mountPath(@Nullable String mountPath) {
            this.mountPath = Output.ofNullable(mountPath);
            return this;
        }

        public Builder sizeInGB(@Nullable Output<Integer> sizeInGB) {
            this.sizeInGB = sizeInGB;
            return this;
        }

        public Builder sizeInGB(@Nullable Integer sizeInGB) {
            this.sizeInGB = Output.ofNullable(sizeInGB);
            return this;
        }
        public TemporaryDiskArgs build() {
            return new TemporaryDiskArgs(mountPath, sizeInGB);
        }
    }
}
