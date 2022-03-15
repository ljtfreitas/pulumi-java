// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a resource Id to source Key Vault.
 * 
 */
public final class KeyVaultKeyReferenceResponseSourceVault extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultKeyReferenceResponseSourceVault Empty = new KeyVaultKeyReferenceResponseSourceVault();

    /**
     * Resource Id.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public KeyVaultKeyReferenceResponseSourceVault(@Nullable String id) {
        this.id = id;
    }

    private KeyVaultKeyReferenceResponseSourceVault() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultKeyReferenceResponseSourceVault defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultKeyReferenceResponseSourceVault defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public KeyVaultKeyReferenceResponseSourceVault build() {
            return new KeyVaultKeyReferenceResponseSourceVault(id);
        }
    }
}
