// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualDirectoryResponse {
    /**
     * Physical path.
     * 
     */
    private final @Nullable String physicalPath;
    /**
     * Path to virtual application.
     * 
     */
    private final @Nullable String virtualPath;

    @OutputCustomType.Constructor({"physicalPath","virtualPath"})
    private VirtualDirectoryResponse(
        @Nullable String physicalPath,
        @Nullable String virtualPath) {
        this.physicalPath = physicalPath;
        this.virtualPath = virtualPath;
    }

    /**
     * Physical path.
     * 
     */
    public Optional<String> getPhysicalPath() {
        return Optional.ofNullable(this.physicalPath);
    }
    /**
     * Path to virtual application.
     * 
     */
    public Optional<String> getVirtualPath() {
        return Optional.ofNullable(this.virtualPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualDirectoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String physicalPath;
        private @Nullable String virtualPath;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualDirectoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.physicalPath = defaults.physicalPath;
    	      this.virtualPath = defaults.virtualPath;
        }

        public Builder setPhysicalPath(@Nullable String physicalPath) {
            this.physicalPath = physicalPath;
            return this;
        }

        public Builder setVirtualPath(@Nullable String virtualPath) {
            this.virtualPath = virtualPath;
            return this;
        }
        public VirtualDirectoryResponse build() {
            return new VirtualDirectoryResponse(physicalPath, virtualPath);
        }
    }
}
