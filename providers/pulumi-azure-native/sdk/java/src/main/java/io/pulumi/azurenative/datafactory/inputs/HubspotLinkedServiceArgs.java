// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HubspotLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final HubspotLinkedServiceArgs Empty = new HubspotLinkedServiceArgs();

    @InputImport(name="accessToken")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getAccessToken() {
        return this.accessToken == null ? Input.empty() : this.accessToken;
    }

    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    @InputImport(name="clientId", required=true)
    private final Input<Object> clientId;

    public Input<Object> getClientId() {
        return this.clientId;
    }

    @InputImport(name="clientSecret")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getClientSecret() {
        return this.clientSecret == null ? Input.empty() : this.clientSecret;
    }

    @InputImport(name="connectVia")
    private final @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;

    public Input<IntegrationRuntimeReferenceArgs> getConnectVia() {
        return this.connectVia == null ? Input.empty() : this.connectVia;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="encryptedCredential")
    private final @Nullable Input<Object> encryptedCredential;

    public Input<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Input.empty() : this.encryptedCredential;
    }

    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    @InputImport(name="refreshToken")
    private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> refreshToken;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getRefreshToken() {
        return this.refreshToken == null ? Input.empty() : this.refreshToken;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    @InputImport(name="useEncryptedEndpoints")
    private final @Nullable Input<Object> useEncryptedEndpoints;

    public Input<Object> getUseEncryptedEndpoints() {
        return this.useEncryptedEndpoints == null ? Input.empty() : this.useEncryptedEndpoints;
    }

    @InputImport(name="useHostVerification")
    private final @Nullable Input<Object> useHostVerification;

    public Input<Object> getUseHostVerification() {
        return this.useHostVerification == null ? Input.empty() : this.useHostVerification;
    }

    @InputImport(name="usePeerVerification")
    private final @Nullable Input<Object> usePeerVerification;

    public Input<Object> getUsePeerVerification() {
        return this.usePeerVerification == null ? Input.empty() : this.usePeerVerification;
    }

    public HubspotLinkedServiceArgs(
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken,
        @Nullable Input<List<Object>> annotations,
        Input<Object> clientId,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> refreshToken,
        Input<String> type,
        @Nullable Input<Object> useEncryptedEndpoints,
        @Nullable Input<Object> useHostVerification,
        @Nullable Input<Object> usePeerVerification) {
        this.accessToken = accessToken;
        this.annotations = annotations;
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.clientSecret = clientSecret;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.refreshToken = refreshToken;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
    }

    private HubspotLinkedServiceArgs() {
        this.accessToken = Input.empty();
        this.annotations = Input.empty();
        this.clientId = Input.empty();
        this.clientSecret = Input.empty();
        this.connectVia = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.parameters = Input.empty();
        this.refreshToken = Input.empty();
        this.type = Input.empty();
        this.useEncryptedEndpoints = Input.empty();
        this.useHostVerification = Input.empty();
        this.usePeerVerification = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubspotLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken;
        private @Nullable Input<List<Object>> annotations;
        private Input<Object> clientId;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> refreshToken;
        private Input<String> type;
        private @Nullable Input<Object> useEncryptedEndpoints;
        private @Nullable Input<Object> useHostVerification;
        private @Nullable Input<Object> usePeerVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(HubspotLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.annotations = defaults.annotations;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.refreshToken = defaults.refreshToken;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
        }

        public Builder setAccessToken(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setAccessToken(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> accessToken) {
            this.accessToken = Input.ofNullable(accessToken);
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

        public Builder setClientId(Input<Object> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientId(Object clientId) {
            this.clientId = Input.of(Objects.requireNonNull(clientId));
            return this;
        }

        public Builder setClientSecret(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setClientSecret(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> clientSecret) {
            this.clientSecret = Input.ofNullable(clientSecret);
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

        public Builder setParameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setRefreshToken(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder setRefreshToken(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> refreshToken) {
            this.refreshToken = Input.ofNullable(refreshToken);
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

        public HubspotLinkedServiceArgs build() {
            return new HubspotLinkedServiceArgs(accessToken, annotations, clientId, clientSecret, connectVia, description, encryptedCredential, parameters, refreshToken, type, useEncryptedEndpoints, useHostVerification, usePeerVerification);
        }
    }
}