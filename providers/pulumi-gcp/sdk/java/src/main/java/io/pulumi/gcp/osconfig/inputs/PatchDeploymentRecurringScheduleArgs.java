// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleMonthlyArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleTimeOfDayArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleTimeZoneArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleWeeklyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentRecurringScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentRecurringScheduleArgs Empty = new PatchDeploymentRecurringScheduleArgs();

    /**
     * The end time at which a recurring patch deployment schedule is no longer active.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> getEndTime() {
        return this.endTime == null ? Output.empty() : this.endTime;
    }

    /**
     * - 
     * The time the last patch job ran successfully.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Import(name="lastExecuteTime")
      private final @Nullable Output<String> lastExecuteTime;

    public Output<String> getLastExecuteTime() {
        return this.lastExecuteTime == null ? Output.empty() : this.lastExecuteTime;
    }

    /**
     * Schedule with monthly executions.
     * Structure is documented below.
     * 
     */
    @Import(name="monthly")
      private final @Nullable Output<PatchDeploymentRecurringScheduleMonthlyArgs> monthly;

    public Output<PatchDeploymentRecurringScheduleMonthlyArgs> getMonthly() {
        return this.monthly == null ? Output.empty() : this.monthly;
    }

    /**
     * - 
     * The time the next patch job is scheduled to run.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Import(name="nextExecuteTime")
      private final @Nullable Output<String> nextExecuteTime;

    public Output<String> getNextExecuteTime() {
        return this.nextExecuteTime == null ? Output.empty() : this.nextExecuteTime;
    }

    /**
     * The time that the recurring schedule becomes effective. Defaults to createTime of the patch deployment.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    /**
     * Time of the day to run a recurring deployment.
     * Structure is documented below.
     * 
     */
    @Import(name="timeOfDay", required=true)
      private final Output<PatchDeploymentRecurringScheduleTimeOfDayArgs> timeOfDay;

    public Output<PatchDeploymentRecurringScheduleTimeOfDayArgs> getTimeOfDay() {
        return this.timeOfDay;
    }

    /**
     * Defines the time zone that timeOfDay is relative to. The rules for daylight saving time are
     * determined by the chosen time zone.
     * Structure is documented below.
     * 
     */
    @Import(name="timeZone", required=true)
      private final Output<PatchDeploymentRecurringScheduleTimeZoneArgs> timeZone;

    public Output<PatchDeploymentRecurringScheduleTimeZoneArgs> getTimeZone() {
        return this.timeZone;
    }

    /**
     * Schedule with weekly executions.
     * Structure is documented below.
     * 
     */
    @Import(name="weekly")
      private final @Nullable Output<PatchDeploymentRecurringScheduleWeeklyArgs> weekly;

    public Output<PatchDeploymentRecurringScheduleWeeklyArgs> getWeekly() {
        return this.weekly == null ? Output.empty() : this.weekly;
    }

    public PatchDeploymentRecurringScheduleArgs(
        @Nullable Output<String> endTime,
        @Nullable Output<String> lastExecuteTime,
        @Nullable Output<PatchDeploymentRecurringScheduleMonthlyArgs> monthly,
        @Nullable Output<String> nextExecuteTime,
        @Nullable Output<String> startTime,
        Output<PatchDeploymentRecurringScheduleTimeOfDayArgs> timeOfDay,
        Output<PatchDeploymentRecurringScheduleTimeZoneArgs> timeZone,
        @Nullable Output<PatchDeploymentRecurringScheduleWeeklyArgs> weekly) {
        this.endTime = endTime;
        this.lastExecuteTime = lastExecuteTime;
        this.monthly = monthly;
        this.nextExecuteTime = nextExecuteTime;
        this.startTime = startTime;
        this.timeOfDay = Objects.requireNonNull(timeOfDay, "expected parameter 'timeOfDay' to be non-null");
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
        this.weekly = weekly;
    }

    private PatchDeploymentRecurringScheduleArgs() {
        this.endTime = Output.empty();
        this.lastExecuteTime = Output.empty();
        this.monthly = Output.empty();
        this.nextExecuteTime = Output.empty();
        this.startTime = Output.empty();
        this.timeOfDay = Output.empty();
        this.timeZone = Output.empty();
        this.weekly = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRecurringScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endTime;
        private @Nullable Output<String> lastExecuteTime;
        private @Nullable Output<PatchDeploymentRecurringScheduleMonthlyArgs> monthly;
        private @Nullable Output<String> nextExecuteTime;
        private @Nullable Output<String> startTime;
        private Output<PatchDeploymentRecurringScheduleTimeOfDayArgs> timeOfDay;
        private Output<PatchDeploymentRecurringScheduleTimeZoneArgs> timeZone;
        private @Nullable Output<PatchDeploymentRecurringScheduleWeeklyArgs> weekly;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentRecurringScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.lastExecuteTime = defaults.lastExecuteTime;
    	      this.monthly = defaults.monthly;
    	      this.nextExecuteTime = defaults.nextExecuteTime;
    	      this.startTime = defaults.startTime;
    	      this.timeOfDay = defaults.timeOfDay;
    	      this.timeZone = defaults.timeZone;
    	      this.weekly = defaults.weekly;
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder endTime(@Nullable String endTime) {
            this.endTime = Output.ofNullable(endTime);
            return this;
        }

        public Builder lastExecuteTime(@Nullable Output<String> lastExecuteTime) {
            this.lastExecuteTime = lastExecuteTime;
            return this;
        }

        public Builder lastExecuteTime(@Nullable String lastExecuteTime) {
            this.lastExecuteTime = Output.ofNullable(lastExecuteTime);
            return this;
        }

        public Builder monthly(@Nullable Output<PatchDeploymentRecurringScheduleMonthlyArgs> monthly) {
            this.monthly = monthly;
            return this;
        }

        public Builder monthly(@Nullable PatchDeploymentRecurringScheduleMonthlyArgs monthly) {
            this.monthly = Output.ofNullable(monthly);
            return this;
        }

        public Builder nextExecuteTime(@Nullable Output<String> nextExecuteTime) {
            this.nextExecuteTime = nextExecuteTime;
            return this;
        }

        public Builder nextExecuteTime(@Nullable String nextExecuteTime) {
            this.nextExecuteTime = Output.ofNullable(nextExecuteTime);
            return this;
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }

        public Builder timeOfDay(Output<PatchDeploymentRecurringScheduleTimeOfDayArgs> timeOfDay) {
            this.timeOfDay = Objects.requireNonNull(timeOfDay);
            return this;
        }

        public Builder timeOfDay(PatchDeploymentRecurringScheduleTimeOfDayArgs timeOfDay) {
            this.timeOfDay = Output.of(Objects.requireNonNull(timeOfDay));
            return this;
        }

        public Builder timeZone(Output<PatchDeploymentRecurringScheduleTimeZoneArgs> timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder timeZone(PatchDeploymentRecurringScheduleTimeZoneArgs timeZone) {
            this.timeZone = Output.of(Objects.requireNonNull(timeZone));
            return this;
        }

        public Builder weekly(@Nullable Output<PatchDeploymentRecurringScheduleWeeklyArgs> weekly) {
            this.weekly = weekly;
            return this;
        }

        public Builder weekly(@Nullable PatchDeploymentRecurringScheduleWeeklyArgs weekly) {
            this.weekly = Output.ofNullable(weekly);
            return this;
        }
        public PatchDeploymentRecurringScheduleArgs build() {
            return new PatchDeploymentRecurringScheduleArgs(endTime, lastExecuteTime, monthly, nextExecuteTime, startTime, timeOfDay, timeZone, weekly);
        }
    }
}
