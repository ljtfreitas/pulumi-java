// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.wafregional.SizeConstraintSetArgs;
import com.pulumi.aws.wafregional.inputs.SizeConstraintSetState;
import com.pulumi.aws.wafregional.outputs.SizeConstraintSetSizeConstraint;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a WAF Regional Size Constraint Set Resource for use with Application Load Balancer.
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
 *         var sizeConstraintSet = new SizeConstraintSet(&#34;sizeConstraintSet&#34;, SizeConstraintSetArgs.builder()        
 *             .sizeConstraints(SizeConstraintSetSizeConstraint.builder()
 *                 .comparisonOperator(&#34;EQ&#34;)
 *                 .fieldToMatch(SizeConstraintSetSizeConstraintFieldToMatch.builder()
 *                     .type(&#34;BODY&#34;)
 *                     .build())
 *                 .size(&#34;4096&#34;)
 *                 .textTransformation(&#34;NONE&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * WAF Size Constraint Set can be imported using the id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:wafregional/sizeConstraintSet:SizeConstraintSet size_constraint_set a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:wafregional/sizeConstraintSet:SizeConstraintSet")
public class SizeConstraintSet extends com.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name or description of the Size Constraint Set.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name or description of the Size Constraint Set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the parts of web requests that you want to inspect the size of.
     * 
     */
    @Export(name="sizeConstraints", type=List.class, parameters={SizeConstraintSetSizeConstraint.class})
    private Output</* @Nullable */ List<SizeConstraintSetSizeConstraint>> sizeConstraints;

    /**
     * @return Specifies the parts of web requests that you want to inspect the size of.
     * 
     */
    public Output<Optional<List<SizeConstraintSetSizeConstraint>>> sizeConstraints() {
        return Codegen.optional(this.sizeConstraints);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SizeConstraintSet(String name) {
        this(name, SizeConstraintSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SizeConstraintSet(String name, @Nullable SizeConstraintSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SizeConstraintSet(String name, @Nullable SizeConstraintSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/sizeConstraintSet:SizeConstraintSet", name, args == null ? SizeConstraintSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SizeConstraintSet(String name, Output<String> id, @Nullable SizeConstraintSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/sizeConstraintSet:SizeConstraintSet", name, state, makeResourceOptions(options, id));
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
    public static SizeConstraintSet get(String name, Output<String> id, @Nullable SizeConstraintSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SizeConstraintSet(name, id, state, options);
    }
}
