// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.SharedVPCServiceProjectArgs;
import io.pulumi.gcp.compute.inputs.SharedVPCServiceProjectState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Enables the Google Compute Engine
 * [Shared VPC](https://cloud.google.com/compute/docs/shared-vpc)
 * feature for a project, assigning it as a Shared VPC service project associated
 * with a given host project.
 * 
 * For more information, see,
 * [the Project API documentation](https://cloud.google.com/compute/docs/reference/latest/projects),
 * where the Shared VPC feature is referred to by its former name "XPN".
 * 
 * > **Note:** If Shared VPC Admin role is set at the folder level, use the google-beta provider. The google provider only supports this permission at project or organizational level currently. [[0]](https://cloud.google.com/vpc/docs/provisioning-shared-vpc#enable-shared-vpc-host)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Google Compute Engine Shared VPC service project feature can be imported using the `host_project` and `service_project`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:compute/sharedVPCServiceProject:SharedVPCServiceProject service1 host-project-id/service-project-id-1
 * ```
 * 
 */
@ResourceType(type="gcp:compute/sharedVPCServiceProject:SharedVPCServiceProject")
public class SharedVPCServiceProject extends io.pulumi.resources.CustomResource {
    /**
     * The ID of a host project to associate.
     * 
     */
    @Export(name="hostProject", type=String.class, parameters={})
    private Output<String> hostProject;

    /**
     * @return The ID of a host project to associate.
     * 
     */
    public Output<String> getHostProject() {
        return this.hostProject;
    }
    /**
     * The ID of the project that will serve as a Shared VPC service project.
     * 
     */
    @Export(name="serviceProject", type=String.class, parameters={})
    private Output<String> serviceProject;

    /**
     * @return The ID of the project that will serve as a Shared VPC service project.
     * 
     */
    public Output<String> getServiceProject() {
        return this.serviceProject;
    }

    public interface BuilderApplicator {
        public void apply(SharedVPCServiceProjectArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.SharedVPCServiceProjectArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.SharedVPCServiceProjectArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SharedVPCServiceProject(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SharedVPCServiceProject(String name) {
        this(name, SharedVPCServiceProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SharedVPCServiceProject(String name, SharedVPCServiceProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SharedVPCServiceProject(String name, SharedVPCServiceProjectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/sharedVPCServiceProject:SharedVPCServiceProject", name, args == null ? SharedVPCServiceProjectArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SharedVPCServiceProject(String name, Output<String> id, @Nullable SharedVPCServiceProjectState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/sharedVPCServiceProject:SharedVPCServiceProject", name, state, makeResourceOptions(options, id));
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
    public static SharedVPCServiceProject get(String name, Output<String> id, @Nullable SharedVPCServiceProjectState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SharedVPCServiceProject(name, id, state, options);
    }
}
