// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.storage.enums.EncryptionScopeSource;
import io.pulumi.azurenative.storage.enums.EncryptionScopeState;
import io.pulumi.azurenative.storage.inputs.EncryptionScopeKeyVaultPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EncryptionScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionScopeArgs Empty = new EncryptionScopeArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the encryption scope within the specified storage account. Encryption scope names must be between 3 and 63 characters in length and use numbers, lower-case letters and dash (-) only. Every dash (-) character must be immediately preceded and followed by a letter or number.
     * 
     */
    @Import(name="encryptionScopeName")
      private final @Nullable Output<String> encryptionScopeName;

    public Output<String> getEncryptionScopeName() {
        return this.encryptionScopeName == null ? Output.empty() : this.encryptionScopeName;
    }

    /**
     * The key vault properties for the encryption scope. This is a required field if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     * 
     */
    @Import(name="keyVaultProperties")
      private final @Nullable Output<EncryptionScopeKeyVaultPropertiesArgs> keyVaultProperties;

    public Output<EncryptionScopeKeyVaultPropertiesArgs> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Output.empty() : this.keyVaultProperties;
    }

    /**
     * A boolean indicating whether or not the service applies a secondary layer of encryption with platform managed keys for data at rest.
     * 
     */
    @Import(name="requireInfrastructureEncryption")
      private final @Nullable Output<Boolean> requireInfrastructureEncryption;

    public Output<Boolean> getRequireInfrastructureEncryption() {
        return this.requireInfrastructureEncryption == null ? Output.empty() : this.requireInfrastructureEncryption;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The provider for the encryption scope. Possible values (case-insensitive):  Microsoft.Storage, Microsoft.KeyVault.
     * 
     */
    @Import(name="source")
      private final @Nullable Output<Either<String,EncryptionScopeSource>> source;

    public Output<Either<String,EncryptionScopeSource>> getSource() {
        return this.source == null ? Output.empty() : this.source;
    }

    /**
     * The state of the encryption scope. Possible values (case-insensitive):  Enabled, Disabled.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<Either<String,EncryptionScopeState>> state;

    public Output<Either<String,EncryptionScopeState>> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    public EncryptionScopeArgs(
        Output<String> accountName,
        @Nullable Output<String> encryptionScopeName,
        @Nullable Output<EncryptionScopeKeyVaultPropertiesArgs> keyVaultProperties,
        @Nullable Output<Boolean> requireInfrastructureEncryption,
        Output<String> resourceGroupName,
        @Nullable Output<Either<String,EncryptionScopeSource>> source,
        @Nullable Output<Either<String,EncryptionScopeState>> state) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.encryptionScopeName = encryptionScopeName;
        this.keyVaultProperties = keyVaultProperties;
        this.requireInfrastructureEncryption = requireInfrastructureEncryption;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.source = source;
        this.state = state;
    }

    private EncryptionScopeArgs() {
        this.accountName = Output.empty();
        this.encryptionScopeName = Output.empty();
        this.keyVaultProperties = Output.empty();
        this.requireInfrastructureEncryption = Output.empty();
        this.resourceGroupName = Output.empty();
        this.source = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> encryptionScopeName;
        private @Nullable Output<EncryptionScopeKeyVaultPropertiesArgs> keyVaultProperties;
        private @Nullable Output<Boolean> requireInfrastructureEncryption;
        private Output<String> resourceGroupName;
        private @Nullable Output<Either<String,EncryptionScopeSource>> source;
        private @Nullable Output<Either<String,EncryptionScopeState>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.encryptionScopeName = defaults.encryptionScopeName;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.requireInfrastructureEncryption = defaults.requireInfrastructureEncryption;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.source = defaults.source;
    	      this.state = defaults.state;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder encryptionScopeName(@Nullable Output<String> encryptionScopeName) {
            this.encryptionScopeName = encryptionScopeName;
            return this;
        }

        public Builder encryptionScopeName(@Nullable String encryptionScopeName) {
            this.encryptionScopeName = Output.ofNullable(encryptionScopeName);
            return this;
        }

        public Builder keyVaultProperties(@Nullable Output<EncryptionScopeKeyVaultPropertiesArgs> keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public Builder keyVaultProperties(@Nullable EncryptionScopeKeyVaultPropertiesArgs keyVaultProperties) {
            this.keyVaultProperties = Output.ofNullable(keyVaultProperties);
            return this;
        }

        public Builder requireInfrastructureEncryption(@Nullable Output<Boolean> requireInfrastructureEncryption) {
            this.requireInfrastructureEncryption = requireInfrastructureEncryption;
            return this;
        }

        public Builder requireInfrastructureEncryption(@Nullable Boolean requireInfrastructureEncryption) {
            this.requireInfrastructureEncryption = Output.ofNullable(requireInfrastructureEncryption);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder source(@Nullable Output<Either<String,EncryptionScopeSource>> source) {
            this.source = source;
            return this;
        }

        public Builder source(@Nullable Either<String,EncryptionScopeSource> source) {
            this.source = Output.ofNullable(source);
            return this;
        }

        public Builder state(@Nullable Output<Either<String,EncryptionScopeState>> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable Either<String,EncryptionScopeState> state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public EncryptionScopeArgs build() {
            return new EncryptionScopeArgs(accountName, encryptionScopeName, keyVaultProperties, requireInfrastructureEncryption, resourceGroupName, source, state);
        }
    }
}
