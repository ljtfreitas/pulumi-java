// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
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
public final class Office365LinkedServiceResponse {
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
     * Azure tenant ID to which the Office 365 account belongs. Type: string (or Expression with resultType string).
     * 
     */
    private final Object office365TenantId;
    /**
     * Parameters for linked service.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * Specify the application's client ID. Type: string (or Expression with resultType string).
     * 
     */
    private final Object servicePrincipalId;
    /**
     * Specify the application's key.
     * 
     */
    private final Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
    /**
     * Specify the tenant information under which your Azure AD web application resides. Type: string (or Expression with resultType string).
     * 
     */
    private final Object servicePrincipalTenantId;
    /**
     * Type of linked service.
     * Expected value is 'Office365'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"annotations","connectVia","description","encryptedCredential","office365TenantId","parameters","servicePrincipalId","servicePrincipalKey","servicePrincipalTenantId","type"})
    private Office365LinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        Object office365TenantId,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        Object servicePrincipalId,
        Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        Object servicePrincipalTenantId,
        String type) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.office365TenantId = Objects.requireNonNull(office365TenantId);
        this.parameters = parameters;
        this.servicePrincipalId = Objects.requireNonNull(servicePrincipalId);
        this.servicePrincipalKey = Objects.requireNonNull(servicePrincipalKey);
        this.servicePrincipalTenantId = Objects.requireNonNull(servicePrincipalTenantId);
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
     * Azure tenant ID to which the Office 365 account belongs. Type: string (or Expression with resultType string).
     * 
     */
    public Object getOffice365TenantId() {
        return this.office365TenantId;
    }
    /**
     * Parameters for linked service.
     * 
     */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Specify the application's client ID. Type: string (or Expression with resultType string).
     * 
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }
    /**
     * Specify the application's key.
     * 
     */
    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }
    /**
     * Specify the tenant information under which your Azure AD web application resides. Type: string (or Expression with resultType string).
     * 
     */
    public Object getServicePrincipalTenantId() {
        return this.servicePrincipalTenantId;
    }
    /**
     * Type of linked service.
     * Expected value is 'Office365'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Office365LinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private Object office365TenantId;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private Object servicePrincipalId;
        private Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private Object servicePrincipalTenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(Office365LinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.office365TenantId = defaults.office365TenantId;
    	      this.parameters = defaults.parameters;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.servicePrincipalTenantId = defaults.servicePrincipalTenantId;
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

        public Builder setOffice365TenantId(Object office365TenantId) {
            this.office365TenantId = Objects.requireNonNull(office365TenantId);
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

        public Builder setServicePrincipalTenantId(Object servicePrincipalTenantId) {
            this.servicePrincipalTenantId = Objects.requireNonNull(servicePrincipalTenantId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Office365LinkedServiceResponse build() {
            return new Office365LinkedServiceResponse(annotations, connectVia, description, encryptedCredential, office365TenantId, parameters, servicePrincipalId, servicePrincipalKey, servicePrincipalTenantId, type);
        }
    }
}
