// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Files or Blob Storage access information value for dictionary storage.
 * 
 */
public final class AzureStorageInfoValueResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureStorageInfoValueResponse Empty = new AzureStorageInfoValueResponse();

    /**
     * Access key for the storage account.
     * 
     */
    @Import(name="accessKey")
      private final @Nullable String accessKey;

    public Optional<String> getAccessKey() {
        return this.accessKey == null ? Optional.empty() : Optional.ofNullable(this.accessKey);
    }

    /**
     * Name of the storage account.
     * 
     */
    @Import(name="accountName")
      private final @Nullable String accountName;

    public Optional<String> getAccountName() {
        return this.accountName == null ? Optional.empty() : Optional.ofNullable(this.accountName);
    }

    /**
     * Path to mount the storage within the site's runtime environment.
     * 
     */
    @Import(name="mountPath")
      private final @Nullable String mountPath;

    public Optional<String> getMountPath() {
        return this.mountPath == null ? Optional.empty() : Optional.ofNullable(this.mountPath);
    }

    /**
     * Name of the file share (container name, for Blob storage).
     * 
     */
    @Import(name="shareName")
      private final @Nullable String shareName;

    public Optional<String> getShareName() {
        return this.shareName == null ? Optional.empty() : Optional.ofNullable(this.shareName);
    }

    /**
     * State of the storage account.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Type of storage.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public AzureStorageInfoValueResponse(
        @Nullable String accessKey,
        @Nullable String accountName,
        @Nullable String mountPath,
        @Nullable String shareName,
        String state,
        @Nullable String type) {
        this.accessKey = accessKey;
        this.accountName = accountName;
        this.mountPath = mountPath;
        this.shareName = shareName;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.type = type;
    }

    private AzureStorageInfoValueResponse() {
        this.accessKey = null;
        this.accountName = null;
        this.mountPath = null;
        this.shareName = null;
        this.state = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureStorageInfoValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessKey;
        private @Nullable String accountName;
        private @Nullable String mountPath;
        private @Nullable String shareName;
        private String state;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureStorageInfoValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.accountName = defaults.accountName;
    	      this.mountPath = defaults.mountPath;
    	      this.shareName = defaults.shareName;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder accessKey(@Nullable String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public Builder accountName(@Nullable String accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder mountPath(@Nullable String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        public Builder shareName(@Nullable String shareName) {
            this.shareName = shareName;
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public AzureStorageInfoValueResponse build() {
            return new AzureStorageInfoValueResponse(accessKey, accountName, mountPath, shareName, state, type);
        }
    }
}
