// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.networksecurity_v1.inputs.CertificateProviderInstanceArgs;
import io.pulumi.googlenative.networksecurity_v1.inputs.GoogleCloudNetworksecurityV1GrpcEndpointArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification of certificate provider. Defines the mechanism to obtain the certificate and private key for peer to peer authentication.
 * 
 */
public final class GoogleCloudNetworksecurityV1CertificateProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudNetworksecurityV1CertificateProviderArgs Empty = new GoogleCloudNetworksecurityV1CertificateProviderArgs();

    /**
     * The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
     * 
     */
    @Import(name="certificateProviderInstance")
      private final @Nullable Output<CertificateProviderInstanceArgs> certificateProviderInstance;

    public Output<CertificateProviderInstanceArgs> getCertificateProviderInstance() {
        return this.certificateProviderInstance == null ? Output.empty() : this.certificateProviderInstance;
    }

    /**
     * gRPC specific configuration to access the gRPC server to obtain the cert and private key.
     * 
     */
    @Import(name="grpcEndpoint")
      private final @Nullable Output<GoogleCloudNetworksecurityV1GrpcEndpointArgs> grpcEndpoint;

    public Output<GoogleCloudNetworksecurityV1GrpcEndpointArgs> getGrpcEndpoint() {
        return this.grpcEndpoint == null ? Output.empty() : this.grpcEndpoint;
    }

    public GoogleCloudNetworksecurityV1CertificateProviderArgs(
        @Nullable Output<CertificateProviderInstanceArgs> certificateProviderInstance,
        @Nullable Output<GoogleCloudNetworksecurityV1GrpcEndpointArgs> grpcEndpoint) {
        this.certificateProviderInstance = certificateProviderInstance;
        this.grpcEndpoint = grpcEndpoint;
    }

    private GoogleCloudNetworksecurityV1CertificateProviderArgs() {
        this.certificateProviderInstance = Output.empty();
        this.grpcEndpoint = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudNetworksecurityV1CertificateProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CertificateProviderInstanceArgs> certificateProviderInstance;
        private @Nullable Output<GoogleCloudNetworksecurityV1GrpcEndpointArgs> grpcEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudNetworksecurityV1CertificateProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateProviderInstance = defaults.certificateProviderInstance;
    	      this.grpcEndpoint = defaults.grpcEndpoint;
        }

        public Builder certificateProviderInstance(@Nullable Output<CertificateProviderInstanceArgs> certificateProviderInstance) {
            this.certificateProviderInstance = certificateProviderInstance;
            return this;
        }

        public Builder certificateProviderInstance(@Nullable CertificateProviderInstanceArgs certificateProviderInstance) {
            this.certificateProviderInstance = Output.ofNullable(certificateProviderInstance);
            return this;
        }

        public Builder grpcEndpoint(@Nullable Output<GoogleCloudNetworksecurityV1GrpcEndpointArgs> grpcEndpoint) {
            this.grpcEndpoint = grpcEndpoint;
            return this;
        }

        public Builder grpcEndpoint(@Nullable GoogleCloudNetworksecurityV1GrpcEndpointArgs grpcEndpoint) {
            this.grpcEndpoint = Output.ofNullable(grpcEndpoint);
            return this;
        }
        public GoogleCloudNetworksecurityV1CertificateProviderArgs build() {
            return new GoogleCloudNetworksecurityV1CertificateProviderArgs(certificateProviderInstance, grpcEndpoint);
        }
    }
}
