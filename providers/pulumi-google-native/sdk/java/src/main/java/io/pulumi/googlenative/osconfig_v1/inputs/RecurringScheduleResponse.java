// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1.inputs.MonthlyScheduleResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.TimeOfDayResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.TimeZoneResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.WeeklyScheduleResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Sets the time for recurring patch deployments.
 * 
 */
public final class RecurringScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final RecurringScheduleResponse Empty = new RecurringScheduleResponse();

    /**
     * Optional. The end time at which a recurring patch deployment schedule is no longer active.
     * 
     */
    @InputImport(name="endTime", required=true)
      private final String endTime;

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * The frequency unit of this recurring schedule.
     * 
     */
    @InputImport(name="frequency", required=true)
      private final String frequency;

    public String getFrequency() {
        return this.frequency;
    }

    /**
     * The time the last patch job ran successfully.
     * 
     */
    @InputImport(name="lastExecuteTime", required=true)
      private final String lastExecuteTime;

    public String getLastExecuteTime() {
        return this.lastExecuteTime;
    }

    /**
     * Schedule with monthly executions.
     * 
     */
    @InputImport(name="monthly", required=true)
      private final MonthlyScheduleResponse monthly;

    public MonthlyScheduleResponse getMonthly() {
        return this.monthly;
    }

    /**
     * The time the next patch job is scheduled to run.
     * 
     */
    @InputImport(name="nextExecuteTime", required=true)
      private final String nextExecuteTime;

    public String getNextExecuteTime() {
        return this.nextExecuteTime;
    }

    /**
     * Optional. The time that the recurring schedule becomes effective. Defaults to `create_time` of the patch deployment.
     * 
     */
    @InputImport(name="startTime", required=true)
      private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * Time of the day to run a recurring deployment.
     * 
     */
    @InputImport(name="timeOfDay", required=true)
      private final TimeOfDayResponse timeOfDay;

    public TimeOfDayResponse getTimeOfDay() {
        return this.timeOfDay;
    }

    /**
     * Defines the time zone that `time_of_day` is relative to. The rules for daylight saving time are determined by the chosen time zone.
     * 
     */
    @InputImport(name="timeZone", required=true)
      private final TimeZoneResponse timeZone;

    public TimeZoneResponse getTimeZone() {
        return this.timeZone;
    }

    /**
     * Schedule with weekly executions.
     * 
     */
    @InputImport(name="weekly", required=true)
      private final WeeklyScheduleResponse weekly;

    public WeeklyScheduleResponse getWeekly() {
        return this.weekly;
    }

    public RecurringScheduleResponse(
        String endTime,
        String frequency,
        String lastExecuteTime,
        MonthlyScheduleResponse monthly,
        String nextExecuteTime,
        String startTime,
        TimeOfDayResponse timeOfDay,
        TimeZoneResponse timeZone,
        WeeklyScheduleResponse weekly) {
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.frequency = Objects.requireNonNull(frequency, "expected parameter 'frequency' to be non-null");
        this.lastExecuteTime = Objects.requireNonNull(lastExecuteTime, "expected parameter 'lastExecuteTime' to be non-null");
        this.monthly = Objects.requireNonNull(monthly, "expected parameter 'monthly' to be non-null");
        this.nextExecuteTime = Objects.requireNonNull(nextExecuteTime, "expected parameter 'nextExecuteTime' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.timeOfDay = Objects.requireNonNull(timeOfDay, "expected parameter 'timeOfDay' to be non-null");
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
        this.weekly = Objects.requireNonNull(weekly, "expected parameter 'weekly' to be non-null");
    }

    private RecurringScheduleResponse() {
        this.endTime = null;
        this.frequency = null;
        this.lastExecuteTime = null;
        this.monthly = null;
        this.nextExecuteTime = null;
        this.startTime = null;
        this.timeOfDay = null;
        this.timeZone = null;
        this.weekly = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurringScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private String frequency;
        private String lastExecuteTime;
        private MonthlyScheduleResponse monthly;
        private String nextExecuteTime;
        private String startTime;
        private TimeOfDayResponse timeOfDay;
        private TimeZoneResponse timeZone;
        private WeeklyScheduleResponse weekly;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurringScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.frequency = defaults.frequency;
    	      this.lastExecuteTime = defaults.lastExecuteTime;
    	      this.monthly = defaults.monthly;
    	      this.nextExecuteTime = defaults.nextExecuteTime;
    	      this.startTime = defaults.startTime;
    	      this.timeOfDay = defaults.timeOfDay;
    	      this.timeZone = defaults.timeZone;
    	      this.weekly = defaults.weekly;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setFrequency(String frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }

        public Builder setLastExecuteTime(String lastExecuteTime) {
            this.lastExecuteTime = Objects.requireNonNull(lastExecuteTime);
            return this;
        }

        public Builder setMonthly(MonthlyScheduleResponse monthly) {
            this.monthly = Objects.requireNonNull(monthly);
            return this;
        }

        public Builder setNextExecuteTime(String nextExecuteTime) {
            this.nextExecuteTime = Objects.requireNonNull(nextExecuteTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setTimeOfDay(TimeOfDayResponse timeOfDay) {
            this.timeOfDay = Objects.requireNonNull(timeOfDay);
            return this;
        }

        public Builder setTimeZone(TimeZoneResponse timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder setWeekly(WeeklyScheduleResponse weekly) {
            this.weekly = Objects.requireNonNull(weekly);
            return this;
        }
        public RecurringScheduleResponse build() {
            return new RecurringScheduleResponse(endTime, frequency, lastExecuteTime, monthly, nextExecuteTime, startTime, timeOfDay, timeZone, weekly);
        }
    }
}
