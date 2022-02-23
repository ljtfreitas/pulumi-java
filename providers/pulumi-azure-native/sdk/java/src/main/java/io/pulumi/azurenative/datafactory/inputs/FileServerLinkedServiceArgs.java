// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

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
 * File system linked service.
 * 
 */
public final class FileServerLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileServerLinkedServiceArgs Empty = new FileServerLinkedServiceArgs();

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
     * Host name of the server. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="host", required=true)
        private final Input<Object> host;

    public Input<Object> getHost() {
        return this.host;
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
     * Password to logon the server.
     * 
     */
    @InputImport(name="password")
        private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * Type of linked service.
     * Expected value is 'FileServer'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * User ID to logon the server. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="userId")
        private final @Nullable Input<Object> userId;

    public Input<Object> getUserId() {
        return this.userId == null ? Input.empty() : this.userId;
    }

    public FileServerLinkedServiceArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        Input<Object> host,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        Input<String> type,
        @Nullable Input<Object> userId) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.parameters = parameters;
        this.password = password;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userId = userId;
    }

    private FileServerLinkedServiceArgs() {
        this.annotations = Input.empty();
        this.connectVia = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.host = Input.empty();
        this.parameters = Input.empty();
        this.password = Input.empty();
        this.type = Input.empty();
        this.userId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileServerLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private Input<Object> host;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private Input<String> type;
        private @Nullable Input<Object> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(FileServerLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.userId = defaults.userId;
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

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserId(@Nullable Input<Object> userId) {
            this.userId = userId;
            return this;
        }

        public Builder setUserId(@Nullable Object userId) {
            this.userId = Input.ofNullable(userId);
            return this;
        }
        public FileServerLinkedServiceArgs build() {
            return new FileServerLinkedServiceArgs(annotations, connectVia, description, encryptedCredential, host, parameters, password, type, userId);
        }
    }
}
