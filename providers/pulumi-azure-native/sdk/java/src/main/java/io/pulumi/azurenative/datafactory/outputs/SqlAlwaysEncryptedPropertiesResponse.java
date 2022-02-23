// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.CredentialReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SqlAlwaysEncryptedPropertiesResponse {
    /**
     * Sql always encrypted AKV authentication type. Type: string (or Expression with resultType string).
     * 
     */
    private final String alwaysEncryptedAkvAuthType;
    /**
     * The credential reference containing authentication information.
     * 
     */
    private final @Nullable CredentialReferenceResponse credential;
    /**
     * The client ID of the application in Azure Active Directory used for Azure Key Vault authentication. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object servicePrincipalId;
    /**
     * The key of the service principal used to authenticate against Azure Key Vault.
     * 
     */
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;

    @OutputCustomType.Constructor({"alwaysEncryptedAkvAuthType","credential","servicePrincipalId","servicePrincipalKey"})
    private SqlAlwaysEncryptedPropertiesResponse(
        String alwaysEncryptedAkvAuthType,
        @Nullable CredentialReferenceResponse credential,
        @Nullable Object servicePrincipalId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
        this.alwaysEncryptedAkvAuthType = Objects.requireNonNull(alwaysEncryptedAkvAuthType);
        this.credential = credential;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
    }

    /**
     * Sql always encrypted AKV authentication type. Type: string (or Expression with resultType string).
     * 
     */
    public String getAlwaysEncryptedAkvAuthType() {
        return this.alwaysEncryptedAkvAuthType;
    }
    /**
     * The credential reference containing authentication information.
     * 
     */
    public Optional<CredentialReferenceResponse> getCredential() {
        return Optional.ofNullable(this.credential);
    }
    /**
     * The client ID of the application in Azure Active Directory used for Azure Key Vault authentication. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getServicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }
    /**
     * The key of the service principal used to authenticate against Azure Key Vault.
     * 
     */
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getServicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlAlwaysEncryptedPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alwaysEncryptedAkvAuthType;
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlAlwaysEncryptedPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysEncryptedAkvAuthType = defaults.alwaysEncryptedAkvAuthType;
    	      this.credential = defaults.credential;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
        }

        public Builder setAlwaysEncryptedAkvAuthType(String alwaysEncryptedAkvAuthType) {
            this.alwaysEncryptedAkvAuthType = Objects.requireNonNull(alwaysEncryptedAkvAuthType);
            return this;
        }

        public Builder setCredential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
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
        public SqlAlwaysEncryptedPropertiesResponse build() {
            return new SqlAlwaysEncryptedPropertiesResponse(alwaysEncryptedAkvAuthType, credential, servicePrincipalId, servicePrincipalKey);
        }
    }
}
