// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.azurenative.datafactory.inputs.SqlAlwaysEncryptedPropertiesResponse;
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
 * SQL Server linked service.
 * 
 */
public final class SqlServerLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SqlServerLinkedServiceResponse Empty = new SqlServerLinkedServiceResponse();

    /**
     * Sql always encrypted properties.
     * 
     */
    @InputImport(name="alwaysEncryptedSettings")
        private final @Nullable SqlAlwaysEncryptedPropertiesResponse alwaysEncryptedSettings;

    public Optional<SqlAlwaysEncryptedPropertiesResponse> getAlwaysEncryptedSettings() {
        return this.alwaysEncryptedSettings == null ? Optional.empty() : Optional.ofNullable(this.alwaysEncryptedSettings);
    }

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
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
        private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * The connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @InputImport(name="connectionString", required=true)
        private final Object connectionString;

    public Object getConnectionString() {
        return this.connectionString;
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
     * The on-premises Windows authentication password.
     * 
     */
    @InputImport(name="password")
        private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password == null ? null : this.password;
    }

    /**
     * Type of linked service.
     * Expected value is 'SqlServer'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The on-premises Windows authentication user name. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="userName")
        private final @Nullable Object userName;

    public Optional<Object> getUserName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    public SqlServerLinkedServiceResponse(
        @Nullable SqlAlwaysEncryptedPropertiesResponse alwaysEncryptedSettings,
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        Object connectionString,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        String type,
        @Nullable Object userName) {
        this.alwaysEncryptedSettings = alwaysEncryptedSettings;
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.connectionString = Objects.requireNonNull(connectionString, "expected parameter 'connectionString' to be non-null");
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private SqlServerLinkedServiceResponse() {
        this.alwaysEncryptedSettings = null;
        this.annotations = List.of();
        this.connectVia = null;
        this.connectionString = null;
        this.description = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.password = null;
        this.type = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SqlAlwaysEncryptedPropertiesResponse alwaysEncryptedSettings;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private Object connectionString;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private String type;
        private @Nullable Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysEncryptedSettings = defaults.alwaysEncryptedSettings;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setAlwaysEncryptedSettings(@Nullable SqlAlwaysEncryptedPropertiesResponse alwaysEncryptedSettings) {
            this.alwaysEncryptedSettings = alwaysEncryptedSettings;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setConnectionString(Object connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
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

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserName(@Nullable Object userName) {
            this.userName = userName;
            return this;
        }
        public SqlServerLinkedServiceResponse build() {
            return new SqlServerLinkedServiceResponse(alwaysEncryptedSettings, annotations, connectVia, connectionString, description, encryptedCredential, parameters, password, type, userName);
        }
    }
}
