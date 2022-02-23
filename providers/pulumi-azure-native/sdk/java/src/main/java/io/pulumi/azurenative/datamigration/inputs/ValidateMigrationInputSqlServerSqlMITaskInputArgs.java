// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.enums.BackupMode;
import io.pulumi.azurenative.datamigration.inputs.BlobShareArgs;
import io.pulumi.azurenative.datamigration.inputs.FileShareArgs;
import io.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlMIDatabaseInputArgs;
import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Input for task that validates migration input for SQL to Azure SQL Managed Instance
 * 
 */
public final class ValidateMigrationInputSqlServerSqlMITaskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ValidateMigrationInputSqlServerSqlMITaskInputArgs Empty = new ValidateMigrationInputSqlServerSqlMITaskInputArgs();

    /**
     * SAS URI of Azure Storage Account Container to be used for storing backup files.
     * 
     */
    @InputImport(name="backupBlobShare", required=true)
        private final Input<BlobShareArgs> backupBlobShare;

    public Input<BlobShareArgs> getBackupBlobShare() {
        return this.backupBlobShare;
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
     * Backup Mode to specify whether to use existing backup or create new backup.
     * 
     */
    @InputImport(name="backupMode")
        private final @Nullable Input<Either<String,BackupMode>> backupMode;

    public Input<Either<String,BackupMode>> getBackupMode() {
        return this.backupMode == null ? Input.empty() : this.backupMode;
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
     * Logins to migrate
     * 
     */
    @InputImport(name="selectedLogins")
        private final @Nullable Input<List<String>> selectedLogins;

    public Input<List<String>> getSelectedLogins() {
        return this.selectedLogins == null ? Input.empty() : this.selectedLogins;
    }

    /**
     * Information for connecting to source
     * 
     */
    @InputImport(name="sourceConnectionInfo", required=true)
        private final Input<SqlConnectionInfoArgs> sourceConnectionInfo;

    public Input<SqlConnectionInfoArgs> getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Information for connecting to target
     * 
     */
    @InputImport(name="targetConnectionInfo", required=true)
        private final Input<SqlConnectionInfoArgs> targetConnectionInfo;

    public Input<SqlConnectionInfoArgs> getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public ValidateMigrationInputSqlServerSqlMITaskInputArgs(
        Input<BlobShareArgs> backupBlobShare,
        @Nullable Input<FileShareArgs> backupFileShare,
        @Nullable Input<Either<String,BackupMode>> backupMode,
        Input<List<MigrateSqlServerSqlMIDatabaseInputArgs>> selectedDatabases,
        @Nullable Input<List<String>> selectedLogins,
        Input<SqlConnectionInfoArgs> sourceConnectionInfo,
        Input<SqlConnectionInfoArgs> targetConnectionInfo) {
        this.backupBlobShare = Objects.requireNonNull(backupBlobShare, "expected parameter 'backupBlobShare' to be non-null");
        this.backupFileShare = backupFileShare;
        this.backupMode = backupMode;
        this.selectedDatabases = Objects.requireNonNull(selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
        this.selectedLogins = selectedLogins;
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private ValidateMigrationInputSqlServerSqlMITaskInputArgs() {
        this.backupBlobShare = Input.empty();
        this.backupFileShare = Input.empty();
        this.backupMode = Input.empty();
        this.selectedDatabases = Input.empty();
        this.selectedLogins = Input.empty();
        this.sourceConnectionInfo = Input.empty();
        this.targetConnectionInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateMigrationInputSqlServerSqlMITaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BlobShareArgs> backupBlobShare;
        private @Nullable Input<FileShareArgs> backupFileShare;
        private @Nullable Input<Either<String,BackupMode>> backupMode;
        private Input<List<MigrateSqlServerSqlMIDatabaseInputArgs>> selectedDatabases;
        private @Nullable Input<List<String>> selectedLogins;
        private Input<SqlConnectionInfoArgs> sourceConnectionInfo;
        private Input<SqlConnectionInfoArgs> targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateMigrationInputSqlServerSqlMITaskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupBlobShare = defaults.backupBlobShare;
    	      this.backupFileShare = defaults.backupFileShare;
    	      this.backupMode = defaults.backupMode;
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.selectedLogins = defaults.selectedLogins;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setBackupBlobShare(Input<BlobShareArgs> backupBlobShare) {
            this.backupBlobShare = Objects.requireNonNull(backupBlobShare);
            return this;
        }

        public Builder setBackupBlobShare(BlobShareArgs backupBlobShare) {
            this.backupBlobShare = Input.of(Objects.requireNonNull(backupBlobShare));
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

        public Builder setBackupMode(@Nullable Input<Either<String,BackupMode>> backupMode) {
            this.backupMode = backupMode;
            return this;
        }

        public Builder setBackupMode(@Nullable Either<String,BackupMode> backupMode) {
            this.backupMode = Input.ofNullable(backupMode);
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

        public Builder setSelectedLogins(@Nullable Input<List<String>> selectedLogins) {
            this.selectedLogins = selectedLogins;
            return this;
        }

        public Builder setSelectedLogins(@Nullable List<String> selectedLogins) {
            this.selectedLogins = Input.ofNullable(selectedLogins);
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

        public Builder setTargetConnectionInfo(Input<SqlConnectionInfoArgs> targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(SqlConnectionInfoArgs targetConnectionInfo) {
            this.targetConnectionInfo = Input.of(Objects.requireNonNull(targetConnectionInfo));
            return this;
        }
        public ValidateMigrationInputSqlServerSqlMITaskInputArgs build() {
            return new ValidateMigrationInputSqlServerSqlMITaskInputArgs(backupBlobShare, backupFileShare, backupMode, selectedDatabases, selectedLogins, sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
