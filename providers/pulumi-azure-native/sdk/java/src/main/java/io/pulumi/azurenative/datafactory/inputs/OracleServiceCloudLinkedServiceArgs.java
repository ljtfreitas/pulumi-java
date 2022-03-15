// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Oracle Service Cloud linked service.
 * 
 */
public final class OracleServiceCloudLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OracleServiceCloudLinkedServiceArgs Empty = new OracleServiceCloudLinkedServiceArgs();

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
     * The URL of the Oracle Service Cloud instance.
     * 
     */
    @Import(name="host", required=true)
      private final Output<Object> host;

    public Output<Object> getHost() {
        return this.host;
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
     * The password corresponding to the user name that you provided in the username key.
     * 
     */
    @Import(name="password", required=true)
      private final Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password;
    }

    /**
     * Type of linked service.
     * Expected value is 'OracleServiceCloud'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="useEncryptedEndpoints")
      private final @Nullable Output<Object> useEncryptedEndpoints;

    public Output<Object> getUseEncryptedEndpoints() {
        return this.useEncryptedEndpoints == null ? Output.empty() : this.useEncryptedEndpoints;
    }

    /**
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="useHostVerification")
      private final @Nullable Output<Object> useHostVerification;

    public Output<Object> getUseHostVerification() {
        return this.useHostVerification == null ? Output.empty() : this.useHostVerification;
    }

    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="usePeerVerification")
      private final @Nullable Output<Object> usePeerVerification;

    public Output<Object> getUsePeerVerification() {
        return this.usePeerVerification == null ? Output.empty() : this.usePeerVerification;
    }

    /**
     * The user name that you use to access Oracle Service Cloud server.
     * 
     */
    @Import(name="username", required=true)
      private final Output<Object> username;

    public Output<Object> getUsername() {
        return this.username;
    }

    public OracleServiceCloudLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        Output<Object> host,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        Output<String> type,
        @Nullable Output<Object> useEncryptedEndpoints,
        @Nullable Output<Object> useHostVerification,
        @Nullable Output<Object> usePeerVerification,
        Output<Object> username) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.parameters = parameters;
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private OracleServiceCloudLinkedServiceArgs() {
        this.annotations = Output.empty();
        this.connectVia = Output.empty();
        this.description = Output.empty();
        this.encryptedCredential = Output.empty();
        this.host = Output.empty();
        this.parameters = Output.empty();
        this.password = Output.empty();
        this.type = Output.empty();
        this.useEncryptedEndpoints = Output.empty();
        this.useHostVerification = Output.empty();
        this.usePeerVerification = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleServiceCloudLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private Output<Object> host;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private Output<String> type;
        private @Nullable Output<Object> useEncryptedEndpoints;
        private @Nullable Output<Object> useHostVerification;
        private @Nullable Output<Object> usePeerVerification;
        private Output<Object> username;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleServiceCloudLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
    	      this.username = defaults.username;
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

        public Builder host(Output<Object> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder host(Object host) {
            this.host = Output.of(Objects.requireNonNull(host));
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

        public Builder password(Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder password(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            this.password = Output.of(Objects.requireNonNull(password));
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

        public Builder useEncryptedEndpoints(@Nullable Output<Object> useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        public Builder useEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = Output.ofNullable(useEncryptedEndpoints);
            return this;
        }

        public Builder useHostVerification(@Nullable Output<Object> useHostVerification) {
            this.useHostVerification = useHostVerification;
            return this;
        }

        public Builder useHostVerification(@Nullable Object useHostVerification) {
            this.useHostVerification = Output.ofNullable(useHostVerification);
            return this;
        }

        public Builder usePeerVerification(@Nullable Output<Object> usePeerVerification) {
            this.usePeerVerification = usePeerVerification;
            return this;
        }

        public Builder usePeerVerification(@Nullable Object usePeerVerification) {
            this.usePeerVerification = Output.ofNullable(usePeerVerification);
            return this;
        }

        public Builder username(Output<Object> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder username(Object username) {
            this.username = Output.of(Objects.requireNonNull(username));
            return this;
        }
        public OracleServiceCloudLinkedServiceArgs build() {
            return new OracleServiceCloudLinkedServiceArgs(annotations, connectVia, description, encryptedCredential, host, parameters, password, type, useEncryptedEndpoints, useHostVerification, usePeerVerification, username);
        }
    }
}
