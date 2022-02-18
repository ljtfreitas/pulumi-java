// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.CredentialReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureFunctionLinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * Type of authentication (Required to specify MSI) used to connect to AzureFunction. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object authentication;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    /**
     * The credential reference containing authentication information.
     * 
     */
    private final @Nullable CredentialReferenceResponse credential;
    /**
     * Linked service description.
     * 
     */
    private final @Nullable String description;
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encryptedCredential;
    /**
     * The endpoint of the Azure Function App. URL will be in the format https://<accountName>.azurewebsites.net.
     * 
     */
    private final Object functionAppUrl;
    /**
     * Function or Host key for Azure Function App.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> functionKey;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Allowed token audiences for azure function.
     * 
     */
    private final @Nullable Object resourceId;
    /**
     * Type of linked service.
     * Expected value is 'AzureFunction'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"annotations","authentication","connectVia","credential","description","encryptedCredential","functionAppUrl","functionKey","parameters","resourceId","type"})
    private AzureFunctionLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable Object authentication,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable CredentialReferenceResponse credential,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        Object functionAppUrl,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> functionKey,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object resourceId,
        String type) {
        this.annotations = annotations;
        this.authentication = authentication;
        this.connectVia = connectVia;
        this.credential = credential;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.functionAppUrl = Objects.requireNonNull(functionAppUrl);
        this.functionKey = functionKey;
        this.parameters = parameters;
        this.resourceId = resourceId;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * Type of authentication (Required to specify MSI) used to connect to AzureFunction. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getAuthentication() {
        return Optional.ofNullable(this.authentication);
    }
    /**
     * The integration runtime reference.
     * 
     */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    /**
     * The credential reference containing authentication information.
     * 
     */
    public Optional<CredentialReferenceResponse> getCredential() {
        return Optional.ofNullable(this.credential);
    }
    /**
     * Linked service description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    /**
     * The endpoint of the Azure Function App. URL will be in the format https://<accountName>.azurewebsites.net.
     * 
     */
    public Object getFunctionAppUrl() {
        return this.functionAppUrl;
    }
    /**
     * Function or Host key for Azure Function App.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getFunctionKey() {
        return Optional.ofNullable(this.functionKey);
    }
    /**
     * Parameters for linked service.
     * 
     */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Allowed token audiences for azure function.
     * 
     */
    public Optional<Object> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * Type of linked service.
     * Expected value is 'AzureFunction'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFunctionLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object authentication;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private Object functionAppUrl;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> functionKey;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object resourceId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFunctionLinkedServiceResponse defaults) {
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

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAuthentication(@Nullable Object authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setCredential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
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

        public Builder setFunctionAppUrl(Object functionAppUrl) {
            this.functionAppUrl = Objects.requireNonNull(functionAppUrl);
            return this;
        }

        public Builder setFunctionKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> functionKey) {
            this.functionKey = functionKey;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setResourceId(@Nullable Object resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AzureFunctionLinkedServiceResponse build() {
            return new AzureFunctionLinkedServiceResponse(annotations, authentication, connectVia, credential, description, encryptedCredential, functionAppUrl, functionKey, parameters, resourceId, type);
        }
    }
}
