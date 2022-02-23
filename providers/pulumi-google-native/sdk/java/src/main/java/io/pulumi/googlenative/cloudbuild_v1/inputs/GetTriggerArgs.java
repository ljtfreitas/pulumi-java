// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTriggerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTriggerArgs Empty = new GetTriggerArgs();

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="projectId", required=true)
      private final String projectId;

    public String getProjectId() {
        return this.projectId;
    }

    @InputImport(name="triggerId", required=true)
      private final String triggerId;

    public String getTriggerId() {
        return this.triggerId;
    }

    public GetTriggerArgs(
        String location,
        @Nullable String project,
        String projectId,
        String triggerId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
        this.triggerId = Objects.requireNonNull(triggerId, "expected parameter 'triggerId' to be non-null");
    }

    private GetTriggerArgs() {
        this.location = null;
        this.project = null;
        this.projectId = null;
        this.triggerId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String projectId;
        private String triggerId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.projectId = defaults.projectId;
    	      this.triggerId = defaults.triggerId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder setTriggerId(String triggerId) {
            this.triggerId = Objects.requireNonNull(triggerId);
            return this;
        }
        public GetTriggerArgs build() {
            return new GetTriggerArgs(location, project, projectId, triggerId);
        }
    }
}
