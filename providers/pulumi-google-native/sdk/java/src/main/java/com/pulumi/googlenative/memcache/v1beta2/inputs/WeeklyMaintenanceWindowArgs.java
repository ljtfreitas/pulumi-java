// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.memcache.v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.memcache.v1beta2.enums.WeeklyMaintenanceWindowDay;
import com.pulumi.googlenative.memcache.v1beta2.inputs.TimeOfDayArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Time window specified for weekly operations.
 * 
 */
public final class WeeklyMaintenanceWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final WeeklyMaintenanceWindowArgs Empty = new WeeklyMaintenanceWindowArgs();

    /**
     * Allows to define schedule that runs specified day of the week.
     * 
     */
    @Import(name="day", required=true)
    private Output<WeeklyMaintenanceWindowDay> day;

    /**
     * @return Allows to define schedule that runs specified day of the week.
     * 
     */
    public Output<WeeklyMaintenanceWindowDay> day() {
        return this.day;
    }

    /**
     * Duration of the time window.
     * 
     */
    @Import(name="duration", required=true)
    private Output<String> duration;

    /**
     * @return Duration of the time window.
     * 
     */
    public Output<String> duration() {
        return this.duration;
    }

    /**
     * Start time of the window in UTC.
     * 
     */
    @Import(name="startTime", required=true)
    private Output<TimeOfDayArgs> startTime;

    /**
     * @return Start time of the window in UTC.
     * 
     */
    public Output<TimeOfDayArgs> startTime() {
        return this.startTime;
    }

    private WeeklyMaintenanceWindowArgs() {}

    private WeeklyMaintenanceWindowArgs(WeeklyMaintenanceWindowArgs $) {
        this.day = $.day;
        this.duration = $.duration;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WeeklyMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WeeklyMaintenanceWindowArgs $;

        public Builder() {
            $ = new WeeklyMaintenanceWindowArgs();
        }

        public Builder(WeeklyMaintenanceWindowArgs defaults) {
            $ = new WeeklyMaintenanceWindowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param day Allows to define schedule that runs specified day of the week.
         * 
         * @return builder
         * 
         */
        public Builder day(Output<WeeklyMaintenanceWindowDay> day) {
            $.day = day;
            return this;
        }

        /**
         * @param day Allows to define schedule that runs specified day of the week.
         * 
         * @return builder
         * 
         */
        public Builder day(WeeklyMaintenanceWindowDay day) {
            return day(Output.of(day));
        }

        /**
         * @param duration Duration of the time window.
         * 
         * @return builder
         * 
         */
        public Builder duration(Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration Duration of the time window.
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param startTime Start time of the window in UTC.
         * 
         * @return builder
         * 
         */
        public Builder startTime(Output<TimeOfDayArgs> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Start time of the window in UTC.
         * 
         * @return builder
         * 
         */
        public Builder startTime(TimeOfDayArgs startTime) {
            return startTime(Output.of(startTime));
        }

        public WeeklyMaintenanceWindowArgs build() {
            $.day = Objects.requireNonNull($.day, "expected parameter 'day' to be non-null");
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            return $;
        }
    }

}
