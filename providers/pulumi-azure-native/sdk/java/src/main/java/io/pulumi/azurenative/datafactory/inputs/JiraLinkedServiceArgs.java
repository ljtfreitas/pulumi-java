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
 * Jira Service linked service.
 * 
 */
public final class JiraLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final JiraLinkedServiceArgs Empty = new JiraLinkedServiceArgs();

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
     * The IP address or host name of the Jira service. (e.g. jira.example.com)
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
     * The password corresponding to the user name that you provided in the username field.
     * 
     */
    @InputImport(name="password")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The TCP port that the Jira server uses to listen for client connections. The default value is 443 if connecting through HTTPS, or 8080 if connecting through HTTP.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Object> port;

    public Input<Object> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * Type of linked service.
     * Expected value is 'Jira'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    @InputImport(name="useEncryptedEndpoints")
    private final @Nullable Input<Object> useEncryptedEndpoints;

    public Input<Object> getUseEncryptedEndpoints() {
        return this.useEncryptedEndpoints == null ? Input.empty() : this.useEncryptedEndpoints;
    }

    /**
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    @InputImport(name="useHostVerification")
    private final @Nullable Input<Object> useHostVerification;

    public Input<Object> getUseHostVerification() {
        return this.useHostVerification == null ? Input.empty() : this.useHostVerification;
    }

    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    @InputImport(name="usePeerVerification")
    private final @Nullable Input<Object> usePeerVerification;

    public Input<Object> getUsePeerVerification() {
        return this.usePeerVerification == null ? Input.empty() : this.usePeerVerification;
    }

    /**
     * The user name that you use to access Jira Service.
     * 
     */
    @InputImport(name="username", required=true)
    private final Input<Object> username;

    public Input<Object> getUsername() {
        return this.username;
    }

    public JiraLinkedServiceArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        Input<Object> host,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        @Nullable Input<Object> port,
        Input<String> type,
        @Nullable Input<Object> useEncryptedEndpoints,
        @Nullable Input<Object> useHostVerification,
        @Nullable Input<Object> usePeerVerification,
        Input<Object> username) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.parameters = parameters;
        this.password = password;
        this.port = port;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private JiraLinkedServiceArgs() {
        this.annotations = Input.empty();
        this.connectVia = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.host = Input.empty();
        this.parameters = Input.empty();
        this.password = Input.empty();
        this.port = Input.empty();
        this.type = Input.empty();
        this.useEncryptedEndpoints = Input.empty();
        this.useHostVerification = Input.empty();
        this.usePeerVerification = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JiraLinkedServiceArgs defaults) {
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
        private @Nullable Input<Object> port;
        private Input<String> type;
        private @Nullable Input<Object> useEncryptedEndpoints;
        private @Nullable Input<Object> useHostVerification;
        private @Nullable Input<Object> usePeerVerification;
        private Input<Object> username;

        public Builder() {
    	      // Empty
        }

        public Builder(JiraLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
    	      this.username = defaults.username;
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

        public Builder setPort(@Nullable Input<Object> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Object port) {
            this.port = Input.ofNullable(port);
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

        public Builder setUseEncryptedEndpoints(@Nullable Input<Object> useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        public Builder setUseEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = Input.ofNullable(useEncryptedEndpoints);
            return this;
        }

        public Builder setUseHostVerification(@Nullable Input<Object> useHostVerification) {
            this.useHostVerification = useHostVerification;
            return this;
        }

        public Builder setUseHostVerification(@Nullable Object useHostVerification) {
            this.useHostVerification = Input.ofNullable(useHostVerification);
            return this;
        }

        public Builder setUsePeerVerification(@Nullable Input<Object> usePeerVerification) {
            this.usePeerVerification = usePeerVerification;
            return this;
        }

        public Builder setUsePeerVerification(@Nullable Object usePeerVerification) {
            this.usePeerVerification = Input.ofNullable(usePeerVerification);
            return this;
        }

        public Builder setUsername(Input<Object> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setUsername(Object username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }

        public JiraLinkedServiceArgs build() {
            return new JiraLinkedServiceArgs(annotations, connectVia, description, encryptedCredential, host, parameters, password, port, type, useEncryptedEndpoints, useHostVerification, usePeerVerification, username);
        }
    }
}
