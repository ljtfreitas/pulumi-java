// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class X509CertificateDetailsResponse {
    /**
     * The time the certificate becomes invalid.
     * 
     */
    private final String expiryTime;
    /**
     * The entity that signed the certificate.
     * 
     */
    private final String issuer;
    /**
     * The type of public key in the certificate.
     * 
     */
    private final String publicKeyType;
    /**
     * The algorithm used to sign the certificate.
     * 
     */
    private final String signatureAlgorithm;
    /**
     * The time the certificate becomes valid.
     * 
     */
    private final String startTime;
    /**
     * The entity the certificate and public key belong to.
     * 
     */
    private final String subject;

    @OutputCustomType.Constructor({"expiryTime","issuer","publicKeyType","signatureAlgorithm","startTime","subject"})
    private X509CertificateDetailsResponse(
        String expiryTime,
        String issuer,
        String publicKeyType,
        String signatureAlgorithm,
        String startTime,
        String subject) {
        this.expiryTime = Objects.requireNonNull(expiryTime);
        this.issuer = Objects.requireNonNull(issuer);
        this.publicKeyType = Objects.requireNonNull(publicKeyType);
        this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
        this.startTime = Objects.requireNonNull(startTime);
        this.subject = Objects.requireNonNull(subject);
    }

    /**
     * The time the certificate becomes invalid.
     * 
     */
    public String getExpiryTime() {
        return this.expiryTime;
    }
    /**
     * The entity that signed the certificate.
     * 
     */
    public String getIssuer() {
        return this.issuer;
    }
    /**
     * The type of public key in the certificate.
     * 
     */
    public String getPublicKeyType() {
        return this.publicKeyType;
    }
    /**
     * The algorithm used to sign the certificate.
     * 
     */
    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }
    /**
     * The time the certificate becomes valid.
     * 
     */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The entity the certificate and public key belong to.
     * 
     */
    public String getSubject() {
        return this.subject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X509CertificateDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expiryTime;
        private String issuer;
        private String publicKeyType;
        private String signatureAlgorithm;
        private String startTime;
        private String subject;

        public Builder() {
    	      // Empty
        }

        public Builder(X509CertificateDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiryTime = defaults.expiryTime;
    	      this.issuer = defaults.issuer;
    	      this.publicKeyType = defaults.publicKeyType;
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
    	      this.startTime = defaults.startTime;
    	      this.subject = defaults.subject;
        }

        public Builder setExpiryTime(String expiryTime) {
            this.expiryTime = Objects.requireNonNull(expiryTime);
            return this;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder setPublicKeyType(String publicKeyType) {
            this.publicKeyType = Objects.requireNonNull(publicKeyType);
            return this;
        }

        public Builder setSignatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        public X509CertificateDetailsResponse build() {
            return new X509CertificateDetailsResponse(expiryTime, issuer, publicKeyType, signatureAlgorithm, startTime, subject);
        }
    }
}
