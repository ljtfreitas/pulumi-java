// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.baremetalsolution_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * The description of the storage volume snapshot.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * An identifier for the snapshot, generated by the backend.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The size of the storage volume snapshot, in bytes.
     * 
     */
    @Import(name="sizeBytes")
      private final @Nullable Output<String> sizeBytes;

    public Output<String> getSizeBytes() {
        return this.sizeBytes == null ? Output.empty() : this.sizeBytes;
    }

    /**
     * The storage volume this snapshot belongs to.
     * 
     */
    @Import(name="storageVolume")
      private final @Nullable Output<String> storageVolume;

    public Output<String> getStorageVolume() {
        return this.storageVolume == null ? Output.empty() : this.storageVolume;
    }

    @Import(name="volumeId", required=true)
      private final Output<String> volumeId;

    public Output<String> getVolumeId() {
        return this.volumeId;
    }

    public SnapshotArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        @Nullable Output<String> sizeBytes,
        @Nullable Output<String> storageVolume,
        Output<String> volumeId) {
        this.description = description;
        this.id = id;
        this.location = location;
        this.project = project;
        this.sizeBytes = sizeBytes;
        this.storageVolume = storageVolume;
        this.volumeId = Objects.requireNonNull(volumeId, "expected parameter 'volumeId' to be non-null");
    }

    private SnapshotArgs() {
        this.description = Output.empty();
        this.id = Output.empty();
        this.location = Output.empty();
        this.project = Output.empty();
        this.sizeBytes = Output.empty();
        this.storageVolume = Output.empty();
        this.volumeId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> id;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private @Nullable Output<String> sizeBytes;
        private @Nullable Output<String> storageVolume;
        private Output<String> volumeId;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.sizeBytes = defaults.sizeBytes;
    	      this.storageVolume = defaults.storageVolume;
    	      this.volumeId = defaults.volumeId;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder sizeBytes(@Nullable Output<String> sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }

        public Builder sizeBytes(@Nullable String sizeBytes) {
            this.sizeBytes = Output.ofNullable(sizeBytes);
            return this;
        }

        public Builder storageVolume(@Nullable Output<String> storageVolume) {
            this.storageVolume = storageVolume;
            return this;
        }

        public Builder storageVolume(@Nullable String storageVolume) {
            this.storageVolume = Output.ofNullable(storageVolume);
            return this;
        }

        public Builder volumeId(Output<String> volumeId) {
            this.volumeId = Objects.requireNonNull(volumeId);
            return this;
        }

        public Builder volumeId(String volumeId) {
            this.volumeId = Output.of(Objects.requireNonNull(volumeId));
            return this;
        }
        public SnapshotArgs build() {
            return new SnapshotArgs(description, id, location, project, sizeBytes, storageVolume, volumeId);
        }
    }
}
