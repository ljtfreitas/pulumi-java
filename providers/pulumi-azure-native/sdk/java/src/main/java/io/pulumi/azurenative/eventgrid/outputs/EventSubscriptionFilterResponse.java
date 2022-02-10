// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.azurenative.eventgrid.outputs.BoolEqualsAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.outputs.NumberGreaterThanAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.outputs.NumberGreaterThanOrEqualsAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.outputs.NumberInAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.outputs.NumberLessThanAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.outputs.NumberLessThanOrEqualsAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.outputs.NumberNotInAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.outputs.StringBeginsWithAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.outputs.StringContainsAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.outputs.StringEndsWithAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.outputs.StringInAdvancedFilterResponse;
import io.pulumi.azurenative.eventgrid.outputs.StringNotInAdvancedFilterResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventSubscriptionFilterResponse {
    private final @Nullable List<Object> advancedFilters;
    private final @Nullable List<String> includedEventTypes;
    private final @Nullable Boolean isSubjectCaseSensitive;
    private final @Nullable String subjectBeginsWith;
    private final @Nullable String subjectEndsWith;

    @OutputCustomType.Constructor({"advancedFilters","includedEventTypes","isSubjectCaseSensitive","subjectBeginsWith","subjectEndsWith"})
    private EventSubscriptionFilterResponse(
        @Nullable List<Object> advancedFilters,
        @Nullable List<String> includedEventTypes,
        @Nullable Boolean isSubjectCaseSensitive,
        @Nullable String subjectBeginsWith,
        @Nullable String subjectEndsWith) {
        this.advancedFilters = advancedFilters;
        this.includedEventTypes = includedEventTypes;
        this.isSubjectCaseSensitive = isSubjectCaseSensitive;
        this.subjectBeginsWith = subjectBeginsWith;
        this.subjectEndsWith = subjectEndsWith;
    }

    public List<Object> getAdvancedFilters() {
        return this.advancedFilters == null ? List.of() : this.advancedFilters;
    }
    public List<String> getIncludedEventTypes() {
        return this.includedEventTypes == null ? List.of() : this.includedEventTypes;
    }
    public Optional<Boolean> getIsSubjectCaseSensitive() {
        return Optional.ofNullable(this.isSubjectCaseSensitive);
    }
    public Optional<String> getSubjectBeginsWith() {
        return Optional.ofNullable(this.subjectBeginsWith);
    }
    public Optional<String> getSubjectEndsWith() {
        return Optional.ofNullable(this.subjectEndsWith);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSubscriptionFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> advancedFilters;
        private @Nullable List<String> includedEventTypes;
        private @Nullable Boolean isSubjectCaseSensitive;
        private @Nullable String subjectBeginsWith;
        private @Nullable String subjectEndsWith;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSubscriptionFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedFilters = defaults.advancedFilters;
    	      this.includedEventTypes = defaults.includedEventTypes;
    	      this.isSubjectCaseSensitive = defaults.isSubjectCaseSensitive;
    	      this.subjectBeginsWith = defaults.subjectBeginsWith;
    	      this.subjectEndsWith = defaults.subjectEndsWith;
        }

        public Builder setAdvancedFilters(@Nullable List<Object> advancedFilters) {
            this.advancedFilters = advancedFilters;
            return this;
        }

        public Builder setIncludedEventTypes(@Nullable List<String> includedEventTypes) {
            this.includedEventTypes = includedEventTypes;
            return this;
        }

        public Builder setIsSubjectCaseSensitive(@Nullable Boolean isSubjectCaseSensitive) {
            this.isSubjectCaseSensitive = isSubjectCaseSensitive;
            return this;
        }

        public Builder setSubjectBeginsWith(@Nullable String subjectBeginsWith) {
            this.subjectBeginsWith = subjectBeginsWith;
            return this;
        }

        public Builder setSubjectEndsWith(@Nullable String subjectEndsWith) {
            this.subjectEndsWith = subjectEndsWith;
            return this;
        }

        public EventSubscriptionFilterResponse build() {
            return new EventSubscriptionFilterResponse(advancedFilters, includedEventTypes, isSubjectCaseSensitive, subjectBeginsWith, subjectEndsWith);
        }
    }
}