// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties controlling TLS Certificate Validation.
 * 
 */
public final class BackendTlsPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendTlsPropertiesResponse Empty = new BackendTlsPropertiesResponse();

    /**
     * Flag indicating whether SSL certificate chain validation should be done when using self-signed certificates for this backend host.
     * 
     */
    @InputImport(name="validateCertificateChain")
    private final @Nullable Boolean validateCertificateChain;

    public Optional<Boolean> getValidateCertificateChain() {
        return this.validateCertificateChain == null ? Optional.empty() : Optional.ofNullable(this.validateCertificateChain);
    }

    /**
     * Flag indicating whether SSL certificate name validation should be done when using self-signed certificates for this backend host.
     * 
     */
    @InputImport(name="validateCertificateName")
    private final @Nullable Boolean validateCertificateName;

    public Optional<Boolean> getValidateCertificateName() {
        return this.validateCertificateName == null ? Optional.empty() : Optional.ofNullable(this.validateCertificateName);
    }

    public BackendTlsPropertiesResponse(
        @Nullable Boolean validateCertificateChain,
        @Nullable Boolean validateCertificateName) {
        this.validateCertificateChain = validateCertificateChain == null ? true : validateCertificateChain;
        this.validateCertificateName = validateCertificateName == null ? true : validateCertificateName;
    }

    private BackendTlsPropertiesResponse() {
        this.validateCertificateChain = null;
        this.validateCertificateName = null;
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
