// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.media.TransformArgs;
import com.pulumi.azurenative.media.outputs.SystemDataResponse;
import com.pulumi.azurenative.media.outputs.TransformOutputResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Transform encapsulates the rules or instructions for generating desired outputs from input media, such as by transcoding or by extracting insights. After the Transform is created, it can be applied to input media by creating Jobs.
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * ### Create or update a Transform
 * 
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
 *         var transform = new Transform(&#34;transform&#34;, TransformArgs.builder()        
 *             .accountName(&#34;contosomedia&#34;)
 *             .description(&#34;Example Transform to illustrate create and update.&#34;)
 *             .outputs(Map.of(&#34;preset&#34;, Map.ofEntries(
 *                 Map.entry(&#34;odataType&#34;, &#34;#Microsoft.Media.BuiltInStandardEncoderPreset&#34;),
 *                 Map.entry(&#34;presetName&#34;, &#34;AdaptiveStreaming&#34;)
 *             )))
 *             .resourceGroupName(&#34;contosoresources&#34;)
 *             .transformName(&#34;createdTransform&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:media:Transform createdTransform /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/contosoresources/providers/Microsoft.Media/mediaservices/contosomedia/transforms/createdTransform 
 * ```
 * 
 */
@ResourceType(type="azure-native:media:Transform")
public class Transform extends com.pulumi.resources.CustomResource {
    /**
     * The UTC date and time when the Transform was created, in &#39;YYYY-MM-DDThh:mm:ssZ&#39; format.
     * 
     */
    @Export(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return The UTC date and time when the Transform was created, in &#39;YYYY-MM-DDThh:mm:ssZ&#39; format.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * An optional verbose description of the Transform.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional verbose description of the Transform.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The UTC date and time when the Transform was last updated, in &#39;YYYY-MM-DDThh:mm:ssZ&#39; format.
     * 
     */
    @Export(name="lastModified", type=String.class, parameters={})
    private Output<String> lastModified;

    /**
     * @return The UTC date and time when the Transform was last updated, in &#39;YYYY-MM-DDThh:mm:ssZ&#39; format.
     * 
     */
    public Output<String> lastModified() {
        return this.lastModified;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * An array of one or more TransformOutputs that the Transform should generate.
     * 
     */
    @Export(name="outputs", type=List.class, parameters={TransformOutputResponse.class})
    private Output<List<TransformOutputResponse>> outputs;

    /**
     * @return An array of one or more TransformOutputs that the Transform should generate.
     * 
     */
    public Output<List<TransformOutputResponse>> outputs() {
        return this.outputs;
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Transform(String name) {
        this(name, TransformArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Transform(String name, TransformArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Transform(String name, TransformArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:Transform", name, args == null ? TransformArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Transform(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:Transform", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:media/v20180330preview:Transform").build()),
                Output.of(Alias.builder().type("azure-native:media/v20180601preview:Transform").build()),
                Output.of(Alias.builder().type("azure-native:media/v20180701:Transform").build()),
                Output.of(Alias.builder().type("azure-native:media/v20200501:Transform").build()),
                Output.of(Alias.builder().type("azure-native:media/v20210601:Transform").build()),
                Output.of(Alias.builder().type("azure-native:media/v20211101:Transform").build())
            ))
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
    public static Transform get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Transform(name, id, options);
    }
}
