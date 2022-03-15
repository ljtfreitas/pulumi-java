// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Office365SourceResponse {
    /**
     * The groups containing all the users. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    private final @Nullable Object allowedGroups;
    /**
     * The Column to apply the <paramref name="StartTime"/> and <paramref name="EndTime"/>. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object dateFilterColumn;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * End time of the requested range for this dataset. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object endTime;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * The columns to be read out from the Office 365 table. Type: array of objects (or Expression with resultType array of objects). Example: [ { "name": "Id" }, { "name": "CreatedDateTime" } ]
     * 
     */
    private final @Nullable Object outputColumns;
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sourceRetryCount;
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sourceRetryWait;
    /**
     * Start time of the requested range for this dataset. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object startTime;
    /**
     * Copy source type.
     * Expected value is 'Office365Source'.
     * 
     */
    private final String type;
    /**
     * The user scope uri. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object userScopeFilterUri;

    @CustomType.Constructor
    private Office365SourceResponse(
        @CustomType.Parameter("allowedGroups") @Nullable Object allowedGroups,
        @CustomType.Parameter("dateFilterColumn") @Nullable Object dateFilterColumn,
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("endTime") @Nullable Object endTime,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("outputColumns") @Nullable Object outputColumns,
        @CustomType.Parameter("sourceRetryCount") @Nullable Object sourceRetryCount,
        @CustomType.Parameter("sourceRetryWait") @Nullable Object sourceRetryWait,
        @CustomType.Parameter("startTime") @Nullable Object startTime,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userScopeFilterUri") @Nullable Object userScopeFilterUri) {
        this.allowedGroups = allowedGroups;
        this.dateFilterColumn = dateFilterColumn;
        this.disableMetricsCollection = disableMetricsCollection;
        this.endTime = endTime;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.outputColumns = outputColumns;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.startTime = startTime;
        this.type = type;
        this.userScopeFilterUri = userScopeFilterUri;
    }

    /**
     * The groups containing all the users. Type: array of strings (or Expression with resultType array of strings).
     * 
    */
    public Optional<Object> getAllowedGroups() {
        return Optional.ofNullable(this.allowedGroups);
    }
    /**
     * The Column to apply the <paramref name="StartTime"/> and <paramref name="EndTime"/>. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getDateFilterColumn() {
        return Optional.ofNullable(this.dateFilterColumn);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * End time of the requested range for this dataset. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getEndTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * The columns to be read out from the Office 365 table. Type: array of objects (or Expression with resultType array of objects). Example: [ { "name": "Id" }, { "name": "CreatedDateTime" } ]
     * 
    */
    public Optional<Object> getOutputColumns() {
        return Optional.ofNullable(this.outputColumns);
    }
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getSourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getSourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }
    /**
     * Start time of the requested range for this dataset. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * Copy source type.
     * Expected value is 'Office365Source'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The user scope uri. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getUserScopeFilterUri() {
        return Optional.ofNullable(this.userScopeFilterUri);
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
