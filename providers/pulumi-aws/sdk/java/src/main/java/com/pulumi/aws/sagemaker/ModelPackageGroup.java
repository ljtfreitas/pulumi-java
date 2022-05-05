// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sagemaker.ModelPackageGroupArgs;
import com.pulumi.aws.sagemaker.inputs.ModelPackageGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Sagemaker Model Package Group resource.
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
 *         var example = new ModelPackageGroup(&#34;example&#34;, ModelPackageGroupArgs.builder()        
 *             .modelPackageGroupName(&#34;example&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Sagemaker Code Model Package Groups can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/modelPackageGroup:ModelPackageGroup test_model_package_group my-code-repo
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/modelPackageGroup:ModelPackageGroup")
public class ModelPackageGroup extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Model Package Group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Model Package Group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A description for the model group.
     * 
     */
    @Export(name="modelPackageGroupDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> modelPackageGroupDescription;

    /**
     * @return A description for the model group.
     * 
     */
    public Output<Optional<String>> modelPackageGroupDescription() {
        return Codegen.optional(this.modelPackageGroupDescription);
    }
    /**
     * The name of the model group.
     * 
     */
    @Export(name="modelPackageGroupName", type=String.class, parameters={})
    private Output<String> modelPackageGroupName;

    /**
     * @return The name of the model group.
     * 
     */
    public Output<String> modelPackageGroupName() {
        return this.modelPackageGroupName;
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
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ModelPackageGroup(String name) {
        this(name, ModelPackageGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ModelPackageGroup(String name, ModelPackageGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ModelPackageGroup(String name, ModelPackageGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/modelPackageGroup:ModelPackageGroup", name, args == null ? ModelPackageGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ModelPackageGroup(String name, Output<String> id, @Nullable ModelPackageGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/modelPackageGroup:ModelPackageGroup", name, state, makeResourceOptions(options, id));
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
    public static ModelPackageGroup get(String name, Output<String> id, @Nullable ModelPackageGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ModelPackageGroup(name, id, state, options);
    }
}
