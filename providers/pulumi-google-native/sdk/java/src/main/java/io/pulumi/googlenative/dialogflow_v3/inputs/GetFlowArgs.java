// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFlowArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFlowArgs Empty = new GetFlowArgs();

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

    @InputImport(name="languageCode")
      private final @Nullable String languageCode;

    public Optional<String> getLanguageCode() {
        return this.languageCode == null ? Optional.empty() : Optional.ofNullable(this.languageCode);
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

    public GetFlowArgs(
        String agentId,
        String flowId,
        @Nullable String languageCode,
        String location,
        @Nullable String project) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.flowId = Objects.requireNonNull(flowId, "expected parameter 'flowId' to be non-null");
        this.languageCode = languageCode;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetFlowArgs() {
        this.agentId = null;
        this.flowId = null;
        this.languageCode = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentId;
        private String flowId;
        private @Nullable String languageCode;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFlowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.flowId = defaults.flowId;
    	      this.languageCode = defaults.languageCode;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setAgentId(String agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }

        public Builder setFlowId(String flowId) {
            this.flowId = Objects.requireNonNull(flowId);
            return this;
        }

        public Builder setLanguageCode(@Nullable String languageCode) {
            this.languageCode = languageCode;
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
        public GetFlowArgs build() {
            return new GetFlowArgs(agentId, flowId, languageCode, location, project);
        }
    }
}
