// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.azurenative.apimanagement.outputs.KeyVaultLastAccessStatusContractPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeyVaultContractPropertiesResponse {
    /**
     * SystemAssignedIdentity or UserAssignedIdentity Client Id which will be used to access key vault secret.
     * 
     */
    private final @Nullable String identityClientId;
    /**
     * Last time sync and refresh status of secret from key vault.
     * 
     */
    private final @Nullable KeyVaultLastAccessStatusContractPropertiesResponse lastStatus;
    /**
     * Key vault secret identifier for fetching secret. Providing a versioned secret will prevent auto-refresh. This requires Api Management service to be configured with aka.ms/apimmsi
     * 
     */
    private final @Nullable String secretIdentifier;

    @CustomType.Constructor
    private KeyVaultContractPropertiesResponse(
        @CustomType.Parameter("identityClientId") @Nullable String identityClientId,
        @CustomType.Parameter("lastStatus") @Nullable KeyVaultLastAccessStatusContractPropertiesResponse lastStatus,
        @CustomType.Parameter("secretIdentifier") @Nullable String secretIdentifier) {
        this.identityClientId = identityClientId;
        this.lastStatus = lastStatus;
        this.secretIdentifier = secretIdentifier;
    }

    /**
     * SystemAssignedIdentity or UserAssignedIdentity Client Id which will be used to access key vault secret.
     * 
    */
    public Optional<String> getIdentityClientId() {
        return Optional.ofNullable(this.identityClientId);
    }
    /**
     * Last time sync and refresh status of secret from key vault.
     * 
    */
    public Optional<KeyVaultLastAccessStatusContractPropertiesResponse> getLastStatus() {
        return Optional.ofNullable(this.lastStatus);
    }
    /**
     * Key vault secret identifier for fetching secret. Providing a versioned secret will prevent auto-refresh. This requires Api Management service to be configured with aka.ms/apimmsi
     * 
    */
    public Optional<String> getSecretIdentifier() {
        return Optional.ofNullable(this.secretIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultContractPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String identityClientId;
        private @Nullable KeyVaultLastAccessStatusContractPropertiesResponse lastStatus;
        private @Nullable String secretIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultContractPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityClientId = defaults.identityClientId;
    	      this.lastStatus = defaults.lastStatus;
    	      this.secretIdentifier = defaults.secretIdentifier;
        }

        public Builder identityClientId(@Nullable String identityClientId) {
            this.identityClientId = identityClientId;
            return this;
        }

        public Builder lastStatus(@Nullable KeyVaultLastAccessStatusContractPropertiesResponse lastStatus) {
            this.lastStatus = lastStatus;
            return this;
        }

        public Builder secretIdentifier(@Nullable String secretIdentifier) {
            this.secretIdentifier = secretIdentifier;
            return this;
        }
        public KeyVaultContractPropertiesResponse build() {
            return new KeyVaultContractPropertiesResponse(identityClientId, lastStatus, secretIdentifier);
        }
    }
}
