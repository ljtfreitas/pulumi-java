// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.SyncMigrationDatabaseErrorEventResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MigrateSqlServerSqlDbSyncTaskOutputDatabaseErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlDbSyncTaskOutputDatabaseErrorResponse Empty = new MigrateSqlServerSqlDbSyncTaskOutputDatabaseErrorResponse();

    /**
     * Error message
     * 
     */
    @InputImport(name="errorMessage")
    private final @Nullable String errorMessage;

    public Optional<String> getErrorMessage() {
        return this.errorMessage == null ? Optional.empty() : Optional.ofNullable(this.errorMessage);
    }

    /**
     * List of error events.
     * 
     */
    @InputImport(name="events")
    private final @Nullable List<SyncMigrationDatabaseErrorEventResponse> events;

    public List<SyncMigrationDatabaseErrorEventResponse> getEvents() {
        return this.events == null ? List.of() : this.events;
    }

    /**
     * Result identifier
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Result type
     * Expected value is 'DatabaseLevelErrorOutput'.
     * 
     */
    @InputImport(name="resultType", required=true)
    private final String resultType;

    public String getResultType() {
        return this.resultType;
    }

    public MigrateSqlServerSqlDbSyncTaskOutputDatabaseErrorResponse(
        @Nullable String errorMessage,
        @Nullable List<SyncMigrationDatabaseErrorEventResponse> events,
        String id,
        String resultType) {
        this.errorMessage = errorMessage;
        this.events = events;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
    }

    private MigrateSqlServerSqlDbSyncTaskOutputDatabaseErrorResponse() {
        this.errorMessage = null;
        this.events = List.of();
        this.id = null;
        this.resultType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbSyncTaskOutputDatabaseErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String errorMessage;
        private @Nullable List<SyncMigrationDatabaseErrorEventResponse> events;
        private String id;
        private String resultType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbSyncTaskOutputDatabaseErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorMessage = defaults.errorMessage;
    	      this.events = defaults.events;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
        }

        public Builder setErrorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public Builder setEvents(@Nullable List<SyncMigrationDatabaseErrorEventResponse> events) {
            this.events = events;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public MigrateSqlServerSqlDbSyncTaskOutputDatabaseErrorResponse build() {
            return new MigrateSqlServerSqlDbSyncTaskOutputDatabaseErrorResponse(errorMessage, events, id, resultType);
        }
    }
}
