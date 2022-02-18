// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.azurenative.databricks.enums.KeySource;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The object that contains details of encryption used on the workspace.
 * 
 */
public final class EncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionArgs Empty = new EncryptionArgs();

    /**
     * The name of KeyVault key.
     * 
     */
    @InputImport(name="keyName")
    private final @Nullable Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName == null ? Input.empty() : this.keyName;
    }

    /**
     * The encryption keySource (provider). Possible values (case-insensitive):  Default, Microsoft.Keyvault
     * 
     */
    @InputImport(name="keySource")
    private final @Nullable Input<Either<String,KeySource>> keySource;

    public Input<Either<String,KeySource>> getKeySource() {
        return this.keySource == null ? Input.empty() : this.keySource;
    }

    /**
     * The Uri of KeyVault.
     * 
     */
    @InputImport(name="keyVaultUri")
    private final @Nullable Input<String> keyVaultUri;

    public Input<String> getKeyVaultUri() {
        return this.keyVaultUri == null ? Input.empty() : this.keyVaultUri;
    }

    /**
     * The version of KeyVault key.
     * 
     */
    @InputImport(name="keyVersion")
    private final @Nullable Input<String> keyVersion;

    public Input<String> getKeyVersion() {
        return this.keyVersion == null ? Input.empty() : this.keyVersion;
    }

    public EncryptionArgs(
        @Nullable Input<String> keyName,
        @Nullable Input<Either<String,KeySource>> keySource,
        @Nullable Input<String> keyVaultUri,
        @Nullable Input<String> keyVersion) {
        this.keyName = keyName;
        this.keySource = keySource == null ? Input.ofLeft("Default") : keySource;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
    }

    private EncryptionArgs() {
        this.keyName = Input.empty();
        this.keySource = Input.empty();
        this.keyVaultUri = Input.empty();
        this.keyVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyName;
        private @Nullable Input<Either<String,KeySource>> keySource;
        private @Nullable Input<String> keyVaultUri;
        private @Nullable Input<String> keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keySource = defaults.keySource;
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

        public Builder setKeySource(@Nullable Input<Either<String,KeySource>> keySource) {
            this.keySource = keySource;
            return this;
        }

        public Builder setKeySource(@Nullable Either<String,KeySource> keySource) {
            this.keySource = Input.ofNullable(keySource);
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

        public EncryptionArgs build() {
            return new EncryptionArgs(keyName, keySource, keyVaultUri, keyVersion);
        }
    }
}
