// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specification of the GRPC Endpoint.
 * 
 */
public final class GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse Empty = new GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse();

    /**
     * The target URI of the gRPC endpoint. Only UDS path is supported, and should start with “unix:”.
     * 
     */
    @Import(name="targetUri", required=true)
      private final String targetUri;

    public String getTargetUri() {
        return this.targetUri;
    }

    public GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse(String targetUri) {
        this.targetUri = Objects.requireNonNull(targetUri, "expected parameter 'targetUri' to be non-null");
    }

    private GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse() {
        this.targetUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String targetUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetUri = defaults.targetUri;
        }

        public Builder targetUri(String targetUri) {
            this.targetUri = Objects.requireNonNull(targetUri);
            return this;
        }
        public GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse build() {
            return new GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse(targetUri);
        }
    }
}
