// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of server X509Names.
 * 
 */
public final class X509CertificateNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final X509CertificateNameArgs Empty = new X509CertificateNameArgs();

    /**
     * Thumbprint for the Issuer of the Certificate.
     * 
     */
    @InputImport(name="issuerCertificateThumbprint")
    private final @Nullable Input<String> issuerCertificateThumbprint;

    public Input<String> getIssuerCertificateThumbprint() {
        return this.issuerCertificateThumbprint == null ? Input.empty() : this.issuerCertificateThumbprint;
    }

    /**
     * Common Name of the Certificate.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public X509CertificateNameArgs(
        @Nullable Input<String> issuerCertificateThumbprint,
        @Nullable Input<String> name) {
        this.issuerCertificateThumbprint = issuerCertificateThumbprint;
        this.name = name;
    }

    private X509CertificateNameArgs() {
        this.issuerCertificateThumbprint = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X509CertificateNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> issuerCertificateThumbprint;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(X509CertificateNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuerCertificateThumbprint = defaults.issuerCertificateThumbprint;
    	      this.name = defaults.name;
        }

        public Builder setIssuerCertificateThumbprint(@Nullable Input<String> issuerCertificateThumbprint) {
            this.issuerCertificateThumbprint = issuerCertificateThumbprint;
            return this;
        }

        public Builder setIssuerCertificateThumbprint(@Nullable String issuerCertificateThumbprint) {
            this.issuerCertificateThumbprint = Input.ofNullable(issuerCertificateThumbprint);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public X509CertificateNameArgs build() {
            return new X509CertificateNameArgs(issuerCertificateThumbprint, name);
        }
    }
}
