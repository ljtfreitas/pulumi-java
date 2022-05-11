// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.CustomIPPrefixArgs;
import com.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
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
 * Custom IP prefix resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * ### Create custom IP prefix allocation method
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
 *         var customIPPrefix = new CustomIPPrefix(&#34;customIPPrefix&#34;, CustomIPPrefixArgs.builder()        
 *             .cidr(&#34;0.0.0.0/24&#34;)
 *             .customIpPrefixName(&#34;test-customipprefix&#34;)
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
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
 * $ pulumi import azure-native:network:CustomIPPrefix test-customipprefix /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/customIpPrefixes/test-customipprefix 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:CustomIPPrefix")
public class CustomIPPrefix extends com.pulumi.resources.CustomResource {
    /**
     * The prefix range in CIDR notation. Should include the start address and the prefix length.
     * 
     */
    @Export(name="cidr", type=String.class, parameters={})
    private Output</* @Nullable */ String> cidr;

    /**
     * @return The prefix range in CIDR notation. Should include the start address and the prefix length.
     * 
     */
    public Output<Optional<String>> cidr() {
        return Codegen.optional(this.cidr);
    }
    /**
     * The commissioned state of the Custom IP Prefix.
     * 
     */
    @Export(name="commissionedState", type=String.class, parameters={})
    private Output</* @Nullable */ String> commissionedState;

    /**
     * @return The commissioned state of the Custom IP Prefix.
     * 
     */
    public Output<Optional<String>> commissionedState() {
        return Codegen.optional(this.commissionedState);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The extended location of the custom IP prefix.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location of the custom IP prefix.
     * 
     */
    public Output<Optional<ExtendedLocationResponse>> extendedLocation() {
        return Codegen.optional(this.extendedLocation);
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The provisioning state of the custom IP prefix resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the custom IP prefix resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The list of all referenced PublicIpPrefixes.
     * 
     */
    @Export(name="publicIpPrefixes", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> publicIpPrefixes;

    /**
     * @return The list of all referenced PublicIpPrefixes.
     * 
     */
    public Output<List<SubResourceResponse>> publicIpPrefixes() {
        return this.publicIpPrefixes;
    }
    /**
     * The resource GUID property of the custom IP prefix resource.
     * 
     */
    @Export(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the custom IP prefix resource.
     * 
     */
    public Output<String> resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomIPPrefix(String name) {
        this(name, CustomIPPrefixArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomIPPrefix(String name, CustomIPPrefixArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomIPPrefix(String name, CustomIPPrefixArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:CustomIPPrefix", name, args == null ? CustomIPPrefixArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomIPPrefix(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:CustomIPPrefix", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20200601:CustomIPPrefix").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:CustomIPPrefix").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:CustomIPPrefix").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:CustomIPPrefix").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:CustomIPPrefix").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:CustomIPPrefix").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:CustomIPPrefix").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210801:CustomIPPrefix").build())
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
    public static CustomIPPrefix get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomIPPrefix(name, id, options);
    }
}
