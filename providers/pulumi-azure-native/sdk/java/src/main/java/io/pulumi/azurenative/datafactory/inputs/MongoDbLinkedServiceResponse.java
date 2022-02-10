// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MongoDbLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final MongoDbLinkedServiceResponse Empty = new MongoDbLinkedServiceResponse();

    @InputImport(name="allowSelfSignedServerCert")
    private final @Nullable Object allowSelfSignedServerCert;

    public Optional<Object> getAllowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert == null ? Optional.empty() : Optional.ofNullable(this.allowSelfSignedServerCert);
    }

    @InputImport(name="annotations")
    private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    @InputImport(name="authSource")
    private final @Nullable Object authSource;

    public Optional<Object> getAuthSource() {
        return this.authSource == null ? Optional.empty() : Optional.ofNullable(this.authSource);
    }

    @InputImport(name="authenticationType")
    private final @Nullable String authenticationType;

    public Optional<String> getAuthenticationType() {
        return this.authenticationType == null ? Optional.empty() : Optional.ofNullable(this.authenticationType);
    }

    @InputImport(name="connectVia")
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    @InputImport(name="databaseName", required=true)
    private final Object databaseName;

    public Object getDatabaseName() {
        return this.databaseName;
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="enableSsl")
    private final @Nullable Object enableSsl;

    public Optional<Object> getEnableSsl() {
        return this.enableSsl == null ? Optional.empty() : Optional.ofNullable(this.enableSsl);
    }

    @InputImport(name="encryptedCredential")
    private final @Nullable Object encryptedCredential;

    public Optional<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    @InputImport(name="parameters")
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    @InputImport(name="password")
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password == null ? null : this.password;
    }

    @InputImport(name="port")
    private final @Nullable Object port;

    public Optional<Object> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    @InputImport(name="server", required=true)
    private final Object server;

    public Object getServer() {
        return this.server;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="username")
    private final @Nullable Object username;

    public Optional<Object> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public MongoDbLinkedServiceResponse(
        @Nullable Object allowSelfSignedServerCert,
        @Nullable List<Object> annotations,
        @Nullable Object authSource,
        @Nullable String authenticationType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        Object databaseName,
        @Nullable String description,
        @Nullable Object enableSsl,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Object port,
        Object server,
        String type,
        @Nullable Object username) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        this.annotations = annotations;
        this.authSource = authSource;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.description = description;
        this.enableSsl = enableSsl;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.server = Objects.requireNonNull(server, "expected parameter 'server' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.username = username;
    }

    private MongoDbLinkedServiceResponse() {
        this.allowSelfSignedServerCert = null;
        this.annotations = List.of();
        this.authSource = null;
        this.authenticationType = null;
        this.connectVia = null;
        this.databaseName = null;
        this.description = null;
        this.enableSsl = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.password = null;
        this.port = null;
        this.server = null;
        this.type = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDbLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object allowSelfSignedServerCert;
        private @Nullable List<Object> annotations;
        private @Nullable Object authSource;
        private @Nullable String authenticationType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private Object databaseName;
        private @Nullable String description;
        private @Nullable Object enableSsl;
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

        public Builder(MongoDbLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSelfSignedServerCert = defaults.allowSelfSignedServerCert;
    	      this.annotations = defaults.annotations;
    	      this.authSource = defaults.authSource;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.databaseName = defaults.databaseName;
    	      this.description = defaults.description;
    	      this.enableSsl = defaults.enableSsl;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.server = defaults.server;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder setAllowSelfSignedServerCert(@Nullable Object allowSelfSignedServerCert) {
            this.allowSelfSignedServerCert = allowSelfSignedServerCert;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAuthSource(@Nullable Object authSource) {
            this.authSource = authSource;
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

        public Builder setDatabaseName(Object databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEnableSsl(@Nullable Object enableSsl) {
            this.enableSsl = enableSsl;
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

        public MongoDbLinkedServiceResponse build() {
            return new MongoDbLinkedServiceResponse(allowSelfSignedServerCert, annotations, authSource, authenticationType, connectVia, databaseName, description, enableSsl, encryptedCredential, parameters, password, port, server, type, username);
        }
    }
}