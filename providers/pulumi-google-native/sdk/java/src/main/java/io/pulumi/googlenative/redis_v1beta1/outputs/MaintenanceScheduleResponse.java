// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.redis_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MaintenanceScheduleResponse {
    /**
     * If the scheduled maintenance can be rescheduled, default is true.
     * 
     */
    private final Boolean canReschedule;
    /**
     * The end time of any upcoming scheduled maintenance for this instance.
     * 
     */
    private final String endTime;
    /**
     * The deadline that the maintenance schedule start time can not go beyond, including reschedule.
     * 
     */
    private final String scheduleDeadlineTime;
    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    private final String startTime;

    @CustomType.Constructor
    private MaintenanceScheduleResponse(
        @CustomType.Parameter("canReschedule") Boolean canReschedule,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("scheduleDeadlineTime") String scheduleDeadlineTime,
        @CustomType.Parameter("startTime") String startTime) {
        this.canReschedule = canReschedule;
        this.endTime = endTime;
        this.scheduleDeadlineTime = scheduleDeadlineTime;
        this.startTime = startTime;
    }

    /**
     * If the scheduled maintenance can be rescheduled, default is true.
     * 
    */
    public Boolean getCanReschedule() {
        return this.canReschedule;
    }
    /**
     * The end time of any upcoming scheduled maintenance for this instance.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * The deadline that the maintenance schedule start time can not go beyond, including reschedule.
     * 
    */
    public String getScheduleDeadlineTime() {
        return this.scheduleDeadlineTime;
    }
    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canReschedule;
        private String endTime;
        private String scheduleDeadlineTime;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canReschedule = defaults.canReschedule;
    	      this.endTime = defaults.endTime;
    	      this.scheduleDeadlineTime = defaults.scheduleDeadlineTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder canReschedule(Boolean canReschedule) {
            this.canReschedule = Objects.requireNonNull(canReschedule);
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder scheduleDeadlineTime(String scheduleDeadlineTime) {
            this.scheduleDeadlineTime = Objects.requireNonNull(scheduleDeadlineTime);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public MaintenanceScheduleResponse build() {
            return new MaintenanceScheduleResponse(canReschedule, endTime, scheduleDeadlineTime, startTime);
        }
    }
}
