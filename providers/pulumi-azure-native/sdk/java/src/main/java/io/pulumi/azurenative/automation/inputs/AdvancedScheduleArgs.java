// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.inputs.AdvancedScheduleMonthlyOccurrenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of the create Advanced Schedule.
 * 
 */
public final class AdvancedScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdvancedScheduleArgs Empty = new AdvancedScheduleArgs();

    /**
     * Days of the month that the job should execute on. Must be between 1 and 31.
     * 
     */
    @Import(name="monthDays")
      private final @Nullable Output<List<Integer>> monthDays;

    public Output<List<Integer>> getMonthDays() {
        return this.monthDays == null ? Output.empty() : this.monthDays;
    }

    /**
     * Occurrences of days within a month.
     * 
     */
    @Import(name="monthlyOccurrences")
      private final @Nullable Output<List<AdvancedScheduleMonthlyOccurrenceArgs>> monthlyOccurrences;

    public Output<List<AdvancedScheduleMonthlyOccurrenceArgs>> getMonthlyOccurrences() {
        return this.monthlyOccurrences == null ? Output.empty() : this.monthlyOccurrences;
    }

    /**
     * Days of the week that the job should execute on.
     * 
     */
    @Import(name="weekDays")
      private final @Nullable Output<List<String>> weekDays;

    public Output<List<String>> getWeekDays() {
        return this.weekDays == null ? Output.empty() : this.weekDays;
    }

    public AdvancedScheduleArgs(
        @Nullable Output<List<Integer>> monthDays,
        @Nullable Output<List<AdvancedScheduleMonthlyOccurrenceArgs>> monthlyOccurrences,
        @Nullable Output<List<String>> weekDays) {
        this.monthDays = monthDays;
        this.monthlyOccurrences = monthlyOccurrences;
        this.weekDays = weekDays;
    }

    private AdvancedScheduleArgs() {
        this.monthDays = Output.empty();
        this.monthlyOccurrences = Output.empty();
        this.weekDays = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Integer>> monthDays;
        private @Nullable Output<List<AdvancedScheduleMonthlyOccurrenceArgs>> monthlyOccurrences;
        private @Nullable Output<List<String>> weekDays;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monthDays = defaults.monthDays;
    	      this.monthlyOccurrences = defaults.monthlyOccurrences;
    	      this.weekDays = defaults.weekDays;
        }

        public Builder monthDays(@Nullable Output<List<Integer>> monthDays) {
            this.monthDays = monthDays;
            return this;
        }

        public Builder monthDays(@Nullable List<Integer> monthDays) {
            this.monthDays = Output.ofNullable(monthDays);
            return this;
        }

        public Builder monthlyOccurrences(@Nullable Output<List<AdvancedScheduleMonthlyOccurrenceArgs>> monthlyOccurrences) {
            this.monthlyOccurrences = monthlyOccurrences;
            return this;
        }

        public Builder monthlyOccurrences(@Nullable List<AdvancedScheduleMonthlyOccurrenceArgs> monthlyOccurrences) {
            this.monthlyOccurrences = Output.ofNullable(monthlyOccurrences);
            return this;
        }

        public Builder weekDays(@Nullable Output<List<String>> weekDays) {
            this.weekDays = weekDays;
            return this;
        }

        public Builder weekDays(@Nullable List<String> weekDays) {
            this.weekDays = Output.ofNullable(weekDays);
            return this;
        }
        public AdvancedScheduleArgs build() {
            return new AdvancedScheduleArgs(monthDays, monthlyOccurrences, weekDays);
        }
    }
}
