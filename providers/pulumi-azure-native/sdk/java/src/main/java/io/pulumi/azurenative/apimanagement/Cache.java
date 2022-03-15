// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.CacheArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Cache details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:Cache c1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/caches/c1 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:Cache")
public class Cache extends io.pulumi.resources.CustomResource {
    /**
     * Runtime connection string to cache
     * 
     */
    @Export(name="connectionString", type=String.class, parameters={})
    private Output<String> connectionString;

    /**
     * @return Runtime connection string to cache
     * 
     */
    public Output<String> getConnectionString() {
        return this.connectionString;
    }
    /**
     * Cache description
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Cache description
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
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
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Original uri of entity in external system cache points to
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceId;

    /**
     * @return Original uri of entity in external system cache points to
     * 
     */
    public Output</* @Nullable */ String> getResourceId() {
        return this.resourceId;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Location identifier to use cache from (should be either 'default' or valid Azure region identifier)
     * 
     */
    @Export(name="useFromLocation", type=String.class, parameters={})
    private Output<String> useFromLocation;

    /**
     * @return Location identifier to use cache from (should be either 'default' or valid Azure region identifier)
     * 
     */
    public Output<String> getUseFromLocation() {
        return this.useFromLocation;
    }

    public interface BuilderApplicator {
        public void apply(CacheArgs.Builder a);
    }
    private static io.pulumi.azurenative.apimanagement.CacheArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.apimanagement.CacheArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Cache(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cache(String name) {
        this(name, CacheArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cache(String name, CacheArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cache(String name, CacheArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Cache", name, args == null ? CacheArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Cache(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Cache", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:Cache").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20190101:Cache").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20191201:Cache").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:Cache").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:Cache").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20201201:Cache").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:Cache").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:Cache").build()),
                Output.of(Alias.builder().setType("azure-native:apimanagement/v20210801:Cache").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cache get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cache(name, id, options);
    }
}
