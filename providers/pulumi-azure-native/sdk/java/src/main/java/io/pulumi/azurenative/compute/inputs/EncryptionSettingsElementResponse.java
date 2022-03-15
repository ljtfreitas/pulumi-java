// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.KeyVaultAndKeyReferenceResponse;
import io.pulumi.azurenative.compute.inputs.KeyVaultAndSecretReferenceResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encryption settings for one disk volume.
 * 
 */
public final class EncryptionSettingsElementResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionSettingsElementResponse Empty = new EncryptionSettingsElementResponse();

    /**
     * Key Vault Secret Url and vault id of the disk encryption key
     * 
     */
    @Import(name="diskEncryptionKey")
      private final @Nullable KeyVaultAndSecretReferenceResponse diskEncryptionKey;

    public Optional<KeyVaultAndSecretReferenceResponse> getDiskEncryptionKey() {
        return this.diskEncryptionKey == null ? Optional.empty() : Optional.ofNullable(this.diskEncryptionKey);
    }

    /**
     * Key Vault Key Url and vault id of the key encryption key. KeyEncryptionKey is optional and when provided is used to unwrap the disk encryption key.
     * 
     */
    @Import(name="keyEncryptionKey")
      private final @Nullable KeyVaultAndKeyReferenceResponse keyEncryptionKey;

    public Optional<KeyVaultAndKeyReferenceResponse> getKeyEncryptionKey() {
        return this.keyEncryptionKey == null ? Optional.empty() : Optional.ofNullable(this.keyEncryptionKey);
    }

    public EncryptionSettingsElementResponse(
        @Nullable KeyVaultAndSecretReferenceResponse diskEncryptionKey,
        @Nullable KeyVaultAndKeyReferenceResponse keyEncryptionKey) {
        this.diskEncryptionKey = diskEncryptionKey;
        this.keyEncryptionKey = keyEncryptionKey;
    }

    private EncryptionSettingsElementResponse() {
        this.diskEncryptionKey = null;
        this.keyEncryptionKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionSettingsElementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeyVaultAndSecretReferenceResponse diskEncryptionKey;
        private @Nullable KeyVaultAndKeyReferenceResponse keyEncryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionSettingsElementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
        }

        public Builder diskEncryptionKey(@Nullable KeyVaultAndSecretReferenceResponse diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        public Builder keyEncryptionKey(@Nullable KeyVaultAndKeyReferenceResponse keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }
        public EncryptionSettingsElementResponse build() {
            return new EncryptionSettingsElementResponse(diskEncryptionKey, keyEncryptionKey);
        }
    }
}
