// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AwsClusterControlPlaneProxyConfig {
    /**
     * The ARN of the AWS Secret Manager secret that contains the HTTP(S) proxy configuration.
     * 
     */
    private final String secretArn;
    /**
     * The version string of the AWS Secret Manager secret that contains the HTTP(S) proxy configuration.
     * 
     */
    private final String secretVersion;

    @CustomType.Constructor
    private AwsClusterControlPlaneProxyConfig(
        @CustomType.Parameter("secretArn") String secretArn,
        @CustomType.Parameter("secretVersion") String secretVersion) {
        this.secretArn = secretArn;
        this.secretVersion = secretVersion;
    }

    /**
     * The ARN of the AWS Secret Manager secret that contains the HTTP(S) proxy configuration.
     * 
    */
    public String getSecretArn() {
        return this.secretArn;
    }
    /**
     * The version string of the AWS Secret Manager secret that contains the HTTP(S) proxy configuration.
     * 
    */
    public String getSecretVersion() {
        return this.secretVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlaneProxyConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String secretArn;
        private String secretVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterControlPlaneProxyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretArn = defaults.secretArn;
    	      this.secretVersion = defaults.secretVersion;
        }

        public Builder secretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }

        public Builder secretVersion(String secretVersion) {
            this.secretVersion = Objects.requireNonNull(secretVersion);
            return this;
        }
        public AwsClusterControlPlaneProxyConfig build() {
            return new AwsClusterControlPlaneProxyConfig(secretArn, secretVersion);
        }
    }
}
