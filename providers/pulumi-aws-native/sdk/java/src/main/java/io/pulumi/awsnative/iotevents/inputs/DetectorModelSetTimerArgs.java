// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information needed to set the timer.
 * 
 */
public final class DetectorModelSetTimerArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelSetTimerArgs Empty = new DetectorModelSetTimerArgs();

    /**
     * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables (`$variable.<variable-name>`), and input values (`$input.<input-name>.<path-to-datum>`) as the duration. The range of the duration is `1-31622400` seconds. To ensure accuracy, the minimum duration is `60` seconds. The evaluated result of the duration is rounded down to the nearest whole number.
     * 
     */
    @Import(name="durationExpression")
      private final @Nullable Output<String> durationExpression;

    public Output<String> getDurationExpression() {
        return this.durationExpression == null ? Output.empty() : this.durationExpression;
    }

    /**
     * The number of seconds until the timer expires. The minimum value is `60` seconds to ensure accuracy. The maximum value is `31622400` seconds.
     * 
     */
    @Import(name="seconds")
      private final @Nullable Output<Integer> seconds;

    public Output<Integer> getSeconds() {
        return this.seconds == null ? Output.empty() : this.seconds;
    }

    /**
     * The name of the timer.
     * 
     */
    @Import(name="timerName", required=true)
      private final Output<String> timerName;

    public Output<String> getTimerName() {
        return this.timerName;
    }

    public DetectorModelSetTimerArgs(
        @Nullable Output<String> durationExpression,
        @Nullable Output<Integer> seconds,
        Output<String> timerName) {
        this.durationExpression = durationExpression;
        this.seconds = seconds;
        this.timerName = Objects.requireNonNull(timerName, "expected parameter 'timerName' to be non-null");
    }

    private DetectorModelSetTimerArgs() {
        this.durationExpression = Output.empty();
        this.seconds = Output.empty();
        this.timerName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelSetTimerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> durationExpression;
        private @Nullable Output<Integer> seconds;
        private Output<String> timerName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelSetTimerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationExpression = defaults.durationExpression;
    	      this.seconds = defaults.seconds;
    	      this.timerName = defaults.timerName;
        }

        public Builder durationExpression(@Nullable Output<String> durationExpression) {
            this.durationExpression = durationExpression;
            return this;
        }

        public Builder durationExpression(@Nullable String durationExpression) {
            this.durationExpression = Output.ofNullable(durationExpression);
            return this;
        }

        public Builder seconds(@Nullable Output<Integer> seconds) {
            this.seconds = seconds;
            return this;
        }

        public Builder seconds(@Nullable Integer seconds) {
            this.seconds = Output.ofNullable(seconds);
            return this;
        }

        public Builder timerName(Output<String> timerName) {
            this.timerName = Objects.requireNonNull(timerName);
            return this;
        }

        public Builder timerName(String timerName) {
            this.timerName = Output.of(Objects.requireNonNull(timerName));
            return this;
        }
        public DetectorModelSetTimerArgs build() {
            return new DetectorModelSetTimerArgs(durationExpression, seconds, timerName);
        }
    }
}
