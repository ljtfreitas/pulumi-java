// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.SftpAuthenticationType;
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
 * A linked service for an SSH File Transfer Protocol (SFTP) server.
 * 
 */
public final class SftpServerLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SftpServerLinkedServiceArgs Empty = new SftpServerLinkedServiceArgs();

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
     * The authentication type to be used to connect to the FTP server.
     * 
     */
    @InputImport(name="authenticationType")
        private final @Nullable Input<Either<String,SftpAuthenticationType>> authenticationType;

    public Input<Either<String,SftpAuthenticationType>> getAuthenticationType() {
        return this.authenticationType == null ? Input.empty() : this.authenticationType;
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
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
        private final @Nullable Input<Object> encryptedCredential;

    public Input<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Input.empty() : this.encryptedCredential;
    }

    /**
     * The SFTP server host name. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="host", required=true)
        private final Input<Object> host;

    public Input<Object> getHost() {
        return this.host;
    }

    /**
     * The host key finger-print of the SFTP server. When SkipHostKeyValidation is false, HostKeyFingerprint should be specified. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="hostKeyFingerprint")
        private final @Nullable Input<Object> hostKeyFingerprint;

    public Input<Object> getHostKeyFingerprint() {
        return this.hostKeyFingerprint == null ? Input.empty() : this.hostKeyFingerprint;
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
     * The password to decrypt the SSH private key if the SSH private key is encrypted.
     * 
     */
    @InputImport(name="passPhrase")
        private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> passPhrase;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassPhrase() {
        return this.passPhrase == null ? Input.empty() : this.passPhrase;
    }

    /**
     * Password to logon the SFTP server for Basic authentication.
     * 
     */
    @InputImport(name="password")
        private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The TCP port number that the SFTP server uses to listen for client connections. Default value is 22. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @InputImport(name="port")
        private final @Nullable Input<Object> port;

    public Input<Object> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * Base64 encoded SSH private key content for SshPublicKey authentication. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format.
     * 
     */
    @InputImport(name="privateKeyContent")
        private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> privateKeyContent;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPrivateKeyContent() {
        return this.privateKeyContent == null ? Input.empty() : this.privateKeyContent;
    }

    /**
     * The SSH private key file path for SshPublicKey authentication. Only valid for on-premises copy. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be specified. SSH private key should be OpenSSH format. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="privateKeyPath")
        private final @Nullable Input<Object> privateKeyPath;

    public Input<Object> getPrivateKeyPath() {
        return this.privateKeyPath == null ? Input.empty() : this.privateKeyPath;
    }

    /**
     * If true, skip the SSH host key validation. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="skipHostKeyValidation")
        private final @Nullable Input<Object> skipHostKeyValidation;

    public Input<Object> getSkipHostKeyValidation() {
        return this.skipHostKeyValidation == null ? Input.empty() : this.skipHostKeyValidation;
    }

    /**
     * Type of linked service.
     * Expected value is 'Sftp'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The username used to log on to the SFTP server. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="userName")
        private final @Nullable Input<Object> userName;

    public Input<Object> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public SftpServerLinkedServiceArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<Either<String,SftpAuthenticationType>> authenticationType,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        Input<Object> host,
        @Nullable Input<Object> hostKeyFingerprint,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> passPhrase,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Input<Object> port,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> privateKeyContent,
        @Nullable Input<Object> privateKeyPath,
        @Nullable Input<Object> skipHostKeyValidation,
        Input<String> type,
        @Nullable Input<Object> userName) {
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

    private SftpServerLinkedServiceArgs() {
        this.annotations = Input.empty();
        this.authenticationType = Input.empty();
        this.connectVia = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.host = Input.empty();
        this.hostKeyFingerprint = Input.empty();
        this.parameters = Input.empty();
        this.passPhrase = Input.empty();
        this.password = Input.empty();
        this.port = Input.empty();
        this.privateKeyContent = Input.empty();
        this.privateKeyPath = Input.empty();
        this.skipHostKeyValidation = Input.empty();
        this.type = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SftpServerLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<Either<String,SftpAuthenticationType>> authenticationType;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private Input<Object> host;
        private @Nullable Input<Object> hostKeyFingerprint;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> passPhrase;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private @Nullable Input<Object> port;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> privateKeyContent;
        private @Nullable Input<Object> privateKeyPath;
        private @Nullable Input<Object> skipHostKeyValidation;
        private Input<String> type;
        private @Nullable Input<Object> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SftpServerLinkedServiceArgs defaults) {
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

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setAuthenticationType(@Nullable Input<Either<String,SftpAuthenticationType>> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder setAuthenticationType(@Nullable Either<String,SftpAuthenticationType> authenticationType) {
            this.authenticationType = Input.ofNullable(authenticationType);
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

        public Builder setHostKeyFingerprint(@Nullable Input<Object> hostKeyFingerprint) {
            this.hostKeyFingerprint = hostKeyFingerprint;
            return this;
        }

        public Builder setHostKeyFingerprint(@Nullable Object hostKeyFingerprint) {
            this.hostKeyFingerprint = Input.ofNullable(hostKeyFingerprint);
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

        public Builder setPassPhrase(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> passPhrase) {
            this.passPhrase = passPhrase;
            return this;
        }

        public Builder setPassPhrase(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> passPhrase) {
            this.passPhrase = Input.ofNullable(passPhrase);
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

        public Builder setPrivateKeyContent(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> privateKeyContent) {
            this.privateKeyContent = privateKeyContent;
            return this;
        }

        public Builder setPrivateKeyContent(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> privateKeyContent) {
            this.privateKeyContent = Input.ofNullable(privateKeyContent);
            return this;
        }

        public Builder setPrivateKeyPath(@Nullable Input<Object> privateKeyPath) {
            this.privateKeyPath = privateKeyPath;
            return this;
        }

        public Builder setPrivateKeyPath(@Nullable Object privateKeyPath) {
            this.privateKeyPath = Input.ofNullable(privateKeyPath);
            return this;
        }

        public Builder setSkipHostKeyValidation(@Nullable Input<Object> skipHostKeyValidation) {
            this.skipHostKeyValidation = skipHostKeyValidation;
            return this;
        }

        public Builder setSkipHostKeyValidation(@Nullable Object skipHostKeyValidation) {
            this.skipHostKeyValidation = Input.ofNullable(skipHostKeyValidation);
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

        public Builder setUserName(@Nullable Input<Object> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable Object userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }
        public SftpServerLinkedServiceArgs build() {
            return new SftpServerLinkedServiceArgs(annotations, authenticationType, connectVia, description, encryptedCredential, host, hostKeyFingerprint, parameters, passPhrase, password, port, privateKeyContent, privateKeyPath, skipHostKeyValidation, type, userName);
        }
    }
}
