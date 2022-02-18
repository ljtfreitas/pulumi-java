// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of server X509Names.
 * 
 */
public final class X509CertificateNameResponse extends io.pulumi.resources.InvokeArgs {

    public static final X509CertificateNameResponse Empty = new X509CertificateNameResponse();

    /**
     * Thumbprint for the Issuer of the Certificate.
     * 
     */
    @InputImport(name="issuerCertificateThumbprint")
    private final @Nullable String issuerCertificateThumbprint;

    public Optional<String> getIssuerCertificateThumbprint() {
        return this.issuerCertificateThumbprint == null ? Optional.empty() : Optional.ofNullable(this.issuerCertificateThumbprint);
    }

    /**
     * Common Name of the Certificate.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public X509CertificateNameResponse(
        @Nullable String issuerCertificateThumbprint,
        @Nullable String name) {
        this.issuerCertificateThumbprint = issuerCertificateThumbprint;
        this.name = name;
    }

    private X509CertificateNameResponse() {
        this.issuerCertificateThumbprint = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X509CertificateNameResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String issuerCertificateThumbprint;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(X509CertificateNameResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuerCertificateThumbprint = defaults.issuerCertificateThumbprint;
    	      this.name = defaults.name;
        }

        public Builder setIssuerCertificateThumbprint(@Nullable String issuerCertificateThumbprint) {
            this.issuerCertificateThumbprint = issuerCertificateThumbprint;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public X509CertificateNameResponse build() {
            return new X509CertificateNameResponse(issuerCertificateThumbprint, name);
        }
    }
}
