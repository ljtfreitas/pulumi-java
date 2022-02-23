// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca.outputs;

import io.pulumi.aws.acmpca.outputs.GetCertificateAuthorityRevocationConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetCertificateAuthorityResult {
    private final String arn;
    /**
     * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    private final String certificate;
    /**
     * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    private final String certificateChain;
    /**
     * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     * 
     */
    private final String certificateSigningRequest;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    private final String notAfter;
    /**
     * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    private final String notBefore;
    /**
     * Nested attribute containing revocation configuration.
     * * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
     * * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
     * * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
     * * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
     * * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
     * * `revocation_configuration.0.crl_configuration.0.s3_object_acl` - Whether the CRL is publicly readable or privately held in the CRL Amazon S3 bucket.
     * 
     */
    private final List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations;
    /**
     * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
     * 
     */
    private final String serial;
    /**
     * Status of the certificate authority.
     * 
     */
    private final String status;
    /**
     * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
     * 
     */
    private final Map<String,String> tags;
    /**
     * The type of the certificate authority.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"arn","certificate","certificateChain","certificateSigningRequest","id","notAfter","notBefore","revocationConfigurations","serial","status","tags","type"})
    private GetCertificateAuthorityResult(
        String arn,
        String certificate,
        String certificateChain,
        String certificateSigningRequest,
        String id,
        String notAfter,
        String notBefore,
        List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations,
        String serial,
        String status,
        Map<String,String> tags,
        String type) {
        this.arn = Objects.requireNonNull(arn);
        this.certificate = Objects.requireNonNull(certificate);
        this.certificateChain = Objects.requireNonNull(certificateChain);
        this.certificateSigningRequest = Objects.requireNonNull(certificateSigningRequest);
        this.id = Objects.requireNonNull(id);
        this.notAfter = Objects.requireNonNull(notAfter);
        this.notBefore = Objects.requireNonNull(notBefore);
        this.revocationConfigurations = Objects.requireNonNull(revocationConfigurations);
        this.serial = Objects.requireNonNull(serial);
        this.status = Objects.requireNonNull(status);
        this.tags = Objects.requireNonNull(tags);
        this.type = Objects.requireNonNull(type);
    }

    public String getArn() {
        return this.arn;
    }
    /**
     * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    public String getCertificate() {
        return this.certificate;
    }
    /**
     * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    public String getCertificateChain() {
        return this.certificateChain;
    }
    /**
     * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     * 
     */
    public String getCertificateSigningRequest() {
        return this.certificateSigningRequest;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    public String getNotAfter() {
        return this.notAfter;
    }
    /**
     * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    public String getNotBefore() {
        return this.notBefore;
    }
    /**
     * Nested attribute containing revocation configuration.
     * * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
     * * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
     * * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
     * * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
     * * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
     * * `revocation_configuration.0.crl_configuration.0.s3_object_acl` - Whether the CRL is publicly readable or privately held in the CRL Amazon S3 bucket.
     * 
     */
    public List<GetCertificateAuthorityRevocationConfiguration> getRevocationConfigurations() {
        return this.revocationConfigurations;
    }
    /**
     * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
     * 
     */
    public String getSerial() {
        return this.serial;
    }
    /**
     * Status of the certificate authority.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The type of the certificate authority.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateAuthorityResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String certificate;
        private String certificateChain;
        private String certificateSigningRequest;
        private String id;
        private String notAfter;
        private String notBefore;
        private List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations;
        private String serial;
        private String status;
        private Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateAuthorityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificate = defaults.certificate;
    	      this.certificateChain = defaults.certificateChain;
    	      this.certificateSigningRequest = defaults.certificateSigningRequest;
    	      this.id = defaults.id;
    	      this.notAfter = defaults.notAfter;
    	      this.notBefore = defaults.notBefore;
    	      this.revocationConfigurations = defaults.revocationConfigurations;
    	      this.serial = defaults.serial;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCertificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder setCertificateChain(String certificateChain) {
            this.certificateChain = Objects.requireNonNull(certificateChain);
            return this;
        }

        public Builder setCertificateSigningRequest(String certificateSigningRequest) {
            this.certificateSigningRequest = Objects.requireNonNull(certificateSigningRequest);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setNotAfter(String notAfter) {
            this.notAfter = Objects.requireNonNull(notAfter);
            return this;
        }

        public Builder setNotBefore(String notBefore) {
            this.notBefore = Objects.requireNonNull(notBefore);
            return this;
        }

        public Builder setRevocationConfigurations(List<GetCertificateAuthorityRevocationConfiguration> revocationConfigurations) {
            this.revocationConfigurations = Objects.requireNonNull(revocationConfigurations);
            return this;
        }

        public Builder setSerial(String serial) {
            this.serial = Objects.requireNonNull(serial);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetCertificateAuthorityResult build() {
            return new GetCertificateAuthorityResult(arn, certificate, certificateChain, certificateSigningRequest, id, notAfter, notBefore, revocationConfigurations, serial, status, tags, type);
        }
    }
}
