// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.authorization.enums.AccessReviewRecurrenceRangeType;
import io.pulumi.azurenative.authorization.enums.AccessReviewResult;
import io.pulumi.azurenative.authorization.inputs.AccessReviewHistoryInstanceArgs;
import io.pulumi.azurenative.authorization.inputs.AccessReviewScopeArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessReviewHistoryDefinitionByIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessReviewHistoryDefinitionByIdArgs Empty = new AccessReviewHistoryDefinitionByIdArgs();

    /**
     * Collection of review decisions which the history data should be filtered on. For example if Approve and Deny are supplied the data will only contain review results in which the decision maker approved or denied a review request.
     * 
     */
    @InputImport(name="decisions")
    private final @Nullable Input<List<Either<String,AccessReviewResult>>> decisions;

    public Input<List<Either<String,AccessReviewResult>>> getDecisions() {
        return this.decisions == null ? Input.empty() : this.decisions;
    }

    /**
     * The display name for the history definition.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The DateTime when the review is scheduled to end. Required if type is endDate
     * 
     */
    @InputImport(name="endDate")
    private final @Nullable Input<String> endDate;

    public Input<String> getEndDate() {
        return this.endDate == null ? Input.empty() : this.endDate;
    }

    /**
     * The id of the access review history definition.
     * 
     */
    @InputImport(name="historyDefinitionId")
    private final @Nullable Input<String> historyDefinitionId;

    public Input<String> getHistoryDefinitionId() {
        return this.historyDefinitionId == null ? Input.empty() : this.historyDefinitionId;
    }

    /**
     * Set of access review history instances for this history definition.
     * 
     */
    @InputImport(name="instances")
    private final @Nullable Input<List<AccessReviewHistoryInstanceArgs>> instances;

    public Input<List<AccessReviewHistoryInstanceArgs>> getInstances() {
        return this.instances == null ? Input.empty() : this.instances;
    }

    /**
     * The interval for recurrence. For a quarterly review, the interval is 3 for type : absoluteMonthly.
     * 
     */
    @InputImport(name="interval")
    private final @Nullable Input<Integer> interval;

    public Input<Integer> getInterval() {
        return this.interval == null ? Input.empty() : this.interval;
    }

    /**
     * The number of times to repeat the access review. Required and must be positive if type is numbered.
     * 
     */
    @InputImport(name="numberOfOccurrences")
    private final @Nullable Input<Integer> numberOfOccurrences;

    public Input<Integer> getNumberOfOccurrences() {
        return this.numberOfOccurrences == null ? Input.empty() : this.numberOfOccurrences;
    }

    /**
     * A collection of scopes used when selecting review history data
     * 
     */
    @InputImport(name="scopes")
    private final @Nullable Input<List<AccessReviewScopeArgs>> scopes;

    public Input<List<AccessReviewScopeArgs>> getScopes() {
        return this.scopes == null ? Input.empty() : this.scopes;
    }

    /**
     * The DateTime when the review is scheduled to be start. This could be a date in the future. Required on create.
     * 
     */
    @InputImport(name="startDate")
    private final @Nullable Input<String> startDate;

    public Input<String> getStartDate() {
        return this.startDate == null ? Input.empty() : this.startDate;
    }

    /**
     * The recurrence range type. The possible values are: endDate, noEnd, numbered.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<Either<String,AccessReviewRecurrenceRangeType>> type;

    public Input<Either<String,AccessReviewRecurrenceRangeType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public AccessReviewHistoryDefinitionByIdArgs(
        @Nullable Input<List<Either<String,AccessReviewResult>>> decisions,
        @Nullable Input<String> displayName,
        @Nullable Input<String> endDate,
        @Nullable Input<String> historyDefinitionId,
        @Nullable Input<List<AccessReviewHistoryInstanceArgs>> instances,
        @Nullable Input<Integer> interval,
        @Nullable Input<Integer> numberOfOccurrences,
        @Nullable Input<List<AccessReviewScopeArgs>> scopes,
        @Nullable Input<String> startDate,
        @Nullable Input<Either<String,AccessReviewRecurrenceRangeType>> type) {
        this.decisions = decisions;
        this.displayName = displayName;
        this.endDate = endDate;
        this.historyDefinitionId = historyDefinitionId;
        this.instances = instances;
        this.interval = interval;
        this.numberOfOccurrences = numberOfOccurrences;
        this.scopes = scopes;
        this.startDate = startDate;
        this.type = type;
    }

    private AccessReviewHistoryDefinitionByIdArgs() {
        this.decisions = Input.empty();
        this.displayName = Input.empty();
        this.endDate = Input.empty();
        this.historyDefinitionId = Input.empty();
        this.instances = Input.empty();
        this.interval = Input.empty();
        this.numberOfOccurrences = Input.empty();
        this.scopes = Input.empty();
        this.startDate = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessReviewHistoryDefinitionByIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Either<String,AccessReviewResult>>> decisions;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> endDate;
        private @Nullable Input<String> historyDefinitionId;
        private @Nullable Input<List<AccessReviewHistoryInstanceArgs>> instances;
        private @Nullable Input<Integer> interval;
        private @Nullable Input<Integer> numberOfOccurrences;
        private @Nullable Input<List<AccessReviewScopeArgs>> scopes;
        private @Nullable Input<String> startDate;
        private @Nullable Input<Either<String,AccessReviewRecurrenceRangeType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessReviewHistoryDefinitionByIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.decisions = defaults.decisions;
    	      this.displayName = defaults.displayName;
    	      this.endDate = defaults.endDate;
    	      this.historyDefinitionId = defaults.historyDefinitionId;
    	      this.instances = defaults.instances;
    	      this.interval = defaults.interval;
    	      this.numberOfOccurrences = defaults.numberOfOccurrences;
    	      this.scopes = defaults.scopes;
    	      this.startDate = defaults.startDate;
    	      this.type = defaults.type;
        }

        public Builder setDecisions(@Nullable Input<List<Either<String,AccessReviewResult>>> decisions) {
            this.decisions = decisions;
            return this;
        }

        public Builder setDecisions(@Nullable List<Either<String,AccessReviewResult>> decisions) {
            this.decisions = Input.ofNullable(decisions);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEndDate(@Nullable Input<String> endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setEndDate(@Nullable String endDate) {
            this.endDate = Input.ofNullable(endDate);
            return this;
        }

        public Builder setHistoryDefinitionId(@Nullable Input<String> historyDefinitionId) {
            this.historyDefinitionId = historyDefinitionId;
            return this;
        }

        public Builder setHistoryDefinitionId(@Nullable String historyDefinitionId) {
            this.historyDefinitionId = Input.ofNullable(historyDefinitionId);
            return this;
        }

        public Builder setInstances(@Nullable Input<List<AccessReviewHistoryInstanceArgs>> instances) {
            this.instances = instances;
            return this;
        }

        public Builder setInstances(@Nullable List<AccessReviewHistoryInstanceArgs> instances) {
            this.instances = Input.ofNullable(instances);
            return this;
        }

        public Builder setInterval(@Nullable Input<Integer> interval) {
            this.interval = interval;
            return this;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = Input.ofNullable(interval);
            return this;
        }

        public Builder setNumberOfOccurrences(@Nullable Input<Integer> numberOfOccurrences) {
            this.numberOfOccurrences = numberOfOccurrences;
            return this;
        }

        public Builder setNumberOfOccurrences(@Nullable Integer numberOfOccurrences) {
            this.numberOfOccurrences = Input.ofNullable(numberOfOccurrences);
            return this;
        }

        public Builder setScopes(@Nullable Input<List<AccessReviewScopeArgs>> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder setScopes(@Nullable List<AccessReviewScopeArgs> scopes) {
            this.scopes = Input.ofNullable(scopes);
            return this;
        }

        public Builder setStartDate(@Nullable Input<String> startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setStartDate(@Nullable String startDate) {
            this.startDate = Input.ofNullable(startDate);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,AccessReviewRecurrenceRangeType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,AccessReviewRecurrenceRangeType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public AccessReviewHistoryDefinitionByIdArgs build() {
            return new AccessReviewHistoryDefinitionByIdArgs(decisions, displayName, endDate, historyDefinitionId, instances, interval, numberOfOccurrences, scopes, startDate, type);
        }
    }
}
