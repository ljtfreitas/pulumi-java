// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.CmkKekIdentityResponse;
import io.pulumi.azurenative.recoveryservices.outputs.CmkKeyVaultPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VaultPropertiesResponseEncryption {
    /**
     * Enabling/Disabling the Double Encryption state
     * 
     */
    private final @Nullable String infrastructureEncryption;
    /**
     * The details of the identity used for CMK
     * 
     */
    private final @Nullable CmkKekIdentityResponse kekIdentity;
    /**
     * The properties of the Key Vault which hosts CMK
     * 
     */
    private final @Nullable CmkKeyVaultPropertiesResponse keyVaultProperties;

    @CustomType.Constructor
    private VaultPropertiesResponseEncryption(
        @CustomType.Parameter("infrastructureEncryption") @Nullable String infrastructureEncryption,
        @CustomType.Parameter("kekIdentity") @Nullable CmkKekIdentityResponse kekIdentity,
        @CustomType.Parameter("keyVaultProperties") @Nullable CmkKeyVaultPropertiesResponse keyVaultProperties) {
        this.infrastructureEncryption = infrastructureEncryption;
        this.kekIdentity = kekIdentity;
        this.keyVaultProperties = keyVaultProperties;
    }

    /**
     * Enabling/Disabling the Double Encryption state
     * 
    */
    public Optional<String> getInfrastructureEncryption() {
        return Optional.ofNullable(this.infrastructureEncryption);
    }
    /**
     * The details of the identity used for CMK
     * 
    */
    public Optional<CmkKekIdentityResponse> getKekIdentity() {
        return Optional.ofNullable(this.kekIdentity);
    }
    /**
     * The properties of the Key Vault which hosts CMK
     * 
    */
    public Optional<CmkKeyVaultPropertiesResponse> getKeyVaultProperties() {
        return Optional.ofNullable(this.keyVaultProperties);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPropertiesResponseEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String infrastructureEncryption;
        private @Nullable CmkKekIdentityResponse kekIdentity;
        private @Nullable CmkKeyVaultPropertiesResponse keyVaultProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPropertiesResponseEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infrastructureEncryption = defaults.infrastructureEncryption;
    	      this.kekIdentity = defaults.kekIdentity;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
        }

        public Builder infrastructureEncryption(@Nullable String infrastructureEncryption) {
            this.infrastructureEncryption = infrastructureEncryption;
            return this;
        }

        public Builder kekIdentity(@Nullable CmkKekIdentityResponse kekIdentity) {
            this.kekIdentity = kekIdentity;
            return this;
        }

        public Builder keyVaultProperties(@Nullable CmkKeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }
        public VaultPropertiesResponseEncryption build() {
            return new VaultPropertiesResponseEncryption(infrastructureEncryption, kekIdentity, keyVaultProperties);
        }
    }
}
