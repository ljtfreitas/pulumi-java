// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.synthetics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CanaryScheduleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CanaryScheduleGetArgs Empty = new CanaryScheduleGetArgs();

    /**
     * Duration in seconds, for the canary to continue making regular runs according to the schedule in the Expression value.
     * 
     */
    @Import(name="durationInSeconds")
      private final @Nullable Output<Integer> durationInSeconds;

    public Output<Integer> getDurationInSeconds() {
        return this.durationInSeconds == null ? Output.empty() : this.durationInSeconds;
    }

    /**
     * Rate expression or cron expression that defines how often the canary is to run. For rate expression, the syntax is `rate(number unit)`. _unit_ can be `minute`, `minutes`, or `hour`. For cron expression, the syntax is `cron(expression)`. For more information about the syntax for cron expressions, see [Scheduling canary runs using cron](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_cron.html).
     * 
     */
    @Import(name="expression", required=true)
      private final Output<String> expression;

    public Output<String> getExpression() {
        return this.expression;
    }

    public CanaryScheduleGetArgs(
        @Nullable Output<Integer> durationInSeconds,
        Output<String> expression) {
        this.durationInSeconds = durationInSeconds;
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
    }

    private CanaryScheduleGetArgs() {
        this.durationInSeconds = Output.empty();
        this.expression = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> durationInSeconds;
        private Output<String> expression;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryScheduleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationInSeconds = defaults.durationInSeconds;
    	      this.expression = defaults.expression;
        }

        public Builder durationInSeconds(@Nullable Output<Integer> durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            return this;
        }

        public Builder durationInSeconds(@Nullable Integer durationInSeconds) {
            this.durationInSeconds = Output.ofNullable(durationInSeconds);
            return this;
        }

        public Builder expression(Output<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder expression(String expression) {
            this.expression = Output.of(Objects.requireNonNull(expression));
            return this;
        }
        public CanaryScheduleGetArgs build() {
            return new CanaryScheduleGetArgs(durationInSeconds, expression);
        }
    }
}
