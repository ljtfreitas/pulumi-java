// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowDefinitionHumanLoopConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowDefinitionHumanLoopConfigGetArgs Empty = new FlowDefinitionHumanLoopConfigGetArgs();

    /**
     * The Amazon Resource Name (ARN) of the human task user interface.
     * 
     */
    @InputImport(name="humanTaskUiArn", required=true)
    private final Input<String> humanTaskUiArn;

    public Input<String> getHumanTaskUiArn() {
        return this.humanTaskUiArn;
    }

    /**
     * Defines the amount of money paid to an Amazon Mechanical Turk worker for each task performed. See Public Workforce Task Price details below.
     * 
     */
    @InputImport(name="publicWorkforceTaskPrice")
    private final @Nullable Input<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs> publicWorkforceTaskPrice;

    public Input<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs> getPublicWorkforceTaskPrice() {
        return this.publicWorkforceTaskPrice == null ? Input.empty() : this.publicWorkforceTaskPrice;
    }

    /**
     * The length of time that a task remains available for review by human workers. Valid value range between `1` and `864000`.
     * 
     */
    @InputImport(name="taskAvailabilityLifetimeInSeconds")
    private final @Nullable Input<Integer> taskAvailabilityLifetimeInSeconds;

    public Input<Integer> getTaskAvailabilityLifetimeInSeconds() {
        return this.taskAvailabilityLifetimeInSeconds == null ? Input.empty() : this.taskAvailabilityLifetimeInSeconds;
    }

    /**
     * The number of distinct workers who will perform the same task on each object. Valid value range between `1` and `3`.
     * 
     */
    @InputImport(name="taskCount", required=true)
    private final Input<Integer> taskCount;

    public Input<Integer> getTaskCount() {
        return this.taskCount;
    }

    /**
     * A description for the human worker task.
     * 
     */
    @InputImport(name="taskDescription", required=true)
    private final Input<String> taskDescription;

    public Input<String> getTaskDescription() {
        return this.taskDescription;
    }

    /**
     * An array of keywords used to describe the task so that workers can discover the task.
     * 
     */
    @InputImport(name="taskKeywords")
    private final @Nullable Input<List<String>> taskKeywords;

    public Input<List<String>> getTaskKeywords() {
        return this.taskKeywords == null ? Input.empty() : this.taskKeywords;
    }

    /**
     * The amount of time that a worker has to complete a task. The default value is `3600` seconds.
     * 
     */
    @InputImport(name="taskTimeLimitInSeconds")
    private final @Nullable Input<Integer> taskTimeLimitInSeconds;

    public Input<Integer> getTaskTimeLimitInSeconds() {
        return this.taskTimeLimitInSeconds == null ? Input.empty() : this.taskTimeLimitInSeconds;
    }

    /**
     * A title for the human worker task.
     * 
     */
    @InputImport(name="taskTitle", required=true)
    private final Input<String> taskTitle;

    public Input<String> getTaskTitle() {
        return this.taskTitle;
    }

    /**
     * The Amazon Resource Name (ARN) of the human task user interface. Amazon Resource Name (ARN) of a team of workers. For Public workforces see [AWS Docs](https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-management-public.html).
     * 
     */
    @InputImport(name="workteamArn", required=true)
    private final Input<String> workteamArn;

    public Input<String> getWorkteamArn() {
        return this.workteamArn;
    }

    public FlowDefinitionHumanLoopConfigGetArgs(
        Input<String> humanTaskUiArn,
        @Nullable Input<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs> publicWorkforceTaskPrice,
        @Nullable Input<Integer> taskAvailabilityLifetimeInSeconds,
        Input<Integer> taskCount,
        Input<String> taskDescription,
        @Nullable Input<List<String>> taskKeywords,
        @Nullable Input<Integer> taskTimeLimitInSeconds,
        Input<String> taskTitle,
        Input<String> workteamArn) {
        this.humanTaskUiArn = Objects.requireNonNull(humanTaskUiArn, "expected parameter 'humanTaskUiArn' to be non-null");
        this.publicWorkforceTaskPrice = publicWorkforceTaskPrice;
        this.taskAvailabilityLifetimeInSeconds = taskAvailabilityLifetimeInSeconds;
        this.taskCount = Objects.requireNonNull(taskCount, "expected parameter 'taskCount' to be non-null");
        this.taskDescription = Objects.requireNonNull(taskDescription, "expected parameter 'taskDescription' to be non-null");
        this.taskKeywords = taskKeywords;
        this.taskTimeLimitInSeconds = taskTimeLimitInSeconds;
        this.taskTitle = Objects.requireNonNull(taskTitle, "expected parameter 'taskTitle' to be non-null");
        this.workteamArn = Objects.requireNonNull(workteamArn, "expected parameter 'workteamArn' to be non-null");
    }

    private FlowDefinitionHumanLoopConfigGetArgs() {
        this.humanTaskUiArn = Input.empty();
        this.publicWorkforceTaskPrice = Input.empty();
        this.taskAvailabilityLifetimeInSeconds = Input.empty();
        this.taskCount = Input.empty();
        this.taskDescription = Input.empty();
        this.taskKeywords = Input.empty();
        this.taskTimeLimitInSeconds = Input.empty();
        this.taskTitle = Input.empty();
        this.workteamArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionHumanLoopConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> humanTaskUiArn;
        private @Nullable Input<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs> publicWorkforceTaskPrice;
        private @Nullable Input<Integer> taskAvailabilityLifetimeInSeconds;
        private Input<Integer> taskCount;
        private Input<String> taskDescription;
        private @Nullable Input<List<String>> taskKeywords;
        private @Nullable Input<Integer> taskTimeLimitInSeconds;
        private Input<String> taskTitle;
        private Input<String> workteamArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionHumanLoopConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.humanTaskUiArn = defaults.humanTaskUiArn;
    	      this.publicWorkforceTaskPrice = defaults.publicWorkforceTaskPrice;
    	      this.taskAvailabilityLifetimeInSeconds = defaults.taskAvailabilityLifetimeInSeconds;
    	      this.taskCount = defaults.taskCount;
    	      this.taskDescription = defaults.taskDescription;
    	      this.taskKeywords = defaults.taskKeywords;
    	      this.taskTimeLimitInSeconds = defaults.taskTimeLimitInSeconds;
    	      this.taskTitle = defaults.taskTitle;
    	      this.workteamArn = defaults.workteamArn;
        }

        public Builder setHumanTaskUiArn(Input<String> humanTaskUiArn) {
            this.humanTaskUiArn = Objects.requireNonNull(humanTaskUiArn);
            return this;
        }

        public Builder setHumanTaskUiArn(String humanTaskUiArn) {
            this.humanTaskUiArn = Input.of(Objects.requireNonNull(humanTaskUiArn));
            return this;
        }

        public Builder setPublicWorkforceTaskPrice(@Nullable Input<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs> publicWorkforceTaskPrice) {
            this.publicWorkforceTaskPrice = publicWorkforceTaskPrice;
            return this;
        }

        public Builder setPublicWorkforceTaskPrice(@Nullable FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs publicWorkforceTaskPrice) {
            this.publicWorkforceTaskPrice = Input.ofNullable(publicWorkforceTaskPrice);
            return this;
        }

        public Builder setTaskAvailabilityLifetimeInSeconds(@Nullable Input<Integer> taskAvailabilityLifetimeInSeconds) {
            this.taskAvailabilityLifetimeInSeconds = taskAvailabilityLifetimeInSeconds;
            return this;
        }

        public Builder setTaskAvailabilityLifetimeInSeconds(@Nullable Integer taskAvailabilityLifetimeInSeconds) {
            this.taskAvailabilityLifetimeInSeconds = Input.ofNullable(taskAvailabilityLifetimeInSeconds);
            return this;
        }

        public Builder setTaskCount(Input<Integer> taskCount) {
            this.taskCount = Objects.requireNonNull(taskCount);
            return this;
        }

        public Builder setTaskCount(Integer taskCount) {
            this.taskCount = Input.of(Objects.requireNonNull(taskCount));
            return this;
        }

        public Builder setTaskDescription(Input<String> taskDescription) {
            this.taskDescription = Objects.requireNonNull(taskDescription);
            return this;
        }

        public Builder setTaskDescription(String taskDescription) {
            this.taskDescription = Input.of(Objects.requireNonNull(taskDescription));
            return this;
        }

        public Builder setTaskKeywords(@Nullable Input<List<String>> taskKeywords) {
            this.taskKeywords = taskKeywords;
            return this;
        }

        public Builder setTaskKeywords(@Nullable List<String> taskKeywords) {
            this.taskKeywords = Input.ofNullable(taskKeywords);
            return this;
        }

        public Builder setTaskTimeLimitInSeconds(@Nullable Input<Integer> taskTimeLimitInSeconds) {
            this.taskTimeLimitInSeconds = taskTimeLimitInSeconds;
            return this;
        }

        public Builder setTaskTimeLimitInSeconds(@Nullable Integer taskTimeLimitInSeconds) {
            this.taskTimeLimitInSeconds = Input.ofNullable(taskTimeLimitInSeconds);
            return this;
        }

        public Builder setTaskTitle(Input<String> taskTitle) {
            this.taskTitle = Objects.requireNonNull(taskTitle);
            return this;
        }

        public Builder setTaskTitle(String taskTitle) {
            this.taskTitle = Input.of(Objects.requireNonNull(taskTitle));
            return this;
        }

        public Builder setWorkteamArn(Input<String> workteamArn) {
            this.workteamArn = Objects.requireNonNull(workteamArn);
            return this;
        }

        public Builder setWorkteamArn(String workteamArn) {
            this.workteamArn = Input.of(Objects.requireNonNull(workteamArn));
            return this;
        }
        public FlowDefinitionHumanLoopConfigGetArgs build() {
            return new FlowDefinitionHumanLoopConfigGetArgs(humanTaskUiArn, publicWorkforceTaskPrice, taskAvailabilityLifetimeInSeconds, taskCount, taskDescription, taskKeywords, taskTimeLimitInSeconds, taskTitle, workteamArn);
        }
    }
}