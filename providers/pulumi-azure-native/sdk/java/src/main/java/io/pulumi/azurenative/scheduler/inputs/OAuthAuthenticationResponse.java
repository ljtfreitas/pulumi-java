// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OAuthAuthenticationResponse extends io.pulumi.resources.InvokeArgs {

    public static final OAuthAuthenticationResponse Empty = new OAuthAuthenticationResponse();

    /**
     * Gets or sets the audience.
     * 
     */
    @InputImport(name="audience")
        private final @Nullable String audience;

    public Optional<String> getAudience() {
        return this.audience == null ? Optional.empty() : Optional.ofNullable(this.audience);
    }

    /**
     * Gets or sets the client identifier.
     * 
     */
    @InputImport(name="clientId")
        private final @Nullable String clientId;

    public Optional<String> getClientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * Gets or sets the secret, return value will always be empty.
     * 
     */
    @InputImport(name="secret")
        private final @Nullable String secret;

    public Optional<String> getSecret() {
        return this.secret == null ? Optional.empty() : Optional.ofNullable(this.secret);
    }

    /**
     * Gets or sets the tenant.
     * 
     */
    @InputImport(name="tenant")
        private final @Nullable String tenant;

    public Optional<String> getTenant() {
        return this.tenant == null ? Optional.empty() : Optional.ofNullable(this.tenant);
    }

    /**
     * Gets or sets the HTTP authentication type.
     * Expected value is 'ActiveDirectoryOAuth'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public OAuthAuthenticationResponse(
        @Nullable String audience,
        @Nullable String clientId,
        @Nullable String secret,
        @Nullable String tenant,
        String type) {
        this.audience = audience;
        this.clientId = clientId;
        this.secret = secret;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private OAuthAuthenticationResponse() {
        this.audience = null;
        this.clientId = null;
        this.secret = null;
        this.tenant = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OAuthAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String audience;
        private @Nullable String clientId;
        private @Nullable String secret;
        private @Nullable String tenant;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OAuthAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.clientId = defaults.clientId;
    	      this.secret = defaults.secret;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder setAudience(@Nullable String audience) {
            this.audience = audience;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setSecret(@Nullable String secret) {
            this.secret = secret;
            return this;
        }

        public Builder setTenant(@Nullable String tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public OAuthAuthenticationResponse build() {
            return new OAuthAuthenticationResponse(audience, clientId, secret, tenant, type);
        }
    }
}
