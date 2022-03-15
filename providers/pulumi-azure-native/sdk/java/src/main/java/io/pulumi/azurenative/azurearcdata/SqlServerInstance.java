// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azurearcdata.SqlServerInstanceArgs;
import io.pulumi.azurenative.azurearcdata.outputs.SqlServerInstancePropertiesResponse;
import io.pulumi.azurenative.azurearcdata.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A SqlServerInstance.
 * API Version: 2021-06-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:azurearcdata:SqlServerInstance testsqlServerInstance /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/testrg/providers/Microsoft.AzureArcData/SqlServerInstances/testsqlServerInstance 
 * ```
 * 
 */
@ResourceType(type="azure-native:azurearcdata:SqlServerInstance")
public class SqlServerInstance extends io.pulumi.resources.CustomResource {
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
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
     * null
     * 
     */
    @Export(name="properties", type=SqlServerInstancePropertiesResponse.class, parameters={})
    private Output<SqlServerInstancePropertiesResponse> properties;

    /**
     * @return null
     * 
     */
    public Output<SqlServerInstancePropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Read only system data
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(SqlServerInstanceArgs.Builder a);
    }
    private static io.pulumi.azurenative.azurearcdata.SqlServerInstanceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.azurearcdata.SqlServerInstanceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SqlServerInstance(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlServerInstance(String name) {
        this(name, SqlServerInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlServerInstance(String name, SqlServerInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlServerInstance(String name, SqlServerInstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azurearcdata:SqlServerInstance", name, args == null ? SqlServerInstanceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SqlServerInstance(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azurearcdata:SqlServerInstance", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:azurearcdata/v20210601preview:SqlServerInstance").build()),
                Output.of(Alias.builder().setType("azure-native:azurearcdata/v20210701preview:SqlServerInstance").build()),
                Output.of(Alias.builder().setType("azure-native:azurearcdata/v20210801:SqlServerInstance").build()),
                Output.of(Alias.builder().setType("azure-native:azurearcdata/v20211101:SqlServerInstance").build())
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
    public static SqlServerInstance get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlServerInstance(name, id, options);
    }
}
