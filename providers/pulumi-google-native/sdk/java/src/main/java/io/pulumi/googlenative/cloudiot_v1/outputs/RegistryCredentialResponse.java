// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudiot_v1.outputs.PublicKeyCertificateResponse;
import java.util.Objects;

@OutputCustomType
public final class RegistryCredentialResponse {
    private final PublicKeyCertificateResponse publicKeyCertificate;

    @OutputCustomType.Constructor({"publicKeyCertificate"})
    private RegistryCredentialResponse(PublicKeyCertificateResponse publicKeyCertificate) {
        this.publicKeyCertificate = Objects.requireNonNull(publicKeyCertificate);
    }

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

        public Builder setPublicKeyCertificate(PublicKeyCertificateResponse publicKeyCertificate) {
            this.publicKeyCertificate = Objects.requireNonNull(publicKeyCertificate);
            return this;
        }

        public RegistryCredentialResponse build() {
            return new RegistryCredentialResponse(publicKeyCertificate);
        }
    }
}