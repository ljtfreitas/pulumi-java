// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.networksecurity_v1beta1.inputs.CertificateProviderInstanceResponse;
import io.pulumi.googlenative.networksecurity_v1beta1.inputs.GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse;
import java.util.Objects;


/**
 * Specification of certificate provider. Defines the mechanism to obtain the certificate and private key for peer to peer authentication.
 * 
 */
public final class GoogleCloudNetworksecurityV1beta1CertificateProviderResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudNetworksecurityV1beta1CertificateProviderResponse Empty = new GoogleCloudNetworksecurityV1beta1CertificateProviderResponse();

    /**
     * The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
     * 
     */
    @InputImport(name="certificateProviderInstance", required=true)
      private final CertificateProviderInstanceResponse certificateProviderInstance;

    public CertificateProviderInstanceResponse getCertificateProviderInstance() {
        return this.certificateProviderInstance;
    }

    /**
     * gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     * 
     */
    @InputImport(name="grpcEndpoint", required=true)
      private final GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse grpcEndpoint;

    public GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse getGrpcEndpoint() {
        return this.grpcEndpoint;
    }

    public GoogleCloudNetworksecurityV1beta1CertificateProviderResponse(
        CertificateProviderInstanceResponse certificateProviderInstance,
        GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse grpcEndpoint) {
        this.certificateProviderInstance = Objects.requireNonNull(certificateProviderInstance, "expected parameter 'certificateProviderInstance' to be non-null");
        this.grpcEndpoint = Objects.requireNonNull(grpcEndpoint, "expected parameter 'grpcEndpoint' to be non-null");
    }

    private GoogleCloudNetworksecurityV1beta1CertificateProviderResponse() {
        this.certificateProviderInstance = null;
        this.grpcEndpoint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudNetworksecurityV1beta1CertificateProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateProviderInstanceResponse certificateProviderInstance;
        private GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse grpcEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudNetworksecurityV1beta1CertificateProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateProviderInstance = defaults.certificateProviderInstance;
    	      this.grpcEndpoint = defaults.grpcEndpoint;
        }

        public Builder setCertificateProviderInstance(CertificateProviderInstanceResponse certificateProviderInstance) {
            this.certificateProviderInstance = Objects.requireNonNull(certificateProviderInstance);
            return this;
        }

        public Builder setGrpcEndpoint(GoogleCloudNetworksecurityV1beta1GrpcEndpointResponse grpcEndpoint) {
            this.grpcEndpoint = Objects.requireNonNull(grpcEndpoint);
            return this;
        }
        public GoogleCloudNetworksecurityV1beta1CertificateProviderResponse build() {
            return new GoogleCloudNetworksecurityV1beta1CertificateProviderResponse(certificateProviderInstance, grpcEndpoint);
        }
    }
}
