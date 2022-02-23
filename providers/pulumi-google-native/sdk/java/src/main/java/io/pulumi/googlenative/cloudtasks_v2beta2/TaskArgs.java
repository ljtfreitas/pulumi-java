// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudtasks_v2beta2.enums.TaskResponseView;
import io.pulumi.googlenative.cloudtasks_v2beta2.inputs.AppEngineHttpRequestArgs;
import io.pulumi.googlenative.cloudtasks_v2beta2.inputs.PullMessageArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskArgs Empty = new TaskArgs();

    /**
     * App Engine HTTP request that is sent to the task's target. Can be set only if app_engine_http_target is set on the queue. An App Engine task is a task that has AppEngineHttpRequest set.
     * 
     */
    @InputImport(name="appEngineHttpRequest")
      private final @Nullable Input<AppEngineHttpRequestArgs> appEngineHttpRequest;

    public Input<AppEngineHttpRequestArgs> getAppEngineHttpRequest() {
        return this.appEngineHttpRequest == null ? Input.empty() : this.appEngineHttpRequest;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
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
     * LeaseTasks to process the task. Can be set only if pull_target is set on the queue. A pull task is a task that has PullMessage set.
     * 
     */
    @InputImport(name="pullMessage")
      private final @Nullable Input<PullMessageArgs> pullMessage;

    public Input<PullMessageArgs> getPullMessage() {
        return this.pullMessage == null ? Input.empty() : this.pullMessage;
    }

    @InputImport(name="queueId", required=true)
      private final Input<String> queueId;

    public Input<String> getQueueId() {
        return this.queueId;
    }

    /**
     * The response_view specifies which subset of the Task will be returned. By default response_view is BASIC; not all information is retrieved by default because some data, such as payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains. Authorization for FULL requires `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
     * 
     */
    @InputImport(name="responseView")
      private final @Nullable Input<TaskResponseView> responseView;

    public Input<TaskResponseView> getResponseView() {
        return this.responseView == null ? Input.empty() : this.responseView;
    }

    /**
     * The time when the task is scheduled to be attempted. For App Engine queues, this is when the task will be attempted or retried. For pull queues, this is the time when the task is available to be leased; if a task is currently leased, this is the time when the current lease expires, that is, the time that the task was leased plus the lease_duration. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    @InputImport(name="scheduleTime")
      private final @Nullable Input<String> scheduleTime;

    public Input<String> getScheduleTime() {
        return this.scheduleTime == null ? Input.empty() : this.scheduleTime;
    }

    public TaskArgs(
        @Nullable Input<AppEngineHttpRequestArgs> appEngineHttpRequest,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<PullMessageArgs> pullMessage,
        Input<String> queueId,
        @Nullable Input<TaskResponseView> responseView,
        @Nullable Input<String> scheduleTime) {
        this.appEngineHttpRequest = appEngineHttpRequest;
        this.location = location;
        this.name = name;
        this.project = project;
        this.pullMessage = pullMessage;
        this.queueId = Objects.requireNonNull(queueId, "expected parameter 'queueId' to be non-null");
        this.responseView = responseView;
        this.scheduleTime = scheduleTime;
    }

    private TaskArgs() {
        this.appEngineHttpRequest = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.pullMessage = Input.empty();
        this.queueId = Input.empty();
        this.responseView = Input.empty();
        this.scheduleTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AppEngineHttpRequestArgs> appEngineHttpRequest;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<PullMessageArgs> pullMessage;
        private Input<String> queueId;
        private @Nullable Input<TaskResponseView> responseView;
        private @Nullable Input<String> scheduleTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineHttpRequest = defaults.appEngineHttpRequest;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pullMessage = defaults.pullMessage;
    	      this.queueId = defaults.queueId;
    	      this.responseView = defaults.responseView;
    	      this.scheduleTime = defaults.scheduleTime;
        }

        public Builder setAppEngineHttpRequest(@Nullable Input<AppEngineHttpRequestArgs> appEngineHttpRequest) {
            this.appEngineHttpRequest = appEngineHttpRequest;
            return this;
        }

        public Builder setAppEngineHttpRequest(@Nullable AppEngineHttpRequestArgs appEngineHttpRequest) {
            this.appEngineHttpRequest = Input.ofNullable(appEngineHttpRequest);
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

        public Builder setPullMessage(@Nullable Input<PullMessageArgs> pullMessage) {
            this.pullMessage = pullMessage;
            return this;
        }

        public Builder setPullMessage(@Nullable PullMessageArgs pullMessage) {
            this.pullMessage = Input.ofNullable(pullMessage);
            return this;
        }

        public Builder setQueueId(Input<String> queueId) {
            this.queueId = Objects.requireNonNull(queueId);
            return this;
        }

        public Builder setQueueId(String queueId) {
            this.queueId = Input.of(Objects.requireNonNull(queueId));
            return this;
        }

        public Builder setResponseView(@Nullable Input<TaskResponseView> responseView) {
            this.responseView = responseView;
            return this;
        }

        public Builder setResponseView(@Nullable TaskResponseView responseView) {
            this.responseView = Input.ofNullable(responseView);
            return this;
        }

        public Builder setScheduleTime(@Nullable Input<String> scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }

        public Builder setScheduleTime(@Nullable String scheduleTime) {
            this.scheduleTime = Input.ofNullable(scheduleTime);
            return this;
        }
        public TaskArgs build() {
            return new TaskArgs(appEngineHttpRequest, location, name, project, pullMessage, queueId, responseView, scheduleTime);
        }
    }
}
