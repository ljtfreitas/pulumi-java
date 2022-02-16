// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.awsnative.ecs.outputs.ServiceCapacityProviderStrategyItem;
import io.pulumi.awsnative.ecs.outputs.ServiceDeploymentConfiguration;
import io.pulumi.awsnative.ecs.outputs.ServiceNetworkConfiguration;
import io.pulumi.awsnative.ecs.outputs.ServiceTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetServiceResult {
    private final @Nullable List<ServiceCapacityProviderStrategyItem> capacityProviderStrategy;
    private final @Nullable ServiceDeploymentConfiguration deploymentConfiguration;
    private final @Nullable Integer desiredCount;
    private final @Nullable Boolean enableExecuteCommand;
    private final @Nullable Integer healthCheckGracePeriodSeconds;
    private final @Nullable String name;
    private final @Nullable ServiceNetworkConfiguration networkConfiguration;
    private final @Nullable String platformVersion;
    private final @Nullable String serviceArn;
    private final @Nullable List<ServiceTag> tags;
    private final @Nullable String taskDefinition;

    @OutputCustomType.Constructor({"capacityProviderStrategy","deploymentConfiguration","desiredCount","enableExecuteCommand","healthCheckGracePeriodSeconds","name","networkConfiguration","platformVersion","serviceArn","tags","taskDefinition"})
    private GetServiceResult(
        @Nullable List<ServiceCapacityProviderStrategyItem> capacityProviderStrategy,
        @Nullable ServiceDeploymentConfiguration deploymentConfiguration,
        @Nullable Integer desiredCount,
        @Nullable Boolean enableExecuteCommand,
        @Nullable Integer healthCheckGracePeriodSeconds,
        @Nullable String name,
        @Nullable ServiceNetworkConfiguration networkConfiguration,
        @Nullable String platformVersion,
        @Nullable String serviceArn,
        @Nullable List<ServiceTag> tags,
        @Nullable String taskDefinition) {
        this.capacityProviderStrategy = capacityProviderStrategy;
        this.deploymentConfiguration = deploymentConfiguration;
        this.desiredCount = desiredCount;
        this.enableExecuteCommand = enableExecuteCommand;
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
        this.name = name;
        this.networkConfiguration = networkConfiguration;
        this.platformVersion = platformVersion;
        this.serviceArn = serviceArn;
        this.tags = tags;
        this.taskDefinition = taskDefinition;
    }

    public List<ServiceCapacityProviderStrategyItem> getCapacityProviderStrategy() {
        return this.capacityProviderStrategy == null ? List.of() : this.capacityProviderStrategy;
    }
    public Optional<ServiceDeploymentConfiguration> getDeploymentConfiguration() {
        return Optional.ofNullable(this.deploymentConfiguration);
    }
    public Optional<Integer> getDesiredCount() {
        return Optional.ofNullable(this.desiredCount);
    }
    public Optional<Boolean> getEnableExecuteCommand() {
        return Optional.ofNullable(this.enableExecuteCommand);
    }
    public Optional<Integer> getHealthCheckGracePeriodSeconds() {
        return Optional.ofNullable(this.healthCheckGracePeriodSeconds);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<ServiceNetworkConfiguration> getNetworkConfiguration() {
        return Optional.ofNullable(this.networkConfiguration);
    }
    public Optional<String> getPlatformVersion() {
        return Optional.ofNullable(this.platformVersion);
    }
    public Optional<String> getServiceArn() {
        return Optional.ofNullable(this.serviceArn);
    }
    public List<ServiceTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<String> getTaskDefinition() {
        return Optional.ofNullable(this.taskDefinition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ServiceCapacityProviderStrategyItem> capacityProviderStrategy;
        private @Nullable ServiceDeploymentConfiguration deploymentConfiguration;
        private @Nullable Integer desiredCount;
        private @Nullable Boolean enableExecuteCommand;
        private @Nullable Integer healthCheckGracePeriodSeconds;
        private @Nullable String name;
        private @Nullable ServiceNetworkConfiguration networkConfiguration;
        private @Nullable String platformVersion;
        private @Nullable String serviceArn;
        private @Nullable List<ServiceTag> tags;
        private @Nullable String taskDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityProviderStrategy = defaults.capacityProviderStrategy;
    	      this.deploymentConfiguration = defaults.deploymentConfiguration;
    	      this.desiredCount = defaults.desiredCount;
    	      this.enableExecuteCommand = defaults.enableExecuteCommand;
    	      this.healthCheckGracePeriodSeconds = defaults.healthCheckGracePeriodSeconds;
    	      this.name = defaults.name;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.platformVersion = defaults.platformVersion;
    	      this.serviceArn = defaults.serviceArn;
    	      this.tags = defaults.tags;
    	      this.taskDefinition = defaults.taskDefinition;
        }

        public Builder setCapacityProviderStrategy(@Nullable List<ServiceCapacityProviderStrategyItem> capacityProviderStrategy) {
            this.capacityProviderStrategy = capacityProviderStrategy;
            return this;
        }

        public Builder setDeploymentConfiguration(@Nullable ServiceDeploymentConfiguration deploymentConfiguration) {
            this.deploymentConfiguration = deploymentConfiguration;
            return this;
        }

        public Builder setDesiredCount(@Nullable Integer desiredCount) {
            this.desiredCount = desiredCount;
            return this;
        }

        public Builder setEnableExecuteCommand(@Nullable Boolean enableExecuteCommand) {
            this.enableExecuteCommand = enableExecuteCommand;
            return this;
        }

        public Builder setHealthCheckGracePeriodSeconds(@Nullable Integer healthCheckGracePeriodSeconds) {
            this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNetworkConfiguration(@Nullable ServiceNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        public Builder setPlatformVersion(@Nullable String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }

        public Builder setServiceArn(@Nullable String serviceArn) {
            this.serviceArn = serviceArn;
            return this;
        }

        public Builder setTags(@Nullable List<ServiceTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTaskDefinition(@Nullable String taskDefinition) {
            this.taskDefinition = taskDefinition;
            return this;
        }

        public GetServiceResult build() {
            return new GetServiceResult(capacityProviderStrategy, deploymentConfiguration, desiredCount, enableExecuteCommand, healthCheckGracePeriodSeconds, name, networkConfiguration, platformVersion, serviceArn, tags, taskDefinition);
        }
    }
}