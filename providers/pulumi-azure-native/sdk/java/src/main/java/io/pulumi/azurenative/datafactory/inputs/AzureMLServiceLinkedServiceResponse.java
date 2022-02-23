// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure ML Service linked service.
 * 
 */
public final class AzureMLServiceLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureMLServiceLinkedServiceResponse Empty = new AzureMLServiceLinkedServiceResponse();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @InputImport(name="annotations")
        private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
        private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @InputImport(name="description")
        private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="encryptedCredential")
        private final @Nullable Object encryptedCredential;

    public Optional<Object> getEncryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Azure ML Service workspace name. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="mlWorkspaceName", required=true)
        private final Object mlWorkspaceName;

    public Object getMlWorkspaceName() {
        return this.mlWorkspaceName;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
        private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Azure ML Service workspace resource group name. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Object resourceGroupName;

    public Object getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The ID of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="servicePrincipalId")
        private final @Nullable Object servicePrincipalId;

    public Optional<Object> getServicePrincipalId() {
        return this.servicePrincipalId == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The key of the service principal used to authenticate against the endpoint of a published Azure ML Service pipeline.
     * 
     */
    @InputImport(name="servicePrincipalKey")
        private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getServicePrincipalKey() {
        return this.servicePrincipalKey == null ? null : this.servicePrincipalKey;
    }

    /**
     * Azure ML Service workspace subscription ID. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="subscriptionId", required=true)
        private final Object subscriptionId;

    public Object getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="tenant")
        private final @Nullable Object tenant;

    public Optional<Object> getTenant() {
        return this.tenant == null ? Optional.empty() : Optional.ofNullable(this.tenant);
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureMLService'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public AzureMLServiceLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        Object mlWorkspaceName,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        Object resourceGroupName,
        @Nullable Object servicePrincipalId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        Object subscriptionId,
        @Nullable Object tenant,
        String type) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.mlWorkspaceName = Objects.requireNonNull(mlWorkspaceName, "expected parameter 'mlWorkspaceName' to be non-null");
        this.parameters = parameters;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureMLServiceLinkedServiceResponse() {
        this.annotations = List.of();
        this.connectVia = null;
        this.description = null;
        this.encryptedCredential = null;
        this.mlWorkspaceName = null;
        this.parameters = Map.of();
        this.resourceGroupName = null;
        this.servicePrincipalId = null;
        this.servicePrincipalKey = null;
        this.subscriptionId = null;
        this.tenant = null;
        this.type = null;
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

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
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

        public Builder setMlWorkspaceName(Object mlWorkspaceName) {
            this.mlWorkspaceName = Objects.requireNonNull(mlWorkspaceName);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setResourceGroupName(Object resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder setServicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder setSubscriptionId(Object subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder setTenant(@Nullable Object tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AzureMLServiceLinkedServiceResponse build() {
            return new AzureMLServiceLinkedServiceResponse(annotations, connectVia, description, encryptedCredential, mlWorkspaceName, parameters, resourceGroupName, servicePrincipalId, servicePrincipalKey, subscriptionId, tenant, type);
        }
    }
}
