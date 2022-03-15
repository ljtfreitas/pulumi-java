// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeyVaultPropertiesResponse {
    /**
     * For future use - The client id of the identity which will be used to access key vault.
     * 
     */
    private final @Nullable String identityClientId;
    /**
     * Key vault uri to access the encryption key.
     * 
     */
    private final String keyIdentifier;
    /**
     * The ArmId of the keyVault where the customer owned encryption key is present.
     * 
     */
    private final String keyVaultArmId;

    @CustomType.Constructor
    private KeyVaultPropertiesResponse(
        @CustomType.Parameter("identityClientId") @Nullable String identityClientId,
        @CustomType.Parameter("keyIdentifier") String keyIdentifier,
        @CustomType.Parameter("keyVaultArmId") String keyVaultArmId) {
        this.identityClientId = identityClientId;
        this.keyIdentifier = keyIdentifier;
        this.keyVaultArmId = keyVaultArmId;
    }

    /**
     * For future use - The client id of the identity which will be used to access key vault.
     * 
    */
    public Optional<String> getIdentityClientId() {
        return Optional.ofNullable(this.identityClientId);
    }
    /**
     * Key vault uri to access the encryption key.
     * 
    */
    public String getKeyIdentifier() {
        return this.keyIdentifier;
    }
    /**
     * The ArmId of the keyVault where the customer owned encryption key is present.
     * 
    */
    public String getKeyVaultArmId() {
        return this.keyVaultArmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String identityClientId;
        private String keyIdentifier;
        private String keyVaultArmId;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityClientId = defaults.identityClientId;
    	      this.keyIdentifier = defaults.keyIdentifier;
    	      this.keyVaultArmId = defaults.keyVaultArmId;
        }

        public Builder identityClientId(@Nullable String identityClientId) {
            this.identityClientId = identityClientId;
            return this;
        }

        public Builder keyIdentifier(String keyIdentifier) {
            this.keyIdentifier = Objects.requireNonNull(keyIdentifier);
            return this;
        }

        public Builder keyVaultArmId(String keyVaultArmId) {
            this.keyVaultArmId = Objects.requireNonNull(keyVaultArmId);
            return this;
        }
        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(identityClientId, keyIdentifier, keyVaultArmId);
        }
    }
}
