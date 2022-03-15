// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetGetArgs;
import io.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetGetArgs;
import io.pulumi.gcp.cloudscheduler.inputs.JobPubsubTargetGetArgs;
import io.pulumi.gcp.cloudscheduler.inputs.JobRetryConfigGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobState extends io.pulumi.resources.ResourceArgs {

    public static final JobState Empty = new JobState();

    /**
     * App Engine HTTP target.
     * If the job providers a App Engine HTTP target the cron will
     * send a request to the service instance
     * Structure is documented below.
     * 
     */
    @Import(name="appEngineHttpTarget")
      private final @Nullable Output<JobAppEngineHttpTargetGetArgs> appEngineHttpTarget;

    public Output<JobAppEngineHttpTargetGetArgs> getAppEngineHttpTarget() {
        return this.appEngineHttpTarget == null ? Output.empty() : this.appEngineHttpTarget;
    }

    /**
     * The deadline for job attempts. If the request handler does not respond by this deadline then the request is
     * cancelled and the attempt is marked as a DEADLINE_EXCEEDED failure. The failed attempt can be viewed in
     * execution logs. Cloud Scheduler will retry the job according to the RetryConfig.
     * The allowed duration for this deadline is:
     * * For HTTP targets, between 15 seconds and 30 minutes.
     * * For App Engine HTTP targets, between 15 seconds and 24 hours.
     * * **Note**: For PubSub targets, this field is ignored - setting it will introduce an unresolvable diff.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s"
     * 
     */
    @Import(name="attemptDeadline")
      private final @Nullable Output<String> attemptDeadline;

    public Output<String> getAttemptDeadline() {
        return this.attemptDeadline == null ? Output.empty() : this.attemptDeadline;
    }

    /**
     * A human-readable description for the job.
     * This string must not contain more than 500 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * HTTP target.
     * If the job providers a http_target the cron will
     * send a request to the targeted url
     * Structure is documented below.
     * 
     */
    @Import(name="httpTarget")
      private final @Nullable Output<JobHttpTargetGetArgs> httpTarget;

    public Output<JobHttpTargetGetArgs> getHttpTarget() {
        return this.httpTarget == null ? Output.empty() : this.httpTarget;
    }

    /**
     * The name of the job.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Pub/Sub target
     * If the job providers a Pub/Sub target the cron will publish
     * a message to the provided topic
     * Structure is documented below.
     * 
     */
    @Import(name="pubsubTarget")
      private final @Nullable Output<JobPubsubTargetGetArgs> pubsubTarget;

    public Output<JobPubsubTargetGetArgs> getPubsubTarget() {
        return this.pubsubTarget == null ? Output.empty() : this.pubsubTarget;
    }

    /**
     * Region where the scheduler job resides. If it is not provided, this provider will use the provider default.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * By default, if a job does not complete successfully,
     * meaning that an acknowledgement is not received from the handler,
     * then it will be retried with exponential backoff according to the settings
     * Structure is documented below.
     * 
     */
    @Import(name="retryConfig")
      private final @Nullable Output<JobRetryConfigGetArgs> retryConfig;

    public Output<JobRetryConfigGetArgs> getRetryConfig() {
        return this.retryConfig == null ? Output.empty() : this.retryConfig;
    }

    /**
     * Describes the schedule on which the job will be executed.
     * 
     */
    @Import(name="schedule")
      private final @Nullable Output<String> schedule;

    public Output<String> getSchedule() {
        return this.schedule == null ? Output.empty() : this.schedule;
    }

    /**
     * Specifies the time zone to be used in interpreting schedule.
     * The value of this field must be a time zone name from the tz database.
     * 
     */
    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone == null ? Output.empty() : this.timeZone;
    }

    public JobState(
        @Nullable Output<JobAppEngineHttpTargetGetArgs> appEngineHttpTarget,
        @Nullable Output<String> attemptDeadline,
        @Nullable Output<String> description,
        @Nullable Output<JobHttpTargetGetArgs> httpTarget,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<JobPubsubTargetGetArgs> pubsubTarget,
        @Nullable Output<String> region,
        @Nullable Output<JobRetryConfigGetArgs> retryConfig,
        @Nullable Output<String> schedule,
        @Nullable Output<String> timeZone) {
        this.appEngineHttpTarget = appEngineHttpTarget;
        this.attemptDeadline = attemptDeadline;
        this.description = description;
        this.httpTarget = httpTarget;
        this.name = name;
        this.project = project;
        this.pubsubTarget = pubsubTarget;
        this.region = region;
        this.retryConfig = retryConfig;
        this.schedule = schedule;
        this.timeZone = timeZone;
    }

    private JobState() {
        this.appEngineHttpTarget = Output.empty();
        this.attemptDeadline = Output.empty();
        this.description = Output.empty();
        this.httpTarget = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.pubsubTarget = Output.empty();
        this.region = Output.empty();
        this.retryConfig = Output.empty();
        this.schedule = Output.empty();
        this.timeZone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<JobAppEngineHttpTargetGetArgs> appEngineHttpTarget;
        private @Nullable Output<String> attemptDeadline;
        private @Nullable Output<String> description;
        private @Nullable Output<JobHttpTargetGetArgs> httpTarget;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<JobPubsubTargetGetArgs> pubsubTarget;
        private @Nullable Output<String> region;
        private @Nullable Output<JobRetryConfigGetArgs> retryConfig;
        private @Nullable Output<String> schedule;
        private @Nullable Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(JobState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineHttpTarget = defaults.appEngineHttpTarget;
    	      this.attemptDeadline = defaults.attemptDeadline;
    	      this.description = defaults.description;
    	      this.httpTarget = defaults.httpTarget;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pubsubTarget = defaults.pubsubTarget;
    	      this.region = defaults.region;
    	      this.retryConfig = defaults.retryConfig;
    	      this.schedule = defaults.schedule;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder appEngineHttpTarget(@Nullable Output<JobAppEngineHttpTargetGetArgs> appEngineHttpTarget) {
            this.appEngineHttpTarget = appEngineHttpTarget;
            return this;
        }

        public Builder appEngineHttpTarget(@Nullable JobAppEngineHttpTargetGetArgs appEngineHttpTarget) {
            this.appEngineHttpTarget = Output.ofNullable(appEngineHttpTarget);
            return this;
        }

        public Builder attemptDeadline(@Nullable Output<String> attemptDeadline) {
            this.attemptDeadline = attemptDeadline;
            return this;
        }

        public Builder attemptDeadline(@Nullable String attemptDeadline) {
            this.attemptDeadline = Output.ofNullable(attemptDeadline);
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

        public Builder httpTarget(@Nullable Output<JobHttpTargetGetArgs> httpTarget) {
            this.httpTarget = httpTarget;
            return this;
        }

        public Builder httpTarget(@Nullable JobHttpTargetGetArgs httpTarget) {
            this.httpTarget = Output.ofNullable(httpTarget);
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

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder pubsubTarget(@Nullable Output<JobPubsubTargetGetArgs> pubsubTarget) {
            this.pubsubTarget = pubsubTarget;
            return this;
        }

        public Builder pubsubTarget(@Nullable JobPubsubTargetGetArgs pubsubTarget) {
            this.pubsubTarget = Output.ofNullable(pubsubTarget);
            return this;
        }

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }

        public Builder retryConfig(@Nullable Output<JobRetryConfigGetArgs> retryConfig) {
            this.retryConfig = retryConfig;
            return this;
        }

        public Builder retryConfig(@Nullable JobRetryConfigGetArgs retryConfig) {
            this.retryConfig = Output.ofNullable(retryConfig);
            return this;
        }

        public Builder schedule(@Nullable Output<String> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable String schedule) {
            this.schedule = Output.ofNullable(schedule);
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
        public JobState build() {
            return new JobState(appEngineHttpTarget, attemptDeadline, description, httpTarget, name, project, pubsubTarget, region, retryConfig, schedule, timeZone);
        }
    }
}
