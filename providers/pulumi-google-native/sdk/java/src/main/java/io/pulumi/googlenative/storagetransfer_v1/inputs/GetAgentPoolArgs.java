// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAgentPoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAgentPoolArgs Empty = new GetAgentPoolArgs();

    @InputImport(name="agentPoolId", required=true)
      private final String agentPoolId;

    public String getAgentPoolId() {
        return this.agentPoolId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetAgentPoolArgs(
        String agentPoolId,
        @Nullable String project) {
        this.agentPoolId = Objects.requireNonNull(agentPoolId, "expected parameter 'agentPoolId' to be non-null");
        this.project = project;
    }

    private GetAgentPoolArgs() {
        this.agentPoolId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAgentPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentPoolId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAgentPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPoolId = defaults.agentPoolId;
    	      this.project = defaults.project;
        }

        public Builder setAgentPoolId(String agentPoolId) {
            this.agentPoolId = Objects.requireNonNull(agentPoolId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetAgentPoolArgs build() {
            return new GetAgentPoolArgs(agentPoolId, project);
        }
    }
}
