// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceServerCaCertGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceServerCaCertGetArgs Empty = new DatabaseInstanceServerCaCertGetArgs();

    @Import(name="cert")
      private final @Nullable Output<String> cert;

    public Output<String> getCert() {
        return this.cert == null ? Output.empty() : this.cert;
    }

    @Import(name="commonName")
      private final @Nullable Output<String> commonName;

    public Output<String> getCommonName() {
        return this.commonName == null ? Output.empty() : this.commonName;
    }

    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Output.empty() : this.createTime;
    }

    /**
     * The [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * formatted date time string indicating when this whitelist expires.
     * 
     */
    @Import(name="expirationTime")
      private final @Nullable Output<String> expirationTime;

    public Output<String> getExpirationTime() {
        return this.expirationTime == null ? Output.empty() : this.expirationTime;
    }

    @Import(name="sha1Fingerprint")
      private final @Nullable Output<String> sha1Fingerprint;

    public Output<String> getSha1Fingerprint() {
        return this.sha1Fingerprint == null ? Output.empty() : this.sha1Fingerprint;
    }

    public DatabaseInstanceServerCaCertGetArgs(
        @Nullable Output<String> cert,
        @Nullable Output<String> commonName,
        @Nullable Output<String> createTime,
        @Nullable Output<String> expirationTime,
        @Nullable Output<String> sha1Fingerprint) {
        this.cert = cert;
        this.commonName = commonName;
        this.createTime = createTime;
        this.expirationTime = expirationTime;
        this.sha1Fingerprint = sha1Fingerprint;
    }

    private DatabaseInstanceServerCaCertGetArgs() {
        this.cert = Output.empty();
        this.commonName = Output.empty();
        this.createTime = Output.empty();
        this.expirationTime = Output.empty();
        this.sha1Fingerprint = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceServerCaCertGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cert;
        private @Nullable Output<String> commonName;
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> expirationTime;
        private @Nullable Output<String> sha1Fingerprint;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceServerCaCertGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cert = defaults.cert;
    	      this.commonName = defaults.commonName;
    	      this.createTime = defaults.createTime;
    	      this.expirationTime = defaults.expirationTime;
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

        public Builder sha1Fingerprint(@Nullable Output<String> sha1Fingerprint) {
            this.sha1Fingerprint = sha1Fingerprint;
            return this;
        }

        public Builder sha1Fingerprint(@Nullable String sha1Fingerprint) {
            this.sha1Fingerprint = Output.ofNullable(sha1Fingerprint);
            return this;
        }
        public DatabaseInstanceServerCaCertGetArgs build() {
            return new DatabaseInstanceServerCaCertGetArgs(cert, commonName, createTime, expirationTime, sha1Fingerprint);
        }
    }
}
