// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamParquetSerDe extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamParquetSerDe Empty = new DeliveryStreamParquetSerDe();

    @InputImport(name="blockSizeBytes")
        private final @Nullable Integer blockSizeBytes;

    public Optional<Integer> getBlockSizeBytes() {
        return this.blockSizeBytes == null ? Optional.empty() : Optional.ofNullable(this.blockSizeBytes);
    }

    @InputImport(name="compression")
        private final @Nullable String compression;

    public Optional<String> getCompression() {
        return this.compression == null ? Optional.empty() : Optional.ofNullable(this.compression);
    }

    @InputImport(name="enableDictionaryCompression")
        private final @Nullable Boolean enableDictionaryCompression;

    public Optional<Boolean> getEnableDictionaryCompression() {
        return this.enableDictionaryCompression == null ? Optional.empty() : Optional.ofNullable(this.enableDictionaryCompression);
    }

    @InputImport(name="maxPaddingBytes")
        private final @Nullable Integer maxPaddingBytes;

    public Optional<Integer> getMaxPaddingBytes() {
        return this.maxPaddingBytes == null ? Optional.empty() : Optional.ofNullable(this.maxPaddingBytes);
    }

    @InputImport(name="pageSizeBytes")
        private final @Nullable Integer pageSizeBytes;

    public Optional<Integer> getPageSizeBytes() {
        return this.pageSizeBytes == null ? Optional.empty() : Optional.ofNullable(this.pageSizeBytes);
    }

    @InputImport(name="writerVersion")
        private final @Nullable String writerVersion;

    public Optional<String> getWriterVersion() {
        return this.writerVersion == null ? Optional.empty() : Optional.ofNullable(this.writerVersion);
    }

    public DeliveryStreamParquetSerDe(
        @Nullable Integer blockSizeBytes,
        @Nullable String compression,
        @Nullable Boolean enableDictionaryCompression,
        @Nullable Integer maxPaddingBytes,
        @Nullable Integer pageSizeBytes,
        @Nullable String writerVersion) {
        this.blockSizeBytes = blockSizeBytes;
        this.compression = compression;
        this.enableDictionaryCompression = enableDictionaryCompression;
        this.maxPaddingBytes = maxPaddingBytes;
        this.pageSizeBytes = pageSizeBytes;
        this.writerVersion = writerVersion;
    }

    private DeliveryStreamParquetSerDe() {
        this.blockSizeBytes = null;
        this.compression = null;
        this.enableDictionaryCompression = null;
        this.maxPaddingBytes = null;
        this.pageSizeBytes = null;
        this.writerVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamParquetSerDe defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer blockSizeBytes;
        private @Nullable String compression;
        private @Nullable Boolean enableDictionaryCompression;
        private @Nullable Integer maxPaddingBytes;
        private @Nullable Integer pageSizeBytes;
        private @Nullable String writerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamParquetSerDe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockSizeBytes = defaults.blockSizeBytes;
    	      this.compression = defaults.compression;
    	      this.enableDictionaryCompression = defaults.enableDictionaryCompression;
    	      this.maxPaddingBytes = defaults.maxPaddingBytes;
    	      this.pageSizeBytes = defaults.pageSizeBytes;
    	      this.writerVersion = defaults.writerVersion;
        }

        public Builder setBlockSizeBytes(@Nullable Integer blockSizeBytes) {
            this.blockSizeBytes = blockSizeBytes;
            return this;
        }

        public Builder setCompression(@Nullable String compression) {
            this.compression = compression;
            return this;
        }

        public Builder setEnableDictionaryCompression(@Nullable Boolean enableDictionaryCompression) {
            this.enableDictionaryCompression = enableDictionaryCompression;
            return this;
        }

        public Builder setMaxPaddingBytes(@Nullable Integer maxPaddingBytes) {
            this.maxPaddingBytes = maxPaddingBytes;
            return this;
        }

        public Builder setPageSizeBytes(@Nullable Integer pageSizeBytes) {
            this.pageSizeBytes = pageSizeBytes;
            return this;
        }

        public Builder setWriterVersion(@Nullable String writerVersion) {
            this.writerVersion = writerVersion;
            return this;
        }
        public DeliveryStreamParquetSerDe build() {
            return new DeliveryStreamParquetSerDe(blockSizeBytes, compression, enableDictionaryCompression, maxPaddingBytes, pageSizeBytes, writerVersion);
        }
    }
}
