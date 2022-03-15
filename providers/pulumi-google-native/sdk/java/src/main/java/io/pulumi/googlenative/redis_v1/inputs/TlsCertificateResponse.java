// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.redis_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * TlsCertificate Resource
 * 
 */
public final class TlsCertificateResponse extends io.pulumi.resources.InvokeArgs {

    public static final TlsCertificateResponse Empty = new TlsCertificateResponse();

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
     * The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2020-05-18T00:00:00.094Z`.
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2020-05-18T00:00:00.094Z`.
     * 
     */
    @Import(name="expireTime", required=true)
      private final String expireTime;

    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * Serial number, as extracted from the certificate.
     * 
     */
    @Import(name="serialNumber", required=true)
      private final String serialNumber;

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * Sha1 Fingerprint of the certificate.
     * 
     */
    @Import(name="sha1Fingerprint", required=true)
      private final String sha1Fingerprint;

    public String getSha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    public TlsCertificateResponse(
        String cert,
        String createTime,
        String expireTime,
        String serialNumber,
        String sha1Fingerprint) {
        this.cert = Objects.requireNonNull(cert, "expected parameter 'cert' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.expireTime = Objects.requireNonNull(expireTime, "expected parameter 'expireTime' to be non-null");
        this.serialNumber = Objects.requireNonNull(serialNumber, "expected parameter 'serialNumber' to be non-null");
        this.sha1Fingerprint = Objects.requireNonNull(sha1Fingerprint, "expected parameter 'sha1Fingerprint' to be non-null");
    }

    private TlsCertificateResponse() {
        this.cert = null;
        this.createTime = null;
        this.expireTime = null;
        this.serialNumber = null;
        this.sha1Fingerprint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cert;
        private String createTime;
        private String expireTime;
        private String serialNumber;
        private String sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.serialNumber = defaults.serialNumber;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        public Builder cert(String cert) {
            this.cert = Objects.requireNonNull(cert);
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }

        public Builder sha1Fingerprint(String sha1Fingerprint) {
            this.sha1Fingerprint = Objects.requireNonNull(sha1Fingerprint);
            return this;
        }
        public TlsCertificateResponse build() {
            return new TlsCertificateResponse(cert, createTime, expireTime, serialNumber, sha1Fingerprint);
        }
    }
}
