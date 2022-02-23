// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVersionArgs Empty = new GetVersionArgs();

    @InputImport(name="agentId", required=true)
      private final String agentId;

    public String getAgentId() {
        return this.agentId;
    }

    @InputImport(name="flowId", required=true)
      private final String flowId;

    public String getFlowId() {
        return this.flowId;
    }

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

    @InputImport(name="versionId", required=true)
      private final String versionId;

    public String getVersionId() {
        return this.versionId;
    }

    public GetVersionArgs(
        String agentId,
        String flowId,
        String location,
        @Nullable String project,
        String versionId) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.flowId = Objects.requireNonNull(flowId, "expected parameter 'flowId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.versionId = Objects.requireNonNull(versionId, "expected parameter 'versionId' to be non-null");
    }

    private GetVersionArgs() {
        this.agentId = null;
        this.flowId = null;
        this.location = null;
        this.project = null;
        this.versionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentId;
        private String flowId;
        private String location;
        private @Nullable String project;
        private String versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.flowId = defaults.flowId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.versionId = defaults.versionId;
        }

        public Builder setAgentId(String agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }

        public Builder setFlowId(String flowId) {
            this.flowId = Objects.requireNonNull(flowId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setVersionId(String versionId) {
            this.versionId = Objects.requireNonNull(versionId);
            return this;
        }
        public GetVersionArgs build() {
            return new GetVersionArgs(agentId, flowId, location, project, versionId);
        }
    }
}
