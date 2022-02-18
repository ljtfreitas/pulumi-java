// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties to configure keyVault Properties
 * 
 */
public final class KeyVaultPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultPropertiesArgs Empty = new KeyVaultPropertiesArgs();

    /**
     * Name of the Key from KeyVault
     * 
     */
    @InputImport(name="keyName")
    private final @Nullable Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName == null ? Input.empty() : this.keyName;
    }

    /**
     * Uri of KeyVault
     * 
     */
    @InputImport(name="keyVaultUri")
    private final @Nullable Input<String> keyVaultUri;

    public Input<String> getKeyVaultUri() {
        return this.keyVaultUri == null ? Input.empty() : this.keyVaultUri;
    }

    /**
     * Version of the Key from KeyVault
     * 
     */
    @InputImport(name="keyVersion")
    private final @Nullable Input<String> keyVersion;

    public Input<String> getKeyVersion() {
        return this.keyVersion == null ? Input.empty() : this.keyVersion;
    }

    public KeyVaultPropertiesArgs(
        @Nullable Input<String> keyName,
        @Nullable Input<String> keyVaultUri,
        @Nullable Input<String> keyVersion) {
        this.keyName = keyName;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
    }

    private KeyVaultPropertiesArgs() {
        this.keyName = Input.empty();
        this.keyVaultUri = Input.empty();
        this.keyVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyName;
        private @Nullable Input<String> keyVaultUri;
        private @Nullable Input<String> keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
        }

        public Builder setKeyName(@Nullable Input<String> keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = Input.ofNullable(keyName);
            return this;
        }

        public Builder setKeyVaultUri(@Nullable Input<String> keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }

        public Builder setKeyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = Input.ofNullable(keyVaultUri);
            return this;
        }

        public Builder setKeyVersion(@Nullable Input<String> keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        public Builder setKeyVersion(@Nullable String keyVersion) {
            this.keyVersion = Input.ofNullable(keyVersion);
            return this;
        }

        public KeyVaultPropertiesArgs build() {
            return new KeyVaultPropertiesArgs(keyName, keyVaultUri, keyVersion);
        }
    }
}
