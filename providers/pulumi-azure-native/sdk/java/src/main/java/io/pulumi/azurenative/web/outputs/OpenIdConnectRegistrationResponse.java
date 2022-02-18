// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.OpenIdConnectClientCredentialResponse;
import io.pulumi.azurenative.web.outputs.OpenIdConnectConfigResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OpenIdConnectRegistrationResponse {
    /**
     * The authentication credentials of the custom Open ID Connect provider.
     * 
     */
    private final @Nullable OpenIdConnectClientCredentialResponse clientCredential;
    /**
     * The client id of the custom Open ID Connect provider.
     * 
     */
    private final @Nullable String clientId;
    /**
     * The configuration settings of the endpoints used for the custom Open ID Connect provider.
     * 
     */
    private final @Nullable OpenIdConnectConfigResponse openIdConnectConfiguration;

    @OutputCustomType.Constructor({"clientCredential","clientId","openIdConnectConfiguration"})
    private OpenIdConnectRegistrationResponse(
        @Nullable OpenIdConnectClientCredentialResponse clientCredential,
        @Nullable String clientId,
        @Nullable OpenIdConnectConfigResponse openIdConnectConfiguration) {
        this.clientCredential = clientCredential;
        this.clientId = clientId;
        this.openIdConnectConfiguration = openIdConnectConfiguration;
    }

    /**
     * The authentication credentials of the custom Open ID Connect provider.
     * 
     */
    public Optional<OpenIdConnectClientCredentialResponse> getClientCredential() {
        return Optional.ofNullable(this.clientCredential);
    }
    /**
     * The client id of the custom Open ID Connect provider.
     * 
     */
    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The configuration settings of the endpoints used for the custom Open ID Connect provider.
     * 
     */
    public Optional<OpenIdConnectConfigResponse> getOpenIdConnectConfiguration() {
        return Optional.ofNullable(this.openIdConnectConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenIdConnectRegistrationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OpenIdConnectClientCredentialResponse clientCredential;
        private @Nullable String clientId;
        private @Nullable OpenIdConnectConfigResponse openIdConnectConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenIdConnectRegistrationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCredential = defaults.clientCredential;
    	      this.clientId = defaults.clientId;
    	      this.openIdConnectConfiguration = defaults.openIdConnectConfiguration;
        }

        public Builder setClientCredential(@Nullable OpenIdConnectClientCredentialResponse clientCredential) {
            this.clientCredential = clientCredential;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setOpenIdConnectConfiguration(@Nullable OpenIdConnectConfigResponse openIdConnectConfiguration) {
            this.openIdConnectConfiguration = openIdConnectConfiguration;
            return this;
        }

        public OpenIdConnectRegistrationResponse build() {
            return new OpenIdConnectRegistrationResponse(clientCredential, clientId, openIdConnectConfiguration);
        }
    }
}
