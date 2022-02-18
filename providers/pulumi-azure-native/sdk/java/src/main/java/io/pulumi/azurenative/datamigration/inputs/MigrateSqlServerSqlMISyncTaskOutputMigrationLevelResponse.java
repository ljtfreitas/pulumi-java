// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse Empty = new MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse();

    /**
     * Count of databases
     * 
     */
    @InputImport(name="databaseCount", required=true)
    private final Integer databaseCount;

    public Integer getDatabaseCount() {
        return this.databaseCount;
    }

    /**
     * Number of database level errors
     * 
     */
    @InputImport(name="databaseErrorCount", required=true)
    private final Integer databaseErrorCount;

    public Integer getDatabaseErrorCount() {
        return this.databaseErrorCount;
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
     * Result identifier
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Result type
     * Expected value is 'MigrationLevelOutput'.
     * 
     */
    @InputImport(name="resultType", required=true)
    private final String resultType;

    public String getResultType() {
        return this.resultType;
    }

    /**
     * Source server brand version
     * 
     */
    @InputImport(name="sourceServerBrandVersion", required=true)
    private final String sourceServerBrandVersion;

    public String getSourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }

    /**
     * Source server name
     * 
     */
    @InputImport(name="sourceServerName", required=true)
    private final String sourceServerName;

    public String getSourceServerName() {
        return this.sourceServerName;
    }

    /**
     * Source server version
     * 
     */
    @InputImport(name="sourceServerVersion", required=true)
    private final String sourceServerVersion;

    public String getSourceServerVersion() {
        return this.sourceServerVersion;
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

    /**
     * Current state of migration
     * 
     */
    @InputImport(name="state", required=true)
    private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Target server brand version
     * 
     */
    @InputImport(name="targetServerBrandVersion", required=true)
    private final String targetServerBrandVersion;

    public String getTargetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }

    /**
     * Target server name
     * 
     */
    @InputImport(name="targetServerName", required=true)
    private final String targetServerName;

    public String getTargetServerName() {
        return this.targetServerName;
    }

    /**
     * Target server version
     * 
     */
    @InputImport(name="targetServerVersion", required=true)
    private final String targetServerVersion;

    public String getTargetServerVersion() {
        return this.targetServerVersion;
    }

    public MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse(
        Integer databaseCount,
        Integer databaseErrorCount,
        String endedOn,
        String id,
        String resultType,
        String sourceServerBrandVersion,
        String sourceServerName,
        String sourceServerVersion,
        String startedOn,
        String state,
        String targetServerBrandVersion,
        String targetServerName,
        String targetServerVersion) {
        this.databaseCount = Objects.requireNonNull(databaseCount, "expected parameter 'databaseCount' to be non-null");
        this.databaseErrorCount = Objects.requireNonNull(databaseErrorCount, "expected parameter 'databaseErrorCount' to be non-null");
        this.endedOn = Objects.requireNonNull(endedOn, "expected parameter 'endedOn' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
        this.sourceServerBrandVersion = Objects.requireNonNull(sourceServerBrandVersion, "expected parameter 'sourceServerBrandVersion' to be non-null");
        this.sourceServerName = Objects.requireNonNull(sourceServerName, "expected parameter 'sourceServerName' to be non-null");
        this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion, "expected parameter 'sourceServerVersion' to be non-null");
        this.startedOn = Objects.requireNonNull(startedOn, "expected parameter 'startedOn' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion, "expected parameter 'targetServerBrandVersion' to be non-null");
        this.targetServerName = Objects.requireNonNull(targetServerName, "expected parameter 'targetServerName' to be non-null");
        this.targetServerVersion = Objects.requireNonNull(targetServerVersion, "expected parameter 'targetServerVersion' to be non-null");
    }

    private MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse() {
        this.databaseCount = null;
        this.databaseErrorCount = null;
        this.endedOn = null;
        this.id = null;
        this.resultType = null;
        this.sourceServerBrandVersion = null;
        this.sourceServerName = null;
        this.sourceServerVersion = null;
        this.startedOn = null;
        this.state = null;
        this.targetServerBrandVersion = null;
        this.targetServerName = null;
        this.targetServerVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer databaseCount;
        private Integer databaseErrorCount;
        private String endedOn;
        private String id;
        private String resultType;
        private String sourceServerBrandVersion;
        private String sourceServerName;
        private String sourceServerVersion;
        private String startedOn;
        private String state;
        private String targetServerBrandVersion;
        private String targetServerName;
        private String targetServerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseCount = defaults.databaseCount;
    	      this.databaseErrorCount = defaults.databaseErrorCount;
    	      this.endedOn = defaults.endedOn;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
    	      this.sourceServerBrandVersion = defaults.sourceServerBrandVersion;
    	      this.sourceServerName = defaults.sourceServerName;
    	      this.sourceServerVersion = defaults.sourceServerVersion;
    	      this.startedOn = defaults.startedOn;
    	      this.state = defaults.state;
    	      this.targetServerBrandVersion = defaults.targetServerBrandVersion;
    	      this.targetServerName = defaults.targetServerName;
    	      this.targetServerVersion = defaults.targetServerVersion;
        }

        public Builder setDatabaseCount(Integer databaseCount) {
            this.databaseCount = Objects.requireNonNull(databaseCount);
            return this;
        }

        public Builder setDatabaseErrorCount(Integer databaseErrorCount) {
            this.databaseErrorCount = Objects.requireNonNull(databaseErrorCount);
            return this;
        }

        public Builder setEndedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder setSourceServerBrandVersion(String sourceServerBrandVersion) {
            this.sourceServerBrandVersion = Objects.requireNonNull(sourceServerBrandVersion);
            return this;
        }

        public Builder setSourceServerName(String sourceServerName) {
            this.sourceServerName = Objects.requireNonNull(sourceServerName);
            return this;
        }

        public Builder setSourceServerVersion(String sourceServerVersion) {
            this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion);
            return this;
        }

        public Builder setStartedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTargetServerBrandVersion(String targetServerBrandVersion) {
            this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
            return this;
        }

        public Builder setTargetServerName(String targetServerName) {
            this.targetServerName = Objects.requireNonNull(targetServerName);
            return this;
        }

        public Builder setTargetServerVersion(String targetServerVersion) {
            this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
            return this;
        }

        public MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse build() {
            return new MigrateSqlServerSqlMISyncTaskOutputMigrationLevelResponse(databaseCount, databaseErrorCount, endedOn, id, resultType, sourceServerBrandVersion, sourceServerName, sourceServerVersion, startedOn, state, targetServerBrandVersion, targetServerName, targetServerVersion);
        }
    }
}
