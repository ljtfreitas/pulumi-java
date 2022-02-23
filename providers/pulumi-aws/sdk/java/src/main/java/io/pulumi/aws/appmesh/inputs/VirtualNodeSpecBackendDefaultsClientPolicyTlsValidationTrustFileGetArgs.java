// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs();

    /**
     * The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="certificateChain", required=true)
    private final Input<String> certificateChain;

    public Input<String> getCertificateChain() {
        return this.certificateChain;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs(Input<String> certificateChain) {
        this.certificateChain = Objects.requireNonNull(certificateChain, "expected parameter 'certificateChain' to be non-null");
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs() {
        this.certificateChain = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> certificateChain;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateChain = defaults.certificateChain;
        }

        public Builder setCertificateChain(Input<String> certificateChain) {
            this.certificateChain = Objects.requireNonNull(certificateChain);
            return this;
        }

        public Builder setCertificateChain(String certificateChain) {
            this.certificateChain = Input.of(Objects.requireNonNull(certificateChain));
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustFileGetArgs(certificateChain);
        }
    }
}
