// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.inputs.EncryptionPropertiesResponseIdentity;
import io.pulumi.azurenative.automation.inputs.KeyVaultPropertiesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The encryption settings for automation account
 * 
 */
public final class EncryptionPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionPropertiesResponse Empty = new EncryptionPropertiesResponse();

    /**
     * User identity used for CMK.
     * 
     */
    @Import(name="identity")
      private final @Nullable EncryptionPropertiesResponseIdentity identity;

    public Optional<EncryptionPropertiesResponseIdentity> getIdentity() {
        return this.identity == null ? Optional.empty() : Optional.ofNullable(this.identity);
    }

    /**
     * Encryption Key Source
     * 
     */
    @Import(name="keySource")
      private final @Nullable String keySource;

    public Optional<String> getKeySource() {
        return this.keySource == null ? Optional.empty() : Optional.ofNullable(this.keySource);
    }

    /**
     * Key vault properties.
     * 
     */
    @Import(name="keyVaultProperties")
      private final @Nullable KeyVaultPropertiesResponse keyVaultProperties;

    public Optional<KeyVaultPropertiesResponse> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Optional.empty() : Optional.ofNullable(this.keyVaultProperties);
    }

    public EncryptionPropertiesResponse(
        @Nullable EncryptionPropertiesResponseIdentity identity,
        @Nullable String keySource,
        @Nullable KeyVaultPropertiesResponse keyVaultProperties) {
        this.identity = identity;
        this.keySource = keySource;
        this.keyVaultProperties = keyVaultProperties;
    }

    private EncryptionPropertiesResponse() {
        this.identity = null;
        this.keySource = null;
        this.keyVaultProperties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EncryptionPropertiesResponseIdentity identity;
        private @Nullable String keySource;
        private @Nullable KeyVaultPropertiesResponse keyVaultProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.keySource = defaults.keySource;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
        }

        public Builder identity(@Nullable EncryptionPropertiesResponseIdentity identity) {
            this.identity = identity;
            return this;
        }

        public Builder keySource(@Nullable String keySource) {
            this.keySource = keySource;
            return this;
        }

        public Builder keyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }
        public EncryptionPropertiesResponse build() {
            return new EncryptionPropertiesResponse(identity, keySource, keyVaultProperties);
        }
    }
}
