// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevelResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevelResponse Empty = new MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevelResponse();

    /**
     * Number of applied changes
     * 
     */
    @InputImport(name="appliedChanges", required=true)
    private final Double appliedChanges;

    public Double getAppliedChanges() {
        return this.appliedChanges;
    }

    /**
     * Number of cdc deletes
     * 
     */
    @InputImport(name="cdcDeleteCounter", required=true)
    private final Double cdcDeleteCounter;

    public Double getCdcDeleteCounter() {
        return this.cdcDeleteCounter;
    }

    /**
     * Number of cdc inserts
     * 
     */
    @InputImport(name="cdcInsertCounter", required=true)
    private final Double cdcInsertCounter;

    public Double getCdcInsertCounter() {
        return this.cdcInsertCounter;
    }

    /**
     * Number of cdc updates
     * 
     */
    @InputImport(name="cdcUpdateCounter", required=true)
    private final Double cdcUpdateCounter;

    public Double getCdcUpdateCounter() {
        return this.cdcUpdateCounter;
    }

    /**
     * Name of the database
     * 
     */
    @InputImport(name="databaseName", required=true)
    private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Migration end time
     * 
     */
    @InputImport(name="endedOn", required=true)
    private final String endedOn;

    public String getEndedOn() {
        return this.endedOn;
    }

    /**
     * Number of tables completed in full load
     * 
     */
    @InputImport(name="fullLoadCompletedTables", required=true)
    private final Double fullLoadCompletedTables;

    public Double getFullLoadCompletedTables() {
        return this.fullLoadCompletedTables;
    }

    /**
     * Number of tables errored in full load
     * 
     */
    @InputImport(name="fullLoadErroredTables", required=true)
    private final Double fullLoadErroredTables;

    public Double getFullLoadErroredTables() {
        return this.fullLoadErroredTables;
    }

    /**
     * Number of tables loading in full load
     * 
     */
    @InputImport(name="fullLoadLoadingTables", required=true)
    private final Double fullLoadLoadingTables;

    public Double getFullLoadLoadingTables() {
        return this.fullLoadLoadingTables;
    }

    /**
     * Number of tables queued in full load
     * 
     */
    @InputImport(name="fullLoadQueuedTables", required=true)
    private final Double fullLoadQueuedTables;

    public Double getFullLoadQueuedTables() {
        return this.fullLoadQueuedTables;
    }

    /**
     * Result identifier
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Number of incoming changes
     * 
     */
    @InputImport(name="incomingChanges", required=true)
    private final Double incomingChanges;

    public Double getIncomingChanges() {
        return this.incomingChanges;
    }

    /**
     * Indicates if initial load (full load) has been completed
     * 
     */
    @InputImport(name="initializationCompleted", required=true)
    private final Boolean initializationCompleted;

    public Boolean getInitializationCompleted() {
        return this.initializationCompleted;
    }

    /**
     * CDC apply latency
     * 
     */
    @InputImport(name="latency", required=true)
    private final Double latency;

    public Double getLatency() {
        return this.latency;
    }

    /**
     * Migration state that this database is in
     * 
     */
    @InputImport(name="migrationState", required=true)
    private final String migrationState;

    public String getMigrationState() {
        return this.migrationState;
    }

    /**
     * Result type
     * Expected value is 'DatabaseLevelOutput'.
     * 
     */
    @InputImport(name="resultType", required=true)
    private final String resultType;

    public String getResultType() {
        return this.resultType;
    }

    /**
     * Migration start time
     * 
     */
    @InputImport(name="startedOn", required=true)
    private final String startedOn;

    public String getStartedOn() {
        return this.startedOn;
    }

    public MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevelResponse(
        Double appliedChanges,
        Double cdcDeleteCounter,
        Double cdcInsertCounter,
        Double cdcUpdateCounter,
        String databaseName,
        String endedOn,
        Double fullLoadCompletedTables,
        Double fullLoadErroredTables,
        Double fullLoadLoadingTables,
        Double fullLoadQueuedTables,
        String id,
        Double incomingChanges,
        Boolean initializationCompleted,
        Double latency,
        String migrationState,
        String resultType,
        String startedOn) {
        this.appliedChanges = Objects.requireNonNull(appliedChanges, "expected parameter 'appliedChanges' to be non-null");
        this.cdcDeleteCounter = Objects.requireNonNull(cdcDeleteCounter, "expected parameter 'cdcDeleteCounter' to be non-null");
        this.cdcInsertCounter = Objects.requireNonNull(cdcInsertCounter, "expected parameter 'cdcInsertCounter' to be non-null");
        this.cdcUpdateCounter = Objects.requireNonNull(cdcUpdateCounter, "expected parameter 'cdcUpdateCounter' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.endedOn = Objects.requireNonNull(endedOn, "expected parameter 'endedOn' to be non-null");
        this.fullLoadCompletedTables = Objects.requireNonNull(fullLoadCompletedTables, "expected parameter 'fullLoadCompletedTables' to be non-null");
        this.fullLoadErroredTables = Objects.requireNonNull(fullLoadErroredTables, "expected parameter 'fullLoadErroredTables' to be non-null");
        this.fullLoadLoadingTables = Objects.requireNonNull(fullLoadLoadingTables, "expected parameter 'fullLoadLoadingTables' to be non-null");
        this.fullLoadQueuedTables = Objects.requireNonNull(fullLoadQueuedTables, "expected parameter 'fullLoadQueuedTables' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.incomingChanges = Objects.requireNonNull(incomingChanges, "expected parameter 'incomingChanges' to be non-null");
        this.initializationCompleted = Objects.requireNonNull(initializationCompleted, "expected parameter 'initializationCompleted' to be non-null");
        this.latency = Objects.requireNonNull(latency, "expected parameter 'latency' to be non-null");
        this.migrationState = Objects.requireNonNull(migrationState, "expected parameter 'migrationState' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
        this.startedOn = Objects.requireNonNull(startedOn, "expected parameter 'startedOn' to be non-null");
    }

    private MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevelResponse() {
        this.appliedChanges = null;
        this.cdcDeleteCounter = null;
        this.cdcInsertCounter = null;
        this.cdcUpdateCounter = null;
        this.databaseName = null;
        this.endedOn = null;
        this.fullLoadCompletedTables = null;
        this.fullLoadErroredTables = null;
        this.fullLoadLoadingTables = null;
        this.fullLoadQueuedTables = null;
        this.id = null;
        this.incomingChanges = null;
        this.initializationCompleted = null;
        this.latency = null;
        this.migrationState = null;
        this.resultType = null;
        this.startedOn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double appliedChanges;
        private Double cdcDeleteCounter;
        private Double cdcInsertCounter;
        private Double cdcUpdateCounter;
        private String databaseName;
        private String endedOn;
        private Double fullLoadCompletedTables;
        private Double fullLoadErroredTables;
        private Double fullLoadLoadingTables;
        private Double fullLoadQueuedTables;
        private String id;
        private Double incomingChanges;
        private Boolean initializationCompleted;
        private Double latency;
        private String migrationState;
        private String resultType;
        private String startedOn;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appliedChanges = defaults.appliedChanges;
    	      this.cdcDeleteCounter = defaults.cdcDeleteCounter;
    	      this.cdcInsertCounter = defaults.cdcInsertCounter;
    	      this.cdcUpdateCounter = defaults.cdcUpdateCounter;
    	      this.databaseName = defaults.databaseName;
    	      this.endedOn = defaults.endedOn;
    	      this.fullLoadCompletedTables = defaults.fullLoadCompletedTables;
    	      this.fullLoadErroredTables = defaults.fullLoadErroredTables;
    	      this.fullLoadLoadingTables = defaults.fullLoadLoadingTables;
    	      this.fullLoadQueuedTables = defaults.fullLoadQueuedTables;
    	      this.id = defaults.id;
    	      this.incomingChanges = defaults.incomingChanges;
    	      this.initializationCompleted = defaults.initializationCompleted;
    	      this.latency = defaults.latency;
    	      this.migrationState = defaults.migrationState;
    	      this.resultType = defaults.resultType;
    	      this.startedOn = defaults.startedOn;
        }

        public Builder setAppliedChanges(Double appliedChanges) {
            this.appliedChanges = Objects.requireNonNull(appliedChanges);
            return this;
        }

        public Builder setCdcDeleteCounter(Double cdcDeleteCounter) {
            this.cdcDeleteCounter = Objects.requireNonNull(cdcDeleteCounter);
            return this;
        }

        public Builder setCdcInsertCounter(Double cdcInsertCounter) {
            this.cdcInsertCounter = Objects.requireNonNull(cdcInsertCounter);
            return this;
        }

        public Builder setCdcUpdateCounter(Double cdcUpdateCounter) {
            this.cdcUpdateCounter = Objects.requireNonNull(cdcUpdateCounter);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setEndedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }

        public Builder setFullLoadCompletedTables(Double fullLoadCompletedTables) {
            this.fullLoadCompletedTables = Objects.requireNonNull(fullLoadCompletedTables);
            return this;
        }

        public Builder setFullLoadErroredTables(Double fullLoadErroredTables) {
            this.fullLoadErroredTables = Objects.requireNonNull(fullLoadErroredTables);
            return this;
        }

        public Builder setFullLoadLoadingTables(Double fullLoadLoadingTables) {
            this.fullLoadLoadingTables = Objects.requireNonNull(fullLoadLoadingTables);
            return this;
        }

        public Builder setFullLoadQueuedTables(Double fullLoadQueuedTables) {
            this.fullLoadQueuedTables = Objects.requireNonNull(fullLoadQueuedTables);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIncomingChanges(Double incomingChanges) {
            this.incomingChanges = Objects.requireNonNull(incomingChanges);
            return this;
        }

        public Builder setInitializationCompleted(Boolean initializationCompleted) {
            this.initializationCompleted = Objects.requireNonNull(initializationCompleted);
            return this;
        }

        public Builder setLatency(Double latency) {
            this.latency = Objects.requireNonNull(latency);
            return this;
        }

        public Builder setMigrationState(String migrationState) {
            this.migrationState = Objects.requireNonNull(migrationState);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder setStartedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }

        public MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevelResponse build() {
            return new MigrateMySqlAzureDbForMySqlSyncTaskOutputDatabaseLevelResponse(appliedChanges, cdcDeleteCounter, cdcInsertCounter, cdcUpdateCounter, databaseName, endedOn, fullLoadCompletedTables, fullLoadErroredTables, fullLoadLoadingTables, fullLoadQueuedTables, id, incomingChanges, initializationCompleted, latency, migrationState, resultType, startedOn);
        }
    }
}
