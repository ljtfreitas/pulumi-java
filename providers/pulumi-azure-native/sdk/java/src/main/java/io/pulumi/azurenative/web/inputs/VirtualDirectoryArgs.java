// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="physicalPath")
    private final @Nullable Input<String> physicalPath;

    public Input<String> getPhysicalPath() {
        return this.physicalPath == null ? Input.empty() : this.physicalPath;
    }

    /**
     * Path to virtual application.
     * 
     */
    @InputImport(name="virtualPath")
    private final @Nullable Input<String> virtualPath;

    public Input<String> getVirtualPath() {
        return this.virtualPath == null ? Input.empty() : this.virtualPath;
    }

    public VirtualDirectoryArgs(
        @Nullable Input<String> physicalPath,
        @Nullable Input<String> virtualPath) {
        this.physicalPath = physicalPath;
        this.virtualPath = virtualPath;
    }

    private VirtualDirectoryArgs() {
        this.physicalPath = Input.empty();
        this.virtualPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> physicalPath;
        private @Nullable Input<String> virtualPath;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualDirectoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.physicalPath = defaults.physicalPath;
    	      this.virtualPath = defaults.virtualPath;
        }

        public Builder setPhysicalPath(@Nullable Input<String> physicalPath) {
            this.physicalPath = physicalPath;
            return this;
        }

        public Builder setPhysicalPath(@Nullable String physicalPath) {
            this.physicalPath = Input.ofNullable(physicalPath);
            return this;
        }

        public Builder setVirtualPath(@Nullable Input<String> virtualPath) {
            this.virtualPath = virtualPath;
            return this;
        }

        public Builder setVirtualPath(@Nullable String virtualPath) {
            this.virtualPath = Input.ofNullable(virtualPath);
            return this;
        }

        public VirtualDirectoryArgs build() {
            return new VirtualDirectoryArgs(physicalPath, virtualPath);
        }
    }
}
