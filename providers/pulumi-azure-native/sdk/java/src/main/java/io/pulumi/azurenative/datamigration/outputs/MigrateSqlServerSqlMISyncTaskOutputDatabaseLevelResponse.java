// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.BackupSetInfoResponse;
import io.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MigrateSqlServerSqlMISyncTaskOutputDatabaseLevelResponse {
    /**
     * Backup sets that are currently active (Either being uploaded or getting restored)
     * 
     */
    private final List<BackupSetInfoResponse> activeBackupSets;
    /**
     * Name of container created in the Azure Storage account where backups are copied to
     * 
     */
    private final String containerName;
    /**
     * Database migration end time
     * 
     */
    private final String endedOn;
    /**
     * prefix string to use for querying errors for this database
     * 
     */
    private final String errorPrefix;
    /**
     * Migration exceptions and warnings
     * 
     */
    private final List<ReportableExceptionResponse> exceptionsAndWarnings;
    /**
     * Details of full backup set
     * 
     */
    private final BackupSetInfoResponse fullBackupSetInfo;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Whether full backup has been applied to the target database or not
     * 
     */
    private final Boolean isFullBackupRestored;
    /**
     * Last applied backup set information
     * 
     */
    private final BackupSetInfoResponse lastRestoredBackupSetInfo;
    /**
     * Current state of database
     * 
     */
    private final String migrationState;
    /**
     * Result type
     * Expected value is 'DatabaseLevelOutput'.
     * 
     */
    private final String resultType;
    /**
     * Name of the database
     * 
     */
    private final String sourceDatabaseName;
    /**
     * Database migration start time
     * 
     */
    private final String startedOn;

    @OutputCustomType.Constructor({"activeBackupSets","containerName","endedOn","errorPrefix","exceptionsAndWarnings","fullBackupSetInfo","id","isFullBackupRestored","lastRestoredBackupSetInfo","migrationState","resultType","sourceDatabaseName","startedOn"})
    private MigrateSqlServerSqlMISyncTaskOutputDatabaseLevelResponse(
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
        this.activeBackupSets = Objects.requireNonNull(activeBackupSets);
        this.containerName = Objects.requireNonNull(containerName);
        this.endedOn = Objects.requireNonNull(endedOn);
        this.errorPrefix = Objects.requireNonNull(errorPrefix);
        this.exceptionsAndWarnings = Objects.requireNonNull(exceptionsAndWarnings);
        this.fullBackupSetInfo = Objects.requireNonNull(fullBackupSetInfo);
        this.id = Objects.requireNonNull(id);
        this.isFullBackupRestored = Objects.requireNonNull(isFullBackupRestored);
        this.lastRestoredBackupSetInfo = Objects.requireNonNull(lastRestoredBackupSetInfo);
        this.migrationState = Objects.requireNonNull(migrationState);
        this.resultType = Objects.requireNonNull(resultType);
        this.sourceDatabaseName = Objects.requireNonNull(sourceDatabaseName);
        this.startedOn = Objects.requireNonNull(startedOn);
    }

    /**
     * Backup sets that are currently active (Either being uploaded or getting restored)
     * 
     */
    public List<BackupSetInfoResponse> getActiveBackupSets() {
        return this.activeBackupSets;
    }
    /**
     * Name of container created in the Azure Storage account where backups are copied to
     * 
     */
    public String getContainerName() {
        return this.containerName;
    }
    /**
     * Database migration end time
     * 
     */
    public String getEndedOn() {
        return this.endedOn;
    }
    /**
     * prefix string to use for querying errors for this database
     * 
     */
    public String getErrorPrefix() {
        return this.errorPrefix;
    }
    /**
     * Migration exceptions and warnings
     * 
     */
    public List<ReportableExceptionResponse> getExceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }
    /**
     * Details of full backup set
     * 
     */
    public BackupSetInfoResponse getFullBackupSetInfo() {
        return this.fullBackupSetInfo;
    }
    /**
     * Result identifier
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Whether full backup has been applied to the target database or not
     * 
     */
    public Boolean getIsFullBackupRestored() {
        return this.isFullBackupRestored;
    }
    /**
     * Last applied backup set information
     * 
     */
    public BackupSetInfoResponse getLastRestoredBackupSetInfo() {
        return this.lastRestoredBackupSetInfo;
    }
    /**
     * Current state of database
     * 
     */
    public String getMigrationState() {
        return this.migrationState;
    }
    /**
     * Result type
     * Expected value is 'DatabaseLevelOutput'.
     * 
     */
    public String getResultType() {
        return this.resultType;
    }
    /**
     * Name of the database
     * 
     */
    public String getSourceDatabaseName() {
        return this.sourceDatabaseName;
    }
    /**
     * Database migration start time
     * 
     */
    public String getStartedOn() {
        return this.startedOn;
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

        public Builder setActiveBackupSets(List<BackupSetInfoResponse> activeBackupSets) {
            this.activeBackupSets = Objects.requireNonNull(activeBackupSets);
            return this;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setEndedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }

        public Builder setErrorPrefix(String errorPrefix) {
            this.errorPrefix = Objects.requireNonNull(errorPrefix);
            return this;
        }

        public Builder setExceptionsAndWarnings(List<ReportableExceptionResponse> exceptionsAndWarnings) {
            this.exceptionsAndWarnings = Objects.requireNonNull(exceptionsAndWarnings);
            return this;
        }

        public Builder setFullBackupSetInfo(BackupSetInfoResponse fullBackupSetInfo) {
            this.fullBackupSetInfo = Objects.requireNonNull(fullBackupSetInfo);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsFullBackupRestored(Boolean isFullBackupRestored) {
            this.isFullBackupRestored = Objects.requireNonNull(isFullBackupRestored);
            return this;
        }

        public Builder setLastRestoredBackupSetInfo(BackupSetInfoResponse lastRestoredBackupSetInfo) {
            this.lastRestoredBackupSetInfo = Objects.requireNonNull(lastRestoredBackupSetInfo);
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

        public Builder setSourceDatabaseName(String sourceDatabaseName) {
            this.sourceDatabaseName = Objects.requireNonNull(sourceDatabaseName);
            return this;
        }

        public Builder setStartedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }
        public MigrateSqlServerSqlMISyncTaskOutputDatabaseLevelResponse build() {
            return new MigrateSqlServerSqlMISyncTaskOutputDatabaseLevelResponse(activeBackupSets, containerName, endedOn, errorPrefix, exceptionsAndWarnings, fullBackupSetInfo, id, isFullBackupRestored, lastRestoredBackupSetInfo, migrationState, resultType, sourceDatabaseName, startedOn);
        }
    }
}
