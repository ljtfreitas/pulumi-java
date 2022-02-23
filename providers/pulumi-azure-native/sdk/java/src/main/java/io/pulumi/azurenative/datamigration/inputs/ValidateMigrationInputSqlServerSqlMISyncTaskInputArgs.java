// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.AzureActiveDirectoryAppArgs;
import io.pulumi.azurenative.datamigration.inputs.FileShareArgs;
import io.pulumi.azurenative.datamigration.inputs.MiSqlConnectionInfoArgs;
import io.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlMIDatabaseInputArgs;
import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Input for task that migrates SQL Server databases to Azure SQL Database Managed Instance online scenario.
 * 
 */
public final class ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs Empty = new ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs();

    /**
     * Azure Active Directory Application the DMS instance will use to connect to the target instance of Azure SQL Database Managed Instance and the Azure Storage Account
     * 
     */
    @InputImport(name="azureApp", required=true)
        private final Input<AzureActiveDirectoryAppArgs> azureApp;

    public Input<AzureActiveDirectoryAppArgs> getAzureApp() {
        return this.azureApp;
    }

    /**
     * Backup file share information for all selected databases.
     * 
     */
    @InputImport(name="backupFileShare")
        private final @Nullable Input<FileShareArgs> backupFileShare;

    public Input<FileShareArgs> getBackupFileShare() {
        return this.backupFileShare == null ? Input.empty() : this.backupFileShare;
    }

    /**
     * Databases to migrate
     * 
     */
    @InputImport(name="selectedDatabases", required=true)
        private final Input<List<MigrateSqlServerSqlMIDatabaseInputArgs>> selectedDatabases;

    public Input<List<MigrateSqlServerSqlMIDatabaseInputArgs>> getSelectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Connection information for source SQL Server
     * 
     */
    @InputImport(name="sourceConnectionInfo", required=true)
        private final Input<SqlConnectionInfoArgs> sourceConnectionInfo;

    public Input<SqlConnectionInfoArgs> getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Fully qualified resourceId of storage
     * 
     */
    @InputImport(name="storageResourceId", required=true)
        private final Input<String> storageResourceId;

    public Input<String> getStorageResourceId() {
        return this.storageResourceId;
    }

    /**
     * Connection information for Azure SQL Database Managed Instance
     * 
     */
    @InputImport(name="targetConnectionInfo", required=true)
        private final Input<MiSqlConnectionInfoArgs> targetConnectionInfo;

    public Input<MiSqlConnectionInfoArgs> getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs(
        Input<AzureActiveDirectoryAppArgs> azureApp,
        @Nullable Input<FileShareArgs> backupFileShare,
        Input<List<MigrateSqlServerSqlMIDatabaseInputArgs>> selectedDatabases,
        Input<SqlConnectionInfoArgs> sourceConnectionInfo,
        Input<String> storageResourceId,
        Input<MiSqlConnectionInfoArgs> targetConnectionInfo) {
        this.azureApp = Objects.requireNonNull(azureApp, "expected parameter 'azureApp' to be non-null");
        this.backupFileShare = backupFileShare;
        this.selectedDatabases = Objects.requireNonNull(selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.storageResourceId = Objects.requireNonNull(storageResourceId, "expected parameter 'storageResourceId' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs() {
        this.azureApp = Input.empty();
        this.backupFileShare = Input.empty();
        this.selectedDatabases = Input.empty();
        this.sourceConnectionInfo = Input.empty();
        this.storageResourceId = Input.empty();
        this.targetConnectionInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AzureActiveDirectoryAppArgs> azureApp;
        private @Nullable Input<FileShareArgs> backupFileShare;
        private Input<List<MigrateSqlServerSqlMIDatabaseInputArgs>> selectedDatabases;
        private Input<SqlConnectionInfoArgs> sourceConnectionInfo;
        private Input<String> storageResourceId;
        private Input<MiSqlConnectionInfoArgs> targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureApp = defaults.azureApp;
    	      this.backupFileShare = defaults.backupFileShare;
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.storageResourceId = defaults.storageResourceId;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setAzureApp(Input<AzureActiveDirectoryAppArgs> azureApp) {
            this.azureApp = Objects.requireNonNull(azureApp);
            return this;
        }

        public Builder setAzureApp(AzureActiveDirectoryAppArgs azureApp) {
            this.azureApp = Input.of(Objects.requireNonNull(azureApp));
            return this;
        }

        public Builder setBackupFileShare(@Nullable Input<FileShareArgs> backupFileShare) {
            this.backupFileShare = backupFileShare;
            return this;
        }

        public Builder setBackupFileShare(@Nullable FileShareArgs backupFileShare) {
            this.backupFileShare = Input.ofNullable(backupFileShare);
            return this;
        }

        public Builder setSelectedDatabases(Input<List<MigrateSqlServerSqlMIDatabaseInputArgs>> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }

        public Builder setSelectedDatabases(List<MigrateSqlServerSqlMIDatabaseInputArgs> selectedDatabases) {
            this.selectedDatabases = Input.of(Objects.requireNonNull(selectedDatabases));
            return this;
        }

        public Builder setSourceConnectionInfo(Input<SqlConnectionInfoArgs> sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setSourceConnectionInfo(SqlConnectionInfoArgs sourceConnectionInfo) {
            this.sourceConnectionInfo = Input.of(Objects.requireNonNull(sourceConnectionInfo));
            return this;
        }

        public Builder setStorageResourceId(Input<String> storageResourceId) {
            this.storageResourceId = Objects.requireNonNull(storageResourceId);
            return this;
        }

        public Builder setStorageResourceId(String storageResourceId) {
            this.storageResourceId = Input.of(Objects.requireNonNull(storageResourceId));
            return this;
        }

        public Builder setTargetConnectionInfo(Input<MiSqlConnectionInfoArgs> targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(MiSqlConnectionInfoArgs targetConnectionInfo) {
            this.targetConnectionInfo = Input.of(Objects.requireNonNull(targetConnectionInfo));
            return this;
        }
        public ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs build() {
            return new ValidateMigrationInputSqlServerSqlMISyncTaskInputArgs(azureApp, backupFileShare, selectedDatabases, sourceConnectionInfo, storageResourceId, targetConnectionInfo);
        }
    }
}
