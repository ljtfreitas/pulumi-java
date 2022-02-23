// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SslCerts Resource
 * 
 */
public final class SslCertArgs extends io.pulumi.resources.ResourceArgs {

    public static final SslCertArgs Empty = new SslCertArgs();

    /**
     * PEM representation.
     * 
     */
    @InputImport(name="cert")
      private final @Nullable Input<String> cert;

    public Input<String> getCert() {
        return this.cert == null ? Input.empty() : this.cert;
    }

    /**
     * Serial number, as extracted from the certificate.
     * 
     */
    @InputImport(name="certSerialNumber")
      private final @Nullable Input<String> certSerialNumber;

    public Input<String> getCertSerialNumber() {
        return this.certSerialNumber == null ? Input.empty() : this.certSerialNumber;
    }

    /**
     * User supplied name. Constrained to [a-zA-Z.-_ ]+.
     * 
     */
    @InputImport(name="commonName")
      private final @Nullable Input<String> commonName;

    public Input<String> getCommonName() {
        return this.commonName == null ? Input.empty() : this.commonName;
    }

    /**
     * The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`
     * 
     */
    @InputImport(name="createTime")
      private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @InputImport(name="expirationTime")
      private final @Nullable Input<String> expirationTime;

    public Input<String> getExpirationTime() {
        return this.expirationTime == null ? Input.empty() : this.expirationTime;
    }

    /**
     * Name of the database instance.
     * 
     */
    @InputImport(name="instance")
      private final @Nullable Input<String> instance;

    public Input<String> getInstance() {
        return this.instance == null ? Input.empty() : this.instance;
    }

    /**
     * This is always `sql#sslCert`.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The URI of this resource.
     * 
     */
    @InputImport(name="selfLink")
      private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * Sha1 Fingerprint.
     * 
     */
    @InputImport(name="sha1Fingerprint")
      private final @Nullable Input<String> sha1Fingerprint;

    public Input<String> getSha1Fingerprint() {
        return this.sha1Fingerprint == null ? Input.empty() : this.sha1Fingerprint;
    }

    public SslCertArgs(
        @Nullable Input<String> cert,
        @Nullable Input<String> certSerialNumber,
        @Nullable Input<String> commonName,
        @Nullable Input<String> createTime,
        @Nullable Input<String> expirationTime,
        @Nullable Input<String> instance,
        @Nullable Input<String> kind,
        @Nullable Input<String> selfLink,
        @Nullable Input<String> sha1Fingerprint) {
        this.cert = cert;
        this.certSerialNumber = certSerialNumber;
        this.commonName = commonName;
        this.createTime = createTime;
        this.expirationTime = expirationTime;
        this.instance = instance;
        this.kind = kind;
        this.selfLink = selfLink;
        this.sha1Fingerprint = sha1Fingerprint;
    }

    private SslCertArgs() {
        this.cert = Input.empty();
        this.certSerialNumber = Input.empty();
        this.commonName = Input.empty();
        this.createTime = Input.empty();
        this.expirationTime = Input.empty();
        this.instance = Input.empty();
        this.kind = Input.empty();
        this.selfLink = Input.empty();
        this.sha1Fingerprint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslCertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cert;
        private @Nullable Input<String> certSerialNumber;
        private @Nullable Input<String> commonName;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> expirationTime;
        private @Nullable Input<String> instance;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<String> sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(SslCertArgs defaults) {
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

        public Builder setCert(@Nullable Input<String> cert) {
            this.cert = cert;
            return this;
        }

        public Builder setCert(@Nullable String cert) {
            this.cert = Input.ofNullable(cert);
            return this;
        }

        public Builder setCertSerialNumber(@Nullable Input<String> certSerialNumber) {
            this.certSerialNumber = certSerialNumber;
            return this;
        }

        public Builder setCertSerialNumber(@Nullable String certSerialNumber) {
            this.certSerialNumber = Input.ofNullable(certSerialNumber);
            return this;
        }

        public Builder setCommonName(@Nullable Input<String> commonName) {
            this.commonName = commonName;
            return this;
        }

        public Builder setCommonName(@Nullable String commonName) {
            this.commonName = Input.ofNullable(commonName);
            return this;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setExpirationTime(@Nullable Input<String> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder setExpirationTime(@Nullable String expirationTime) {
            this.expirationTime = Input.ofNullable(expirationTime);
            return this;
        }

        public Builder setInstance(@Nullable Input<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder setInstance(@Nullable String instance) {
            this.instance = Input.ofNullable(instance);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setSha1Fingerprint(@Nullable Input<String> sha1Fingerprint) {
            this.sha1Fingerprint = sha1Fingerprint;
            return this;
        }

        public Builder setSha1Fingerprint(@Nullable String sha1Fingerprint) {
            this.sha1Fingerprint = Input.ofNullable(sha1Fingerprint);
            return this;
        }
        public SslCertArgs build() {
            return new SslCertArgs(cert, certSerialNumber, commonName, createTime, expirationTime, instance, kind, selfLink, sha1Fingerprint);
        }
    }
}
