// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Certificate chains needed to verify the attestation. Certificates in chains are PEM-encoded and are ordered based on https://tools.ietf.org/html/rfc5246#section-7.4.2.
 * 
 */
public final class CertificateChainsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CertificateChainsResponse Empty = new CertificateChainsResponse();

    /**
     * Cavium certificate chain corresponding to the attestation.
     * 
     */
    @InputImport(name="caviumCerts", required=true)
      private final List<String> caviumCerts;

    public List<String> getCaviumCerts() {
        return this.caviumCerts;
    }

    /**
     * Google card certificate chain corresponding to the attestation.
     * 
     */
    @InputImport(name="googleCardCerts", required=true)
      private final List<String> googleCardCerts;

    public List<String> getGoogleCardCerts() {
        return this.googleCardCerts;
    }

    /**
     * Google partition certificate chain corresponding to the attestation.
     * 
     */
    @InputImport(name="googlePartitionCerts", required=true)
      private final List<String> googlePartitionCerts;

    public List<String> getGooglePartitionCerts() {
        return this.googlePartitionCerts;
    }

    public CertificateChainsResponse(
        List<String> caviumCerts,
        List<String> googleCardCerts,
        List<String> googlePartitionCerts) {
        this.caviumCerts = Objects.requireNonNull(caviumCerts, "expected parameter 'caviumCerts' to be non-null");
        this.googleCardCerts = Objects.requireNonNull(googleCardCerts, "expected parameter 'googleCardCerts' to be non-null");
        this.googlePartitionCerts = Objects.requireNonNull(googlePartitionCerts, "expected parameter 'googlePartitionCerts' to be non-null");
    }

    private CertificateChainsResponse() {
        this.caviumCerts = List.of();
        this.googleCardCerts = List.of();
        this.googlePartitionCerts = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateChainsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> caviumCerts;
        private List<String> googleCardCerts;
        private List<String> googlePartitionCerts;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateChainsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caviumCerts = defaults.caviumCerts;
    	      this.googleCardCerts = defaults.googleCardCerts;
    	      this.googlePartitionCerts = defaults.googlePartitionCerts;
        }

        public Builder setCaviumCerts(List<String> caviumCerts) {
            this.caviumCerts = Objects.requireNonNull(caviumCerts);
            return this;
        }

        public Builder setGoogleCardCerts(List<String> googleCardCerts) {
            this.googleCardCerts = Objects.requireNonNull(googleCardCerts);
            return this;
        }

        public Builder setGooglePartitionCerts(List<String> googlePartitionCerts) {
            this.googlePartitionCerts = Objects.requireNonNull(googlePartitionCerts);
            return this;
        }
        public CertificateChainsResponse build() {
            return new CertificateChainsResponse(caviumCerts, googleCardCerts, googlePartitionCerts);
        }
    }
}
