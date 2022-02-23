// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientCredentialsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClientCredentialsResponse Empty = new ClientCredentialsResponse();

    /**
     * The authority URL used for authentication.
     * 
     */
    @InputImport(name="authorityUrl")
        private final @Nullable String authorityUrl;

    public Optional<String> getAuthorityUrl() {
        return this.authorityUrl == null ? Optional.empty() : Optional.ofNullable(this.authorityUrl);
    }

    /**
     * The content of the certificate used for authentication.
     * 
     */
    @InputImport(name="certificate")
        private final @Nullable String certificate;

    public Optional<String> getCertificate() {
        return this.certificate == null ? Optional.empty() : Optional.ofNullable(this.certificate);
    }

    /**
     * The Client ID/Application ID
     * 
     */
    @InputImport(name="clientId")
        private final @Nullable String clientId;

    public Optional<String> getClientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * The client secret.
     * 
     */
    @InputImport(name="clientSecret")
        private final @Nullable String clientSecret;

    public Optional<String> getClientSecret() {
        return this.clientSecret == null ? Optional.empty() : Optional.ofNullable(this.clientSecret);
    }

    /**
     *  Is it using certificate to authenticate. If false then use client secret.
     * 
     */
    @InputImport(name="isCertAuth")
        private final @Nullable Boolean isCertAuth;

    public Optional<Boolean> getIsCertAuth() {
        return this.isCertAuth == null ? Optional.empty() : Optional.ofNullable(this.isCertAuth);
    }

    /**
     * Resource Group.
     * 
     */
    @InputImport(name="resourceGroup")
        private final @Nullable String resourceGroup;

    public Optional<String> getResourceGroup() {
        return this.resourceGroup == null ? Optional.empty() : Optional.ofNullable(this.resourceGroup);
    }

    /**
     * The resource the service principal/app has access to.
     * 
     */
    @InputImport(name="resourceUri")
        private final @Nullable String resourceUri;

    public Optional<String> getResourceUri() {
        return this.resourceUri == null ? Optional.empty() : Optional.ofNullable(this.resourceUri);
    }

    /**
     * Indicates which identity to use to authenticate service data access to customer's storage.
     * 
     */
    @InputImport(name="serviceDataAccessAuthIdentity")
        private final @Nullable String serviceDataAccessAuthIdentity;

    public Optional<String> getServiceDataAccessAuthIdentity() {
        return this.serviceDataAccessAuthIdentity == null ? Optional.empty() : Optional.ofNullable(this.serviceDataAccessAuthIdentity);
    }

    /**
     * Subscription ID.
     * 
     */
    @InputImport(name="subscriptionId")
        private final @Nullable String subscriptionId;

    public Optional<String> getSubscriptionId() {
        return this.subscriptionId == null ? Optional.empty() : Optional.ofNullable(this.subscriptionId);
    }

    /**
     * The ID of the tenant the service principal/app belongs to.
     * 
     */
    @InputImport(name="tenantId")
        private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    /**
     * The thumbprint of the certificate above.
     * 
     */
    @InputImport(name="thumbprint")
        private final @Nullable String thumbprint;

    public Optional<String> getThumbprint() {
        return this.thumbprint == null ? Optional.empty() : Optional.ofNullable(this.thumbprint);
    }

    public ClientCredentialsResponse(
        @Nullable String authorityUrl,
        @Nullable String certificate,
        @Nullable String clientId,
        @Nullable String clientSecret,
        @Nullable Boolean isCertAuth,
        @Nullable String resourceGroup,
        @Nullable String resourceUri,
        @Nullable String serviceDataAccessAuthIdentity,
        @Nullable String subscriptionId,
        @Nullable String tenantId,
        @Nullable String thumbprint) {
        this.authorityUrl = authorityUrl;
        this.certificate = certificate;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.isCertAuth = isCertAuth;
        this.resourceGroup = resourceGroup;
        this.resourceUri = resourceUri;
        this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
        this.subscriptionId = subscriptionId;
        this.tenantId = tenantId;
        this.thumbprint = thumbprint;
    }

    private ClientCredentialsResponse() {
        this.authorityUrl = null;
        this.certificate = null;
        this.clientId = null;
        this.clientSecret = null;
        this.isCertAuth = null;
        this.resourceGroup = null;
        this.resourceUri = null;
        this.serviceDataAccessAuthIdentity = null;
        this.subscriptionId = null;
        this.tenantId = null;
        this.thumbprint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorityUrl;
        private @Nullable String certificate;
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable Boolean isCertAuth;
        private @Nullable String resourceGroup;
        private @Nullable String resourceUri;
        private @Nullable String serviceDataAccessAuthIdentity;
        private @Nullable String subscriptionId;
        private @Nullable String tenantId;
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorityUrl = defaults.authorityUrl;
    	      this.certificate = defaults.certificate;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.isCertAuth = defaults.isCertAuth;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceUri = defaults.resourceUri;
    	      this.serviceDataAccessAuthIdentity = defaults.serviceDataAccessAuthIdentity;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder setAuthorityUrl(@Nullable String authorityUrl) {
            this.authorityUrl = authorityUrl;
            return this;
        }

        public Builder setCertificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setIsCertAuth(@Nullable Boolean isCertAuth) {
            this.isCertAuth = isCertAuth;
            return this;
        }

        public Builder setResourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder setResourceUri(@Nullable String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        public Builder setServiceDataAccessAuthIdentity(@Nullable String serviceDataAccessAuthIdentity) {
            this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
            return this;
        }

        public Builder setSubscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setThumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public ClientCredentialsResponse build() {
            return new ClientCredentialsResponse(authorityUrl, certificate, clientId, clientSecret, isCertAuth, resourceGroup, resourceUri, serviceDataAccessAuthIdentity, subscriptionId, tenantId, thumbprint);
        }
    }
}
