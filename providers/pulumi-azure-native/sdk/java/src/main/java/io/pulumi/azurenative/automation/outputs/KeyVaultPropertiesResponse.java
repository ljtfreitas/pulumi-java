// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyVaultPropertiesResponse {
    /**
     * The name of key used to encrypt data.
     * 
     */
    private final @Nullable String keyName;
    /**
     * The key version of the key used to encrypt data.
     * 
     */
    private final @Nullable String keyVersion;
    /**
     * The URI of the key vault key used to encrypt data.
     * 
     */
    private final @Nullable String keyvaultUri;

    @OutputCustomType.Constructor({"keyName","keyVersion","keyvaultUri"})
    private KeyVaultPropertiesResponse(
        @Nullable String keyName,
        @Nullable String keyVersion,
        @Nullable String keyvaultUri) {
        this.keyName = keyName;
        this.keyVersion = keyVersion;
        this.keyvaultUri = keyvaultUri;
    }

    /**
     * The name of key used to encrypt data.
     * 
     */
    public Optional<String> getKeyName() {
        return Optional.ofNullable(this.keyName);
    }
    /**
     * The key version of the key used to encrypt data.
     * 
     */
    public Optional<String> getKeyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }
    /**
     * The URI of the key vault key used to encrypt data.
     * 
     */
    public Optional<String> getKeyvaultUri() {
        return Optional.ofNullable(this.keyvaultUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable String keyVersion;
        private @Nullable String keyvaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVersion = defaults.keyVersion;
    	      this.keyvaultUri = defaults.keyvaultUri;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        public Builder setKeyvaultUri(@Nullable String keyvaultUri) {
            this.keyvaultUri = keyvaultUri;
            return this;
        }
        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(keyName, keyVersion, keyvaultUri);
        }
    }
}
