// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.elasticsan;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.elasticsan.VolumeGroupArgs;
import com.pulumi.azurenative.elasticsan.outputs.NetworkRuleSetResponse;
import com.pulumi.azurenative.elasticsan.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
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
 * Response for Volume Group request.
 * API Version: 2021-11-20-preview.
 * 
 * ## Example Usage
 * ### VolumeGroups_Create_MaximumSet_Gen
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
 *         var volumeGroup = new VolumeGroup(&#34;volumeGroup&#34;, VolumeGroupArgs.builder()        
 *             .elasticSanName(&#34;33zg-7s_4_7L2_65o&#34;)
 *             .encryption(&#34;EncryptionAtRestWithPlatformKey&#34;)
 *             .location(&#34;aaaaaaaaaaaaaaaaaaaaaa&#34;)
 *             .networkAcls(Map.of(&#34;virtualNetworkRules&#34;, Map.ofEntries(
 *                 Map.entry(&#34;action&#34;, &#34;Allow&#34;),
 *                 Map.entry(&#34;virtualNetworkResourceId&#34;, &#34;aa&#34;)
 *             )))
 *             .protocolType(&#34;Iscsi&#34;)
 *             .resourceGroupName(&#34;rgelasticsan&#34;)
 *             .tags(Map.of(&#34;key3582&#34;, &#34;a&#34;))
 *             .volumeGroupName(&#34;9_67U25-1f2gR3-b6L-4T5&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### VolumeGroups_Create_MinimumSet_Gen
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
 *         var volumeGroup = new VolumeGroup(&#34;volumeGroup&#34;, VolumeGroupArgs.builder()        
 *             .elasticSanName(&#34;33zg-7s_4_7L2_65o&#34;)
 *             .resourceGroupName(&#34;rgelasticsan&#34;)
 *             .volumeGroupName(&#34;9_67U25-1f2gR3-b6L-4T5&#34;)
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
 * $ pulumi import azure-native:elasticsan:VolumeGroup 9_67U25-1f2gR3-b6L-4T5 /subscriptions/aaaaaaaaaaaaaaaaaaa/resourceGroups/rgelasticsan/providers/Microsoft.ElasticSan/elasticSans/33zg-7s_4_7L2_65o/volumeGroups/9_67U25-1f2gR3-b6L-4T5 
 * ```
 * 
 */
@ResourceType(type="azure-native:elasticsan:VolumeGroup")
public class VolumeGroup extends com.pulumi.resources.CustomResource {
    /**
     * Type of encryption
     * 
     */
    @Export(name="encryption", type=String.class, parameters={})
    private Output<String> encryption;

    /**
     * @return Type of encryption
     * 
     */
    public Output<String> encryption() {
        return this.encryption;
    }
    /**
     * The geo-location where the resource lives.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The geo-location where the resource lives.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Azure resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A collection of rules governing the accessibility from specific network locations.
     * 
     */
    @Export(name="networkAcls", type=NetworkRuleSetResponse.class, parameters={})
    private Output</* @Nullable */ NetworkRuleSetResponse> networkAcls;

    /**
     * @return A collection of rules governing the accessibility from specific network locations.
     * 
     */
    public Output<Optional<NetworkRuleSetResponse>> networkAcls() {
        return Codegen.optional(this.networkAcls);
    }
    /**
     * Type of storage target
     * 
     */
    @Export(name="protocolType", type=String.class, parameters={})
    private Output<String> protocolType;

    /**
     * @return Type of storage target
     * 
     */
    public Output<String> protocolType() {
        return this.protocolType;
    }
    /**
     * State of the operation on the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return State of the operation on the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource metadata required by ARM RPC
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Resource metadata required by ARM RPC
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Azure resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Azure resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Azure resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VolumeGroup(String name) {
        this(name, VolumeGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VolumeGroup(String name, VolumeGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VolumeGroup(String name, VolumeGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:elasticsan:VolumeGroup", name, args == null ? VolumeGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VolumeGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:elasticsan:VolumeGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:elasticsan/v20211120preview:VolumeGroup").build())
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
    public static VolumeGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VolumeGroup(name, id, options);
    }
}
