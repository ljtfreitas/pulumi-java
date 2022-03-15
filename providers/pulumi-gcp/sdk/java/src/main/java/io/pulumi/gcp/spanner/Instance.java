// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.spanner;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.spanner.InstanceArgs;
import io.pulumi.gcp.spanner.inputs.InstanceState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An isolated set of Cloud Spanner resources on which databases can be
 * hosted.
 * 
 * To get more information about Instance, see:
 * 
 * * [API documentation](https://cloud.google.com/spanner/docs/reference/rest/v1/projects.instances)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/spanner/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Instance can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:spanner/instance:Instance default projects/{{project}}/instances/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:spanner/instance:Instance default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:spanner/instance:Instance default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:spanner/instance:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * The name of the instance's configuration (similar but not
     * quite the same as a region) which defines the geographic placement and
     * replication of your databases in this instance. It determines where your data
     * is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
     * In order to obtain a valid list please consult the
     * [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
     * 
     */
    @Export(name="config", type=String.class, parameters={})
    private Output<String> config;

    /**
     * @return The name of the instance's configuration (similar but not
     * quite the same as a region) which defines the geographic placement and
     * replication of your databases in this instance. It determines where your data
     * is stored. Values are typically of the form `regional-europe-west1` , `us-central` etc.
     * In order to obtain a valid list please consult the
     * [Configuration section of the docs](https://cloud.google.com/spanner/docs/instances).
     * 
     */
    public Output<String> getConfig() {
        return this.config;
    }
    /**
     * The descriptive name for this instance as it appears in UIs. Must be
     * unique per project and between 4 and 30 characters in length.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The descriptive name for this instance as it appears in UIs. Must be
     * unique per project and between 4 and 30 characters in length.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * When deleting a spanner instance, this boolean option will delete all backups of this instance.
     * This must be set to true if you created a backup manually in the console.
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return When deleting a spanner instance, this boolean option will delete all backups of this instance.
     * This must be set to true if you created a backup manually in the console.
     * 
     */
    public Output</* @Nullable */ Boolean> getForceDestroy() {
        return this.forceDestroy;
    }
    /**
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * A unique identifier for the instance, which cannot be changed after
     * the instance is created. The name must be between 6 and 30 characters
     * in length.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique identifier for the instance, which cannot be changed after
     * the instance is created. The name must be between 6 and 30 characters
     * in length.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The number of nodes allocated to this instance. Exactly one of either node_count or processing_units must be present in
     * terraform.
     * 
     */
    @Export(name="numNodes", type=Integer.class, parameters={})
    private Output<Integer> numNodes;

    /**
     * @return The number of nodes allocated to this instance. Exactly one of either node_count or processing_units must be present in
     * terraform.
     * 
     */
    public Output<Integer> getNumNodes() {
        return this.numNodes;
    }
    /**
     * The number of processing units allocated to this instance. Exactly one of processing_units or node_count must be present
     * in terraform.
     * 
     */
    @Export(name="processingUnits", type=Integer.class, parameters={})
    private Output<Integer> processingUnits;

    /**
     * @return The number of processing units allocated to this instance. Exactly one of processing_units or node_count must be present
     * in terraform.
     * 
     */
    public Output<Integer> getProcessingUnits() {
        return this.processingUnits;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Instance status: 'CREATING' or 'READY'.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Instance status: 'CREATING' or 'READY'.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    public interface BuilderApplicator {
        public void apply(InstanceArgs.Builder a);
    }
    private static io.pulumi.gcp.spanner.InstanceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.spanner.InstanceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Instance(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:spanner/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:spanner/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
