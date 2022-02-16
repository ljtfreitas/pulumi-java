// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.DiskDiskEncryptionKeyArgs;
import io.pulumi.gcp.compute.inputs.DiskSourceImageEncryptionKeyArgs;
import io.pulumi.gcp.compute.inputs.DiskSourceSnapshotEncryptionKeyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskArgs Empty = new DiskArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="diskEncryptionKey")
    private final @Nullable Input<DiskDiskEncryptionKeyArgs> diskEncryptionKey;

    public Input<DiskDiskEncryptionKeyArgs> getDiskEncryptionKey() {
        return this.diskEncryptionKey == null ? Input.empty() : this.diskEncryptionKey;
    }

    @InputImport(name="image")
    private final @Nullable Input<String> image;

    public Input<String> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    @InputImport(name="interface")
    private final @Nullable Input<String> $interface;

    @Deprecated /* This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config. */
    public Input<String> get$interface() {
        return this.$interface == null ? Input.empty() : this.$interface;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="multiWriter")
    private final @Nullable Input<Boolean> multiWriter;

    public Input<Boolean> getMultiWriter() {
        return this.multiWriter == null ? Input.empty() : this.multiWriter;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="physicalBlockSizeBytes")
    private final @Nullable Input<Integer> physicalBlockSizeBytes;

    public Input<Integer> getPhysicalBlockSizeBytes() {
        return this.physicalBlockSizeBytes == null ? Input.empty() : this.physicalBlockSizeBytes;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="provisionedIops")
    private final @Nullable Input<Integer> provisionedIops;

    public Input<Integer> getProvisionedIops() {
        return this.provisionedIops == null ? Input.empty() : this.provisionedIops;
    }

    @InputImport(name="resourcePolicies")
    private final @Nullable Input<List<String>> resourcePolicies;

    public Input<List<String>> getResourcePolicies() {
        return this.resourcePolicies == null ? Input.empty() : this.resourcePolicies;
    }

    @InputImport(name="size")
    private final @Nullable Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    @InputImport(name="snapshot")
    private final @Nullable Input<String> snapshot;

    public Input<String> getSnapshot() {
        return this.snapshot == null ? Input.empty() : this.snapshot;
    }

    @InputImport(name="sourceImageEncryptionKey")
    private final @Nullable Input<DiskSourceImageEncryptionKeyArgs> sourceImageEncryptionKey;

    public Input<DiskSourceImageEncryptionKeyArgs> getSourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey == null ? Input.empty() : this.sourceImageEncryptionKey;
    }

    @InputImport(name="sourceSnapshotEncryptionKey")
    private final @Nullable Input<DiskSourceSnapshotEncryptionKeyArgs> sourceSnapshotEncryptionKey;

    public Input<DiskSourceSnapshotEncryptionKeyArgs> getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey == null ? Input.empty() : this.sourceSnapshotEncryptionKey;
    }

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public DiskArgs(
        @Nullable Input<String> description,
        @Nullable Input<DiskDiskEncryptionKeyArgs> diskEncryptionKey,
        @Nullable Input<String> image,
        @Nullable Input<String> $interface,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<Boolean> multiWriter,
        @Nullable Input<String> name,
        @Nullable Input<Integer> physicalBlockSizeBytes,
        @Nullable Input<String> project,
        @Nullable Input<Integer> provisionedIops,
        @Nullable Input<List<String>> resourcePolicies,
        @Nullable Input<Integer> size,
        @Nullable Input<String> snapshot,
        @Nullable Input<DiskSourceImageEncryptionKeyArgs> sourceImageEncryptionKey,
        @Nullable Input<DiskSourceSnapshotEncryptionKeyArgs> sourceSnapshotEncryptionKey,
        @Nullable Input<String> type,
        @Nullable Input<String> zone) {
        this.description = description;
        this.diskEncryptionKey = diskEncryptionKey;
        this.image = image;
        this.$interface = $interface;
        this.labels = labels;
        this.multiWriter = multiWriter;
        this.name = name;
        this.physicalBlockSizeBytes = physicalBlockSizeBytes;
        this.project = project;
        this.provisionedIops = provisionedIops;
        this.resourcePolicies = resourcePolicies;
        this.size = size;
        this.snapshot = snapshot;
        this.sourceImageEncryptionKey = sourceImageEncryptionKey;
        this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
        this.type = type;
        this.zone = zone;
    }

    private DiskArgs() {
        this.description = Input.empty();
        this.diskEncryptionKey = Input.empty();
        this.image = Input.empty();
        this.$interface = Input.empty();
        this.labels = Input.empty();
        this.multiWriter = Input.empty();
        this.name = Input.empty();
        this.physicalBlockSizeBytes = Input.empty();
        this.project = Input.empty();
        this.provisionedIops = Input.empty();
        this.resourcePolicies = Input.empty();
        this.size = Input.empty();
        this.snapshot = Input.empty();
        this.sourceImageEncryptionKey = Input.empty();
        this.sourceSnapshotEncryptionKey = Input.empty();
        this.type = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<DiskDiskEncryptionKeyArgs> diskEncryptionKey;
        private @Nullable Input<String> image;
        private @Nullable Input<String> $interface;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<Boolean> multiWriter;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> physicalBlockSizeBytes;
        private @Nullable Input<String> project;
        private @Nullable Input<Integer> provisionedIops;
        private @Nullable Input<List<String>> resourcePolicies;
        private @Nullable Input<Integer> size;
        private @Nullable Input<String> snapshot;
        private @Nullable Input<DiskSourceImageEncryptionKeyArgs> sourceImageEncryptionKey;
        private @Nullable Input<DiskSourceSnapshotEncryptionKeyArgs> sourceSnapshotEncryptionKey;
        private @Nullable Input<String> type;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.image = defaults.image;
    	      this.$interface = defaults.$interface;
    	      this.labels = defaults.labels;
    	      this.multiWriter = defaults.multiWriter;
    	      this.name = defaults.name;
    	      this.physicalBlockSizeBytes = defaults.physicalBlockSizeBytes;
    	      this.project = defaults.project;
    	      this.provisionedIops = defaults.provisionedIops;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.size = defaults.size;
    	      this.snapshot = defaults.snapshot;
    	      this.sourceImageEncryptionKey = defaults.sourceImageEncryptionKey;
    	      this.sourceSnapshotEncryptionKey = defaults.sourceSnapshotEncryptionKey;
    	      this.type = defaults.type;
    	      this.zone = defaults.zone;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDiskEncryptionKey(@Nullable Input<DiskDiskEncryptionKeyArgs> diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        public Builder setDiskEncryptionKey(@Nullable DiskDiskEncryptionKeyArgs diskEncryptionKey) {
            this.diskEncryptionKey = Input.ofNullable(diskEncryptionKey);
            return this;
        }

        public Builder setImage(@Nullable Input<String> image) {
            this.image = image;
            return this;
        }

        public Builder setImage(@Nullable String image) {
            this.image = Input.ofNullable(image);
            return this;
        }

        public Builder set$interface(@Nullable Input<String> $interface) {
            this.$interface = $interface;
            return this;
        }

        public Builder set$interface(@Nullable String $interface) {
            this.$interface = Input.ofNullable($interface);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setMultiWriter(@Nullable Input<Boolean> multiWriter) {
            this.multiWriter = multiWriter;
            return this;
        }

        public Builder setMultiWriter(@Nullable Boolean multiWriter) {
            this.multiWriter = Input.ofNullable(multiWriter);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPhysicalBlockSizeBytes(@Nullable Input<Integer> physicalBlockSizeBytes) {
            this.physicalBlockSizeBytes = physicalBlockSizeBytes;
            return this;
        }

        public Builder setPhysicalBlockSizeBytes(@Nullable Integer physicalBlockSizeBytes) {
            this.physicalBlockSizeBytes = Input.ofNullable(physicalBlockSizeBytes);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setProvisionedIops(@Nullable Input<Integer> provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }

        public Builder setProvisionedIops(@Nullable Integer provisionedIops) {
            this.provisionedIops = Input.ofNullable(provisionedIops);
            return this;
        }

        public Builder setResourcePolicies(@Nullable Input<List<String>> resourcePolicies) {
            this.resourcePolicies = resourcePolicies;
            return this;
        }

        public Builder setResourcePolicies(@Nullable List<String> resourcePolicies) {
            this.resourcePolicies = Input.ofNullable(resourcePolicies);
            return this;
        }

        public Builder setSize(@Nullable Input<Integer> size) {
            this.size = size;
            return this;
        }

        public Builder setSize(@Nullable Integer size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder setSnapshot(@Nullable Input<String> snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public Builder setSnapshot(@Nullable String snapshot) {
            this.snapshot = Input.ofNullable(snapshot);
            return this;
        }

        public Builder setSourceImageEncryptionKey(@Nullable Input<DiskSourceImageEncryptionKeyArgs> sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = sourceImageEncryptionKey;
            return this;
        }

        public Builder setSourceImageEncryptionKey(@Nullable DiskSourceImageEncryptionKeyArgs sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = Input.ofNullable(sourceImageEncryptionKey);
            return this;
        }

        public Builder setSourceSnapshotEncryptionKey(@Nullable Input<DiskSourceSnapshotEncryptionKeyArgs> sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
            return this;
        }

        public Builder setSourceSnapshotEncryptionKey(@Nullable DiskSourceSnapshotEncryptionKeyArgs sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = Input.ofNullable(sourceSnapshotEncryptionKey);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public DiskArgs build() {
            return new DiskArgs(description, diskEncryptionKey, image, $interface, labels, multiWriter, name, physicalBlockSizeBytes, project, provisionedIops, resourcePolicies, size, snapshot, sourceImageEncryptionKey, sourceSnapshotEncryptionKey, type, zone);
        }
    }
}