// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity source for an Office 365 service.
 * 
 */
public final class Office365SourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final Office365SourceResponse Empty = new Office365SourceResponse();

    /**
     * The groups containing all the users. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    @Import(name="allowedGroups")
      private final @Nullable Object allowedGroups;

    public Optional<Object> getAllowedGroups() {
        return this.allowedGroups == null ? Optional.empty() : Optional.ofNullable(this.allowedGroups);
    }

    /**
     * The Column to apply the <paramref name="StartTime"/> and <paramref name="EndTime"/>. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="dateFilterColumn")
      private final @Nullable Object dateFilterColumn;

    public Optional<Object> getDateFilterColumn() {
        return this.dateFilterColumn == null ? Optional.empty() : Optional.ofNullable(this.dateFilterColumn);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Object disableMetricsCollection;

    public Optional<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * End time of the requested range for this dataset. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="endTime")
      private final @Nullable Object endTime;

    public Optional<Object> getEndTime() {
        return this.endTime == null ? Optional.empty() : Optional.ofNullable(this.endTime);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The columns to be read out from the Office 365 table. Type: array of objects (or Expression with resultType array of objects). Example: [ { "name": "Id" }, { "name": "CreatedDateTime" } ]
     * 
     */
    @Import(name="outputColumns")
      private final @Nullable Object outputColumns;

    public Optional<Object> getOutputColumns() {
        return this.outputColumns == null ? Optional.empty() : Optional.ofNullable(this.outputColumns);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
      private final @Nullable Object sourceRetryCount;

    public Optional<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
      private final @Nullable Object sourceRetryWait;

    public Optional<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Start time of the requested range for this dataset. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="startTime")
      private final @Nullable Object startTime;

    public Optional<Object> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    /**
     * Copy source type.
     * Expected value is 'Office365Source'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The user scope uri. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userScopeFilterUri")
      private final @Nullable Object userScopeFilterUri;

    public Optional<Object> getUserScopeFilterUri() {
        return this.userScopeFilterUri == null ? Optional.empty() : Optional.ofNullable(this.userScopeFilterUri);
    }

    public Office365SourceResponse(
        @Nullable Object allowedGroups,
        @Nullable Object dateFilterColumn,
        @Nullable Object disableMetricsCollection,
        @Nullable Object endTime,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object outputColumns,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        @Nullable Object startTime,
        String type,
        @Nullable Object userScopeFilterUri) {
        this.allowedGroups = allowedGroups;
        this.dateFilterColumn = dateFilterColumn;
        this.disableMetricsCollection = disableMetricsCollection;
        this.endTime = endTime;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.outputColumns = outputColumns;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.startTime = startTime;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userScopeFilterUri = userScopeFilterUri;
    }

    private Office365SourceResponse() {
        this.allowedGroups = null;
        this.dateFilterColumn = null;
        this.disableMetricsCollection = null;
        this.endTime = null;
        this.maxConcurrentConnections = null;
        this.outputColumns = null;
        this.sourceRetryCount = null;
        this.sourceRetryWait = null;
        this.startTime = null;
        this.type = null;
        this.userScopeFilterUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Office365SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object allowedGroups;
        private @Nullable Object dateFilterColumn;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object endTime;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object outputColumns;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private @Nullable Object startTime;
        private String type;
        private @Nullable Object userScopeFilterUri;

        public Builder() {
    	      // Empty
        }

        public Builder(Office365SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedGroups = defaults.allowedGroups;
    	      this.dateFilterColumn = defaults.dateFilterColumn;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.endTime = defaults.endTime;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.outputColumns = defaults.outputColumns;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
    	      this.userScopeFilterUri = defaults.userScopeFilterUri;
        }

        public Builder allowedGroups(@Nullable Object allowedGroups) {
            this.allowedGroups = allowedGroups;
            return this;
        }

        public Builder dateFilterColumn(@Nullable Object dateFilterColumn) {
            this.dateFilterColumn = dateFilterColumn;
            return this;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder endTime(@Nullable Object endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder outputColumns(@Nullable Object outputColumns) {
            this.outputColumns = outputColumns;
            return this;
        }

        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder startTime(@Nullable Object startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userScopeFilterUri(@Nullable Object userScopeFilterUri) {
            this.userScopeFilterUri = userScopeFilterUri;
            return this;
        }
        public Office365SourceResponse build() {
            return new Office365SourceResponse(allowedGroups, dateFilterColumn, disableMetricsCollection, endTime, maxConcurrentConnections, outputColumns, sourceRetryCount, sourceRetryWait, startTime, type, userScopeFilterUri);
        }
    }
}
