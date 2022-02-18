// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.KeyVaultKeyResponseAttributes;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The key vault key.
 * 
 */
public final class KeyVaultKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultKeyResponse Empty = new KeyVaultKeyResponse();

    /**
     * The key attributes.
     * 
     */
    @InputImport(name="attributes")
    private final @Nullable KeyVaultKeyResponseAttributes attributes;

    public Optional<KeyVaultKeyResponseAttributes> getAttributes() {
        return this.attributes == null ? Optional.empty() : Optional.ofNullable(this.attributes);
    }

    /**
     * The key id.
     * 
     */
    @InputImport(name="kid")
    private final @Nullable String kid;

    public Optional<String> getKid() {
        return this.kid == null ? Optional.empty() : Optional.ofNullable(this.kid);
    }

    public KeyVaultKeyResponse(
        @Nullable KeyVaultKeyResponseAttributes attributes,
        @Nullable String kid) {
        this.attributes = attributes;
        this.kid = kid;
    }

    private KeyVaultKeyResponse() {
        this.attributes = null;
        this.kid = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeyVaultKeyResponseAttributes attributes;
        private @Nullable String kid;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.kid = defaults.kid;
        }

        public Builder setAttributes(@Nullable KeyVaultKeyResponseAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setKid(@Nullable String kid) {
            this.kid = kid;
            return this;
        }

        public KeyVaultKeyResponse build() {
            return new KeyVaultKeyResponse(attributes, kid);
        }
    }
}
