// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datafactory.ManagedPrivateEndpointArgs;
import com.pulumi.azurenative.datafactory.outputs.ManagedPrivateEndpointResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Managed private endpoint resource type.
 * API Version: 2018-06-01.
 * 
 * ## Example Usage
 * ### ManagedVirtualNetworks_Create
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
 *         var managedPrivateEndpoint = new ManagedPrivateEndpoint(&#34;managedPrivateEndpoint&#34;, ManagedPrivateEndpointArgs.builder()        
 *             .factoryName(&#34;exampleFactoryName&#34;)
 *             .managedPrivateEndpointName(&#34;exampleManagedPrivateEndpointName&#34;)
 *             .managedVirtualNetworkName(&#34;exampleManagedVirtualNetworkName&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;fqdns&#34;, ),
 *                 Map.entry(&#34;groupId&#34;, &#34;blob&#34;),
 *                 Map.entry(&#34;privateLinkResourceId&#34;, &#34;/subscriptions/12345678-1234-1234-1234-12345678abc/resourceGroups/exampleResourceGroup/providers/Microsoft.Storage/storageAccounts/exampleBlobStorage&#34;)
 *             ))
 *             .resourceGroupName(&#34;exampleResourceGroup&#34;)
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
 * $ pulumi import azure-native:datafactory:ManagedPrivateEndpoint exampleManagedPrivateEndpointName /subscriptions/12345678-1234-1234-1234-12345678abc/resourceGroups/exampleResourceGroup/providers/Microsoft.DataFactory/factories/exampleFactoryName/managedVirtualNetworks/exampleManagedVirtualNetworkName/managedPrivateEndpoints/exampleManagedPrivateEndpointName 
 * ```
 * 
 */
@ResourceType(type="azure-native:datafactory:ManagedPrivateEndpoint")
public class ManagedPrivateEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * Etag identifies change in the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Etag identifies change in the resource.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Managed private endpoint properties.
     * 
     */
    @Export(name="properties", type=ManagedPrivateEndpointResponse.class, parameters={})
    private Output<ManagedPrivateEndpointResponse> properties;

    /**
     * @return Managed private endpoint properties.
     * 
     */
    public Output<ManagedPrivateEndpointResponse> properties() {
        return this.properties;
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedPrivateEndpoint(String name) {
        this(name, ManagedPrivateEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedPrivateEndpoint(String name, ManagedPrivateEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedPrivateEndpoint(String name, ManagedPrivateEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datafactory:ManagedPrivateEndpoint", name, args == null ? ManagedPrivateEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedPrivateEndpoint(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datafactory:ManagedPrivateEndpoint", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:datafactory/v20180601:ManagedPrivateEndpoint").build())
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
    public static ManagedPrivateEndpoint get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedPrivateEndpoint(name, id, options);
    }
}
