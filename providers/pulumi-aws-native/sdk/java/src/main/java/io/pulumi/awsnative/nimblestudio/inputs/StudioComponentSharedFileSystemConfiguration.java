// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StudioComponentSharedFileSystemConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final StudioComponentSharedFileSystemConfiguration Empty = new StudioComponentSharedFileSystemConfiguration();

    @InputImport(name="endpoint")
    private final @Nullable String endpoint;

    public Optional<String> getEndpoint() {
        return this.endpoint == null ? Optional.empty() : Optional.ofNullable(this.endpoint);
    }

    @InputImport(name="fileSystemId")
    private final @Nullable String fileSystemId;

    public Optional<String> getFileSystemId() {
        return this.fileSystemId == null ? Optional.empty() : Optional.ofNullable(this.fileSystemId);
    }

    @InputImport(name="linuxMountPoint")
    private final @Nullable String linuxMountPoint;

    public Optional<String> getLinuxMountPoint() {
        return this.linuxMountPoint == null ? Optional.empty() : Optional.ofNullable(this.linuxMountPoint);
    }

    @InputImport(name="shareName")
    private final @Nullable String shareName;

    public Optional<String> getShareName() {
        return this.shareName == null ? Optional.empty() : Optional.ofNullable(this.shareName);
    }

    @InputImport(name="windowsMountDrive")
    private final @Nullable String windowsMountDrive;

    public Optional<String> getWindowsMountDrive() {
        return this.windowsMountDrive == null ? Optional.empty() : Optional.ofNullable(this.windowsMountDrive);
    }

    public StudioComponentSharedFileSystemConfiguration(
        @Nullable String endpoint,
        @Nullable String fileSystemId,
        @Nullable String linuxMountPoint,
        @Nullable String shareName,
        @Nullable String windowsMountDrive) {
        this.endpoint = endpoint;
        this.fileSystemId = fileSystemId;
        this.linuxMountPoint = linuxMountPoint;
        this.shareName = shareName;
        this.windowsMountDrive = windowsMountDrive;
    }

    private StudioComponentSharedFileSystemConfiguration() {
        this.endpoint = null;
        this.fileSystemId = null;
        this.linuxMountPoint = null;
        this.shareName = null;
        this.windowsMountDrive = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentSharedFileSystemConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpoint;
        private @Nullable String fileSystemId;
        private @Nullable String linuxMountPoint;
        private @Nullable String shareName;
        private @Nullable String windowsMountDrive;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentSharedFileSystemConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.linuxMountPoint = defaults.linuxMountPoint;
    	      this.shareName = defaults.shareName;
    	      this.windowsMountDrive = defaults.windowsMountDrive;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setFileSystemId(@Nullable String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        public Builder setLinuxMountPoint(@Nullable String linuxMountPoint) {
            this.linuxMountPoint = linuxMountPoint;
            return this;
        }

        public Builder setShareName(@Nullable String shareName) {
            this.shareName = shareName;
            return this;
        }

        public Builder setWindowsMountDrive(@Nullable String windowsMountDrive) {
            this.windowsMountDrive = windowsMountDrive;
            return this;
        }

        public StudioComponentSharedFileSystemConfiguration build() {
            return new StudioComponentSharedFileSystemConfiguration(endpoint, fileSystemId, linuxMountPoint, shareName, windowsMountDrive);
        }
    }
}