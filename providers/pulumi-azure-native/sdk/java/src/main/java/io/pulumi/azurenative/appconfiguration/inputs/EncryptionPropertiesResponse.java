// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration.inputs;

import io.pulumi.azurenative.appconfiguration.inputs.KeyVaultPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The encryption settings for a configuration store.
 * 
 */
public final class EncryptionPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionPropertiesResponse Empty = new EncryptionPropertiesResponse();

    /**
     * Key vault properties.
     * 
     */
    @InputImport(name="keyVaultProperties")
        private final @Nullable KeyVaultPropertiesResponse keyVaultProperties;

    public Optional<KeyVaultPropertiesResponse> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Optional.empty() : Optional.ofNullable(this.keyVaultProperties);
    }

    public EncryptionPropertiesResponse(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
    }

    private EncryptionPropertiesResponse() {
        this.keyVaultProperties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeyVaultPropertiesResponse keyVaultProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultProperties = defaults.keyVaultProperties;
        }

        public Builder setKeyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }
        public EncryptionPropertiesResponse build() {
            return new EncryptionPropertiesResponse(keyVaultProperties);
        }
    }
}
