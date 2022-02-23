// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkerPoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWorkerPoolArgs Empty = new GetWorkerPoolArgs();

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

    @InputImport(name="workerPoolId", required=true)
      private final String workerPoolId;

    public String getWorkerPoolId() {
        return this.workerPoolId;
    }

    public GetWorkerPoolArgs(
        String location,
        @Nullable String project,
        String workerPoolId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.workerPoolId = Objects.requireNonNull(workerPoolId, "expected parameter 'workerPoolId' to be non-null");
    }

    private GetWorkerPoolArgs() {
        this.location = null;
        this.project = null;
        this.workerPoolId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkerPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String workerPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkerPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.workerPoolId = defaults.workerPoolId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setWorkerPoolId(String workerPoolId) {
            this.workerPoolId = Objects.requireNonNull(workerPoolId);
            return this;
        }
        public GetWorkerPoolArgs build() {
            return new GetWorkerPoolArgs(location, project, workerPoolId);
        }
    }
}
