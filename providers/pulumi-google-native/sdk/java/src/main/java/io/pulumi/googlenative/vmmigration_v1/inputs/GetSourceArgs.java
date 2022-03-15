// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSourceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSourceArgs Empty = new GetSourceArgs();

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

    @Import(name="sourceId", required=true)
      private final String sourceId;

    public String getSourceId() {
        return this.sourceId;
    }

    public GetSourceArgs(
        String location,
        @Nullable String project,
        String sourceId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.sourceId = Objects.requireNonNull(sourceId, "expected parameter 'sourceId' to be non-null");
    }

    private GetSourceArgs() {
        this.location = null;
        this.project = null;
        this.sourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String sourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.sourceId = defaults.sourceId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder sourceId(String sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }
        public GetSourceArgs build() {
            return new GetSourceArgs(location, project, sourceId);
        }
    }
}
