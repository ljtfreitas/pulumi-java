// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.EventGridDataConnectionArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Class representing an Event Grid data connection.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:kusto:EventGridDataConnection KustoClusterRPTest4/KustoDatabase8/DataConnections8 /subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Kusto/Clusters/KustoClusterRPTest4/Databases/KustoDatabase8/DataConnections/DataConnections8 
 * ```
 * 
 */
@ResourceType(type="azure-native:kusto:EventGridDataConnection")
public class EventGridDataConnection extends io.pulumi.resources.CustomResource {
    /**
     * The name of blob storage event type to process.
     * 
     */
    @OutputExport(name="blobStorageEventType", type=String.class, parameters={})
    private Output</* @Nullable */ String> blobStorageEventType;

    /**
     * @return The name of blob storage event type to process.
     * 
     */
    public Output</* @Nullable */ String> getBlobStorageEventType() {
        return this.blobStorageEventType;
    }
    /**
     * The event hub consumer group.
     * 
     */
    @OutputExport(name="consumerGroup", type=String.class, parameters={})
    private Output<String> consumerGroup;

    /**
     * @return The event hub consumer group.
     * 
     */
    public Output<String> getConsumerGroup() {
        return this.consumerGroup;
    }
    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    @OutputExport(name="dataFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataFormat;

    /**
     * @return The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    public Output</* @Nullable */ String> getDataFormat() {
        return this.dataFormat;
    }
    /**
     * The resource ID where the event grid is configured to send events.
     * 
     */
    @OutputExport(name="eventHubResourceId", type=String.class, parameters={})
    private Output<String> eventHubResourceId;

    /**
     * @return The resource ID where the event grid is configured to send events.
     * 
     */
    public Output<String> getEventHubResourceId() {
        return this.eventHubResourceId;
    }
    /**
     * A Boolean value that, if set to true, indicates that ingestion should ignore the first record of every file
     * 
     */
    @OutputExport(name="ignoreFirstRecord", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreFirstRecord;

    /**
     * @return A Boolean value that, if set to true, indicates that ingestion should ignore the first record of every file
     * 
     */
    public Output</* @Nullable */ Boolean> getIgnoreFirstRecord() {
        return this.ignoreFirstRecord;
    }
    /**
     * Kind of the endpoint for the data connection
     * Expected value is 'EventGrid'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of the endpoint for the data connection
     * Expected value is 'EventGrid'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    @OutputExport(name="mappingRuleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> mappingRuleName;

    /**
     * @return The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    public Output</* @Nullable */ String> getMappingRuleName() {
        return this.mappingRuleName;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
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
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioned state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource ID of the storage account where the data resides.
     * 
     */
    @OutputExport(name="storageAccountResourceId", type=String.class, parameters={})
    private Output<String> storageAccountResourceId;

    /**
     * @return The resource ID of the storage account where the data resides.
     * 
     */
    public Output<String> getStorageAccountResourceId() {
        return this.storageAccountResourceId;
    }
    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    @OutputExport(name="tableName", type=String.class, parameters={})
    private Output</* @Nullable */ String> tableName;

    /**
     * @return The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    public Output</* @Nullable */ String> getTableName() {
        return this.tableName;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventGridDataConnection(String name, EventGridDataConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:EventGridDataConnection", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private EventGridDataConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:EventGridDataConnection", name, null, makeResourceOptions(options, id));
    }

    private static EventGridDataConnectionArgs makeArgs(EventGridDataConnectionArgs args) {
        var builder = args == null ? EventGridDataConnectionArgs.builder() : EventGridDataConnectionArgs.builder(args);
        return builder
            .setKind("EventGrid")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:kusto/v20190121:EventGridDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190515:EventGridDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20190907:EventGridDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20191109:EventGridDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200215:EventGridDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200614:EventGridDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20200918:EventGridDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20210101:EventGridDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:kusto/v20210827:EventGridDataConnection").build())
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
    public static EventGridDataConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventGridDataConnection(name, id, options);
    }
}
