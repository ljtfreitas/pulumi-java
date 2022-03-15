// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SqlUpsertSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.StoredProcedureParameterResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Azure SQL sink.
 * 
 */
public final class AzureSqlSinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureSqlSinkResponse Empty = new AzureSqlSinkResponse();

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Object disableMetricsCollection;

    public Optional<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="preCopyScript")
      private final @Nullable Object preCopyScript;

    public Optional<Object> getPreCopyScript() {
        return this.preCopyScript == null ? Optional.empty() : Optional.ofNullable(this.preCopyScript);
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
      private final @Nullable Object sinkRetryCount;

    public Optional<Object> getSinkRetryCount() {
        return this.sinkRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sinkRetryCount);
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
      private final @Nullable Object sinkRetryWait;

    public Optional<Object> getSinkRetryWait() {
        return this.sinkRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sinkRetryWait);
    }

    /**
     * SQL writer stored procedure name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlWriterStoredProcedureName")
      private final @Nullable Object sqlWriterStoredProcedureName;

    public Optional<Object> getSqlWriterStoredProcedureName() {
        return this.sqlWriterStoredProcedureName == null ? Optional.empty() : Optional.ofNullable(this.sqlWriterStoredProcedureName);
    }

    /**
     * SQL writer table type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlWriterTableType")
      private final @Nullable Object sqlWriterTableType;

    public Optional<Object> getSqlWriterTableType() {
        return this.sqlWriterTableType == null ? Optional.empty() : Optional.ofNullable(this.sqlWriterTableType);
    }

    /**
     * Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="sqlWriterUseTableLock")
      private final @Nullable Object sqlWriterUseTableLock;

    public Optional<Object> getSqlWriterUseTableLock() {
        return this.sqlWriterUseTableLock == null ? Optional.empty() : Optional.ofNullable(this.sqlWriterUseTableLock);
    }

    /**
     * SQL stored procedure parameters.
     * 
     */
    @Import(name="storedProcedureParameters")
      private final @Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters;

    public Map<String,StoredProcedureParameterResponse> getStoredProcedureParameters() {
        return this.storedProcedureParameters == null ? Map.of() : this.storedProcedureParameters;
    }

    /**
     * The stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="storedProcedureTableTypeParameterName")
      private final @Nullable Object storedProcedureTableTypeParameterName;

    public Optional<Object> getStoredProcedureTableTypeParameterName() {
        return this.storedProcedureTableTypeParameterName == null ? Optional.empty() : Optional.ofNullable(this.storedProcedureTableTypeParameterName);
    }

    /**
     * The option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tableOption")
      private final @Nullable Object tableOption;

    public Optional<Object> getTableOption() {
        return this.tableOption == null ? Optional.empty() : Optional.ofNullable(this.tableOption);
    }

    /**
     * Copy sink type.
     * Expected value is 'AzureSqlSink'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * SQL upsert settings.
     * 
     */
    @Import(name="upsertSettings")
      private final @Nullable SqlUpsertSettingsResponse upsertSettings;

    public Optional<SqlUpsertSettingsResponse> getUpsertSettings() {
        return this.upsertSettings == null ? Optional.empty() : Optional.ofNullable(this.upsertSettings);
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
      private final @Nullable Object writeBatchSize;

    public Optional<Object> getWriteBatchSize() {
        return this.writeBatchSize == null ? Optional.empty() : Optional.ofNullable(this.writeBatchSize);
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
      private final @Nullable Object writeBatchTimeout;

    public Optional<Object> getWriteBatchTimeout() {
        return this.writeBatchTimeout == null ? Optional.empty() : Optional.ofNullable(this.writeBatchTimeout);
    }

    /**
     * Write behavior when copying data into Azure SQL. Type: SqlWriteBehaviorEnum (or Expression with resultType SqlWriteBehaviorEnum)
     * 
     */
    @Import(name="writeBehavior")
      private final @Nullable Object writeBehavior;

    public Optional<Object> getWriteBehavior() {
        return this.writeBehavior == null ? Optional.empty() : Optional.ofNullable(this.writeBehavior);
    }

    public AzureSqlSinkResponse(
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object preCopyScript,
        @Nullable Object sinkRetryCount,
        @Nullable Object sinkRetryWait,
        @Nullable Object sqlWriterStoredProcedureName,
        @Nullable Object sqlWriterTableType,
        @Nullable Object sqlWriterUseTableLock,
        @Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters,
        @Nullable Object storedProcedureTableTypeParameterName,
        @Nullable Object tableOption,
        String type,
        @Nullable SqlUpsertSettingsResponse upsertSettings,
        @Nullable Object writeBatchSize,
        @Nullable Object writeBatchTimeout,
        @Nullable Object writeBehavior) {
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

    private AzureSqlSinkResponse() {
        this.disableMetricsCollection = null;
        this.maxConcurrentConnections = null;
        this.preCopyScript = null;
        this.sinkRetryCount = null;
        this.sinkRetryWait = null;
        this.sqlWriterStoredProcedureName = null;
        this.sqlWriterTableType = null;
        this.sqlWriterUseTableLock = null;
        this.storedProcedureParameters = Map.of();
        this.storedProcedureTableTypeParameterName = null;
        this.tableOption = null;
        this.type = null;
        this.upsertSettings = null;
        this.writeBatchSize = null;
        this.writeBatchTimeout = null;
        this.writeBehavior = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object preCopyScript;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private @Nullable Object sqlWriterStoredProcedureName;
        private @Nullable Object sqlWriterTableType;
        private @Nullable Object sqlWriterUseTableLock;
        private @Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters;
        private @Nullable Object storedProcedureTableTypeParameterName;
        private @Nullable Object tableOption;
        private String type;
        private @Nullable SqlUpsertSettingsResponse upsertSettings;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;
        private @Nullable Object writeBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlSinkResponse defaults) {
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

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder preCopyScript(@Nullable Object preCopyScript) {
            this.preCopyScript = preCopyScript;
            return this;
        }

        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder sqlWriterStoredProcedureName(@Nullable Object sqlWriterStoredProcedureName) {
            this.sqlWriterStoredProcedureName = sqlWriterStoredProcedureName;
            return this;
        }

        public Builder sqlWriterTableType(@Nullable Object sqlWriterTableType) {
            this.sqlWriterTableType = sqlWriterTableType;
            return this;
        }

        public Builder sqlWriterUseTableLock(@Nullable Object sqlWriterUseTableLock) {
            this.sqlWriterUseTableLock = sqlWriterUseTableLock;
            return this;
        }

        public Builder storedProcedureParameters(@Nullable Map<String,StoredProcedureParameterResponse> storedProcedureParameters) {
            this.storedProcedureParameters = storedProcedureParameters;
            return this;
        }

        public Builder storedProcedureTableTypeParameterName(@Nullable Object storedProcedureTableTypeParameterName) {
            this.storedProcedureTableTypeParameterName = storedProcedureTableTypeParameterName;
            return this;
        }

        public Builder tableOption(@Nullable Object tableOption) {
            this.tableOption = tableOption;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder upsertSettings(@Nullable SqlUpsertSettingsResponse upsertSettings) {
            this.upsertSettings = upsertSettings;
            return this;
        }

        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public Builder writeBehavior(@Nullable Object writeBehavior) {
            this.writeBehavior = writeBehavior;
            return this;
        }
        public AzureSqlSinkResponse build() {
            return new AzureSqlSinkResponse(disableMetricsCollection, maxConcurrentConnections, preCopyScript, sinkRetryCount, sinkRetryWait, sqlWriterStoredProcedureName, sqlWriterTableType, sqlWriterUseTableLock, storedProcedureParameters, storedProcedureTableTypeParameterName, tableOption, type, upsertSettings, writeBatchSize, writeBatchTimeout, writeBehavior);
        }
    }
}
