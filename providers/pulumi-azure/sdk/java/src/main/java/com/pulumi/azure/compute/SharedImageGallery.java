// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.SharedImageGalleryArgs;
import com.pulumi.azure.compute.inputs.SharedImageGalleryState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Shared Image Gallery.
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleSharedImageGallery = new SharedImageGallery(&#34;exampleSharedImageGallery&#34;, SharedImageGalleryArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .description(&#34;Shared images and things.&#34;)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Hello&#34;, &#34;There&#34;),
 *                 Map.entry(&#34;World&#34;, &#34;Example&#34;)
 *             ))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Shared Image Galleries can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/sharedImageGallery:SharedImageGallery gallery1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Compute/galleries/gallery1
 * ```
 * 
 */
@ResourceType(type="azure:compute/sharedImageGallery:SharedImageGallery")
public class SharedImageGallery extends com.pulumi.resources.CustomResource {
    /**
     * A description for this Shared Image Gallery.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for this Shared Image Gallery.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the Shared Image Gallery. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Shared Image Gallery. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which to create the Shared Image Gallery. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Shared Image Gallery. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags to assign to the Shared Image Gallery.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the Shared Image Gallery.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The Unique Name for this Shared Image Gallery.
     * 
     */
    @Export(name="uniqueName", type=String.class, parameters={})
    private Output<String> uniqueName;

    /**
     * @return The Unique Name for this Shared Image Gallery.
     * 
     */
    public Output<String> uniqueName() {
        return this.uniqueName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SharedImageGallery(String name) {
        this(name, SharedImageGalleryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SharedImageGallery(String name, SharedImageGalleryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SharedImageGallery(String name, SharedImageGalleryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/sharedImageGallery:SharedImageGallery", name, args == null ? SharedImageGalleryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SharedImageGallery(String name, Output<String> id, @Nullable SharedImageGalleryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/sharedImageGallery:SharedImageGallery", name, state, makeResourceOptions(options, id));
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
    public static SharedImageGallery get(String name, Output<String> id, @Nullable SharedImageGalleryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SharedImageGallery(name, id, state, options);
    }
}
