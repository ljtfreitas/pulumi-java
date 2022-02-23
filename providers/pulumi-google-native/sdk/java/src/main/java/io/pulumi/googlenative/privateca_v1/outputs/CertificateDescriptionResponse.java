// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.privateca_v1.outputs.CertificateFingerprintResponse;
import io.pulumi.googlenative.privateca_v1.outputs.KeyIdResponse;
import io.pulumi.googlenative.privateca_v1.outputs.PublicKeyResponse;
import io.pulumi.googlenative.privateca_v1.outputs.SubjectDescriptionResponse;
import io.pulumi.googlenative.privateca_v1.outputs.X509ParametersResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class CertificateDescriptionResponse {
    /**
     * Describes lists of issuer CA certificate URLs that appear in the "Authority Information Access" extension in the certificate.
     * 
     */
    private final List<String> aiaIssuingCertificateUrls;
    /**
     * Identifies the subject_key_id of the parent certificate, per https://tools.ietf.org/html/rfc5280#section-4.2.1.1
     * 
     */
    private final KeyIdResponse authorityKeyId;
    /**
     * The hash of the x.509 certificate.
     * 
     */
    private final CertificateFingerprintResponse certFingerprint;
    /**
     * Describes a list of locations to obtain CRL information, i.e. the DistributionPoint.fullName described by https://tools.ietf.org/html/rfc5280#section-4.2.1.13
     * 
     */
    private final List<String> crlDistributionPoints;
    /**
     * The public key that corresponds to an issued certificate.
     * 
     */
    private final PublicKeyResponse publicKey;
    /**
     * Describes some of the values in a certificate that are related to the subject and lifetime.
     * 
     */
    private final SubjectDescriptionResponse subjectDescription;
    /**
     * Provides a means of identifiying certificates that contain a particular public key, per https://tools.ietf.org/html/rfc5280#section-4.2.1.2.
     * 
     */
    private final KeyIdResponse subjectKeyId;
    /**
     * Describes some of the technical X.509 fields in a certificate.
     * 
     */
    private final X509ParametersResponse x509Description;

    @OutputCustomType.Constructor({"aiaIssuingCertificateUrls","authorityKeyId","certFingerprint","crlDistributionPoints","publicKey","subjectDescription","subjectKeyId","x509Description"})
    private CertificateDescriptionResponse(
        List<String> aiaIssuingCertificateUrls,
        KeyIdResponse authorityKeyId,
        CertificateFingerprintResponse certFingerprint,
        List<String> crlDistributionPoints,
        PublicKeyResponse publicKey,
        SubjectDescriptionResponse subjectDescription,
        KeyIdResponse subjectKeyId,
        X509ParametersResponse x509Description) {
        this.aiaIssuingCertificateUrls = Objects.requireNonNull(aiaIssuingCertificateUrls);
        this.authorityKeyId = Objects.requireNonNull(authorityKeyId);
        this.certFingerprint = Objects.requireNonNull(certFingerprint);
        this.crlDistributionPoints = Objects.requireNonNull(crlDistributionPoints);
        this.publicKey = Objects.requireNonNull(publicKey);
        this.subjectDescription = Objects.requireNonNull(subjectDescription);
        this.subjectKeyId = Objects.requireNonNull(subjectKeyId);
        this.x509Description = Objects.requireNonNull(x509Description);
    }

    /**
     * Describes lists of issuer CA certificate URLs that appear in the "Authority Information Access" extension in the certificate.
     * 
     */
    public List<String> getAiaIssuingCertificateUrls() {
        return this.aiaIssuingCertificateUrls;
    }
    /**
     * Identifies the subject_key_id of the parent certificate, per https://tools.ietf.org/html/rfc5280#section-4.2.1.1
     * 
     */
    public KeyIdResponse getAuthorityKeyId() {
        return this.authorityKeyId;
    }
    /**
     * The hash of the x.509 certificate.
     * 
     */
    public CertificateFingerprintResponse getCertFingerprint() {
        return this.certFingerprint;
    }
    /**
     * Describes a list of locations to obtain CRL information, i.e. the DistributionPoint.fullName described by https://tools.ietf.org/html/rfc5280#section-4.2.1.13
     * 
     */
    public List<String> getCrlDistributionPoints() {
        return this.crlDistributionPoints;
    }
    /**
     * The public key that corresponds to an issued certificate.
     * 
     */
    public PublicKeyResponse getPublicKey() {
        return this.publicKey;
    }
    /**
     * Describes some of the values in a certificate that are related to the subject and lifetime.
     * 
     */
    public SubjectDescriptionResponse getSubjectDescription() {
        return this.subjectDescription;
    }
    /**
     * Provides a means of identifiying certificates that contain a particular public key, per https://tools.ietf.org/html/rfc5280#section-4.2.1.2.
     * 
     */
    public KeyIdResponse getSubjectKeyId() {
        return this.subjectKeyId;
    }
    /**
     * Describes some of the technical X.509 fields in a certificate.
     * 
     */
    public X509ParametersResponse getX509Description() {
        return this.x509Description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> aiaIssuingCertificateUrls;
        private KeyIdResponse authorityKeyId;
        private CertificateFingerprintResponse certFingerprint;
        private List<String> crlDistributionPoints;
        private PublicKeyResponse publicKey;
        private SubjectDescriptionResponse subjectDescription;
        private KeyIdResponse subjectKeyId;
        private X509ParametersResponse x509Description;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aiaIssuingCertificateUrls = defaults.aiaIssuingCertificateUrls;
    	      this.authorityKeyId = defaults.authorityKeyId;
    	      this.certFingerprint = defaults.certFingerprint;
    	      this.crlDistributionPoints = defaults.crlDistributionPoints;
    	      this.publicKey = defaults.publicKey;
    	      this.subjectDescription = defaults.subjectDescription;
    	      this.subjectKeyId = defaults.subjectKeyId;
    	      this.x509Description = defaults.x509Description;
        }

        public Builder setAiaIssuingCertificateUrls(List<String> aiaIssuingCertificateUrls) {
            this.aiaIssuingCertificateUrls = Objects.requireNonNull(aiaIssuingCertificateUrls);
            return this;
        }

        public Builder setAuthorityKeyId(KeyIdResponse authorityKeyId) {
            this.authorityKeyId = Objects.requireNonNull(authorityKeyId);
            return this;
        }

        public Builder setCertFingerprint(CertificateFingerprintResponse certFingerprint) {
            this.certFingerprint = Objects.requireNonNull(certFingerprint);
            return this;
        }

        public Builder setCrlDistributionPoints(List<String> crlDistributionPoints) {
            this.crlDistributionPoints = Objects.requireNonNull(crlDistributionPoints);
            return this;
        }

        public Builder setPublicKey(PublicKeyResponse publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder setSubjectDescription(SubjectDescriptionResponse subjectDescription) {
            this.subjectDescription = Objects.requireNonNull(subjectDescription);
            return this;
        }

        public Builder setSubjectKeyId(KeyIdResponse subjectKeyId) {
            this.subjectKeyId = Objects.requireNonNull(subjectKeyId);
            return this;
        }

        public Builder setX509Description(X509ParametersResponse x509Description) {
            this.x509Description = Objects.requireNonNull(x509Description);
            return this;
        }
        public CertificateDescriptionResponse build() {
            return new CertificateDescriptionResponse(aiaIssuingCertificateUrls, authorityKeyId, certFingerprint, crlDistributionPoints, publicKey, subjectDescription, subjectKeyId, x509Description);
        }
    }
}
