// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.VirtualHubArgs;
import com.pulumi.azure.network.inputs.VirtualHubState;
import com.pulumi.azure.network.outputs.VirtualHubRoute;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Virtual Hub within a Virtual WAN.
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
 *         var exampleVirtualWan = new VirtualWan(&#34;exampleVirtualWan&#34;, VirtualWanArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .build());
 * 
 *         var exampleVirtualHub = new VirtualHub(&#34;exampleVirtualHub&#34;, VirtualHubArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .virtualWanId(exampleVirtualWan.getId())
 *             .addressPrefix(&#34;10.0.0.0/23&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Virtual Hub&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/virtualHub:VirtualHub example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/virtualHubs/hub1
 * ```
 * 
 */
@ResourceType(type="azure:network/virtualHub:VirtualHub")
public class VirtualHub extends com.pulumi.resources.CustomResource {
    /**
     * The Address Prefix which should be used for this Virtual Hub. Changing this forces a new resource to be created. [The address prefix subnet cannot be smaller than a `/24`. Azure recommends using a `/23`](https://docs.microsoft.com/en-us/azure/virtual-wan/virtual-wan-faq#what-is-the-recommended-hub-address-space-during-hub-creation).
     * 
     */
    @Export(name="addressPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> addressPrefix;

    /**
     * @return The Address Prefix which should be used for this Virtual Hub. Changing this forces a new resource to be created. [The address prefix subnet cannot be smaller than a `/24`. Azure recommends using a `/23`](https://docs.microsoft.com/en-us/azure/virtual-wan/virtual-wan-faq#what-is-the-recommended-hub-address-space-during-hub-creation).
     * 
     */
    public Output<Optional<String>> addressPrefix() {
        return Codegen.optional(this.addressPrefix);
    }
    /**
     * The ID of the default Route Table in the Virtual Hub.
     * 
     */
    @Export(name="defaultRouteTableId", type=String.class, parameters={})
    private Output<String> defaultRouteTableId;

    /**
     * @return The ID of the default Route Table in the Virtual Hub.
     * 
     */
    public Output<String> defaultRouteTableId() {
        return this.defaultRouteTableId;
    }
    /**
     * Specifies the supported Azure location where the Virtual Hub should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the Virtual Hub should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the Virtual Hub. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Virtual Hub. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the name of the Resource Group where the Virtual Hub should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the Virtual Hub should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * One or more `route` blocks as defined below.
     * 
     */
    @Export(name="routes", type=List.class, parameters={VirtualHubRoute.class})
    private Output</* @Nullable */ List<VirtualHubRoute>> routes;

    /**
     * @return One or more `route` blocks as defined below.
     * 
     */
    public Output<Optional<List<VirtualHubRoute>>> routes() {
        return Codegen.optional(this.routes);
    }
    /**
     * The SKU of the Virtual Hub. Possible values are `Basic` and `Standard`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="sku", type=String.class, parameters={})
    private Output</* @Nullable */ String> sku;

    /**
     * @return The SKU of the Virtual Hub. Possible values are `Basic` and `Standard`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * A mapping of tags to assign to the Virtual Hub.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the Virtual Hub.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The Autonomous System Number of the Virtual Hub BGP router.
     * 
     */
    @Export(name="virtualRouterAsn", type=Integer.class, parameters={})
    private Output<Integer> virtualRouterAsn;

    /**
     * @return The Autonomous System Number of the Virtual Hub BGP router.
     * 
     */
    public Output<Integer> virtualRouterAsn() {
        return this.virtualRouterAsn;
    }
    /**
     * The IP addresses of the Virtual Hub BGP router.
     * 
     */
    @Export(name="virtualRouterIps", type=List.class, parameters={String.class})
    private Output<List<String>> virtualRouterIps;

    /**
     * @return The IP addresses of the Virtual Hub BGP router.
     * 
     */
    public Output<List<String>> virtualRouterIps() {
        return this.virtualRouterIps;
    }
    /**
     * The ID of a Virtual WAN within which the Virtual Hub should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="virtualWanId", type=String.class, parameters={})
    private Output</* @Nullable */ String> virtualWanId;

    /**
     * @return The ID of a Virtual WAN within which the Virtual Hub should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> virtualWanId() {
        return Codegen.optional(this.virtualWanId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualHub(String name) {
        this(name, VirtualHubArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualHub(String name, VirtualHubArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualHub(String name, VirtualHubArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/virtualHub:VirtualHub", name, args == null ? VirtualHubArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualHub(String name, Output<String> id, @Nullable VirtualHubState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/virtualHub:VirtualHub", name, state, makeResourceOptions(options, id));
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
    public static VirtualHub get(String name, Output<String> id, @Nullable VirtualHubState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualHub(name, id, state, options);
    }
}
