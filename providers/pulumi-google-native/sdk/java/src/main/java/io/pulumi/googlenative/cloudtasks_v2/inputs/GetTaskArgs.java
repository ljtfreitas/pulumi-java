// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTaskArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTaskArgs Empty = new GetTaskArgs();

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="queueId", required=true)
      private final String queueId;

    public String getQueueId() {
        return this.queueId;
    }

    @Import(name="responseView")
      private final @Nullable String responseView;

    public Optional<String> getResponseView() {
        return this.responseView == null ? Optional.empty() : Optional.ofNullable(this.responseView);
    }

    @Import(name="taskId", required=true)
      private final String taskId;

    public String getTaskId() {
        return this.taskId;
    }

    public GetTaskArgs(
        String location,
        @Nullable String project,
        String queueId,
        @Nullable String responseView,
        String taskId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.queueId = Objects.requireNonNull(queueId, "expected parameter 'queueId' to be non-null");
        this.responseView = responseView;
        this.taskId = Objects.requireNonNull(taskId, "expected parameter 'taskId' to be non-null");
    }

    private GetTaskArgs() {
        this.location = null;
        this.project = null;
        this.queueId = null;
        this.responseView = null;
        this.taskId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String queueId;
        private @Nullable String responseView;
        private String taskId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.queueId = defaults.queueId;
    	      this.responseView = defaults.responseView;
    	      this.taskId = defaults.taskId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder queueId(String queueId) {
            this.queueId = Objects.requireNonNull(queueId);
            return this;
        }

        public Builder responseView(@Nullable String responseView) {
            this.responseView = responseView;
            return this;
        }

        public Builder taskId(String taskId) {
            this.taskId = Objects.requireNonNull(taskId);
            return this;
        }
        public GetTaskArgs build() {
            return new GetTaskArgs(location, project, queueId, responseView, taskId);
        }
    }
}
