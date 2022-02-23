// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTargetArgs Empty = new GetTargetArgs();

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

    @InputImport(name="targetId", required=true)
      private final String targetId;

    public String getTargetId() {
        return this.targetId;
    }

    public GetTargetArgs(
        String location,
        @Nullable String project,
        String targetId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.targetId = Objects.requireNonNull(targetId, "expected parameter 'targetId' to be non-null");
    }

    private GetTargetArgs() {
        this.location = null;
        this.project = null;
        this.targetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.targetId = defaults.targetId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setTargetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }
        public GetTargetArgs build() {
            return new GetTargetArgs(location, project, targetId);
        }
    }
}
