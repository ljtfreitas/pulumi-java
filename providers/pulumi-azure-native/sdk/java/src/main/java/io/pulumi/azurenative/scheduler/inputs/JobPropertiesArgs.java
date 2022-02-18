// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.enums.JobState;
import io.pulumi.azurenative.scheduler.inputs.JobActionArgs;
import io.pulumi.azurenative.scheduler.inputs.JobRecurrenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobPropertiesArgs Empty = new JobPropertiesArgs();

    /**
     * Gets or sets the job action.
     * 
     */
    @InputImport(name="action")
    private final @Nullable Input<JobActionArgs> action;

    public Input<JobActionArgs> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * Gets or sets the job recurrence.
     * 
     */
    @InputImport(name="recurrence")
    private final @Nullable Input<JobRecurrenceArgs> recurrence;

    public Input<JobRecurrenceArgs> getRecurrence() {
        return this.recurrence == null ? Input.empty() : this.recurrence;
    }

    /**
     * Gets or sets the job start time.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * Gets or set the job state.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<JobState> state;

    public Input<JobState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public JobPropertiesArgs(
        @Nullable Input<JobActionArgs> action,
        @Nullable Input<JobRecurrenceArgs> recurrence,
        @Nullable Input<String> startTime,
        @Nullable Input<JobState> state) {
        this.action = action;
        this.recurrence = recurrence;
        this.startTime = startTime;
        this.state = state;
    }

    private JobPropertiesArgs() {
        this.action = Input.empty();
        this.recurrence = Input.empty();
        this.startTime = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JobActionArgs> action;
        private @Nullable Input<JobRecurrenceArgs> recurrence;
        private @Nullable Input<String> startTime;
        private @Nullable Input<JobState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.recurrence = defaults.recurrence;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder setAction(@Nullable Input<JobActionArgs> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable JobActionArgs action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setRecurrence(@Nullable Input<JobRecurrenceArgs> recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        public Builder setRecurrence(@Nullable JobRecurrenceArgs recurrence) {
            this.recurrence = Input.ofNullable(recurrence);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setState(@Nullable Input<JobState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable JobState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public JobPropertiesArgs build() {
            return new JobPropertiesArgs(action, recurrence, startTime, state);
        }
    }
}
