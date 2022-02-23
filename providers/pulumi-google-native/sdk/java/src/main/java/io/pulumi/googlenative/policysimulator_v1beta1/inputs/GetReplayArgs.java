// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.policysimulator_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReplayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReplayArgs Empty = new GetReplayArgs();

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

    @InputImport(name="replayId", required=true)
      private final String replayId;

    public String getReplayId() {
        return this.replayId;
    }

    public GetReplayArgs(
        String location,
        @Nullable String project,
        String replayId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.replayId = Objects.requireNonNull(replayId, "expected parameter 'replayId' to be non-null");
    }

    private GetReplayArgs() {
        this.location = null;
        this.project = null;
        this.replayId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String replayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.replayId = defaults.replayId;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setReplayId(String replayId) {
            this.replayId = Objects.requireNonNull(replayId);
            return this;
        }
        public GetReplayArgs build() {
            return new GetReplayArgs(location, project, replayId);
        }
    }
}
