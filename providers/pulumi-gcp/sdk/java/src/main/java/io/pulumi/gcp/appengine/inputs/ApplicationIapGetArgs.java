// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationIapGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationIapGetArgs Empty = new ApplicationIapGetArgs();

    /**
     * (Optional) Whether the serving infrastructure will authenticate and authorize all incoming requests.
     * (default is false)
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * OAuth2 client ID to use for the authentication flow.
     * 
     */
    @Import(name="oauth2ClientId", required=true)
      private final Output<String> oauth2ClientId;

    public Output<String> oauth2ClientId() {
        return this.oauth2ClientId;
    }

    /**
     * OAuth2 client secret to use for the authentication flow.
     * The SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field.
     * 
     */
    @Import(name="oauth2ClientSecret", required=true)
      private final Output<String> oauth2ClientSecret;

    public Output<String> oauth2ClientSecret() {
        return this.oauth2ClientSecret;
    }

    /**
     * Hex-encoded SHA-256 hash of the client secret.
     * 
     */
    @Import(name="oauth2ClientSecretSha256")
      private final @Nullable Output<String> oauth2ClientSecretSha256;

    public Output<String> oauth2ClientSecretSha256() {
        return this.oauth2ClientSecretSha256 == null ? Codegen.empty() : this.oauth2ClientSecretSha256;
    }

    public ApplicationIapGetArgs(
        @Nullable Output<Boolean> enabled,
        Output<String> oauth2ClientId,
        Output<String> oauth2ClientSecret,
        @Nullable Output<String> oauth2ClientSecretSha256) {
        this.enabled = enabled;
        this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId, "expected parameter 'oauth2ClientId' to be non-null");
        this.oauth2ClientSecret = Objects.requireNonNull(oauth2ClientSecret, "expected parameter 'oauth2ClientSecret' to be non-null");
        this.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
    }

    private ApplicationIapGetArgs() {
        this.enabled = Codegen.empty();
        this.oauth2ClientId = Codegen.empty();
        this.oauth2ClientSecret = Codegen.empty();
        this.oauth2ClientSecretSha256 = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationIapGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private Output<String> oauth2ClientId;
        private Output<String> oauth2ClientSecret;
        private @Nullable Output<String> oauth2ClientSecretSha256;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationIapGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.oauth2ClientId = defaults.oauth2ClientId;
    	      this.oauth2ClientSecret = defaults.oauth2ClientSecret;
    	      this.oauth2ClientSecretSha256 = defaults.oauth2ClientSecretSha256;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder oauth2ClientId(Output<String> oauth2ClientId) {
            this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId);
            return this;
        }
        public Builder oauth2ClientId(String oauth2ClientId) {
            this.oauth2ClientId = Output.of(Objects.requireNonNull(oauth2ClientId));
            return this;
        }
        public Builder oauth2ClientSecret(Output<String> oauth2ClientSecret) {
            this.oauth2ClientSecret = Objects.requireNonNull(oauth2ClientSecret);
            return this;
        }
        public Builder oauth2ClientSecret(String oauth2ClientSecret) {
            this.oauth2ClientSecret = Output.of(Objects.requireNonNull(oauth2ClientSecret));
            return this;
        }
        public Builder oauth2ClientSecretSha256(@Nullable Output<String> oauth2ClientSecretSha256) {
            this.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
            return this;
        }
        public Builder oauth2ClientSecretSha256(@Nullable String oauth2ClientSecretSha256) {
            this.oauth2ClientSecretSha256 = Codegen.ofNullable(oauth2ClientSecretSha256);
            return this;
        }        public ApplicationIapGetArgs build() {
            return new ApplicationIapGetArgs(enabled, oauth2ClientId, oauth2ClientSecret, oauth2ClientSecretSha256);
        }
    }
}
