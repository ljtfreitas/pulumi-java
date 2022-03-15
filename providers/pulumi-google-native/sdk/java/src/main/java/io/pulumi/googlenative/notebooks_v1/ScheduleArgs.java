// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.notebooks_v1.enums.ScheduleState;
import io.pulumi.googlenative.notebooks_v1.inputs.ExecutionTemplateArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    /**
     * Cron-tab formatted schedule by which the job will execute. Format: minute, hour, day of month, month, day of week, e.g. 0 0 * * WED = every Wednesday More examples: https://crontab.guru/examples.html
     * 
     */
    @Import(name="cronSchedule")
      private final @Nullable Output<String> cronSchedule;

    public Output<String> getCronSchedule() {
        return this.cronSchedule == null ? Output.empty() : this.cronSchedule;
    }

    /**
     * A brief description of this environment.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Notebook Execution Template corresponding to this schedule.
     * 
     */
    @Import(name="executionTemplate")
      private final @Nullable Output<ExecutionTemplateArgs> executionTemplate;

    public Output<ExecutionTemplateArgs> getExecutionTemplate() {
        return this.executionTemplate == null ? Output.empty() : this.executionTemplate;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="scheduleId", required=true)
      private final Output<String> scheduleId;

    public Output<String> getScheduleId() {
        return this.scheduleId;
    }

    @Import(name="state")
      private final @Nullable Output<ScheduleState> state;

    public Output<ScheduleState> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * Timezone on which the cron_schedule. The value of this field must be a time zone name from the tz database. TZ Database: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string "utc". If a time zone is not specified, the default will be in UTC (also known as GMT).
     * 
     */
    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone == null ? Output.empty() : this.timeZone;
    }

    public ScheduleArgs(
        @Nullable Output<String> cronSchedule,
        @Nullable Output<String> description,
        @Nullable Output<ExecutionTemplateArgs> executionTemplate,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        Output<String> scheduleId,
        @Nullable Output<ScheduleState> state,
        @Nullable Output<String> timeZone) {
        this.cronSchedule = cronSchedule;
        this.description = description;
        this.executionTemplate = executionTemplate;
        this.location = location;
        this.project = project;
        this.scheduleId = Objects.requireNonNull(scheduleId, "expected parameter 'scheduleId' to be non-null");
        this.state = state;
        this.timeZone = timeZone;
    }

    private ScheduleArgs() {
        this.cronSchedule = Output.empty();
        this.description = Output.empty();
        this.executionTemplate = Output.empty();
        this.location = Output.empty();
        this.project = Output.empty();
        this.scheduleId = Output.empty();
        this.state = Output.empty();
        this.timeZone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cronSchedule;
        private @Nullable Output<String> description;
        private @Nullable Output<ExecutionTemplateArgs> executionTemplate;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private Output<String> scheduleId;
        private @Nullable Output<ScheduleState> state;
        private @Nullable Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronSchedule = defaults.cronSchedule;
    	      this.description = defaults.description;
    	      this.executionTemplate = defaults.executionTemplate;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.scheduleId = defaults.scheduleId;
    	      this.state = defaults.state;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder cronSchedule(@Nullable Output<String> cronSchedule) {
            this.cronSchedule = cronSchedule;
            return this;
        }

        public Builder cronSchedule(@Nullable String cronSchedule) {
            this.cronSchedule = Output.ofNullable(cronSchedule);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder executionTemplate(@Nullable Output<ExecutionTemplateArgs> executionTemplate) {
            this.executionTemplate = executionTemplate;
            return this;
        }

        public Builder executionTemplate(@Nullable ExecutionTemplateArgs executionTemplate) {
            this.executionTemplate = Output.ofNullable(executionTemplate);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder scheduleId(Output<String> scheduleId) {
            this.scheduleId = Objects.requireNonNull(scheduleId);
            return this;
        }

        public Builder scheduleId(String scheduleId) {
            this.scheduleId = Output.of(Objects.requireNonNull(scheduleId));
            return this;
        }

        public Builder state(@Nullable Output<ScheduleState> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable ScheduleState state) {
            this.state = Output.ofNullable(state);
            return this;
        }

        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Output.ofNullable(timeZone);
            return this;
        }
        public ScheduleArgs build() {
            return new ScheduleArgs(cronSchedule, description, executionTemplate, location, project, scheduleId, state, timeZone);
        }
    }
}
