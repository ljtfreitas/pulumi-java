// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.cloudiot_v1.outputs.PublicKeyCertificateResponse;
import java.util.Objects;

@CustomType
public final class RegistryCredentialResponse {
    /**
     * A public key certificate used to verify the device credentials.
     * 
     */
    private final PublicKeyCertificateResponse publicKeyCertificate;

    @CustomType.Constructor
    private RegistryCredentialResponse(@CustomType.Parameter("publicKeyCertificate") PublicKeyCertificateResponse publicKeyCertificate) {
        this.publicKeyCertificate = publicKeyCertificate;
    }

    /**
     * A public key certificate used to verify the device credentials.
     * 
    */
    public PublicKeyCertificateResponse getPublicKeyCertificate() {
        return this.publicKeyCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicKeyCertificateResponse publicKeyCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyCertificate = defaults.publicKeyCertificate;
        }

        public Builder publicKeyCertificate(PublicKeyCertificateResponse publicKeyCertificate) {
            this.publicKeyCertificate = Objects.requireNonNull(publicKeyCertificate);
            return this;
        }
        public RegistryCredentialResponse build() {
            return new RegistryCredentialResponse(publicKeyCertificate);
        }
    }
}
