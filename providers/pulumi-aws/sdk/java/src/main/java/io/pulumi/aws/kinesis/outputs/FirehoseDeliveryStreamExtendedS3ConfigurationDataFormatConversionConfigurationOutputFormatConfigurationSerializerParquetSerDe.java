// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe {
    /**
     * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
     * 
     */
    private final @Nullable Integer blockSizeBytes;
    /**
     * The compression code to use over data blocks. The possible values are `UNCOMPRESSED`, `SNAPPY`, and `GZIP`, with the default being `SNAPPY`. Use `SNAPPY` for higher decompression speed. Use `GZIP` if the compression ratio is more important than speed.
     * 
     */
    private final @Nullable String compression;
    /**
     * Indicates whether to enable dictionary compression.
     * 
     */
    private final @Nullable Boolean enableDictionaryCompression;
    /**
     * The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is `0`.
     * 
     */
    private final @Nullable Integer maxPaddingBytes;
    /**
     * The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
     * 
     */
    private final @Nullable Integer pageSizeBytes;
    /**
     * Indicates the version of row format to output. The possible values are `V1` and `V2`. The default is `V1`.
     * 
     */
    private final @Nullable String writerVersion;

    @OutputCustomType.Constructor({"blockSizeBytes","compression","enableDictionaryCompression","maxPaddingBytes","pageSizeBytes","writerVersion"})
    private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe(
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

    /**
     * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
     * 
     */
    public Optional<Integer> getBlockSizeBytes() {
        return Optional.ofNullable(this.blockSizeBytes);
    }
    /**
     * The compression code to use over data blocks. The possible values are `UNCOMPRESSED`, `SNAPPY`, and `GZIP`, with the default being `SNAPPY`. Use `SNAPPY` for higher decompression speed. Use `GZIP` if the compression ratio is more important than speed.
     * 
     */
    public Optional<String> getCompression() {
        return Optional.ofNullable(this.compression);
    }
    /**
     * Indicates whether to enable dictionary compression.
     * 
     */
    public Optional<Boolean> getEnableDictionaryCompression() {
        return Optional.ofNullable(this.enableDictionaryCompression);
    }
    /**
     * The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is `0`.
     * 
     */
    public Optional<Integer> getMaxPaddingBytes() {
        return Optional.ofNullable(this.maxPaddingBytes);
    }
    /**
     * The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
     * 
     */
    public Optional<Integer> getPageSizeBytes() {
        return Optional.ofNullable(this.pageSizeBytes);
    }
    /**
     * Indicates the version of row format to output. The possible values are `V1` and `V2`. The default is `V1`.
     * 
     */
    public Optional<String> getWriterVersion() {
        return Optional.ofNullable(this.writerVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe defaults) {
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

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe defaults) {
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
        public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerParquetSerDe(blockSizeBytes, compression, enableDictionaryCompression, maxPaddingBytes, pageSizeBytes, writerVersion);
        }
    }
}
