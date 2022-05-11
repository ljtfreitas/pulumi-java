// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.ManagementGroupNetworkManagerConnectionArgs;
import com.pulumi.azurenative.network.outputs.SystemDataResponse;
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
 * The Network Manager Connection resource
 * API Version: 2021-05-01-preview.
 * 
 * ## Example Usage
 * ### Create or Update Management Group Network Manager Connection
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
 *         var managementGroupNetworkManagerConnection = new ManagementGroupNetworkManagerConnection(&#34;managementGroupNetworkManagerConnection&#34;, ManagementGroupNetworkManagerConnectionArgs.builder()        
 *             .managementGroupId(&#34;managementGroupA&#34;)
 *             .networkManagerConnectionName(&#34;TestNMConnection&#34;)
 *             .networkManagerId(&#34;/subscriptions/subscriptionC/resourceGroup/rg1/providers/Microsoft.Network/networkManagers/testNetworkManager&#34;)
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
 * $ pulumi import azure-native:network:ManagementGroupNetworkManagerConnection TestMConnection /managementGroups/managementGroupA/providers/Microsoft.Network/networkManagerConnections/TestNMConnection 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:ManagementGroupNetworkManagerConnection")
public class ManagementGroupNetworkManagerConnection extends com.pulumi.resources.CustomResource {
    /**
     * A description of the scope connection.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the scope connection.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
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
     * Network Manager Id.
     * 
     */
    @Export(name="networkManagerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> networkManagerId;

    /**
     * @return Network Manager Id.
     * 
     */
    public Output<Optional<String>> networkManagerId() {
        return Codegen.optional(this.networkManagerId);
    }
    /**
     * The system metadata related to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata related to this resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagementGroupNetworkManagerConnection(String name) {
        this(name, ManagementGroupNetworkManagerConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagementGroupNetworkManagerConnection(String name, ManagementGroupNetworkManagerConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagementGroupNetworkManagerConnection(String name, ManagementGroupNetworkManagerConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ManagementGroupNetworkManagerConnection", name, args == null ? ManagementGroupNetworkManagerConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagementGroupNetworkManagerConnection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ManagementGroupNetworkManagerConnection", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20210501preview:ManagementGroupNetworkManagerConnection").build())
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
    public static ManagementGroupNetworkManagerConnection get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagementGroupNetworkManagerConnection(name, id, options);
    }
}
