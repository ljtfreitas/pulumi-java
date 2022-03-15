// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.bigquery.inputs.TableEncryptionConfigurationGetArgs;
import io.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationGetArgs;
import io.pulumi.gcp.bigquery.inputs.TableMaterializedViewGetArgs;
import io.pulumi.gcp.bigquery.inputs.TableRangePartitioningGetArgs;
import io.pulumi.gcp.bigquery.inputs.TableTimePartitioningGetArgs;
import io.pulumi.gcp.bigquery.inputs.TableViewGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableState extends io.pulumi.resources.ResourceArgs {

    public static final TableState Empty = new TableState();

    /**
     * Specifies column names to use for data clustering.
     * Up to four top-level columns are allowed, and should be specified in
     * descending priority order.
     * 
     */
    @Import(name="clusterings")
      private final @Nullable Output<List<String>> clusterings;

    public Output<List<String>> getClusterings() {
        return this.clusterings == null ? Output.empty() : this.clusterings;
    }

    /**
     * The time when this table was created, in milliseconds since the epoch.
     * 
     */
    @Import(name="creationTime")
      private final @Nullable Output<Integer> creationTime;

    public Output<Integer> getCreationTime() {
        return this.creationTime == null ? Output.empty() : this.creationTime;
    }

    /**
     * The dataset ID to create the table in.
     * Changing this forces a new resource to be created.
     * 
     */
    @Import(name="datasetId")
      private final @Nullable Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId == null ? Output.empty() : this.datasetId;
    }

    /**
     * Whether or not to allow the provider to destroy the instance. Unless this field is set to false
     * in state, a `=destroy` or `=update` that would delete the instance will fail.
     * 
     */
    @Import(name="deletionProtection")
      private final @Nullable Output<Boolean> deletionProtection;

    public Output<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Output.empty() : this.deletionProtection;
    }

    /**
     * The field description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Specifies how the table should be encrypted.
     * If left blank, the table will be encrypted with a Google-managed key; that process
     * is transparent to the user.  Structure is documented below.
     * 
     */
    @Import(name="encryptionConfiguration")
      private final @Nullable Output<TableEncryptionConfigurationGetArgs> encryptionConfiguration;

    public Output<TableEncryptionConfigurationGetArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Output.empty() : this.encryptionConfiguration;
    }

    /**
     * A hash of the resource.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * The time when this table expires, in
     * milliseconds since the epoch. If not present, the table will persist
     * indefinitely. Expired tables will be deleted and their storage
     * reclaimed.
     * 
     */
    @Import(name="expirationTime")
      private final @Nullable Output<Integer> expirationTime;

    public Output<Integer> getExpirationTime() {
        return this.expirationTime == null ? Output.empty() : this.expirationTime;
    }

    /**
     * Describes the data format,
     * location, and other properties of a table stored outside of BigQuery.
     * By defining these properties, the data source can then be queried as
     * if it were a standard BigQuery table. Structure is documented below.
     * 
     */
    @Import(name="externalDataConfiguration")
      private final @Nullable Output<TableExternalDataConfigurationGetArgs> externalDataConfiguration;

    public Output<TableExternalDataConfigurationGetArgs> getExternalDataConfiguration() {
        return this.externalDataConfiguration == null ? Output.empty() : this.externalDataConfiguration;
    }

    /**
     * A descriptive name for the table.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName == null ? Output.empty() : this.friendlyName;
    }

    /**
     * A mapping of labels to assign to the resource.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The time when this table was last modified, in milliseconds since the epoch.
     * 
     */
    @Import(name="lastModifiedTime")
      private final @Nullable Output<Integer> lastModifiedTime;

    public Output<Integer> getLastModifiedTime() {
        return this.lastModifiedTime == null ? Output.empty() : this.lastModifiedTime;
    }

    /**
     * The geographic location where the table resides. This value is inherited from the dataset.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * If specified, configures this table as a materialized view.
     * Structure is documented below.
     * 
     */
    @Import(name="materializedView")
      private final @Nullable Output<TableMaterializedViewGetArgs> materializedView;

    public Output<TableMaterializedViewGetArgs> getMaterializedView() {
        return this.materializedView == null ? Output.empty() : this.materializedView;
    }

    /**
     * The size of this table in bytes, excluding any data in the streaming buffer.
     * 
     */
    @Import(name="numBytes")
      private final @Nullable Output<Integer> numBytes;

    public Output<Integer> getNumBytes() {
        return this.numBytes == null ? Output.empty() : this.numBytes;
    }

    /**
     * The number of bytes in the table that are considered "long-term storage".
     * 
     */
    @Import(name="numLongTermBytes")
      private final @Nullable Output<Integer> numLongTermBytes;

    public Output<Integer> getNumLongTermBytes() {
        return this.numLongTermBytes == null ? Output.empty() : this.numLongTermBytes;
    }

    /**
     * The number of rows of data in this table, excluding any data in the streaming buffer.
     * 
     */
    @Import(name="numRows")
      private final @Nullable Output<Integer> numRows;

    public Output<Integer> getNumRows() {
        return this.numRows == null ? Output.empty() : this.numRows;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * If specified, configures range-based
     * partitioning for this table. Structure is documented below.
     * 
     */
    @Import(name="rangePartitioning")
      private final @Nullable Output<TableRangePartitioningGetArgs> rangePartitioning;

    public Output<TableRangePartitioningGetArgs> getRangePartitioning() {
        return this.rangePartitioning == null ? Output.empty() : this.rangePartitioning;
    }

    /**
     * A JSON schema for the external table. Schema is required
     * for CSV and JSON formats if autodetect is not on. Schema is disallowed
     * for Google Cloud Bigtable, Cloud Datastore backups, Avro, ORC and Parquet formats.
     * ~>**NOTE:** Because this field expects a JSON string, any changes to the
     * string will create a diff, even if the JSON itself hasn't changed.
     * Furthermore drift for this field cannot not be detected because BigQuery
     * only uses this schema to compute the effective schema for the table, therefore
     * any changes on the configured value will force the table to be recreated.
     * This schema is effectively only applied when creating a table from an external
     * datasource, after creation the computed schema will be stored in
     * `google_bigquery_table.schema`
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<String> schema;

    public Output<String> getSchema() {
        return this.schema == null ? Output.empty() : this.schema;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Output.empty() : this.selfLink;
    }

    /**
     * A unique ID for the resource.
     * Changing this forces a new resource to be created.
     * 
     */
    @Import(name="tableId")
      private final @Nullable Output<String> tableId;

    public Output<String> getTableId() {
        return this.tableId == null ? Output.empty() : this.tableId;
    }

    /**
     * If specified, configures time-based
     * partitioning for this table. Structure is documented below.
     * 
     */
    @Import(name="timePartitioning")
      private final @Nullable Output<TableTimePartitioningGetArgs> timePartitioning;

    public Output<TableTimePartitioningGetArgs> getTimePartitioning() {
        return this.timePartitioning == null ? Output.empty() : this.timePartitioning;
    }

    /**
     * The supported types are DAY, HOUR, MONTH, and YEAR,
     * which will generate one partition per day, hour, month, and year, respectively.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * If specified, configures this table as a view.
     * Structure is documented below.
     * 
     */
    @Import(name="view")
      private final @Nullable Output<TableViewGetArgs> view;

    public Output<TableViewGetArgs> getView() {
        return this.view == null ? Output.empty() : this.view;
    }

    public TableState(
        @Nullable Output<List<String>> clusterings,
        @Nullable Output<Integer> creationTime,
        @Nullable Output<String> datasetId,
        @Nullable Output<Boolean> deletionProtection,
        @Nullable Output<String> description,
        @Nullable Output<TableEncryptionConfigurationGetArgs> encryptionConfiguration,
        @Nullable Output<String> etag,
        @Nullable Output<Integer> expirationTime,
        @Nullable Output<TableExternalDataConfigurationGetArgs> externalDataConfiguration,
        @Nullable Output<String> friendlyName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<Integer> lastModifiedTime,
        @Nullable Output<String> location,
        @Nullable Output<TableMaterializedViewGetArgs> materializedView,
        @Nullable Output<Integer> numBytes,
        @Nullable Output<Integer> numLongTermBytes,
        @Nullable Output<Integer> numRows,
        @Nullable Output<String> project,
        @Nullable Output<TableRangePartitioningGetArgs> rangePartitioning,
        @Nullable Output<String> schema,
        @Nullable Output<String> selfLink,
        @Nullable Output<String> tableId,
        @Nullable Output<TableTimePartitioningGetArgs> timePartitioning,
        @Nullable Output<String> type,
        @Nullable Output<TableViewGetArgs> view) {
        this.clusterings = clusterings;
        this.creationTime = creationTime;
        this.datasetId = datasetId;
        this.deletionProtection = deletionProtection;
        this.description = description;
        this.encryptionConfiguration = encryptionConfiguration;
        this.etag = etag;
        this.expirationTime = expirationTime;
        this.externalDataConfiguration = externalDataConfiguration;
        this.friendlyName = friendlyName;
        this.labels = labels;
        this.lastModifiedTime = lastModifiedTime;
        this.location = location;
        this.materializedView = materializedView;
        this.numBytes = numBytes;
        this.numLongTermBytes = numLongTermBytes;
        this.numRows = numRows;
        this.project = project;
        this.rangePartitioning = rangePartitioning;
        this.schema = schema;
        this.selfLink = selfLink;
        this.tableId = tableId;
        this.timePartitioning = timePartitioning;
        this.type = type;
        this.view = view;
    }

    private TableState() {
        this.clusterings = Output.empty();
        this.creationTime = Output.empty();
        this.datasetId = Output.empty();
        this.deletionProtection = Output.empty();
        this.description = Output.empty();
        this.encryptionConfiguration = Output.empty();
        this.etag = Output.empty();
        this.expirationTime = Output.empty();
        this.externalDataConfiguration = Output.empty();
        this.friendlyName = Output.empty();
        this.labels = Output.empty();
        this.lastModifiedTime = Output.empty();
        this.location = Output.empty();
        this.materializedView = Output.empty();
        this.numBytes = Output.empty();
        this.numLongTermBytes = Output.empty();
        this.numRows = Output.empty();
        this.project = Output.empty();
        this.rangePartitioning = Output.empty();
        this.schema = Output.empty();
        this.selfLink = Output.empty();
        this.tableId = Output.empty();
        this.timePartitioning = Output.empty();
        this.type = Output.empty();
        this.view = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> clusterings;
        private @Nullable Output<Integer> creationTime;
        private @Nullable Output<String> datasetId;
        private @Nullable Output<Boolean> deletionProtection;
        private @Nullable Output<String> description;
        private @Nullable Output<TableEncryptionConfigurationGetArgs> encryptionConfiguration;
        private @Nullable Output<String> etag;
        private @Nullable Output<Integer> expirationTime;
        private @Nullable Output<TableExternalDataConfigurationGetArgs> externalDataConfiguration;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<Integer> lastModifiedTime;
        private @Nullable Output<String> location;
        private @Nullable Output<TableMaterializedViewGetArgs> materializedView;
        private @Nullable Output<Integer> numBytes;
        private @Nullable Output<Integer> numLongTermBytes;
        private @Nullable Output<Integer> numRows;
        private @Nullable Output<String> project;
        private @Nullable Output<TableRangePartitioningGetArgs> rangePartitioning;
        private @Nullable Output<String> schema;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<String> tableId;
        private @Nullable Output<TableTimePartitioningGetArgs> timePartitioning;
        private @Nullable Output<String> type;
        private @Nullable Output<TableViewGetArgs> view;

        public Builder() {
    	      // Empty
        }

        public Builder(TableState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterings = defaults.clusterings;
    	      this.creationTime = defaults.creationTime;
    	      this.datasetId = defaults.datasetId;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.description = defaults.description;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.etag = defaults.etag;
    	      this.expirationTime = defaults.expirationTime;
    	      this.externalDataConfiguration = defaults.externalDataConfiguration;
    	      this.friendlyName = defaults.friendlyName;
    	      this.labels = defaults.labels;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.materializedView = defaults.materializedView;
    	      this.numBytes = defaults.numBytes;
    	      this.numLongTermBytes = defaults.numLongTermBytes;
    	      this.numRows = defaults.numRows;
    	      this.project = defaults.project;
    	      this.rangePartitioning = defaults.rangePartitioning;
    	      this.schema = defaults.schema;
    	      this.selfLink = defaults.selfLink;
    	      this.tableId = defaults.tableId;
    	      this.timePartitioning = defaults.timePartitioning;
    	      this.type = defaults.type;
    	      this.view = defaults.view;
        }

        public Builder clusterings(@Nullable Output<List<String>> clusterings) {
            this.clusterings = clusterings;
            return this;
        }

        public Builder clusterings(@Nullable List<String> clusterings) {
            this.clusterings = Output.ofNullable(clusterings);
            return this;
        }

        public Builder creationTime(@Nullable Output<Integer> creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder creationTime(@Nullable Integer creationTime) {
            this.creationTime = Output.ofNullable(creationTime);
            return this;
        }

        public Builder datasetId(@Nullable Output<String> datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(@Nullable String datasetId) {
            this.datasetId = Output.ofNullable(datasetId);
            return this;
        }

        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Output.ofNullable(deletionProtection);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder encryptionConfiguration(@Nullable Output<TableEncryptionConfigurationGetArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder encryptionConfiguration(@Nullable TableEncryptionConfigurationGetArgs encryptionConfiguration) {
            this.encryptionConfiguration = Output.ofNullable(encryptionConfiguration);
            return this;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }

        public Builder expirationTime(@Nullable Output<Integer> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder expirationTime(@Nullable Integer expirationTime) {
            this.expirationTime = Output.ofNullable(expirationTime);
            return this;
        }

        public Builder externalDataConfiguration(@Nullable Output<TableExternalDataConfigurationGetArgs> externalDataConfiguration) {
            this.externalDataConfiguration = externalDataConfiguration;
            return this;
        }

        public Builder externalDataConfiguration(@Nullable TableExternalDataConfigurationGetArgs externalDataConfiguration) {
            this.externalDataConfiguration = Output.ofNullable(externalDataConfiguration);
            return this;
        }

        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Output.ofNullable(friendlyName);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder lastModifiedTime(@Nullable Output<Integer> lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder lastModifiedTime(@Nullable Integer lastModifiedTime) {
            this.lastModifiedTime = Output.ofNullable(lastModifiedTime);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder materializedView(@Nullable Output<TableMaterializedViewGetArgs> materializedView) {
            this.materializedView = materializedView;
            return this;
        }

        public Builder materializedView(@Nullable TableMaterializedViewGetArgs materializedView) {
            this.materializedView = Output.ofNullable(materializedView);
            return this;
        }

        public Builder numBytes(@Nullable Output<Integer> numBytes) {
            this.numBytes = numBytes;
            return this;
        }

        public Builder numBytes(@Nullable Integer numBytes) {
            this.numBytes = Output.ofNullable(numBytes);
            return this;
        }

        public Builder numLongTermBytes(@Nullable Output<Integer> numLongTermBytes) {
            this.numLongTermBytes = numLongTermBytes;
            return this;
        }

        public Builder numLongTermBytes(@Nullable Integer numLongTermBytes) {
            this.numLongTermBytes = Output.ofNullable(numLongTermBytes);
            return this;
        }

        public Builder numRows(@Nullable Output<Integer> numRows) {
            this.numRows = numRows;
            return this;
        }

        public Builder numRows(@Nullable Integer numRows) {
            this.numRows = Output.ofNullable(numRows);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder rangePartitioning(@Nullable Output<TableRangePartitioningGetArgs> rangePartitioning) {
            this.rangePartitioning = rangePartitioning;
            return this;
        }

        public Builder rangePartitioning(@Nullable TableRangePartitioningGetArgs rangePartitioning) {
            this.rangePartitioning = Output.ofNullable(rangePartitioning);
            return this;
        }

        public Builder schema(@Nullable Output<String> schema) {
            this.schema = schema;
            return this;
        }

        public Builder schema(@Nullable String schema) {
            this.schema = Output.ofNullable(schema);
            return this;
        }

        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Output.ofNullable(selfLink);
            return this;
        }

        public Builder tableId(@Nullable Output<String> tableId) {
            this.tableId = tableId;
            return this;
        }

        public Builder tableId(@Nullable String tableId) {
            this.tableId = Output.ofNullable(tableId);
            return this;
        }

        public Builder timePartitioning(@Nullable Output<TableTimePartitioningGetArgs> timePartitioning) {
            this.timePartitioning = timePartitioning;
            return this;
        }

        public Builder timePartitioning(@Nullable TableTimePartitioningGetArgs timePartitioning) {
            this.timePartitioning = Output.ofNullable(timePartitioning);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }

        public Builder view(@Nullable Output<TableViewGetArgs> view) {
            this.view = view;
            return this;
        }

        public Builder view(@Nullable TableViewGetArgs view) {
            this.view = Output.ofNullable(view);
            return this;
        }
        public TableState build() {
            return new TableState(clusterings, creationTime, datasetId, deletionProtection, description, encryptionConfiguration, etag, expirationTime, externalDataConfiguration, friendlyName, labels, lastModifiedTime, location, materializedView, numBytes, numLongTermBytes, numRows, project, rangePartitioning, schema, selfLink, tableId, timePartitioning, type, view);
        }
    }
}
