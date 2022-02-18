// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.BlobStorageTokenStoreResponse;
import io.pulumi.azurenative.web.outputs.FileSystemTokenStoreResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TokenStoreResponse {
    /**
     * The configuration settings of the storage of the tokens if blob storage is used.
     * 
     */
    private final @Nullable BlobStorageTokenStoreResponse azureBlobStorage;
    /**
     * <code>true</code> to durably store platform-specific security tokens that are obtained during login flows; otherwise, <code>false</code>.
     *  The default is <code>false</code>.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The configuration settings of the storage of the tokens if a file system is used.
     * 
     */
    private final @Nullable FileSystemTokenStoreResponse fileSystem;
    /**
     * The number of hours after session token expiration that a session token can be used to
     * call the token refresh API. The default is 72 hours.
     * 
     */
    private final @Nullable Double tokenRefreshExtensionHours;

    @OutputCustomType.Constructor({"azureBlobStorage","enabled","fileSystem","tokenRefreshExtensionHours"})
    private TokenStoreResponse(
        @Nullable BlobStorageTokenStoreResponse azureBlobStorage,
        @Nullable Boolean enabled,
        @Nullable FileSystemTokenStoreResponse fileSystem,
        @Nullable Double tokenRefreshExtensionHours) {
        this.azureBlobStorage = azureBlobStorage;
        this.enabled = enabled;
        this.fileSystem = fileSystem;
        this.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
    }

    /**
     * The configuration settings of the storage of the tokens if blob storage is used.
     * 
     */
    public Optional<BlobStorageTokenStoreResponse> getAzureBlobStorage() {
        return Optional.ofNullable(this.azureBlobStorage);
    }
    /**
     * <code>true</code> to durably store platform-specific security tokens that are obtained during login flows; otherwise, <code>false</code>.
     *  The default is <code>false</code>.
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The configuration settings of the storage of the tokens if a file system is used.
     * 
     */
    public Optional<FileSystemTokenStoreResponse> getFileSystem() {
        return Optional.ofNullable(this.fileSystem);
    }
    /**
     * The number of hours after session token expiration that a session token can be used to
     * call the token refresh API. The default is 72 hours.
     * 
     */
    public Optional<Double> getTokenRefreshExtensionHours() {
        return Optional.ofNullable(this.tokenRefreshExtensionHours);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenStoreResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BlobStorageTokenStoreResponse azureBlobStorage;
        private @Nullable Boolean enabled;
        private @Nullable FileSystemTokenStoreResponse fileSystem;
        private @Nullable Double tokenRefreshExtensionHours;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenStoreResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobStorage = defaults.azureBlobStorage;
    	      this.enabled = defaults.enabled;
    	      this.fileSystem = defaults.fileSystem;
    	      this.tokenRefreshExtensionHours = defaults.tokenRefreshExtensionHours;
        }

        public Builder setAzureBlobStorage(@Nullable BlobStorageTokenStoreResponse azureBlobStorage) {
            this.azureBlobStorage = azureBlobStorage;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setFileSystem(@Nullable FileSystemTokenStoreResponse fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        public Builder setTokenRefreshExtensionHours(@Nullable Double tokenRefreshExtensionHours) {
            this.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
            return this;
        }

        public TokenStoreResponse build() {
            return new TokenStoreResponse(azureBlobStorage, enabled, fileSystem, tokenRefreshExtensionHours);
        }
    }
}
