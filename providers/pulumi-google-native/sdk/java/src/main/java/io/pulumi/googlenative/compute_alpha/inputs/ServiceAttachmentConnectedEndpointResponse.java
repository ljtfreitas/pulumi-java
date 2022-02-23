// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * [Output Only] A connection connected to this service attachment.
 * 
 */
public final class ServiceAttachmentConnectedEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceAttachmentConnectedEndpointResponse Empty = new ServiceAttachmentConnectedEndpointResponse();

    /**
     * The url of a connected endpoint.
     * 
     */
    @InputImport(name="endpoint", required=true)
      private final String endpoint;

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * The PSC connection id of the connected endpoint.
     * 
     */
    @InputImport(name="pscConnectionId", required=true)
      private final String pscConnectionId;

    public String getPscConnectionId() {
        return this.pscConnectionId;
    }

    /**
     * The status of a connected endpoint to this service attachment.
     * 
     */
    @InputImport(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    public ServiceAttachmentConnectedEndpointResponse(
        String endpoint,
        String pscConnectionId,
        String status) {
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.pscConnectionId = Objects.requireNonNull(pscConnectionId, "expected parameter 'pscConnectionId' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private ServiceAttachmentConnectedEndpointResponse() {
        this.endpoint = null;
        this.pscConnectionId = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentConnectedEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;
        private String pscConnectionId;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAttachmentConnectedEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.pscConnectionId = defaults.pscConnectionId;
    	      this.status = defaults.status;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setPscConnectionId(String pscConnectionId) {
            this.pscConnectionId = Objects.requireNonNull(pscConnectionId);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public ServiceAttachmentConnectedEndpointResponse build() {
            return new ServiceAttachmentConnectedEndpointResponse(endpoint, pscConnectionId, status);
        }
    }
}
