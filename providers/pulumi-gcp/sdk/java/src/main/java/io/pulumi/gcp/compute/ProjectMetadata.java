// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.ProjectMetadataArgs;
import io.pulumi.gcp.compute.inputs.ProjectMetadataState;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Authoritatively manages metadata common to all instances for a project in GCE. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/storing-retrieving-metadata)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/projects/setCommonInstanceMetadata).
 * 
 * > **Note:**  This resource manages all project-level metadata including project-level ssh keys.
 * Keys unset in config but set on the server will be removed. If you want to manage only single
 * key/value pairs within the project metadata rather than the entire set, then use
 * google_compute_project_metadata_item.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource can be imported using the project ID
 * 
 * ```sh
 *  $ pulumi import gcp:compute/projectMetadata:ProjectMetadata foo my-project-id`
 * ```
 * 
 */
@ResourceType(type="gcp:compute/projectMetadata:ProjectMetadata")
public class ProjectMetadata extends io.pulumi.resources.CustomResource {
    /**
     * A series of key value pairs.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> metadata;

    /**
     * @return A series of key value pairs.
     * 
     */
    public Output<Map<String,String>> getMetadata() {
        return this.metadata;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }

    public interface BuilderApplicator {
        public void apply(ProjectMetadataArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.ProjectMetadataArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.ProjectMetadataArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ProjectMetadata(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProjectMetadata(String name) {
        this(name, ProjectMetadataArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProjectMetadata(String name, ProjectMetadataArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectMetadata(String name, ProjectMetadataArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/projectMetadata:ProjectMetadata", name, args == null ? ProjectMetadataArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ProjectMetadata(String name, Output<String> id, @Nullable ProjectMetadataState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/projectMetadata:ProjectMetadata", name, state, makeResourceOptions(options, id));
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
    public static ProjectMetadata get(String name, Output<String> id, @Nullable ProjectMetadataState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProjectMetadata(name, id, state, options);
    }
}
