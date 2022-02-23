// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.aws.cloudwatch.outputs.EventTargetEcsTargetNetworkConfiguration;
import io.pulumi.aws.cloudwatch.outputs.EventTargetEcsTargetPlacementConstraint;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventTargetEcsTarget {
    /**
     * Specifies whether to enable Amazon ECS managed tags for the task.
     * 
     */
    private final @Nullable Boolean enableEcsManagedTags;
    /**
     * Whether or not to enable the execute command functionality for the containers in this task. If true, this enables execute command functionality on all containers in the task.
     * 
     */
    private final @Nullable Boolean enableExecuteCommand;
    /**
     * Specifies an ECS task group for the task. The maximum length is 255 characters.
     * 
     */
    private final @Nullable String group;
    /**
     * Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. Valid values include: an empty string `""` (to specify no launch type), `EC2`, or `FARGATE`.
     * 
     */
    private final @Nullable String launchType;
    /**
     * Use this if the ECS task uses the awsvpc network mode. This specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. Required if launch_type is FARGATE because the awsvpc mode is required for Fargate tasks.
     * 
     */
    private final @Nullable EventTargetEcsTargetNetworkConfiguration networkConfiguration;
    /**
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task (including constraints in the task definition and those specified at runtime). See Below.
     * 
     */
    private final @Nullable List<EventTargetEcsTargetPlacementConstraint> placementConstraints;
    /**
     * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This is used only if LaunchType is FARGATE. For more information about valid platform versions, see [AWS Fargate Platform Versions](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    private final @Nullable String platformVersion;
    /**
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags are not propagated. Tags can only be propagated to the task during task creation.
     * 
     */
    private final @Nullable String propagateTags;
    /**
     * A map of tags to assign to ecs resources.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The number of tasks to create based on the TaskDefinition. The default is 1.
     * 
     */
    private final @Nullable Integer taskCount;
    /**
     * The ARN of the task definition to use if the event target is an Amazon ECS cluster.
     * 
     */
    private final String taskDefinitionArn;

    @OutputCustomType.Constructor({"enableEcsManagedTags","enableExecuteCommand","group","launchType","networkConfiguration","placementConstraints","platformVersion","propagateTags","tags","taskCount","taskDefinitionArn"})
    private EventTargetEcsTarget(
        @Nullable Boolean enableEcsManagedTags,
        @Nullable Boolean enableExecuteCommand,
        @Nullable String group,
        @Nullable String launchType,
        @Nullable EventTargetEcsTargetNetworkConfiguration networkConfiguration,
        @Nullable List<EventTargetEcsTargetPlacementConstraint> placementConstraints,
        @Nullable String platformVersion,
        @Nullable String propagateTags,
        @Nullable Map<String,String> tags,
        @Nullable Integer taskCount,
        String taskDefinitionArn) {
        this.enableEcsManagedTags = enableEcsManagedTags;
        this.enableExecuteCommand = enableExecuteCommand;
        this.group = group;
        this.launchType = launchType;
        this.networkConfiguration = networkConfiguration;
        this.placementConstraints = placementConstraints;
        this.platformVersion = platformVersion;
        this.propagateTags = propagateTags;
        this.tags = tags;
        this.taskCount = taskCount;
        this.taskDefinitionArn = Objects.requireNonNull(taskDefinitionArn);
    }

    /**
     * Specifies whether to enable Amazon ECS managed tags for the task.
     * 
     */
    public Optional<Boolean> getEnableEcsManagedTags() {
        return Optional.ofNullable(this.enableEcsManagedTags);
    }
    /**
     * Whether or not to enable the execute command functionality for the containers in this task. If true, this enables execute command functionality on all containers in the task.
     * 
     */
    public Optional<Boolean> getEnableExecuteCommand() {
        return Optional.ofNullable(this.enableExecuteCommand);
    }
    /**
     * Specifies an ECS task group for the task. The maximum length is 255 characters.
     * 
     */
    public Optional<String> getGroup() {
        return Optional.ofNullable(this.group);
    }
    /**
     * Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. Valid values include: an empty string `""` (to specify no launch type), `EC2`, or `FARGATE`.
     * 
     */
    public Optional<String> getLaunchType() {
        return Optional.ofNullable(this.launchType);
    }
    /**
     * Use this if the ECS task uses the awsvpc network mode. This specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. Required if launch_type is FARGATE because the awsvpc mode is required for Fargate tasks.
     * 
     */
    public Optional<EventTargetEcsTargetNetworkConfiguration> getNetworkConfiguration() {
        return Optional.ofNullable(this.networkConfiguration);
    }
    /**
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task (including constraints in the task definition and those specified at runtime). See Below.
     * 
     */
    public List<EventTargetEcsTargetPlacementConstraint> getPlacementConstraints() {
        return this.placementConstraints == null ? List.of() : this.placementConstraints;
    }
    /**
     * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This is used only if LaunchType is FARGATE. For more information about valid platform versions, see [AWS Fargate Platform Versions](http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    public Optional<String> getPlatformVersion() {
        return Optional.ofNullable(this.platformVersion);
    }
    /**
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags are not propagated. Tags can only be propagated to the task during task creation.
     * 
     */
    public Optional<String> getPropagateTags() {
        return Optional.ofNullable(this.propagateTags);
    }
    /**
     * A map of tags to assign to ecs resources.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The number of tasks to create based on the TaskDefinition. The default is 1.
     * 
     */
    public Optional<Integer> getTaskCount() {
        return Optional.ofNullable(this.taskCount);
    }
    /**
     * The ARN of the task definition to use if the event target is an Amazon ECS cluster.
     * 
     */
    public String getTaskDefinitionArn() {
        return this.taskDefinitionArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetEcsTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableEcsManagedTags;
        private @Nullable Boolean enableExecuteCommand;
        private @Nullable String group;
        private @Nullable String launchType;
        private @Nullable EventTargetEcsTargetNetworkConfiguration networkConfiguration;
        private @Nullable List<EventTargetEcsTargetPlacementConstraint> placementConstraints;
        private @Nullable String platformVersion;
        private @Nullable String propagateTags;
        private @Nullable Map<String,String> tags;
        private @Nullable Integer taskCount;
        private String taskDefinitionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetEcsTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableEcsManagedTags = defaults.enableEcsManagedTags;
    	      this.enableExecuteCommand = defaults.enableExecuteCommand;
    	      this.group = defaults.group;
    	      this.launchType = defaults.launchType;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.placementConstraints = defaults.placementConstraints;
    	      this.platformVersion = defaults.platformVersion;
    	      this.propagateTags = defaults.propagateTags;
    	      this.tags = defaults.tags;
    	      this.taskCount = defaults.taskCount;
    	      this.taskDefinitionArn = defaults.taskDefinitionArn;
        }

        public Builder setEnableEcsManagedTags(@Nullable Boolean enableEcsManagedTags) {
            this.enableEcsManagedTags = enableEcsManagedTags;
            return this;
        }

        public Builder setEnableExecuteCommand(@Nullable Boolean enableExecuteCommand) {
            this.enableExecuteCommand = enableExecuteCommand;
            return this;
        }

        public Builder setGroup(@Nullable String group) {
            this.group = group;
            return this;
        }

        public Builder setLaunchType(@Nullable String launchType) {
            this.launchType = launchType;
            return this;
        }

        public Builder setNetworkConfiguration(@Nullable EventTargetEcsTargetNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        public Builder setPlacementConstraints(@Nullable List<EventTargetEcsTargetPlacementConstraint> placementConstraints) {
            this.placementConstraints = placementConstraints;
            return this;
        }

        public Builder setPlatformVersion(@Nullable String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }

        public Builder setPropagateTags(@Nullable String propagateTags) {
            this.propagateTags = propagateTags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTaskCount(@Nullable Integer taskCount) {
            this.taskCount = taskCount;
            return this;
        }

        public Builder setTaskDefinitionArn(String taskDefinitionArn) {
            this.taskDefinitionArn = Objects.requireNonNull(taskDefinitionArn);
            return this;
        }
        public EventTargetEcsTarget build() {
            return new EventTargetEcsTarget(enableEcsManagedTags, enableExecuteCommand, group, launchType, networkConfiguration, placementConstraints, platformVersion, propagateTags, tags, taskCount, taskDefinitionArn);
        }
    }
}
