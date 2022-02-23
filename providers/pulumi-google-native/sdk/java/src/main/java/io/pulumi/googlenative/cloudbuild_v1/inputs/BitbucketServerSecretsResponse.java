// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * BitbucketServerSecrets represents the secrets in Secret Manager for a Bitbucket Server.
 * 
 */
public final class BitbucketServerSecretsResponse extends io.pulumi.resources.InvokeArgs {

    public static final BitbucketServerSecretsResponse Empty = new BitbucketServerSecretsResponse();

    /**
     * The resource name for the admin access token's secret version.
     * 
     */
    @InputImport(name="adminAccessTokenVersionName", required=true)
      private final String adminAccessTokenVersionName;

    public String getAdminAccessTokenVersionName() {
        return this.adminAccessTokenVersionName;
    }

    /**
     * The resource name for the read access token's secret version.
     * 
     */
    @InputImport(name="readAccessTokenVersionName", required=true)
      private final String readAccessTokenVersionName;

    public String getReadAccessTokenVersionName() {
        return this.readAccessTokenVersionName;
    }

    /**
     * Immutable. The resource name for the webhook secret's secret version. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig.
     * 
     */
    @InputImport(name="webhookSecretVersionName", required=true)
      private final String webhookSecretVersionName;

    public String getWebhookSecretVersionName() {
        return this.webhookSecretVersionName;
    }

    public BitbucketServerSecretsResponse(
        String adminAccessTokenVersionName,
        String readAccessTokenVersionName,
        String webhookSecretVersionName) {
        this.adminAccessTokenVersionName = Objects.requireNonNull(adminAccessTokenVersionName, "expected parameter 'adminAccessTokenVersionName' to be non-null");
        this.readAccessTokenVersionName = Objects.requireNonNull(readAccessTokenVersionName, "expected parameter 'readAccessTokenVersionName' to be non-null");
        this.webhookSecretVersionName = Objects.requireNonNull(webhookSecretVersionName, "expected parameter 'webhookSecretVersionName' to be non-null");
    }

    private BitbucketServerSecretsResponse() {
        this.adminAccessTokenVersionName = null;
        this.readAccessTokenVersionName = null;
        this.webhookSecretVersionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BitbucketServerSecretsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adminAccessTokenVersionName;
        private String readAccessTokenVersionName;
        private String webhookSecretVersionName;

        public Builder() {
    	      // Empty
        }

        public Builder(BitbucketServerSecretsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminAccessTokenVersionName = defaults.adminAccessTokenVersionName;
    	      this.readAccessTokenVersionName = defaults.readAccessTokenVersionName;
    	      this.webhookSecretVersionName = defaults.webhookSecretVersionName;
        }

        public Builder setAdminAccessTokenVersionName(String adminAccessTokenVersionName) {
            this.adminAccessTokenVersionName = Objects.requireNonNull(adminAccessTokenVersionName);
            return this;
        }

        public Builder setReadAccessTokenVersionName(String readAccessTokenVersionName) {
            this.readAccessTokenVersionName = Objects.requireNonNull(readAccessTokenVersionName);
            return this;
        }

        public Builder setWebhookSecretVersionName(String webhookSecretVersionName) {
            this.webhookSecretVersionName = Objects.requireNonNull(webhookSecretVersionName);
            return this;
        }
        public BitbucketServerSecretsResponse build() {
            return new BitbucketServerSecretsResponse(adminAccessTokenVersionName, readAccessTokenVersionName, webhookSecretVersionName);
        }
    }
}
