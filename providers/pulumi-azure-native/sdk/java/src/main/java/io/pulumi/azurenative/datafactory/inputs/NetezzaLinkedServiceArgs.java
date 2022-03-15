// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Netezza linked service.
 * 
 */
public final class NetezzaLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetezzaLinkedServiceArgs Empty = new NetezzaLinkedServiceArgs();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Output.empty() : this.connectVia;
    }

    /**
     * An ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="connectionString")
      private final @Nullable Output<Object> connectionString;

    public Output<Object> getConnectionString() {
        return this.connectionString == null ? Output.empty() : this.connectionString;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Output<Object> encryptedCredential;

    public Output<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Output.empty() : this.encryptedCredential;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * The Azure key vault secret reference of password in connection string.
     * 
     */
    @Import(name="pwd")
      private final @Nullable Output<AzureKeyVaultSecretReferenceArgs> pwd;

    public Output<AzureKeyVaultSecretReferenceArgs> getPwd() {
        return this.pwd == null ? Output.empty() : this.pwd;
    }

    /**
     * Type of linked service.
     * Expected value is 'Netezza'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public NetezzaLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<Object> connectionString,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<AzureKeyVaultSecretReferenceArgs> pwd,
        Output<String> type) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.connectionString = connectionString;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.pwd = pwd;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private NetezzaLinkedServiceArgs() {
        this.annotations = Output.empty();
        this.connectVia = Output.empty();
        this.connectionString = Output.empty();
        this.description = Output.empty();
        this.encryptedCredential = Output.empty();
        this.parameters = Output.empty();
        this.pwd = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetezzaLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<Object> connectionString;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<AzureKeyVaultSecretReferenceArgs> pwd;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(NetezzaLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionString = defaults.connectionString;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.pwd = defaults.pwd;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Output.ofNullable(annotations);
            return this;
        }

        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Output.ofNullable(connectVia);
            return this;
        }

        public Builder connectionString(@Nullable Output<Object> connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder connectionString(@Nullable Object connectionString) {
            this.connectionString = Output.ofNullable(connectionString);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Output.ofNullable(encryptedCredential);
            return this;
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }

        public Builder pwd(@Nullable Output<AzureKeyVaultSecretReferenceArgs> pwd) {
            this.pwd = pwd;
            return this;
        }

        public Builder pwd(@Nullable AzureKeyVaultSecretReferenceArgs pwd) {
            this.pwd = Output.ofNullable(pwd);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public NetezzaLinkedServiceArgs build() {
            return new NetezzaLinkedServiceArgs(annotations, connectVia, connectionString, description, encryptedCredential, parameters, pwd, type);
        }
    }
}
