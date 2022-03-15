// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.CassandraResourceCassandraKeyspaceArgs;
import io.pulumi.azurenative.documentdb.outputs.CassandraKeyspaceGetPropertiesResponseOptions;
import io.pulumi.azurenative.documentdb.outputs.CassandraKeyspaceGetPropertiesResponseResource;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An Azure Cosmos DB Cassandra keyspace.
 * API Version: 2021-03-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:documentdb:CassandraResourceCassandraKeyspace keyspaceName /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/ddb1/cassandraKeyspaces/keyspaceName 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:CassandraResourceCassandraKeyspace")
public class CassandraResourceCassandraKeyspace extends io.pulumi.resources.CustomResource {
    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource group to which the resource belongs.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the ARM resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the ARM resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @Export(name="options", type=CassandraKeyspaceGetPropertiesResponseOptions.class, parameters={})
    private Output</* @Nullable */ CassandraKeyspaceGetPropertiesResponseOptions> options;

    public Output</* @Nullable */ CassandraKeyspaceGetPropertiesResponseOptions> getOptions() {
        return this.options;
    }
    @Export(name="resource", type=CassandraKeyspaceGetPropertiesResponseResource.class, parameters={})
    private Output</* @Nullable */ CassandraKeyspaceGetPropertiesResponseResource> resource;

    public Output</* @Nullable */ CassandraKeyspaceGetPropertiesResponseResource> getResource() {
        return this.resource;
    }
    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of Azure resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Azure resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(CassandraResourceCassandraKeyspaceArgs.Builder a);
    }
    private static io.pulumi.azurenative.documentdb.CassandraResourceCassandraKeyspaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.documentdb.CassandraResourceCassandraKeyspaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CassandraResourceCassandraKeyspace(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CassandraResourceCassandraKeyspace(String name) {
        this(name, CassandraResourceCassandraKeyspaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CassandraResourceCassandraKeyspace(String name, CassandraResourceCassandraKeyspaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CassandraResourceCassandraKeyspace(String name, CassandraResourceCassandraKeyspaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:CassandraResourceCassandraKeyspace", name, args == null ? CassandraResourceCassandraKeyspaceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private CassandraResourceCassandraKeyspace(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:CassandraResourceCassandraKeyspace", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:documentdb/v20150401:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20150408:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20151106:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20160319:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20160331:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20190801:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20191212:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20200301:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20200401:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20200601preview:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20200901:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20210115:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20210301preview:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20210315:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20210401preview:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20210415:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20210515:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20210615:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20210701preview:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20211015:CassandraResourceCassandraKeyspace").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20211015preview:CassandraResourceCassandraKeyspace").build())
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
    public static CassandraResourceCassandraKeyspace get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CassandraResourceCassandraKeyspace(name, id, options);
    }
}
