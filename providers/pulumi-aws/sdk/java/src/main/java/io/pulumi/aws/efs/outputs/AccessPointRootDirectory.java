// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.outputs;

import io.pulumi.aws.efs.outputs.AccessPointRootDirectoryCreationInfo;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccessPointRootDirectory {
    /**
     * POSIX IDs and permissions to apply to the access point's Root Directory. See Creation Info below.
     * 
     */
    private final @Nullable AccessPointRootDirectoryCreationInfo creationInfo;
    /**
     * Path on the EFS file system to expose as the root directory to NFS clients using the access point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not exist, you are required to provide `creation_info`.
     * 
     */
    private final @Nullable String path;

    @OutputCustomType.Constructor({"creationInfo","path"})
    private AccessPointRootDirectory(
        @Nullable AccessPointRootDirectoryCreationInfo creationInfo,
        @Nullable String path) {
        this.creationInfo = creationInfo;
        this.path = path;
    }

    /**
     * POSIX IDs and permissions to apply to the access point's Root Directory. See Creation Info below.
     * 
     */
    public Optional<AccessPointRootDirectoryCreationInfo> getCreationInfo() {
        return Optional.ofNullable(this.creationInfo);
    }
    /**
     * Path on the EFS file system to expose as the root directory to NFS clients using the access point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not exist, you are required to provide `creation_info`.
     * 
     */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointRootDirectory defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AccessPointRootDirectoryCreationInfo creationInfo;
        private @Nullable String path;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointRootDirectory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationInfo = defaults.creationInfo;
    	      this.path = defaults.path;
        }

        public Builder setCreationInfo(@Nullable AccessPointRootDirectoryCreationInfo creationInfo) {
            this.creationInfo = creationInfo;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }
        public AccessPointRootDirectory build() {
            return new AccessPointRootDirectory(creationInfo, path);
        }
    }
}
