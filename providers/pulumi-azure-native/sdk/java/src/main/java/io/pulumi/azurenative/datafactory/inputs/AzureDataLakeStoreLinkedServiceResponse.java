// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Data Lake Store linked service.
 * 
 */
public final class AzureDataLakeStoreLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureDataLakeStoreLinkedServiceResponse Empty = new AzureDataLakeStoreLinkedServiceResponse();

    /**
     * Data Lake Store account name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="accountName")
      private final @Nullable Object accountName;

    public Optional<Object> getAccountName() {
        return this.accountName == null ? Optional.empty() : Optional.ofNullable(this.accountName);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureCloudType")
      private final @Nullable Object azureCloudType;

    public Optional<Object> getAzureCloudType() {
        return this.azureCloudType == null ? Optional.empty() : Optional.ofNullable(this.azureCloudType);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
      private final @Nullable CredentialReferenceResponse credential;

    public Optional<CredentialReferenceResponse> getCredential() {
        return this.credential == null ? Optional.empty() : Optional.ofNullable(this.credential);
    }

    /**
     * Data Lake Store service URI. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="dataLakeStoreUri", required=true)
      private final Object dataLakeStoreUri;

    public Object getDataLakeStoreUri() {
        return this.dataLakeStoreUri;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Object encryptedCredential;

    public Optional<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Data Lake Store account resource group name (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="resourceGroupName")
      private final @Nullable Object resourceGroupName;

    public Optional<Object> getResourceGroupName() {
        return this.resourceGroupName == null ? Optional.empty() : Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The ID of the application used to authenticate against the Azure Data Lake Store account. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
      private final @Nullable Object servicePrincipalId;

    public Optional<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The Key of the application used to authenticate against the Azure Data Lake Store account.
     * 
     */
    @Import(name="servicePrincipalKey")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getServicePrincipalKey() {
        return this.servicePrincipalKey == null ? null : this.servicePrincipalKey;
    }

    /**
     * Data Lake Store account subscription ID (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="subscriptionId")
      private final @Nullable Object subscriptionId;

    public Optional<Object> getSubscriptionId() {
        return this.subscriptionId == null ? Optional.empty() : Optional.ofNullable(this.subscriptionId);
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant")
      private final @Nullable Object tenant;

    public Optional<Object> getTenant() {
        return this.tenant == null ? Optional.empty() : Optional.ofNullable(this.tenant);
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureDataLakeStore'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public AzureDataLakeStoreLinkedServiceResponse(
        @Nullable Object accountName,
        @Nullable List<Object> annotations,
        @Nullable Object azureCloudType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable CredentialReferenceResponse credential,
        Object dataLakeStoreUri,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object resourceGroupName,
        @Nullable Object servicePrincipalId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @Nullable Object subscriptionId,
        @Nullable Object tenant,
        String type) {
        this.accountName = accountName;
        this.annotations = annotations;
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.credential = credential;
        this.dataLakeStoreUri = Objects.requireNonNull(dataLakeStoreUri, "expected parameter 'dataLakeStoreUri' to be non-null");
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.resourceGroupName = resourceGroupName;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.subscriptionId = subscriptionId;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureDataLakeStoreLinkedServiceResponse() {
        this.accountName = null;
        this.annotations = List.of();
        this.azureCloudType = null;
        this.connectVia = null;
        this.credential = null;
        this.dataLakeStoreUri = null;
        this.description = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.resourceGroupName = null;
        this.servicePrincipalId = null;
        this.servicePrincipalKey = null;
        this.subscriptionId = null;
        this.tenant = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeStoreLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object accountName;
        private @Nullable List<Object> annotations;
        private @Nullable Object azureCloudType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable CredentialReferenceResponse credential;
        private Object dataLakeStoreUri;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object resourceGroupName;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private @Nullable Object subscriptionId;
        private @Nullable Object tenant;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataLakeStoreLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.annotations = defaults.annotations;
    	      this.azureCloudType = defaults.azureCloudType;
    	      this.connectVia = defaults.connectVia;
    	      this.credential = defaults.credential;
    	      this.dataLakeStoreUri = defaults.dataLakeStoreUri;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder accountName(@Nullable Object accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder azureCloudType(@Nullable Object azureCloudType) {
            this.azureCloudType = azureCloudType;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder credential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
            return this;
        }

        public Builder dataLakeStoreUri(Object dataLakeStoreUri) {
            this.dataLakeStoreUri = Objects.requireNonNull(dataLakeStoreUri);
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder resourceGroupName(@Nullable Object resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder subscriptionId(@Nullable Object subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder tenant(@Nullable Object tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AzureDataLakeStoreLinkedServiceResponse build() {
            return new AzureDataLakeStoreLinkedServiceResponse(accountName, annotations, azureCloudType, connectVia, credential, dataLakeStoreUri, description, encryptedCredential, parameters, resourceGroupName, servicePrincipalId, servicePrincipalKey, subscriptionId, tenant, type);
        }
    }
}
