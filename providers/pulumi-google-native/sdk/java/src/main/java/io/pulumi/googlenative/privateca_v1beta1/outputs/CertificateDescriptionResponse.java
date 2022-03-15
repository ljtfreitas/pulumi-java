// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.privateca_v1beta1.outputs.CertificateFingerprintResponse;
import io.pulumi.googlenative.privateca_v1beta1.outputs.KeyIdResponse;
import io.pulumi.googlenative.privateca_v1beta1.outputs.PublicKeyResponse;
import io.pulumi.googlenative.privateca_v1beta1.outputs.ReusableConfigValuesResponse;
import io.pulumi.googlenative.privateca_v1beta1.outputs.SubjectDescriptionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
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
     * Describes some of the technical fields in a certificate.
     * 
     */
    private final ReusableConfigValuesResponse configValues;
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

    @CustomType.Constructor
    private CertificateDescriptionResponse(
        @CustomType.Parameter("aiaIssuingCertificateUrls") List<String> aiaIssuingCertificateUrls,
        @CustomType.Parameter("authorityKeyId") KeyIdResponse authorityKeyId,
        @CustomType.Parameter("certFingerprint") CertificateFingerprintResponse certFingerprint,
        @CustomType.Parameter("configValues") ReusableConfigValuesResponse configValues,
        @CustomType.Parameter("crlDistributionPoints") List<String> crlDistributionPoints,
        @CustomType.Parameter("publicKey") PublicKeyResponse publicKey,
        @CustomType.Parameter("subjectDescription") SubjectDescriptionResponse subjectDescription,
        @CustomType.Parameter("subjectKeyId") KeyIdResponse subjectKeyId) {
        this.aiaIssuingCertificateUrls = aiaIssuingCertificateUrls;
        this.authorityKeyId = authorityKeyId;
        this.certFingerprint = certFingerprint;
        this.configValues = configValues;
        this.crlDistributionPoints = crlDistributionPoints;
        this.publicKey = publicKey;
        this.subjectDescription = subjectDescription;
        this.subjectKeyId = subjectKeyId;
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
     * Describes some of the technical fields in a certificate.
     * 
    */
    public ReusableConfigValuesResponse getConfigValues() {
        return this.configValues;
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
        private ReusableConfigValuesResponse configValues;
        private List<String> crlDistributionPoints;
        private PublicKeyResponse publicKey;
        private SubjectDescriptionResponse subjectDescription;
        private KeyIdResponse subjectKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aiaIssuingCertificateUrls = defaults.aiaIssuingCertificateUrls;
    	      this.authorityKeyId = defaults.authorityKeyId;
    	      this.certFingerprint = defaults.certFingerprint;
    	      this.configValues = defaults.configValues;
    	      this.crlDistributionPoints = defaults.crlDistributionPoints;
    	      this.publicKey = defaults.publicKey;
    	      this.subjectDescription = defaults.subjectDescription;
    	      this.subjectKeyId = defaults.subjectKeyId;
        }

        public Builder aiaIssuingCertificateUrls(List<String> aiaIssuingCertificateUrls) {
            this.aiaIssuingCertificateUrls = Objects.requireNonNull(aiaIssuingCertificateUrls);
            return this;
        }

        public Builder authorityKeyId(KeyIdResponse authorityKeyId) {
            this.authorityKeyId = Objects.requireNonNull(authorityKeyId);
            return this;
        }

        public Builder certFingerprint(CertificateFingerprintResponse certFingerprint) {
            this.certFingerprint = Objects.requireNonNull(certFingerprint);
            return this;
        }

        public Builder configValues(ReusableConfigValuesResponse configValues) {
            this.configValues = Objects.requireNonNull(configValues);
            return this;
        }

        public Builder crlDistributionPoints(List<String> crlDistributionPoints) {
            this.crlDistributionPoints = Objects.requireNonNull(crlDistributionPoints);
            return this;
        }

        public Builder publicKey(PublicKeyResponse publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder subjectDescription(SubjectDescriptionResponse subjectDescription) {
            this.subjectDescription = Objects.requireNonNull(subjectDescription);
            return this;
        }

        public Builder subjectKeyId(KeyIdResponse subjectKeyId) {
            this.subjectKeyId = Objects.requireNonNull(subjectKeyId);
            return this;
        }
        public CertificateDescriptionResponse build() {
            return new CertificateDescriptionResponse(aiaIssuingCertificateUrls, authorityKeyId, certFingerprint, configValues, crlDistributionPoints, publicKey, subjectDescription, subjectKeyId);
        }
    }
}
