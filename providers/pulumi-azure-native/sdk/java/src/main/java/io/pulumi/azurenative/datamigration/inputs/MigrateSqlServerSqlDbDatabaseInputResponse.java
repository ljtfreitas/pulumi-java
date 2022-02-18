// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Database specific information for SQL to Azure SQL DB migration task inputs
 * 
 */
public final class MigrateSqlServerSqlDbDatabaseInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlDbDatabaseInputResponse Empty = new MigrateSqlServerSqlDbDatabaseInputResponse();

    /**
     * Whether to set database read only before migration
     * 
     */
    @InputImport(name="makeSourceDbReadOnly")
    private final @Nullable Boolean makeSourceDbReadOnly;

    public Optional<Boolean> getMakeSourceDbReadOnly() {
        return this.makeSourceDbReadOnly == null ? Optional.empty() : Optional.ofNullable(this.makeSourceDbReadOnly);
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
     * Mapping of source to target tables
     * 
     */
    @InputImport(name="tableMap")
    private final @Nullable Map<String,String> tableMap;

    public Map<String,String> getTableMap() {
        return this.tableMap == null ? Map.of() : this.tableMap;
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

    public MigrateSqlServerSqlDbDatabaseInputResponse(
        @Nullable Boolean makeSourceDbReadOnly,
        @Nullable String name,
        @Nullable Map<String,String> tableMap,
        @Nullable String targetDatabaseName) {
        this.makeSourceDbReadOnly = makeSourceDbReadOnly;
        this.name = name;
        this.tableMap = tableMap;
        this.targetDatabaseName = targetDatabaseName;
    }

    private MigrateSqlServerSqlDbDatabaseInputResponse() {
        this.makeSourceDbReadOnly = null;
        this.name = null;
        this.tableMap = Map.of();
        this.targetDatabaseName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbDatabaseInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean makeSourceDbReadOnly;
        private @Nullable String name;
        private @Nullable Map<String,String> tableMap;
        private @Nullable String targetDatabaseName;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbDatabaseInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.makeSourceDbReadOnly = defaults.makeSourceDbReadOnly;
    	      this.name = defaults.name;
    	      this.tableMap = defaults.tableMap;
    	      this.targetDatabaseName = defaults.targetDatabaseName;
        }

        public Builder setMakeSourceDbReadOnly(@Nullable Boolean makeSourceDbReadOnly) {
            this.makeSourceDbReadOnly = makeSourceDbReadOnly;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTableMap(@Nullable Map<String,String> tableMap) {
            this.tableMap = tableMap;
            return this;
        }

        public Builder setTargetDatabaseName(@Nullable String targetDatabaseName) {
            this.targetDatabaseName = targetDatabaseName;
            return this;
        }

        public MigrateSqlServerSqlDbDatabaseInputResponse build() {
            return new MigrateSqlServerSqlDbDatabaseInputResponse(makeSourceDbReadOnly, name, tableMap, targetDatabaseName);
        }
    }
}
