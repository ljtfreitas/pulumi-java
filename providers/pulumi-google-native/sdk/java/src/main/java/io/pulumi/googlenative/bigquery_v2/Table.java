// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigquery_v2.TableArgs;
import io.pulumi.googlenative.bigquery_v2.outputs.ClusteringResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.EncryptionConfigurationResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.ExternalDataConfigurationResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.MaterializedViewDefinitionResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.ModelDefinitionResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.RangePartitioningResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.SnapshotDefinitionResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.StreamingbufferResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TableReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TableSchemaResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TimePartitioningResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.ViewDefinitionResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new, empty table in the dataset.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:bigquery/v2:Table")
public class Table extends io.pulumi.resources.CustomResource {
    /**
     * [Beta] Clustering specification for the table. Must be specified with partitioning, data in the table will be first partitioned and subsequently clustered.
     * 
     */
    @Export(name="clustering", type=ClusteringResponse.class, parameters={})
    private Output<ClusteringResponse> clustering;

    /**
     * @return [Beta] Clustering specification for the table. Must be specified with partitioning, data in the table will be first partitioned and subsequently clustered.
     * 
     */
    public Output<ClusteringResponse> getClustering() {
        return this.clustering;
    }
    /**
     * The time when this table was created, in milliseconds since the epoch.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time when this table was created, in milliseconds since the epoch.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * The default collation of the table.
     * 
     */
    @Export(name="defaultCollation", type=String.class, parameters={})
    private Output<String> defaultCollation;

    /**
     * @return The default collation of the table.
     * 
     */
    public Output<String> getDefaultCollation() {
        return this.defaultCollation;
    }
    /**
     * [Optional] A user-friendly description of this table.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return [Optional] A user-friendly description of this table.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Custom encryption configuration (e.g., Cloud KMS keys).
     * 
     */
    @Export(name="encryptionConfiguration", type=EncryptionConfigurationResponse.class, parameters={})
    private Output<EncryptionConfigurationResponse> encryptionConfiguration;

    /**
     * @return Custom encryption configuration (e.g., Cloud KMS keys).
     * 
     */
    public Output<EncryptionConfigurationResponse> getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }
    /**
     * A hash of the table metadata. Used to ensure there were no concurrent modifications to the resource when attempting an update. Not guaranteed to change when the table contents or the fields numRows, numBytes, numLongTermBytes or lastModifiedTime change.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A hash of the table metadata. Used to ensure there were no concurrent modifications to the resource when attempting an update. Not guaranteed to change when the table contents or the fields numRows, numBytes, numLongTermBytes or lastModifiedTime change.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will be deleted and their storage reclaimed. The defaultTableExpirationMs property of the encapsulating dataset can be used to set a default expirationTime on newly created tables.
     * 
     */
    @Export(name="expirationTime", type=String.class, parameters={})
    private Output<String> expirationTime;

    /**
     * @return [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will be deleted and their storage reclaimed. The defaultTableExpirationMs property of the encapsulating dataset can be used to set a default expirationTime on newly created tables.
     * 
     */
    public Output<String> getExpirationTime() {
        return this.expirationTime;
    }
    /**
     * [Optional] Describes the data format, location, and other properties of a table stored outside of BigQuery. By defining these properties, the data source can then be queried as if it were a standard BigQuery table.
     * 
     */
    @Export(name="externalDataConfiguration", type=ExternalDataConfigurationResponse.class, parameters={})
    private Output<ExternalDataConfigurationResponse> externalDataConfiguration;

    /**
     * @return [Optional] Describes the data format, location, and other properties of a table stored outside of BigQuery. By defining these properties, the data source can then be queried as if it were a standard BigQuery table.
     * 
     */
    public Output<ExternalDataConfigurationResponse> getExternalDataConfiguration() {
        return this.externalDataConfiguration;
    }
    /**
     * [Optional] A descriptive name for this table.
     * 
     */
    @Export(name="friendlyName", type=String.class, parameters={})
    private Output<String> friendlyName;

    /**
     * @return [Optional] A descriptive name for this table.
     * 
     */
    public Output<String> getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The labels associated with this table. You can use these to organize and group your tables. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The labels associated with this table. You can use these to organize and group your tables. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The time when this table was last modified, in milliseconds since the epoch.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    /**
     * @return The time when this table was last modified, in milliseconds since the epoch.
     * 
     */
    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The geographic location where the table resides. This value is inherited from the dataset.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geographic location where the table resides. This value is inherited from the dataset.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * [Optional] Materialized view definition.
     * 
     */
    @Export(name="materializedView", type=MaterializedViewDefinitionResponse.class, parameters={})
    private Output<MaterializedViewDefinitionResponse> materializedView;

    /**
     * @return [Optional] Materialized view definition.
     * 
     */
    public Output<MaterializedViewDefinitionResponse> getMaterializedView() {
        return this.materializedView;
    }
    /**
     * [Output-only, Beta] Present iff this table represents a ML model. Describes the training information for the model, and it is required to run 'PREDICT' queries.
     * 
     */
    @Export(name="model", type=ModelDefinitionResponse.class, parameters={})
    private Output<ModelDefinitionResponse> model;

    /**
     * @return [Output-only, Beta] Present iff this table represents a ML model. Describes the training information for the model, and it is required to run 'PREDICT' queries.
     * 
     */
    public Output<ModelDefinitionResponse> getModel() {
        return this.model;
    }
    /**
     * The size of this table in bytes, excluding any data in the streaming buffer.
     * 
     */
    @Export(name="numBytes", type=String.class, parameters={})
    private Output<String> numBytes;

    /**
     * @return The size of this table in bytes, excluding any data in the streaming buffer.
     * 
     */
    public Output<String> getNumBytes() {
        return this.numBytes;
    }
    /**
     * The number of bytes in the table that are considered "long-term storage".
     * 
     */
    @Export(name="numLongTermBytes", type=String.class, parameters={})
    private Output<String> numLongTermBytes;

    /**
     * @return The number of bytes in the table that are considered "long-term storage".
     * 
     */
    public Output<String> getNumLongTermBytes() {
        return this.numLongTermBytes;
    }
    /**
     * [TrustedTester] The physical size of this table in bytes, excluding any data in the streaming buffer. This includes compression and storage used for time travel.
     * 
     */
    @Export(name="numPhysicalBytes", type=String.class, parameters={})
    private Output<String> numPhysicalBytes;

    /**
     * @return [TrustedTester] The physical size of this table in bytes, excluding any data in the streaming buffer. This includes compression and storage used for time travel.
     * 
     */
    public Output<String> getNumPhysicalBytes() {
        return this.numPhysicalBytes;
    }
    /**
     * The number of rows of data in this table, excluding any data in the streaming buffer.
     * 
     */
    @Export(name="numRows", type=String.class, parameters={})
    private Output<String> numRows;

    /**
     * @return The number of rows of data in this table, excluding any data in the streaming buffer.
     * 
     */
    public Output<String> getNumRows() {
        return this.numRows;
    }
    /**
     * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    @Export(name="rangePartitioning", type=RangePartitioningResponse.class, parameters={})
    private Output<RangePartitioningResponse> rangePartitioning;

    /**
     * @return [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    public Output<RangePartitioningResponse> getRangePartitioning() {
        return this.rangePartitioning;
    }
    /**
     * [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified.
     * 
     */
    @Export(name="requirePartitionFilter", type=Boolean.class, parameters={})
    private Output<Boolean> requirePartitionFilter;

    /**
     * @return [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified.
     * 
     */
    public Output<Boolean> getRequirePartitionFilter() {
        return this.requirePartitionFilter;
    }
    /**
     * [Optional] Describes the schema of this table.
     * 
     */
    @Export(name="schema", type=TableSchemaResponse.class, parameters={})
    private Output<TableSchemaResponse> schema;

    /**
     * @return [Optional] Describes the schema of this table.
     * 
     */
    public Output<TableSchemaResponse> getSchema() {
        return this.schema;
    }
    /**
     * A URL that can be used to access this resource again.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return A URL that can be used to access this resource again.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Snapshot definition.
     * 
     */
    @Export(name="snapshotDefinition", type=SnapshotDefinitionResponse.class, parameters={})
    private Output<SnapshotDefinitionResponse> snapshotDefinition;

    /**
     * @return Snapshot definition.
     * 
     */
    public Output<SnapshotDefinitionResponse> getSnapshotDefinition() {
        return this.snapshotDefinition;
    }
    /**
     * Contains information regarding this table's streaming buffer, if one is present. This field will be absent if the table is not being streamed to or if there is no data in the streaming buffer.
     * 
     */
    @Export(name="streamingBuffer", type=StreamingbufferResponse.class, parameters={})
    private Output<StreamingbufferResponse> streamingBuffer;

    /**
     * @return Contains information regarding this table's streaming buffer, if one is present. This field will be absent if the table is not being streamed to or if there is no data in the streaming buffer.
     * 
     */
    public Output<StreamingbufferResponse> getStreamingBuffer() {
        return this.streamingBuffer;
    }
    /**
     * [Required] Reference describing the ID of this table.
     * 
     */
    @Export(name="tableReference", type=TableReferenceResponse.class, parameters={})
    private Output<TableReferenceResponse> tableReference;

    /**
     * @return [Required] Reference describing the ID of this table.
     * 
     */
    public Output<TableReferenceResponse> getTableReference() {
        return this.tableReference;
    }
    /**
     * Time-based partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    @Export(name="timePartitioning", type=TimePartitioningResponse.class, parameters={})
    private Output<TimePartitioningResponse> timePartitioning;

    /**
     * @return Time-based partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    public Output<TimePartitioningResponse> getTimePartitioning() {
        return this.timePartitioning;
    }
    /**
     * Describes the table type. The following values are supported: TABLE: A normal BigQuery table. VIEW: A virtual table defined by a SQL query. SNAPSHOT: An immutable, read-only table that is a copy of another table. [TrustedTester] MATERIALIZED_VIEW: SQL query whose result is persisted. EXTERNAL: A table that references data stored in an external storage system, such as Google Cloud Storage. The default value is TABLE.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Describes the table type. The following values are supported: TABLE: A normal BigQuery table. VIEW: A virtual table defined by a SQL query. SNAPSHOT: An immutable, read-only table that is a copy of another table. [TrustedTester] MATERIALIZED_VIEW: SQL query whose result is persisted. EXTERNAL: A table that references data stored in an external storage system, such as Google Cloud Storage. The default value is TABLE.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * [Optional] The view definition.
     * 
     */
    @Export(name="view", type=ViewDefinitionResponse.class, parameters={})
    private Output<ViewDefinitionResponse> view;

    /**
     * @return [Optional] The view definition.
     * 
     */
    public Output<ViewDefinitionResponse> getView() {
        return this.view;
    }

    public interface BuilderApplicator {
        public void apply(TableArgs.Builder a);
    }
    private static io.pulumi.googlenative.bigquery_v2.TableArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.bigquery_v2.TableArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Table(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Table(String name) {
        this(name, TableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Table(String name, TableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Table(String name, TableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigquery/v2:Table", name, args == null ? TableArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Table(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigquery/v2:Table", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Table get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, options);
    }
}
