// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="appEngineHttpTarget")
        private final @Nullable Input<JobAppEngineHttpTargetGetArgs> appEngineHttpTarget;

    public Input<JobAppEngineHttpTargetGetArgs> getAppEngineHttpTarget() {
        return this.appEngineHttpTarget == null ? Input.empty() : this.appEngineHttpTarget;
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
    @InputImport(name="attemptDeadline")
        private final @Nullable Input<String> attemptDeadline;

    public Input<String> getAttemptDeadline() {
        return this.attemptDeadline == null ? Input.empty() : this.attemptDeadline;
    }

    /**
     * A human-readable description for the job.
     * This string must not contain more than 500 characters.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * HTTP target.
     * If the job providers a http_target the cron will
     * send a request to the targeted url
     * Structure is documented below.
     * 
     */
    @InputImport(name="httpTarget")
        private final @Nullable Input<JobHttpTargetGetArgs> httpTarget;

    public Input<JobHttpTargetGetArgs> getHttpTarget() {
        return this.httpTarget == null ? Input.empty() : this.httpTarget;
    }

    /**
     * The name of the job.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Pub/Sub target
     * If the job providers a Pub/Sub target the cron will publish
     * a message to the provided topic
     * Structure is documented below.
     * 
     */
    @InputImport(name="pubsubTarget")
        private final @Nullable Input<JobPubsubTargetGetArgs> pubsubTarget;

    public Input<JobPubsubTargetGetArgs> getPubsubTarget() {
        return this.pubsubTarget == null ? Input.empty() : this.pubsubTarget;
    }

    /**
     * Region where the scheduler job resides. If it is not provided, this provider will use the provider default.
     * 
     */
    @InputImport(name="region")
        private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * By default, if a job does not complete successfully,
     * meaning that an acknowledgement is not received from the handler,
     * then it will be retried with exponential backoff according to the settings
     * Structure is documented below.
     * 
     */
    @InputImport(name="retryConfig")
        private final @Nullable Input<JobRetryConfigGetArgs> retryConfig;

    public Input<JobRetryConfigGetArgs> getRetryConfig() {
        return this.retryConfig == null ? Input.empty() : this.retryConfig;
    }

    /**
     * Describes the schedule on which the job will be executed.
     * 
     */
    @InputImport(name="schedule")
        private final @Nullable Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * Specifies the time zone to be used in interpreting schedule.
     * The value of this field must be a time zone name from the tz database.
     * 
     */
    @InputImport(name="timeZone")
        private final @Nullable Input<String> timeZone;

    public Input<String> getTimeZone() {
        return this.timeZone == null ? Input.empty() : this.timeZone;
    }

    public JobState(
        @Nullable Input<JobAppEngineHttpTargetGetArgs> appEngineHttpTarget,
        @Nullable Input<String> attemptDeadline,
        @Nullable Input<String> description,
        @Nullable Input<JobHttpTargetGetArgs> httpTarget,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<JobPubsubTargetGetArgs> pubsubTarget,
        @Nullable Input<String> region,
        @Nullable Input<JobRetryConfigGetArgs> retryConfig,
        @Nullable Input<String> schedule,
        @Nullable Input<String> timeZone) {
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
        this.appEngineHttpTarget = Input.empty();
        this.attemptDeadline = Input.empty();
        this.description = Input.empty();
        this.httpTarget = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.pubsubTarget = Input.empty();
        this.region = Input.empty();
        this.retryConfig = Input.empty();
        this.schedule = Input.empty();
        this.timeZone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JobAppEngineHttpTargetGetArgs> appEngineHttpTarget;
        private @Nullable Input<String> attemptDeadline;
        private @Nullable Input<String> description;
        private @Nullable Input<JobHttpTargetGetArgs> httpTarget;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<JobPubsubTargetGetArgs> pubsubTarget;
        private @Nullable Input<String> region;
        private @Nullable Input<JobRetryConfigGetArgs> retryConfig;
        private @Nullable Input<String> schedule;
        private @Nullable Input<String> timeZone;

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

        public Builder setAppEngineHttpTarget(@Nullable Input<JobAppEngineHttpTargetGetArgs> appEngineHttpTarget) {
            this.appEngineHttpTarget = appEngineHttpTarget;
            return this;
        }

        public Builder setAppEngineHttpTarget(@Nullable JobAppEngineHttpTargetGetArgs appEngineHttpTarget) {
            this.appEngineHttpTarget = Input.ofNullable(appEngineHttpTarget);
            return this;
        }

        public Builder setAttemptDeadline(@Nullable Input<String> attemptDeadline) {
            this.attemptDeadline = attemptDeadline;
            return this;
        }

        public Builder setAttemptDeadline(@Nullable String attemptDeadline) {
            this.attemptDeadline = Input.ofNullable(attemptDeadline);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHttpTarget(@Nullable Input<JobHttpTargetGetArgs> httpTarget) {
            this.httpTarget = httpTarget;
            return this;
        }

        public Builder setHttpTarget(@Nullable JobHttpTargetGetArgs httpTarget) {
            this.httpTarget = Input.ofNullable(httpTarget);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setPubsubTarget(@Nullable Input<JobPubsubTargetGetArgs> pubsubTarget) {
            this.pubsubTarget = pubsubTarget;
            return this;
        }

        public Builder setPubsubTarget(@Nullable JobPubsubTargetGetArgs pubsubTarget) {
            this.pubsubTarget = Input.ofNullable(pubsubTarget);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setRetryConfig(@Nullable Input<JobRetryConfigGetArgs> retryConfig) {
            this.retryConfig = retryConfig;
            return this;
        }

        public Builder setRetryConfig(@Nullable JobRetryConfigGetArgs retryConfig) {
            this.retryConfig = Input.ofNullable(retryConfig);
            return this;
        }

        public Builder setSchedule(@Nullable Input<String> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable String schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder setTimeZone(@Nullable Input<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = Input.ofNullable(timeZone);
            return this;
        }
        public JobState build() {
            return new JobState(appEngineHttpTarget, attemptDeadline, description, httpTarget, name, project, pubsubTarget, region, retryConfig, schedule, timeZone);
        }
    }
}
