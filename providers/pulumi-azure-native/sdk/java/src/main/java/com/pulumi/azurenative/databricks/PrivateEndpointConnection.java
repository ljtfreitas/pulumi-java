// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databricks;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.databricks.PrivateEndpointConnectionArgs;
import com.pulumi.azurenative.databricks.outputs.PrivateEndpointConnectionPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The private endpoint connection of a workspace
 * API Version: 2021-04-01-preview.
 * 
 * ## Example Usage
 * ### Update a private endpoint connection
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
 *         var privateEndpointConnection = new PrivateEndpointConnection(&#34;privateEndpointConnection&#34;, PrivateEndpointConnectionArgs.builder()        
 *             .privateEndpointConnectionName(&#34;myWorkspace.23456789-1111-1111-1111-111111111111&#34;)
 *             .properties(Map.of(&#34;privateLinkServiceConnectionState&#34;, Map.ofEntries(
 *                 Map.entry(&#34;description&#34;, &#34;Approved by databricksadmin@contoso.com&#34;),
 *                 Map.entry(&#34;status&#34;, &#34;Approved&#34;)
 *             )))
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .workspaceName(&#34;myWorkspace&#34;)
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
 * $ pulumi import azure-native:databricks:PrivateEndpointConnection myWorkspace.23456789-1111-1111-1111-111111111111 /subscriptions/11111111-1111-1111-1111-111111111111/resourceGroups/myResourceGroup/providers/Microsoft.Databricks/workspaces/myWorkspace/PrivateEndpointConnections/myWorkspace.23456789-1111-1111-1111-111111111111 
 * ```
 * 
 */
@ResourceType(type="azure-native:databricks:PrivateEndpointConnection")
public class PrivateEndpointConnection extends com.pulumi.resources.CustomResource {
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
     * The private endpoint connection properties.
     * 
     */
    @Export(name="properties", type=PrivateEndpointConnectionPropertiesResponse.class, parameters={})
    private Output<PrivateEndpointConnectionPropertiesResponse> properties;

    /**
     * @return The private endpoint connection properties.
     * 
     */
    public Output<PrivateEndpointConnectionPropertiesResponse> properties() {
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
    public PrivateEndpointConnection(String name) {
        this(name, PrivateEndpointConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databricks:PrivateEndpointConnection", name, args == null ? PrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateEndpointConnection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databricks:PrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:databricks/v20210401preview:PrivateEndpointConnection").build())
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
    public static PrivateEndpointConnection get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpointConnection(name, id, options);
    }
}
