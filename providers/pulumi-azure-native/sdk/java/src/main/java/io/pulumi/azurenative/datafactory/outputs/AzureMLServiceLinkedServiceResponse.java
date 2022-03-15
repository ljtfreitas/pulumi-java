// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureMLServiceLinkedServiceResponse {
    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
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
     * Azure ML Service workspace name. Type: string (or Expression with resultType string).
     * 
     */
    private final Object mlWorkspaceName;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Azure ML Service workspace resource group name. Type: string (or Expression with resultType string).
     * 
     */
    private final Object resourceGroupName;
    /**
     * The ID of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object servicePrincipalId;
    /**
     * The key of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
    /**
     * Azure ML Service workspace subscription ID. Type: string (or Expression with resultType string).
     * 
     */
    private final Object subscriptionId;
    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object tenant;
    /**
     * Type of linked service.
     * Expected value is 'AzureMLService'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AzureMLServiceLinkedServiceResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("connectVia") @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptedCredential") @Nullable Object encryptedCredential,
        @CustomType.Parameter("mlWorkspaceName") Object mlWorkspaceName,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("resourceGroupName") Object resourceGroupName,
        @CustomType.Parameter("servicePrincipalId") @Nullable Object servicePrincipalId,
        @CustomType.Parameter("servicePrincipalKey") @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @CustomType.Parameter("subscriptionId") Object subscriptionId,
        @CustomType.Parameter("tenant") @Nullable Object tenant,
        @CustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.mlWorkspaceName = mlWorkspaceName;
        this.parameters = parameters;
        this.resourceGroupName = resourceGroupName;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.subscriptionId = subscriptionId;
        this.tenant = tenant;
        this.type = type;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
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
     * Azure ML Service workspace name. Type: string (or Expression with resultType string).
     * 
    */
    public Object getMlWorkspaceName() {
        return this.mlWorkspaceName;
    }
    /**
     * Parameters for linked service.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Azure ML Service workspace resource group name. Type: string (or Expression with resultType string).
     * 
    */
    public Object getResourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The ID of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getServicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }
    /**
     * The key of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline.
     * 
    */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getServicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }
    /**
     * Azure ML Service workspace subscription ID. Type: string (or Expression with resultType string).
     * 
    */
    public Object getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getTenant() {
        return Optional.ofNullable(this.tenant);
    }
    /**
     * Type of linked service.
     * Expected value is 'AzureMLService'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMLServiceLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private Object mlWorkspaceName;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private Object resourceGroupName;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private Object subscriptionId;
        private @Nullable Object tenant;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMLServiceLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.mlWorkspaceName = defaults.mlWorkspaceName;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
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

        public Builder mlWorkspaceName(Object mlWorkspaceName) {
            this.mlWorkspaceName = Objects.requireNonNull(mlWorkspaceName);
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder resourceGroupName(Object resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder subscriptionId(Object subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder tenant(@Nullable Object tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AzureMLServiceLinkedServiceResponse build() {
            return new AzureMLServiceLinkedServiceResponse(annotations, connectVia, description, encryptedCredential, mlWorkspaceName, parameters, resourceGroupName, servicePrincipalId, servicePrincipalKey, subscriptionId, tenant, type);
        }
    }
}
