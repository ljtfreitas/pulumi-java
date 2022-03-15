// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.artifactregistry;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.artifactregistry.RepositoryArgs;
import io.pulumi.gcp.artifactregistry.inputs.RepositoryState;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A repository for storing artifacts
 * 
 * To get more information about Repository, see:
 * 
 * * [API documentation](https://cloud.google.com/artifact-registry/docs/reference/rest/v1beta2/projects.locations.repositories)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/artifact-registry/docs/overview)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Repository can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:artifactregistry/repository:Repository default projects/{{project}}/locations/{{location}}/repositories/{{repository_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:artifactregistry/repository:Repository default {{project}}/{{location}}/{{repository_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:artifactregistry/repository:Repository default {{location}}/{{repository_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:artifactregistry/repository:Repository default {{repository_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:artifactregistry/repository:Repository")
public class Repository extends io.pulumi.resources.CustomResource {
    /**
     * The time when the repository was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the repository was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The user-provided description of the repository.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The user-provided description of the repository.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The format of packages that are stored in the repository. You can only create
     * alpha formats if you are a member of the [alpha user group](https://cloud.google.com/artifact-registry/docs/supported-formats#alpha-access).
     * - DOCKER
     * - MAVEN ([Preview](https://cloud.google.com/products#product-launch-stages))
     * - NPM ([Preview](https://cloud.google.com/products#product-launch-stages))
     * - PYTHON ([Preview](https://cloud.google.com/products#product-launch-stages))
     * - APT ([alpha](https://cloud.google.com/products#product-launch-stages))
     * - YUM ([alpha](https://cloud.google.com/products#product-launch-stages))
     * - HELM ([alpha](https://cloud.google.com/products#product-launch-stages))
     * 
     */
    @Export(name="format", type=String.class, parameters={})
    private Output<String> format;

    /**
     * @return The format of packages that are stored in the repository. You can only create
     * alpha formats if you are a member of the [alpha user group](https://cloud.google.com/artifact-registry/docs/supported-formats#alpha-access).
     * - DOCKER
     * - MAVEN ([Preview](https://cloud.google.com/products#product-launch-stages))
     * - NPM ([Preview](https://cloud.google.com/products#product-launch-stages))
     * - PYTHON ([Preview](https://cloud.google.com/products#product-launch-stages))
     * - APT ([alpha](https://cloud.google.com/products#product-launch-stages))
     * - YUM ([alpha](https://cloud.google.com/products#product-launch-stages))
     * - HELM ([alpha](https://cloud.google.com/products#product-launch-stages))
     * 
     */
    public Output<String> getFormat() {
        return this.format;
    }
    /**
     * The Cloud KMS resource name of the customer managed encryption key that’s
     * used to encrypt the contents of the Repository. Has the form:
     * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
     * This value may not be changed after the Repository has been created.
     * 
     */
    @Export(name="kmsKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyName;

    /**
     * @return The Cloud KMS resource name of the customer managed encryption key that’s
     * used to encrypt the contents of the Repository. Has the form:
     * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
     * This value may not be changed after the Repository has been created.
     * 
     */
    public Output</* @Nullable */ String> getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * Labels with user-defined metadata.
     * This field may contain up to 64 entries. Label keys and values may be no
     * longer than 63 characters. Label keys must begin with a lowercase letter
     * and may only contain lowercase letters, numeric characters, underscores,
     * and dashes.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels with user-defined metadata.
     * This field may contain up to 64 entries. Label keys and values may be no
     * longer than 63 characters. Label keys must begin with a lowercase letter
     * and may only contain lowercase letters, numeric characters, underscores,
     * and dashes.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The name of the location this repository is located in.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The name of the location this repository is located in.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the repository, for example: "projects/p1/locations/us-central1/repositories/repo1"
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the repository, for example: "projects/p1/locations/us-central1/repositories/repo1"
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
     * The last part of the repository name, for example:
     * "repo1"
     * 
     */
    @Export(name="repositoryId", type=String.class, parameters={})
    private Output<String> repositoryId;

    /**
     * @return The last part of the repository name, for example:
     * "repo1"
     * 
     */
    public Output<String> getRepositoryId() {
        return this.repositoryId;
    }
    /**
     * The time when the repository was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time when the repository was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(RepositoryArgs.Builder a);
    }
    private static io.pulumi.gcp.artifactregistry.RepositoryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.artifactregistry.RepositoryArgs.builder();
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
    public Repository(String name, RepositoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Repository(String name, RepositoryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:artifactregistry/repository:Repository", name, args == null ? RepositoryArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Repository(String name, Output<String> id, @Nullable RepositoryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:artifactregistry/repository:Repository", name, state, makeResourceOptions(options, id));
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
