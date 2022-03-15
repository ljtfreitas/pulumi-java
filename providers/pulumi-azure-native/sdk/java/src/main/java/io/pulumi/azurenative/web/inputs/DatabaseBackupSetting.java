// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.DatabaseType;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Database backup settings.
 * 
 */
public final class DatabaseBackupSetting extends io.pulumi.resources.InvokeArgs {

    public static final DatabaseBackupSetting Empty = new DatabaseBackupSetting();

    /**
     * Contains a connection string to a database which is being backed up or restored. If the restore should happen to a new database, the database name inside is the new one.
     * 
     */
    @Import(name="connectionString")
      private final @Nullable String connectionString;

    public Optional<String> getConnectionString() {
        return this.connectionString == null ? Optional.empty() : Optional.ofNullable(this.connectionString);
    }

    /**
     * Contains a connection string name that is linked to the SiteConfig.ConnectionStrings.
     * This is used during restore with overwrite connection strings options.
     * 
     */
    @Import(name="connectionStringName")
      private final @Nullable String connectionStringName;

    public Optional<String> getConnectionStringName() {
        return this.connectionStringName == null ? Optional.empty() : Optional.ofNullable(this.connectionStringName);
    }

    /**
     * Database type (e.g. SqlAzure / MySql).
     * 
     */
    @Import(name="databaseType", required=true)
      private final Either<String,DatabaseType> databaseType;

    public Either<String,DatabaseType> getDatabaseType() {
        return this.databaseType;
    }

    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public DatabaseBackupSetting(
        @Nullable String connectionString,
        @Nullable String connectionStringName,
        Either<String,DatabaseType> databaseType,
        @Nullable String name) {
        this.connectionString = connectionString;
        this.connectionStringName = connectionStringName;
        this.databaseType = Objects.requireNonNull(databaseType, "expected parameter 'databaseType' to be non-null");
        this.name = name;
    }

    private DatabaseBackupSetting() {
        this.connectionString = null;
        this.connectionStringName = null;
        this.databaseType = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseBackupSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectionString;
        private @Nullable String connectionStringName;
        private Either<String,DatabaseType> databaseType;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseBackupSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.connectionStringName = defaults.connectionStringName;
    	      this.databaseType = defaults.databaseType;
    	      this.name = defaults.name;
        }

        public Builder connectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder connectionStringName(@Nullable String connectionStringName) {
            this.connectionStringName = connectionStringName;
            return this;
        }

        public Builder databaseType(Either<String,DatabaseType> databaseType) {
            this.databaseType = Objects.requireNonNull(databaseType);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public DatabaseBackupSetting build() {
            return new DatabaseBackupSetting(connectionString, connectionStringName, databaseType, name);
        }
    }
}
