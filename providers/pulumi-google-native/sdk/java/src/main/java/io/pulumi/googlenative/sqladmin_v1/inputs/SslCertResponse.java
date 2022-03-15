// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * SslCerts Resource
 * 
 */
public final class SslCertResponse extends io.pulumi.resources.InvokeArgs {

    public static final SslCertResponse Empty = new SslCertResponse();

    /**
     * PEM representation.
     * 
     */
    @Import(name="cert", required=true)
      private final String cert;

    public String getCert() {
        return this.cert;
    }

    /**
     * Serial number, as extracted from the certificate.
     * 
     */
    @Import(name="certSerialNumber", required=true)
      private final String certSerialNumber;

    public String getCertSerialNumber() {
        return this.certSerialNumber;
    }

    /**
     * User supplied name. Constrained to [a-zA-Z.-_ ]+.
     * 
     */
    @Import(name="commonName", required=true)
      private final String commonName;

    public String getCommonName() {
        return this.commonName;
    }

    /**
     * The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Import(name="expirationTime", required=true)
      private final String expirationTime;

    public String getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * Name of the database instance.
     * 
     */
    @Import(name="instance", required=true)
      private final String instance;

    public String getInstance() {
        return this.instance;
    }

    /**
     * This is always `sql#sslCert`.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * The URI of this resource.
     * 
     */
    @Import(name="selfLink", required=true)
      private final String selfLink;

    public String getSelfLink() {
        return this.selfLink;
    }

    /**
     * Sha1 Fingerprint.
     * 
     */
    @Import(name="sha1Fingerprint", required=true)
      private final String sha1Fingerprint;

    public String getSha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    public SslCertResponse(
        String cert,
        String certSerialNumber,
        String commonName,
        String createTime,
        String expirationTime,
        String instance,
        String kind,
        String selfLink,
        String sha1Fingerprint) {
        this.cert = Objects.requireNonNull(cert, "expected parameter 'cert' to be non-null");
        this.certSerialNumber = Objects.requireNonNull(certSerialNumber, "expected parameter 'certSerialNumber' to be non-null");
        this.commonName = Objects.requireNonNull(commonName, "expected parameter 'commonName' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.expirationTime = Objects.requireNonNull(expirationTime, "expected parameter 'expirationTime' to be non-null");
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.selfLink = Objects.requireNonNull(selfLink, "expected parameter 'selfLink' to be non-null");
        this.sha1Fingerprint = Objects.requireNonNull(sha1Fingerprint, "expected parameter 'sha1Fingerprint' to be non-null");
    }

    private SslCertResponse() {
        this.cert = null;
        this.certSerialNumber = null;
        this.commonName = null;
        this.createTime = null;
        this.expirationTime = null;
        this.instance = null;
        this.kind = null;
        this.selfLink = null;
        this.sha1Fingerprint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslCertResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cert;
        private String certSerialNumber;
        private String commonName;
        private String createTime;
        private String expirationTime;
        private String instance;
        private String kind;
        private String selfLink;
        private String sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(SslCertResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.certSerialNumber = defaults.certSerialNumber;
    	      this.commonName = defaults.commonName;
    	      this.createTime = defaults.createTime;
    	      this.expirationTime = defaults.expirationTime;
    	      this.instance = defaults.instance;
    	      this.kind = defaults.kind;
    	      this.selfLink = defaults.selfLink;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        public Builder cert(String cert) {
            this.cert = Objects.requireNonNull(cert);
            return this;
        }

        public Builder certSerialNumber(String certSerialNumber) {
            this.certSerialNumber = Objects.requireNonNull(certSerialNumber);
            return this;
        }

        public Builder commonName(String commonName) {
            this.commonName = Objects.requireNonNull(commonName);
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder expirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }

        public Builder instance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder sha1Fingerprint(String sha1Fingerprint) {
            this.sha1Fingerprint = Objects.requireNonNull(sha1Fingerprint);
            return this;
        }
        public SslCertResponse build() {
            return new SslCertResponse(cert, certSerialNumber, commonName, createTime, expirationTime, instance, kind, selfLink, sha1Fingerprint);
        }
    }
}
