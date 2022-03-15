// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.redshift.SnapshotScheduleArgs;
import io.pulumi.aws.redshift.inputs.SnapshotScheduleState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * Redshift Snapshot Schedule can be imported using the `identifier`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:redshift/snapshotSchedule:SnapshotSchedule default tf-redshift-snapshot-schedule
 * ```
 * 
 */
@ResourceType(type="aws:redshift/snapshotSchedule:SnapshotSchedule")
public class SnapshotSchedule extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the Redshift Snapshot Schedule.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Redshift Snapshot Schedule.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example `cron(30 12 *)` or `rate(12 hours)`.
     * 
     */
    @Export(name="definitions", type=List.class, parameters={String.class})
    private Output<List<String>> definitions;

    /**
     * @return The definition of the snapshot schedule. The definition is made up of schedule expressions, for example `cron(30 12 *)` or `rate(12 hours)`.
     * 
     */
    public Output<List<String>> getDefinitions() {
        return this.definitions;
    }
    /**
     * The description of the snapshot schedule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the snapshot schedule.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Whether to destroy all associated clusters with this snapshot schedule on deletion. Must be enabled and applied before attempting deletion.
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Whether to destroy all associated clusters with this snapshot schedule on deletion. Must be enabled and applied before attempting deletion.
     * 
     */
    public Output</* @Nullable */ Boolean> getForceDestroy() {
        return this.forceDestroy;
    }
    /**
     * The snapshot schedule identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    @Export(name="identifier", type=String.class, parameters={})
    private Output<String> identifier;

    /**
     * @return The snapshot schedule identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    public Output<String> getIdentifier() {
        return this.identifier;
    }
    /**
     * Creates a unique
     * identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    @Export(name="identifierPrefix", type=String.class, parameters={})
    private Output<String> identifierPrefix;

    /**
     * @return Creates a unique
     * identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    public Output<String> getIdentifierPrefix() {
        return this.identifierPrefix;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(SnapshotScheduleArgs.Builder a);
    }
    private static io.pulumi.aws.redshift.SnapshotScheduleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.redshift.SnapshotScheduleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SnapshotSchedule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SnapshotSchedule(String name) {
        this(name, SnapshotScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SnapshotSchedule(String name, SnapshotScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SnapshotSchedule(String name, SnapshotScheduleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/snapshotSchedule:SnapshotSchedule", name, args == null ? SnapshotScheduleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SnapshotSchedule(String name, Output<String> id, @Nullable SnapshotScheduleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/snapshotSchedule:SnapshotSchedule", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SnapshotSchedule get(String name, Output<String> id, @Nullable SnapshotScheduleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SnapshotSchedule(name, id, state, options);
    }
}
