// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The key vault properties.
 * 
 */
public final class KeyVaultPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultPropertiesResponse Empty = new KeyVaultPropertiesResponse();

    /**
     * The name of the key associated with the Log Analytics cluster.
     * 
     */
    @InputImport(name="keyName")
    private final @Nullable String keyName;

    public Optional<String> getKeyName() {
        return this.keyName == null ? Optional.empty() : Optional.ofNullable(this.keyName);
    }

    /**
     * Selected key minimum required size.
     * 
     */
    @InputImport(name="keyRsaSize")
    private final @Nullable Integer keyRsaSize;

    public Optional<Integer> getKeyRsaSize() {
        return this.keyRsaSize == null ? Optional.empty() : Optional.ofNullable(this.keyRsaSize);
    }

    /**
     * The Key Vault uri which holds they key associated with the Log Analytics cluster.
     * 
     */
    @InputImport(name="keyVaultUri")
    private final @Nullable String keyVaultUri;

    public Optional<String> getKeyVaultUri() {
        return this.keyVaultUri == null ? Optional.empty() : Optional.ofNullable(this.keyVaultUri);
    }

    /**
     * The version of the key associated with the Log Analytics cluster.
     * 
     */
    @InputImport(name="keyVersion")
    private final @Nullable String keyVersion;

    public Optional<String> getKeyVersion() {
        return this.keyVersion == null ? Optional.empty() : Optional.ofNullable(this.keyVersion);
    }

    public KeyVaultPropertiesResponse(
        @Nullable String keyName,
        @Nullable Integer keyRsaSize,
        @Nullable String keyVaultUri,
        @Nullable String keyVersion) {
        this.keyName = keyName;
        this.keyRsaSize = keyRsaSize;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
    }

    private KeyVaultPropertiesResponse() {
        this.keyName = null;
        this.keyRsaSize = null;
        this.keyVaultUri = null;
        this.keyVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable Integer keyRsaSize;
        private @Nullable String keyVaultUri;
        private @Nullable String keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyRsaSize = defaults.keyRsaSize;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyRsaSize(@Nullable Integer keyRsaSize) {
            this.keyRsaSize = keyRsaSize;
            return this;
        }

        public Builder setKeyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }

        public Builder setKeyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(keyName, keyRsaSize, keyVaultUri, keyVersion);
        }
    }
}
