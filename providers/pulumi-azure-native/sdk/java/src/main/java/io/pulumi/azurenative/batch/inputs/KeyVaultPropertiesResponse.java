// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * KeyVault configuration when using an encryption KeySource of Microsoft.KeyVault.
 * 
 */
public final class KeyVaultPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultPropertiesResponse Empty = new KeyVaultPropertiesResponse();

    /**
     * Full path to the versioned secret. Example https://mykeyvault.vault.azure.net/keys/testkey/6e34a81fef704045975661e297a4c053. To be usable the following prerequisites must be met:
     * 
     *  The Batch Account has a System Assigned identity
     *  The account identity has been granted Key/Get, Key/Unwrap and Key/Wrap permissions
     *  The KeyVault has soft-delete and purge protection enabled
     * 
     */
    @Import(name="keyIdentifier")
      private final @Nullable String keyIdentifier;

    public Optional<String> getKeyIdentifier() {
        return this.keyIdentifier == null ? Optional.empty() : Optional.ofNullable(this.keyIdentifier);
    }

    public KeyVaultPropertiesResponse(@Nullable String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
    }

    private KeyVaultPropertiesResponse() {
        this.keyIdentifier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyIdentifier = defaults.keyIdentifier;
        }

        public Builder keyIdentifier(@Nullable String keyIdentifier) {
            this.keyIdentifier = keyIdentifier;
            return this;
        }
        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(keyIdentifier);
        }
    }
}
