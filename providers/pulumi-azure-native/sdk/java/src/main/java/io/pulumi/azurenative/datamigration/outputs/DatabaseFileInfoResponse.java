// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabaseFileInfoResponse {
    /**
     * Name of the database
     * 
     */
    private final @Nullable String databaseName;
    /**
     * Database file type
     * 
     */
    private final @Nullable String fileType;
    /**
     * Unique identifier for database file
     * 
     */
    private final @Nullable String id;
    /**
     * Logical name of the file
     * 
     */
    private final @Nullable String logicalName;
    /**
     * Operating-system full path of the file
     * 
     */
    private final @Nullable String physicalFullName;
    /**
     * Suggested full path of the file for restoring
     * 
     */
    private final @Nullable String restoreFullName;
    /**
     * Size of the file in megabytes
     * 
     */
    private final @Nullable Double sizeMB;

    @OutputCustomType.Constructor({"databaseName","fileType","id","logicalName","physicalFullName","restoreFullName","sizeMB"})
    private DatabaseFileInfoResponse(
        @Nullable String databaseName,
        @Nullable String fileType,
        @Nullable String id,
        @Nullable String logicalName,
        @Nullable String physicalFullName,
        @Nullable String restoreFullName,
        @Nullable Double sizeMB) {
        this.databaseName = databaseName;
        this.fileType = fileType;
        this.id = id;
        this.logicalName = logicalName;
        this.physicalFullName = physicalFullName;
        this.restoreFullName = restoreFullName;
        this.sizeMB = sizeMB;
    }

    /**
     * Name of the database
     * 
     */
    public Optional<String> getDatabaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * Database file type
     * 
     */
    public Optional<String> getFileType() {
        return Optional.ofNullable(this.fileType);
    }
    /**
     * Unique identifier for database file
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Logical name of the file
     * 
     */
    public Optional<String> getLogicalName() {
        return Optional.ofNullable(this.logicalName);
    }
    /**
     * Operating-system full path of the file
     * 
     */
    public Optional<String> getPhysicalFullName() {
        return Optional.ofNullable(this.physicalFullName);
    }
    /**
     * Suggested full path of the file for restoring
     * 
     */
    public Optional<String> getRestoreFullName() {
        return Optional.ofNullable(this.restoreFullName);
    }
    /**
     * Size of the file in megabytes
     * 
     */
    public Optional<Double> getSizeMB() {
        return Optional.ofNullable(this.sizeMB);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseFileInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String databaseName;
        private @Nullable String fileType;
        private @Nullable String id;
        private @Nullable String logicalName;
        private @Nullable String physicalFullName;
        private @Nullable String restoreFullName;
        private @Nullable Double sizeMB;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseFileInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.fileType = defaults.fileType;
    	      this.id = defaults.id;
    	      this.logicalName = defaults.logicalName;
    	      this.physicalFullName = defaults.physicalFullName;
    	      this.restoreFullName = defaults.restoreFullName;
    	      this.sizeMB = defaults.sizeMB;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setFileType(@Nullable String fileType) {
            this.fileType = fileType;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLogicalName(@Nullable String logicalName) {
            this.logicalName = logicalName;
            return this;
        }

        public Builder setPhysicalFullName(@Nullable String physicalFullName) {
            this.physicalFullName = physicalFullName;
            return this;
        }

        public Builder setRestoreFullName(@Nullable String restoreFullName) {
            this.restoreFullName = restoreFullName;
            return this;
        }

        public Builder setSizeMB(@Nullable Double sizeMB) {
            this.sizeMB = sizeMB;
            return this;
        }

        public DatabaseFileInfoResponse build() {
            return new DatabaseFileInfoResponse(databaseName, fileType, id, logicalName, physicalFullName, restoreFullName, sizeMB);
        }
    }
}
