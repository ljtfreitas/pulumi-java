// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.azurenative.videoanalyzer.outputs.KeyVaultPropertiesResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.ResourceIdentityResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccountEncryptionResponse {
    /**
     * The Key Vault identity.
     * 
     */
    private final @Nullable ResourceIdentityResponse identity;
    /**
     * The properties of the key used to encrypt the account.
     * 
     */
    private final @Nullable KeyVaultPropertiesResponse keyVaultProperties;
    /**
     * The current status of the Key Vault mapping.
     * 
     */
    private final String status;
    /**
     * The type of key used to encrypt the Account Key.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"identity","keyVaultProperties","status","type"})
    private AccountEncryptionResponse(
        @Nullable ResourceIdentityResponse identity,
        @Nullable KeyVaultPropertiesResponse keyVaultProperties,
        String status,
        String type) {
        this.identity = identity;
        this.keyVaultProperties = keyVaultProperties;
        this.status = Objects.requireNonNull(status);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The Key Vault identity.
     * 
     */
    public Optional<ResourceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The properties of the key used to encrypt the account.
     * 
     */
    public Optional<KeyVaultPropertiesResponse> getKeyVaultProperties() {
        return Optional.ofNullable(this.keyVaultProperties);
    }
    /**
     * The current status of the Key Vault mapping.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * The type of key used to encrypt the Account Key.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceIdentityResponse identity;
        private @Nullable KeyVaultPropertiesResponse keyVaultProperties;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setIdentity(@Nullable ResourceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setKeyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AccountEncryptionResponse build() {
            return new AccountEncryptionResponse(identity, keyVaultProperties, status, type);
        }
    }
}
