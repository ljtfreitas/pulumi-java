// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceLoadBalancer {
    private final @Nullable String containerName;
    private final @Nullable Integer containerPort;
    private final @Nullable String loadBalancerName;
    private final @Nullable String targetGroupArn;

    @OutputCustomType.Constructor
    private ServiceLoadBalancer(
        @OutputCustomType.Parameter("containerName") @Nullable String containerName,
        @OutputCustomType.Parameter("containerPort") @Nullable Integer containerPort,
        @OutputCustomType.Parameter("loadBalancerName") @Nullable String loadBalancerName,
        @OutputCustomType.Parameter("targetGroupArn") @Nullable String targetGroupArn) {
        this.containerName = containerName;
        this.containerPort = containerPort;
        this.loadBalancerName = loadBalancerName;
        this.targetGroupArn = targetGroupArn;
    }

    public Optional<String> getContainerName() {
        return Optional.ofNullable(this.containerName);
    }
    public Optional<Integer> getContainerPort() {
        return Optional.ofNullable(this.containerPort);
    }
    public Optional<String> getLoadBalancerName() {
        return Optional.ofNullable(this.loadBalancerName);
    }
    public Optional<String> getTargetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLoadBalancer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerName;
        private @Nullable Integer containerPort;
        private @Nullable String loadBalancerName;
        private @Nullable String targetGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceLoadBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.targetGroupArn = defaults.targetGroupArn;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setContainerPort(@Nullable Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        public Builder setLoadBalancerName(@Nullable String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        public Builder setTargetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }
        public ServiceLoadBalancer build() {
            return new ServiceLoadBalancer(containerName, containerPort, loadBalancerName, targetGroupArn);
        }
    }
}
