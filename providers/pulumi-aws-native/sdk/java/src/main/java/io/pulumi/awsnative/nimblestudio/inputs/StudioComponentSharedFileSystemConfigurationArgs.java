// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The configuration for a shared file storage system that is associated with a studio resource.</p>
 * 
 */
public final class StudioComponentSharedFileSystemConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StudioComponentSharedFileSystemConfigurationArgs Empty = new StudioComponentSharedFileSystemConfigurationArgs();

    /**
     * <p>The endpoint of the shared file system that is accessed by the studio component resource.</p>
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint == null ? Output.empty() : this.endpoint;
    }

    /**
     * <p>The unique identifier for a file system.</p>
     * 
     */
    @Import(name="fileSystemId")
      private final @Nullable Output<String> fileSystemId;

    public Output<String> getFileSystemId() {
        return this.fileSystemId == null ? Output.empty() : this.fileSystemId;
    }

    /**
     * <p>The mount location for a shared file system on a Linux virtual workstation.</p>
     * 
     */
    @Import(name="linuxMountPoint")
      private final @Nullable Output<String> linuxMountPoint;

    public Output<String> getLinuxMountPoint() {
        return this.linuxMountPoint == null ? Output.empty() : this.linuxMountPoint;
    }

    /**
     * <p>The name of the file share.</p>
     * 
     */
    @Import(name="shareName")
      private final @Nullable Output<String> shareName;

    public Output<String> getShareName() {
        return this.shareName == null ? Output.empty() : this.shareName;
    }

    /**
     * <p>The mount location for a shared file system on a Windows virtual workstation.</p>
     * 
     */
    @Import(name="windowsMountDrive")
      private final @Nullable Output<String> windowsMountDrive;

    public Output<String> getWindowsMountDrive() {
        return this.windowsMountDrive == null ? Output.empty() : this.windowsMountDrive;
    }

    public StudioComponentSharedFileSystemConfigurationArgs(
        @Nullable Output<String> endpoint,
        @Nullable Output<String> fileSystemId,
        @Nullable Output<String> linuxMountPoint,
        @Nullable Output<String> shareName,
        @Nullable Output<String> windowsMountDrive) {
        this.endpoint = endpoint;
        this.fileSystemId = fileSystemId;
        this.linuxMountPoint = linuxMountPoint;
        this.shareName = shareName;
        this.windowsMountDrive = windowsMountDrive;
    }

    private StudioComponentSharedFileSystemConfigurationArgs() {
        this.endpoint = Output.empty();
        this.fileSystemId = Output.empty();
        this.linuxMountPoint = Output.empty();
        this.shareName = Output.empty();
        this.windowsMountDrive = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentSharedFileSystemConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endpoint;
        private @Nullable Output<String> fileSystemId;
        private @Nullable Output<String> linuxMountPoint;
        private @Nullable Output<String> shareName;
        private @Nullable Output<String> windowsMountDrive;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentSharedFileSystemConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.linuxMountPoint = defaults.linuxMountPoint;
    	      this.shareName = defaults.shareName;
    	      this.windowsMountDrive = defaults.windowsMountDrive;
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Output.ofNullable(endpoint);
            return this;
        }

        public Builder fileSystemId(@Nullable Output<String> fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        public Builder fileSystemId(@Nullable String fileSystemId) {
            this.fileSystemId = Output.ofNullable(fileSystemId);
            return this;
        }

        public Builder linuxMountPoint(@Nullable Output<String> linuxMountPoint) {
            this.linuxMountPoint = linuxMountPoint;
            return this;
        }

        public Builder linuxMountPoint(@Nullable String linuxMountPoint) {
            this.linuxMountPoint = Output.ofNullable(linuxMountPoint);
            return this;
        }

        public Builder shareName(@Nullable Output<String> shareName) {
            this.shareName = shareName;
            return this;
        }

        public Builder shareName(@Nullable String shareName) {
            this.shareName = Output.ofNullable(shareName);
            return this;
        }

        public Builder windowsMountDrive(@Nullable Output<String> windowsMountDrive) {
            this.windowsMountDrive = windowsMountDrive;
            return this;
        }

        public Builder windowsMountDrive(@Nullable String windowsMountDrive) {
            this.windowsMountDrive = Output.ofNullable(windowsMountDrive);
            return this;
        }
        public StudioComponentSharedFileSystemConfigurationArgs build() {
            return new StudioComponentSharedFileSystemConfigurationArgs(endpoint, fileSystemId, linuxMountPoint, shareName, windowsMountDrive);
        }
    }
}
