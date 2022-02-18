// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabasesSolutionSummaryResponse {
    /**
     * Gets or sets the count of database instances assessed.
     * 
     */
    private final @Nullable Integer databaseInstancesAssessedCount;
    /**
     * Gets or sets the count of databases assessed.
     * 
     */
    private final @Nullable Integer databasesAssessedCount;
    /**
     * Gets the Instance type.
     * Expected value is 'Databases'.
     * 
     */
    private final String instanceType;
    /**
     * Gets or sets the count of databases ready for migration.
     * 
     */
    private final @Nullable Integer migrationReadyCount;

    @OutputCustomType.Constructor({"databaseInstancesAssessedCount","databasesAssessedCount","instanceType","migrationReadyCount"})
    private DatabasesSolutionSummaryResponse(
        @Nullable Integer databaseInstancesAssessedCount,
        @Nullable Integer databasesAssessedCount,
        String instanceType,
        @Nullable Integer migrationReadyCount) {
        this.databaseInstancesAssessedCount = databaseInstancesAssessedCount;
        this.databasesAssessedCount = databasesAssessedCount;
        this.instanceType = Objects.requireNonNull(instanceType);
        this.migrationReadyCount = migrationReadyCount;
    }

    /**
     * Gets or sets the count of database instances assessed.
     * 
     */
    public Optional<Integer> getDatabaseInstancesAssessedCount() {
        return Optional.ofNullable(this.databaseInstancesAssessedCount);
    }
    /**
     * Gets or sets the count of databases assessed.
     * 
     */
    public Optional<Integer> getDatabasesAssessedCount() {
        return Optional.ofNullable(this.databasesAssessedCount);
    }
    /**
     * Gets the Instance type.
     * Expected value is 'Databases'.
     * 
     */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * Gets or sets the count of databases ready for migration.
     * 
     */
    public Optional<Integer> getMigrationReadyCount() {
        return Optional.ofNullable(this.migrationReadyCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabasesSolutionSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer databaseInstancesAssessedCount;
        private @Nullable Integer databasesAssessedCount;
        private String instanceType;
        private @Nullable Integer migrationReadyCount;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabasesSolutionSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseInstancesAssessedCount = defaults.databaseInstancesAssessedCount;
    	      this.databasesAssessedCount = defaults.databasesAssessedCount;
    	      this.instanceType = defaults.instanceType;
    	      this.migrationReadyCount = defaults.migrationReadyCount;
        }

        public Builder setDatabaseInstancesAssessedCount(@Nullable Integer databaseInstancesAssessedCount) {
            this.databaseInstancesAssessedCount = databaseInstancesAssessedCount;
            return this;
        }

        public Builder setDatabasesAssessedCount(@Nullable Integer databasesAssessedCount) {
            this.databasesAssessedCount = databasesAssessedCount;
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setMigrationReadyCount(@Nullable Integer migrationReadyCount) {
            this.migrationReadyCount = migrationReadyCount;
            return this;
        }

        public DatabasesSolutionSummaryResponse build() {
            return new DatabasesSolutionSummaryResponse(databaseInstancesAssessedCount, databasesAssessedCount, instanceType, migrationReadyCount);
        }
    }
}
