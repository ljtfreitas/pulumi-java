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
 * A linked service for an SSH File Transfer Protocol (SFTP) server.
 * 
 */
public final class SftpServerLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SftpServerLinkedServiceResponse Empty = new SftpServerLinkedServiceResponse();

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
     * The authentication type to be used to connect to the FTP server.
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
     * The SFTP server host name. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="host", required=true)
        private final Object host;

    public Object getHost() {
        return this.host;
    }

    /**
     * The host key finger-print of the SFTP server. When SkipHostKeyValidation is false, HostKeyFingerprint should be specified. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="hostKeyFingerprint")
        private final @Nullable Object hostKeyFingerprint;

    public Optional<Object> getHostKeyFingerprint() {
        return this.hostKeyFingerprint == null ? Optional.empty() : Optional.ofNullable(this.hostKeyFingerprint);
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
     * The password to decrypt the SSH private key if the SSH private key is encrypted.
     * 
     */
    @InputImport(name="passPhrase")
        private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> passPhrase;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassPhrase() {
        return this.passPhrase == null ? null : this.passPhrase;
    }

    /**
     * Password to logon the SFTP server for Basic authentication.
     * 
     */
    @InputImport(name="password")
        private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password == null ? null : this.password;
    }

    /**
     * The TCP port number that the SFTP server uses to listen for client connections. Default value is 22. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @InputImport(name="port")
        private final @Nullable Object port;

    public Optional<Object> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    /**
     * Base64 encoded SSH private key content for SshPublicKey authentication. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format.
     * 
     */
    @InputImport(name="privateKeyContent")
        private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> privateKeyContent;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPrivateKeyContent() {
        return this.privateKeyContent == null ? null : this.privateKeyContent;
    }

    /**
     * The SSH private key file path for SshPublicKey authentication. Only valid for on-premises copy. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="privateKeyPath")
        private final @Nullable Object privateKeyPath;

    public Optional<Object> getPrivateKeyPath() {
        return this.privateKeyPath == null ? Optional.empty() : Optional.ofNullable(this.privateKeyPath);
    }

    /**
     * If true, skip the SSH host key validation. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="skipHostKeyValidation")
        private final @Nullable Object skipHostKeyValidation;

    public Optional<Object> getSkipHostKeyValidation() {
        return this.skipHostKeyValidation == null ? Optional.empty() : Optional.ofNullable(this.skipHostKeyValidation);
    }

    /**
     * Type of linked service.
     * Expected value is 'Sftp'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The username used to log on to the SFTP server. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="userName")
        private final @Nullable Object userName;

    public Optional<Object> getUserName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    public SftpServerLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable String authenticationType,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        Object host,
        @Nullable Object hostKeyFingerprint,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> passPhrase,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        @Nullable Object port,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> privateKeyContent,
        @Nullable Object privateKeyPath,
        @Nullable Object skipHostKeyValidation,
        String type,
        @Nullable Object userName) {
        this.annotations = annotations;
        this.authenticationType = authenticationType;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.hostKeyFingerprint = hostKeyFingerprint;
        this.parameters = parameters;
        this.passPhrase = passPhrase;
        this.password = password;
        this.port = port;
        this.privateKeyContent = privateKeyContent;
        this.privateKeyPath = privateKeyPath;
        this.skipHostKeyValidation = skipHostKeyValidation;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private SftpServerLinkedServiceResponse() {
        this.annotations = List.of();
        this.authenticationType = null;
        this.connectVia = null;
        this.description = null;
        this.encryptedCredential = null;
        this.host = null;
        this.hostKeyFingerprint = null;
        this.parameters = Map.of();
        this.passPhrase = null;
        this.password = null;
        this.port = null;
        this.privateKeyContent = null;
        this.privateKeyPath = null;
        this.skipHostKeyValidation = null;
        this.type = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SftpServerLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String authenticationType;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private Object host;
        private @Nullable Object hostKeyFingerprint;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> passPhrase;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private @Nullable Object port;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> privateKeyContent;
        private @Nullable Object privateKeyPath;
        private @Nullable Object skipHostKeyValidation;
        private String type;
        private @Nullable Object userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SftpServerLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authenticationType = defaults.authenticationType;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.hostKeyFingerprint = defaults.hostKeyFingerprint;
    	      this.parameters = defaults.parameters;
    	      this.passPhrase = defaults.passPhrase;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.privateKeyContent = defaults.privateKeyContent;
    	      this.privateKeyPath = defaults.privateKeyPath;
    	      this.skipHostKeyValidation = defaults.skipHostKeyValidation;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
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

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setHost(Object host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setHostKeyFingerprint(@Nullable Object hostKeyFingerprint) {
            this.hostKeyFingerprint = hostKeyFingerprint;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPassPhrase(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> passPhrase) {
            this.passPhrase = passPhrase;
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

        public Builder setPrivateKeyContent(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> privateKeyContent) {
            this.privateKeyContent = privateKeyContent;
            return this;
        }

        public Builder setPrivateKeyPath(@Nullable Object privateKeyPath) {
            this.privateKeyPath = privateKeyPath;
            return this;
        }

        public Builder setSkipHostKeyValidation(@Nullable Object skipHostKeyValidation) {
            this.skipHostKeyValidation = skipHostKeyValidation;
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
        public SftpServerLinkedServiceResponse build() {
            return new SftpServerLinkedServiceResponse(annotations, authenticationType, connectVia, description, encryptedCredential, host, hostKeyFingerprint, parameters, passPhrase, password, port, privateKeyContent, privateKeyPath, skipHostKeyValidation, type, userName);
        }
    }
}
