// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sagemaker.CodeRepositoryArgs;
import com.pulumi.aws.sagemaker.inputs.CodeRepositoryState;
import com.pulumi.aws.sagemaker.outputs.CodeRepositoryGitConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Sagemaker Code Repository resource.
 * 
 * ## Example Usage
 * ### Basic usage
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
 *         var example = new CodeRepository(&#34;example&#34;, CodeRepositoryArgs.builder()        
 *             .codeRepositoryName(&#34;example&#34;)
 *             .gitConfig(CodeRepositoryGitConfig.builder()
 *                 .repositoryUrl(&#34;https://github.com/hashicorp/terraform-provider-aws.git&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Example with Secret
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleSecret = new Secret(&#34;exampleSecret&#34;);
 * 
 *         var exampleSecretVersion = new SecretVersion(&#34;exampleSecretVersion&#34;, SecretVersionArgs.builder()        
 *             .secretId(exampleSecret.getId())
 *             .secretString(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;username&#34;, &#34;example&#34;),
 *                     jsonProperty(&#34;password&#34;, &#34;example&#34;)
 *                 )))
 *             .build());
 * 
 *         var exampleCodeRepository = new CodeRepository(&#34;exampleCodeRepository&#34;, CodeRepositoryArgs.builder()        
 *             .codeRepositoryName(&#34;example&#34;)
 *             .gitConfig(CodeRepositoryGitConfig.builder()
 *                 .repositoryUrl(&#34;https://github.com/hashicorp/terraform-provider-aws.git&#34;)
 *                 .secretArn(exampleSecret.getArn())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Sagemaker Code Repositories can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/codeRepository:CodeRepository test_code_repository my-code-repo
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/codeRepository:CodeRepository")
public class CodeRepository extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Code Repository.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Code Repository.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the Code Repository (must be unique).
     * 
     */
    @Export(name="codeRepositoryName", type=String.class, parameters={})
    private Output<String> codeRepositoryName;

    /**
     * @return The name of the Code Repository (must be unique).
     * 
     */
    public Output<String> codeRepositoryName() {
        return this.codeRepositoryName;
    }
    /**
     * Specifies details about the repository. see Git Config details below.
     * 
     */
    @Export(name="gitConfig", type=CodeRepositoryGitConfig.class, parameters={})
    private Output<CodeRepositoryGitConfig> gitConfig;

    /**
     * @return Specifies details about the repository. see Git Config details below.
     * 
     */
    public Output<CodeRepositoryGitConfig> gitConfig() {
        return this.gitConfig;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CodeRepository(String name) {
        this(name, CodeRepositoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CodeRepository(String name, CodeRepositoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CodeRepository(String name, CodeRepositoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/codeRepository:CodeRepository", name, args == null ? CodeRepositoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CodeRepository(String name, Output<String> id, @Nullable CodeRepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/codeRepository:CodeRepository", name, state, makeResourceOptions(options, id));
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
    public static CodeRepository get(String name, Output<String> id, @Nullable CodeRepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CodeRepository(name, id, state, options);
    }
}
