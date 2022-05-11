// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.logic.IntegrationAccountAssemblyArgs;
import com.pulumi.azurenative.logic.outputs.AssemblyPropertiesResponse;
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
 * The assembly definition.
 * API Version: 2019-05-01.
 * 
 * ## Example Usage
 * ### Create or update an account assembly
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
 *         var integrationAccountAssembly = new IntegrationAccountAssembly(&#34;integrationAccountAssembly&#34;, IntegrationAccountAssemblyArgs.builder()        
 *             .assemblyArtifactName(&#34;testAssembly&#34;)
 *             .integrationAccountName(&#34;testIntegrationAccount&#34;)
 *             .location(&#34;westus&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;assemblyName&#34;, &#34;System.IdentityModel.Tokens.Jwt&#34;),
 *                 Map.entry(&#34;content&#34;, &#34;Base64 encoded Assembly Content&#34;),
 *                 Map.entry(&#34;metadata&#34;, )
 *             ))
 *             .resourceGroupName(&#34;testResourceGroup&#34;)
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
 * $ pulumi import azure-native:logic:IntegrationAccountAssembly testAssembly /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testResourceGroup/providers/Microsoft.Logic/integrationAccounts/testIntegrationAccount/assemblies/testAssembly 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:IntegrationAccountAssembly")
public class IntegrationAccountAssembly extends com.pulumi.resources.CustomResource {
    /**
     * The resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Gets the resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The assembly properties.
     * 
     */
    @Export(name="properties", type=AssemblyPropertiesResponse.class, parameters={})
    private Output<AssemblyPropertiesResponse> properties;

    /**
     * @return The assembly properties.
     * 
     */
    public Output<AssemblyPropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * The resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Gets the resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets the resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationAccountAssembly(String name) {
        this(name, IntegrationAccountAssemblyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationAccountAssembly(String name, IntegrationAccountAssemblyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationAccountAssembly(String name, IntegrationAccountAssemblyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountAssembly", name, args == null ? IntegrationAccountAssemblyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationAccountAssembly(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountAssembly", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:logic/v20160601:IntegrationAccountAssembly").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20180701preview:IntegrationAccountAssembly").build()),
                Output.of(Alias.builder().type("azure-native:logic/v20190501:IntegrationAccountAssembly").build())
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
    public static IntegrationAccountAssembly get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationAccountAssembly(name, id, options);
    }
}
