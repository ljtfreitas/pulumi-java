// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.BackupSetInfoResponse;
import io.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class MigrateSqlServerSqlMISyncTaskOutputDatabaseLevelResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlMISyncTaskOutputDatabaseLevelResponse Empty = new MigrateSqlServerSqlMISyncTaskOutputDatabaseLevelResponse();

    /**
     * Backup sets that are currently active (Either being uploaded or getting restored)
     * 
     */
    @Import(name="activeBackupSets", required=true)
      private final List<BackupSetInfoResponse> activeBackupSets;

    public List<BackupSetInfoResponse> getActiveBackupSets() {
        return this.activeBackupSets;
    }

    /**
     * Name of container created in the Azure Storage account where backups are copied to
     * 
     */
    @Import(name="containerName", required=true)
      private final String containerName;

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * Database migration end time
     * 
     */
    @Import(name="endedOn", required=true)
      private final String endedOn;

    public String getEndedOn() {
        return this.endedOn;
    }

    /**
     * prefix string to use for querying errors for this database
     * 
     */
    @Import(name="errorPrefix", required=true)
      private final String errorPrefix;

    public String getErrorPrefix() {
        return this.errorPrefix;
    }

    /**
     * Migration exceptions and warnings
     * 
     */
    @Import(name="exceptionsAndWarnings", required=true)
      private final List<ReportableExceptionResponse> exceptionsAndWarnings;

    public List<ReportableExceptionResponse> getExceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }

    /**
     * Details of full backup set
     * 
     */
    @Import(name="fullBackupSetInfo", required=true)
      private final BackupSetInfoResponse fullBackupSetInfo;

    public BackupSetInfoResponse getFullBackupSetInfo() {
        return this.fullBackupSetInfo;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Whether full backup has been applied to the target database or not
     * 
     */
    @Import(name="isFullBackupRestored", required=true)
      private final Boolean isFullBackupRestored;

    public Boolean getIsFullBackupRestored() {
        return this.isFullBackupRestored;
    }

    /**
     * Last applied backup set information
     * 
     */
    @Import(name="lastRestoredBackupSetInfo", required=true)
      private final BackupSetInfoResponse lastRestoredBackupSetInfo;

    public BackupSetInfoResponse getLastRestoredBackupSetInfo() {
        return this.lastRestoredBackupSetInfo;
    }

    /**
     * Current state of database
     * 
     */
    @Import(name="migrationState", required=true)
      private final String migrationState;

    public String getMigrationState() {
        return this.migrationState;
    }

    /**
     * Result type
     * Expected value is 'DatabaseLevelOutput'.
     * 
     */
    @Import(name="resultType", required=true)
      private final String resultType;

    public String getResultType() {
        return this.resultType;
    }

    /**
     * Name of the database
     * 
     */
    @Import(name="sourceDatabaseName", required=true)
      private final String sourceDatabaseName;

    public String getSourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * Database migration start time
     * 
     */
    @Import(name="startedOn", required=true)
      private final String startedOn;

    public String getStartedOn() {
        return this.startedOn;
    }

    public MigrateSqlServerSqlMISyncTaskOutputDatabaseLevelResponse(
        List<BackupSetInfoResponse> activeBackupSets,
        String containerName,
        String endedOn,
        String errorPrefix,
        List<ReportableExceptionResponse> exceptionsAndWarnings,
        BackupSetInfoResponse fullBackupSetInfo,
        String id,
        Boolean isFullBackupRestored,
        BackupSetInfoResponse lastRestoredBackupSetInfo,
        String migrationState,
        String resultType,
        String sourceDatabaseName,
        String startedOn) {
        this.activeBackupSets = Objects.requireNonNull(activeBackupSets, "expected parameter 'activeBackupSets' to be non-null");
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.endedOn = Objects.requireNonNull(endedOn, "expected parameter 'endedOn' to be non-null");
        this.errorPrefix = Objects.requireNonNull(errorPrefix, "expected parameter 'errorPrefix' to be non-null");
        this.exceptionsAndWarnings = Objects.requireNonNull(exceptionsAndWarnings, "expected parameter 'exceptionsAndWarnings' to be non-null");
        this.fullBackupSetInfo = Objects.requireNonNull(fullBackupSetInfo, "expected parameter 'fullBackupSetInfo' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.isFullBackupRestored = Objects.requireNonNull(isFullBackupRestored, "expected parameter 'isFullBackupRestored' to be non-null");
        this.lastRestoredBackupSetInfo = Objects.requireNonNull(lastRestoredBackupSetInfo, "expected parameter 'lastRestoredBackupSetInfo' to be non-null");
        this.migrationState = Objects.requireNonNull(migrationState, "expected parameter 'migrationState' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
        this.sourceDatabaseName = Objects.requireNonNull(sourceDatabaseName, "expected parameter 'sourceDatabaseName' to be non-null");
        this.startedOn = Objects.requireNonNull(startedOn, "expected parameter 'startedOn' to be non-null");
    }

    private MigrateSqlServerSqlMISyncTaskOutputDatabaseLevelResponse() {
        this.activeBackupSets = List.of();
        this.containerName = null;
        this.endedOn = null;
        this.errorPrefix = null;
        this.exceptionsAndWarnings = List.of();
        this.fullBackupSetInfo = null;
        this.id = null;
        this.isFullBackupRestored = null;
        this.lastRestoredBackupSetInfo = null;
        this.migrationState = null;
        this.resultType = null;
        this.sourceDatabaseName = null;
        this.startedOn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMISyncTaskOutputDatabaseLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BackupSetInfoResponse> activeBackupSets;
        private String containerName;
        private String endedOn;
        private String errorPrefix;
        private List<ReportableExceptionResponse> exceptionsAndWarnings;
        private BackupSetInfoResponse fullBackupSetInfo;
        private String id;
        private Boolean isFullBackupRestored;
        private BackupSetInfoResponse lastRestoredBackupSetInfo;
        private String migrationState;
        private String resultType;
        private String sourceDatabaseName;
        private String startedOn;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMISyncTaskOutputDatabaseLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeBackupSets = defaults.activeBackupSets;
    	      this.containerName = defaults.containerName;
    	      this.endedOn = defaults.endedOn;
    	      this.errorPrefix = defaults.errorPrefix;
    	      this.exceptionsAndWarnings = defaults.exceptionsAndWarnings;
    	      this.fullBackupSetInfo = defaults.fullBackupSetInfo;
    	      this.id = defaults.id;
    	      this.isFullBackupRestored = defaults.isFullBackupRestored;
    	      this.lastRestoredBackupSetInfo = defaults.lastRestoredBackupSetInfo;
    	      this.migrationState = defaults.migrationState;
    	      this.resultType = defaults.resultType;
    	      this.sourceDatabaseName = defaults.sourceDatabaseName;
    	      this.startedOn = defaults.startedOn;
        }

        public Builder activeBackupSets(List<BackupSetInfoResponse> activeBackupSets) {
            this.activeBackupSets = Objects.requireNonNull(activeBackupSets);
            return this;
        }

        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder endedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }

        public Builder errorPrefix(String errorPrefix) {
            this.errorPrefix = Objects.requireNonNull(errorPrefix);
            return this;
        }

        public Builder exceptionsAndWarnings(List<ReportableExceptionResponse> exceptionsAndWarnings) {
            this.exceptionsAndWarnings = Objects.requireNonNull(exceptionsAndWarnings);
            return this;
        }

        public Builder fullBackupSetInfo(BackupSetInfoResponse fullBackupSetInfo) {
            this.fullBackupSetInfo = Objects.requireNonNull(fullBackupSetInfo);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder isFullBackupRestored(Boolean isFullBackupRestored) {
            this.isFullBackupRestored = Objects.requireNonNull(isFullBackupRestored);
            return this;
        }

        public Builder lastRestoredBackupSetInfo(BackupSetInfoResponse lastRestoredBackupSetInfo) {
            this.lastRestoredBackupSetInfo = Objects.requireNonNull(lastRestoredBackupSetInfo);
            return this;
        }

        public Builder migrationState(String migrationState) {
            this.migrationState = Objects.requireNonNull(migrationState);
            return this;
        }

        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder sourceDatabaseName(String sourceDatabaseName) {
            this.sourceDatabaseName = Objects.requireNonNull(sourceDatabaseName);
            return this;
        }

        public Builder startedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }
        public MigrateSqlServerSqlMISyncTaskOutputDatabaseLevelResponse build() {
            return new MigrateSqlServerSqlMISyncTaskOutputDatabaseLevelResponse(activeBackupSets, containerName, endedOn, errorPrefix, exceptionsAndWarnings, fullBackupSetInfo, id, isFullBackupRestored, lastRestoredBackupSetInfo, migrationState, resultType, sourceDatabaseName, startedOn);
        }
    }
}
