// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.RestServiceAuthenticationType;
import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
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
 * Rest Service linked service.
 * 
 */
public final class RestServiceLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestServiceLinkedServiceArgs Empty = new RestServiceLinkedServiceArgs();

    /**
     * The resource you are requesting authorization to use.
     * 
     */
    @InputImport(name="aadResourceId")
        private final @Nullable Input<Object> aadResourceId;

    public Input<Object> getAadResourceId() {
        return this.aadResourceId == null ? Input.empty() : this.aadResourceId;
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
     * The additional HTTP headers in the request to RESTful API used for authorization. Type: object (or Expression with resultType object).
     * 
     */
    @InputImport(name="authHeaders")
        private final @Nullable Input<Object> authHeaders;

    public Input<Object> getAuthHeaders() {
        return this.authHeaders == null ? Input.empty() : this.authHeaders;
    }

    /**
     * Type of authentication used to connect to the REST service.
     * 
     */
    @InputImport(name="authenticationType", required=true)
        private final Input<Either<String,RestServiceAuthenticationType>> authenticationType;

    public Input<Either<String,RestServiceAuthenticationType>> getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="azureCloudType")
        private final @Nullable Input<Object> azureCloudType;

    public Input<Object> getAzureCloudType() {
        return this.azureCloudType == null ? Input.empty() : this.azureCloudType;
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
     * The credential reference containing authentication information.
     * 
     */
    @InputImport(name="credential")
        private final @Nullable Input<CredentialReferenceArgs> credential;

    public Input<CredentialReferenceArgs> getCredential() {
        return this.credential == null ? Input.empty() : this.credential;
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
     * Whether to validate server side SSL certificate when connecting to the endpoint.The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="enableServerCertificateValidation")
        private final @Nullable Input<Object> enableServerCertificateValidation;

    public Input<Object> getEnableServerCertificateValidation() {
        return this.enableServerCertificateValidation == null ? Input.empty() : this.enableServerCertificateValidation;
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
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
        private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * The password used in Basic authentication type.
     * 
     */
    @InputImport(name="password")
        private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The application's client ID used in AadServicePrincipal authentication type.
     * 
     */
    @InputImport(name="servicePrincipalId")
        private final @Nullable Input<Object> servicePrincipalId;

    public Input<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Input.empty() : this.servicePrincipalId;
    }

    /**
     * The application's key used in AadServicePrincipal authentication type.
     * 
     */
    @InputImport(name="servicePrincipalKey")
        private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getServicePrincipalKey() {
        return this.servicePrincipalKey == null ? Input.empty() : this.servicePrincipalKey;
    }

    /**
     * The tenant information (domain name or tenant ID) used in AadServicePrincipal authentication type under which your application resides.
     * 
     */
    @InputImport(name="tenant")
        private final @Nullable Input<Object> tenant;

    public Input<Object> getTenant() {
        return this.tenant == null ? Input.empty() : this.tenant;
    }

    /**
     * Type of linked service.
     * Expected value is 'RestService'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The base URL of the REST service.
     * 
     */
    @InputImport(name="url", required=true)
        private final Input<Object> url;

    public Input<Object> getUrl() {
        return this.url;
    }

    /**
     * The user name used in Basic authentication type.
     * 
     */
    @InputImport(name="userName")
        private final @Nullable Input<Object> userName;

    public Input<Object> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public RestServiceLinkedServiceArgs(
        @Nullable Input<Object> aadResourceId,
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<Object> authHeaders,
        Input<Either<String,RestServiceAuthenticationType>> authenticationType,
        @Nullable Input<Object> azureCloudType,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<CredentialReferenceArgs> credential,
        @Nullable Input<String> description,
        @Nullable Input<Object> enableServerCertificateValidation,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Input<Object> servicePrincipalId,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey,
        @Nullable Input<Object> tenant,
        Input<String> type,
        Input<Object> url,
        @Nullable Input<Object> userName) {
        this.aadResourceId = aadResourceId;
        this.annotations = annotations;
        this.authHeaders = authHeaders;
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.credential = credential;
        this.description = description;
        this.enableServerCertificateValidation = enableServerCertificateValidation;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.userName = userName;
    }

    private RestServiceLinkedServiceArgs() {
        this.aadResourceId = Input.empty();
        this.annotations = Input.empty();
        this.authHeaders = Input.empty();
        this.authenticationType = Input.empty();
        this.azureCloudType = Input.empty();
        this.connectVia = Input.empty();
        this.credential = Input.empty();
        this.description = Input.empty();
        this.enableServerCertificateValidation = Input.empty();
        this.encryptedCredential = Input.empty();
        this.parameters = Input.empty();
        this.password = Input.empty();
        this.servicePrincipalId = Input.empty();
        this.servicePrincipalKey = Input.empty();
        this.tenant = Input.empty();
        this.type = Input.empty();
        this.url = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestServiceLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> aadResourceId;
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<Object> authHeaders;
        private Input<Either<String,RestServiceAuthenticationType>> authenticationType;
        private @Nullable Input<Object> azureCloudType;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<CredentialReferenceArgs> credential;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> enableServerCertificateValidation;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private @Nullable Input<Object> servicePrincipalId;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;
        private @Nullable Input<Object> tenant;
        private Input<String> type;
        private Input<Object> url;
        private @Nullable Input<Object> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(RestServiceLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadResourceId = defaults.aadResourceId;
    	      this.annotations = defaults.annotations;
    	      this.authHeaders = defaults.authHeaders;
    	      this.authenticationType = defaults.authenticationType;
    	      this.azureCloudType = defaults.azureCloudType;
    	      this.connectVia = defaults.connectVia;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.enableServerCertificateValidation = defaults.enableServerCertificateValidation;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.userName = defaults.userName;
        }

        public Builder setAadResourceId(@Nullable Input<Object> aadResourceId) {
            this.aadResourceId = aadResourceId;
            return this;
        }

        public Builder setAadResourceId(@Nullable Object aadResourceId) {
            this.aadResourceId = Input.ofNullable(aadResourceId);
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

        public Builder setAuthHeaders(@Nullable Input<Object> authHeaders) {
            this.authHeaders = authHeaders;
            return this;
        }

        public Builder setAuthHeaders(@Nullable Object authHeaders) {
            this.authHeaders = Input.ofNullable(authHeaders);
            return this;
        }

        public Builder setAuthenticationType(Input<Either<String,RestServiceAuthenticationType>> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setAuthenticationType(Either<String,RestServiceAuthenticationType> authenticationType) {
            this.authenticationType = Input.of(Objects.requireNonNull(authenticationType));
            return this;
        }

        public Builder setAzureCloudType(@Nullable Input<Object> azureCloudType) {
            this.azureCloudType = azureCloudType;
            return this;
        }

        public Builder setAzureCloudType(@Nullable Object azureCloudType) {
            this.azureCloudType = Input.ofNullable(azureCloudType);
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

        public Builder setCredential(@Nullable Input<CredentialReferenceArgs> credential) {
            this.credential = credential;
            return this;
        }

        public Builder setCredential(@Nullable CredentialReferenceArgs credential) {
            this.credential = Input.ofNullable(credential);
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

        public Builder setEnableServerCertificateValidation(@Nullable Input<Object> enableServerCertificateValidation) {
            this.enableServerCertificateValidation = enableServerCertificateValidation;
            return this;
        }

        public Builder setEnableServerCertificateValidation(@Nullable Object enableServerCertificateValidation) {
            this.enableServerCertificateValidation = Input.ofNullable(enableServerCertificateValidation);
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

        public Builder setParameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPassword(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setServicePrincipalId(@Nullable Input<Object> servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder setServicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = Input.ofNullable(servicePrincipalId);
            return this;
        }

        public Builder setServicePrincipalKey(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder setServicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            this.servicePrincipalKey = Input.ofNullable(servicePrincipalKey);
            return this;
        }

        public Builder setTenant(@Nullable Input<Object> tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder setTenant(@Nullable Object tenant) {
            this.tenant = Input.ofNullable(tenant);
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

        public Builder setUrl(Input<Object> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(Object url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }

        public Builder setUserName(@Nullable Input<Object> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable Object userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }
        public RestServiceLinkedServiceArgs build() {
            return new RestServiceLinkedServiceArgs(aadResourceId, annotations, authHeaders, authenticationType, azureCloudType, connectVia, credential, description, enableServerCertificateValidation, encryptedCredential, parameters, password, servicePrincipalId, servicePrincipalKey, tenant, type, url, userName);
        }
    }
}
