// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specification of the GRPC Endpoint.
 * 
 */
public final class GoogleCloudNetworksecurityV1beta1GrpcEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudNetworksecurityV1beta1GrpcEndpointArgs Empty = new GoogleCloudNetworksecurityV1beta1GrpcEndpointArgs();

    /**
     * The target URI of the gRPC endpoint. Only UDS path is supported, and should start with “unix:”.
     * 
     */
    @Import(name="targetUri", required=true)
      private final Output<String> targetUri;

    public Output<String> getTargetUri() {
        return this.targetUri;
    }

    public GoogleCloudNetworksecurityV1beta1GrpcEndpointArgs(Output<String> targetUri) {
        this.targetUri = Objects.requireNonNull(targetUri, "expected parameter 'targetUri' to be non-null");
    }

    private GoogleCloudNetworksecurityV1beta1GrpcEndpointArgs() {
        this.targetUri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudNetworksecurityV1beta1GrpcEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> targetUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudNetworksecurityV1beta1GrpcEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetUri = defaults.targetUri;
        }

        public Builder targetUri(Output<String> targetUri) {
            this.targetUri = Objects.requireNonNull(targetUri);
            return this;
        }

        public Builder targetUri(String targetUri) {
            this.targetUri = Output.of(Objects.requireNonNull(targetUri));
            return this;
        }
        public GoogleCloudNetworksecurityV1beta1GrpcEndpointArgs build() {
            return new GoogleCloudNetworksecurityV1beta1GrpcEndpointArgs(targetUri);
        }
    }
}
