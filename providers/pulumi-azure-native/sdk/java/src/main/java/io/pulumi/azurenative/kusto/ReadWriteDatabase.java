// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.ReadWriteDatabaseArgs;
import io.pulumi.azurenative.kusto.outputs.DatabaseStatisticsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Class representing a read write database.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:kusto:ReadWriteDatabase KustoClusterRPTest4/KustoDatabase8 /subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Kusto/Clusters/KustoClusterRPTest4/Databases/KustoDatabase8 
 * ```
 * 
 */
@ResourceType(type="azure-native:kusto:ReadWriteDatabase")
public class ReadWriteDatabase extends io.pulumi.resources.CustomResource {
    /**
     * The time the data should be kept in cache for fast queries in TimeSpan.
     * 
     */
    @Export(name="hotCachePeriod", type=String.class, parameters={})
    private Output</* @Nullable */ String> hotCachePeriod;

    /**
     * @return The time the data should be kept in cache for fast queries in TimeSpan.
     * 
     */
    public Output</* @Nullable */ String> getHotCachePeriod() {
        return this.hotCachePeriod;
    }
    /**
     * Indicates whether the database is followed.
     * 
     */
    @Export(name="isFollowed", type=Boolean.class, parameters={})
    private Output<Boolean> isFollowed;

    /**
     * @return Indicates whether the database is followed.
     * 
     */
    public Output<Boolean> getIsFollowed() {
        return this.isFollowed;
    }
    /**
     * Kind of the database
     * Expected value is 'ReadWrite'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of the database
     * Expected value is 'ReadWrite'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
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
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
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
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioned state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioned state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The time the data should be kept before it stops being accessible to queries in TimeSpan.
     * 
     */
    @Export(name="softDeletePeriod", type=String.class, parameters={})
    private Output</* @Nullable */ String> softDeletePeriod;

    /**
     * @return The time the data should be kept before it stops being accessible to queries in TimeSpan.
     * 
     */
    public Output</* @Nullable */ String> getSoftDeletePeriod() {
        return this.softDeletePeriod;
    }
    /**
     * The statistics of the database.
     * 
     */
    @Export(name="statistics", type=DatabaseStatisticsResponse.class, parameters={})
    private Output<DatabaseStatisticsResponse> statistics;

    /**
     * @return The statistics of the database.
     * 
     */
    public Output<DatabaseStatisticsResponse> getStatistics() {
        return this.statistics;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ReadWriteDatabaseArgs.Builder a);
    }
    private static io.pulumi.azurenative.kusto.ReadWriteDatabaseArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.kusto.ReadWriteDatabaseArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ReadWriteDatabase(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReadWriteDatabase(String name) {
        this(name, ReadWriteDatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReadWriteDatabase(String name, ReadWriteDatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReadWriteDatabase(String name, ReadWriteDatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:ReadWriteDatabase", name, makeArgs(args), makeResourceOptions(options, Output.empty()));
    }

    private ReadWriteDatabase(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:ReadWriteDatabase", name, null, makeResourceOptions(options, id));
    }

    private static ReadWriteDatabaseArgs makeArgs(ReadWriteDatabaseArgs args) {
        var builder = args == null ? ReadWriteDatabaseArgs.builder() : ReadWriteDatabaseArgs.builder(args);
        return builder
            .kind("ReadWrite")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:kusto/v20170907privatepreview:ReadWriteDatabase").build()),
                Output.of(Alias.builder().setType("azure-native:kusto/v20180907preview:ReadWriteDatabase").build()),
                Output.of(Alias.builder().setType("azure-native:kusto/v20190121:ReadWriteDatabase").build()),
                Output.of(Alias.builder().setType("azure-native:kusto/v20190515:ReadWriteDatabase").build()),
                Output.of(Alias.builder().setType("azure-native:kusto/v20190907:ReadWriteDatabase").build()),
                Output.of(Alias.builder().setType("azure-native:kusto/v20191109:ReadWriteDatabase").build()),
                Output.of(Alias.builder().setType("azure-native:kusto/v20200215:ReadWriteDatabase").build()),
                Output.of(Alias.builder().setType("azure-native:kusto/v20200614:ReadWriteDatabase").build()),
                Output.of(Alias.builder().setType("azure-native:kusto/v20200918:ReadWriteDatabase").build()),
                Output.of(Alias.builder().setType("azure-native:kusto/v20210101:ReadWriteDatabase").build()),
                Output.of(Alias.builder().setType("azure-native:kusto/v20210827:ReadWriteDatabase").build())
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
    public static ReadWriteDatabase get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReadWriteDatabase(name, id, options);
    }
}
