// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator.inputs;

import io.pulumi.aws.globalaccelerator.inputs.EndpointGroupEndpointConfigurationGetArgs;
import io.pulumi.aws.globalaccelerator.inputs.EndpointGroupPortOverrideGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointGroupState extends io.pulumi.resources.ResourceArgs {

    public static final EndpointGroupState Empty = new EndpointGroupState();

    /**
     * The Amazon Resource Name (ARN) of the endpoint group.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The list of endpoint objects. Fields documented below.
     * 
     */
    @Import(name="endpointConfigurations")
      private final @Nullable Output<List<EndpointGroupEndpointConfigurationGetArgs>> endpointConfigurations;

    public Output<List<EndpointGroupEndpointConfigurationGetArgs>> getEndpointConfigurations() {
        return this.endpointConfigurations == null ? Output.empty() : this.endpointConfigurations;
    }

    /**
     * The name of the AWS Region where the endpoint group is located.
     * 
     */
    @Import(name="endpointGroupRegion")
      private final @Nullable Output<String> endpointGroupRegion;

    public Output<String> getEndpointGroupRegion() {
        return this.endpointGroupRegion == null ? Output.empty() : this.endpointGroupRegion;
    }

    /**
     * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
     * 
     */
    @Import(name="healthCheckIntervalSeconds")
      private final @Nullable Output<Integer> healthCheckIntervalSeconds;

    public Output<Integer> getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds == null ? Output.empty() : this.healthCheckIntervalSeconds;
    }

    /**
     * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (`/`). the provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Import(name="healthCheckPath")
      private final @Nullable Output<String> healthCheckPath;

    public Output<String> getHealthCheckPath() {
        return this.healthCheckPath == null ? Output.empty() : this.healthCheckPath;
    }

    /**
     * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
     * the provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Import(name="healthCheckPort")
      private final @Nullable Output<Integer> healthCheckPort;

    public Output<Integer> getHealthCheckPort() {
        return this.healthCheckPort == null ? Output.empty() : this.healthCheckPort;
    }

    /**
     * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
     * 
     */
    @Import(name="healthCheckProtocol")
      private final @Nullable Output<String> healthCheckProtocol;

    public Output<String> getHealthCheckProtocol() {
        return this.healthCheckProtocol == null ? Output.empty() : this.healthCheckProtocol;
    }

    /**
     * The Amazon Resource Name (ARN) of the listener.
     * 
     */
    @Import(name="listenerArn")
      private final @Nullable Output<String> listenerArn;

    public Output<String> getListenerArn() {
        return this.listenerArn == null ? Output.empty() : this.listenerArn;
    }

    /**
     * Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
     * 
     */
    @Import(name="portOverrides")
      private final @Nullable Output<List<EndpointGroupPortOverrideGetArgs>> portOverrides;

    public Output<List<EndpointGroupPortOverrideGetArgs>> getPortOverrides() {
        return this.portOverrides == null ? Output.empty() : this.portOverrides;
    }

    /**
     * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
     * 
     */
    @Import(name="thresholdCount")
      private final @Nullable Output<Integer> thresholdCount;

    public Output<Integer> getThresholdCount() {
        return this.thresholdCount == null ? Output.empty() : this.thresholdCount;
    }

    /**
     * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
     * 
     */
    @Import(name="trafficDialPercentage")
      private final @Nullable Output<Double> trafficDialPercentage;

    public Output<Double> getTrafficDialPercentage() {
        return this.trafficDialPercentage == null ? Output.empty() : this.trafficDialPercentage;
    }

    public EndpointGroupState(
        @Nullable Output<String> arn,
        @Nullable Output<List<EndpointGroupEndpointConfigurationGetArgs>> endpointConfigurations,
        @Nullable Output<String> endpointGroupRegion,
        @Nullable Output<Integer> healthCheckIntervalSeconds,
        @Nullable Output<String> healthCheckPath,
        @Nullable Output<Integer> healthCheckPort,
        @Nullable Output<String> healthCheckProtocol,
        @Nullable Output<String> listenerArn,
        @Nullable Output<List<EndpointGroupPortOverrideGetArgs>> portOverrides,
        @Nullable Output<Integer> thresholdCount,
        @Nullable Output<Double> trafficDialPercentage) {
        this.arn = arn;
        this.endpointConfigurations = endpointConfigurations;
        this.endpointGroupRegion = endpointGroupRegion;
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
        this.healthCheckPath = healthCheckPath;
        this.healthCheckPort = healthCheckPort;
        this.healthCheckProtocol = healthCheckProtocol;
        this.listenerArn = listenerArn;
        this.portOverrides = portOverrides;
        this.thresholdCount = thresholdCount;
        this.trafficDialPercentage = trafficDialPercentage;
    }

    private EndpointGroupState() {
        this.arn = Output.empty();
        this.endpointConfigurations = Output.empty();
        this.endpointGroupRegion = Output.empty();
        this.healthCheckIntervalSeconds = Output.empty();
        this.healthCheckPath = Output.empty();
        this.healthCheckPort = Output.empty();
        this.healthCheckProtocol = Output.empty();
        this.listenerArn = Output.empty();
        this.portOverrides = Output.empty();
        this.thresholdCount = Output.empty();
        this.trafficDialPercentage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<List<EndpointGroupEndpointConfigurationGetArgs>> endpointConfigurations;
        private @Nullable Output<String> endpointGroupRegion;
        private @Nullable Output<Integer> healthCheckIntervalSeconds;
        private @Nullable Output<String> healthCheckPath;
        private @Nullable Output<Integer> healthCheckPort;
        private @Nullable Output<String> healthCheckProtocol;
        private @Nullable Output<String> listenerArn;
        private @Nullable Output<List<EndpointGroupPortOverrideGetArgs>> portOverrides;
        private @Nullable Output<Integer> thresholdCount;
        private @Nullable Output<Double> trafficDialPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.endpointConfigurations = defaults.endpointConfigurations;
    	      this.endpointGroupRegion = defaults.endpointGroupRegion;
    	      this.healthCheckIntervalSeconds = defaults.healthCheckIntervalSeconds;
    	      this.healthCheckPath = defaults.healthCheckPath;
    	      this.healthCheckPort = defaults.healthCheckPort;
    	      this.healthCheckProtocol = defaults.healthCheckProtocol;
    	      this.listenerArn = defaults.listenerArn;
    	      this.portOverrides = defaults.portOverrides;
    	      this.thresholdCount = defaults.thresholdCount;
    	      this.trafficDialPercentage = defaults.trafficDialPercentage;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder endpointConfigurations(@Nullable Output<List<EndpointGroupEndpointConfigurationGetArgs>> endpointConfigurations) {
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }

        public Builder endpointConfigurations(@Nullable List<EndpointGroupEndpointConfigurationGetArgs> endpointConfigurations) {
            this.endpointConfigurations = Output.ofNullable(endpointConfigurations);
            return this;
        }

        public Builder endpointGroupRegion(@Nullable Output<String> endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }

        public Builder endpointGroupRegion(@Nullable String endpointGroupRegion) {
            this.endpointGroupRegion = Output.ofNullable(endpointGroupRegion);
            return this;
        }

        public Builder healthCheckIntervalSeconds(@Nullable Output<Integer> healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }

        public Builder healthCheckIntervalSeconds(@Nullable Integer healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = Output.ofNullable(healthCheckIntervalSeconds);
            return this;
        }

        public Builder healthCheckPath(@Nullable Output<String> healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }

        public Builder healthCheckPath(@Nullable String healthCheckPath) {
            this.healthCheckPath = Output.ofNullable(healthCheckPath);
            return this;
        }

        public Builder healthCheckPort(@Nullable Output<Integer> healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }

        public Builder healthCheckPort(@Nullable Integer healthCheckPort) {
            this.healthCheckPort = Output.ofNullable(healthCheckPort);
            return this;
        }

        public Builder healthCheckProtocol(@Nullable Output<String> healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }

        public Builder healthCheckProtocol(@Nullable String healthCheckProtocol) {
            this.healthCheckProtocol = Output.ofNullable(healthCheckProtocol);
            return this;
        }

        public Builder listenerArn(@Nullable Output<String> listenerArn) {
            this.listenerArn = listenerArn;
            return this;
        }

        public Builder listenerArn(@Nullable String listenerArn) {
            this.listenerArn = Output.ofNullable(listenerArn);
            return this;
        }

        public Builder portOverrides(@Nullable Output<List<EndpointGroupPortOverrideGetArgs>> portOverrides) {
            this.portOverrides = portOverrides;
            return this;
        }

        public Builder portOverrides(@Nullable List<EndpointGroupPortOverrideGetArgs> portOverrides) {
            this.portOverrides = Output.ofNullable(portOverrides);
            return this;
        }

        public Builder thresholdCount(@Nullable Output<Integer> thresholdCount) {
            this.thresholdCount = thresholdCount;
            return this;
        }

        public Builder thresholdCount(@Nullable Integer thresholdCount) {
            this.thresholdCount = Output.ofNullable(thresholdCount);
            return this;
        }

        public Builder trafficDialPercentage(@Nullable Output<Double> trafficDialPercentage) {
            this.trafficDialPercentage = trafficDialPercentage;
            return this;
        }

        public Builder trafficDialPercentage(@Nullable Double trafficDialPercentage) {
            this.trafficDialPercentage = Output.ofNullable(trafficDialPercentage);
            return this;
        }
        public EndpointGroupState build() {
            return new EndpointGroupState(arn, endpointConfigurations, endpointGroupRegion, healthCheckIntervalSeconds, healthCheckPath, healthCheckPort, healthCheckProtocol, listenerArn, portOverrides, thresholdCount, trafficDialPercentage);
        }
    }
}
