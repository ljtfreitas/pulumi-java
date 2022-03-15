// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTargetGetArgs;
import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaintenanceWindowTaskState extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskState Empty = new MaintenanceWindowTaskState();

    /**
     * The description of the maintenance window task.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The maximum number of targets this task can be run for in parallel.
     * 
     */
    @Import(name="maxConcurrency")
      private final @Nullable Output<String> maxConcurrency;

    public Output<String> getMaxConcurrency() {
        return this.maxConcurrency == null ? Output.empty() : this.maxConcurrency;
    }

    /**
     * The maximum number of errors allowed before this task stops being scheduled.
     * 
     */
    @Import(name="maxErrors")
      private final @Nullable Output<String> maxErrors;

    public Output<String> getMaxErrors() {
        return this.maxErrors == null ? Output.empty() : this.maxErrors;
    }

    /**
     * The name of the maintenance window task.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    /**
     * The role that should be assumed when executing the task. If a role is not provided, Systems Manager uses your account's service-linked role. If no service-linked role for Systems Manager exists in your account, it is created for you.
     * 
     */
    @Import(name="serviceRoleArn")
      private final @Nullable Output<String> serviceRoleArn;

    public Output<String> getServiceRoleArn() {
        return this.serviceRoleArn == null ? Output.empty() : this.serviceRoleArn;
    }

    /**
     * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
     * 
     */
    @Import(name="targets")
      private final @Nullable Output<List<MaintenanceWindowTaskTargetGetArgs>> targets;

    public Output<List<MaintenanceWindowTaskTargetGetArgs>> getTargets() {
        return this.targets == null ? Output.empty() : this.targets;
    }

    /**
     * The ARN of the task to execute.
     * 
     */
    @Import(name="taskArn")
      private final @Nullable Output<String> taskArn;

    public Output<String> getTaskArn() {
        return this.taskArn == null ? Output.empty() : this.taskArn;
    }

    /**
     * Configuration block with parameters for task execution.
     * 
     */
    @Import(name="taskInvocationParameters")
      private final @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersGetArgs> taskInvocationParameters;

    public Output<MaintenanceWindowTaskTaskInvocationParametersGetArgs> getTaskInvocationParameters() {
        return this.taskInvocationParameters == null ? Output.empty() : this.taskInvocationParameters;
    }

    /**
     * The type of task being registered. Valid values: `AUTOMATION`, `LAMBDA`, `RUN_COMMAND` or `STEP_FUNCTIONS`.
     * 
     */
    @Import(name="taskType")
      private final @Nullable Output<String> taskType;

    public Output<String> getTaskType() {
        return this.taskType == null ? Output.empty() : this.taskType;
    }

    /**
     * The Id of the maintenance window to register the task with.
     * 
     */
    @Import(name="windowId")
      private final @Nullable Output<String> windowId;

    public Output<String> getWindowId() {
        return this.windowId == null ? Output.empty() : this.windowId;
    }

    public MaintenanceWindowTaskState(
        @Nullable Output<String> description,
        @Nullable Output<String> maxConcurrency,
        @Nullable Output<String> maxErrors,
        @Nullable Output<String> name,
        @Nullable Output<Integer> priority,
        @Nullable Output<String> serviceRoleArn,
        @Nullable Output<List<MaintenanceWindowTaskTargetGetArgs>> targets,
        @Nullable Output<String> taskArn,
        @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersGetArgs> taskInvocationParameters,
        @Nullable Output<String> taskType,
        @Nullable Output<String> windowId) {
        this.description = description;
        this.maxConcurrency = maxConcurrency;
        this.maxErrors = maxErrors;
        this.name = name;
        this.priority = priority;
        this.serviceRoleArn = serviceRoleArn;
        this.targets = targets;
        this.taskArn = taskArn;
        this.taskInvocationParameters = taskInvocationParameters;
        this.taskType = taskType;
        this.windowId = windowId;
    }

    private MaintenanceWindowTaskState() {
        this.description = Output.empty();
        this.maxConcurrency = Output.empty();
        this.maxErrors = Output.empty();
        this.name = Output.empty();
        this.priority = Output.empty();
        this.serviceRoleArn = Output.empty();
        this.targets = Output.empty();
        this.taskArn = Output.empty();
        this.taskInvocationParameters = Output.empty();
        this.taskType = Output.empty();
        this.windowId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> maxConcurrency;
        private @Nullable Output<String> maxErrors;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<String> serviceRoleArn;
        private @Nullable Output<List<MaintenanceWindowTaskTargetGetArgs>> targets;
        private @Nullable Output<String> taskArn;
        private @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersGetArgs> taskInvocationParameters;
        private @Nullable Output<String> taskType;
        private @Nullable Output<String> windowId;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.maxConcurrency = defaults.maxConcurrency;
    	      this.maxErrors = defaults.maxErrors;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.serviceRoleArn = defaults.serviceRoleArn;
    	      this.targets = defaults.targets;
    	      this.taskArn = defaults.taskArn;
    	      this.taskInvocationParameters = defaults.taskInvocationParameters;
    	      this.taskType = defaults.taskType;
    	      this.windowId = defaults.windowId;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder maxConcurrency(@Nullable Output<String> maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        public Builder maxConcurrency(@Nullable String maxConcurrency) {
            this.maxConcurrency = Output.ofNullable(maxConcurrency);
            return this;
        }

        public Builder maxErrors(@Nullable Output<String> maxErrors) {
            this.maxErrors = maxErrors;
            return this;
        }

        public Builder maxErrors(@Nullable String maxErrors) {
            this.maxErrors = Output.ofNullable(maxErrors);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = Output.ofNullable(priority);
            return this;
        }

        public Builder serviceRoleArn(@Nullable Output<String> serviceRoleArn) {
            this.serviceRoleArn = serviceRoleArn;
            return this;
        }

        public Builder serviceRoleArn(@Nullable String serviceRoleArn) {
            this.serviceRoleArn = Output.ofNullable(serviceRoleArn);
            return this;
        }

        public Builder targets(@Nullable Output<List<MaintenanceWindowTaskTargetGetArgs>> targets) {
            this.targets = targets;
            return this;
        }

        public Builder targets(@Nullable List<MaintenanceWindowTaskTargetGetArgs> targets) {
            this.targets = Output.ofNullable(targets);
            return this;
        }

        public Builder taskArn(@Nullable Output<String> taskArn) {
            this.taskArn = taskArn;
            return this;
        }

        public Builder taskArn(@Nullable String taskArn) {
            this.taskArn = Output.ofNullable(taskArn);
            return this;
        }

        public Builder taskInvocationParameters(@Nullable Output<MaintenanceWindowTaskTaskInvocationParametersGetArgs> taskInvocationParameters) {
            this.taskInvocationParameters = taskInvocationParameters;
            return this;
        }

        public Builder taskInvocationParameters(@Nullable MaintenanceWindowTaskTaskInvocationParametersGetArgs taskInvocationParameters) {
            this.taskInvocationParameters = Output.ofNullable(taskInvocationParameters);
            return this;
        }

        public Builder taskType(@Nullable Output<String> taskType) {
            this.taskType = taskType;
            return this;
        }

        public Builder taskType(@Nullable String taskType) {
            this.taskType = Output.ofNullable(taskType);
            return this;
        }

        public Builder windowId(@Nullable Output<String> windowId) {
            this.windowId = windowId;
            return this;
        }

        public Builder windowId(@Nullable String windowId) {
            this.windowId = Output.ofNullable(windowId);
            return this;
        }
        public MaintenanceWindowTaskState build() {
            return new MaintenanceWindowTaskState(description, maxConcurrency, maxErrors, name, priority, serviceRoleArn, targets, taskArn, taskInvocationParameters, taskType, windowId);
        }
    }
}
