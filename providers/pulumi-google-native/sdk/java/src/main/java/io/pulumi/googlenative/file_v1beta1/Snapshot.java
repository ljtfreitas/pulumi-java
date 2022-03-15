// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.file_v1beta1.SnapshotArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a snapshot.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:file/v1beta1:Snapshot")
public class Snapshot extends io.pulumi.resources.CustomResource {
    /**
     * The time when the snapshot was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the snapshot was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * A description of the snapshot with 2048 characters or less. Requests with longer descriptions will be rejected.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description of the snapshot with 2048 characters or less. Requests with longer descriptions will be rejected.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The amount of bytes needed to allocate a full copy of the snapshot content
     * 
     */
    @Export(name="filesystemUsedBytes", type=String.class, parameters={})
    private Output<String> filesystemUsedBytes;

    /**
     * @return The amount of bytes needed to allocate a full copy of the snapshot content
     * 
     */
    public Output<String> getFilesystemUsedBytes() {
        return this.filesystemUsedBytes;
    }
    /**
     * Resource labels to represent user provided metadata.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Resource labels to represent user provided metadata.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the snapshot, in the format `projects/{project_id}/locations/{location_id}/instances/{instance_id}/snapshots/{snapshot_id}`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the snapshot, in the format `projects/{project_id}/locations/{location_id}/instances/{instance_id}/snapshots/{snapshot_id}`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The snapshot state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The snapshot state.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    public interface BuilderApplicator {
        public void apply(SnapshotArgs.Builder a);
    }
    private static io.pulumi.googlenative.file_v1beta1.SnapshotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.file_v1beta1.SnapshotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Snapshot(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Snapshot(String name) {
        this(name, SnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Snapshot(String name, SnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Snapshot(String name, SnapshotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:file/v1beta1:Snapshot", name, args == null ? SnapshotArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Snapshot(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:file/v1beta1:Snapshot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Snapshot get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Snapshot(name, id, options);
    }
}
