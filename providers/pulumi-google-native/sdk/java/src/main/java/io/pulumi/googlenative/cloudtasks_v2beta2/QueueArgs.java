// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudtasks_v2beta2.inputs.AppEngineHttpTargetArgs;
import io.pulumi.googlenative.cloudtasks_v2beta2.inputs.PullTargetArgs;
import io.pulumi.googlenative.cloudtasks_v2beta2.inputs.RateLimitsArgs;
import io.pulumi.googlenative.cloudtasks_v2beta2.inputs.RetryConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueueArgs Empty = new QueueArgs();

    /**
     * App Engine HTTP target. An App Engine queue is a queue that has an AppEngineHttpTarget.
     * 
     */
    @InputImport(name="appEngineHttpTarget")
      private final @Nullable Input<AppEngineHttpTargetArgs> appEngineHttpTarget;

    public Input<AppEngineHttpTargetArgs> getAppEngineHttpTarget() {
        return this.appEngineHttpTarget == null ? Input.empty() : this.appEngineHttpTarget;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Caller-specified and required in CreateQueue, after which it becomes output only. The queue name. The queue name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the queue's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Pull target. A pull queue is a queue that has a PullTarget.
     * 
     */
    @InputImport(name="pullTarget")
      private final @Nullable Input<PullTargetArgs> pullTarget;

    public Input<PullTargetArgs> getPullTarget() {
        return this.pullTarget == null ? Input.empty() : this.pullTarget;
    }

    /**
     * Rate limits for task dispatches. rate_limits and retry_config are related because they both control task attempts however they control how tasks are attempted in different ways: * rate_limits controls the total rate of dispatches from a queue (i.e. all traffic dispatched from the queue, regardless of whether the dispatch is from a first attempt or a retry). * retry_config controls what happens to particular a task after its first attempt fails. That is, retry_config controls task retries (the second attempt, third attempt, etc).
     * 
     */
    @InputImport(name="rateLimits")
      private final @Nullable Input<RateLimitsArgs> rateLimits;

    public Input<RateLimitsArgs> getRateLimits() {
        return this.rateLimits == null ? Input.empty() : this.rateLimits;
    }

    /**
     * Settings that determine the retry behavior. * For tasks created using Cloud Tasks: the queue-level retry settings apply to all tasks in the queue that were created using Cloud Tasks. Retry settings cannot be set on individual tasks. * For tasks created using the App Engine SDK: the queue-level retry settings apply to all tasks in the queue which do not have retry settings explicitly set on the task and were created by the App Engine SDK. See [App Engine documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
     * 
     */
    @InputImport(name="retryConfig")
      private final @Nullable Input<RetryConfigArgs> retryConfig;

    public Input<RetryConfigArgs> getRetryConfig() {
        return this.retryConfig == null ? Input.empty() : this.retryConfig;
    }

    /**
     * The maximum amount of time that a task will be retained in this queue. Queues created by Cloud Tasks have a default `task_ttl` of 31 days. After a task has lived for `task_ttl`, the task will be deleted regardless of whether it was dispatched or not. The `task_ttl` for queues created via queue.yaml/xml is equal to the maximum duration because there is a [storage quota](https://cloud.google.com/appengine/quotas#Task_Queue) for these queues. To view the maximum valid duration, see the documentation for Duration.
     * 
     */
    @InputImport(name="taskTtl")
      private final @Nullable Input<String> taskTtl;

    public Input<String> getTaskTtl() {
        return this.taskTtl == null ? Input.empty() : this.taskTtl;
    }

    /**
     * The task tombstone time to live (TTL). After a task is deleted or completed, the task's tombstone is retained for the length of time specified by `tombstone_ttl`. The tombstone is used by task de-duplication; another task with the same name can't be created until the tombstone has expired. For more information about task de-duplication, see the documentation for CreateTaskRequest. Queues created by Cloud Tasks have a default `tombstone_ttl` of 1 hour.
     * 
     */
    @InputImport(name="tombstoneTtl")
      private final @Nullable Input<String> tombstoneTtl;

    public Input<String> getTombstoneTtl() {
        return this.tombstoneTtl == null ? Input.empty() : this.tombstoneTtl;
    }

    public QueueArgs(
        @Nullable Input<AppEngineHttpTargetArgs> appEngineHttpTarget,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<PullTargetArgs> pullTarget,
        @Nullable Input<RateLimitsArgs> rateLimits,
        @Nullable Input<RetryConfigArgs> retryConfig,
        @Nullable Input<String> taskTtl,
        @Nullable Input<String> tombstoneTtl) {
        this.appEngineHttpTarget = appEngineHttpTarget;
        this.location = location;
        this.name = name;
        this.project = project;
        this.pullTarget = pullTarget;
        this.rateLimits = rateLimits;
        this.retryConfig = retryConfig;
        this.taskTtl = taskTtl;
        this.tombstoneTtl = tombstoneTtl;
    }

    private QueueArgs() {
        this.appEngineHttpTarget = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.pullTarget = Input.empty();
        this.rateLimits = Input.empty();
        this.retryConfig = Input.empty();
        this.taskTtl = Input.empty();
        this.tombstoneTtl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AppEngineHttpTargetArgs> appEngineHttpTarget;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<PullTargetArgs> pullTarget;
        private @Nullable Input<RateLimitsArgs> rateLimits;
        private @Nullable Input<RetryConfigArgs> retryConfig;
        private @Nullable Input<String> taskTtl;
        private @Nullable Input<String> tombstoneTtl;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineHttpTarget = defaults.appEngineHttpTarget;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pullTarget = defaults.pullTarget;
    	      this.rateLimits = defaults.rateLimits;
    	      this.retryConfig = defaults.retryConfig;
    	      this.taskTtl = defaults.taskTtl;
    	      this.tombstoneTtl = defaults.tombstoneTtl;
        }

        public Builder setAppEngineHttpTarget(@Nullable Input<AppEngineHttpTargetArgs> appEngineHttpTarget) {
            this.appEngineHttpTarget = appEngineHttpTarget;
            return this;
        }

        public Builder setAppEngineHttpTarget(@Nullable AppEngineHttpTargetArgs appEngineHttpTarget) {
            this.appEngineHttpTarget = Input.ofNullable(appEngineHttpTarget);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setPullTarget(@Nullable Input<PullTargetArgs> pullTarget) {
            this.pullTarget = pullTarget;
            return this;
        }

        public Builder setPullTarget(@Nullable PullTargetArgs pullTarget) {
            this.pullTarget = Input.ofNullable(pullTarget);
            return this;
        }

        public Builder setRateLimits(@Nullable Input<RateLimitsArgs> rateLimits) {
            this.rateLimits = rateLimits;
            return this;
        }

        public Builder setRateLimits(@Nullable RateLimitsArgs rateLimits) {
            this.rateLimits = Input.ofNullable(rateLimits);
            return this;
        }

        public Builder setRetryConfig(@Nullable Input<RetryConfigArgs> retryConfig) {
            this.retryConfig = retryConfig;
            return this;
        }

        public Builder setRetryConfig(@Nullable RetryConfigArgs retryConfig) {
            this.retryConfig = Input.ofNullable(retryConfig);
            return this;
        }

        public Builder setTaskTtl(@Nullable Input<String> taskTtl) {
            this.taskTtl = taskTtl;
            return this;
        }

        public Builder setTaskTtl(@Nullable String taskTtl) {
            this.taskTtl = Input.ofNullable(taskTtl);
            return this;
        }

        public Builder setTombstoneTtl(@Nullable Input<String> tombstoneTtl) {
            this.tombstoneTtl = tombstoneTtl;
            return this;
        }

        public Builder setTombstoneTtl(@Nullable String tombstoneTtl) {
            this.tombstoneTtl = Input.ofNullable(tombstoneTtl);
            return this;
        }
        public QueueArgs build() {
            return new QueueArgs(appEngineHttpTarget, location, name, project, pullTarget, rateLimits, retryConfig, taskTtl, tombstoneTtl);
        }
    }
}
