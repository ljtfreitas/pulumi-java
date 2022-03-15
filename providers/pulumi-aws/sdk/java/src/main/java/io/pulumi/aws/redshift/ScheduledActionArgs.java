// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift;

import io.pulumi.aws.redshift.inputs.ScheduledActionTargetActionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduledActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledActionArgs Empty = new ScheduledActionArgs();

    /**
     * The description of the scheduled action.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Whether to enable the scheduled action. Default is `true` .
     * 
     */
    @Import(name="enable")
      private final @Nullable Output<Boolean> enable;

    public Output<Boolean> getEnable() {
        return this.enable == null ? Output.empty() : this.enable;
    }

    /**
     * The end time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> getEndTime() {
        return this.endTime == null ? Output.empty() : this.endTime;
    }

    /**
     * The IAM role to assume to run the scheduled action.
     * 
     */
    @Import(name="iamRole", required=true)
      private final Output<String> iamRole;

    public Output<String> getIamRole() {
        return this.iamRole;
    }

    /**
     * The scheduled action name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The schedule of action. The schedule is defined format of "at expression" or "cron expression", for example `at(2016-03-04T17:27:00)` or `cron(0 10 ? * MON *)`. See [Scheduled Action](https://docs.aws.amazon.com/redshift/latest/APIReference/API_ScheduledAction.html) for more information.
     * 
     */
    @Import(name="schedule", required=true)
      private final Output<String> schedule;

    public Output<String> getSchedule() {
        return this.schedule;
    }

    /**
     * The start time in UTC when the schedule is active, in UTC RFC3339 format(for example, YYYY-MM-DDTHH:MM:SSZ).
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    /**
     * Target action. Documented below.
     * 
     */
    @Import(name="targetAction", required=true)
      private final Output<ScheduledActionTargetActionArgs> targetAction;

    public Output<ScheduledActionTargetActionArgs> getTargetAction() {
        return this.targetAction;
    }

    public ScheduledActionArgs(
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enable,
        @Nullable Output<String> endTime,
        Output<String> iamRole,
        @Nullable Output<String> name,
        Output<String> schedule,
        @Nullable Output<String> startTime,
        Output<ScheduledActionTargetActionArgs> targetAction) {
        this.description = description;
        this.enable = enable;
        this.endTime = endTime;
        this.iamRole = Objects.requireNonNull(iamRole, "expected parameter 'iamRole' to be non-null");
        this.name = name;
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.startTime = startTime;
        this.targetAction = Objects.requireNonNull(targetAction, "expected parameter 'targetAction' to be non-null");
    }

    private ScheduledActionArgs() {
        this.description = Output.empty();
        this.enable = Output.empty();
        this.endTime = Output.empty();
        this.iamRole = Output.empty();
        this.name = Output.empty();
        this.schedule = Output.empty();
        this.startTime = Output.empty();
        this.targetAction = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enable;
        private @Nullable Output<String> endTime;
        private Output<String> iamRole;
        private @Nullable Output<String> name;
        private Output<String> schedule;
        private @Nullable Output<String> startTime;
        private Output<ScheduledActionTargetActionArgs> targetAction;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.enable = defaults.enable;
    	      this.endTime = defaults.endTime;
    	      this.iamRole = defaults.iamRole;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.startTime = defaults.startTime;
    	      this.targetAction = defaults.targetAction;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            this.enable = enable;
            return this;
        }

        public Builder enable(@Nullable Boolean enable) {
            this.enable = Output.ofNullable(enable);
            return this;
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder endTime(@Nullable String endTime) {
            this.endTime = Output.ofNullable(endTime);
            return this;
        }

        public Builder iamRole(Output<String> iamRole) {
            this.iamRole = Objects.requireNonNull(iamRole);
            return this;
        }

        public Builder iamRole(String iamRole) {
            this.iamRole = Output.of(Objects.requireNonNull(iamRole));
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

        public Builder schedule(Output<String> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder schedule(String schedule) {
            this.schedule = Output.of(Objects.requireNonNull(schedule));
            return this;
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }

        public Builder targetAction(Output<ScheduledActionTargetActionArgs> targetAction) {
            this.targetAction = Objects.requireNonNull(targetAction);
            return this;
        }

        public Builder targetAction(ScheduledActionTargetActionArgs targetAction) {
            this.targetAction = Output.of(Objects.requireNonNull(targetAction));
            return this;
        }
        public ScheduledActionArgs build() {
            return new ScheduledActionArgs(description, enable, endTime, iamRole, name, schedule, startTime, targetAction);
        }
    }
}
