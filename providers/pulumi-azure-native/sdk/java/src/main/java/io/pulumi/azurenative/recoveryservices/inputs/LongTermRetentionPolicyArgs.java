// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.DailyRetentionScheduleArgs;
import io.pulumi.azurenative.recoveryservices.inputs.MonthlyRetentionScheduleArgs;
import io.pulumi.azurenative.recoveryservices.inputs.WeeklyRetentionScheduleArgs;
import io.pulumi.azurenative.recoveryservices.inputs.YearlyRetentionScheduleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Long term retention policy.
 * 
 */
public final class LongTermRetentionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final LongTermRetentionPolicyArgs Empty = new LongTermRetentionPolicyArgs();

    /**
     * Daily retention schedule of the protection policy.
     * 
     */
    @InputImport(name="dailySchedule")
        private final @Nullable Input<DailyRetentionScheduleArgs> dailySchedule;

    public Input<DailyRetentionScheduleArgs> getDailySchedule() {
        return this.dailySchedule == null ? Input.empty() : this.dailySchedule;
    }

    /**
     * Monthly retention schedule of the protection policy.
     * 
     */
    @InputImport(name="monthlySchedule")
        private final @Nullable Input<MonthlyRetentionScheduleArgs> monthlySchedule;

    public Input<MonthlyRetentionScheduleArgs> getMonthlySchedule() {
        return this.monthlySchedule == null ? Input.empty() : this.monthlySchedule;
    }

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'LongTermRetentionPolicy'.
     * 
     */
    @InputImport(name="retentionPolicyType", required=true)
        private final Input<String> retentionPolicyType;

    public Input<String> getRetentionPolicyType() {
        return this.retentionPolicyType;
    }

    /**
     * Weekly retention schedule of the protection policy.
     * 
     */
    @InputImport(name="weeklySchedule")
        private final @Nullable Input<WeeklyRetentionScheduleArgs> weeklySchedule;

    public Input<WeeklyRetentionScheduleArgs> getWeeklySchedule() {
        return this.weeklySchedule == null ? Input.empty() : this.weeklySchedule;
    }

    /**
     * Yearly retention schedule of the protection policy.
     * 
     */
    @InputImport(name="yearlySchedule")
        private final @Nullable Input<YearlyRetentionScheduleArgs> yearlySchedule;

    public Input<YearlyRetentionScheduleArgs> getYearlySchedule() {
        return this.yearlySchedule == null ? Input.empty() : this.yearlySchedule;
    }

    public LongTermRetentionPolicyArgs(
        @Nullable Input<DailyRetentionScheduleArgs> dailySchedule,
        @Nullable Input<MonthlyRetentionScheduleArgs> monthlySchedule,
        Input<String> retentionPolicyType,
        @Nullable Input<WeeklyRetentionScheduleArgs> weeklySchedule,
        @Nullable Input<YearlyRetentionScheduleArgs> yearlySchedule) {
        this.dailySchedule = dailySchedule;
        this.monthlySchedule = monthlySchedule;
        this.retentionPolicyType = Objects.requireNonNull(retentionPolicyType, "expected parameter 'retentionPolicyType' to be non-null");
        this.weeklySchedule = weeklySchedule;
        this.yearlySchedule = yearlySchedule;
    }

    private LongTermRetentionPolicyArgs() {
        this.dailySchedule = Input.empty();
        this.monthlySchedule = Input.empty();
        this.retentionPolicyType = Input.empty();
        this.weeklySchedule = Input.empty();
        this.yearlySchedule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LongTermRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DailyRetentionScheduleArgs> dailySchedule;
        private @Nullable Input<MonthlyRetentionScheduleArgs> monthlySchedule;
        private Input<String> retentionPolicyType;
        private @Nullable Input<WeeklyRetentionScheduleArgs> weeklySchedule;
        private @Nullable Input<YearlyRetentionScheduleArgs> yearlySchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(LongTermRetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedule = defaults.dailySchedule;
    	      this.monthlySchedule = defaults.monthlySchedule;
    	      this.retentionPolicyType = defaults.retentionPolicyType;
    	      this.weeklySchedule = defaults.weeklySchedule;
    	      this.yearlySchedule = defaults.yearlySchedule;
        }

        public Builder setDailySchedule(@Nullable Input<DailyRetentionScheduleArgs> dailySchedule) {
            this.dailySchedule = dailySchedule;
            return this;
        }

        public Builder setDailySchedule(@Nullable DailyRetentionScheduleArgs dailySchedule) {
            this.dailySchedule = Input.ofNullable(dailySchedule);
            return this;
        }

        public Builder setMonthlySchedule(@Nullable Input<MonthlyRetentionScheduleArgs> monthlySchedule) {
            this.monthlySchedule = monthlySchedule;
            return this;
        }

        public Builder setMonthlySchedule(@Nullable MonthlyRetentionScheduleArgs monthlySchedule) {
            this.monthlySchedule = Input.ofNullable(monthlySchedule);
            return this;
        }

        public Builder setRetentionPolicyType(Input<String> retentionPolicyType) {
            this.retentionPolicyType = Objects.requireNonNull(retentionPolicyType);
            return this;
        }

        public Builder setRetentionPolicyType(String retentionPolicyType) {
            this.retentionPolicyType = Input.of(Objects.requireNonNull(retentionPolicyType));
            return this;
        }

        public Builder setWeeklySchedule(@Nullable Input<WeeklyRetentionScheduleArgs> weeklySchedule) {
            this.weeklySchedule = weeklySchedule;
            return this;
        }

        public Builder setWeeklySchedule(@Nullable WeeklyRetentionScheduleArgs weeklySchedule) {
            this.weeklySchedule = Input.ofNullable(weeklySchedule);
            return this;
        }

        public Builder setYearlySchedule(@Nullable Input<YearlyRetentionScheduleArgs> yearlySchedule) {
            this.yearlySchedule = yearlySchedule;
            return this;
        }

        public Builder setYearlySchedule(@Nullable YearlyRetentionScheduleArgs yearlySchedule) {
            this.yearlySchedule = Input.ofNullable(yearlySchedule);
            return this;
        }
        public LongTermRetentionPolicyArgs build() {
            return new LongTermRetentionPolicyArgs(dailySchedule, monthlySchedule, retentionPolicyType, weeklySchedule, yearlySchedule);
        }
    }
}
