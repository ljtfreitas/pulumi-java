// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Information about backup files when existing backup mode is used.
 * 
 */
public final class DatabaseBackupInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatabaseBackupInfoResponse Empty = new DatabaseBackupInfoResponse();

    /**
     * The list of backup files for the current database.
     * 
     */
    @InputImport(name="backupFiles", required=true)
        private final List<String> backupFiles;

    public List<String> getBackupFiles() {
        return this.backupFiles;
    }

    /**
     * Date and time when the backup operation finished.
     * 
     */
    @InputImport(name="backupFinishDate", required=true)
        private final String backupFinishDate;

    public String getBackupFinishDate() {
        return this.backupFinishDate;
    }

    /**
     * Backup Type.
     * 
     */
    @InputImport(name="backupType", required=true)
        private final String backupType;

    public String getBackupType() {
        return this.backupType;
    }

    /**
     * Database name.
     * 
     */
    @InputImport(name="databaseName", required=true)
        private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Number of files in the backup set.
     * 
     */
    @InputImport(name="familyCount", required=true)
        private final Integer familyCount;

    public Integer getFamilyCount() {
        return this.familyCount;
    }

    /**
     * Whether the backup set is compressed
     * 
     */
    @InputImport(name="isCompressed", required=true)
        private final Boolean isCompressed;

    public Boolean getIsCompressed() {
        return this.isCompressed;
    }

    /**
     * Database was damaged when backed up, but the backup operation was requested to continue despite errors.
     * 
     */
    @InputImport(name="isDamaged", required=true)
        private final Boolean isDamaged;

    public Boolean getIsDamaged() {
        return this.isDamaged;
    }

    /**
     * Position of current database backup in the file.
     * 
     */
    @InputImport(name="position", required=true)
        private final Integer position;

    public Integer getPosition() {
        return this.position;
    }

    public DatabaseBackupInfoResponse(
        List<String> backupFiles,
        String backupFinishDate,
        String backupType,
        String databaseName,
        Integer familyCount,
        Boolean isCompressed,
        Boolean isDamaged,
        Integer position) {
        this.backupFiles = Objects.requireNonNull(backupFiles, "expected parameter 'backupFiles' to be non-null");
        this.backupFinishDate = Objects.requireNonNull(backupFinishDate, "expected parameter 'backupFinishDate' to be non-null");
        this.backupType = Objects.requireNonNull(backupType, "expected parameter 'backupType' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.familyCount = Objects.requireNonNull(familyCount, "expected parameter 'familyCount' to be non-null");
        this.isCompressed = Objects.requireNonNull(isCompressed, "expected parameter 'isCompressed' to be non-null");
        this.isDamaged = Objects.requireNonNull(isDamaged, "expected parameter 'isDamaged' to be non-null");
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
    }

    private DatabaseBackupInfoResponse() {
        this.backupFiles = List.of();
        this.backupFinishDate = null;
        this.backupType = null;
        this.databaseName = null;
        this.familyCount = null;
        this.isCompressed = null;
        this.isDamaged = null;
        this.position = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseBackupInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> backupFiles;
        private String backupFinishDate;
        private String backupType;
        private String databaseName;
        private Integer familyCount;
        private Boolean isCompressed;
        private Boolean isDamaged;
        private Integer position;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseBackupInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupFiles = defaults.backupFiles;
    	      this.backupFinishDate = defaults.backupFinishDate;
    	      this.backupType = defaults.backupType;
    	      this.databaseName = defaults.databaseName;
    	      this.familyCount = defaults.familyCount;
    	      this.isCompressed = defaults.isCompressed;
    	      this.isDamaged = defaults.isDamaged;
    	      this.position = defaults.position;
        }

        public Builder setBackupFiles(List<String> backupFiles) {
            this.backupFiles = Objects.requireNonNull(backupFiles);
            return this;
        }

        public Builder setBackupFinishDate(String backupFinishDate) {
            this.backupFinishDate = Objects.requireNonNull(backupFinishDate);
            return this;
        }

        public Builder setBackupType(String backupType) {
            this.backupType = Objects.requireNonNull(backupType);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setFamilyCount(Integer familyCount) {
            this.familyCount = Objects.requireNonNull(familyCount);
            return this;
        }

        public Builder setIsCompressed(Boolean isCompressed) {
            this.isCompressed = Objects.requireNonNull(isCompressed);
            return this;
        }

        public Builder setIsDamaged(Boolean isDamaged) {
            this.isDamaged = Objects.requireNonNull(isDamaged);
            return this;
        }

        public Builder setPosition(Integer position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }
        public DatabaseBackupInfoResponse build() {
            return new DatabaseBackupInfoResponse(backupFiles, backupFinishDate, backupType, databaseName, familyCount, isCompressed, isDamaged, position);
        }
    }
}
