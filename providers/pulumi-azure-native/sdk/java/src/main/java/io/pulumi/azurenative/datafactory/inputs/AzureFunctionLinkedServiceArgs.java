// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
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
 * Azure Function linked service.
 * 
 */
public final class AzureFunctionLinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFunctionLinkedServiceArgs Empty = new AzureFunctionLinkedServiceArgs();

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
     * Type of authentication (Required to specify MSI) used to connect to AzureFunction. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="authentication")
        private final @Nullable Input<Object> authentication;

    public Input<Object> getAuthentication() {
        return this.authentication == null ? Input.empty() : this.authentication;
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
     * The credential reference containing authentication information.
     * 
     */
    @InputImport(name="credential")
        private final @Nullable Input<CredentialReferenceArgs> credential;

    public Input<CredentialReferenceArgs> getCredential() {
        return this.credential == null ? Input.empty() : this.credential;
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
     * The endpoint of the Azure Function App. URL will be in the format https://<accountName>.azurewebsites.net.
     * 
     */
    @InputImport(name="functionAppUrl", required=true)
        private final Input<Object> functionAppUrl;

    public Input<Object> getFunctionAppUrl() {
        return this.functionAppUrl;
    }

    /**
     * Function or Host key for Azure Function App.
     * 
     */
    @InputImport(name="functionKey")
        private final @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> functionKey;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getFunctionKey() {
        return this.functionKey == null ? Input.empty() : this.functionKey;
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
     * Allowed token audiences for azure function.
     * 
     */
    @InputImport(name="resourceId")
        private final @Nullable Input<Object> resourceId;

    public Input<Object> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureFunction'.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AzureFunctionLinkedServiceArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<Object> authentication,
        @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Input<CredentialReferenceArgs> credential,
        @Nullable Input<String> description,
        @Nullable Input<Object> encryptedCredential,
        Input<Object> functionAppUrl,
        @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> functionKey,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Object> resourceId,
        Input<String> type) {
        this.annotations = annotations;
        this.authentication = authentication;
        this.connectVia = connectVia;
        this.credential = credential;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.functionAppUrl = Objects.requireNonNull(functionAppUrl, "expected parameter 'functionAppUrl' to be non-null");
        this.functionKey = functionKey;
        this.parameters = parameters;
        this.resourceId = resourceId;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureFunctionLinkedServiceArgs() {
        this.annotations = Input.empty();
        this.authentication = Input.empty();
        this.connectVia = Input.empty();
        this.credential = Input.empty();
        this.description = Input.empty();
        this.encryptedCredential = Input.empty();
        this.functionAppUrl = Input.empty();
        this.functionKey = Input.empty();
        this.parameters = Input.empty();
        this.resourceId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFunctionLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<Object> authentication;
        private @Nullable Input<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Input<CredentialReferenceArgs> credential;
        private @Nullable Input<String> description;
        private @Nullable Input<Object> encryptedCredential;
        private Input<Object> functionAppUrl;
        private @Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> functionKey;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Object> resourceId;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFunctionLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authentication = defaults.authentication;
    	      this.connectVia = defaults.connectVia;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.functionAppUrl = defaults.functionAppUrl;
    	      this.functionKey = defaults.functionKey;
    	      this.parameters = defaults.parameters;
    	      this.resourceId = defaults.resourceId;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setAuthentication(@Nullable Input<Object> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setAuthentication(@Nullable Object authentication) {
            this.authentication = Input.ofNullable(authentication);
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

        public Builder setCredential(@Nullable Input<CredentialReferenceArgs> credential) {
            this.credential = credential;
            return this;
        }

        public Builder setCredential(@Nullable CredentialReferenceArgs credential) {
            this.credential = Input.ofNullable(credential);
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

        public Builder setFunctionAppUrl(Input<Object> functionAppUrl) {
            this.functionAppUrl = Objects.requireNonNull(functionAppUrl);
            return this;
        }

        public Builder setFunctionAppUrl(Object functionAppUrl) {
            this.functionAppUrl = Input.of(Objects.requireNonNull(functionAppUrl));
            return this;
        }

        public Builder setFunctionKey(@Nullable Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> functionKey) {
            this.functionKey = functionKey;
            return this;
        }

        public Builder setFunctionKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> functionKey) {
            this.functionKey = Input.ofNullable(functionKey);
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

        public Builder setResourceId(@Nullable Input<Object> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable Object resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
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
        public AzureFunctionLinkedServiceArgs build() {
            return new AzureFunctionLinkedServiceArgs(annotations, authentication, connectVia, credential, description, encryptedCredential, functionAppUrl, functionKey, parameters, resourceId, type);
        }
    }
}
