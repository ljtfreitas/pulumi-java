// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RegionDiskDiskEncryptionKeyArgs;
import io.pulumi.gcp.compute.inputs.RegionDiskSourceSnapshotEncryptionKeyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionDiskArgs Empty = new RegionDiskArgs();

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Encrypts the disk using a customer-supplied encryption key.
     * After you encrypt a disk with a customer-supplied key, you must
     * provide the same key if you use the disk later (e.g. to create a disk
     * snapshot or an image, or to attach the disk to a virtual machine).
     * Customer-supplied encryption keys do not protect access to metadata of
     * the disk.
     * If you do not provide an encryption key when creating the disk, then
     * the disk will be encrypted using an automatically generated key and
     * you do not need to provide a key to use the disk later.
     * Structure is documented below.
     * 
     */
    @Import(name="diskEncryptionKey")
      private final @Nullable Output<RegionDiskDiskEncryptionKeyArgs> diskEncryptionKey;

    public Output<RegionDiskDiskEncryptionKeyArgs> getDiskEncryptionKey() {
        return this.diskEncryptionKey == null ? Output.empty() : this.diskEncryptionKey;
    }

    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI.
     * 
     * @Deprecated
     * This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config.
     * 
     */
    @Deprecated /* This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config. */
    @Import(name="interface")
      private final @Nullable Output<String> $interface;

    @Deprecated /* This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config. */
    public Output<String> get$interface() {
        return this.$interface == null ? Output.empty() : this.$interface;
    }

    /**
     * Labels to apply to this disk.  A list of key->value pairs.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Physical block size of the persistent disk, in bytes. If not present
     * in a request, a default value is used. Currently supported sizes
     * are 4096 and 16384, other sizes may be added in the future.
     * If an unsupported value is requested, the error message will list
     * the supported values for the caller's project.
     * 
     */
    @Import(name="physicalBlockSizeBytes")
      private final @Nullable Output<Integer> physicalBlockSizeBytes;

    public Output<Integer> getPhysicalBlockSizeBytes() {
        return this.physicalBlockSizeBytes == null ? Output.empty() : this.physicalBlockSizeBytes;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * A reference to the region where the disk resides.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * URLs of the zones where the disk should be replicated to.
     * 
     */
    @Import(name="replicaZones", required=true)
      private final Output<List<String>> replicaZones;

    public Output<List<String>> getReplicaZones() {
        return this.replicaZones;
    }

    /**
     * Size of the persistent disk, specified in GB. You can specify this
     * field when creating a persistent disk using the sourceImage or
     * sourceSnapshot parameter, or specify it alone to create an empty
     * persistent disk.
     * If you specify this field along with sourceImage or sourceSnapshot,
     * the value of sizeGb must not be less than the size of the sourceImage
     * or the size of the snapshot.
     * 
     */
    @Import(name="size")
      private final @Nullable Output<Integer> size;

    public Output<Integer> getSize() {
        return this.size == null ? Output.empty() : this.size;
    }

    /**
     * The source snapshot used to create this disk. You can provide this as
     * a partial or full URL to the resource. For example, the following are
     * valid values:
     * * `https://www.googleapis.com/compute/v1/projects/project/global/snapshots/snapshot`
     * * `projects/project/global/snapshots/snapshot`
     * * `global/snapshots/snapshot`
     * * `snapshot`
     * 
     */
    @Import(name="snapshot")
      private final @Nullable Output<String> snapshot;

    public Output<String> getSnapshot() {
        return this.snapshot == null ? Output.empty() : this.snapshot;
    }

    /**
     * The customer-supplied encryption key of the source snapshot. Required
     * if the source snapshot is protected by a customer-supplied encryption
     * key.
     * Structure is documented below.
     * 
     */
    @Import(name="sourceSnapshotEncryptionKey")
      private final @Nullable Output<RegionDiskSourceSnapshotEncryptionKeyArgs> sourceSnapshotEncryptionKey;

    public Output<RegionDiskSourceSnapshotEncryptionKeyArgs> getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey == null ? Output.empty() : this.sourceSnapshotEncryptionKey;
    }

    /**
     * URL of the disk type resource describing which disk type to use to
     * create the disk. Provide this when creating the disk.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public RegionDiskArgs(
        @Nullable Output<String> description,
        @Nullable Output<RegionDiskDiskEncryptionKeyArgs> diskEncryptionKey,
        @Nullable Output<String> $interface,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<Integer> physicalBlockSizeBytes,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        Output<List<String>> replicaZones,
        @Nullable Output<Integer> size,
        @Nullable Output<String> snapshot,
        @Nullable Output<RegionDiskSourceSnapshotEncryptionKeyArgs> sourceSnapshotEncryptionKey,
        @Nullable Output<String> type) {
        this.description = description;
        this.diskEncryptionKey = diskEncryptionKey;
        this.$interface = $interface;
        this.labels = labels;
        this.name = name;
        this.physicalBlockSizeBytes = physicalBlockSizeBytes;
        this.project = project;
        this.region = region;
        this.replicaZones = Objects.requireNonNull(replicaZones, "expected parameter 'replicaZones' to be non-null");
        this.size = size;
        this.snapshot = snapshot;
        this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
        this.type = type;
    }

    private RegionDiskArgs() {
        this.description = Output.empty();
        this.diskEncryptionKey = Output.empty();
        this.$interface = Output.empty();
        this.labels = Output.empty();
        this.name = Output.empty();
        this.physicalBlockSizeBytes = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.replicaZones = Output.empty();
        this.size = Output.empty();
        this.snapshot = Output.empty();
        this.sourceSnapshotEncryptionKey = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<RegionDiskDiskEncryptionKeyArgs> diskEncryptionKey;
        private @Nullable Output<String> $interface;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> physicalBlockSizeBytes;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private Output<List<String>> replicaZones;
        private @Nullable Output<Integer> size;
        private @Nullable Output<String> snapshot;
        private @Nullable Output<RegionDiskSourceSnapshotEncryptionKeyArgs> sourceSnapshotEncryptionKey;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.$interface = defaults.$interface;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.physicalBlockSizeBytes = defaults.physicalBlockSizeBytes;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.replicaZones = defaults.replicaZones;
    	      this.size = defaults.size;
    	      this.snapshot = defaults.snapshot;
    	      this.sourceSnapshotEncryptionKey = defaults.sourceSnapshotEncryptionKey;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder diskEncryptionKey(@Nullable Output<RegionDiskDiskEncryptionKeyArgs> diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        public Builder diskEncryptionKey(@Nullable RegionDiskDiskEncryptionKeyArgs diskEncryptionKey) {
            this.diskEncryptionKey = Output.ofNullable(diskEncryptionKey);
            return this;
        }

        public Builder $interface(@Nullable Output<String> $interface) {
            this.$interface = $interface;
            return this;
        }

        public Builder $interface(@Nullable String $interface) {
            this.$interface = Output.ofNullable($interface);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder physicalBlockSizeBytes(@Nullable Output<Integer> physicalBlockSizeBytes) {
            this.physicalBlockSizeBytes = physicalBlockSizeBytes;
            return this;
        }

        public Builder physicalBlockSizeBytes(@Nullable Integer physicalBlockSizeBytes) {
            this.physicalBlockSizeBytes = Output.ofNullable(physicalBlockSizeBytes);
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

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }

        public Builder replicaZones(Output<List<String>> replicaZones) {
            this.replicaZones = Objects.requireNonNull(replicaZones);
            return this;
        }

        public Builder replicaZones(List<String> replicaZones) {
            this.replicaZones = Output.of(Objects.requireNonNull(replicaZones));
            return this;
        }

        public Builder size(@Nullable Output<Integer> size) {
            this.size = size;
            return this;
        }

        public Builder size(@Nullable Integer size) {
            this.size = Output.ofNullable(size);
            return this;
        }

        public Builder snapshot(@Nullable Output<String> snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public Builder snapshot(@Nullable String snapshot) {
            this.snapshot = Output.ofNullable(snapshot);
            return this;
        }

        public Builder sourceSnapshotEncryptionKey(@Nullable Output<RegionDiskSourceSnapshotEncryptionKeyArgs> sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
            return this;
        }

        public Builder sourceSnapshotEncryptionKey(@Nullable RegionDiskSourceSnapshotEncryptionKeyArgs sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = Output.ofNullable(sourceSnapshotEncryptionKey);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public RegionDiskArgs build() {
            return new RegionDiskArgs(description, diskEncryptionKey, $interface, labels, name, physicalBlockSizeBytes, project, region, replicaZones, size, snapshot, sourceSnapshotEncryptionKey, type);
        }
    }
}
