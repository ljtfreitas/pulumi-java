// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.ManagedIntegrationRuntimeErrorResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of integration runtime node.
 * 
 */
public final class ManagedIntegrationRuntimeNodeResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedIntegrationRuntimeNodeResponse Empty = new ManagedIntegrationRuntimeNodeResponse();

    /**
     * The errors that occurred on this integration runtime node.
     * 
     */
    @InputImport(name="errors")
        private final @Nullable List<ManagedIntegrationRuntimeErrorResponse> errors;

    public List<ManagedIntegrationRuntimeErrorResponse> getErrors() {
        return this.errors == null ? List.of() : this.errors;
    }

    /**
     * The managed integration runtime node id.
     * 
     */
    @InputImport(name="nodeId", required=true)
        private final String nodeId;

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * The managed integration runtime node status.
     * 
     */
    @InputImport(name="status", required=true)
        private final String status;

    public String getStatus() {
        return this.status;
    }

    public ManagedIntegrationRuntimeNodeResponse(
        @Nullable List<ManagedIntegrationRuntimeErrorResponse> errors,
        String nodeId,
        String status) {
        this.errors = errors;
        this.nodeId = Objects.requireNonNull(nodeId, "expected parameter 'nodeId' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private ManagedIntegrationRuntimeNodeResponse() {
        this.errors = List.of();
        this.nodeId = null;
        this.status = null;
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
