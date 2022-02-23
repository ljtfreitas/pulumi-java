// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The storage location for a packet capture session.
 * 
 */
public final class PacketCaptureStorageLocationResponse extends io.pulumi.resources.InvokeArgs {

    public static final PacketCaptureStorageLocationResponse Empty = new PacketCaptureStorageLocationResponse();

    /**
     * A valid local path on the targeting VM. Must include the name of the capture file (*.cap). For linux virtual machine it must start with /var/captures. Required if no storage ID is provided, otherwise optional.
     * 
     */
    @InputImport(name="filePath")
        private final @Nullable String filePath;

    public Optional<String> getFilePath() {
        return this.filePath == null ? Optional.empty() : Optional.ofNullable(this.filePath);
    }

    /**
     * The ID of the storage account to save the packet capture session. Required if no local file path is provided.
     * 
     */
    @InputImport(name="storageId")
        private final @Nullable String storageId;

    public Optional<String> getStorageId() {
        return this.storageId == null ? Optional.empty() : Optional.ofNullable(this.storageId);
    }

    /**
     * The URI of the storage path to save the packet capture. Must be a well-formed URI describing the location to save the packet capture.
     * 
     */
    @InputImport(name="storagePath")
        private final @Nullable String storagePath;

    public Optional<String> getStoragePath() {
        return this.storagePath == null ? Optional.empty() : Optional.ofNullable(this.storagePath);
    }

    public PacketCaptureStorageLocationResponse(
        @Nullable String filePath,
        @Nullable String storageId,
        @Nullable String storagePath) {
        this.filePath = filePath;
        this.storageId = storageId;
        this.storagePath = storagePath;
    }

    private PacketCaptureStorageLocationResponse() {
        this.filePath = null;
        this.storageId = null;
        this.storagePath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketCaptureStorageLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filePath;
        private @Nullable String storageId;
        private @Nullable String storagePath;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketCaptureStorageLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePath = defaults.filePath;
    	      this.storageId = defaults.storageId;
    	      this.storagePath = defaults.storagePath;
        }

        public Builder setFilePath(@Nullable String filePath) {
            this.filePath = filePath;
            return this;
        }

        public Builder setStorageId(@Nullable String storageId) {
            this.storageId = storageId;
            return this;
        }

        public Builder setStoragePath(@Nullable String storagePath) {
            this.storagePath = storagePath;
            return this;
        }
        public PacketCaptureStorageLocationResponse build() {
            return new PacketCaptureStorageLocationResponse(filePath, storageId, storagePath);
        }
    }
}
