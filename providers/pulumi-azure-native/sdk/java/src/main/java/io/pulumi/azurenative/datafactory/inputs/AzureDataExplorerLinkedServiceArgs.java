// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

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
 * Azure Data Explorer (Kusto) linked service.
 * 
 */
public final class AzureDataExplorerLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureDataExplorerLinkedServiceArgs Empty = new AzureDataExplorerLinkedServiceArgs();

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
     * Database name for connection. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="database", required=true)
    private final Input<Object> database;

    public Input<Object> getDatabase() {
        return this.database;
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
     * The endpoint of Azure Data Explorer (the engine's endpoint). URL will be in the format https://<clusterName>.<regionName>.kusto.windows.net. Type: string (or Expression with resultType string)
     * 
     */
    @InputImport(name="endpoint", required=true)
    private final Input<Object> endpoint;

    public Input<Object> getEndpoint() {
        return this.endpoint;
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
     * The ID of the service principal used to authenticate against Azure Data Explorer. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="servicePrincipalId")
    private final @Nullable Input<Object> servicePrincipalId;

    public Input<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Input.empty() : this.servicePrincipalId;
    }

    /**
     * The key of the service principal used to authenticate against Kusto.
     * 
     */
    @InputImport(name="servicePrincipalKey")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getServicePrincipalKey() {
        return this.servicePrincipalKey == null ? Input.empty() : this.servicePrincipalKey;
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="tenant")
    private final @Nullable Input<Object> tenant;

    public Input<Object> getTenant() {
        return this.tenant == null ? Input.empty() : this.tenant;
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureDataExplorer'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AzureDataExplorerLinkedServiceArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<CredentialReferenceArgs> credential,
        Input<Object> database,
        @Nullable Input<String> description,
        Input<Object> endpoint,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Object> servicePrincipalId,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey,
        @Nullable Input<Object> tenant,
        Input<String> type) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.credential = credential;
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.description = description;
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.parameters = parameters;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureDataExplorerLinkedServiceArgs() {
        this.annotations = Input.empty();
        this.connectVia = Input.empty();
        this.credential = Input.empty();
        this.database = Input.empty();
        this.description = Input.empty();
        this.endpoint = Input.empty();
        this.parameters = Input.empty();
        this.servicePrincipalId = Input.empty();
        this.servicePrincipalKey = Input.empty();
        this.tenant = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataExplorerLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<CredentialReferenceArgs> credential;
        private Input<Object> database;
        private @Nullable Input<String> description;
        private Input<Object> endpoint;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Object> servicePrincipalId;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;
        private @Nullable Input<Object> tenant;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataExplorerLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.credential = defaults.credential;
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.endpoint = defaults.endpoint;
    	      this.parameters = defaults.parameters;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
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

        public Builder setDatabase(Input<Object> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setDatabase(Object database) {
            this.database = Input.of(Objects.requireNonNull(database));
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

        public Builder setEndpoint(Input<Object> endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setEndpoint(Object endpoint) {
            this.endpoint = Input.of(Objects.requireNonNull(endpoint));
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

        public AzureDataExplorerLinkedServiceArgs build() {
            return new AzureDataExplorerLinkedServiceArgs(annotations, connectVia, credential, database, description, endpoint, parameters, servicePrincipalId, servicePrincipalKey, tenant, type);
        }
    }
}
