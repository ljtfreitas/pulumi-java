// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs();

    /**
     * The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="certificateChain", required=true)
      private final Output<String> certificateChain;

    public Output<String> getCertificateChain() {
        return this.certificateChain;
    }

    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs(Output<String> certificateChain) {
        this.certificateChain = Objects.requireNonNull(certificateChain, "expected parameter 'certificateChain' to be non-null");
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs() {
        this.certificateChain = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificateChain;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateChain = defaults.certificateChain;
        }

        public Builder certificateChain(Output<String> certificateChain) {
            this.certificateChain = Objects.requireNonNull(certificateChain);
            return this;
        }

        public Builder certificateChain(String certificateChain) {
            this.certificateChain = Output.of(Objects.requireNonNull(certificateChain));
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs(certificateChain);
        }
    }
}
