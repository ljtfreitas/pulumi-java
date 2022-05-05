// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.memorydb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.memorydb.ParameterGroupArgs;
import com.pulumi.aws.memorydb.inputs.ParameterGroupState;
import com.pulumi.aws.memorydb.outputs.ParameterGroupParameter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a MemoryDB Parameter Group.
 * 
 * More information about parameter groups can be found in the [MemoryDB User Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/parametergroups.html).
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
 *         var example = new ParameterGroup(&#34;example&#34;, ParameterGroupArgs.builder()        
 *             .family(&#34;memorydb_redis6&#34;)
 *             .parameters(ParameterGroupParameter.builder()
 *                 .name(&#34;activedefrag&#34;)
 *                 .value(&#34;yes&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Use the `name` to import a parameter group. For example
 * 
 * ```sh
 *  $ pulumi import aws:memorydb/parameterGroup:ParameterGroup example my-parameter-group
 * ```
 * 
 */
@ResourceType(type="aws:memorydb/parameterGroup:ParameterGroup")
public class ParameterGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the parameter group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the parameter group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The engine version that the parameter group can be used with.
     * 
     */
    @Export(name="family", type=String.class, parameters={})
    private Output<String> family;

    /**
     * @return The engine version that the parameter group can be used with.
     * 
     */
    public Output<String> family() {
        return this.family;
    }
    /**
     * The name of the parameter.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the parameter.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * Set of MemoryDB parameters to apply. Any parameters not specified will fall back to their family defaults. Detailed below.
     * 
     */
    @Export(name="parameters", type=List.class, parameters={ParameterGroupParameter.class})
    private Output</* @Nullable */ List<ParameterGroupParameter>> parameters;

    /**
     * @return Set of MemoryDB parameters to apply. Any parameters not specified will fall back to their family defaults. Detailed below.
     * 
     */
    public Output<Optional<List<ParameterGroupParameter>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ParameterGroup(String name) {
        this(name, ParameterGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ParameterGroup(String name, ParameterGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ParameterGroup(String name, ParameterGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:memorydb/parameterGroup:ParameterGroup", name, args == null ? ParameterGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ParameterGroup(String name, Output<String> id, @Nullable ParameterGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:memorydb/parameterGroup:ParameterGroup", name, state, makeResourceOptions(options, id));
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
    public static ParameterGroup get(String name, Output<String> id, @Nullable ParameterGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ParameterGroup(name, id, state, options);
    }
}
