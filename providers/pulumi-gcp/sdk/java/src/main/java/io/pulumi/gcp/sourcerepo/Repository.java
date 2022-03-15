// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sourcerepo;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.sourcerepo.RepositoryArgs;
import io.pulumi.gcp.sourcerepo.inputs.RepositoryState;
import io.pulumi.gcp.sourcerepo.outputs.RepositoryPubsubConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A repository (or repo) is a Git repository storing versioned source content.
 * 
 * To get more information about Repository, see:
 * 
 * * [API documentation](https://cloud.google.com/source-repositories/docs/reference/rest/v1/projects.repos)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/source-repositories/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Repository can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:sourcerepo/repository:Repository default projects/{{project}}/repos/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:sourcerepo/repository:Repository default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:sourcerepo/repository:Repository")
public class Repository extends io.pulumi.resources.CustomResource {
    /**
     * Resource name of the repository, of the form `{{repo}}`.
     * The repo name may contain slashes. eg, `name/with/slash`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the repository, of the form `{{repo}}`.
     * The repo name may contain slashes. eg, `name/with/slash`
     * 
     */
    public Output<String> getName() {
        return this.name;
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
     * How this repository publishes a change in the repository through Cloud Pub/Sub.
     * Keyed by the topic names.
     * Structure is documented below.
     * 
     */
    @Export(name="pubsubConfigs", type=List.class, parameters={RepositoryPubsubConfig.class})
    private Output</* @Nullable */ List<RepositoryPubsubConfig>> pubsubConfigs;

    /**
     * @return How this repository publishes a change in the repository through Cloud Pub/Sub.
     * Keyed by the topic names.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<RepositoryPubsubConfig>> getPubsubConfigs() {
        return this.pubsubConfigs;
    }
    /**
     * The disk usage of the repo, in bytes.
     * 
     */
    @Export(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    /**
     * @return The disk usage of the repo, in bytes.
     * 
     */
    public Output<Integer> getSize() {
        return this.size;
    }
    /**
     * URL to clone the repository from Google Cloud Source Repositories.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    /**
     * @return URL to clone the repository from Google Cloud Source Repositories.
     * 
     */
    public Output<String> getUrl() {
        return this.url;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable RepositoryArgs.Builder a);
    }
    private static io.pulumi.gcp.sourcerepo.RepositoryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.sourcerepo.RepositoryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Repository(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Repository(String name) {
        this(name, RepositoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Repository(String name, @Nullable RepositoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Repository(String name, @Nullable RepositoryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:sourcerepo/repository:Repository", name, args == null ? RepositoryArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Repository(String name, Output<String> id, @Nullable RepositoryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:sourcerepo/repository:Repository", name, state, makeResourceOptions(options, id));
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
    public static Repository get(String name, Output<String> id, @Nullable RepositoryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Repository(name, id, state, options);
    }
}
