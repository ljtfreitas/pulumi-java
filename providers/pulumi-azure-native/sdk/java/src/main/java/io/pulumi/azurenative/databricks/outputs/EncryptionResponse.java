// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EncryptionResponse {
    /**
     * The name of KeyVault key.
     * 
     */
    private final @Nullable String keyName;
    /**
     * The encryption keySource (provider). Possible values (case-insensitive):  Default, Microsoft.Keyvault
     * 
     */
    private final @Nullable String keySource;
    /**
     * The Uri of KeyVault.
     * 
     */
    private final @Nullable String keyVaultUri;
    /**
     * The version of KeyVault key.
     * 
     */
    private final @Nullable String keyVersion;

    @OutputCustomType.Constructor({"keyName","keySource","keyVaultUri","keyVersion"})
    private EncryptionResponse(
        @Nullable String keyName,
        @Nullable String keySource,
        @Nullable String keyVaultUri,
        @Nullable String keyVersion) {
        this.keyName = keyName;
        this.keySource = keySource;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
    }

    /**
     * The name of KeyVault key.
     * 
     */
    public Optional<String> getKeyName() {
        return Optional.ofNullable(this.keyName);
    }
    /**
     * The encryption keySource (provider). Possible values (case-insensitive):  Default, Microsoft.Keyvault
     * 
     */
    public Optional<String> getKeySource() {
        return Optional.ofNullable(this.keySource);
    }
    /**
     * The Uri of KeyVault.
     * 
     */
    public Optional<String> getKeyVaultUri() {
        return Optional.ofNullable(this.keyVaultUri);
    }
    /**
     * The version of KeyVault key.
     * 
     */
    public Optional<String> getKeyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable String keySource;
        private @Nullable String keyVaultUri;
        private @Nullable String keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keySource = defaults.keySource;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeySource(@Nullable String keySource) {
            this.keySource = keySource;
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

        public EncryptionResponse build() {
            return new EncryptionResponse(keyName, keySource, keyVaultUri, keyVersion);
        }
    }
}
