// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse {
    /**
     * Migration settings which tune the migration behavior
     * 
     */
    private final @Nullable Map<String,String> migrationSetting;
    /**
     * Name of the database
     * 
     */
    private final @Nullable String name;
    /**
     * Source settings to tune source endpoint migration behavior
     * 
     */
    private final @Nullable Map<String,String> sourceSetting;
    /**
     * Name of target database. Note: Target database will be truncated before starting migration.
     * 
     */
    private final @Nullable String targetDatabaseName;
    /**
     * Target settings to tune target endpoint migration behavior
     * 
     */
    private final @Nullable Map<String,String> targetSetting;

    @CustomType.Constructor
    private MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse(
        @CustomType.Parameter("migrationSetting") @Nullable Map<String,String> migrationSetting,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("sourceSetting") @Nullable Map<String,String> sourceSetting,
        @CustomType.Parameter("targetDatabaseName") @Nullable String targetDatabaseName,
        @CustomType.Parameter("targetSetting") @Nullable Map<String,String> targetSetting) {
        this.migrationSetting = migrationSetting;
        this.name = name;
        this.sourceSetting = sourceSetting;
        this.targetDatabaseName = targetDatabaseName;
        this.targetSetting = targetSetting;
    }

    /**
     * Migration settings which tune the migration behavior
     * 
    */
    public Map<String,String> getMigrationSetting() {
        return this.migrationSetting == null ? Map.of() : this.migrationSetting;
    }
    /**
     * Name of the database
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Source settings to tune source endpoint migration behavior
     * 
    */
    public Map<String,String> getSourceSetting() {
        return this.sourceSetting == null ? Map.of() : this.sourceSetting;
    }
    /**
     * Name of target database. Note: Target database will be truncated before starting migration.
     * 
    */
    public Optional<String> getTargetDatabaseName() {
        return Optional.ofNullable(this.targetDatabaseName);
    }
    /**
     * Target settings to tune target endpoint migration behavior
     * 
    */
    public Map<String,String> getTargetSetting() {
        return this.targetSetting == null ? Map.of() : this.targetSetting;
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

        public Builder migrationSetting(@Nullable Map<String,String> migrationSetting) {
            this.migrationSetting = migrationSetting;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder sourceSetting(@Nullable Map<String,String> sourceSetting) {
            this.sourceSetting = sourceSetting;
            return this;
        }

        public Builder targetDatabaseName(@Nullable String targetDatabaseName) {
            this.targetDatabaseName = targetDatabaseName;
            return this;
        }

        public Builder targetSetting(@Nullable Map<String,String> targetSetting) {
            this.targetSetting = targetSetting;
            return this;
        }
        public MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse build() {
            return new MigratePostgreSqlAzureDbForPostgreSqlSyncDatabaseInputResponse(migrationSetting, name, sourceSetting, targetDatabaseName, targetSetting);
        }
    }
}
