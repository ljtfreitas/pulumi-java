// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ManagedIntegrationRuntimeErrorResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedIntegrationRuntimeNodeResponse {
    /**
     * The errors that occurred on this integration runtime node.
     * 
     */
    private final @Nullable List<ManagedIntegrationRuntimeErrorResponse> errors;
    /**
     * The managed integration runtime node id.
     * 
     */
    private final String nodeId;
    /**
     * The managed integration runtime node status.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"errors","nodeId","status"})
    private ManagedIntegrationRuntimeNodeResponse(
        @Nullable List<ManagedIntegrationRuntimeErrorResponse> errors,
        String nodeId,
        String status) {
        this.errors = errors;
        this.nodeId = Objects.requireNonNull(nodeId);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * The errors that occurred on this integration runtime node.
     * 
     */
    public List<ManagedIntegrationRuntimeErrorResponse> getErrors() {
        return this.errors == null ? List.of() : this.errors;
    }
    /**
     * The managed integration runtime node id.
     * 
     */
    public String getNodeId() {
        return this.nodeId;
    }
    /**
     * The managed integration runtime node status.
     * 
     */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIntegrationRuntimeNodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ManagedIntegrationRuntimeErrorResponse> errors;
        private String nodeId;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIntegrationRuntimeNodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.nodeId = defaults.nodeId;
    	      this.status = defaults.status;
        }

        public Builder setErrors(@Nullable List<ManagedIntegrationRuntimeErrorResponse> errors) {
            this.errors = errors;
            return this;
        }

        public Builder setNodeId(String nodeId) {
            this.nodeId = Objects.requireNonNull(nodeId);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public ManagedIntegrationRuntimeNodeResponse build() {
            return new ManagedIntegrationRuntimeNodeResponse(errors, nodeId, status);
        }
    }
}
