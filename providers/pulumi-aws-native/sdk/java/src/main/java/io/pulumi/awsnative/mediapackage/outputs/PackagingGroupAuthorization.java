// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PackagingGroupAuthorization {
    /**
     * The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for CDN authorization.
     * 
     */
    private final String cdnIdentifierSecret;
    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     * 
     */
    private final String secretsRoleArn;

    @CustomType.Constructor
    private PackagingGroupAuthorization(
        @CustomType.Parameter("cdnIdentifierSecret") String cdnIdentifierSecret,
        @CustomType.Parameter("secretsRoleArn") String secretsRoleArn) {
        this.cdnIdentifierSecret = cdnIdentifierSecret;
        this.secretsRoleArn = secretsRoleArn;
    }

    /**
     * The Amazon Resource Name (ARN) for the secret in AWS Secrets Manager that is used for CDN authorization.
     * 
    */
    public String getCdnIdentifierSecret() {
        return this.cdnIdentifierSecret;
    }
    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     * 
    */
    public String getSecretsRoleArn() {
        return this.secretsRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingGroupAuthorization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cdnIdentifierSecret;
        private String secretsRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingGroupAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdnIdentifierSecret = defaults.cdnIdentifierSecret;
    	      this.secretsRoleArn = defaults.secretsRoleArn;
        }

        public Builder cdnIdentifierSecret(String cdnIdentifierSecret) {
            this.cdnIdentifierSecret = Objects.requireNonNull(cdnIdentifierSecret);
            return this;
        }

        public Builder secretsRoleArn(String secretsRoleArn) {
            this.secretsRoleArn = Objects.requireNonNull(secretsRoleArn);
            return this;
        }
        public PackagingGroupAuthorization build() {
            return new PackagingGroupAuthorization(cdnIdentifierSecret, secretsRoleArn);
        }
    }
}
