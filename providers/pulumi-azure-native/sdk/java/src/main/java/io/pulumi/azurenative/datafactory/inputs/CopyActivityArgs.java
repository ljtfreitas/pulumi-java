// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.AmazonMWSSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.AmazonRdsForOracleSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.AmazonRdsForSqlServerSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.AmazonRedshiftSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.AvroSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.AvroSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobFSSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobFSSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataExplorerSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataExplorerSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDatabricksDeltaLakeSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDatabricksDeltaLakeSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMariaDBSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMySqlSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMySqlSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzurePostgreSqlSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.AzurePostgreSqlSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureQueueSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureSearchIndexSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureSqlSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureSqlSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureTableSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureTableSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.BinarySinkArgs;
import io.pulumi.azurenative.datafactory.inputs.BinarySourceArgs;
import io.pulumi.azurenative.datafactory.inputs.BlobSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.BlobSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.CassandraSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.CommonDataServiceForAppsSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.CommonDataServiceForAppsSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.ConcurSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.CosmosDbMongoDbApiSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.CosmosDbMongoDbApiSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.CosmosDbSqlApiSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.CosmosDbSqlApiSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.CouchbaseSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.DatasetReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.Db2SourceArgs;
import io.pulumi.azurenative.datafactory.inputs.DelimitedTextSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.DelimitedTextSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.DocumentDbCollectionSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.DocumentDbCollectionSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.DrillSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.DynamicsAXSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.DynamicsCrmSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.DynamicsCrmSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.DynamicsSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.DynamicsSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.EloquaSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.ExcelSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.FileSystemSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.FileSystemSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.GoogleAdWordsSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.GoogleBigQuerySourceArgs;
import io.pulumi.azurenative.datafactory.inputs.GreenplumSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.HBaseSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.HdfsSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.HiveSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.HttpSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.HubspotSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.ImpalaSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.InformixSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.InformixSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.JiraSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.JsonSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.JsonSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.LogSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.LogStorageSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.MagentoSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.MariaDBSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.MarketoSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.MicrosoftAccessSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.MicrosoftAccessSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.MongoDbAtlasSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.MongoDbAtlasSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.MongoDbSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.MongoDbV2SinkArgs;
import io.pulumi.azurenative.datafactory.inputs.MongoDbV2SourceArgs;
import io.pulumi.azurenative.datafactory.inputs.MySqlSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.NetezzaSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.ODataSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.OdbcSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.OdbcSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.Office365SourceArgs;
import io.pulumi.azurenative.datafactory.inputs.OracleServiceCloudSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.OracleSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.OracleSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.OrcSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.OrcSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParquetSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.ParquetSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.PaypalSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.PhoenixSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.PostgreSqlSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.PrestoSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.QuickBooksSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.RedirectIncompatibleRowSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.RelationalSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.ResponsysSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.RestSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.RestSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SalesforceMarketingCloudSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SalesforceServiceCloudSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.SalesforceServiceCloudSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SalesforceSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.SalesforceSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SapBwSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SapCloudForCustomerSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.SapCloudForCustomerSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SapEccSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SapHanaSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SapOpenHubSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SapTableSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.ServiceNowSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SharePointOnlineListSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.ShopifySourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SkipErrorFileArgs;
import io.pulumi.azurenative.datafactory.inputs.SnowflakeSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.SnowflakeSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SparkSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlDWSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlDWSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlMISinkArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlMISourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlServerSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlServerSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.SquareSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.StagingSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.SybaseSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.TabularSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.TeradataSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.azurenative.datafactory.inputs.VerticaSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.WebSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.XeroSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.XmlSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.ZohoSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Copy activity.
 * 
 */
public final class CopyActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final CopyActivityArgs Empty = new CopyActivityArgs();

    /**
     * Maximum number of data integration units that can be used to perform this data movement. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @InputImport(name="dataIntegrationUnits")
    private final @Nullable Input<Object> dataIntegrationUnits;

    public Input<Object> getDataIntegrationUnits() {
        return this.dataIntegrationUnits == null ? Input.empty() : this.dataIntegrationUnits;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
    private final @Nullable Input<List<ActivityDependencyArgs>> dependsOn;

    public Input<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether to skip incompatible row. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="enableSkipIncompatibleRow")
    private final @Nullable Input<Object> enableSkipIncompatibleRow;

    public Input<Object> getEnableSkipIncompatibleRow() {
        return this.enableSkipIncompatibleRow == null ? Input.empty() : this.enableSkipIncompatibleRow;
    }

    /**
     * Specifies whether to copy data via an interim staging. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="enableStaging")
    private final @Nullable Input<Object> enableStaging;

    public Input<Object> getEnableStaging() {
        return this.enableStaging == null ? Input.empty() : this.enableStaging;
    }

    /**
     * List of inputs for the activity.
     * 
     */
    @InputImport(name="inputs")
    private final @Nullable Input<List<DatasetReferenceArgs>> inputs;

    public Input<List<DatasetReferenceArgs>> getInputs() {
        return this.inputs == null ? Input.empty() : this.inputs;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName")
    private final @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName == null ? Input.empty() : this.linkedServiceName;
    }

    /**
     * Log settings customer needs provide when enabling log.
     * 
     */
    @InputImport(name="logSettings")
    private final @Nullable Input<LogSettingsArgs> logSettings;

    public Input<LogSettingsArgs> getLogSettings() {
        return this.logSettings == null ? Input.empty() : this.logSettings;
    }

    /**
     * (Deprecated. Please use LogSettings) Log storage settings customer need to provide when enabling session log.
     * 
     */
    @InputImport(name="logStorageSettings")
    private final @Nullable Input<LogStorageSettingsArgs> logStorageSettings;

    public Input<LogStorageSettingsArgs> getLogStorageSettings() {
        return this.logStorageSettings == null ? Input.empty() : this.logStorageSettings;
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * List of outputs for the activity.
     * 
     */
    @InputImport(name="outputs")
    private final @Nullable Input<List<DatasetReferenceArgs>> outputs;

    public Input<List<DatasetReferenceArgs>> getOutputs() {
        return this.outputs == null ? Input.empty() : this.outputs;
    }

    /**
     * Maximum number of concurrent sessions opened on the source or sink to avoid overloading the data store. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @InputImport(name="parallelCopies")
    private final @Nullable Input<Object> parallelCopies;

    public Input<Object> getParallelCopies() {
        return this.parallelCopies == null ? Input.empty() : this.parallelCopies;
    }

    /**
     * Activity policy.
     * 
     */
    @InputImport(name="policy")
    private final @Nullable Input<ActivityPolicyArgs> policy;

    public Input<ActivityPolicyArgs> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * Preserve rules.
     * 
     */
    @InputImport(name="preserve")
    private final @Nullable Input<List<Object>> preserve;

    public Input<List<Object>> getPreserve() {
        return this.preserve == null ? Input.empty() : this.preserve;
    }

    /**
     * Preserve Rules.
     * 
     */
    @InputImport(name="preserveRules")
    private final @Nullable Input<List<Object>> preserveRules;

    public Input<List<Object>> getPreserveRules() {
        return this.preserveRules == null ? Input.empty() : this.preserveRules;
    }

    /**
     * Redirect incompatible row settings when EnableSkipIncompatibleRow is true.
     * 
     */
    @InputImport(name="redirectIncompatibleRowSettings")
    private final @Nullable Input<RedirectIncompatibleRowSettingsArgs> redirectIncompatibleRowSettings;

    public Input<RedirectIncompatibleRowSettingsArgs> getRedirectIncompatibleRowSettings() {
        return this.redirectIncompatibleRowSettings == null ? Input.empty() : this.redirectIncompatibleRowSettings;
    }

    /**
     * Copy activity sink.
     * 
     */
    @InputImport(name="sink", required=true)
    private final Input<Object> sink;

    public Input<Object> getSink() {
        return this.sink;
    }

    /**
     * Specify the fault tolerance for data consistency.
     * 
     */
    @InputImport(name="skipErrorFile")
    private final @Nullable Input<SkipErrorFileArgs> skipErrorFile;

    public Input<SkipErrorFileArgs> getSkipErrorFile() {
        return this.skipErrorFile == null ? Input.empty() : this.skipErrorFile;
    }

    /**
     * Copy activity source.
     * 
     */
    @InputImport(name="source", required=true)
    private final Input<Object> source;

    public Input<Object> getSource() {
        return this.source;
    }

    /**
     * Specifies interim staging settings when EnableStaging is true.
     * 
     */
    @InputImport(name="stagingSettings")
    private final @Nullable Input<StagingSettingsArgs> stagingSettings;

    public Input<StagingSettingsArgs> getStagingSettings() {
        return this.stagingSettings == null ? Input.empty() : this.stagingSettings;
    }

    /**
     * Copy activity translator. If not specified, tabular translator is used.
     * 
     */
    @InputImport(name="translator")
    private final @Nullable Input<Object> translator;

    public Input<Object> getTranslator() {
        return this.translator == null ? Input.empty() : this.translator;
    }

    /**
     * Type of activity.
     * Expected value is 'Copy'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
    private final @Nullable Input<List<UserPropertyArgs>> userProperties;

    public Input<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Input.empty() : this.userProperties;
    }

    /**
     * Whether to enable Data Consistency validation. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="validateDataConsistency")
    private final @Nullable Input<Object> validateDataConsistency;

    public Input<Object> getValidateDataConsistency() {
        return this.validateDataConsistency == null ? Input.empty() : this.validateDataConsistency;
    }

    public CopyActivityArgs(
        @Nullable Input<Object> dataIntegrationUnits,
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        @Nullable Input<Object> enableSkipIncompatibleRow,
        @Nullable Input<Object> enableStaging,
        @Nullable Input<List<DatasetReferenceArgs>> inputs,
        @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Input<LogSettingsArgs> logSettings,
        @Nullable Input<LogStorageSettingsArgs> logStorageSettings,
        Input<String> name,
        @Nullable Input<List<DatasetReferenceArgs>> outputs,
        @Nullable Input<Object> parallelCopies,
        @Nullable Input<ActivityPolicyArgs> policy,
        @Nullable Input<List<Object>> preserve,
        @Nullable Input<List<Object>> preserveRules,
        @Nullable Input<RedirectIncompatibleRowSettingsArgs> redirectIncompatibleRowSettings,
        Input<Object> sink,
        @Nullable Input<SkipErrorFileArgs> skipErrorFile,
        Input<Object> source,
        @Nullable Input<StagingSettingsArgs> stagingSettings,
        @Nullable Input<Object> translator,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties,
        @Nullable Input<Object> validateDataConsistency) {
        this.dataIntegrationUnits = dataIntegrationUnits;
        this.dependsOn = dependsOn;
        this.description = description;
        this.enableSkipIncompatibleRow = enableSkipIncompatibleRow;
        this.enableStaging = enableStaging;
        this.inputs = inputs;
        this.linkedServiceName = linkedServiceName;
        this.logSettings = logSettings;
        this.logStorageSettings = logStorageSettings;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.outputs = outputs;
        this.parallelCopies = parallelCopies;
        this.policy = policy;
        this.preserve = preserve;
        this.preserveRules = preserveRules;
        this.redirectIncompatibleRowSettings = redirectIncompatibleRowSettings;
        this.sink = Objects.requireNonNull(sink, "expected parameter 'sink' to be non-null");
        this.skipErrorFile = skipErrorFile;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.stagingSettings = stagingSettings;
        this.translator = translator;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
        this.validateDataConsistency = validateDataConsistency;
    }

    private CopyActivityArgs() {
        this.dataIntegrationUnits = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.enableSkipIncompatibleRow = Input.empty();
        this.enableStaging = Input.empty();
        this.inputs = Input.empty();
        this.linkedServiceName = Input.empty();
        this.logSettings = Input.empty();
        this.logStorageSettings = Input.empty();
        this.name = Input.empty();
        this.outputs = Input.empty();
        this.parallelCopies = Input.empty();
        this.policy = Input.empty();
        this.preserve = Input.empty();
        this.preserveRules = Input.empty();
        this.redirectIncompatibleRowSettings = Input.empty();
        this.sink = Input.empty();
        this.skipErrorFile = Input.empty();
        this.source = Input.empty();
        this.stagingSettings = Input.empty();
        this.translator = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
        this.validateDataConsistency = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CopyActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> dataIntegrationUnits;
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> enableSkipIncompatibleRow;
        private @Nullable Input<Object> enableStaging;
        private @Nullable Input<List<DatasetReferenceArgs>> inputs;
        private @Nullable Input<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Input<LogSettingsArgs> logSettings;
        private @Nullable Input<LogStorageSettingsArgs> logStorageSettings;
        private Input<String> name;
        private @Nullable Input<List<DatasetReferenceArgs>> outputs;
        private @Nullable Input<Object> parallelCopies;
        private @Nullable Input<ActivityPolicyArgs> policy;
        private @Nullable Input<List<Object>> preserve;
        private @Nullable Input<List<Object>> preserveRules;
        private @Nullable Input<RedirectIncompatibleRowSettingsArgs> redirectIncompatibleRowSettings;
        private Input<Object> sink;
        private @Nullable Input<SkipErrorFileArgs> skipErrorFile;
        private Input<Object> source;
        private @Nullable Input<StagingSettingsArgs> stagingSettings;
        private @Nullable Input<Object> translator;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;
        private @Nullable Input<Object> validateDataConsistency;

        public Builder() {
    	      // Empty
        }

        public Builder(CopyActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataIntegrationUnits = defaults.dataIntegrationUnits;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.enableSkipIncompatibleRow = defaults.enableSkipIncompatibleRow;
    	      this.enableStaging = defaults.enableStaging;
    	      this.inputs = defaults.inputs;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.logSettings = defaults.logSettings;
    	      this.logStorageSettings = defaults.logStorageSettings;
    	      this.name = defaults.name;
    	      this.outputs = defaults.outputs;
    	      this.parallelCopies = defaults.parallelCopies;
    	      this.policy = defaults.policy;
    	      this.preserve = defaults.preserve;
    	      this.preserveRules = defaults.preserveRules;
    	      this.redirectIncompatibleRowSettings = defaults.redirectIncompatibleRowSettings;
    	      this.sink = defaults.sink;
    	      this.skipErrorFile = defaults.skipErrorFile;
    	      this.source = defaults.source;
    	      this.stagingSettings = defaults.stagingSettings;
    	      this.translator = defaults.translator;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.validateDataConsistency = defaults.validateDataConsistency;
        }

        public Builder setDataIntegrationUnits(@Nullable Input<Object> dataIntegrationUnits) {
            this.dataIntegrationUnits = dataIntegrationUnits;
            return this;
        }

        public Builder setDataIntegrationUnits(@Nullable Object dataIntegrationUnits) {
            this.dataIntegrationUnits = Input.ofNullable(dataIntegrationUnits);
            return this;
        }

        public Builder setDependsOn(@Nullable Input<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnableSkipIncompatibleRow(@Nullable Input<Object> enableSkipIncompatibleRow) {
            this.enableSkipIncompatibleRow = enableSkipIncompatibleRow;
            return this;
        }

        public Builder setEnableSkipIncompatibleRow(@Nullable Object enableSkipIncompatibleRow) {
            this.enableSkipIncompatibleRow = Input.ofNullable(enableSkipIncompatibleRow);
            return this;
        }

        public Builder setEnableStaging(@Nullable Input<Object> enableStaging) {
            this.enableStaging = enableStaging;
            return this;
        }

        public Builder setEnableStaging(@Nullable Object enableStaging) {
            this.enableStaging = Input.ofNullable(enableStaging);
            return this;
        }

        public Builder setInputs(@Nullable Input<List<DatasetReferenceArgs>> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder setInputs(@Nullable List<DatasetReferenceArgs> inputs) {
            this.inputs = Input.ofNullable(inputs);
            return this;
        }

        public Builder setLinkedServiceName(@Nullable Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.ofNullable(linkedServiceName);
            return this;
        }

        public Builder setLogSettings(@Nullable Input<LogSettingsArgs> logSettings) {
            this.logSettings = logSettings;
            return this;
        }

        public Builder setLogSettings(@Nullable LogSettingsArgs logSettings) {
            this.logSettings = Input.ofNullable(logSettings);
            return this;
        }

        public Builder setLogStorageSettings(@Nullable Input<LogStorageSettingsArgs> logStorageSettings) {
            this.logStorageSettings = logStorageSettings;
            return this;
        }

        public Builder setLogStorageSettings(@Nullable LogStorageSettingsArgs logStorageSettings) {
            this.logStorageSettings = Input.ofNullable(logStorageSettings);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setOutputs(@Nullable Input<List<DatasetReferenceArgs>> outputs) {
            this.outputs = outputs;
            return this;
        }

        public Builder setOutputs(@Nullable List<DatasetReferenceArgs> outputs) {
            this.outputs = Input.ofNullable(outputs);
            return this;
        }

        public Builder setParallelCopies(@Nullable Input<Object> parallelCopies) {
            this.parallelCopies = parallelCopies;
            return this;
        }

        public Builder setParallelCopies(@Nullable Object parallelCopies) {
            this.parallelCopies = Input.ofNullable(parallelCopies);
            return this;
        }

        public Builder setPolicy(@Nullable Input<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder setPreserve(@Nullable Input<List<Object>> preserve) {
            this.preserve = preserve;
            return this;
        }

        public Builder setPreserve(@Nullable List<Object> preserve) {
            this.preserve = Input.ofNullable(preserve);
            return this;
        }

        public Builder setPreserveRules(@Nullable Input<List<Object>> preserveRules) {
            this.preserveRules = preserveRules;
            return this;
        }

        public Builder setPreserveRules(@Nullable List<Object> preserveRules) {
            this.preserveRules = Input.ofNullable(preserveRules);
            return this;
        }

        public Builder setRedirectIncompatibleRowSettings(@Nullable Input<RedirectIncompatibleRowSettingsArgs> redirectIncompatibleRowSettings) {
            this.redirectIncompatibleRowSettings = redirectIncompatibleRowSettings;
            return this;
        }

        public Builder setRedirectIncompatibleRowSettings(@Nullable RedirectIncompatibleRowSettingsArgs redirectIncompatibleRowSettings) {
            this.redirectIncompatibleRowSettings = Input.ofNullable(redirectIncompatibleRowSettings);
            return this;
        }

        public Builder setSink(Input<Object> sink) {
            this.sink = Objects.requireNonNull(sink);
            return this;
        }

        public Builder setSink(Object sink) {
            this.sink = Input.of(Objects.requireNonNull(sink));
            return this;
        }

        public Builder setSkipErrorFile(@Nullable Input<SkipErrorFileArgs> skipErrorFile) {
            this.skipErrorFile = skipErrorFile;
            return this;
        }

        public Builder setSkipErrorFile(@Nullable SkipErrorFileArgs skipErrorFile) {
            this.skipErrorFile = Input.ofNullable(skipErrorFile);
            return this;
        }

        public Builder setSource(Input<Object> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(Object source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }

        public Builder setStagingSettings(@Nullable Input<StagingSettingsArgs> stagingSettings) {
            this.stagingSettings = stagingSettings;
            return this;
        }

        public Builder setStagingSettings(@Nullable StagingSettingsArgs stagingSettings) {
            this.stagingSettings = Input.ofNullable(stagingSettings);
            return this;
        }

        public Builder setTranslator(@Nullable Input<Object> translator) {
            this.translator = translator;
            return this;
        }

        public Builder setTranslator(@Nullable Object translator) {
            this.translator = Input.ofNullable(translator);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserProperties(@Nullable Input<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Input.ofNullable(userProperties);
            return this;
        }

        public Builder setValidateDataConsistency(@Nullable Input<Object> validateDataConsistency) {
            this.validateDataConsistency = validateDataConsistency;
            return this;
        }

        public Builder setValidateDataConsistency(@Nullable Object validateDataConsistency) {
            this.validateDataConsistency = Input.ofNullable(validateDataConsistency);
            return this;
        }

        public CopyActivityArgs build() {
            return new CopyActivityArgs(dataIntegrationUnits, dependsOn, description, enableSkipIncompatibleRow, enableStaging, inputs, linkedServiceName, logSettings, logStorageSettings, name, outputs, parallelCopies, policy, preserve, preserveRules, redirectIncompatibleRowSettings, sink, skipErrorFile, source, stagingSettings, translator, type, userProperties, validateDataConsistency);
        }
    }
}
