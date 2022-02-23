// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Periodic timer event source.
 * 
 */
public final class PeriodicTimerSourceInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final PeriodicTimerSourceInfoArgs Empty = new PeriodicTimerSourceInfoArgs();

    /**
     * Periodic frequency at which timer event needs to be raised. Supports daily, hourly, minutes, and seconds.
     * 
     */
    @InputImport(name="schedule", required=true)
        private final Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule;
    }

    /**
     * The time of the day that results in a valid trigger. Schedule is computed with reference to the time specified upto seconds. If timezone is not specified the time will considered to be in device timezone. The value will always be returned as UTC time.
     * 
     */
    @InputImport(name="startTime", required=true)
        private final Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime;
    }

    /**
     * Topic where periodic events are published to IoT device.
     * 
     */
    @InputImport(name="topic")
        private final @Nullable Input<String> topic;

    public Input<String> getTopic() {
        return this.topic == null ? Input.empty() : this.topic;
    }

    public PeriodicTimerSourceInfoArgs(
        Input<String> schedule,
        Input<String> startTime,
        @Nullable Input<String> topic) {
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.topic = topic;
    }

    private PeriodicTimerSourceInfoArgs() {
        this.schedule = Input.empty();
        this.startTime = Input.empty();
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeriodicTimerSourceInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> schedule;
        private Input<String> startTime;
        private @Nullable Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(PeriodicTimerSourceInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
    	      this.startTime = defaults.startTime;
    	      this.topic = defaults.topic;
        }

        public Builder setSchedule(Input<String> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setSchedule(String schedule) {
            this.schedule = Input.of(Objects.requireNonNull(schedule));
            return this;
        }

        public Builder setStartTime(Input<String> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Input.of(Objects.requireNonNull(startTime));
            return this;
        }

        public Builder setTopic(@Nullable Input<String> topic) {
            this.topic = topic;
            return this;
        }

        public Builder setTopic(@Nullable String topic) {
            this.topic = Input.ofNullable(topic);
            return this;
        }
        public PeriodicTimerSourceInfoArgs build() {
            return new PeriodicTimerSourceInfoArgs(schedule, startTime, topic);
        }
    }
}
