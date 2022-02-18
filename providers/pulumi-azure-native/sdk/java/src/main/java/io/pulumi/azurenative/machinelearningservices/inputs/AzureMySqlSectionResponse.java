// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureMySqlSectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureMySqlSectionResponse Empty = new AzureMySqlSectionResponse();

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
     * Sql Authentication type.
     * 
     */
    @InputImport(name="credentialType")
    private final @Nullable String credentialType;

    public Optional<String> getCredentialType() {
        return this.credentialType == null ? Optional.empty() : Optional.ofNullable(this.credentialType);
    }

    /**
     * The Azure SQL database name.
     * 
     */
    @InputImport(name="databaseName")
    private final @Nullable String databaseName;

    public Optional<String> getDatabaseName() {
        return this.databaseName == null ? Optional.empty() : Optional.ofNullable(this.databaseName);
    }

    /**
     * The server host endpoint.
     * 
     */
    @InputImport(name="endpoint")
    private final @Nullable String endpoint;

    public Optional<String> getEndpoint() {
        return this.endpoint == null ? Optional.empty() : Optional.ofNullable(this.endpoint);
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
     * / The Azure SQL port number.
     * 
     */
    @InputImport(name="portNumber")
    private final @Nullable String portNumber;

    public Optional<String> getPortNumber() {
        return this.portNumber == null ? Optional.empty() : Optional.ofNullable(this.portNumber);
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
     * The Azure SQL server name.
     * 
     */
    @InputImport(name="serverName")
    private final @Nullable String serverName;

    public Optional<String> getServerName() {
        return this.serverName == null ? Optional.empty() : Optional.ofNullable(this.serverName);
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

    /**
     * The Azure SQL user id.
     * 
     */
    @InputImport(name="userId")
    private final @Nullable String userId;

    public Optional<String> getUserId() {
        return this.userId == null ? Optional.empty() : Optional.ofNullable(this.userId);
    }

    /**
     * The Azure SQL user password.
     * 
     */
    @InputImport(name="userPassword")
    private final @Nullable String userPassword;

    public Optional<String> getUserPassword() {
        return this.userPassword == null ? Optional.empty() : Optional.ofNullable(this.userPassword);
    }

    public AzureMySqlSectionResponse(
        @Nullable String authorityUrl,
        @Nullable String certificate,
        @Nullable String clientId,
        @Nullable String clientSecret,
        @Nullable String credentialType,
        @Nullable String databaseName,
        @Nullable String endpoint,
        @Nullable Boolean isCertAuth,
        @Nullable String portNumber,
        @Nullable String resourceGroup,
        @Nullable String resourceUri,
        @Nullable String serverName,
        @Nullable String serviceDataAccessAuthIdentity,
        @Nullable String subscriptionId,
        @Nullable String tenantId,
        @Nullable String thumbprint,
        @Nullable String userId,
        @Nullable String userPassword) {
        this.authorityUrl = authorityUrl;
        this.certificate = certificate;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.credentialType = credentialType;
        this.databaseName = databaseName;
        this.endpoint = endpoint;
        this.isCertAuth = isCertAuth;
        this.portNumber = portNumber;
        this.resourceGroup = resourceGroup;
        this.resourceUri = resourceUri;
        this.serverName = serverName;
        this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
        this.subscriptionId = subscriptionId;
        this.tenantId = tenantId;
        this.thumbprint = thumbprint;
        this.userId = userId;
        this.userPassword = userPassword;
    }

    private AzureMySqlSectionResponse() {
        this.authorityUrl = null;
        this.certificate = null;
        this.clientId = null;
        this.clientSecret = null;
        this.credentialType = null;
        this.databaseName = null;
        this.endpoint = null;
        this.isCertAuth = null;
        this.portNumber = null;
        this.resourceGroup = null;
        this.resourceUri = null;
        this.serverName = null;
        this.serviceDataAccessAuthIdentity = null;
        this.subscriptionId = null;
        this.tenantId = null;
        this.thumbprint = null;
        this.userId = null;
        this.userPassword = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMySqlSectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorityUrl;
        private @Nullable String certificate;
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable String credentialType;
        private @Nullable String databaseName;
        private @Nullable String endpoint;
        private @Nullable Boolean isCertAuth;
        private @Nullable String portNumber;
        private @Nullable String resourceGroup;
        private @Nullable String resourceUri;
        private @Nullable String serverName;
        private @Nullable String serviceDataAccessAuthIdentity;
        private @Nullable String subscriptionId;
        private @Nullable String tenantId;
        private @Nullable String thumbprint;
        private @Nullable String userId;
        private @Nullable String userPassword;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMySqlSectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorityUrl = defaults.authorityUrl;
    	      this.certificate = defaults.certificate;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.credentialType = defaults.credentialType;
    	      this.databaseName = defaults.databaseName;
    	      this.endpoint = defaults.endpoint;
    	      this.isCertAuth = defaults.isCertAuth;
    	      this.portNumber = defaults.portNumber;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceUri = defaults.resourceUri;
    	      this.serverName = defaults.serverName;
    	      this.serviceDataAccessAuthIdentity = defaults.serviceDataAccessAuthIdentity;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
    	      this.thumbprint = defaults.thumbprint;
    	      this.userId = defaults.userId;
    	      this.userPassword = defaults.userPassword;
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

        public Builder setCredentialType(@Nullable String credentialType) {
            this.credentialType = credentialType;
            return this;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setIsCertAuth(@Nullable Boolean isCertAuth) {
            this.isCertAuth = isCertAuth;
            return this;
        }

        public Builder setPortNumber(@Nullable String portNumber) {
            this.portNumber = portNumber;
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

        public Builder setServerName(@Nullable String serverName) {
            this.serverName = serverName;
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

        public Builder setUserId(@Nullable String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setUserPassword(@Nullable String userPassword) {
            this.userPassword = userPassword;
            return this;
        }

        public AzureMySqlSectionResponse build() {
            return new AzureMySqlSectionResponse(authorityUrl, certificate, clientId, clientSecret, credentialType, databaseName, endpoint, isCertAuth, portNumber, resourceGroup, resourceUri, serverName, serviceDataAccessAuthIdentity, subscriptionId, tenantId, thumbprint, userId, userPassword);
        }
    }
}
