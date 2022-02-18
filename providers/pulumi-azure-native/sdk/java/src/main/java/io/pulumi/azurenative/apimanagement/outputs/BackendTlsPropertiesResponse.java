// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BackendTlsPropertiesResponse {
    /**
     * Flag indicating whether SSL certificate chain validation should be done when using self-signed certificates for this backend host.
     * 
     */
    private final @Nullable Boolean validateCertificateChain;
    /**
     * Flag indicating whether SSL certificate name validation should be done when using self-signed certificates for this backend host.
     * 
     */
    private final @Nullable Boolean validateCertificateName;

    @OutputCustomType.Constructor({"validateCertificateChain","validateCertificateName"})
    private BackendTlsPropertiesResponse(
        @Nullable Boolean validateCertificateChain,
        @Nullable Boolean validateCertificateName) {
        this.validateCertificateChain = validateCertificateChain;
        this.validateCertificateName = validateCertificateName;
    }

    /**
     * Flag indicating whether SSL certificate chain validation should be done when using self-signed certificates for this backend host.
     * 
     */
    public Optional<Boolean> getValidateCertificateChain() {
        return Optional.ofNullable(this.validateCertificateChain);
    }
    /**
     * Flag indicating whether SSL certificate name validation should be done when using self-signed certificates for this backend host.
     * 
     */
    public Optional<Boolean> getValidateCertificateName() {
        return Optional.ofNullable(this.validateCertificateName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendTlsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean validateCertificateChain;
        private @Nullable Boolean validateCertificateName;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendTlsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.validateCertificateChain = defaults.validateCertificateChain;
    	      this.validateCertificateName = defaults.validateCertificateName;
        }

        public Builder setValidateCertificateChain(@Nullable Boolean validateCertificateChain) {
            this.validateCertificateChain = validateCertificateChain;
            return this;
        }

        public Builder setValidateCertificateName(@Nullable Boolean validateCertificateName) {
            this.validateCertificateName = validateCertificateName;
            return this;
        }

        public BackendTlsPropertiesResponse build() {
            return new BackendTlsPropertiesResponse(validateCertificateChain, validateCertificateName);
        }
    }
}
