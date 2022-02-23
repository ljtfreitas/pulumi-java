// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The storage profile of the user settings.
 * 
 */
public final class StorageProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageProfileResponse Empty = new StorageProfileResponse();

    /**
     * Size of file share
     * 
     */
    @InputImport(name="diskSizeInGB")
        private final @Nullable Integer diskSizeInGB;

    public Optional<Integer> getDiskSizeInGB() {
        return this.diskSizeInGB == null ? Optional.empty() : Optional.ofNullable(this.diskSizeInGB);
    }

    /**
     * Name of the mounted file share. 63 characters or less, lowercase alphabet, numbers, and -
     * 
     */
    @InputImport(name="fileShareName")
        private final @Nullable String fileShareName;

    public Optional<String> getFileShareName() {
        return this.fileShareName == null ? Optional.empty() : Optional.ofNullable(this.fileShareName);
    }

    /**
     * Full resource ID of storage account.
     * 
     */
    @InputImport(name="storageAccountResourceId")
        private final @Nullable String storageAccountResourceId;

    public Optional<String> getStorageAccountResourceId() {
        return this.storageAccountResourceId == null ? Optional.empty() : Optional.ofNullable(this.storageAccountResourceId);
    }

    public StorageProfileResponse(
        @Nullable Integer diskSizeInGB,
        @Nullable String fileShareName,
        @Nullable String storageAccountResourceId) {
        this.diskSizeInGB = diskSizeInGB;
        this.fileShareName = fileShareName;
        this.storageAccountResourceId = storageAccountResourceId;
    }

    private StorageProfileResponse() {
        this.diskSizeInGB = null;
        this.fileShareName = null;
        this.storageAccountResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer diskSizeInGB;
        private @Nullable String fileShareName;
        private @Nullable String storageAccountResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeInGB = defaults.diskSizeInGB;
    	      this.fileShareName = defaults.fileShareName;
    	      this.storageAccountResourceId = defaults.storageAccountResourceId;
        }

        public Builder setDiskSizeInGB(@Nullable Integer diskSizeInGB) {
            this.diskSizeInGB = diskSizeInGB;
            return this;
        }

        public Builder setFileShareName(@Nullable String fileShareName) {
            this.fileShareName = fileShareName;
            return this;
        }

        public Builder setStorageAccountResourceId(@Nullable String storageAccountResourceId) {
            this.storageAccountResourceId = storageAccountResourceId;
            return this;
        }
        public StorageProfileResponse build() {
            return new StorageProfileResponse(diskSizeInGB, fileShareName, storageAccountResourceId);
        }
    }
}
