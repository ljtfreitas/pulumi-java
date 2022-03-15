// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure SQL Data Warehouse linked service.
 * 
 */
public final class AzureSqlDWLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureSqlDWLinkedServiceArgs Empty = new AzureSqlDWLinkedServiceArgs();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="azureCloudType")
      private final @Nullable Output<Object> azureCloudType;

    public Output<Object> getAzureCloudType() {
        return this.azureCloudType == null ? Output.empty() : this.azureCloudType;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Output.empty() : this.connectVia;
    }

    /**
     * The connection string. Type: string, SecureString or AzureKeyVaultSecretReference. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="connectionString", required=true)
      private final Output<Object> connectionString;

    public Output<Object> getConnectionString() {
        return this.connectionString;
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
      private final @Nullable Output<CredentialReferenceArgs> credential;

    public Output<CredentialReferenceArgs> getCredential() {
        return this.credential == null ? Output.empty() : this.credential;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Output<Object> encryptedCredential;

    public Output<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Output.empty() : this.encryptedCredential;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * The Azure key vault secret reference of password in connection string.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<AzureKeyVaultSecretReferenceArgs> password;

    public Output<AzureKeyVaultSecretReferenceArgs> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * The ID of the service principal used to authenticate against Azure SQL Data Warehouse. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
      private final @Nullable Output<Object> servicePrincipalId;

    public Output<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Output.empty() : this.servicePrincipalId;
    }

    /**
     * The key of the service principal used to authenticate against Azure SQL Data Warehouse.
     * 
     */
    @Import(name="servicePrincipalKey")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getServicePrincipalKey() {
        return this.servicePrincipalKey == null ? Output.empty() : this.servicePrincipalKey;
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant")
      private final @Nullable Output<Object> tenant;

    public Output<Object> getTenant() {
        return this.tenant == null ? Output.empty() : this.tenant;
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureSqlDW'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public AzureSqlDWLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Object> azureCloudType,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        Output<Object> connectionString,
        @Nullable Output<CredentialReferenceArgs> credential,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<AzureKeyVaultSecretReferenceArgs> password,
        @Nullable Output<Object> servicePrincipalId,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey,
        @Nullable Output<Object> tenant,
        Output<String> type) {
        this.annotations = annotations;
        this.azureCloudType = azureCloudType;
        this.connectVia = connectVia;
        this.connectionString = Objects.requireNonNull(connectionString, "expected parameter 'connectionString' to be non-null");
        this.credential = credential;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureSqlDWLinkedServiceArgs() {
        this.annotations = Output.empty();
        this.azureCloudType = Output.empty();
        this.connectVia = Output.empty();
        this.connectionString = Output.empty();
        this.credential = Output.empty();
        this.description = Output.empty();
        this.encryptedCredential = Output.empty();
        this.parameters = Output.empty();
        this.password = Output.empty();
        this.servicePrincipalId = Output.empty();
        this.servicePrincipalKey = Output.empty();
        this.tenant = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlDWLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Object> azureCloudType;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private Output<Object> connectionString;
        private @Nullable Output<CredentialReferenceArgs> credential;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<AzureKeyVaultSecretReferenceArgs> password;
        private @Nullable Output<Object> servicePrincipalId;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;
        private @Nullable Output<Object> tenant;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlDWLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.azureCloudType = defaults.azureCloudType;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Output.ofNullable(annotations);
            return this;
        }

        public Builder azureCloudType(@Nullable Output<Object> azureCloudType) {
            this.azureCloudType = azureCloudType;
            return this;
        }

        public Builder azureCloudType(@Nullable Object azureCloudType) {
            this.azureCloudType = Output.ofNullable(azureCloudType);
            return this;
        }

        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Output.ofNullable(connectVia);
            return this;
        }

        public Builder connectionString(Output<Object> connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }

        public Builder connectionString(Object connectionString) {
            this.connectionString = Output.of(Objects.requireNonNull(connectionString));
            return this;
        }

        public Builder credential(@Nullable Output<CredentialReferenceArgs> credential) {
            this.credential = credential;
            return this;
        }

        public Builder credential(@Nullable CredentialReferenceArgs credential) {
            this.credential = Output.ofNullable(credential);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Output.ofNullable(encryptedCredential);
            return this;
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }

        public Builder password(@Nullable Output<AzureKeyVaultSecretReferenceArgs> password) {
            this.password = password;
            return this;
        }

        public Builder password(@Nullable AzureKeyVaultSecretReferenceArgs password) {
            this.password = Output.ofNullable(password);
            return this;
        }

        public Builder servicePrincipalId(@Nullable Output<Object> servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = Output.ofNullable(servicePrincipalId);
            return this;
        }

        public Builder servicePrincipalKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            this.servicePrincipalKey = Output.ofNullable(servicePrincipalKey);
            return this;
        }

        public Builder tenant(@Nullable Output<Object> tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder tenant(@Nullable Object tenant) {
            this.tenant = Output.ofNullable(tenant);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public AzureSqlDWLinkedServiceArgs build() {
            return new AzureSqlDWLinkedServiceArgs(annotations, azureCloudType, connectVia, connectionString, credential, description, encryptedCredential, parameters, password, servicePrincipalId, servicePrincipalKey, tenant, type);
        }
    }
}
