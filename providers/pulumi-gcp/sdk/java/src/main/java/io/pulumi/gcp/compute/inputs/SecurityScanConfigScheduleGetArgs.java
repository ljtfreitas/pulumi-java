// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityScanConfigScheduleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityScanConfigScheduleGetArgs Empty = new SecurityScanConfigScheduleGetArgs();

    /**
     * The duration of time between executions in days
     * 
     */
    @Import(name="intervalDurationDays", required=true)
      private final Output<Integer> intervalDurationDays;

    public Output<Integer> getIntervalDurationDays() {
        return this.intervalDurationDays;
    }

    /**
     * A timestamp indicates when the next run will be scheduled. The value is refreshed
     * by the server after each run. If unspecified, it will default to current server time,
     * which means the scan will be scheduled to start immediately.
     * 
     */
    @Import(name="scheduleTime")
      private final @Nullable Output<String> scheduleTime;

    public Output<String> getScheduleTime() {
        return this.scheduleTime == null ? Output.empty() : this.scheduleTime;
    }

    public SecurityScanConfigScheduleGetArgs(
        Output<Integer> intervalDurationDays,
        @Nullable Output<String> scheduleTime) {
        this.intervalDurationDays = Objects.requireNonNull(intervalDurationDays, "expected parameter 'intervalDurationDays' to be non-null");
        this.scheduleTime = scheduleTime;
    }

    private SecurityScanConfigScheduleGetArgs() {
        this.intervalDurationDays = Output.empty();
        this.scheduleTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityScanConfigScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> intervalDurationDays;
        private @Nullable Output<String> scheduleTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityScanConfigScheduleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalDurationDays = defaults.intervalDurationDays;
    	      this.scheduleTime = defaults.scheduleTime;
        }

        public Builder intervalDurationDays(Output<Integer> intervalDurationDays) {
            this.intervalDurationDays = Objects.requireNonNull(intervalDurationDays);
            return this;
        }

        public Builder intervalDurationDays(Integer intervalDurationDays) {
            this.intervalDurationDays = Output.of(Objects.requireNonNull(intervalDurationDays));
            return this;
        }

        public Builder scheduleTime(@Nullable Output<String> scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }

        public Builder scheduleTime(@Nullable String scheduleTime) {
            this.scheduleTime = Output.ofNullable(scheduleTime);
            return this;
        }
        public SecurityScanConfigScheduleGetArgs build() {
            return new SecurityScanConfigScheduleGetArgs(intervalDurationDays, scheduleTime);
        }
    }
}
