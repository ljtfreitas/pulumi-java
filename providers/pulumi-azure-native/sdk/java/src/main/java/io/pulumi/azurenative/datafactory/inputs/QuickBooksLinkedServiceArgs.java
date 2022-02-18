// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * QuickBooks server linked service.
 * 
 */
public final class QuickBooksLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuickBooksLinkedServiceArgs Empty = new QuickBooksLinkedServiceArgs();

    /**
     * The access token for OAuth 1.0 authentication.
     * 
     */
    @InputImport(name="accessToken")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getAccessToken() {
        return this.accessToken == null ? Input.empty() : this.accessToken;
    }

    /**
     * The access token secret for OAuth 1.0 authentication.
     * 
     */
    @InputImport(name="accessTokenSecret")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessTokenSecret;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getAccessTokenSecret() {
        return this.accessTokenSecret == null ? Input.empty() : this.accessTokenSecret;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * The company ID of the QuickBooks company to authorize.
     * 
     */
    @InputImport(name="companyId")
    private final @Nullable Input<Object> companyId;

    public Input<Object> getCompanyId() {
        return this.companyId == null ? Input.empty() : this.companyId;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
    private final @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;

    public Input<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Input.empty() : this.connectVia;
    }

    /**
     * Properties used to connect to QuickBooks. It is mutually exclusive with any other properties in the linked service. Type: object.
     * 
     */
    @InputImport(name="connectionProperties")
    private final @Nullable Input<Object> connectionProperties;

    public Input<Object> getConnectionProperties() {
        return this.connectionProperties == null ? Input.empty() : this.connectionProperties;
    }

    /**
     * The consumer key for OAuth 1.0 authentication.
     * 
     */
    @InputImport(name="consumerKey")
    private final @Nullable Input<Object> consumerKey;

    public Input<Object> getConsumerKey() {
        return this.consumerKey == null ? Input.empty() : this.consumerKey;
    }

    /**
     * The consumer secret for OAuth 1.0 authentication.
     * 
     */
    @InputImport(name="consumerSecret")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> consumerSecret;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getConsumerSecret() {
        return this.consumerSecret == null ? Input.empty() : this.consumerSecret;
    }

    /**
     * Linked service description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
    private final @Nullable Input<Object> encryptedCredential;

    public Input<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Input.empty() : this.encryptedCredential;
    }

    /**
     * The endpoint of the QuickBooks server. (i.e. quickbooks.api.intuit.com)
     * 
     */
    @InputImport(name="endpoint")
    private final @Nullable Input<Object> endpoint;

    public Input<Object> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Type of linked service.
     * Expected value is 'QuickBooks'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    @InputImport(name="useEncryptedEndpoints")
    private final @Nullable Input<Object> useEncryptedEndpoints;

    public Input<Object> getUseEncryptedEndpoints() {
        return this.useEncryptedEndpoints == null ? Input.empty() : this.useEncryptedEndpoints;
    }

    public QuickBooksLinkedServiceArgs(
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessTokenSecret,
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<Object> companyId,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<Object> connectionProperties,
        @Nullable Input<Object> consumerKey,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> consumerSecret,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Object> endpoint,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        Input<String> type,
        @Nullable Input<Object> useEncryptedEndpoints) {
        this.accessToken = accessToken;
        this.accessTokenSecret = accessTokenSecret;
        this.annotations = annotations;
        this.companyId = companyId;
        this.connectVia = connectVia;
        this.connectionProperties = connectionProperties;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.endpoint = endpoint;
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useEncryptedEndpoints = useEncryptedEndpoints;
    }

    private QuickBooksLinkedServiceArgs() {
        this.accessToken = Input.empty();
        this.accessTokenSecret = Input.empty();
        this.annotations = Input.empty();
        this.companyId = Input.empty();
        this.connectVia = Input.empty();
        this.connectionProperties = Input.empty();
        this.consumerKey = Input.empty();
        this.consumerSecret = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.endpoint = Input.empty();
        this.parameters = Input.empty();
        this.type = Input.empty();
        this.useEncryptedEndpoints = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickBooksLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessTokenSecret;
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<Object> companyId;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<Object> connectionProperties;
        private @Nullable Input<Object> consumerKey;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> consumerSecret;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Object> endpoint;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private Input<String> type;
        private @Nullable Input<Object> useEncryptedEndpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickBooksLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.accessTokenSecret = defaults.accessTokenSecret;
    	      this.annotations = defaults.annotations;
    	      this.companyId = defaults.companyId;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.consumerKey = defaults.consumerKey;
    	      this.consumerSecret = defaults.consumerSecret;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.endpoint = defaults.endpoint;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
        }

        public Builder setAccessToken(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setAccessToken(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> accessToken) {
            this.accessToken = Input.ofNullable(accessToken);
            return this;
        }

        public Builder setAccessTokenSecret(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessTokenSecret) {
            this.accessTokenSecret = accessTokenSecret;
            return this;
        }

        public Builder setAccessTokenSecret(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> accessTokenSecret) {
            this.accessTokenSecret = Input.ofNullable(accessTokenSecret);
            return this;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setCompanyId(@Nullable Input<Object> companyId) {
            this.companyId = companyId;
            return this;
        }

        public Builder setCompanyId(@Nullable Object companyId) {
            this.companyId = Input.ofNullable(companyId);
            return this;
        }

        public Builder setConnectVia(@Nullable Input<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Input.ofNullable(connectVia);
            return this;
        }

        public Builder setConnectionProperties(@Nullable Input<Object> connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }

        public Builder setConnectionProperties(@Nullable Object connectionProperties) {
            this.connectionProperties = Input.ofNullable(connectionProperties);
            return this;
        }

        public Builder setConsumerKey(@Nullable Input<Object> consumerKey) {
            this.consumerKey = consumerKey;
            return this;
        }

        public Builder setConsumerKey(@Nullable Object consumerKey) {
            this.consumerKey = Input.ofNullable(consumerKey);
            return this;
        }

        public Builder setConsumerSecret(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> consumerSecret) {
            this.consumerSecret = consumerSecret;
            return this;
        }

        public Builder setConsumerSecret(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> consumerSecret) {
            this.consumerSecret = Input.ofNullable(consumerSecret);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Input<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Input.ofNullable(encryptedCredential);
            return this;
        }

        public Builder setEndpoint(@Nullable Input<Object> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable Object endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUseEncryptedEndpoints(@Nullable Input<Object> useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        public Builder setUseEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = Input.ofNullable(useEncryptedEndpoints);
            return this;
        }

        public QuickBooksLinkedServiceArgs build() {
            return new QuickBooksLinkedServiceArgs(accessToken, accessTokenSecret, annotations, companyId, connectVia, connectionProperties, consumerKey, consumerSecret, description, encryptedCredential, endpoint, parameters, type, useEncryptedEndpoints);
        }
    }
}
