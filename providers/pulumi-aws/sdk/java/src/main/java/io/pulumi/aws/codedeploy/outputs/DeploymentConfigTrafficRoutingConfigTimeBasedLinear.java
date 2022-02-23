// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeploymentConfigTrafficRoutingConfigTimeBasedLinear {
    /**
     * The number of minutes between each incremental traffic shift of a `TimeBasedLinear` deployment.
     * 
     */
    private final @Nullable Integer interval;
    /**
     * The percentage of traffic that is shifted at the start of each increment of a `TimeBasedLinear` deployment.
     * 
     */
    private final @Nullable Integer percentage;

    @OutputCustomType.Constructor({"interval","percentage"})
    private DeploymentConfigTrafficRoutingConfigTimeBasedLinear(
        @Nullable Integer interval,
        @Nullable Integer percentage) {
        this.interval = interval;
        this.percentage = percentage;
    }

    /**
     * The number of minutes between each incremental traffic shift of a `TimeBasedLinear` deployment.
     * 
     */
    public Optional<Integer> getInterval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * The percentage of traffic that is shifted at the start of each increment of a `TimeBasedLinear` deployment.
     * 
     */
    public Optional<Integer> getPercentage() {
        return Optional.ofNullable(this.percentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentConfigTrafficRoutingConfigTimeBasedLinear defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer interval;
        private @Nullable Integer percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentConfigTrafficRoutingConfigTimeBasedLinear defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.percentage = defaults.percentage;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }

        public Builder setPercentage(@Nullable Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public DeploymentConfigTrafficRoutingConfigTimeBasedLinear build() {
            return new DeploymentConfigTrafficRoutingConfigTimeBasedLinear(interval, percentage);
        }
    }
}
