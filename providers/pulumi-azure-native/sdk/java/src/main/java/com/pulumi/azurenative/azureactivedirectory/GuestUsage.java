// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azureactivedirectory;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.azureactivedirectory.GuestUsageArgs;
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
 * Guest Usages Resource
 * API Version: 2020-05-01-preview.
 * 
 * ## Example Usage
 * ### GuestUsages_Create
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
 *         var guestUsage = new GuestUsage(&#34;guestUsage&#34;, GuestUsageArgs.builder()        
 *             .resourceGroupName(&#34;contosoResourceGroup&#34;)
 *             .resourceName(&#34;contoso.onmicrosoft.com&#34;)
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
 * $ pulumi import azure-native:azureactivedirectory:GuestUsage contoso.onmicrosoft.com /subscriptions/c80fb759-c965-4c6a-9110-9b2b2d038882/resourceGroups/contosoResourceGroup/providers/Microsoft.AzureActiveDirectory/guestUsages/contoso.onmicrosoft.com 
 * ```
 * 
 */
@ResourceType(type="azure-native:azureactivedirectory:GuestUsage")
public class GuestUsage extends com.pulumi.resources.CustomResource {
    /**
     * Location of the Guest Usages resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location of the Guest Usages resource.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the Guest Usages resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Guest Usages resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Key-value pairs of additional resource provisioning properties.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value pairs of additional resource provisioning properties.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * An identifier for the tenant for which the resource is being created
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return An identifier for the tenant for which the resource is being created
     * 
     */
    public Output<Optional<String>> tenantId() {
        return Codegen.optional(this.tenantId);
    }
    /**
     * The type of the Guest Usages resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the Guest Usages resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GuestUsage(String name) {
        this(name, GuestUsageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GuestUsage(String name, GuestUsageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GuestUsage(String name, GuestUsageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azureactivedirectory:GuestUsage", name, args == null ? GuestUsageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GuestUsage(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azureactivedirectory:GuestUsage", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:azureactivedirectory/v20200501preview:GuestUsage").build()),
                Output.of(Alias.builder().type("azure-native:azureactivedirectory/v20210401:GuestUsage").build())
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
    public static GuestUsage get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GuestUsage(name, id, options);
    }
}
