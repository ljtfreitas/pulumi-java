// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AmazonRedshiftLinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * The database name of the Amazon Redshift source. Type: string (or Expression with resultType string).
     * 
     */
    private final Object database;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The password of the Amazon Redshift source.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
    /**
     * The TCP port number that the Amazon Redshift server uses to listen for client connections. The default value is 5439. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object port;
    /**
     * The name of the Amazon Redshift server. Type: string (or Expression with resultType string).
     * 
     */
    private final Object server;
    /**
     * Type of linked service.
     * Expected value is 'AmazonRedshift'.
     * 
     */
    private final String type;
    /**
     * The username of the Amazon Redshift source. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object username;

    @OutputCustomType.Constructor({"annotations","connectVia","database","description","encryptedCredential","parameters","password","port","server","type","username"})
    private AmazonRedshiftLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        Object database,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Object port,
        Object server,
        String type,
        @Nullable Object username) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.database = Objects.requireNonNull(database);
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.server = Objects.requireNonNull(server);
        this.type = Objects.requireNonNull(type);
        this.username = username;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The integration runtime reference.
     * 
     */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * The database name of the Amazon Redshift source. Type: string (or Expression with resultType string).
     * 
     */
    public Object getDatabase() {
        return this.database;
    }
    /**
     * Linked service description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * Parameters for linked service.
     * 
     */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The password of the Amazon Redshift source.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The TCP port number that the Amazon Redshift server uses to listen for client connections. The default value is 5439. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The name of the Amazon Redshift server. Type: string (or Expression with resultType string).
     * 
     */
    public Object getServer() {
        return this.server;
    }
    /**
     * Type of linked service.
     * Expected value is 'AmazonRedshift'.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The username of the Amazon Redshift source. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonRedshiftLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private Object database;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object port;
        private Object server;
        private String type;
        private @Nullable Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonRedshiftLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.server = defaults.server;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setDatabase(Object database) {
            this.database = Objects.requireNonNull(database);
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

        public Builder setPort(@Nullable Object port) {
            this.port = port;
            return this;
        }

        public Builder setServer(Object server) {
            this.server = Objects.requireNonNull(server);
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
        public AmazonRedshiftLinkedServiceResponse build() {
            return new AmazonRedshiftLinkedServiceResponse(annotations, connectVia, database, description, encryptedCredential, parameters, password, port, server, type, username);
        }
    }
}
