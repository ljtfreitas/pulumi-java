// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BrokerMaintenanceWindowStartTime {
    /**
     * Day of the week, e.g., `MONDAY`, `TUESDAY`, or `WEDNESDAY`.
     * 
     */
    private final String dayOfWeek;
    /**
     * Time, in 24-hour format, e.g., `02:00`.
     * 
     */
    private final String timeOfDay;
    /**
     * Time zone in either the Country/City format or the UTC offset format, e.g., `CET`.
     * 
     */
    private final String timeZone;

    @OutputCustomType.Constructor({"dayOfWeek","timeOfDay","timeZone"})
    private BrokerMaintenanceWindowStartTime(
        String dayOfWeek,
        String timeOfDay,
        String timeZone) {
        this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
        this.timeOfDay = Objects.requireNonNull(timeOfDay);
        this.timeZone = Objects.requireNonNull(timeZone);
    }

    /**
     * Day of the week, e.g., `MONDAY`, `TUESDAY`, or `WEDNESDAY`.
     * 
     */
    public String getDayOfWeek() {
        return this.dayOfWeek;
    }
    /**
     * Time, in 24-hour format, e.g., `02:00`.
     * 
     */
    public String getTimeOfDay() {
        return this.timeOfDay;
    }
    /**
     * Time zone in either the Country/City format or the UTC offset format, e.g., `CET`.
     * 
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrokerMaintenanceWindowStartTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dayOfWeek;
        private String timeOfDay;
        private String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(BrokerMaintenanceWindowStartTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.timeOfDay = defaults.timeOfDay;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setDayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }

        public Builder setTimeOfDay(String timeOfDay) {
            this.timeOfDay = Objects.requireNonNull(timeOfDay);
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public BrokerMaintenanceWindowStartTime build() {
            return new BrokerMaintenanceWindowStartTime(dayOfWeek, timeOfDay, timeZone);
        }
    }
}
