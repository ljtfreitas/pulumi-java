// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.InstancePoolArgs;
import io.pulumi.azurenative.sql.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An Azure SQL instance pool.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:InstancePool testIP /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/group1/providers/Microsoft.Sql/instancePools/testIP 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:InstancePool")
public class InstancePool extends io.pulumi.resources.CustomResource {
    /**
     * The license type. Possible values are 'LicenseIncluded' (price for SQL license is included) and 'BasePrice' (without SQL license price).
     * 
     */
    @Export(name="licenseType", type=String.class, parameters={})
    private Output<String> licenseType;

    /**
     * @return The license type. Possible values are 'LicenseIncluded' (price for SQL license is included) and 'BasePrice' (without SQL license price).
     * 
     */
    public Output<String> getLicenseType() {
        return this.licenseType;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
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
     * The name and tier of the SKU.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The name and tier of the SKU.
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Resource ID of the subnet to place this instance pool in.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return Resource ID of the subnet to place this instance pool in.
     * 
     */
    public Output<String> getSubnetId() {
        return this.subnetId;
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
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
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
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Count of vCores belonging to this instance pool.
     * 
     */
    @Export(name="vCores", type=Integer.class, parameters={})
    private Output<Integer> vCores;

    /**
     * @return Count of vCores belonging to this instance pool.
     * 
     */
    public Output<Integer> getVCores() {
        return this.vCores;
    }

    public interface BuilderApplicator {
        public void apply(InstancePoolArgs.Builder a);
    }
    private static io.pulumi.azurenative.sql.InstancePoolArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sql.InstancePoolArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public InstancePool(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstancePool(String name) {
        this(name, InstancePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstancePool(String name, InstancePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstancePool(String name, InstancePoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:InstancePool", name, args == null ? InstancePoolArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private InstancePool(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:InstancePool", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:sql/v20180601preview:InstancePool").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20200202preview:InstancePool").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20200801preview:InstancePool").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20201101preview:InstancePool").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20210201preview:InstancePool").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20210501preview:InstancePool").build()),
                Output.of(Alias.builder().setType("azure-native:sql/v20210801preview:InstancePool").build())
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
    public static InstancePool get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InstancePool(name, id, options);
    }
}
