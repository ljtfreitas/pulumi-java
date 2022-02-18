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
 * Dynamics AX linked service.
 * 
 */
public final class DynamicsAXLinkedServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final DynamicsAXLinkedServiceResponse Empty = new DynamicsAXLinkedServiceResponse();

    /**
     * Specify the resource you are requesting authorization. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="aadResourceId", required=true)
    private final Object aadResourceId;

    public Object getAadResourceId() {
        return this.aadResourceId;
    }

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
     * Parameters for linked service.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Specify the application's client ID. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="servicePrincipalId", required=true)
    private final Object servicePrincipalId;

    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Specify the application's key. Mark this field as a SecureString to store it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="servicePrincipalKey", required=true)
    private final Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Specify the tenant information (domain name or tenant ID) under which your application resides. Retrieve it by hovering the mouse in the top-right corner of the Azure portal. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="tenant", required=true)
    private final Object tenant;

    public Object getTenant() {
        return this.tenant;
    }

    /**
     * Type of linked service.
     * Expected value is 'DynamicsAX'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
     * 
     */
    @InputImport(name="url", required=true)
    private final Object url;

    public Object getUrl() {
        return this.url;
    }

    public DynamicsAXLinkedServiceResponse(
        Object aadResourceId,
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        Object servicePrincipalId,
        Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        Object tenant,
        String type,
        Object url) {
        this.aadResourceId = Objects.requireNonNull(aadResourceId, "expected parameter 'aadResourceId' to be non-null");
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.servicePrincipalId = Objects.requireNonNull(servicePrincipalId, "expected parameter 'servicePrincipalId' to be non-null");
        this.servicePrincipalKey = Objects.requireNonNull(servicePrincipalKey, "expected parameter 'servicePrincipalKey' to be non-null");
        this.tenant = Objects.requireNonNull(tenant, "expected parameter 'tenant' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private DynamicsAXLinkedServiceResponse() {
        this.aadResourceId = null;
        this.annotations = List.of();
        this.connectVia = null;
        this.description = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.servicePrincipalId = null;
        this.servicePrincipalKey = null;
        this.tenant = null;
        this.type = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicsAXLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object aadResourceId;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private Object servicePrincipalId;
        private Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private Object tenant;
        private String type;
        private Object url;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicsAXLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadResourceId = defaults.aadResourceId;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
        }

        public Builder setAadResourceId(Object aadResourceId) {
            this.aadResourceId = Objects.requireNonNull(aadResourceId);
            return this;
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

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setServicePrincipalId(Object servicePrincipalId) {
            this.servicePrincipalId = Objects.requireNonNull(servicePrincipalId);
            return this;
        }

        public Builder setServicePrincipalKey(Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = Objects.requireNonNull(servicePrincipalKey);
            return this;
        }

        public Builder setTenant(Object tenant) {
            this.tenant = Objects.requireNonNull(tenant);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUrl(Object url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public DynamicsAXLinkedServiceResponse build() {
            return new DynamicsAXLinkedServiceResponse(aadResourceId, annotations, connectVia, description, encryptedCredential, parameters, servicePrincipalId, servicePrincipalKey, tenant, type, url);
        }
    }
}
