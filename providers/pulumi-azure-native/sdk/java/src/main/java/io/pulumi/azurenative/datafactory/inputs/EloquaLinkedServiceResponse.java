// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Eloqua server linked service.
 * 
 */
public final class EloquaLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final EloquaLinkedServiceResponse Empty = new EloquaLinkedServiceResponse();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Object encryptedCredential;

    public Optional<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * The endpoint of the Eloqua server. (i.e. eloqua.example.com)
     * 
     */
    @Import(name="endpoint", required=true)
      private final Object endpoint;

    public Object getEndpoint() {
        return this.endpoint;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * The password corresponding to the user name.
     * 
     */
    @Import(name="password")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password == null ? null : this.password;
    }

    /**
     * Type of linked service.
     * Expected value is 'Eloqua'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    @Import(name="useEncryptedEndpoints")
      private final @Nullable Object useEncryptedEndpoints;

    public Optional<Object> getUseEncryptedEndpoints() {
        return this.useEncryptedEndpoints == null ? Optional.empty() : Optional.ofNullable(this.useEncryptedEndpoints);
    }

    /**
     * Specifies whether to require the host name in the server's certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="useHostVerification")
      private final @Nullable Object useHostVerification;

    public Optional<Object> getUseHostVerification() {
        return this.useHostVerification == null ? Optional.empty() : Optional.ofNullable(this.useHostVerification);
    }

    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="usePeerVerification")
      private final @Nullable Object usePeerVerification;

    public Optional<Object> getUsePeerVerification() {
        return this.usePeerVerification == null ? Optional.empty() : Optional.ofNullable(this.usePeerVerification);
    }

    /**
     * The site name and user name of your Eloqua account in the form: sitename/username. (i.e. Eloqua/Alice)
     * 
     */
    @Import(name="username", required=true)
      private final Object username;

    public Object getUsername() {
        return this.username;
    }

    public EloquaLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        Object endpoint,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        String type,
        @Nullable Object useEncryptedEndpoints,
        @Nullable Object useHostVerification,
        @Nullable Object usePeerVerification,
        Object username) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.parameters = parameters;
        this.password = password;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private EloquaLinkedServiceResponse() {
        this.annotations = List.of();
        this.connectVia = null;
        this.description = null;
        this.encryptedCredential = null;
        this.endpoint = null;
        this.parameters = Map.of();
        this.password = null;
        this.type = null;
        this.useEncryptedEndpoints = null;
        this.useHostVerification = null;
        this.usePeerVerification = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EloquaLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private Object endpoint;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private String type;
        private @Nullable Object useEncryptedEndpoints;
        private @Nullable Object useHostVerification;
        private @Nullable Object usePeerVerification;
        private Object username;

        public Builder() {
    	      // Empty
        }

        public Builder(EloquaLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.endpoint = defaults.endpoint;
    	      this.parameters = defaults.parameters;
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
    	      this.username = defaults.username;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder endpoint(Object endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = password;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder useEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        public Builder useHostVerification(@Nullable Object useHostVerification) {
            this.useHostVerification = useHostVerification;
            return this;
        }

        public Builder usePeerVerification(@Nullable Object usePeerVerification) {
            this.usePeerVerification = usePeerVerification;
            return this;
        }

        public Builder username(Object username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public EloquaLinkedServiceResponse build() {
            return new EloquaLinkedServiceResponse(annotations, connectVia, description, encryptedCredential, endpoint, parameters, password, type, useEncryptedEndpoints, useHostVerification, usePeerVerification, username);
        }
    }
}
