// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureFileVolumeResponse {
    /**
     * The flag indicating whether the Azure File shared mounted as a volume is read-only.
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * The name of the Azure File share to be mounted as a volume.
     * 
     */
    private final String shareName;
    /**
     * The storage account access key used to access the Azure File share.
     * 
     */
    private final @Nullable String storageAccountKey;
    /**
     * The name of the storage account that contains the Azure File share.
     * 
     */
    private final String storageAccountName;

    @CustomType.Constructor
    private AzureFileVolumeResponse(
        @CustomType.Parameter("readOnly") @Nullable Boolean readOnly,
        @CustomType.Parameter("shareName") String shareName,
        @CustomType.Parameter("storageAccountKey") @Nullable String storageAccountKey,
        @CustomType.Parameter("storageAccountName") String storageAccountName) {
        this.readOnly = readOnly;
        this.shareName = shareName;
        this.storageAccountKey = storageAccountKey;
        this.storageAccountName = storageAccountName;
    }

    /**
     * The flag indicating whether the Azure File shared mounted as a volume is read-only.
     * 
    */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * The name of the Azure File share to be mounted as a volume.
     * 
    */
    public String getShareName() {
        return this.shareName;
    }
    /**
     * The storage account access key used to access the Azure File share.
     * 
    */
    public Optional<String> getStorageAccountKey() {
        return Optional.ofNullable(this.storageAccountKey);
    }
    /**
     * The name of the storage account that contains the Azure File share.
     * 
    */
    public String getStorageAccountName() {
        return this.storageAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileVolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean readOnly;
        private String shareName;
        private @Nullable String storageAccountKey;
        private String storageAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileVolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readOnly = defaults.readOnly;
    	      this.shareName = defaults.shareName;
    	      this.storageAccountKey = defaults.storageAccountKey;
    	      this.storageAccountName = defaults.storageAccountName;
        }

        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder shareName(String shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }

        public Builder storageAccountKey(@Nullable String storageAccountKey) {
            this.storageAccountKey = storageAccountKey;
            return this;
        }

        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        public AzureFileVolumeResponse build() {
            return new AzureFileVolumeResponse(readOnly, shareName, storageAccountKey, storageAccountName);
        }
    }
}
