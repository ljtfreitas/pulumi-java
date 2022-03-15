// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.azurenative.databox.outputs.IdentityPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeyEncryptionKeyResponse {
    /**
     * Managed identity properties used for key encryption.
     * 
     */
    private final @Nullable IdentityPropertiesResponse identityProperties;
    /**
     * Type of encryption key used for key encryption.
     * 
     */
    private final String kekType;
    /**
     * Key encryption key. It is required in case of Customer managed KekType.
     * 
     */
    private final @Nullable String kekUrl;
    /**
     * Kek vault resource id. It is required in case of Customer managed KekType.
     * 
     */
    private final @Nullable String kekVaultResourceID;

    @CustomType.Constructor
    private KeyEncryptionKeyResponse(
        @CustomType.Parameter("identityProperties") @Nullable IdentityPropertiesResponse identityProperties,
        @CustomType.Parameter("kekType") String kekType,
        @CustomType.Parameter("kekUrl") @Nullable String kekUrl,
        @CustomType.Parameter("kekVaultResourceID") @Nullable String kekVaultResourceID) {
        this.identityProperties = identityProperties;
        this.kekType = kekType;
        this.kekUrl = kekUrl;
        this.kekVaultResourceID = kekVaultResourceID;
    }

    /**
     * Managed identity properties used for key encryption.
     * 
    */
    public Optional<IdentityPropertiesResponse> getIdentityProperties() {
        return Optional.ofNullable(this.identityProperties);
    }
    /**
     * Type of encryption key used for key encryption.
     * 
    */
    public String getKekType() {
        return this.kekType;
    }
    /**
     * Key encryption key. It is required in case of Customer managed KekType.
     * 
    */
    public Optional<String> getKekUrl() {
        return Optional.ofNullable(this.kekUrl);
    }
    /**
     * Kek vault resource id. It is required in case of Customer managed KekType.
     * 
    */
    public Optional<String> getKekVaultResourceID() {
        return Optional.ofNullable(this.kekVaultResourceID);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyEncryptionKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IdentityPropertiesResponse identityProperties;
        private String kekType;
        private @Nullable String kekUrl;
        private @Nullable String kekVaultResourceID;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyEncryptionKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityProperties = defaults.identityProperties;
    	      this.kekType = defaults.kekType;
    	      this.kekUrl = defaults.kekUrl;
    	      this.kekVaultResourceID = defaults.kekVaultResourceID;
        }

        public Builder identityProperties(@Nullable IdentityPropertiesResponse identityProperties) {
            this.identityProperties = identityProperties;
            return this;
        }

        public Builder kekType(String kekType) {
            this.kekType = Objects.requireNonNull(kekType);
            return this;
        }

        public Builder kekUrl(@Nullable String kekUrl) {
            this.kekUrl = kekUrl;
            return this;
        }

        public Builder kekVaultResourceID(@Nullable String kekVaultResourceID) {
            this.kekVaultResourceID = kekVaultResourceID;
            return this;
        }
        public KeyEncryptionKeyResponse build() {
            return new KeyEncryptionKeyResponse(identityProperties, kekType, kekUrl, kekVaultResourceID);
        }
    }
}
