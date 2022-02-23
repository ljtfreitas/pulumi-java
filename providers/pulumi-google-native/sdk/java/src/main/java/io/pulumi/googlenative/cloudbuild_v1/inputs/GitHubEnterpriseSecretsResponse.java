// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * GitHubEnterpriseSecrets represents the names of all necessary secrets in Secret Manager for a GitHub Enterprise server. Format is: projects//secrets/.
 * 
 */
public final class GitHubEnterpriseSecretsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GitHubEnterpriseSecretsResponse Empty = new GitHubEnterpriseSecretsResponse();

    /**
     * The resource name for the OAuth client ID secret in Secret Manager.
     * 
     */
    @InputImport(name="oauthClientIdName", required=true)
      private final String oauthClientIdName;

    public String getOauthClientIdName() {
        return this.oauthClientIdName;
    }

    /**
     * The resource name for the OAuth client ID secret version in Secret Manager.
     * 
     */
    @InputImport(name="oauthClientIdVersionName", required=true)
      private final String oauthClientIdVersionName;

    public String getOauthClientIdVersionName() {
        return this.oauthClientIdVersionName;
    }

    /**
     * The resource name for the OAuth secret in Secret Manager.
     * 
     */
    @InputImport(name="oauthSecretName", required=true)
      private final String oauthSecretName;

    public String getOauthSecretName() {
        return this.oauthSecretName;
    }

    /**
     * The resource name for the OAuth secret secret version in Secret Manager.
     * 
     */
    @InputImport(name="oauthSecretVersionName", required=true)
      private final String oauthSecretVersionName;

    public String getOauthSecretVersionName() {
        return this.oauthSecretVersionName;
    }

    /**
     * The resource name for the private key secret.
     * 
     */
    @InputImport(name="privateKeyName", required=true)
      private final String privateKeyName;

    public String getPrivateKeyName() {
        return this.privateKeyName;
    }

    /**
     * The resource name for the private key secret version.
     * 
     */
    @InputImport(name="privateKeyVersionName", required=true)
      private final String privateKeyVersionName;

    public String getPrivateKeyVersionName() {
        return this.privateKeyVersionName;
    }

    /**
     * The resource name for the webhook secret in Secret Manager.
     * 
     */
    @InputImport(name="webhookSecretName", required=true)
      private final String webhookSecretName;

    public String getWebhookSecretName() {
        return this.webhookSecretName;
    }

    /**
     * The resource name for the webhook secret secret version in Secret Manager.
     * 
     */
    @InputImport(name="webhookSecretVersionName", required=true)
      private final String webhookSecretVersionName;

    public String getWebhookSecretVersionName() {
        return this.webhookSecretVersionName;
    }

    public GitHubEnterpriseSecretsResponse(
        String oauthClientIdName,
        String oauthClientIdVersionName,
        String oauthSecretName,
        String oauthSecretVersionName,
        String privateKeyName,
        String privateKeyVersionName,
        String webhookSecretName,
        String webhookSecretVersionName) {
        this.oauthClientIdName = Objects.requireNonNull(oauthClientIdName, "expected parameter 'oauthClientIdName' to be non-null");
        this.oauthClientIdVersionName = Objects.requireNonNull(oauthClientIdVersionName, "expected parameter 'oauthClientIdVersionName' to be non-null");
        this.oauthSecretName = Objects.requireNonNull(oauthSecretName, "expected parameter 'oauthSecretName' to be non-null");
        this.oauthSecretVersionName = Objects.requireNonNull(oauthSecretVersionName, "expected parameter 'oauthSecretVersionName' to be non-null");
        this.privateKeyName = Objects.requireNonNull(privateKeyName, "expected parameter 'privateKeyName' to be non-null");
        this.privateKeyVersionName = Objects.requireNonNull(privateKeyVersionName, "expected parameter 'privateKeyVersionName' to be non-null");
        this.webhookSecretName = Objects.requireNonNull(webhookSecretName, "expected parameter 'webhookSecretName' to be non-null");
        this.webhookSecretVersionName = Objects.requireNonNull(webhookSecretVersionName, "expected parameter 'webhookSecretVersionName' to be non-null");
    }

    private GitHubEnterpriseSecretsResponse() {
        this.oauthClientIdName = null;
        this.oauthClientIdVersionName = null;
        this.oauthSecretName = null;
        this.oauthSecretVersionName = null;
        this.privateKeyName = null;
        this.privateKeyVersionName = null;
        this.webhookSecretName = null;
        this.webhookSecretVersionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubEnterpriseSecretsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String oauthClientIdName;
        private String oauthClientIdVersionName;
        private String oauthSecretName;
        private String oauthSecretVersionName;
        private String privateKeyName;
        private String privateKeyVersionName;
        private String webhookSecretName;
        private String webhookSecretVersionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GitHubEnterpriseSecretsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oauthClientIdName = defaults.oauthClientIdName;
    	      this.oauthClientIdVersionName = defaults.oauthClientIdVersionName;
    	      this.oauthSecretName = defaults.oauthSecretName;
    	      this.oauthSecretVersionName = defaults.oauthSecretVersionName;
    	      this.privateKeyName = defaults.privateKeyName;
    	      this.privateKeyVersionName = defaults.privateKeyVersionName;
    	      this.webhookSecretName = defaults.webhookSecretName;
    	      this.webhookSecretVersionName = defaults.webhookSecretVersionName;
        }

        public Builder setOauthClientIdName(String oauthClientIdName) {
            this.oauthClientIdName = Objects.requireNonNull(oauthClientIdName);
            return this;
        }

        public Builder setOauthClientIdVersionName(String oauthClientIdVersionName) {
            this.oauthClientIdVersionName = Objects.requireNonNull(oauthClientIdVersionName);
            return this;
        }

        public Builder setOauthSecretName(String oauthSecretName) {
            this.oauthSecretName = Objects.requireNonNull(oauthSecretName);
            return this;
        }

        public Builder setOauthSecretVersionName(String oauthSecretVersionName) {
            this.oauthSecretVersionName = Objects.requireNonNull(oauthSecretVersionName);
            return this;
        }

        public Builder setPrivateKeyName(String privateKeyName) {
            this.privateKeyName = Objects.requireNonNull(privateKeyName);
            return this;
        }

        public Builder setPrivateKeyVersionName(String privateKeyVersionName) {
            this.privateKeyVersionName = Objects.requireNonNull(privateKeyVersionName);
            return this;
        }

        public Builder setWebhookSecretName(String webhookSecretName) {
            this.webhookSecretName = Objects.requireNonNull(webhookSecretName);
            return this;
        }

        public Builder setWebhookSecretVersionName(String webhookSecretVersionName) {
            this.webhookSecretVersionName = Objects.requireNonNull(webhookSecretVersionName);
            return this;
        }
        public GitHubEnterpriseSecretsResponse build() {
            return new GitHubEnterpriseSecretsResponse(oauthClientIdName, oauthClientIdVersionName, oauthSecretName, oauthSecretVersionName, privateKeyName, privateKeyVersionName, webhookSecretName, webhookSecretVersionName);
        }
    }
}
