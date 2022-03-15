// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNodeArgs Empty = new GetNodeArgs();

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="nodeId", required=true)
      private final String nodeId;

    public String getNodeId() {
        return this.nodeId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetNodeArgs(
        String location,
        String nodeId,
        @Nullable String project) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.nodeId = Objects.requireNonNull(nodeId, "expected parameter 'nodeId' to be non-null");
        this.project = project;
    }

    private GetNodeArgs() {
        this.location = null;
        this.nodeId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String nodeId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.nodeId = defaults.nodeId;
    	      this.project = defaults.project;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder nodeId(String nodeId) {
            this.nodeId = Objects.requireNonNull(nodeId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetNodeArgs build() {
            return new GetNodeArgs(location, nodeId, project);
        }
    }
}
