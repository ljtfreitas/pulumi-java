// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.operationalinsights.DataExportArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The top level data export resource container.
 * API Version: 2020-08-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:operationalinsights:DataExport export1 /subscriptions/00000000-0000-0000-0000-00000000000/resourcegroups/RgTest1/providers/microsoft.operationalinsights/workspaces/DeWnTest1234/export/export1 
 * ```
 * 
 */
@ResourceType(type="azure-native:operationalinsights:DataExport")
public class DataExport extends io.pulumi.resources.CustomResource {
    /**
     * The latest data export rule modification time.
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdDate;

    /**
     * @return The latest data export rule modification time.
     * 
     */
    public Output</* @Nullable */ String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The data export rule ID.
     * 
     */
    @Export(name="dataExportId", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataExportId;

    /**
     * @return The data export rule ID.
     * 
     */
    public Output</* @Nullable */ String> getDataExportId() {
        return this.dataExportId;
    }
    /**
     * Active when enabled.
     * 
     */
    @Export(name="enable", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enable;

    /**
     * @return Active when enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnable() {
        return this.enable;
    }
    /**
     * Optional. Allows to define an Event Hub name. Not applicable when destination is Storage Account.
     * 
     */
    @Export(name="eventHubName", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventHubName;

    /**
     * @return Optional. Allows to define an Event Hub name. Not applicable when destination is Storage Account.
     * 
     */
    public Output</* @Nullable */ String> getEventHubName() {
        return this.eventHubName;
    }
    /**
     * Date and time when the export was last modified.
     * 
     */
    @Export(name="lastModifiedDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedDate;

    /**
     * @return Date and time when the export was last modified.
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedDate() {
        return this.lastModifiedDate;
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
     * The destination resource ID. This can be copied from the Properties entry of the destination resource in Azure.
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The destination resource ID. This can be copied from the Properties entry of the destination resource in Azure.
     * 
     */
    public Output<String> getResourceId() {
        return this.resourceId;
    }
    /**
     * An array of tables to export, for example: [“Heartbeat, SecurityEvent”].
     * 
     */
    @Export(name="tableNames", type=List.class, parameters={String.class})
    private Output<List<String>> tableNames;

    /**
     * @return An array of tables to export, for example: [“Heartbeat, SecurityEvent”].
     * 
     */
    public Output<List<String>> getTableNames() {
        return this.tableNames;
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
        public void apply(DataExportArgs.Builder a);
    }
    private static io.pulumi.azurenative.operationalinsights.DataExportArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.operationalinsights.DataExportArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DataExport(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataExport(String name) {
        this(name, DataExportArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataExport(String name, DataExportArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataExport(String name, DataExportArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:DataExport", name, args == null ? DataExportArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DataExport(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:DataExport", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:operationalinsights/v20190801preview:DataExport").build()),
                Output.of(Alias.builder().setType("azure-native:operationalinsights/v20200301preview:DataExport").build()),
                Output.of(Alias.builder().setType("azure-native:operationalinsights/v20200801:DataExport").build())
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
    public static DataExport get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataExport(name, id, options);
    }
}
