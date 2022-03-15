// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NFSMountConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NFSMountConfigurationArgs Empty = new NFSMountConfigurationArgs();

    /**
     * These are 'net use' options in Windows and 'mount' options in Linux.
     * 
     */
    @Import(name="mountOptions")
      private final @Nullable Output<String> mountOptions;

    public Output<String> getMountOptions() {
        return this.mountOptions == null ? Output.empty() : this.mountOptions;
    }

    /**
     * All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    @Import(name="relativeMountPath", required=true)
      private final Output<String> relativeMountPath;

    public Output<String> getRelativeMountPath() {
        return this.relativeMountPath;
    }

    @Import(name="source", required=true)
      private final Output<String> source;

    public Output<String> getSource() {
        return this.source;
    }

    public NFSMountConfigurationArgs(
        @Nullable Output<String> mountOptions,
        Output<String> relativeMountPath,
        Output<String> source) {
        this.mountOptions = mountOptions;
        this.relativeMountPath = Objects.requireNonNull(relativeMountPath, "expected parameter 'relativeMountPath' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private NFSMountConfigurationArgs() {
        this.mountOptions = Output.empty();
        this.relativeMountPath = Output.empty();
        this.source = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NFSMountConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> mountOptions;
        private Output<String> relativeMountPath;
        private Output<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(NFSMountConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountOptions = defaults.mountOptions;
    	      this.relativeMountPath = defaults.relativeMountPath;
    	      this.source = defaults.source;
        }

        public Builder mountOptions(@Nullable Output<String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder mountOptions(@Nullable String mountOptions) {
            this.mountOptions = Output.ofNullable(mountOptions);
            return this;
        }

        public Builder relativeMountPath(Output<String> relativeMountPath) {
            this.relativeMountPath = Objects.requireNonNull(relativeMountPath);
            return this;
        }

        public Builder relativeMountPath(String relativeMountPath) {
            this.relativeMountPath = Output.of(Objects.requireNonNull(relativeMountPath));
            return this;
        }

        public Builder source(Output<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder source(String source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }
        public NFSMountConfigurationArgs build() {
            return new NFSMountConfigurationArgs(mountOptions, relativeMountPath, source);
        }
    }
}
