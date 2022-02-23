// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.EncryptionScopeKeyVaultPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEncryptionScopeResult {
    /**
     * Gets the creation date and time of the encryption scope in UTC.
     * 
     */
    private final String creationTime;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The key vault properties for the encryption scope. This is a required field if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     * 
     */
    private final @Nullable EncryptionScopeKeyVaultPropertiesResponse keyVaultProperties;
    /**
     * Gets the last modification date and time of the encryption scope in UTC.
     * 
     */
    private final String lastModifiedTime;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * A boolean indicating whether or not the service applies a secondary layer of encryption with platform managed keys for data at rest.
     * 
     */
    private final @Nullable Boolean requireInfrastructureEncryption;
    /**
     * The provider for the encryption scope. Possible values (case-insensitive):  Microsoft.Storage, Microsoft.KeyVault.
     * 
     */
    private final @Nullable String source;
    /**
     * The state of the encryption scope. Possible values (case-insensitive):  Enabled, Disabled.
     * 
     */
    private final @Nullable String state;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"creationTime","id","keyVaultProperties","lastModifiedTime","name","requireInfrastructureEncryption","source","state","type"})
    private GetEncryptionScopeResult(
        String creationTime,
        String id,
        @Nullable EncryptionScopeKeyVaultPropertiesResponse keyVaultProperties,
        String lastModifiedTime,
        String name,
        @Nullable Boolean requireInfrastructureEncryption,
        @Nullable String source,
        @Nullable String state,
        String type) {
        this.creationTime = Objects.requireNonNull(creationTime);
        this.id = Objects.requireNonNull(id);
        this.keyVaultProperties = keyVaultProperties;
        this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
        this.name = Objects.requireNonNull(name);
        this.requireInfrastructureEncryption = requireInfrastructureEncryption;
        this.source = source;
        this.state = state;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Gets the creation date and time of the encryption scope in UTC.
     * 
     */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The key vault properties for the encryption scope. This is a required field if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     * 
     */
    public Optional<EncryptionScopeKeyVaultPropertiesResponse> getKeyVaultProperties() {
        return Optional.ofNullable(this.keyVaultProperties);
    }
    /**
     * Gets the last modification date and time of the encryption scope in UTC.
     * 
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * A boolean indicating whether or not the service applies a secondary layer of encryption with platform managed keys for data at rest.
     * 
     */
    public Optional<Boolean> getRequireInfrastructureEncryption() {
        return Optional.ofNullable(this.requireInfrastructureEncryption);
    }
    /**
     * The provider for the encryption scope. Possible values (case-insensitive):  Microsoft.Storage, Microsoft.KeyVault.
     * 
     */
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * The state of the encryption scope. Possible values (case-insensitive):  Enabled, Disabled.
     * 
     */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEncryptionScopeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private String id;
        private @Nullable EncryptionScopeKeyVaultPropertiesResponse keyVaultProperties;
        private String lastModifiedTime;
        private String name;
        private @Nullable Boolean requireInfrastructureEncryption;
        private @Nullable String source;
        private @Nullable String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEncryptionScopeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.id = defaults.id;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.requireInfrastructureEncryption = defaults.requireInfrastructureEncryption;
    	      this.source = defaults.source;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKeyVaultProperties(@Nullable EncryptionScopeKeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public Builder setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRequireInfrastructureEncryption(@Nullable Boolean requireInfrastructureEncryption) {
            this.requireInfrastructureEncryption = requireInfrastructureEncryption;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = source;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetEncryptionScopeResult build() {
            return new GetEncryptionScopeResult(creationTime, id, keyVaultProperties, lastModifiedTime, name, requireInfrastructureEncryption, source, state, type);
        }
    }
}
