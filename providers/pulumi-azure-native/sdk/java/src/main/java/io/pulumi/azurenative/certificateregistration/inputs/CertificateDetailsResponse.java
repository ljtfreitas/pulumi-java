// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.certificateregistration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * SSL certificate details.
 * 
 */
public final class CertificateDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CertificateDetailsResponse Empty = new CertificateDetailsResponse();

    /**
     * Certificate Issuer.
     * 
     */
    @Import(name="issuer", required=true)
      private final String issuer;

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * Date Certificate is valid to.
     * 
     */
    @Import(name="notAfter", required=true)
      private final String notAfter;

    public String getNotAfter() {
        return this.notAfter;
    }

    /**
     * Date Certificate is valid from.
     * 
     */
    @Import(name="notBefore", required=true)
      private final String notBefore;

    public String getNotBefore() {
        return this.notBefore;
    }

    /**
     * Raw certificate data.
     * 
     */
    @Import(name="rawData", required=true)
      private final String rawData;

    public String getRawData() {
        return this.rawData;
    }

    /**
     * Certificate Serial Number.
     * 
     */
    @Import(name="serialNumber", required=true)
      private final String serialNumber;

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * Certificate Signature algorithm.
     * 
     */
    @Import(name="signatureAlgorithm", required=true)
      private final String signatureAlgorithm;

    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    /**
     * Certificate Subject.
     * 
     */
    @Import(name="subject", required=true)
      private final String subject;

    public String getSubject() {
        return this.subject;
    }

    /**
     * Certificate Thumbprint.
     * 
     */
    @Import(name="thumbprint", required=true)
      private final String thumbprint;

    public String getThumbprint() {
        return this.thumbprint;
    }

    /**
     * Certificate Version.
     * 
     */
    @Import(name="version", required=true)
      private final Integer version;

    public Integer getVersion() {
        return this.version;
    }

    public CertificateDetailsResponse(
        String issuer,
        String notAfter,
        String notBefore,
        String rawData,
        String serialNumber,
        String signatureAlgorithm,
        String subject,
        String thumbprint,
        Integer version) {
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
        this.notAfter = Objects.requireNonNull(notAfter, "expected parameter 'notAfter' to be non-null");
        this.notBefore = Objects.requireNonNull(notBefore, "expected parameter 'notBefore' to be non-null");
        this.rawData = Objects.requireNonNull(rawData, "expected parameter 'rawData' to be non-null");
        this.serialNumber = Objects.requireNonNull(serialNumber, "expected parameter 'serialNumber' to be non-null");
        this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm, "expected parameter 'signatureAlgorithm' to be non-null");
        this.subject = Objects.requireNonNull(subject, "expected parameter 'subject' to be non-null");
        this.thumbprint = Objects.requireNonNull(thumbprint, "expected parameter 'thumbprint' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private CertificateDetailsResponse() {
        this.issuer = null;
        this.notAfter = null;
        this.notBefore = null;
        this.rawData = null;
        this.serialNumber = null;
        this.signatureAlgorithm = null;
        this.subject = null;
        this.thumbprint = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String issuer;
        private String notAfter;
        private String notBefore;
        private String rawData;
        private String serialNumber;
        private String signatureAlgorithm;
        private String subject;
        private String thumbprint;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuer = defaults.issuer;
    	      this.notAfter = defaults.notAfter;
    	      this.notBefore = defaults.notBefore;
    	      this.rawData = defaults.rawData;
    	      this.serialNumber = defaults.serialNumber;
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
    	      this.subject = defaults.subject;
    	      this.thumbprint = defaults.thumbprint;
    	      this.version = defaults.version;
        }

        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder notAfter(String notAfter) {
            this.notAfter = Objects.requireNonNull(notAfter);
            return this;
        }

        public Builder notBefore(String notBefore) {
            this.notBefore = Objects.requireNonNull(notBefore);
            return this;
        }

        public Builder rawData(String rawData) {
            this.rawData = Objects.requireNonNull(rawData);
            return this;
        }

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }

        public Builder signatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
            return this;
        }

        public Builder subject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }

        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public CertificateDetailsResponse build() {
            return new CertificateDetailsResponse(issuer, notAfter, notBefore, rawData, serialNumber, signatureAlgorithm, subject, thumbprint, version);
        }
    }
}
