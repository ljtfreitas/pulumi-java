// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecrpublic;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ecrpublic.RepositoryArgs;
import com.pulumi.aws.ecrpublic.inputs.RepositoryState;
import com.pulumi.aws.ecrpublic.outputs.RepositoryCatalogData;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Public Elastic Container Registry Repository.
 * 
 * &gt; **NOTE:** This resource can only be used with `us-east-1` region.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var usEast1 = new Provider(&#34;usEast1&#34;, ProviderArgs.builder()        
 *             .region(&#34;us-east-1&#34;)
 *             .build());
 * 
 *         var foo = new Repository(&#34;foo&#34;, RepositoryArgs.builder()        
 *             .repositoryName(&#34;bar&#34;)
 *             .catalogData(RepositoryCatalogData.builder()
 *                 .aboutText(&#34;About Text&#34;)
 *                 .architectures(&#34;ARM&#34;)
 *                 .description(&#34;Description&#34;)
 *                 .logoImageBlob(Base64.getEncoder().encodeToString(Files.readAllBytes(Paths.get(image.getPng()))))
 *                 .operatingSystems(&#34;Linux&#34;)
 *                 .usageText(&#34;Usage Text&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * ECR Public Repositories can be imported using the `repository_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ecrpublic/repository:Repository example example
 * ```
 * 
 */
@ResourceType(type="aws:ecrpublic/repository:Repository")
public class Repository extends com.pulumi.resources.CustomResource {
    /**
     * Full ARN of the repository.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Full ARN of the repository.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Catalog data configuration for the repository. See below for schema.
     * 
     */
    @Export(name="catalogData", type=RepositoryCatalogData.class, parameters={})
    private Output</* @Nullable */ RepositoryCatalogData> catalogData;

    /**
     * @return Catalog data configuration for the repository. See below for schema.
     * 
     */
    public Output<Optional<RepositoryCatalogData>> catalogData() {
        return Codegen.optional(this.catalogData);
    }
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * The registry ID where the repository was created.
     * 
     */
    @Export(name="registryId", type=String.class, parameters={})
    private Output<String> registryId;

    /**
     * @return The registry ID where the repository was created.
     * 
     */
    public Output<String> registryId() {
        return this.registryId;
    }
    /**
     * Name of the repository.
     * 
     */
    @Export(name="repositoryName", type=String.class, parameters={})
    private Output<String> repositoryName;

    /**
     * @return Name of the repository.
     * 
     */
    public Output<String> repositoryName() {
        return this.repositoryName;
    }
    /**
     * The URI of the repository.
     * 
     */
    @Export(name="repositoryUri", type=String.class, parameters={})
    private Output<String> repositoryUri;

    /**
     * @return The URI of the repository.
     * 
     */
    public Output<String> repositoryUri() {
        return this.repositoryUri;
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
    public Repository(String name, RepositoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecrpublic/repository:Repository", name, args == null ? RepositoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Repository(String name, Output<String> id, @Nullable RepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecrpublic/repository:Repository", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Repository get(String name, Output<String> id, @Nullable RepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Repository(name, id, state, options);
    }
}
