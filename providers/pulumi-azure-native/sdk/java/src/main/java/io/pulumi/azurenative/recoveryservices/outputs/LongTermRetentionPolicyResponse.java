// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.DailyRetentionScheduleResponse;
import io.pulumi.azurenative.recoveryservices.outputs.MonthlyRetentionScheduleResponse;
import io.pulumi.azurenative.recoveryservices.outputs.WeeklyRetentionScheduleResponse;
import io.pulumi.azurenative.recoveryservices.outputs.YearlyRetentionScheduleResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LongTermRetentionPolicyResponse {
    /**
     * Daily retention schedule of the protection policy.
     * 
     */
    private final @Nullable DailyRetentionScheduleResponse dailySchedule;
    /**
     * Monthly retention schedule of the protection policy.
     * 
     */
    private final @Nullable MonthlyRetentionScheduleResponse monthlySchedule;
    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'LongTermRetentionPolicy'.
     * 
     */
    private final String retentionPolicyType;
    /**
     * Weekly retention schedule of the protection policy.
     * 
     */
    private final @Nullable WeeklyRetentionScheduleResponse weeklySchedule;
    /**
     * Yearly retention schedule of the protection policy.
     * 
     */
    private final @Nullable YearlyRetentionScheduleResponse yearlySchedule;

    @CustomType.Constructor
    private LongTermRetentionPolicyResponse(
        @CustomType.Parameter("dailySchedule") @Nullable DailyRetentionScheduleResponse dailySchedule,
        @CustomType.Parameter("monthlySchedule") @Nullable MonthlyRetentionScheduleResponse monthlySchedule,
        @CustomType.Parameter("retentionPolicyType") String retentionPolicyType,
        @CustomType.Parameter("weeklySchedule") @Nullable WeeklyRetentionScheduleResponse weeklySchedule,
        @CustomType.Parameter("yearlySchedule") @Nullable YearlyRetentionScheduleResponse yearlySchedule) {
        this.dailySchedule = dailySchedule;
        this.monthlySchedule = monthlySchedule;
        this.retentionPolicyType = retentionPolicyType;
        this.weeklySchedule = weeklySchedule;
        this.yearlySchedule = yearlySchedule;
    }

    /**
     * Daily retention schedule of the protection policy.
     * 
    */
    public Optional<DailyRetentionScheduleResponse> getDailySchedule() {
        return Optional.ofNullable(this.dailySchedule);
    }
    /**
     * Monthly retention schedule of the protection policy.
     * 
    */
    public Optional<MonthlyRetentionScheduleResponse> getMonthlySchedule() {
        return Optional.ofNullable(this.monthlySchedule);
    }
    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'LongTermRetentionPolicy'.
     * 
    */
    public String getRetentionPolicyType() {
        return this.retentionPolicyType;
    }
    /**
     * Weekly retention schedule of the protection policy.
     * 
    */
    public Optional<WeeklyRetentionScheduleResponse> getWeeklySchedule() {
        return Optional.ofNullable(this.weeklySchedule);
    }
    /**
     * Yearly retention schedule of the protection policy.
     * 
    */
    public Optional<YearlyRetentionScheduleResponse> getYearlySchedule() {
        return Optional.ofNullable(this.yearlySchedule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LongTermRetentionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DailyRetentionScheduleResponse dailySchedule;
        private @Nullable MonthlyRetentionScheduleResponse monthlySchedule;
        private String retentionPolicyType;
        private @Nullable WeeklyRetentionScheduleResponse weeklySchedule;
        private @Nullable YearlyRetentionScheduleResponse yearlySchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(LongTermRetentionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedule = defaults.dailySchedule;
    	      this.monthlySchedule = defaults.monthlySchedule;
    	      this.retentionPolicyType = defaults.retentionPolicyType;
    	      this.weeklySchedule = defaults.weeklySchedule;
    	      this.yearlySchedule = defaults.yearlySchedule;
        }

        public Builder dailySchedule(@Nullable DailyRetentionScheduleResponse dailySchedule) {
            this.dailySchedule = dailySchedule;
            return this;
        }

        public Builder monthlySchedule(@Nullable MonthlyRetentionScheduleResponse monthlySchedule) {
            this.monthlySchedule = monthlySchedule;
            return this;
        }

        public Builder retentionPolicyType(String retentionPolicyType) {
            this.retentionPolicyType = Objects.requireNonNull(retentionPolicyType);
            return this;
        }

        public Builder weeklySchedule(@Nullable WeeklyRetentionScheduleResponse weeklySchedule) {
            this.weeklySchedule = weeklySchedule;
            return this;
        }

        public Builder yearlySchedule(@Nullable YearlyRetentionScheduleResponse yearlySchedule) {
            this.yearlySchedule = yearlySchedule;
            return this;
        }
        public LongTermRetentionPolicyResponse build() {
            return new LongTermRetentionPolicyResponse(dailySchedule, monthlySchedule, retentionPolicyType, weeklySchedule, yearlySchedule);
        }
    }
}
