// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabaseBackupSettingResponse {
    /**
     * Contains a connection string to a database which is being backed up or restored. If the restore should happen to a new database, the database name inside is the new one.
     * 
     */
    private final @Nullable String connectionString;
    /**
     * Contains a connection string name that is linked to the SiteConfig.ConnectionStrings.
     * This is used during restore with overwrite connection strings options.
     * 
     */
    private final @Nullable String connectionStringName;
    /**
     * Database type (e.g. SqlAzure / MySql).
     * 
     */
    private final String databaseType;
    private final @Nullable String name;

    @OutputCustomType.Constructor({"connectionString","connectionStringName","databaseType","name"})
    private DatabaseBackupSettingResponse(
        @Nullable String connectionString,
        @Nullable String connectionStringName,
        String databaseType,
        @Nullable String name) {
        this.connectionString = connectionString;
        this.connectionStringName = connectionStringName;
        this.databaseType = Objects.requireNonNull(databaseType);
        this.name = name;
    }

    /**
     * Contains a connection string to a database which is being backed up or restored. If the restore should happen to a new database, the database name inside is the new one.
     * 
     */
    public Optional<String> getConnectionString() {
        return Optional.ofNullable(this.connectionString);
    }
    /**
     * Contains a connection string name that is linked to the SiteConfig.ConnectionStrings.
     * This is used during restore with overwrite connection strings options.
     * 
     */
    public Optional<String> getConnectionStringName() {
        return Optional.ofNullable(this.connectionStringName);
    }
    /**
     * Database type (e.g. SqlAzure / MySql).
     * 
     */
    public String getDatabaseType() {
        return this.databaseType;
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseBackupSettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectionString;
        private @Nullable String connectionStringName;
        private String databaseType;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseBackupSettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.connectionStringName = defaults.connectionStringName;
    	      this.databaseType = defaults.databaseType;
    	      this.name = defaults.name;
        }

        public Builder setConnectionString(@Nullable String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setConnectionStringName(@Nullable String connectionStringName) {
            this.connectionStringName = connectionStringName;
            return this;
        }

        public Builder setDatabaseType(String databaseType) {
            this.databaseType = Objects.requireNonNull(databaseType);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public DatabaseBackupSettingResponse build() {
            return new DatabaseBackupSettingResponse(connectionString, connectionStringName, databaseType, name);
        }
    }
}
