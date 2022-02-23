// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterScalingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterScalingConfigurationArgs Empty = new ClusterScalingConfigurationArgs();

    /**
     * Whether to enable automatic pause. A DB cluster can be paused only when it's idle (it has no connections). If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this case, the DB cluster is restored when there is a request to connect to it. Defaults to `true`.
     * 
     */
    @InputImport(name="autoPause")
    private final @Nullable Input<Boolean> autoPause;

    public Input<Boolean> getAutoPause() {
        return this.autoPause == null ? Input.empty() : this.autoPause;
    }

    /**
     * The maximum capacity for an Aurora DB cluster in `serverless` DB engine mode. The maximum capacity must be greater than or equal to the minimum capacity. Valid Aurora MySQL capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`. Valid Aurora PostgreSQL capacity values are (`2`, `4`, `8`, `16`, `32`, `64`, `192`, and `384`). Defaults to `16`.
     * 
     */
    @InputImport(name="maxCapacity")
    private final @Nullable Input<Integer> maxCapacity;

    public Input<Integer> getMaxCapacity() {
        return this.maxCapacity == null ? Input.empty() : this.maxCapacity;
    }

    /**
     * The minimum capacity for an Aurora DB cluster in `serverless` DB engine mode. The minimum capacity must be lesser than or equal to the maximum capacity. Valid Aurora MySQL capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`. Valid Aurora PostgreSQL capacity values are (`2`, `4`, `8`, `16`, `32`, `64`, `192`, and `384`). Defaults to `1`.
     * 
     */
    @InputImport(name="minCapacity")
    private final @Nullable Input<Integer> minCapacity;

    public Input<Integer> getMinCapacity() {
        return this.minCapacity == null ? Input.empty() : this.minCapacity;
    }

    /**
     * The time, in seconds, before an Aurora DB cluster in serverless mode is paused. Valid values are `300` through `86400`. Defaults to `300`.
     * 
     */
    @InputImport(name="secondsUntilAutoPause")
    private final @Nullable Input<Integer> secondsUntilAutoPause;

    public Input<Integer> getSecondsUntilAutoPause() {
        return this.secondsUntilAutoPause == null ? Input.empty() : this.secondsUntilAutoPause;
    }

    /**
     * The action to take when the timeout is reached. Valid values: `ForceApplyCapacityChange`, `RollbackCapacityChange`. Defaults to `RollbackCapacityChange`. See [documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.timeout-action).
     * 
     */
    @InputImport(name="timeoutAction")
    private final @Nullable Input<String> timeoutAction;

    public Input<String> getTimeoutAction() {
        return this.timeoutAction == null ? Input.empty() : this.timeoutAction;
    }

    public ClusterScalingConfigurationArgs(
        @Nullable Input<Boolean> autoPause,
        @Nullable Input<Integer> maxCapacity,
        @Nullable Input<Integer> minCapacity,
        @Nullable Input<Integer> secondsUntilAutoPause,
        @Nullable Input<String> timeoutAction) {
        this.autoPause = autoPause;
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
        this.secondsUntilAutoPause = secondsUntilAutoPause;
        this.timeoutAction = timeoutAction;
    }

    private ClusterScalingConfigurationArgs() {
        this.autoPause = Input.empty();
        this.maxCapacity = Input.empty();
        this.minCapacity = Input.empty();
        this.secondsUntilAutoPause = Input.empty();
        this.timeoutAction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterScalingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoPause;
        private @Nullable Input<Integer> maxCapacity;
        private @Nullable Input<Integer> minCapacity;
        private @Nullable Input<Integer> secondsUntilAutoPause;
        private @Nullable Input<String> timeoutAction;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterScalingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoPause = defaults.autoPause;
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
    	      this.secondsUntilAutoPause = defaults.secondsUntilAutoPause;
    	      this.timeoutAction = defaults.timeoutAction;
        }

        public Builder setAutoPause(@Nullable Input<Boolean> autoPause) {
            this.autoPause = autoPause;
            return this;
        }

        public Builder setAutoPause(@Nullable Boolean autoPause) {
            this.autoPause = Input.ofNullable(autoPause);
            return this;
        }

        public Builder setMaxCapacity(@Nullable Input<Integer> maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        public Builder setMaxCapacity(@Nullable Integer maxCapacity) {
            this.maxCapacity = Input.ofNullable(maxCapacity);
            return this;
        }

        public Builder setMinCapacity(@Nullable Input<Integer> minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }

        public Builder setMinCapacity(@Nullable Integer minCapacity) {
            this.minCapacity = Input.ofNullable(minCapacity);
            return this;
        }

        public Builder setSecondsUntilAutoPause(@Nullable Input<Integer> secondsUntilAutoPause) {
            this.secondsUntilAutoPause = secondsUntilAutoPause;
            return this;
        }

        public Builder setSecondsUntilAutoPause(@Nullable Integer secondsUntilAutoPause) {
            this.secondsUntilAutoPause = Input.ofNullable(secondsUntilAutoPause);
            return this;
        }

        public Builder setTimeoutAction(@Nullable Input<String> timeoutAction) {
            this.timeoutAction = timeoutAction;
            return this;
        }

        public Builder setTimeoutAction(@Nullable String timeoutAction) {
            this.timeoutAction = Input.ofNullable(timeoutAction);
            return this;
        }
        public ClusterScalingConfigurationArgs build() {
            return new ClusterScalingConfigurationArgs(autoPause, maxCapacity, minCapacity, secondsUntilAutoPause, timeoutAction);
        }
    }
}
