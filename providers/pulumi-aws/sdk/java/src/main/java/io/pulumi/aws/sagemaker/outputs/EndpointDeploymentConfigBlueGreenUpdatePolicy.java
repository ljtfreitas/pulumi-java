// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.aws.sagemaker.outputs.EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointDeploymentConfigBlueGreenUpdatePolicy {
    /**
     * Maximum execution timeout for the deployment. Note that the timeout value should be larger than the total waiting time specified in `termination_wait_in_seconds` and `wait_interval_in_seconds`. Valid values are between `600` and `14400`.
     * 
     */
    private final @Nullable Integer maximumExecutionTimeoutInSeconds;
    /**
     * Additional waiting time in seconds after the completion of an endpoint deployment before terminating the old endpoint fleet. Default is `0`. Valid values are between `0` and `3600`.
     * 
     */
    private final @Nullable Integer terminationWaitInSeconds;
    /**
     * Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet during an endpoint deployment. See Traffic Routing Configuration.
     * 
     */
    private final EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration trafficRoutingConfiguration;

    @CustomType.Constructor
    private EndpointDeploymentConfigBlueGreenUpdatePolicy(
        @CustomType.Parameter("maximumExecutionTimeoutInSeconds") @Nullable Integer maximumExecutionTimeoutInSeconds,
        @CustomType.Parameter("terminationWaitInSeconds") @Nullable Integer terminationWaitInSeconds,
        @CustomType.Parameter("trafficRoutingConfiguration") EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration trafficRoutingConfiguration) {
        this.maximumExecutionTimeoutInSeconds = maximumExecutionTimeoutInSeconds;
        this.terminationWaitInSeconds = terminationWaitInSeconds;
        this.trafficRoutingConfiguration = trafficRoutingConfiguration;
    }

    /**
     * Maximum execution timeout for the deployment. Note that the timeout value should be larger than the total waiting time specified in `termination_wait_in_seconds` and `wait_interval_in_seconds`. Valid values are between `600` and `14400`.
     * 
    */
    public Optional<Integer> getMaximumExecutionTimeoutInSeconds() {
        return Optional.ofNullable(this.maximumExecutionTimeoutInSeconds);
    }
    /**
     * Additional waiting time in seconds after the completion of an endpoint deployment before terminating the old endpoint fleet. Default is `0`. Valid values are between `0` and `3600`.
     * 
    */
    public Optional<Integer> getTerminationWaitInSeconds() {
        return Optional.ofNullable(this.terminationWaitInSeconds);
    }
    /**
     * Defines the traffic routing strategy to shift traffic from the old fleet to the new fleet during an endpoint deployment. See Traffic Routing Configuration.
     * 
    */
    public EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration getTrafficRoutingConfiguration() {
        return this.trafficRoutingConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeploymentConfigBlueGreenUpdatePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maximumExecutionTimeoutInSeconds;
        private @Nullable Integer terminationWaitInSeconds;
        private EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration trafficRoutingConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeploymentConfigBlueGreenUpdatePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumExecutionTimeoutInSeconds = defaults.maximumExecutionTimeoutInSeconds;
    	      this.terminationWaitInSeconds = defaults.terminationWaitInSeconds;
    	      this.trafficRoutingConfiguration = defaults.trafficRoutingConfiguration;
        }

        public Builder maximumExecutionTimeoutInSeconds(@Nullable Integer maximumExecutionTimeoutInSeconds) {
            this.maximumExecutionTimeoutInSeconds = maximumExecutionTimeoutInSeconds;
            return this;
        }

        public Builder terminationWaitInSeconds(@Nullable Integer terminationWaitInSeconds) {
            this.terminationWaitInSeconds = terminationWaitInSeconds;
            return this;
        }

        public Builder trafficRoutingConfiguration(EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfiguration trafficRoutingConfiguration) {
            this.trafficRoutingConfiguration = Objects.requireNonNull(trafficRoutingConfiguration);
            return this;
        }
        public EndpointDeploymentConfigBlueGreenUpdatePolicy build() {
            return new EndpointDeploymentConfigBlueGreenUpdatePolicy(maximumExecutionTimeoutInSeconds, terminationWaitInSeconds, trafficRoutingConfiguration);
        }
    }
}
