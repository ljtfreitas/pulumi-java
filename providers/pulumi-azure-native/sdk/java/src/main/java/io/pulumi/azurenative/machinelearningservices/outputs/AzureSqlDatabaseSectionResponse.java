// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureSqlDatabaseSectionResponse {
    /**
     * The authority URL used for authentication.
     * 
     */
    private final @Nullable String authorityUrl;
    /**
     * The content of the certificate used for authentication.
     * 
     */
    private final @Nullable String certificate;
    /**
     * The Client ID/Application ID
     * 
     */
    private final @Nullable String clientId;
    /**
     * The client secret.
     * 
     */
    private final @Nullable String clientSecret;
    /**
     * Sql Authentication type.
     * 
     */
    private final @Nullable String credentialType;
    /**
     * The Azure SQL database name.
     * 
     */
    private final @Nullable String databaseName;
    /**
     * The server host endpoint.
     * 
     */
    private final @Nullable String endpoint;
    /**
     *  Is it using certificate to authenticate. If false then use client secret.
     * 
     */
    private final @Nullable Boolean isCertAuth;
    /**
     * / The Azure SQL port number.
     * 
     */
    private final @Nullable String portNumber;
    /**
     * Resource Group.
     * 
     */
    private final @Nullable String resourceGroup;
    /**
     * The resource the service principal/app has access to.
     * 
     */
    private final @Nullable String resourceUri;
    /**
     * The Azure SQL server name.
     * 
     */
    private final @Nullable String serverName;
    /**
     * Indicates which identity to use to authenticate service data access to customer's storage.
     * 
     */
    private final @Nullable String serviceDataAccessAuthIdentity;
    /**
     * Subscription ID.
     * 
     */
    private final @Nullable String subscriptionId;
    /**
     * The ID of the tenant the service principal/app belongs to.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * The thumbprint of the certificate above.
     * 
     */
    private final @Nullable String thumbprint;
    /**
     * The Azure SQL user id.
     * 
     */
    private final @Nullable String userId;
    /**
     * The Azure SQL user password.
     * 
     */
    private final @Nullable String userPassword;

    @OutputCustomType.Constructor({"authorityUrl","certificate","clientId","clientSecret","credentialType","databaseName","endpoint","isCertAuth","portNumber","resourceGroup","resourceUri","serverName","serviceDataAccessAuthIdentity","subscriptionId","tenantId","thumbprint","userId","userPassword"})
    private AzureSqlDatabaseSectionResponse(
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

    /**
     * The authority URL used for authentication.
     * 
     */
    public Optional<String> getAuthorityUrl() {
        return Optional.ofNullable(this.authorityUrl);
    }
    /**
     * The content of the certificate used for authentication.
     * 
     */
    public Optional<String> getCertificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * The Client ID/Application ID
     * 
     */
    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The client secret.
     * 
     */
    public Optional<String> getClientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * Sql Authentication type.
     * 
     */
    public Optional<String> getCredentialType() {
        return Optional.ofNullable(this.credentialType);
    }
    /**
     * The Azure SQL database name.
     * 
     */
    public Optional<String> getDatabaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    /**
     * The server host endpoint.
     * 
     */
    public Optional<String> getEndpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     *  Is it using certificate to authenticate. If false then use client secret.
     * 
     */
    public Optional<Boolean> getIsCertAuth() {
        return Optional.ofNullable(this.isCertAuth);
    }
    /**
     * / The Azure SQL port number.
     * 
     */
    public Optional<String> getPortNumber() {
        return Optional.ofNullable(this.portNumber);
    }
    /**
     * Resource Group.
     * 
     */
    public Optional<String> getResourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * The resource the service principal/app has access to.
     * 
     */
    public Optional<String> getResourceUri() {
        return Optional.ofNullable(this.resourceUri);
    }
    /**
     * The Azure SQL server name.
     * 
     */
    public Optional<String> getServerName() {
        return Optional.ofNullable(this.serverName);
    }
    /**
     * Indicates which identity to use to authenticate service data access to customer's storage.
     * 
     */
    public Optional<String> getServiceDataAccessAuthIdentity() {
        return Optional.ofNullable(this.serviceDataAccessAuthIdentity);
    }
    /**
     * Subscription ID.
     * 
     */
    public Optional<String> getSubscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }
    /**
     * The ID of the tenant the service principal/app belongs to.
     * 
     */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * The thumbprint of the certificate above.
     * 
     */
    public Optional<String> getThumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }
    /**
     * The Azure SQL user id.
     * 
     */
    public Optional<String> getUserId() {
        return Optional.ofNullable(this.userId);
    }
    /**
     * The Azure SQL user password.
     * 
     */
    public Optional<String> getUserPassword() {
        return Optional.ofNullable(this.userPassword);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlDatabaseSectionResponse defaults) {
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

        public Builder(AzureSqlDatabaseSectionResponse defaults) {
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
        public AzureSqlDatabaseSectionResponse build() {
            return new AzureSqlDatabaseSectionResponse(authorityUrl, certificate, clientId, clientSecret, credentialType, databaseName, endpoint, isCertAuth, portNumber, resourceGroup, resourceUri, serverName, serviceDataAccessAuthIdentity, subscriptionId, tenantId, thumbprint, userId, userPassword);
        }
    }
}
