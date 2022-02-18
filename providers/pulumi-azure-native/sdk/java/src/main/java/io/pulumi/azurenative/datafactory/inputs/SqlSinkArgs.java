// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SqlUpsertSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.StoredProcedureParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity SQL sink.
 * 
 */
public final class SqlSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlSinkArgs Empty = new SqlSinkArgs();

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
    private final @Nullable Input<Object> disableMetricsCollection;

    public Input<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Input.empty() : this.disableMetricsCollection;
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
    private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    /**
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="preCopyScript")
    private final @Nullable Input<Object> preCopyScript;

    public Input<Object> getPreCopyScript() {
        return this.preCopyScript == null ? Input.empty() : this.preCopyScript;
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sinkRetryCount")
    private final @Nullable Input<Object> sinkRetryCount;

    public Input<Object> getSinkRetryCount() {
        return this.sinkRetryCount == null ? Input.empty() : this.sinkRetryCount;
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sinkRetryWait")
    private final @Nullable Input<Object> sinkRetryWait;

    public Input<Object> getSinkRetryWait() {
        return this.sinkRetryWait == null ? Input.empty() : this.sinkRetryWait;
    }

    /**
     * SQL writer stored procedure name. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="sqlWriterStoredProcedureName")
    private final @Nullable Input<Object> sqlWriterStoredProcedureName;

    public Input<Object> getSqlWriterStoredProcedureName() {
        return this.sqlWriterStoredProcedureName == null ? Input.empty() : this.sqlWriterStoredProcedureName;
    }

    /**
     * SQL writer table type. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="sqlWriterTableType")
    private final @Nullable Input<Object> sqlWriterTableType;

    public Input<Object> getSqlWriterTableType() {
        return this.sqlWriterTableType == null ? Input.empty() : this.sqlWriterTableType;
    }

    /**
     * Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="sqlWriterUseTableLock")
    private final @Nullable Input<Object> sqlWriterUseTableLock;

    public Input<Object> getSqlWriterUseTableLock() {
        return this.sqlWriterUseTableLock == null ? Input.empty() : this.sqlWriterUseTableLock;
    }

    /**
     * SQL stored procedure parameters.
     * 
     */
    @InputImport(name="storedProcedureParameters")
    private final @Nullable Input<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters;

    public Input<Map<String,StoredProcedureParameterArgs>> getStoredProcedureParameters() {
        return this.storedProcedureParameters == null ? Input.empty() : this.storedProcedureParameters;
    }

    /**
     * The stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="storedProcedureTableTypeParameterName")
    private final @Nullable Input<Object> storedProcedureTableTypeParameterName;

    public Input<Object> getStoredProcedureTableTypeParameterName() {
        return this.storedProcedureTableTypeParameterName == null ? Input.empty() : this.storedProcedureTableTypeParameterName;
    }

    /**
     * The option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="tableOption")
    private final @Nullable Input<Object> tableOption;

    public Input<Object> getTableOption() {
        return this.tableOption == null ? Input.empty() : this.tableOption;
    }

    /**
     * Copy sink type.
     * Expected value is 'SqlSink'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * SQL upsert settings.
     * 
     */
    @InputImport(name="upsertSettings")
    private final @Nullable Input<SqlUpsertSettingsArgs> upsertSettings;

    public Input<SqlUpsertSettingsArgs> getUpsertSettings() {
        return this.upsertSettings == null ? Input.empty() : this.upsertSettings;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @InputImport(name="writeBatchSize")
    private final @Nullable Input<Object> writeBatchSize;

    public Input<Object> getWriteBatchSize() {
        return this.writeBatchSize == null ? Input.empty() : this.writeBatchSize;
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="writeBatchTimeout")
    private final @Nullable Input<Object> writeBatchTimeout;

    public Input<Object> getWriteBatchTimeout() {
        return this.writeBatchTimeout == null ? Input.empty() : this.writeBatchTimeout;
    }

    /**
     * Write behavior when copying data into sql. Type: SqlWriteBehaviorEnum (or Expression with resultType SqlWriteBehaviorEnum)
     * 
     */
    @InputImport(name="writeBehavior")
    private final @Nullable Input<Object> writeBehavior;

    public Input<Object> getWriteBehavior() {
        return this.writeBehavior == null ? Input.empty() : this.writeBehavior;
    }

    public SqlSinkArgs(
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> preCopyScript,
        @Nullable Input<Object> sinkRetryCount,
        @Nullable Input<Object> sinkRetryWait,
        @Nullable Input<Object> sqlWriterStoredProcedureName,
        @Nullable Input<Object> sqlWriterTableType,
        @Nullable Input<Object> sqlWriterUseTableLock,
        @Nullable Input<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters,
        @Nullable Input<Object> storedProcedureTableTypeParameterName,
        @Nullable Input<Object> tableOption,
        Input<String> type,
        @Nullable Input<SqlUpsertSettingsArgs> upsertSettings,
        @Nullable Input<Object> writeBatchSize,
        @Nullable Input<Object> writeBatchTimeout,
        @Nullable Input<Object> writeBehavior) {
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

    private SqlSinkArgs() {
        this.disableMetricsCollection = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.preCopyScript = Input.empty();
        this.sinkRetryCount = Input.empty();
        this.sinkRetryWait = Input.empty();
        this.sqlWriterStoredProcedureName = Input.empty();
        this.sqlWriterTableType = Input.empty();
        this.sqlWriterUseTableLock = Input.empty();
        this.storedProcedureParameters = Input.empty();
        this.storedProcedureTableTypeParameterName = Input.empty();
        this.tableOption = Input.empty();
        this.type = Input.empty();
        this.upsertSettings = Input.empty();
        this.writeBatchSize = Input.empty();
        this.writeBatchTimeout = Input.empty();
        this.writeBehavior = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> preCopyScript;
        private @Nullable Input<Object> sinkRetryCount;
        private @Nullable Input<Object> sinkRetryWait;
        private @Nullable Input<Object> sqlWriterStoredProcedureName;
        private @Nullable Input<Object> sqlWriterTableType;
        private @Nullable Input<Object> sqlWriterUseTableLock;
        private @Nullable Input<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters;
        private @Nullable Input<Object> storedProcedureTableTypeParameterName;
        private @Nullable Input<Object> tableOption;
        private Input<String> type;
        private @Nullable Input<SqlUpsertSettingsArgs> upsertSettings;
        private @Nullable Input<Object> writeBatchSize;
        private @Nullable Input<Object> writeBatchTimeout;
        private @Nullable Input<Object> writeBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlSinkArgs defaults) {
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

        public Builder setDisableMetricsCollection(@Nullable Input<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Input.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Input<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Input.ofNullable(maxConcurrentConnections);
            return this;
        }

        public Builder setPreCopyScript(@Nullable Input<Object> preCopyScript) {
            this.preCopyScript = preCopyScript;
            return this;
        }

        public Builder setPreCopyScript(@Nullable Object preCopyScript) {
            this.preCopyScript = Input.ofNullable(preCopyScript);
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Input<Object> sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = Input.ofNullable(sinkRetryCount);
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Input<Object> sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = Input.ofNullable(sinkRetryWait);
            return this;
        }

        public Builder setSqlWriterStoredProcedureName(@Nullable Input<Object> sqlWriterStoredProcedureName) {
            this.sqlWriterStoredProcedureName = sqlWriterStoredProcedureName;
            return this;
        }

        public Builder setSqlWriterStoredProcedureName(@Nullable Object sqlWriterStoredProcedureName) {
            this.sqlWriterStoredProcedureName = Input.ofNullable(sqlWriterStoredProcedureName);
            return this;
        }

        public Builder setSqlWriterTableType(@Nullable Input<Object> sqlWriterTableType) {
            this.sqlWriterTableType = sqlWriterTableType;
            return this;
        }

        public Builder setSqlWriterTableType(@Nullable Object sqlWriterTableType) {
            this.sqlWriterTableType = Input.ofNullable(sqlWriterTableType);
            return this;
        }

        public Builder setSqlWriterUseTableLock(@Nullable Input<Object> sqlWriterUseTableLock) {
            this.sqlWriterUseTableLock = sqlWriterUseTableLock;
            return this;
        }

        public Builder setSqlWriterUseTableLock(@Nullable Object sqlWriterUseTableLock) {
            this.sqlWriterUseTableLock = Input.ofNullable(sqlWriterUseTableLock);
            return this;
        }

        public Builder setStoredProcedureParameters(@Nullable Input<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters) {
            this.storedProcedureParameters = storedProcedureParameters;
            return this;
        }

        public Builder setStoredProcedureParameters(@Nullable Map<String,StoredProcedureParameterArgs> storedProcedureParameters) {
            this.storedProcedureParameters = Input.ofNullable(storedProcedureParameters);
            return this;
        }

        public Builder setStoredProcedureTableTypeParameterName(@Nullable Input<Object> storedProcedureTableTypeParameterName) {
            this.storedProcedureTableTypeParameterName = storedProcedureTableTypeParameterName;
            return this;
        }

        public Builder setStoredProcedureTableTypeParameterName(@Nullable Object storedProcedureTableTypeParameterName) {
            this.storedProcedureTableTypeParameterName = Input.ofNullable(storedProcedureTableTypeParameterName);
            return this;
        }

        public Builder setTableOption(@Nullable Input<Object> tableOption) {
            this.tableOption = tableOption;
            return this;
        }

        public Builder setTableOption(@Nullable Object tableOption) {
            this.tableOption = Input.ofNullable(tableOption);
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

        public Builder setUpsertSettings(@Nullable Input<SqlUpsertSettingsArgs> upsertSettings) {
            this.upsertSettings = upsertSettings;
            return this;
        }

        public Builder setUpsertSettings(@Nullable SqlUpsertSettingsArgs upsertSettings) {
            this.upsertSettings = Input.ofNullable(upsertSettings);
            return this;
        }

        public Builder setWriteBatchSize(@Nullable Input<Object> writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder setWriteBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = Input.ofNullable(writeBatchSize);
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Input<Object> writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = Input.ofNullable(writeBatchTimeout);
            return this;
        }

        public Builder setWriteBehavior(@Nullable Input<Object> writeBehavior) {
            this.writeBehavior = writeBehavior;
            return this;
        }

        public Builder setWriteBehavior(@Nullable Object writeBehavior) {
            this.writeBehavior = Input.ofNullable(writeBehavior);
            return this;
        }

        public SqlSinkArgs build() {
            return new SqlSinkArgs(disableMetricsCollection, maxConcurrentConnections, preCopyScript, sinkRetryCount, sinkRetryWait, sqlWriterStoredProcedureName, sqlWriterTableType, sqlWriterUseTableLock, storedProcedureParameters, storedProcedureTableTypeParameterName, tableOption, type, upsertSettings, writeBatchSize, writeBatchTimeout, writeBehavior);
        }
    }
}
