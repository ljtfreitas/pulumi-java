// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Scan schedule configuration.
 * 
 */
public final class ScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScheduleResponse Empty = new ScheduleResponse();

    /**
     * The duration of time between executions in days.
     * 
     */
    @Import(name="intervalDurationDays", required=true)
      private final Integer intervalDurationDays;

    public Integer getIntervalDurationDays() {
        return this.intervalDurationDays;
    }

    /**
     * A timestamp indicates when the next run will be scheduled. The value is refreshed by the server after each run. If unspecified, it will default to current server time, which means the scan will be scheduled to start immediately.
     * 
     */
    @Import(name="scheduleTime", required=true)
      private final String scheduleTime;

    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public ScheduleResponse(
        Integer intervalDurationDays,
        String scheduleTime) {
        this.intervalDurationDays = Objects.requireNonNull(intervalDurationDays, "expected parameter 'intervalDurationDays' to be non-null");
        this.scheduleTime = Objects.requireNonNull(scheduleTime, "expected parameter 'scheduleTime' to be non-null");
    }

    private ScheduleResponse() {
        this.intervalDurationDays = null;
        this.scheduleTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer intervalDurationDays;
        private String scheduleTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalDurationDays = defaults.intervalDurationDays;
    	      this.scheduleTime = defaults.scheduleTime;
        }

        public Builder intervalDurationDays(Integer intervalDurationDays) {
            this.intervalDurationDays = Objects.requireNonNull(intervalDurationDays);
            return this;
        }

        public Builder scheduleTime(String scheduleTime) {
            this.scheduleTime = Objects.requireNonNull(scheduleTime);
            return this;
        }
        public ScheduleResponse build() {
            return new ScheduleResponse(intervalDurationDays, scheduleTime);
        }
    }
}
