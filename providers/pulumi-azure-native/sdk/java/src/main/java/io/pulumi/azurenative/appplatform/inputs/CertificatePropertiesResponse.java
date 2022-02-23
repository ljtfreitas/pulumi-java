// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Certificate resource payload.
 * 
 */
public final class CertificatePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final CertificatePropertiesResponse Empty = new CertificatePropertiesResponse();

    /**
     * The activate date of certificate.
     * 
     */
    @InputImport(name="activateDate", required=true)
        private final String activateDate;

    public String getActivateDate() {
        return this.activateDate;
    }

    /**
     * The certificate version of key vault.
     * 
     */
    @InputImport(name="certVersion")
        private final @Nullable String certVersion;

    public Optional<String> getCertVersion() {
        return this.certVersion == null ? Optional.empty() : Optional.ofNullable(this.certVersion);
    }

    /**
     * The domain list of certificate.
     * 
     */
    @InputImport(name="dnsNames", required=true)
        private final List<String> dnsNames;

    public List<String> getDnsNames() {
        return this.dnsNames;
    }

    /**
     * The expiration date of certificate.
     * 
     */
    @InputImport(name="expirationDate", required=true)
        private final String expirationDate;

    public String getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * The issue date of certificate.
     * 
     */
    @InputImport(name="issuedDate", required=true)
        private final String issuedDate;

    public String getIssuedDate() {
        return this.issuedDate;
    }

    /**
     * The issuer of certificate.
     * 
     */
    @InputImport(name="issuer", required=true)
        private final String issuer;

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * The certificate name of key vault.
     * 
     */
    @InputImport(name="keyVaultCertName", required=true)
        private final String keyVaultCertName;

    public String getKeyVaultCertName() {
        return this.keyVaultCertName;
    }

    /**
     * The subject name of certificate.
     * 
     */
    @InputImport(name="subjectName", required=true)
        private final String subjectName;

    public String getSubjectName() {
        return this.subjectName;
    }

    /**
     * The thumbprint of certificate.
     * 
     */
    @InputImport(name="thumbprint", required=true)
        private final String thumbprint;

    public String getThumbprint() {
        return this.thumbprint;
    }

    /**
     * The vault uri of user key vault.
     * 
     */
    @InputImport(name="vaultUri", required=true)
        private final String vaultUri;

    public String getVaultUri() {
        return this.vaultUri;
    }

    public CertificatePropertiesResponse(
        String activateDate,
        @Nullable String certVersion,
        List<String> dnsNames,
        String expirationDate,
        String issuedDate,
        String issuer,
        String keyVaultCertName,
        String subjectName,
        String thumbprint,
        String vaultUri) {
        this.activateDate = Objects.requireNonNull(activateDate, "expected parameter 'activateDate' to be non-null");
        this.certVersion = certVersion;
        this.dnsNames = Objects.requireNonNull(dnsNames, "expected parameter 'dnsNames' to be non-null");
        this.expirationDate = Objects.requireNonNull(expirationDate, "expected parameter 'expirationDate' to be non-null");
        this.issuedDate = Objects.requireNonNull(issuedDate, "expected parameter 'issuedDate' to be non-null");
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
        this.keyVaultCertName = Objects.requireNonNull(keyVaultCertName, "expected parameter 'keyVaultCertName' to be non-null");
        this.subjectName = Objects.requireNonNull(subjectName, "expected parameter 'subjectName' to be non-null");
        this.thumbprint = Objects.requireNonNull(thumbprint, "expected parameter 'thumbprint' to be non-null");
        this.vaultUri = Objects.requireNonNull(vaultUri, "expected parameter 'vaultUri' to be non-null");
    }

    private CertificatePropertiesResponse() {
        this.activateDate = null;
        this.certVersion = null;
        this.dnsNames = List.of();
        this.expirationDate = null;
        this.issuedDate = null;
        this.issuer = null;
        this.keyVaultCertName = null;
        this.subjectName = null;
        this.thumbprint = null;
        this.vaultUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificatePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activateDate;
        private @Nullable String certVersion;
        private List<String> dnsNames;
        private String expirationDate;
        private String issuedDate;
        private String issuer;
        private String keyVaultCertName;
        private String subjectName;
        private String thumbprint;
        private String vaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificatePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activateDate = defaults.activateDate;
    	      this.certVersion = defaults.certVersion;
    	      this.dnsNames = defaults.dnsNames;
    	      this.expirationDate = defaults.expirationDate;
    	      this.issuedDate = defaults.issuedDate;
    	      this.issuer = defaults.issuer;
    	      this.keyVaultCertName = defaults.keyVaultCertName;
    	      this.subjectName = defaults.subjectName;
    	      this.thumbprint = defaults.thumbprint;
    	      this.vaultUri = defaults.vaultUri;
        }

        public Builder setActivateDate(String activateDate) {
            this.activateDate = Objects.requireNonNull(activateDate);
            return this;
        }

        public Builder setCertVersion(@Nullable String certVersion) {
            this.certVersion = certVersion;
            return this;
        }

        public Builder setDnsNames(List<String> dnsNames) {
            this.dnsNames = Objects.requireNonNull(dnsNames);
            return this;
        }

        public Builder setExpirationDate(String expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }

        public Builder setIssuedDate(String issuedDate) {
            this.issuedDate = Objects.requireNonNull(issuedDate);
            return this;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder setKeyVaultCertName(String keyVaultCertName) {
            this.keyVaultCertName = Objects.requireNonNull(keyVaultCertName);
            return this;
        }

        public Builder setSubjectName(String subjectName) {
            this.subjectName = Objects.requireNonNull(subjectName);
            return this;
        }

        public Builder setThumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }

        public Builder setVaultUri(String vaultUri) {
            this.vaultUri = Objects.requireNonNull(vaultUri);
            return this;
        }
        public CertificatePropertiesResponse build() {
            return new CertificatePropertiesResponse(activateDate, certVersion, dnsNames, expirationDate, issuedDate, issuer, keyVaultCertName, subjectName, thumbprint, vaultUri);
        }
    }
}
