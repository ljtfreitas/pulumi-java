// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.bigquery_v2.inputs.ClusteringArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.EncryptionConfigurationArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.ExternalDataConfigurationArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.MaterializedViewDefinitionArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.ModelDefinitionArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.RangePartitioningArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TableReferenceArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TableSchemaArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TimePartitioningArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.ViewDefinitionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableArgs Empty = new TableArgs();

    /**
     * [Beta] Clustering specification for the table. Must be specified with partitioning, data in the table will be first partitioned and subsequently clustered.
     * 
     */
    @Import(name="clustering")
      private final @Nullable Output<ClusteringArgs> clustering;

    public Output<ClusteringArgs> getClustering() {
        return this.clustering == null ? Output.empty() : this.clustering;
    }

    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * [Optional] A user-friendly description of this table.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Custom encryption configuration (e.g., Cloud KMS keys).
     * 
     */
    @Import(name="encryptionConfiguration")
      private final @Nullable Output<EncryptionConfigurationArgs> encryptionConfiguration;

    public Output<EncryptionConfigurationArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Output.empty() : this.encryptionConfiguration;
    }

    /**
     * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will be deleted and their storage reclaimed. The defaultTableExpirationMs property of the encapsulating dataset can be used to set a default expirationTime on newly created tables.
     * 
     */
    @Import(name="expirationTime")
      private final @Nullable Output<String> expirationTime;

    public Output<String> getExpirationTime() {
        return this.expirationTime == null ? Output.empty() : this.expirationTime;
    }

    /**
     * [Optional] Describes the data format, location, and other properties of a table stored outside of BigQuery. By defining these properties, the data source can then be queried as if it were a standard BigQuery table.
     * 
     */
    @Import(name="externalDataConfiguration")
      private final @Nullable Output<ExternalDataConfigurationArgs> externalDataConfiguration;

    public Output<ExternalDataConfigurationArgs> getExternalDataConfiguration() {
        return this.externalDataConfiguration == null ? Output.empty() : this.externalDataConfiguration;
    }

    /**
     * [Optional] A descriptive name for this table.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName == null ? Output.empty() : this.friendlyName;
    }

    /**
     * The labels associated with this table. You can use these to organize and group your tables. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * [Optional] Materialized view definition.
     * 
     */
    @Import(name="materializedView")
      private final @Nullable Output<MaterializedViewDefinitionArgs> materializedView;

    public Output<MaterializedViewDefinitionArgs> getMaterializedView() {
        return this.materializedView == null ? Output.empty() : this.materializedView;
    }

    /**
     * [Output-only, Beta] Present iff this table represents a ML model. Describes the training information for the model, and it is required to run 'PREDICT' queries.
     * 
     */
    @Import(name="model")
      private final @Nullable Output<ModelDefinitionArgs> model;

    public Output<ModelDefinitionArgs> getModel() {
        return this.model == null ? Output.empty() : this.model;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    @Import(name="rangePartitioning")
      private final @Nullable Output<RangePartitioningArgs> rangePartitioning;

    public Output<RangePartitioningArgs> getRangePartitioning() {
        return this.rangePartitioning == null ? Output.empty() : this.rangePartitioning;
    }

    /**
     * [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified.
     * 
     */
    @Import(name="requirePartitionFilter")
      private final @Nullable Output<Boolean> requirePartitionFilter;

    public Output<Boolean> getRequirePartitionFilter() {
        return this.requirePartitionFilter == null ? Output.empty() : this.requirePartitionFilter;
    }

    /**
     * [Optional] Describes the schema of this table.
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<TableSchemaArgs> schema;

    public Output<TableSchemaArgs> getSchema() {
        return this.schema == null ? Output.empty() : this.schema;
    }

    /**
     * [Required] Reference describing the ID of this table.
     * 
     */
    @Import(name="tableReference")
      private final @Nullable Output<TableReferenceArgs> tableReference;

    public Output<TableReferenceArgs> getTableReference() {
        return this.tableReference == null ? Output.empty() : this.tableReference;
    }

    /**
     * Time-based partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    @Import(name="timePartitioning")
      private final @Nullable Output<TimePartitioningArgs> timePartitioning;

    public Output<TimePartitioningArgs> getTimePartitioning() {
        return this.timePartitioning == null ? Output.empty() : this.timePartitioning;
    }

    /**
     * [Optional] The view definition.
     * 
     */
    @Import(name="view")
      private final @Nullable Output<ViewDefinitionArgs> view;

    public Output<ViewDefinitionArgs> getView() {
        return this.view == null ? Output.empty() : this.view;
    }

    public TableArgs(
        @Nullable Output<ClusteringArgs> clustering,
        Output<String> datasetId,
        @Nullable Output<String> description,
        @Nullable Output<EncryptionConfigurationArgs> encryptionConfiguration,
        @Nullable Output<String> expirationTime,
        @Nullable Output<ExternalDataConfigurationArgs> externalDataConfiguration,
        @Nullable Output<String> friendlyName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<MaterializedViewDefinitionArgs> materializedView,
        @Nullable Output<ModelDefinitionArgs> model,
        @Nullable Output<String> project,
        @Nullable Output<RangePartitioningArgs> rangePartitioning,
        @Nullable Output<Boolean> requirePartitionFilter,
        @Nullable Output<TableSchemaArgs> schema,
        @Nullable Output<TableReferenceArgs> tableReference,
        @Nullable Output<TimePartitioningArgs> timePartitioning,
        @Nullable Output<ViewDefinitionArgs> view) {
        this.clustering = clustering;
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.description = description;
        this.encryptionConfiguration = encryptionConfiguration;
        this.expirationTime = expirationTime;
        this.externalDataConfiguration = externalDataConfiguration;
        this.friendlyName = friendlyName;
        this.labels = labels;
        this.materializedView = materializedView;
        this.model = model;
        this.project = project;
        this.rangePartitioning = rangePartitioning;
        this.requirePartitionFilter = requirePartitionFilter;
        this.schema = schema;
        this.tableReference = tableReference;
        this.timePartitioning = timePartitioning;
        this.view = view;
    }

    private TableArgs() {
        this.clustering = Output.empty();
        this.datasetId = Output.empty();
        this.description = Output.empty();
        this.encryptionConfiguration = Output.empty();
        this.expirationTime = Output.empty();
        this.externalDataConfiguration = Output.empty();
        this.friendlyName = Output.empty();
        this.labels = Output.empty();
        this.materializedView = Output.empty();
        this.model = Output.empty();
        this.project = Output.empty();
        this.rangePartitioning = Output.empty();
        this.requirePartitionFilter = Output.empty();
        this.schema = Output.empty();
        this.tableReference = Output.empty();
        this.timePartitioning = Output.empty();
        this.view = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusteringArgs> clustering;
        private Output<String> datasetId;
        private @Nullable Output<String> description;
        private @Nullable Output<EncryptionConfigurationArgs> encryptionConfiguration;
        private @Nullable Output<String> expirationTime;
        private @Nullable Output<ExternalDataConfigurationArgs> externalDataConfiguration;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<MaterializedViewDefinitionArgs> materializedView;
        private @Nullable Output<ModelDefinitionArgs> model;
        private @Nullable Output<String> project;
        private @Nullable Output<RangePartitioningArgs> rangePartitioning;
        private @Nullable Output<Boolean> requirePartitionFilter;
        private @Nullable Output<TableSchemaArgs> schema;
        private @Nullable Output<TableReferenceArgs> tableReference;
        private @Nullable Output<TimePartitioningArgs> timePartitioning;
        private @Nullable Output<ViewDefinitionArgs> view;

        public Builder() {
    	      // Empty
        }

        public Builder(TableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clustering = defaults.clustering;
    	      this.datasetId = defaults.datasetId;
    	      this.description = defaults.description;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.expirationTime = defaults.expirationTime;
    	      this.externalDataConfiguration = defaults.externalDataConfiguration;
    	      this.friendlyName = defaults.friendlyName;
    	      this.labels = defaults.labels;
    	      this.materializedView = defaults.materializedView;
    	      this.model = defaults.model;
    	      this.project = defaults.project;
    	      this.rangePartitioning = defaults.rangePartitioning;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.schema = defaults.schema;
    	      this.tableReference = defaults.tableReference;
    	      this.timePartitioning = defaults.timePartitioning;
    	      this.view = defaults.view;
        }

        public Builder clustering(@Nullable Output<ClusteringArgs> clustering) {
            this.clustering = clustering;
            return this;
        }

        public Builder clustering(@Nullable ClusteringArgs clustering) {
            this.clustering = Output.ofNullable(clustering);
            return this;
        }

        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
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

        public Builder encryptionConfiguration(@Nullable Output<EncryptionConfigurationArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder encryptionConfiguration(@Nullable EncryptionConfigurationArgs encryptionConfiguration) {
            this.encryptionConfiguration = Output.ofNullable(encryptionConfiguration);
            return this;
        }

        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder expirationTime(@Nullable String expirationTime) {
            this.expirationTime = Output.ofNullable(expirationTime);
            return this;
        }

        public Builder externalDataConfiguration(@Nullable Output<ExternalDataConfigurationArgs> externalDataConfiguration) {
            this.externalDataConfiguration = externalDataConfiguration;
            return this;
        }

        public Builder externalDataConfiguration(@Nullable ExternalDataConfigurationArgs externalDataConfiguration) {
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

        public Builder materializedView(@Nullable Output<MaterializedViewDefinitionArgs> materializedView) {
            this.materializedView = materializedView;
            return this;
        }

        public Builder materializedView(@Nullable MaterializedViewDefinitionArgs materializedView) {
            this.materializedView = Output.ofNullable(materializedView);
            return this;
        }

        public Builder model(@Nullable Output<ModelDefinitionArgs> model) {
            this.model = model;
            return this;
        }

        public Builder model(@Nullable ModelDefinitionArgs model) {
            this.model = Output.ofNullable(model);
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

        public Builder rangePartitioning(@Nullable Output<RangePartitioningArgs> rangePartitioning) {
            this.rangePartitioning = rangePartitioning;
            return this;
        }

        public Builder rangePartitioning(@Nullable RangePartitioningArgs rangePartitioning) {
            this.rangePartitioning = Output.ofNullable(rangePartitioning);
            return this;
        }

        public Builder requirePartitionFilter(@Nullable Output<Boolean> requirePartitionFilter) {
            this.requirePartitionFilter = requirePartitionFilter;
            return this;
        }

        public Builder requirePartitionFilter(@Nullable Boolean requirePartitionFilter) {
            this.requirePartitionFilter = Output.ofNullable(requirePartitionFilter);
            return this;
        }

        public Builder schema(@Nullable Output<TableSchemaArgs> schema) {
            this.schema = schema;
            return this;
        }

        public Builder schema(@Nullable TableSchemaArgs schema) {
            this.schema = Output.ofNullable(schema);
            return this;
        }

        public Builder tableReference(@Nullable Output<TableReferenceArgs> tableReference) {
            this.tableReference = tableReference;
            return this;
        }

        public Builder tableReference(@Nullable TableReferenceArgs tableReference) {
            this.tableReference = Output.ofNullable(tableReference);
            return this;
        }

        public Builder timePartitioning(@Nullable Output<TimePartitioningArgs> timePartitioning) {
            this.timePartitioning = timePartitioning;
            return this;
        }

        public Builder timePartitioning(@Nullable TimePartitioningArgs timePartitioning) {
            this.timePartitioning = Output.ofNullable(timePartitioning);
            return this;
        }

        public Builder view(@Nullable Output<ViewDefinitionArgs> view) {
            this.view = view;
            return this;
        }

        public Builder view(@Nullable ViewDefinitionArgs view) {
            this.view = Output.ofNullable(view);
            return this;
        }
        public TableArgs build() {
            return new TableArgs(clustering, datasetId, description, encryptionConfiguration, expirationTime, externalDataConfiguration, friendlyName, labels, materializedView, model, project, rangePartitioning, requirePartitionFilter, schema, tableReference, timePartitioning, view);
        }
    }
}
