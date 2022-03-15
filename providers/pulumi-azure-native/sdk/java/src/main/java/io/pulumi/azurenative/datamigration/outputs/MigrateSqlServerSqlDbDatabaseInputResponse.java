// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MigrateSqlServerSqlDbDatabaseInputResponse {
    /**
     * Whether to set database read only before migration
     * 
     */
    private final @Nullable Boolean makeSourceDbReadOnly;
    /**
     * Name of the database
     * 
     */
    private final @Nullable String name;
    /**
     * Mapping of source to target tables
     * 
     */
    private final @Nullable Map<String,String> tableMap;
    /**
     * Name of target database. Note: Target database will be truncated before starting migration.
     * 
     */
    private final @Nullable String targetDatabaseName;

    @CustomType.Constructor
    private MigrateSqlServerSqlDbDatabaseInputResponse(
        @CustomType.Parameter("makeSourceDbReadOnly") @Nullable Boolean makeSourceDbReadOnly,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tableMap") @Nullable Map<String,String> tableMap,
        @CustomType.Parameter("targetDatabaseName") @Nullable String targetDatabaseName) {
        this.makeSourceDbReadOnly = makeSourceDbReadOnly;
        this.name = name;
        this.tableMap = tableMap;
        this.targetDatabaseName = targetDatabaseName;
    }

    /**
     * Whether to set database read only before migration
     * 
    */
    public Optional<Boolean> getMakeSourceDbReadOnly() {
        return Optional.ofNullable(this.makeSourceDbReadOnly);
    }
    /**
     * Name of the database
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Mapping of source to target tables
     * 
    */
    public Map<String,String> getTableMap() {
        return this.tableMap == null ? Map.of() : this.tableMap;
    }
    /**
     * Name of target database. Note: Target database will be truncated before starting migration.
     * 
    */
    public Optional<String> getTargetDatabaseName() {
        return Optional.ofNullable(this.targetDatabaseName);
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

        public Builder makeSourceDbReadOnly(@Nullable Boolean makeSourceDbReadOnly) {
            this.makeSourceDbReadOnly = makeSourceDbReadOnly;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder tableMap(@Nullable Map<String,String> tableMap) {
            this.tableMap = tableMap;
            return this;
        }

        public Builder targetDatabaseName(@Nullable String targetDatabaseName) {
            this.targetDatabaseName = targetDatabaseName;
            return this;
        }
        public MigrateSqlServerSqlDbDatabaseInputResponse build() {
            return new MigrateSqlServerSqlDbDatabaseInputResponse(makeSourceDbReadOnly, name, tableMap, targetDatabaseName);
        }
    }
}
