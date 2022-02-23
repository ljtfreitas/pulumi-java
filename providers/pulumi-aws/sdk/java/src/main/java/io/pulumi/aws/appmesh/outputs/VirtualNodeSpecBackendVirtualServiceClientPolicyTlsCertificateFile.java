// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFile {
    /**
     * The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    private final String certificateChain;
    /**
     * The private key for a certificate stored on the file system of the virtual node that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    private final String privateKey;

    @OutputCustomType.Constructor({"certificateChain","privateKey"})
    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFile(
        String certificateChain,
        String privateKey) {
        this.certificateChain = Objects.requireNonNull(certificateChain);
        this.privateKey = Objects.requireNonNull(privateKey);
    }

    /**
     * The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    public String getCertificateChain() {
        return this.certificateChain;
    }
    /**
     * The private key for a certificate stored on the file system of the virtual node that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateChain;
        private String privateKey;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateChain = defaults.certificateChain;
    	      this.privateKey = defaults.privateKey;
        }

        public Builder setCertificateChain(String certificateChain) {
            this.certificateChain = Objects.requireNonNull(certificateChain);
            return this;
        }

        public Builder setPrivateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFile build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFile(certificateChain, privateKey);
        }
    }
}
