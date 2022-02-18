// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Linked service for Teradata data source.
 * 
 */
public final class TeradataLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final TeradataLinkedServiceResponse Empty = new TeradataLinkedServiceResponse();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * AuthenticationType to be used for connection.
     * 
     */
    @InputImport(name="authenticationType")
    private final @Nullable String authenticationType;

    public Optional<String> getAuthenticationType() {
        return this.authenticationType == null ? Optional.empty() : Optional.ofNullable(this.authenticationType);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * Teradata ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @InputImport(name="connectionString")
    private final @Nullable Object connectionString;

    public Optional<Object> getConnectionString() {
        return this.connectionString == null ? Optional.empty() : Optional.ofNullable(this.connectionString);
    }

    /**
     * Linked service description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
    private final @Nullable Object encryptedCredential;

    public Optional<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Password for authentication.
     * 
     */
    @InputImport(name="password")
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password == null ? null : this.password;
    }

    /**
     * Server name for connection. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="server")
    private final @Nullable Object server;

    public Optional<Object> getServer() {
        return this.server == null ? Optional.empty() : Optional.ofNullable(this.server);
    }

    /**
     * Type of linked service.
     * Expected value is 'Teradata'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Username for authentication. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="username")
    private final @Nullable Object username;

    public Optional<Object> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public TeradataLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable String authenticationType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable Object connectionString,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Object server,
        String type,
        @Nullable Object username) {
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.connectionString = connectionString;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.server = server;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.username = username;
    }

    private TeradataLinkedServiceResponse() {
        this.annotations = List.of();
        this.authenticationType = null;
        this.connectVia = null;
        this.connectionString = null;
        this.description = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.password = null;
        this.server = null;
        this.type = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeradataLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String authenticationType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object connectionString;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object server;
        private String type;
        private @Nullable Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(TeradataLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAuthenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setConnectionString(@Nullable Object connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder setServer(@Nullable Object server) {
            this.server = server;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUsername(@Nullable Object username) {
            this.username = username;
            return this;
        }

        public TeradataLinkedServiceResponse build() {
            return new TeradataLinkedServiceResponse(annotations, authenticationType, connectVia, connectionString, description, encryptedCredential, parameters, password, server, type, username);
        }
    }
}
