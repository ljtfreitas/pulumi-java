// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.awsnative.datasync.enums.AgentEndpointType;
import io.pulumi.awsnative.datasync.outputs.AgentTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAgentResult {
    private final @Nullable String agentArn;
    private final @Nullable String agentName;
    private final @Nullable AgentEndpointType endpointType;
    private final @Nullable List<AgentTag> tags;

    @OutputCustomType.Constructor({"agentArn","agentName","endpointType","tags"})
    private GetAgentResult(
        @Nullable String agentArn,
        @Nullable String agentName,
        @Nullable AgentEndpointType endpointType,
        @Nullable List<AgentTag> tags) {
        this.agentArn = agentArn;
        this.agentName = agentName;
        this.endpointType = endpointType;
        this.tags = tags;
    }

    public Optional<String> getAgentArn() {
        return Optional.ofNullable(this.agentArn);
    }
    public Optional<String> getAgentName() {
        return Optional.ofNullable(this.agentName);
    }
    public Optional<AgentEndpointType> getEndpointType() {
        return Optional.ofNullable(this.endpointType);
    }
    public List<AgentTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAgentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentArn;
        private @Nullable String agentName;
        private @Nullable AgentEndpointType endpointType;
        private @Nullable List<AgentTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAgentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArn = defaults.agentArn;
    	      this.agentName = defaults.agentName;
    	      this.endpointType = defaults.endpointType;
    	      this.tags = defaults.tags;
        }

        public Builder setAgentArn(@Nullable String agentArn) {
            this.agentArn = agentArn;
            return this;
        }

        public Builder setAgentName(@Nullable String agentName) {
            this.agentName = agentName;
            return this;
        }

        public Builder setEndpointType(@Nullable AgentEndpointType endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        public Builder setTags(@Nullable List<AgentTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetAgentResult build() {
            return new GetAgentResult(agentArn, agentName, endpointType, tags);
        }
    }
}