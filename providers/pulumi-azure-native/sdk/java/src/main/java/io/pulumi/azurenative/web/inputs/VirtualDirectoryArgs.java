// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Directory for virtual application.
 * 
 */
public final class VirtualDirectoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualDirectoryArgs Empty = new VirtualDirectoryArgs();

    /**
     * Physical path.
     * 
     */
    @Import(name="physicalPath")
      private final @Nullable Output<String> physicalPath;

    public Output<String> getPhysicalPath() {
        return this.physicalPath == null ? Output.empty() : this.physicalPath;
    }

    /**
     * Path to virtual application.
     * 
     */
    @Import(name="virtualPath")
      private final @Nullable Output<String> virtualPath;

    public Output<String> getVirtualPath() {
        return this.virtualPath == null ? Output.empty() : this.virtualPath;
    }

    public VirtualDirectoryArgs(
        @Nullable Output<String> physicalPath,
        @Nullable Output<String> virtualPath) {
        this.physicalPath = physicalPath;
        this.virtualPath = virtualPath;
    }

    private VirtualDirectoryArgs() {
        this.physicalPath = Output.empty();
        this.virtualPath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> physicalPath;
        private @Nullable Output<String> virtualPath;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualDirectoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.physicalPath = defaults.physicalPath;
    	      this.virtualPath = defaults.virtualPath;
        }

        public Builder physicalPath(@Nullable Output<String> physicalPath) {
            this.physicalPath = physicalPath;
            return this;
        }

        public Builder physicalPath(@Nullable String physicalPath) {
            this.physicalPath = Output.ofNullable(physicalPath);
            return this;
        }

        public Builder virtualPath(@Nullable Output<String> virtualPath) {
            this.virtualPath = virtualPath;
            return this;
        }

        public Builder virtualPath(@Nullable String virtualPath) {
            this.virtualPath = Output.ofNullable(virtualPath);
            return this;
        }
        public VirtualDirectoryArgs build() {
            return new VirtualDirectoryArgs(physicalPath, virtualPath);
        }
    }
}
