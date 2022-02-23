// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class WeeklyRetentionFormatResponse {
    /**
     * List of days of the week.
     * 
     */
    private final @Nullable List<String> daysOfTheWeek;
    /**
     * List of weeks of month.
     * 
     */
    private final @Nullable List<String> weeksOfTheMonth;

    @OutputCustomType.Constructor({"daysOfTheWeek","weeksOfTheMonth"})
    private WeeklyRetentionFormatResponse(
        @Nullable List<String> daysOfTheWeek,
        @Nullable List<String> weeksOfTheMonth) {
        this.daysOfTheWeek = daysOfTheWeek;
        this.weeksOfTheMonth = weeksOfTheMonth;
    }

    /**
     * List of days of the week.
     * 
     */
    public List<String> getDaysOfTheWeek() {
        return this.daysOfTheWeek == null ? List.of() : this.daysOfTheWeek;
    }
    /**
     * List of weeks of month.
     * 
     */
    public List<String> getWeeksOfTheMonth() {
        return this.weeksOfTheMonth == null ? List.of() : this.weeksOfTheMonth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeeklyRetentionFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> daysOfTheWeek;
        private @Nullable List<String> weeksOfTheMonth;

        public Builder() {
    	      // Empty
        }

        public Builder(WeeklyRetentionFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysOfTheWeek = defaults.daysOfTheWeek;
    	      this.weeksOfTheMonth = defaults.weeksOfTheMonth;
        }

        public Builder setDaysOfTheWeek(@Nullable List<String> daysOfTheWeek) {
            this.daysOfTheWeek = daysOfTheWeek;
            return this;
        }

        public Builder setWeeksOfTheMonth(@Nullable List<String> weeksOfTheMonth) {
            this.weeksOfTheMonth = weeksOfTheMonth;
            return this;
        }
        public WeeklyRetentionFormatResponse build() {
            return new WeeklyRetentionFormatResponse(daysOfTheWeek, weeksOfTheMonth);
        }
    }
}
