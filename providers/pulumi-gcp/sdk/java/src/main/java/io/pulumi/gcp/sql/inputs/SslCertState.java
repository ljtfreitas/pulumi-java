// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SslCertState extends io.pulumi.resources.ResourceArgs {

    public static final SslCertState Empty = new SslCertState();

    /**
     * The actual certificate data for this client certificate.
     * 
     */
    @Import(name="cert")
      private final @Nullable Output<String> cert;

    public Output<String> getCert() {
        return this.cert == null ? Output.empty() : this.cert;
    }

    /**
     * The serial number extracted from the certificate data.
     * 
     */
    @Import(name="certSerialNumber")
      private final @Nullable Output<String> certSerialNumber;

    public Output<String> getCertSerialNumber() {
        return this.certSerialNumber == null ? Output.empty() : this.certSerialNumber;
    }

    /**
     * The common name to be used in the certificate to identify the
     * client. Constrained to [a-zA-Z.-_ ]+. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="commonName")
      private final @Nullable Output<String> commonName;

    public Output<String> getCommonName() {
        return this.commonName == null ? Output.empty() : this.commonName;
    }

    /**
     * The time when the certificate was created in RFC 3339 format,
     * for example 2012-11-15T16:19:00.094Z.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Output.empty() : this.createTime;
    }

    /**
     * The time when the certificate expires in RFC 3339 format,
     * for example 2012-11-15T16:19:00.094Z.
     * 
     */
    @Import(name="expirationTime")
      private final @Nullable Output<String> expirationTime;

    public Output<String> getExpirationTime() {
        return this.expirationTime == null ? Output.empty() : this.expirationTime;
    }

    /**
     * The name of the Cloud SQL instance. Changing this
     * forces a new resource to be created.
     * 
     */
    @Import(name="instance")
      private final @Nullable Output<String> instance;

    public Output<String> getInstance() {
        return this.instance == null ? Output.empty() : this.instance;
    }

    /**
     * The private key associated with the client certificate.
     * 
     */
    @Import(name="privateKey")
      private final @Nullable Output<String> privateKey;

    public Output<String> getPrivateKey() {
        return this.privateKey == null ? Output.empty() : this.privateKey;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The CA cert of the server this client cert was generated from.
     * 
     */
    @Import(name="serverCaCert")
      private final @Nullable Output<String> serverCaCert;

    public Output<String> getServerCaCert() {
        return this.serverCaCert == null ? Output.empty() : this.serverCaCert;
    }

    /**
     * The SHA1 Fingerprint of the certificate.
     * 
     */
    @Import(name="sha1Fingerprint")
      private final @Nullable Output<String> sha1Fingerprint;

    public Output<String> getSha1Fingerprint() {
        return this.sha1Fingerprint == null ? Output.empty() : this.sha1Fingerprint;
    }

    public SslCertState(
        @Nullable Output<String> cert,
        @Nullable Output<String> certSerialNumber,
        @Nullable Output<String> commonName,
        @Nullable Output<String> createTime,
        @Nullable Output<String> expirationTime,
        @Nullable Output<String> instance,
        @Nullable Output<String> privateKey,
        @Nullable Output<String> project,
        @Nullable Output<String> serverCaCert,
        @Nullable Output<String> sha1Fingerprint) {
        this.cert = cert;
        this.certSerialNumber = certSerialNumber;
        this.commonName = commonName;
        this.createTime = createTime;
        this.expirationTime = expirationTime;
        this.instance = instance;
        this.privateKey = privateKey;
        this.project = project;
        this.serverCaCert = serverCaCert;
        this.sha1Fingerprint = sha1Fingerprint;
    }

    private SslCertState() {
        this.cert = Output.empty();
        this.certSerialNumber = Output.empty();
        this.commonName = Output.empty();
        this.createTime = Output.empty();
        this.expirationTime = Output.empty();
        this.instance = Output.empty();
        this.privateKey = Output.empty();
        this.project = Output.empty();
        this.serverCaCert = Output.empty();
        this.sha1Fingerprint = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslCertState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cert;
        private @Nullable Output<String> certSerialNumber;
        private @Nullable Output<String> commonName;
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> expirationTime;
        private @Nullable Output<String> instance;
        private @Nullable Output<String> privateKey;
        private @Nullable Output<String> project;
        private @Nullable Output<String> serverCaCert;
        private @Nullable Output<String> sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(SslCertState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.certSerialNumber = defaults.certSerialNumber;
    	      this.commonName = defaults.commonName;
    	      this.createTime = defaults.createTime;
    	      this.expirationTime = defaults.expirationTime;
    	      this.instance = defaults.instance;
    	      this.privateKey = defaults.privateKey;
    	      this.project = defaults.project;
    	      this.serverCaCert = defaults.serverCaCert;
    	      this.sha1Fingerprint = defaults.sha1Fingerprint;
        }

        public Builder cert(@Nullable Output<String> cert) {
            this.cert = cert;
            return this;
        }

        public Builder cert(@Nullable String cert) {
            this.cert = Output.ofNullable(cert);
            return this;
        }

        public Builder certSerialNumber(@Nullable Output<String> certSerialNumber) {
            this.certSerialNumber = certSerialNumber;
            return this;
        }

        public Builder certSerialNumber(@Nullable String certSerialNumber) {
            this.certSerialNumber = Output.ofNullable(certSerialNumber);
            return this;
        }

        public Builder commonName(@Nullable Output<String> commonName) {
            this.commonName = commonName;
            return this;
        }

        public Builder commonName(@Nullable String commonName) {
            this.commonName = Output.ofNullable(commonName);
            return this;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder createTime(@Nullable String createTime) {
            this.createTime = Output.ofNullable(createTime);
            return this;
        }

        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder expirationTime(@Nullable String expirationTime) {
            this.expirationTime = Output.ofNullable(expirationTime);
            return this;
        }

        public Builder instance(@Nullable Output<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder instance(@Nullable String instance) {
            this.instance = Output.ofNullable(instance);
            return this;
        }

        public Builder privateKey(@Nullable Output<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = Output.ofNullable(privateKey);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder serverCaCert(@Nullable Output<String> serverCaCert) {
            this.serverCaCert = serverCaCert;
            return this;
        }

        public Builder serverCaCert(@Nullable String serverCaCert) {
            this.serverCaCert = Output.ofNullable(serverCaCert);
            return this;
        }

        public Builder sha1Fingerprint(@Nullable Output<String> sha1Fingerprint) {
            this.sha1Fingerprint = sha1Fingerprint;
            return this;
        }

        public Builder sha1Fingerprint(@Nullable String sha1Fingerprint) {
            this.sha1Fingerprint = Output.ofNullable(sha1Fingerprint);
            return this;
        }
        public SslCertState build() {
            return new SslCertState(cert, certSerialNumber, commonName, createTime, expirationTime, instance, privateKey, project, serverCaCert, sha1Fingerprint);
        }
    }
}
