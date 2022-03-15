// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SqlUpsertSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.StoredProcedureParameterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity Azure SQL sink.
 * 
 */
public final class AzureSqlSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureSqlSinkArgs Empty = new AzureSqlSinkArgs();

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Output.empty() : this.disableMetricsCollection;
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Output.empty() : this.maxConcurrentConnections;
    }

    /**
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="preCopyScript")
      private final @Nullable Output<Object> preCopyScript;

    public Output<Object> getPreCopyScript() {
        return this.preCopyScript == null ? Output.empty() : this.preCopyScript;
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
      private final @Nullable Output<Object> sinkRetryCount;

    public Output<Object> getSinkRetryCount() {
        return this.sinkRetryCount == null ? Output.empty() : this.sinkRetryCount;
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
      private final @Nullable Output<Object> sinkRetryWait;

    public Output<Object> getSinkRetryWait() {
        return this.sinkRetryWait == null ? Output.empty() : this.sinkRetryWait;
    }

    /**
     * SQL writer stored procedure name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlWriterStoredProcedureName")
      private final @Nullable Output<Object> sqlWriterStoredProcedureName;

    public Output<Object> getSqlWriterStoredProcedureName() {
        return this.sqlWriterStoredProcedureName == null ? Output.empty() : this.sqlWriterStoredProcedureName;
    }

    /**
     * SQL writer table type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlWriterTableType")
      private final @Nullable Output<Object> sqlWriterTableType;

    public Output<Object> getSqlWriterTableType() {
        return this.sqlWriterTableType == null ? Output.empty() : this.sqlWriterTableType;
    }

    /**
     * Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="sqlWriterUseTableLock")
      private final @Nullable Output<Object> sqlWriterUseTableLock;

    public Output<Object> getSqlWriterUseTableLock() {
        return this.sqlWriterUseTableLock == null ? Output.empty() : this.sqlWriterUseTableLock;
    }

    /**
     * SQL stored procedure parameters.
     * 
     */
    @Import(name="storedProcedureParameters")
      private final @Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters;

    public Output<Map<String,StoredProcedureParameterArgs>> getStoredProcedureParameters() {
        return this.storedProcedureParameters == null ? Output.empty() : this.storedProcedureParameters;
    }

    /**
     * The stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="storedProcedureTableTypeParameterName")
      private final @Nullable Output<Object> storedProcedureTableTypeParameterName;

    public Output<Object> getStoredProcedureTableTypeParameterName() {
        return this.storedProcedureTableTypeParameterName == null ? Output.empty() : this.storedProcedureTableTypeParameterName;
    }

    /**
     * The option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tableOption")
      private final @Nullable Output<Object> tableOption;

    public Output<Object> getTableOption() {
        return this.tableOption == null ? Output.empty() : this.tableOption;
    }

    /**
     * Copy sink type.
     * Expected value is 'AzureSqlSink'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * SQL upsert settings.
     * 
     */
    @Import(name="upsertSettings")
      private final @Nullable Output<SqlUpsertSettingsArgs> upsertSettings;

    public Output<SqlUpsertSettingsArgs> getUpsertSettings() {
        return this.upsertSettings == null ? Output.empty() : this.upsertSettings;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
      private final @Nullable Output<Object> writeBatchSize;

    public Output<Object> getWriteBatchSize() {
        return this.writeBatchSize == null ? Output.empty() : this.writeBatchSize;
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
      private final @Nullable Output<Object> writeBatchTimeout;

    public Output<Object> getWriteBatchTimeout() {
        return this.writeBatchTimeout == null ? Output.empty() : this.writeBatchTimeout;
    }

    /**
     * Write behavior when copying data into Azure SQL. Type: SqlWriteBehaviorEnum (or Expression with resultType SqlWriteBehaviorEnum)
     * 
     */
    @Import(name="writeBehavior")
      private final @Nullable Output<Object> writeBehavior;

    public Output<Object> getWriteBehavior() {
        return this.writeBehavior == null ? Output.empty() : this.writeBehavior;
    }

    public AzureSqlSinkArgs(
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> preCopyScript,
        @Nullable Output<Object> sinkRetryCount,
        @Nullable Output<Object> sinkRetryWait,
        @Nullable Output<Object> sqlWriterStoredProcedureName,
        @Nullable Output<Object> sqlWriterTableType,
        @Nullable Output<Object> sqlWriterUseTableLock,
        @Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters,
        @Nullable Output<Object> storedProcedureTableTypeParameterName,
        @Nullable Output<Object> tableOption,
        Output<String> type,
        @Nullable Output<SqlUpsertSettingsArgs> upsertSettings,
        @Nullable Output<Object> writeBatchSize,
        @Nullable Output<Object> writeBatchTimeout,
        @Nullable Output<Object> writeBehavior) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.preCopyScript = preCopyScript;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.sqlWriterStoredProcedureName = sqlWriterStoredProcedureName;
        this.sqlWriterTableType = sqlWriterTableType;
        this.sqlWriterUseTableLock = sqlWriterUseTableLock;
        this.storedProcedureParameters = storedProcedureParameters;
        this.storedProcedureTableTypeParameterName = storedProcedureTableTypeParameterName;
        this.tableOption = tableOption;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.upsertSettings = upsertSettings;
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
        this.writeBehavior = writeBehavior;
    }

    private AzureSqlSinkArgs() {
        this.disableMetricsCollection = Output.empty();
        this.maxConcurrentConnections = Output.empty();
        this.preCopyScript = Output.empty();
        this.sinkRetryCount = Output.empty();
        this.sinkRetryWait = Output.empty();
        this.sqlWriterStoredProcedureName = Output.empty();
        this.sqlWriterTableType = Output.empty();
        this.sqlWriterUseTableLock = Output.empty();
        this.storedProcedureParameters = Output.empty();
        this.storedProcedureTableTypeParameterName = Output.empty();
        this.tableOption = Output.empty();
        this.type = Output.empty();
        this.upsertSettings = Output.empty();
        this.writeBatchSize = Output.empty();
        this.writeBatchTimeout = Output.empty();
        this.writeBehavior = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> preCopyScript;
        private @Nullable Output<Object> sinkRetryCount;
        private @Nullable Output<Object> sinkRetryWait;
        private @Nullable Output<Object> sqlWriterStoredProcedureName;
        private @Nullable Output<Object> sqlWriterTableType;
        private @Nullable Output<Object> sqlWriterUseTableLock;
        private @Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters;
        private @Nullable Output<Object> storedProcedureTableTypeParameterName;
        private @Nullable Output<Object> tableOption;
        private Output<String> type;
        private @Nullable Output<SqlUpsertSettingsArgs> upsertSettings;
        private @Nullable Output<Object> writeBatchSize;
        private @Nullable Output<Object> writeBatchTimeout;
        private @Nullable Output<Object> writeBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.preCopyScript = defaults.preCopyScript;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.sqlWriterStoredProcedureName = defaults.sqlWriterStoredProcedureName;
    	      this.sqlWriterTableType = defaults.sqlWriterTableType;
    	      this.sqlWriterUseTableLock = defaults.sqlWriterUseTableLock;
    	      this.storedProcedureParameters = defaults.storedProcedureParameters;
    	      this.storedProcedureTableTypeParameterName = defaults.storedProcedureTableTypeParameterName;
    	      this.tableOption = defaults.tableOption;
    	      this.type = defaults.type;
    	      this.upsertSettings = defaults.upsertSettings;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
    	      this.writeBehavior = defaults.writeBehavior;
        }

        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Output.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Output.ofNullable(maxConcurrentConnections);
            return this;
        }

        public Builder preCopyScript(@Nullable Output<Object> preCopyScript) {
            this.preCopyScript = preCopyScript;
            return this;
        }

        public Builder preCopyScript(@Nullable Object preCopyScript) {
            this.preCopyScript = Output.ofNullable(preCopyScript);
            return this;
        }

        public Builder sinkRetryCount(@Nullable Output<Object> sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = Output.ofNullable(sinkRetryCount);
            return this;
        }

        public Builder sinkRetryWait(@Nullable Output<Object> sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = Output.ofNullable(sinkRetryWait);
            return this;
        }

        public Builder sqlWriterStoredProcedureName(@Nullable Output<Object> sqlWriterStoredProcedureName) {
            this.sqlWriterStoredProcedureName = sqlWriterStoredProcedureName;
            return this;
        }

        public Builder sqlWriterStoredProcedureName(@Nullable Object sqlWriterStoredProcedureName) {
            this.sqlWriterStoredProcedureName = Output.ofNullable(sqlWriterStoredProcedureName);
            return this;
        }

        public Builder sqlWriterTableType(@Nullable Output<Object> sqlWriterTableType) {
            this.sqlWriterTableType = sqlWriterTableType;
            return this;
        }

        public Builder sqlWriterTableType(@Nullable Object sqlWriterTableType) {
            this.sqlWriterTableType = Output.ofNullable(sqlWriterTableType);
            return this;
        }

        public Builder sqlWriterUseTableLock(@Nullable Output<Object> sqlWriterUseTableLock) {
            this.sqlWriterUseTableLock = sqlWriterUseTableLock;
            return this;
        }

        public Builder sqlWriterUseTableLock(@Nullable Object sqlWriterUseTableLock) {
            this.sqlWriterUseTableLock = Output.ofNullable(sqlWriterUseTableLock);
            return this;
        }

        public Builder storedProcedureParameters(@Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters) {
            this.storedProcedureParameters = storedProcedureParameters;
            return this;
        }

        public Builder storedProcedureParameters(@Nullable Map<String,StoredProcedureParameterArgs> storedProcedureParameters) {
            this.storedProcedureParameters = Output.ofNullable(storedProcedureParameters);
            return this;
        }

        public Builder storedProcedureTableTypeParameterName(@Nullable Output<Object> storedProcedureTableTypeParameterName) {
            this.storedProcedureTableTypeParameterName = storedProcedureTableTypeParameterName;
            return this;
        }

        public Builder storedProcedureTableTypeParameterName(@Nullable Object storedProcedureTableTypeParameterName) {
            this.storedProcedureTableTypeParameterName = Output.ofNullable(storedProcedureTableTypeParameterName);
            return this;
        }

        public Builder tableOption(@Nullable Output<Object> tableOption) {
            this.tableOption = tableOption;
            return this;
        }

        public Builder tableOption(@Nullable Object tableOption) {
            this.tableOption = Output.ofNullable(tableOption);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder upsertSettings(@Nullable Output<SqlUpsertSettingsArgs> upsertSettings) {
            this.upsertSettings = upsertSettings;
            return this;
        }

        public Builder upsertSettings(@Nullable SqlUpsertSettingsArgs upsertSettings) {
            this.upsertSettings = Output.ofNullable(upsertSettings);
            return this;
        }

        public Builder writeBatchSize(@Nullable Output<Object> writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = Output.ofNullable(writeBatchSize);
            return this;
        }

        public Builder writeBatchTimeout(@Nullable Output<Object> writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = Output.ofNullable(writeBatchTimeout);
            return this;
        }

        public Builder writeBehavior(@Nullable Output<Object> writeBehavior) {
            this.writeBehavior = writeBehavior;
            return this;
        }

        public Builder writeBehavior(@Nullable Object writeBehavior) {
            this.writeBehavior = Output.ofNullable(writeBehavior);
            return this;
        }
        public AzureSqlSinkArgs build() {
            return new AzureSqlSinkArgs(disableMetricsCollection, maxConcurrentConnections, preCopyScript, sinkRetryCount, sinkRetryWait, sqlWriterStoredProcedureName, sqlWriterTableType, sqlWriterUseTableLock, storedProcedureParameters, storedProcedureTableTypeParameterName, tableOption, type, upsertSettings, writeBatchSize, writeBatchTimeout, writeBehavior);
        }
    }
}
