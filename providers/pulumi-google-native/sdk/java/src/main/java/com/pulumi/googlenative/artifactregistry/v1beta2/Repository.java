// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.artifactregistry.v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.artifactregistry.v1beta2.RepositoryArgs;
import com.pulumi.googlenative.artifactregistry.v1beta2.outputs.MavenRepositoryConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a repository. The returned Operation will finish once the repository has been created. Its response will be the created Repository.
 * 
 */
@ResourceType(type="google-native:artifactregistry/v1beta2:Repository")
public class Repository extends com.pulumi.resources.CustomResource {
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
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The user-provided description of the repository.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The user-provided description of the repository.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The format of packages that are stored in the repository.
     * 
     */
    @Export(name="format", type=String.class, parameters={})
    private Output<String> format;

    /**
     * @return The format of packages that are stored in the repository.
     * 
     */
    public Output<String> format() {
        return this.format;
    }
    /**
     * The Cloud KMS resource name of the customer managed encryption key that&#39;s used to encrypt the contents of the Repository. Has the form: `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. This value may not be changed after the Repository has been created.
     * 
     */
    @Export(name="kmsKeyName", type=String.class, parameters={})
    private Output<String> kmsKeyName;

    /**
     * @return The Cloud KMS resource name of the customer managed encryption key that&#39;s used to encrypt the contents of the Repository. Has the form: `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. This value may not be changed after the Repository has been created.
     * 
     */
    public Output<String> kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * Labels with user-defined metadata. This field may contain up to 64 entries. Label keys and values may be no longer than 63 characters. Label keys must begin with a lowercase letter and may only contain lowercase letters, numeric characters, underscores, and dashes.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels with user-defined metadata. This field may contain up to 64 entries. Label keys and values may be no longer than 63 characters. Label keys must begin with a lowercase letter and may only contain lowercase letters, numeric characters, underscores, and dashes.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * Maven repository config contains repository level configuration for the repositories of maven type.
     * 
     */
    @Export(name="mavenConfig", type=MavenRepositoryConfigResponse.class, parameters={})
    private Output<MavenRepositoryConfigResponse> mavenConfig;

    /**
     * @return Maven repository config contains repository level configuration for the repositories of maven type.
     * 
     */
    public Output<MavenRepositoryConfigResponse> mavenConfig() {
        return this.mavenConfig;
    }
    /**
     * The name of the repository, for example: &#34;projects/p1/locations/us-central1/repositories/repo1&#34;.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the repository, for example: &#34;projects/p1/locations/us-central1/repositories/repo1&#34;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * The repository id to use for this repository.
     * 
     */
    @Export(name="repositoryId", type=String.class, parameters={})
    private Output</* @Nullable */ String> repositoryId;

    /**
     * @return The repository id to use for this repository.
     * 
     */
    public Output<Optional<String>> repositoryId() {
        return Codegen.optional(this.repositoryId);
    }
    /**
     * The size, in bytes, of all artifact storage in this repository. Repositories that are generally available or in public preview use this to calculate storage costs.
     * 
     */
    @Export(name="sizeBytes", type=String.class, parameters={})
    private Output<String> sizeBytes;

    /**
     * @return The size, in bytes, of all artifact storage in this repository. Repositories that are generally available or in public preview use this to calculate storage costs.
     * 
     */
    public Output<String> sizeBytes() {
        return this.sizeBytes;
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
    public Output<String> updateTime() {
        return this.updateTime;
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
    public Repository(String name, @Nullable RepositoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:artifactregistry/v1beta2:Repository", name, args == null ? RepositoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Repository(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:artifactregistry/v1beta2:Repository", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Repository get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Repository(name, id, options);
    }
}
