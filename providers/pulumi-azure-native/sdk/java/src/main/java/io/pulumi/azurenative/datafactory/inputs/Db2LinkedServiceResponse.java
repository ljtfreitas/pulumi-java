// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
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
 * Linked service for DB2 data source.
 * 
 */
public final class Db2LinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final Db2LinkedServiceResponse Empty = new Db2LinkedServiceResponse();

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
     * AuthenticationType to be used for connection. It is mutually exclusive with connectionString property.
     * 
     */
    @Import(name="authenticationType")
      private final @Nullable String authenticationType;

    public Optional<String> getAuthenticationType() {
        return this.authenticationType == null ? Optional.empty() : Optional.ofNullable(this.authenticationType);
    }

    /**
     * Certificate Common Name when TLS is enabled. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="certificateCommonName")
      private final @Nullable Object certificateCommonName;

    public Optional<Object> getCertificateCommonName() {
        return this.certificateCommonName == null ? Optional.empty() : Optional.ofNullable(this.certificateCommonName);
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
     * The connection string. It is mutually exclusive with server, database, authenticationType, userName, packageCollection and certificateCommonName property. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="connectionString")
      private final @Nullable Object connectionString;

    public Optional<Object> getConnectionString() {
        return this.connectionString == null ? Optional.empty() : Optional.ofNullable(this.connectionString);
    }

    /**
     * Database name for connection. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="database")
      private final @Nullable Object database;

    public Optional<Object> getDatabase() {
        return this.database == null ? Optional.empty() : Optional.ofNullable(this.database);
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
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Object encryptedCredential;

    public Optional<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Under where packages are created when querying database. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="packageCollection")
      private final @Nullable Object packageCollection;

    public Optional<Object> getPackageCollection() {
        return this.packageCollection == null ? Optional.empty() : Optional.ofNullable(this.packageCollection);
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
     * Password for authentication.
     * 
     */
    @Import(name="password")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password == null ? null : this.password;
    }

    /**
     * Server name for connection. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="server")
      private final @Nullable Object server;

    public Optional<Object> getServer() {
        return this.server == null ? Optional.empty() : Optional.ofNullable(this.server);
    }

    /**
     * Type of linked service.
     * Expected value is 'Db2'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Username for authentication. It is mutually exclusive with connectionString property. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="username")
      private final @Nullable Object username;

    public Optional<Object> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public Db2LinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable String authenticationType,
        @Nullable Object certificateCommonName,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable Object connectionString,
        @Nullable Object database,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Object packageCollection,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Object server,
        String type,
        @Nullable Object username) {
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.certificateCommonName = certificateCommonName;
        this.connectVia = connectVia;
        this.connectionString = connectionString;
        this.database = database;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.packageCollection = packageCollection;
        this.parameters = parameters;
        this.password = password;
        this.server = server;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.username = username;
    }

    private Db2LinkedServiceResponse() {
        this.annotations = List.of();
        this.authenticationType = null;
        this.certificateCommonName = null;
        this.connectVia = null;
        this.connectionString = null;
        this.database = null;
        this.description = null;
        this.encryptedCredential = null;
        this.packageCollection = null;
        this.parameters = Map.of();
        this.password = null;
        this.server = null;
        this.type = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Db2LinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String authenticationType;
        private @Nullable Object certificateCommonName;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object connectionString;
        private @Nullable Object database;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Object packageCollection;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object server;
        private String type;
        private @Nullable Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(Db2LinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.certificateCommonName = defaults.certificateCommonName;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.packageCollection = defaults.packageCollection;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder certificateCommonName(@Nullable Object certificateCommonName) {
            this.certificateCommonName = certificateCommonName;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder connectionString(@Nullable Object connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder database(@Nullable Object database) {
            this.database = database;
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

        public Builder packageCollection(@Nullable Object packageCollection) {
            this.packageCollection = packageCollection;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder server(@Nullable Object server) {
            this.server = server;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder username(@Nullable Object username) {
            this.username = username;
            return this;
        }
        public Db2LinkedServiceResponse build() {
            return new Db2LinkedServiceResponse(annotations, authenticationType, certificateCommonName, connectVia, connectionString, database, description, encryptedCredential, packageCollection, parameters, password, server, type, username);
        }
    }
}
