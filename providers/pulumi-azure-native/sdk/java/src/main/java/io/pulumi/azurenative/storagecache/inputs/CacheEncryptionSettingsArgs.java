// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.azurenative.storagecache.inputs.KeyVaultKeyReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CacheEncryptionSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CacheEncryptionSettingsArgs Empty = new CacheEncryptionSettingsArgs();

    @InputImport(name="keyEncryptionKey")
    private final @Nullable Input<KeyVaultKeyReferenceArgs> keyEncryptionKey;

    public Input<KeyVaultKeyReferenceArgs> getKeyEncryptionKey() {
        return this.keyEncryptionKey == null ? Input.empty() : this.keyEncryptionKey;
    }

    public CacheEncryptionSettingsArgs(@Nullable Input<KeyVaultKeyReferenceArgs> keyEncryptionKey) {
        this.keyEncryptionKey = keyEncryptionKey;
    }

    private CacheEncryptionSettingsArgs() {
        this.keyEncryptionKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheEncryptionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<KeyVaultKeyReferenceArgs> keyEncryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheEncryptionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
        }

        public Builder setKeyEncryptionKey(@Nullable Input<KeyVaultKeyReferenceArgs> keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }

        public Builder setKeyEncryptionKey(@Nullable KeyVaultKeyReferenceArgs keyEncryptionKey) {
            this.keyEncryptionKey = Input.ofNullable(keyEncryptionKey);
            return this;
        }

        public CacheEncryptionSettingsArgs build() {
            return new CacheEncryptionSettingsArgs(keyEncryptionKey);
        }
    }
}