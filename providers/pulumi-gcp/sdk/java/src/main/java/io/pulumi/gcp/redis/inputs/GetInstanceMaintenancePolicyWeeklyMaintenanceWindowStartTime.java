// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime Empty = new GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime();

    @Import(name="hours", required=true)
      private final Integer hours;

    public Integer getHours() {
        return this.hours;
    }

    @Import(name="minutes", required=true)
      private final Integer minutes;

    public Integer getMinutes() {
        return this.minutes;
    }

    @Import(name="nanos", required=true)
      private final Integer nanos;

    public Integer getNanos() {
        return this.nanos;
    }

    @Import(name="seconds", required=true)
      private final Integer seconds;

    public Integer getSeconds() {
        return this.seconds;
    }

    public GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime(
        Integer hours,
        Integer minutes,
        Integer nanos,
        Integer seconds) {
        this.hours = Objects.requireNonNull(hours, "expected parameter 'hours' to be non-null");
        this.minutes = Objects.requireNonNull(minutes, "expected parameter 'minutes' to be non-null");
        this.nanos = Objects.requireNonNull(nanos, "expected parameter 'nanos' to be non-null");
        this.seconds = Objects.requireNonNull(seconds, "expected parameter 'seconds' to be non-null");
    }

    private GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime() {
        this.hours = null;
        this.minutes = null;
        this.nanos = null;
        this.seconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer hours;
        private Integer minutes;
        private Integer nanos;
        private Integer seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder hours(Integer hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }

        public Builder minutes(Integer minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }

        public Builder nanos(Integer nanos) {
            this.nanos = Objects.requireNonNull(nanos);
            return this;
        }

        public Builder seconds(Integer seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }
        public GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime build() {
            return new GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime(hours, minutes, nanos, seconds);
        }
    }
}
