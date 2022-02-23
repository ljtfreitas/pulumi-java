// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs;

import io.pulumi.aws.ecs.inputs.ServiceCapacityProviderStrategyArgs;
import io.pulumi.aws.ecs.inputs.ServiceDeploymentCircuitBreakerArgs;
import io.pulumi.aws.ecs.inputs.ServiceDeploymentControllerArgs;
import io.pulumi.aws.ecs.inputs.ServiceLoadBalancerArgs;
import io.pulumi.aws.ecs.inputs.ServiceNetworkConfigurationArgs;
import io.pulumi.aws.ecs.inputs.ServiceOrderedPlacementStrategyArgs;
import io.pulumi.aws.ecs.inputs.ServicePlacementConstraintArgs;
import io.pulumi.aws.ecs.inputs.ServiceServiceRegistriesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Capacity provider strategies to use for the service. Can be one or more. These can be updated without destroying and recreating the service only if `force_new_deployment = true` and not changing from 0 `capacity_provider_strategy` blocks to greater than 0, or vice versa. See below.
     * 
     */
    @InputImport(name="capacityProviderStrategies")
    private final @Nullable Input<List<ServiceCapacityProviderStrategyArgs>> capacityProviderStrategies;

    public Input<List<ServiceCapacityProviderStrategyArgs>> getCapacityProviderStrategies() {
        return this.capacityProviderStrategies == null ? Input.empty() : this.capacityProviderStrategies;
    }

    /**
     * ARN of an ECS cluster.
     * 
     */
    @InputImport(name="cluster")
    private final @Nullable Input<String> cluster;

    public Input<String> getCluster() {
        return this.cluster == null ? Input.empty() : this.cluster;
    }

    /**
     * Configuration block for deployment circuit breaker. See below.
     * 
     */
    @InputImport(name="deploymentCircuitBreaker")
    private final @Nullable Input<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker;

    public Input<ServiceDeploymentCircuitBreakerArgs> getDeploymentCircuitBreaker() {
        return this.deploymentCircuitBreaker == null ? Input.empty() : this.deploymentCircuitBreaker;
    }

    /**
     * Configuration block for deployment controller configuration. See below.
     * 
     */
    @InputImport(name="deploymentController")
    private final @Nullable Input<ServiceDeploymentControllerArgs> deploymentController;

    public Input<ServiceDeploymentControllerArgs> getDeploymentController() {
        return this.deploymentController == null ? Input.empty() : this.deploymentController;
    }

    /**
     * Upper limit (as a percentage of the service's desiredCount) of the number of running tasks that can be running in a service during a deployment. Not valid when using the `DAEMON` scheduling strategy.
     * 
     */
    @InputImport(name="deploymentMaximumPercent")
    private final @Nullable Input<Integer> deploymentMaximumPercent;

    public Input<Integer> getDeploymentMaximumPercent() {
        return this.deploymentMaximumPercent == null ? Input.empty() : this.deploymentMaximumPercent;
    }

    /**
     * Lower limit (as a percentage of the service's desiredCount) of the number of running tasks that must remain running and healthy in a service during a deployment.
     * 
     */
    @InputImport(name="deploymentMinimumHealthyPercent")
    private final @Nullable Input<Integer> deploymentMinimumHealthyPercent;

    public Input<Integer> getDeploymentMinimumHealthyPercent() {
        return this.deploymentMinimumHealthyPercent == null ? Input.empty() : this.deploymentMinimumHealthyPercent;
    }

    /**
     * Number of instances of the task definition to place and keep running. Defaults to 0. Do not specify if using the `DAEMON` scheduling strategy.
     * 
     */
    @InputImport(name="desiredCount")
    private final @Nullable Input<Integer> desiredCount;

    public Input<Integer> getDesiredCount() {
        return this.desiredCount == null ? Input.empty() : this.desiredCount;
    }

    /**
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service.
     * 
     */
    @InputImport(name="enableEcsManagedTags")
    private final @Nullable Input<Boolean> enableEcsManagedTags;

    public Input<Boolean> getEnableEcsManagedTags() {
        return this.enableEcsManagedTags == null ? Input.empty() : this.enableEcsManagedTags;
    }

    /**
     * Specifies whether to enable Amazon ECS Exec for the tasks within the service.
     * 
     */
    @InputImport(name="enableExecuteCommand")
    private final @Nullable Input<Boolean> enableExecuteCommand;

    public Input<Boolean> getEnableExecuteCommand() {
        return this.enableExecuteCommand == null ? Input.empty() : this.enableExecuteCommand;
    }

    /**
     * Enable to force a new task deployment of the service. This can be used to update tasks to use a newer Docker image with same image/tag combination (e.g., `myimage:latest`), roll Fargate tasks onto a newer platform version, or immediately deploy `ordered_placement_strategy` and `placement_constraints` updates.
     * 
     */
    @InputImport(name="forceNewDeployment")
    private final @Nullable Input<Boolean> forceNewDeployment;

    public Input<Boolean> getForceNewDeployment() {
        return this.forceNewDeployment == null ? Input.empty() : this.forceNewDeployment;
    }

    /**
     * Seconds to ignore failing load balancer health checks on newly instantiated tasks to prevent premature shutdown, up to 2147483647. Only valid for services configured to use load balancers.
     * 
     */
    @InputImport(name="healthCheckGracePeriodSeconds")
    private final @Nullable Input<Integer> healthCheckGracePeriodSeconds;

    public Input<Integer> getHealthCheckGracePeriodSeconds() {
        return this.healthCheckGracePeriodSeconds == null ? Input.empty() : this.healthCheckGracePeriodSeconds;
    }

    /**
     * ARN of the IAM role that allows Amazon ECS to make calls to your load balancer on your behalf. This parameter is required if you are using a load balancer with your service, but only if your task definition does not use the `awsvpc` network mode. If using `awsvpc` network mode, do not specify this role. If your account has already created the Amazon ECS service-linked role, that role is used by default for your service unless you specify a role here.
     * 
     */
    @InputImport(name="iamRole")
    private final @Nullable Input<String> iamRole;

    public Input<String> getIamRole() {
        return this.iamRole == null ? Input.empty() : this.iamRole;
    }

    /**
     * Launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
     * 
     */
    @InputImport(name="launchType")
    private final @Nullable Input<String> launchType;

    public Input<String> getLaunchType() {
        return this.launchType == null ? Input.empty() : this.launchType;
    }

    /**
     * Configuration block for load balancers. See below.
     * 
     */
    @InputImport(name="loadBalancers")
    private final @Nullable Input<List<ServiceLoadBalancerArgs>> loadBalancers;

    public Input<List<ServiceLoadBalancerArgs>> getLoadBalancers() {
        return this.loadBalancers == null ? Input.empty() : this.loadBalancers;
    }

    /**
     * Name of the service (up to 255 letters, numbers, hyphens, and underscores)
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. See below.
     * 
     */
    @InputImport(name="networkConfiguration")
    private final @Nullable Input<ServiceNetworkConfigurationArgs> networkConfiguration;

    public Input<ServiceNetworkConfigurationArgs> getNetworkConfiguration() {
        return this.networkConfiguration == null ? Input.empty() : this.networkConfiguration;
    }

    /**
     * Service level strategy rules that are taken into consideration during task placement. List from top to bottom in order of precedence. Updates to this configuration will take effect next task deployment unless `force_new_deployment` is enabled. The maximum number of `ordered_placement_strategy` blocks is `5`. See below.
     * 
     */
    @InputImport(name="orderedPlacementStrategies")
    private final @Nullable Input<List<ServiceOrderedPlacementStrategyArgs>> orderedPlacementStrategies;

    public Input<List<ServiceOrderedPlacementStrategyArgs>> getOrderedPlacementStrategies() {
        return this.orderedPlacementStrategies == null ? Input.empty() : this.orderedPlacementStrategies;
    }

    /**
     * Rules that are taken into consideration during task placement. Updates to this configuration will take effect next task deployment unless `force_new_deployment` is enabled. Maximum number of `placement_constraints` is `10`. See below.
     * 
     */
    @InputImport(name="placementConstraints")
    private final @Nullable Input<List<ServicePlacementConstraintArgs>> placementConstraints;

    public Input<List<ServicePlacementConstraintArgs>> getPlacementConstraints() {
        return this.placementConstraints == null ? Input.empty() : this.placementConstraints;
    }

    /**
     * Platform version on which to run your service. Only applicable for `launch_type` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    @InputImport(name="platformVersion")
    private final @Nullable Input<String> platformVersion;

    public Input<String> getPlatformVersion() {
        return this.platformVersion == null ? Input.empty() : this.platformVersion;
    }

    /**
     * Specifies whether to propagate the tags from the task definition or the service to the tasks. The valid values are `SERVICE` and `TASK_DEFINITION`.
     * 
     */
    @InputImport(name="propagateTags")
    private final @Nullable Input<String> propagateTags;

    public Input<String> getPropagateTags() {
        return this.propagateTags == null ? Input.empty() : this.propagateTags;
    }

    /**
     * Scheduling strategy to use for the service. The valid values are `REPLICA` and `DAEMON`. Defaults to `REPLICA`. Note that [*Tasks using the Fargate launch type or the `CODE_DEPLOY` or `EXTERNAL` deployment controller types don't support the `DAEMON` scheduling strategy*](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html).
     * 
     */
    @InputImport(name="schedulingStrategy")
    private final @Nullable Input<String> schedulingStrategy;

    public Input<String> getSchedulingStrategy() {
        return this.schedulingStrategy == null ? Input.empty() : this.schedulingStrategy;
    }

    /**
     * Service discovery registries for the service. The maximum number of `service_registries` blocks is `1`. See below.
     * 
     */
    @InputImport(name="serviceRegistries")
    private final @Nullable Input<ServiceServiceRegistriesArgs> serviceRegistries;

    public Input<ServiceServiceRegistriesArgs> getServiceRegistries() {
        return this.serviceRegistries == null ? Input.empty() : this.serviceRegistries;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service. Required unless using the `EXTERNAL` deployment controller. If a revision is not specified, the latest `ACTIVE` revision is used.
     * 
     */
    @InputImport(name="taskDefinition")
    private final @Nullable Input<String> taskDefinition;

    public Input<String> getTaskDefinition() {
        return this.taskDefinition == null ? Input.empty() : this.taskDefinition;
    }

    /**
     * If `true`, this provider will wait for the service to reach a steady state (like [`aws ecs wait services-stable`](https://docs.aws.amazon.com/cli/latest/reference/ecs/wait/services-stable.html)) before continuing. Default `false`.
     * 
     */
    @InputImport(name="waitForSteadyState")
    private final @Nullable Input<Boolean> waitForSteadyState;

    public Input<Boolean> getWaitForSteadyState() {
        return this.waitForSteadyState == null ? Input.empty() : this.waitForSteadyState;
    }

    public ServiceArgs(
        @Nullable Input<List<ServiceCapacityProviderStrategyArgs>> capacityProviderStrategies,
        @Nullable Input<String> cluster,
        @Nullable Input<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker,
        @Nullable Input<ServiceDeploymentControllerArgs> deploymentController,
        @Nullable Input<Integer> deploymentMaximumPercent,
        @Nullable Input<Integer> deploymentMinimumHealthyPercent,
        @Nullable Input<Integer> desiredCount,
        @Nullable Input<Boolean> enableEcsManagedTags,
        @Nullable Input<Boolean> enableExecuteCommand,
        @Nullable Input<Boolean> forceNewDeployment,
        @Nullable Input<Integer> healthCheckGracePeriodSeconds,
        @Nullable Input<String> iamRole,
        @Nullable Input<String> launchType,
        @Nullable Input<List<ServiceLoadBalancerArgs>> loadBalancers,
        @Nullable Input<String> name,
        @Nullable Input<ServiceNetworkConfigurationArgs> networkConfiguration,
        @Nullable Input<List<ServiceOrderedPlacementStrategyArgs>> orderedPlacementStrategies,
        @Nullable Input<List<ServicePlacementConstraintArgs>> placementConstraints,
        @Nullable Input<String> platformVersion,
        @Nullable Input<String> propagateTags,
        @Nullable Input<String> schedulingStrategy,
        @Nullable Input<ServiceServiceRegistriesArgs> serviceRegistries,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> taskDefinition,
        @Nullable Input<Boolean> waitForSteadyState) {
        this.capacityProviderStrategies = capacityProviderStrategies;
        this.cluster = cluster;
        this.deploymentCircuitBreaker = deploymentCircuitBreaker;
        this.deploymentController = deploymentController;
        this.deploymentMaximumPercent = deploymentMaximumPercent;
        this.deploymentMinimumHealthyPercent = deploymentMinimumHealthyPercent;
        this.desiredCount = desiredCount;
        this.enableEcsManagedTags = enableEcsManagedTags;
        this.enableExecuteCommand = enableExecuteCommand;
        this.forceNewDeployment = forceNewDeployment;
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
        this.iamRole = iamRole;
        this.launchType = launchType;
        this.loadBalancers = loadBalancers;
        this.name = name;
        this.networkConfiguration = networkConfiguration;
        this.orderedPlacementStrategies = orderedPlacementStrategies;
        this.placementConstraints = placementConstraints;
        this.platformVersion = platformVersion;
        this.propagateTags = propagateTags;
        this.schedulingStrategy = schedulingStrategy;
        this.serviceRegistries = serviceRegistries;
        this.tags = tags;
        this.taskDefinition = taskDefinition;
        this.waitForSteadyState = waitForSteadyState;
    }

    private ServiceArgs() {
        this.capacityProviderStrategies = Input.empty();
        this.cluster = Input.empty();
        this.deploymentCircuitBreaker = Input.empty();
        this.deploymentController = Input.empty();
        this.deploymentMaximumPercent = Input.empty();
        this.deploymentMinimumHealthyPercent = Input.empty();
        this.desiredCount = Input.empty();
        this.enableEcsManagedTags = Input.empty();
        this.enableExecuteCommand = Input.empty();
        this.forceNewDeployment = Input.empty();
        this.healthCheckGracePeriodSeconds = Input.empty();
        this.iamRole = Input.empty();
        this.launchType = Input.empty();
        this.loadBalancers = Input.empty();
        this.name = Input.empty();
        this.networkConfiguration = Input.empty();
        this.orderedPlacementStrategies = Input.empty();
        this.placementConstraints = Input.empty();
        this.platformVersion = Input.empty();
        this.propagateTags = Input.empty();
        this.schedulingStrategy = Input.empty();
        this.serviceRegistries = Input.empty();
        this.tags = Input.empty();
        this.taskDefinition = Input.empty();
        this.waitForSteadyState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ServiceCapacityProviderStrategyArgs>> capacityProviderStrategies;
        private @Nullable Input<String> cluster;
        private @Nullable Input<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker;
        private @Nullable Input<ServiceDeploymentControllerArgs> deploymentController;
        private @Nullable Input<Integer> deploymentMaximumPercent;
        private @Nullable Input<Integer> deploymentMinimumHealthyPercent;
        private @Nullable Input<Integer> desiredCount;
        private @Nullable Input<Boolean> enableEcsManagedTags;
        private @Nullable Input<Boolean> enableExecuteCommand;
        private @Nullable Input<Boolean> forceNewDeployment;
        private @Nullable Input<Integer> healthCheckGracePeriodSeconds;
        private @Nullable Input<String> iamRole;
        private @Nullable Input<String> launchType;
        private @Nullable Input<List<ServiceLoadBalancerArgs>> loadBalancers;
        private @Nullable Input<String> name;
        private @Nullable Input<ServiceNetworkConfigurationArgs> networkConfiguration;
        private @Nullable Input<List<ServiceOrderedPlacementStrategyArgs>> orderedPlacementStrategies;
        private @Nullable Input<List<ServicePlacementConstraintArgs>> placementConstraints;
        private @Nullable Input<String> platformVersion;
        private @Nullable Input<String> propagateTags;
        private @Nullable Input<String> schedulingStrategy;
        private @Nullable Input<ServiceServiceRegistriesArgs> serviceRegistries;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> taskDefinition;
        private @Nullable Input<Boolean> waitForSteadyState;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityProviderStrategies = defaults.capacityProviderStrategies;
    	      this.cluster = defaults.cluster;
    	      this.deploymentCircuitBreaker = defaults.deploymentCircuitBreaker;
    	      this.deploymentController = defaults.deploymentController;
    	      this.deploymentMaximumPercent = defaults.deploymentMaximumPercent;
    	      this.deploymentMinimumHealthyPercent = defaults.deploymentMinimumHealthyPercent;
    	      this.desiredCount = defaults.desiredCount;
    	      this.enableEcsManagedTags = defaults.enableEcsManagedTags;
    	      this.enableExecuteCommand = defaults.enableExecuteCommand;
    	      this.forceNewDeployment = defaults.forceNewDeployment;
    	      this.healthCheckGracePeriodSeconds = defaults.healthCheckGracePeriodSeconds;
    	      this.iamRole = defaults.iamRole;
    	      this.launchType = defaults.launchType;
    	      this.loadBalancers = defaults.loadBalancers;
    	      this.name = defaults.name;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.orderedPlacementStrategies = defaults.orderedPlacementStrategies;
    	      this.placementConstraints = defaults.placementConstraints;
    	      this.platformVersion = defaults.platformVersion;
    	      this.propagateTags = defaults.propagateTags;
    	      this.schedulingStrategy = defaults.schedulingStrategy;
    	      this.serviceRegistries = defaults.serviceRegistries;
    	      this.tags = defaults.tags;
    	      this.taskDefinition = defaults.taskDefinition;
    	      this.waitForSteadyState = defaults.waitForSteadyState;
        }

        public Builder setCapacityProviderStrategies(@Nullable Input<List<ServiceCapacityProviderStrategyArgs>> capacityProviderStrategies) {
            this.capacityProviderStrategies = capacityProviderStrategies;
            return this;
        }

        public Builder setCapacityProviderStrategies(@Nullable List<ServiceCapacityProviderStrategyArgs> capacityProviderStrategies) {
            this.capacityProviderStrategies = Input.ofNullable(capacityProviderStrategies);
            return this;
        }

        public Builder setCluster(@Nullable Input<String> cluster) {
            this.cluster = cluster;
            return this;
        }

        public Builder setCluster(@Nullable String cluster) {
            this.cluster = Input.ofNullable(cluster);
            return this;
        }

        public Builder setDeploymentCircuitBreaker(@Nullable Input<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker) {
            this.deploymentCircuitBreaker = deploymentCircuitBreaker;
            return this;
        }

        public Builder setDeploymentCircuitBreaker(@Nullable ServiceDeploymentCircuitBreakerArgs deploymentCircuitBreaker) {
            this.deploymentCircuitBreaker = Input.ofNullable(deploymentCircuitBreaker);
            return this;
        }

        public Builder setDeploymentController(@Nullable Input<ServiceDeploymentControllerArgs> deploymentController) {
            this.deploymentController = deploymentController;
            return this;
        }

        public Builder setDeploymentController(@Nullable ServiceDeploymentControllerArgs deploymentController) {
            this.deploymentController = Input.ofNullable(deploymentController);
            return this;
        }

        public Builder setDeploymentMaximumPercent(@Nullable Input<Integer> deploymentMaximumPercent) {
            this.deploymentMaximumPercent = deploymentMaximumPercent;
            return this;
        }

        public Builder setDeploymentMaximumPercent(@Nullable Integer deploymentMaximumPercent) {
            this.deploymentMaximumPercent = Input.ofNullable(deploymentMaximumPercent);
            return this;
        }

        public Builder setDeploymentMinimumHealthyPercent(@Nullable Input<Integer> deploymentMinimumHealthyPercent) {
            this.deploymentMinimumHealthyPercent = deploymentMinimumHealthyPercent;
            return this;
        }

        public Builder setDeploymentMinimumHealthyPercent(@Nullable Integer deploymentMinimumHealthyPercent) {
            this.deploymentMinimumHealthyPercent = Input.ofNullable(deploymentMinimumHealthyPercent);
            return this;
        }

        public Builder setDesiredCount(@Nullable Input<Integer> desiredCount) {
            this.desiredCount = desiredCount;
            return this;
        }

        public Builder setDesiredCount(@Nullable Integer desiredCount) {
            this.desiredCount = Input.ofNullable(desiredCount);
            return this;
        }

        public Builder setEnableEcsManagedTags(@Nullable Input<Boolean> enableEcsManagedTags) {
            this.enableEcsManagedTags = enableEcsManagedTags;
            return this;
        }

        public Builder setEnableEcsManagedTags(@Nullable Boolean enableEcsManagedTags) {
            this.enableEcsManagedTags = Input.ofNullable(enableEcsManagedTags);
            return this;
        }

        public Builder setEnableExecuteCommand(@Nullable Input<Boolean> enableExecuteCommand) {
            this.enableExecuteCommand = enableExecuteCommand;
            return this;
        }

        public Builder setEnableExecuteCommand(@Nullable Boolean enableExecuteCommand) {
            this.enableExecuteCommand = Input.ofNullable(enableExecuteCommand);
            return this;
        }

        public Builder setForceNewDeployment(@Nullable Input<Boolean> forceNewDeployment) {
            this.forceNewDeployment = forceNewDeployment;
            return this;
        }

        public Builder setForceNewDeployment(@Nullable Boolean forceNewDeployment) {
            this.forceNewDeployment = Input.ofNullable(forceNewDeployment);
            return this;
        }

        public Builder setHealthCheckGracePeriodSeconds(@Nullable Input<Integer> healthCheckGracePeriodSeconds) {
            this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
            return this;
        }

        public Builder setHealthCheckGracePeriodSeconds(@Nullable Integer healthCheckGracePeriodSeconds) {
            this.healthCheckGracePeriodSeconds = Input.ofNullable(healthCheckGracePeriodSeconds);
            return this;
        }

        public Builder setIamRole(@Nullable Input<String> iamRole) {
            this.iamRole = iamRole;
            return this;
        }

        public Builder setIamRole(@Nullable String iamRole) {
            this.iamRole = Input.ofNullable(iamRole);
            return this;
        }

        public Builder setLaunchType(@Nullable Input<String> launchType) {
            this.launchType = launchType;
            return this;
        }

        public Builder setLaunchType(@Nullable String launchType) {
            this.launchType = Input.ofNullable(launchType);
            return this;
        }

        public Builder setLoadBalancers(@Nullable Input<List<ServiceLoadBalancerArgs>> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        public Builder setLoadBalancers(@Nullable List<ServiceLoadBalancerArgs> loadBalancers) {
            this.loadBalancers = Input.ofNullable(loadBalancers);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetworkConfiguration(@Nullable Input<ServiceNetworkConfigurationArgs> networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        public Builder setNetworkConfiguration(@Nullable ServiceNetworkConfigurationArgs networkConfiguration) {
            this.networkConfiguration = Input.ofNullable(networkConfiguration);
            return this;
        }

        public Builder setOrderedPlacementStrategies(@Nullable Input<List<ServiceOrderedPlacementStrategyArgs>> orderedPlacementStrategies) {
            this.orderedPlacementStrategies = orderedPlacementStrategies;
            return this;
        }

        public Builder setOrderedPlacementStrategies(@Nullable List<ServiceOrderedPlacementStrategyArgs> orderedPlacementStrategies) {
            this.orderedPlacementStrategies = Input.ofNullable(orderedPlacementStrategies);
            return this;
        }

        public Builder setPlacementConstraints(@Nullable Input<List<ServicePlacementConstraintArgs>> placementConstraints) {
            this.placementConstraints = placementConstraints;
            return this;
        }

        public Builder setPlacementConstraints(@Nullable List<ServicePlacementConstraintArgs> placementConstraints) {
            this.placementConstraints = Input.ofNullable(placementConstraints);
            return this;
        }

        public Builder setPlatformVersion(@Nullable Input<String> platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }

        public Builder setPlatformVersion(@Nullable String platformVersion) {
            this.platformVersion = Input.ofNullable(platformVersion);
            return this;
        }

        public Builder setPropagateTags(@Nullable Input<String> propagateTags) {
            this.propagateTags = propagateTags;
            return this;
        }

        public Builder setPropagateTags(@Nullable String propagateTags) {
            this.propagateTags = Input.ofNullable(propagateTags);
            return this;
        }

        public Builder setSchedulingStrategy(@Nullable Input<String> schedulingStrategy) {
            this.schedulingStrategy = schedulingStrategy;
            return this;
        }

        public Builder setSchedulingStrategy(@Nullable String schedulingStrategy) {
            this.schedulingStrategy = Input.ofNullable(schedulingStrategy);
            return this;
        }

        public Builder setServiceRegistries(@Nullable Input<ServiceServiceRegistriesArgs> serviceRegistries) {
            this.serviceRegistries = serviceRegistries;
            return this;
        }

        public Builder setServiceRegistries(@Nullable ServiceServiceRegistriesArgs serviceRegistries) {
            this.serviceRegistries = Input.ofNullable(serviceRegistries);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTaskDefinition(@Nullable Input<String> taskDefinition) {
            this.taskDefinition = taskDefinition;
            return this;
        }

        public Builder setTaskDefinition(@Nullable String taskDefinition) {
            this.taskDefinition = Input.ofNullable(taskDefinition);
            return this;
        }

        public Builder setWaitForSteadyState(@Nullable Input<Boolean> waitForSteadyState) {
            this.waitForSteadyState = waitForSteadyState;
            return this;
        }

        public Builder setWaitForSteadyState(@Nullable Boolean waitForSteadyState) {
            this.waitForSteadyState = Input.ofNullable(waitForSteadyState);
            return this;
        }
        public ServiceArgs build() {
            return new ServiceArgs(capacityProviderStrategies, cluster, deploymentCircuitBreaker, deploymentController, deploymentMaximumPercent, deploymentMinimumHealthyPercent, desiredCount, enableEcsManagedTags, enableExecuteCommand, forceNewDeployment, healthCheckGracePeriodSeconds, iamRole, launchType, loadBalancers, name, networkConfiguration, orderedPlacementStrategies, placementConstraints, platformVersion, propagateTags, schedulingStrategy, serviceRegistries, tags, taskDefinition, waitForSteadyState);
        }
    }
}
