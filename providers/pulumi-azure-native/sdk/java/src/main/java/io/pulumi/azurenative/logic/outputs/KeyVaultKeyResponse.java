// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.KeyVaultKeyResponseAttributes;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeyVaultKeyResponse {
    /**
     * The key attributes.
     * 
     */
    private final @Nullable KeyVaultKeyResponseAttributes attributes;
    /**
     * The key id.
     * 
     */
    private final @Nullable String kid;

    @CustomType.Constructor
    private KeyVaultKeyResponse(
        @CustomType.Parameter("attributes") @Nullable KeyVaultKeyResponseAttributes attributes,
        @CustomType.Parameter("kid") @Nullable String kid) {
        this.attributes = attributes;
        this.kid = kid;
    }

    /**
     * The key attributes.
     * 
    */
    public Optional<KeyVaultKeyResponseAttributes> getAttributes() {
        return Optional.ofNullable(this.attributes);
    }
    /**
     * The key id.
     * 
    */
    public Optional<String> getKid() {
        return Optional.ofNullable(this.kid);
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

        public Builder attributes(@Nullable KeyVaultKeyResponseAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder kid(@Nullable String kid) {
            this.kid = kid;
            return this;
        }
        public KeyVaultKeyResponse build() {
            return new KeyVaultKeyResponse(attributes, kid);
        }
    }
}
