// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceServerCaCert {
    private final String cert;
    private final String createTime;
    private final String expireTime;
    private final String serialNumber;
    private final String sha1Fingerprint;

    @CustomType.Constructor
    private GetInstanceServerCaCert(
        @CustomType.Parameter("cert") String cert,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("serialNumber") String serialNumber,
        @CustomType.Parameter("sha1Fingerprint") String sha1Fingerprint) {
        this.cert = cert;
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.serialNumber = serialNumber;
        this.sha1Fingerprint = sha1Fingerprint;
    }

    public String cert() {
        return this.cert;
    }
    public String createTime() {
        return this.createTime;
    }
    public String expireTime() {
        return this.expireTime;
    }
    public String serialNumber() {
        return this.serialNumber;
    }
    public String sha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceServerCaCert defaults) {
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

        public Builder(GetInstanceServerCaCert defaults) {
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
        }        public GetInstanceServerCaCert build() {
            return new GetInstanceServerCaCert(cert, createTime, expireTime, serialNumber, sha1Fingerprint);
        }
    }
}
