// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.HBaseAuthenticationType;
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
 * HBase server linked service.
 * 
 */
public final class HBaseLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final HBaseLinkedServiceArgs Empty = new HBaseLinkedServiceArgs();

    /**
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when connecting over SSL. The default value is false.
     * 
     */
    @InputImport(name="allowHostNameCNMismatch")
    private final @Nullable Input<Object> allowHostNameCNMismatch;

    public Input<Object> getAllowHostNameCNMismatch() {
        return this.allowHostNameCNMismatch == null ? Input.empty() : this.allowHostNameCNMismatch;
    }

    /**
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
     * 
     */
    @InputImport(name="allowSelfSignedServerCert")
    private final @Nullable Input<Object> allowSelfSignedServerCert;

    public Input<Object> getAllowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert == null ? Input.empty() : this.allowSelfSignedServerCert;
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
     * The authentication mechanism to use to connect to the HBase server.
     * 
     */
    @InputImport(name="authenticationType", required=true)
    private final Input<Either<String,HBaseAuthenticationType>> authenticationType;

    public Input<Either<String,HBaseAuthenticationType>> getAuthenticationType() {
        return this.authenticationType;
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
     * Linked service description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     * 
     */
    @InputImport(name="enableSsl")
    private final @Nullable Input<Object> enableSsl;

    public Input<Object> getEnableSsl() {
        return this.enableSsl == null ? Input.empty() : this.enableSsl;
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
     * The IP address or host name of the HBase server. (i.e. 192.168.222.160)
     * 
     */
    @InputImport(name="host", required=true)
    private final Input<Object> host;

    public Input<Object> getHost() {
        return this.host;
    }

    /**
     * The partial URL corresponding to the HBase server. (i.e. /gateway/sandbox/hbase/version)
     * 
     */
    @InputImport(name="httpPath")
    private final @Nullable Input<Object> httpPath;

    public Input<Object> getHttpPath() {
        return this.httpPath == null ? Input.empty() : this.httpPath;
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
     * The password corresponding to the user name.
     * 
     */
    @InputImport(name="password")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The TCP port that the HBase instance uses to listen for client connections. The default value is 9090.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Object> port;

    public Input<Object> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file installed with the IR.
     * 
     */
    @InputImport(name="trustedCertPath")
    private final @Nullable Input<Object> trustedCertPath;

    public Input<Object> getTrustedCertPath() {
        return this.trustedCertPath == null ? Input.empty() : this.trustedCertPath;
    }

    /**
     * Type of linked service.
     * Expected value is 'HBase'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The user name used to connect to the HBase instance.
     * 
     */
    @InputImport(name="username")
    private final @Nullable Input<Object> username;

    public Input<Object> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public HBaseLinkedServiceArgs(
        @Nullable Input<Object> allowHostNameCNMismatch,
        @Nullable Input<Object> allowSelfSignedServerCert,
        @Nullable Input<List<Object>> annotations,
        Input<Either<String,HBaseAuthenticationType>> authenticationType,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<String> description,
        @Nullable Input<Object> enableSsl,
        @Nullable Input<Object> encryptedCredential,
        Input<Object> host,
        @Nullable Input<Object> httpPath,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Input<Object> port,
        @Nullable Input<Object> trustedCertPath,
        Input<String> type,
        @Nullable Input<Object> username) {
        this.allowHostNameCNMismatch = allowHostNameCNMismatch;
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        this.annotations = annotations;
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.connectVia = connectVia;
        this.description = description;
        this.enableSsl = enableSsl;
        this.encryptedCredential = encryptedCredential;
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.httpPath = httpPath;
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.trustedCertPath = trustedCertPath;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.username = username;
    }

    private HBaseLinkedServiceArgs() {
        this.allowHostNameCNMismatch = Input.empty();
        this.allowSelfSignedServerCert = Input.empty();
        this.annotations = Input.empty();
        this.authenticationType = Input.empty();
        this.connectVia = Input.empty();
        this.description = Input.empty();
        this.enableSsl = Input.empty();
        this.encryptedCredential = Input.empty();
        this.host = Input.empty();
        this.httpPath = Input.empty();
        this.parameters = Input.empty();
        this.password = Input.empty();
        this.port = Input.empty();
        this.trustedCertPath = Input.empty();
        this.type = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HBaseLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> allowHostNameCNMismatch;
        private @Nullable Input<Object> allowSelfSignedServerCert;
        private @Nullable Input<List<Object>> annotations;
        private Input<Either<String,HBaseAuthenticationType>> authenticationType;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> enableSsl;
        private @Nullable Input<Object> encryptedCredential;
        private Input<Object> host;
        private @Nullable Input<Object> httpPath;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private @Nullable Input<Object> port;
        private @Nullable Input<Object> trustedCertPath;
        private Input<String> type;
        private @Nullable Input<Object> username;

        public Builder() {
    	      // Empty
        }

        public Builder(HBaseLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowHostNameCNMismatch = defaults.allowHostNameCNMismatch;
    	      this.allowSelfSignedServerCert = defaults.allowSelfSignedServerCert;
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.enableSsl = defaults.enableSsl;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.httpPath = defaults.httpPath;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.trustedCertPath = defaults.trustedCertPath;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder setAllowHostNameCNMismatch(@Nullable Input<Object> allowHostNameCNMismatch) {
            this.allowHostNameCNMismatch = allowHostNameCNMismatch;
            return this;
        }

        public Builder setAllowHostNameCNMismatch(@Nullable Object allowHostNameCNMismatch) {
            this.allowHostNameCNMismatch = Input.ofNullable(allowHostNameCNMismatch);
            return this;
        }

        public Builder setAllowSelfSignedServerCert(@Nullable Input<Object> allowSelfSignedServerCert) {
            this.allowSelfSignedServerCert = allowSelfSignedServerCert;
            return this;
        }

        public Builder setAllowSelfSignedServerCert(@Nullable Object allowSelfSignedServerCert) {
            this.allowSelfSignedServerCert = Input.ofNullable(allowSelfSignedServerCert);
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

        public Builder setAuthenticationType(Input<Either<String,HBaseAuthenticationType>> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setAuthenticationType(Either<String,HBaseAuthenticationType> authenticationType) {
            this.authenticationType = Input.of(Objects.requireNonNull(authenticationType));
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

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnableSsl(@Nullable Input<Object> enableSsl) {
            this.enableSsl = enableSsl;
            return this;
        }

        public Builder setEnableSsl(@Nullable Object enableSsl) {
            this.enableSsl = Input.ofNullable(enableSsl);
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

        public Builder setHost(Input<Object> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setHost(Object host) {
            this.host = Input.of(Objects.requireNonNull(host));
            return this;
        }

        public Builder setHttpPath(@Nullable Input<Object> httpPath) {
            this.httpPath = httpPath;
            return this;
        }

        public Builder setHttpPath(@Nullable Object httpPath) {
            this.httpPath = Input.ofNullable(httpPath);
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

        public Builder setPort(@Nullable Input<Object> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Object port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setTrustedCertPath(@Nullable Input<Object> trustedCertPath) {
            this.trustedCertPath = trustedCertPath;
            return this;
        }

        public Builder setTrustedCertPath(@Nullable Object trustedCertPath) {
            this.trustedCertPath = Input.ofNullable(trustedCertPath);
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

        public Builder setUsername(@Nullable Input<Object> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable Object username) {
            this.username = Input.ofNullable(username);
            return this;
        }

        public HBaseLinkedServiceArgs build() {
            return new HBaseLinkedServiceArgs(allowHostNameCNMismatch, allowSelfSignedServerCert, annotations, authenticationType, connectVia, description, enableSsl, encryptedCredential, host, httpPath, parameters, password, port, trustedCertPath, type, username);
        }
    }
}
