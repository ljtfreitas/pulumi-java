// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.synapse.IntegrationRuntimeArgs;
import com.pulumi.azurenative.synapse.outputs.ManagedIntegrationRuntimeResponse;
import com.pulumi.azurenative.synapse.outputs.SelfHostedIntegrationRuntimeResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Integration runtime resource type.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * ### Create integration runtime
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
 *         var integrationRuntime = new IntegrationRuntime(&#34;integrationRuntime&#34;, IntegrationRuntimeArgs.builder()        
 *             .integrationRuntimeName(&#34;exampleIntegrationRuntime&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;description&#34;, &#34;A selfhosted integration runtime&#34;),
 *                 Map.entry(&#34;type&#34;, &#34;SelfHosted&#34;)
 *             ))
 *             .resourceGroupName(&#34;exampleResourceGroup&#34;)
 *             .workspaceName(&#34;exampleWorkspace&#34;)
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
 * $ pulumi import azure-native:synapse:IntegrationRuntime exampleIntegrationRuntime /subscriptions/12345678-1234-1234-1234-12345678abc/resourceGroups/exampleResourceGroup/providers/Microsoft.Synapse/workspaces/exampleWorkspaceName/integrationruntimes/exampleIntegrationRuntime 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:IntegrationRuntime")
public class IntegrationRuntime extends com.pulumi.resources.CustomResource {
    /**
     * Resource Etag.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Resource Etag.
     * 
     */
    public Output<String> etag() {
        return this.etag;
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
     * Integration runtime properties.
     * 
     */
    @Export(name="properties", type=Either.class, parameters={ManagedIntegrationRuntimeResponse.class, SelfHostedIntegrationRuntimeResponse.class})
    private Output<Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse>> properties;

    /**
     * @return Integration runtime properties.
     * 
     */
    public Output<Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse>> properties() {
        return this.properties;
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
    public IntegrationRuntime(String name) {
        this(name, IntegrationRuntimeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationRuntime(String name, IntegrationRuntimeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationRuntime(String name, IntegrationRuntimeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:IntegrationRuntime", name, args == null ? IntegrationRuntimeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationRuntime(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:IntegrationRuntime", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:synapse/v20190601preview:IntegrationRuntime").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20201201:IntegrationRuntime").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210301:IntegrationRuntime").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210401preview:IntegrationRuntime").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210501:IntegrationRuntime").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601:IntegrationRuntime").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601preview:IntegrationRuntime").build())
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
    public static IntegrationRuntime get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationRuntime(name, id, options);
    }
}
