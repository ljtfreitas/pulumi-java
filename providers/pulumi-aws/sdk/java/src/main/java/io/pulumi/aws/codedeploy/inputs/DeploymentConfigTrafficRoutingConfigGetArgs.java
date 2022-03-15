// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigTimeBasedLinearGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentConfigTrafficRoutingConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentConfigTrafficRoutingConfigGetArgs Empty = new DeploymentConfigTrafficRoutingConfigGetArgs();

    /**
     * The time based canary configuration information. If `type` is `TimeBasedLinear`, use `time_based_linear` instead.
     * 
     */
    @Import(name="timeBasedCanary")
      private final @Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs> timeBasedCanary;

    public Output<DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs> getTimeBasedCanary() {
        return this.timeBasedCanary == null ? Output.empty() : this.timeBasedCanary;
    }

    /**
     * The time based linear configuration information. If `type` is `TimeBasedCanary`, use `time_based_canary` instead.
     * 
     */
    @Import(name="timeBasedLinear")
      private final @Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedLinearGetArgs> timeBasedLinear;

    public Output<DeploymentConfigTrafficRoutingConfigTimeBasedLinearGetArgs> getTimeBasedLinear() {
        return this.timeBasedLinear == null ? Output.empty() : this.timeBasedLinear;
    }

    /**
     * Type of traffic routing config. One of `TimeBasedCanary`, `TimeBasedLinear`, `AllAtOnce`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public DeploymentConfigTrafficRoutingConfigGetArgs(
        @Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs> timeBasedCanary,
        @Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedLinearGetArgs> timeBasedLinear,
        @Nullable Output<String> type) {
        this.timeBasedCanary = timeBasedCanary;
        this.timeBasedLinear = timeBasedLinear;
        this.type = type;
    }

    private DeploymentConfigTrafficRoutingConfigGetArgs() {
        this.timeBasedCanary = Output.empty();
        this.timeBasedLinear = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentConfigTrafficRoutingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs> timeBasedCanary;
        private @Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedLinearGetArgs> timeBasedLinear;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentConfigTrafficRoutingConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeBasedCanary = defaults.timeBasedCanary;
    	      this.timeBasedLinear = defaults.timeBasedLinear;
    	      this.type = defaults.type;
        }

        public Builder timeBasedCanary(@Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs> timeBasedCanary) {
            this.timeBasedCanary = timeBasedCanary;
            return this;
        }

        public Builder timeBasedCanary(@Nullable DeploymentConfigTrafficRoutingConfigTimeBasedCanaryGetArgs timeBasedCanary) {
            this.timeBasedCanary = Output.ofNullable(timeBasedCanary);
            return this;
        }

        public Builder timeBasedLinear(@Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedLinearGetArgs> timeBasedLinear) {
            this.timeBasedLinear = timeBasedLinear;
            return this;
        }

        public Builder timeBasedLinear(@Nullable DeploymentConfigTrafficRoutingConfigTimeBasedLinearGetArgs timeBasedLinear) {
            this.timeBasedLinear = Output.ofNullable(timeBasedLinear);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public DeploymentConfigTrafficRoutingConfigGetArgs build() {
            return new DeploymentConfigTrafficRoutingConfigGetArgs(timeBasedCanary, timeBasedLinear, type);
        }
    }
}
