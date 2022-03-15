// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.SharedVPCHostProjectArgs;
import io.pulumi.gcp.compute.inputs.SharedVPCHostProjectState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Enables the Google Compute Engine
 * [Shared VPC](https://cloud.google.com/compute/docs/shared-vpc)
 * feature for a project, assigning it as a Shared VPC host project.
 * 
 * For more information, see,
 * [the Project API documentation](https://cloud.google.com/compute/docs/reference/latest/projects),
 * where the Shared VPC feature is referred to by its former name "XPN".
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Google Compute Engine Shared VPC host project feature can be imported using the `project`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:compute/sharedVPCHostProject:SharedVPCHostProject host host-project-id
 * ```
 * 
 */
@ResourceType(type="gcp:compute/sharedVPCHostProject:SharedVPCHostProject")
public class SharedVPCHostProject extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the project that will serve as a Shared VPC host project
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project that will serve as a Shared VPC host project
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }

    public interface BuilderApplicator {
        public void apply(SharedVPCHostProjectArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.SharedVPCHostProjectArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.SharedVPCHostProjectArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SharedVPCHostProject(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SharedVPCHostProject(String name) {
        this(name, SharedVPCHostProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SharedVPCHostProject(String name, SharedVPCHostProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SharedVPCHostProject(String name, SharedVPCHostProjectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/sharedVPCHostProject:SharedVPCHostProject", name, args == null ? SharedVPCHostProjectArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SharedVPCHostProject(String name, Output<String> id, @Nullable SharedVPCHostProjectState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/sharedVPCHostProject:SharedVPCHostProject", name, state, makeResourceOptions(options, id));
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
    public static SharedVPCHostProject get(String name, Output<String> id, @Nullable SharedVPCHostProjectState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SharedVPCHostProject(name, id, state, options);
    }
}
