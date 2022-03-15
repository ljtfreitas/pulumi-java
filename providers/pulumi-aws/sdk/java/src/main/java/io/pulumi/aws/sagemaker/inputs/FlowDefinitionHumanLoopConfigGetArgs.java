// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="humanTaskUiArn", required=true)
      private final Output<String> humanTaskUiArn;

    public Output<String> getHumanTaskUiArn() {
        return this.humanTaskUiArn;
    }

    /**
     * Defines the amount of money paid to an Amazon Mechanical Turk worker for each task performed. See Public Workforce Task Price details below.
     * 
     */
    @Import(name="publicWorkforceTaskPrice")
      private final @Nullable Output<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs> publicWorkforceTaskPrice;

    public Output<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs> getPublicWorkforceTaskPrice() {
        return this.publicWorkforceTaskPrice == null ? Output.empty() : this.publicWorkforceTaskPrice;
    }

    /**
     * The length of time that a task remains available for review by human workers. Valid value range between `1` and `864000`.
     * 
     */
    @Import(name="taskAvailabilityLifetimeInSeconds")
      private final @Nullable Output<Integer> taskAvailabilityLifetimeInSeconds;

    public Output<Integer> getTaskAvailabilityLifetimeInSeconds() {
        return this.taskAvailabilityLifetimeInSeconds == null ? Output.empty() : this.taskAvailabilityLifetimeInSeconds;
    }

    /**
     * The number of distinct workers who will perform the same task on each object. Valid value range between `1` and `3`.
     * 
     */
    @Import(name="taskCount", required=true)
      private final Output<Integer> taskCount;

    public Output<Integer> getTaskCount() {
        return this.taskCount;
    }

    /**
     * A description for the human worker task.
     * 
     */
    @Import(name="taskDescription", required=true)
      private final Output<String> taskDescription;

    public Output<String> getTaskDescription() {
        return this.taskDescription;
    }

    /**
     * An array of keywords used to describe the task so that workers can discover the task.
     * 
     */
    @Import(name="taskKeywords")
      private final @Nullable Output<List<String>> taskKeywords;

    public Output<List<String>> getTaskKeywords() {
        return this.taskKeywords == null ? Output.empty() : this.taskKeywords;
    }

    /**
     * The amount of time that a worker has to complete a task. The default value is `3600` seconds.
     * 
     */
    @Import(name="taskTimeLimitInSeconds")
      private final @Nullable Output<Integer> taskTimeLimitInSeconds;

    public Output<Integer> getTaskTimeLimitInSeconds() {
        return this.taskTimeLimitInSeconds == null ? Output.empty() : this.taskTimeLimitInSeconds;
    }

    /**
     * A title for the human worker task.
     * 
     */
    @Import(name="taskTitle", required=true)
      private final Output<String> taskTitle;

    public Output<String> getTaskTitle() {
        return this.taskTitle;
    }

    /**
     * The Amazon Resource Name (ARN) of the human task user interface. Amazon Resource Name (ARN) of a team of workers. For Public workforces see [AWS Docs](https://docs.aws.amazon.com/sagemaker/latest/dg/sms-workforce-management-public.html).
     * 
     */
    @Import(name="workteamArn", required=true)
      private final Output<String> workteamArn;

    public Output<String> getWorkteamArn() {
        return this.workteamArn;
    }

    public FlowDefinitionHumanLoopConfigGetArgs(
        Output<String> humanTaskUiArn,
        @Nullable Output<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs> publicWorkforceTaskPrice,
        @Nullable Output<Integer> taskAvailabilityLifetimeInSeconds,
        Output<Integer> taskCount,
        Output<String> taskDescription,
        @Nullable Output<List<String>> taskKeywords,
        @Nullable Output<Integer> taskTimeLimitInSeconds,
        Output<String> taskTitle,
        Output<String> workteamArn) {
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
        this.humanTaskUiArn = Output.empty();
        this.publicWorkforceTaskPrice = Output.empty();
        this.taskAvailabilityLifetimeInSeconds = Output.empty();
        this.taskCount = Output.empty();
        this.taskDescription = Output.empty();
        this.taskKeywords = Output.empty();
        this.taskTimeLimitInSeconds = Output.empty();
        this.taskTitle = Output.empty();
        this.workteamArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionHumanLoopConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> humanTaskUiArn;
        private @Nullable Output<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs> publicWorkforceTaskPrice;
        private @Nullable Output<Integer> taskAvailabilityLifetimeInSeconds;
        private Output<Integer> taskCount;
        private Output<String> taskDescription;
        private @Nullable Output<List<String>> taskKeywords;
        private @Nullable Output<Integer> taskTimeLimitInSeconds;
        private Output<String> taskTitle;
        private Output<String> workteamArn;

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

        public Builder humanTaskUiArn(Output<String> humanTaskUiArn) {
            this.humanTaskUiArn = Objects.requireNonNull(humanTaskUiArn);
            return this;
        }

        public Builder humanTaskUiArn(String humanTaskUiArn) {
            this.humanTaskUiArn = Output.of(Objects.requireNonNull(humanTaskUiArn));
            return this;
        }

        public Builder publicWorkforceTaskPrice(@Nullable Output<FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs> publicWorkforceTaskPrice) {
            this.publicWorkforceTaskPrice = publicWorkforceTaskPrice;
            return this;
        }

        public Builder publicWorkforceTaskPrice(@Nullable FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceGetArgs publicWorkforceTaskPrice) {
            this.publicWorkforceTaskPrice = Output.ofNullable(publicWorkforceTaskPrice);
            return this;
        }

        public Builder taskAvailabilityLifetimeInSeconds(@Nullable Output<Integer> taskAvailabilityLifetimeInSeconds) {
            this.taskAvailabilityLifetimeInSeconds = taskAvailabilityLifetimeInSeconds;
            return this;
        }

        public Builder taskAvailabilityLifetimeInSeconds(@Nullable Integer taskAvailabilityLifetimeInSeconds) {
            this.taskAvailabilityLifetimeInSeconds = Output.ofNullable(taskAvailabilityLifetimeInSeconds);
            return this;
        }

        public Builder taskCount(Output<Integer> taskCount) {
            this.taskCount = Objects.requireNonNull(taskCount);
            return this;
        }

        public Builder taskCount(Integer taskCount) {
            this.taskCount = Output.of(Objects.requireNonNull(taskCount));
            return this;
        }

        public Builder taskDescription(Output<String> taskDescription) {
            this.taskDescription = Objects.requireNonNull(taskDescription);
            return this;
        }

        public Builder taskDescription(String taskDescription) {
            this.taskDescription = Output.of(Objects.requireNonNull(taskDescription));
            return this;
        }

        public Builder taskKeywords(@Nullable Output<List<String>> taskKeywords) {
            this.taskKeywords = taskKeywords;
            return this;
        }

        public Builder taskKeywords(@Nullable List<String> taskKeywords) {
            this.taskKeywords = Output.ofNullable(taskKeywords);
            return this;
        }

        public Builder taskTimeLimitInSeconds(@Nullable Output<Integer> taskTimeLimitInSeconds) {
            this.taskTimeLimitInSeconds = taskTimeLimitInSeconds;
            return this;
        }

        public Builder taskTimeLimitInSeconds(@Nullable Integer taskTimeLimitInSeconds) {
            this.taskTimeLimitInSeconds = Output.ofNullable(taskTimeLimitInSeconds);
            return this;
        }

        public Builder taskTitle(Output<String> taskTitle) {
            this.taskTitle = Objects.requireNonNull(taskTitle);
            return this;
        }

        public Builder taskTitle(String taskTitle) {
            this.taskTitle = Output.of(Objects.requireNonNull(taskTitle));
            return this;
        }

        public Builder workteamArn(Output<String> workteamArn) {
            this.workteamArn = Objects.requireNonNull(workteamArn);
            return this;
        }

        public Builder workteamArn(String workteamArn) {
            this.workteamArn = Output.of(Objects.requireNonNull(workteamArn));
            return this;
        }
        public FlowDefinitionHumanLoopConfigGetArgs build() {
            return new FlowDefinitionHumanLoopConfigGetArgs(humanTaskUiArn, publicWorkforceTaskPrice, taskAvailabilityLifetimeInSeconds, taskCount, taskDescription, taskKeywords, taskTimeLimitInSeconds, taskTitle, workteamArn);
        }
    }
}
