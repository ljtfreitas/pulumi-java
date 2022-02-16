// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.DiskArgs;
import io.pulumi.gcp.compute.inputs.DiskState;
import io.pulumi.gcp.compute.outputs.DiskDiskEncryptionKey;
import io.pulumi.gcp.compute.outputs.DiskSourceImageEncryptionKey;
import io.pulumi.gcp.compute.outputs.DiskSourceSnapshotEncryptionKey;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="gcp:compute/disk:Disk")
public class Disk extends io.pulumi.resources.CustomResource {
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="diskEncryptionKey", type=DiskDiskEncryptionKey.class, parameters={})
    private Output</* @Nullable */ DiskDiskEncryptionKey> diskEncryptionKey;

    public Output</* @Nullable */ DiskDiskEncryptionKey> getDiskEncryptionKey() {
        return this.diskEncryptionKey;
    }
    @OutputExport(name="image", type=String.class, parameters={})
    private Output</* @Nullable */ String> image;

    public Output</* @Nullable */ String> getImage() {
        return this.image;
    }
    @OutputExport(name="interface", type=String.class, parameters={})
    private Output</* @Nullable */ String> $interface;

    public Output</* @Nullable */ String> get$interface() {
        return this.$interface;
    }
    @OutputExport(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    public Output<String> getLabelFingerprint() {
        return this.labelFingerprint;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="lastAttachTimestamp", type=String.class, parameters={})
    private Output<String> lastAttachTimestamp;

    public Output<String> getLastAttachTimestamp() {
        return this.lastAttachTimestamp;
    }
    @OutputExport(name="lastDetachTimestamp", type=String.class, parameters={})
    private Output<String> lastDetachTimestamp;

    public Output<String> getLastDetachTimestamp() {
        return this.lastDetachTimestamp;
    }
    @OutputExport(name="multiWriter", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> multiWriter;

    public Output</* @Nullable */ Boolean> getMultiWriter() {
        return this.multiWriter;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="physicalBlockSizeBytes", type=Integer.class, parameters={})
    private Output<Integer> physicalBlockSizeBytes;

    public Output<Integer> getPhysicalBlockSizeBytes() {
        return this.physicalBlockSizeBytes;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="provisionedIops", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> provisionedIops;

    public Output</* @Nullable */ Integer> getProvisionedIops() {
        return this.provisionedIops;
    }
    @OutputExport(name="resourcePolicies", type=List.class, parameters={String.class})
    private Output<List<String>> resourcePolicies;

    public Output<List<String>> getResourcePolicies() {
        return this.resourcePolicies;
    }
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    @OutputExport(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    public Output<Integer> getSize() {
        return this.size;
    }
    @OutputExport(name="snapshot", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshot;

    public Output</* @Nullable */ String> getSnapshot() {
        return this.snapshot;
    }
    @OutputExport(name="sourceImageEncryptionKey", type=DiskSourceImageEncryptionKey.class, parameters={})
    private Output</* @Nullable */ DiskSourceImageEncryptionKey> sourceImageEncryptionKey;

    public Output</* @Nullable */ DiskSourceImageEncryptionKey> getSourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey;
    }
    @OutputExport(name="sourceImageId", type=String.class, parameters={})
    private Output<String> sourceImageId;

    public Output<String> getSourceImageId() {
        return this.sourceImageId;
    }
    @OutputExport(name="sourceSnapshotEncryptionKey", type=DiskSourceSnapshotEncryptionKey.class, parameters={})
    private Output</* @Nullable */ DiskSourceSnapshotEncryptionKey> sourceSnapshotEncryptionKey;

    public Output</* @Nullable */ DiskSourceSnapshotEncryptionKey> getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey;
    }
    @OutputExport(name="sourceSnapshotId", type=String.class, parameters={})
    private Output<String> sourceSnapshotId;

    public Output<String> getSourceSnapshotId() {
        return this.sourceSnapshotId;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    public Output</* @Nullable */ String> getType() {
        return this.type;
    }
    @OutputExport(name="users", type=List.class, parameters={String.class})
    private Output<List<String>> users;

    public Output<List<String>> getUsers() {
        return this.users;
    }
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    public Output<String> getZone() {
        return this.zone;
    }

    public Disk(String name, @Nullable DiskArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/disk:Disk", name, args == null ? DiskArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Disk(String name, Input<String> id, @Nullable DiskState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/disk:Disk", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Disk get(String name, Input<String> id, @Nullable DiskState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Disk(name, id, state, options);
    }
}