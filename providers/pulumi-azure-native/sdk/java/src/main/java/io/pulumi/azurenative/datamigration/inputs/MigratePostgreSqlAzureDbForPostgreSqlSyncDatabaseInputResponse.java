// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Database specific information for PostgreSQL to Azure Database for PostgreSQL migration task inputs
 * 
 */
public final class MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse Empty = new MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse();

    /**
     * Migration settings which tune the migration behavior
     * 
     */
    @InputImport(name="migrationSetting")
    private final @Nullable Map<String,String> migrationSetting;

    public Map<String,String> getMigrationSetting() {
        return this.migrationSetting == null ? Map.of() : this.migrationSetting;
    }

    /**
     * Name of the database
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Source settings to tune source endpoint migration behavior
     * 
     */
    @InputImport(name="sourceSetting")
    private final @Nullable Map<String,String> sourceSetting;

    public Map<String,String> getSourceSetting() {
        return this.sourceSetting == null ? Map.of() : this.sourceSetting;
    }

    /**
     * Name of target database. Note: Target database will be truncated before starting migration.
     * 
     */
    @InputImport(name="targetDatabaseName")
    private final @Nullable String targetDatabaseName;

    public Optional<String> getTargetDatabaseName() {
        return this.targetDatabaseName == null ? Optional.empty() : Optional.ofNullable(this.targetDatabaseName);
    }

    /**
     * Target settings to tune target endpoint migration behavior
     * 
     */
    @InputImport(name="targetSetting")
    private final @Nullable Map<String,String> targetSetting;

    public Map<String,String> getTargetSetting() {
        return this.targetSetting == null ? Map.of() : this.targetSetting;
    }

    public MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse(
        @Nullable Map<String,String> migrationSetting,
        @Nullable String name,
        @Nullable Map<String,String> sourceSetting,
        @Nullable String targetDatabaseName,
        @Nullable Map<String,String> targetSetting) {
        this.migrationSetting = migrationSetting;
        this.name = name;
        this.sourceSetting = sourceSetting;
        this.targetDatabaseName = targetDatabaseName;
        this.targetSetting = targetSetting;
    }

    private MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse() {
        this.migrationSetting = Map.of();
        this.name = null;
        this.sourceSetting = Map.of();
        this.targetDatabaseName = null;
        this.targetSetting = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> migrationSetting;
        private @Nullable String name;
        private @Nullable Map<String,String> sourceSetting;
        private @Nullable String targetDatabaseName;
        private @Nullable Map<String,String> targetSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.migrationSetting = defaults.migrationSetting;
    	      this.name = defaults.name;
    	      this.sourceSetting = defaults.sourceSetting;
    	      this.targetDatabaseName = defaults.targetDatabaseName;
    	      this.targetSetting = defaults.targetSetting;
        }

        public Builder setMigrationSetting(@Nullable Map<String,String> migrationSetting) {
            this.migrationSetting = migrationSetting;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSourceSetting(@Nullable Map<String,String> sourceSetting) {
            this.sourceSetting = sourceSetting;
            return this;
        }

        public Builder setTargetDatabaseName(@Nullable String targetDatabaseName) {
            this.targetDatabaseName = targetDatabaseName;
            return this;
        }

        public Builder setTargetSetting(@Nullable Map<String,String> targetSetting) {
            this.targetSetting = targetSetting;
            return this;
        }

        public MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse build() {
            return new MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse(migrationSetting, name, sourceSetting, targetDatabaseName, targetSetting);
        }
    }
}
