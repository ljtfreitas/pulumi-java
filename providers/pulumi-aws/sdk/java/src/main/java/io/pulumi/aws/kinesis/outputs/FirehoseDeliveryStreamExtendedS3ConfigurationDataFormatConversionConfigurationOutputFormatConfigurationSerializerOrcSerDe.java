// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe {
    /**
     * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
     * 
     */
    private final @Nullable Integer blockSizeBytes;
    /**
     * A list of column names for which you want Kinesis Data Firehose to create bloom filters.
     * 
     */
    private final @Nullable List<String> bloomFilterColumns;
    /**
     * The Bloom filter false positive probability (FPP). The lower the FPP, the bigger the Bloom filter. The default value is `0.05`, the minimum is `0`, and the maximum is `1`.
     * 
     */
    private final @Nullable Double bloomFilterFalsePositiveProbability;
    /**
     * The compression code to use over data blocks. The possible values are `UNCOMPRESSED`, `SNAPPY`, and `GZIP`, with the default being `SNAPPY`. Use `SNAPPY` for higher decompression speed. Use `GZIP` if the compression ratio is more important than speed.
     * 
     */
    private final @Nullable String compression;
    /**
     * A float that represents the fraction of the total number of non-null rows. To turn off dictionary encoding, set this fraction to a number that is less than the number of distinct keys in a dictionary. To always use dictionary encoding, set this threshold to `1`.
     * 
     */
    private final @Nullable Double dictionaryKeyThreshold;
    /**
     * Set this to `true` to indicate that you want stripes to be padded to the HDFS block boundaries. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is `false`.
     * 
     */
    private final @Nullable Boolean enablePadding;
    /**
     * The version of the file to write. The possible values are `V0_11` and `V0_12`. The default is `V0_12`.
     * 
     */
    private final @Nullable String formatVersion;
    /**
     * A float between 0 and 1 that defines the tolerance for block padding as a decimal fraction of stripe size. The default value is `0.05`, which means 5 percent of stripe size. For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block padding tolerance of 5 percent reserves a maximum of 3.2 MiB for padding within the 256 MiB block. In such a case, if the available size within the block is more than 3.2 MiB, a new, smaller stripe is inserted to fit within that space. This ensures that no stripe crosses block boundaries and causes remote reads within a node-local task. Kinesis Data Firehose ignores this parameter when `enable_padding` is `false`.
     * 
     */
    private final @Nullable Double paddingTolerance;
    /**
     * The number of rows between index entries. The default is `10000` and the minimum is `1000`.
     * 
     */
    private final @Nullable Integer rowIndexStride;
    /**
     * The number of bytes in each stripe. The default is 64 MiB and the minimum is 8 MiB.
     * 
     */
    private final @Nullable Integer stripeSizeBytes;

    @OutputCustomType.Constructor({"blockSizeBytes","bloomFilterColumns","bloomFilterFalsePositiveProbability","compression","dictionaryKeyThreshold","enablePadding","formatVersion","paddingTolerance","rowIndexStride","stripeSizeBytes"})
    private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe(
        @Nullable Integer blockSizeBytes,
        @Nullable List<String> bloomFilterColumns,
        @Nullable Double bloomFilterFalsePositiveProbability,
        @Nullable String compression,
        @Nullable Double dictionaryKeyThreshold,
        @Nullable Boolean enablePadding,
        @Nullable String formatVersion,
        @Nullable Double paddingTolerance,
        @Nullable Integer rowIndexStride,
        @Nullable Integer stripeSizeBytes) {
        this.blockSizeBytes = blockSizeBytes;
        this.bloomFilterColumns = bloomFilterColumns;
        this.bloomFilterFalsePositiveProbability = bloomFilterFalsePositiveProbability;
        this.compression = compression;
        this.dictionaryKeyThreshold = dictionaryKeyThreshold;
        this.enablePadding = enablePadding;
        this.formatVersion = formatVersion;
        this.paddingTolerance = paddingTolerance;
        this.rowIndexStride = rowIndexStride;
        this.stripeSizeBytes = stripeSizeBytes;
    }

    /**
     * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
     * 
     */
    public Optional<Integer> getBlockSizeBytes() {
        return Optional.ofNullable(this.blockSizeBytes);
    }
    /**
     * A list of column names for which you want Kinesis Data Firehose to create bloom filters.
     * 
     */
    public List<String> getBloomFilterColumns() {
        return this.bloomFilterColumns == null ? List.of() : this.bloomFilterColumns;
    }
    /**
     * The Bloom filter false positive probability (FPP). The lower the FPP, the bigger the Bloom filter. The default value is `0.05`, the minimum is `0`, and the maximum is `1`.
     * 
     */
    public Optional<Double> getBloomFilterFalsePositiveProbability() {
        return Optional.ofNullable(this.bloomFilterFalsePositiveProbability);
    }
    /**
     * The compression code to use over data blocks. The possible values are `UNCOMPRESSED`, `SNAPPY`, and `GZIP`, with the default being `SNAPPY`. Use `SNAPPY` for higher decompression speed. Use `GZIP` if the compression ratio is more important than speed.
     * 
     */
    public Optional<String> getCompression() {
        return Optional.ofNullable(this.compression);
    }
    /**
     * A float that represents the fraction of the total number of non-null rows. To turn off dictionary encoding, set this fraction to a number that is less than the number of distinct keys in a dictionary. To always use dictionary encoding, set this threshold to `1`.
     * 
     */
    public Optional<Double> getDictionaryKeyThreshold() {
        return Optional.ofNullable(this.dictionaryKeyThreshold);
    }
    /**
     * Set this to `true` to indicate that you want stripes to be padded to the HDFS block boundaries. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is `false`.
     * 
     */
    public Optional<Boolean> getEnablePadding() {
        return Optional.ofNullable(this.enablePadding);
    }
    /**
     * The version of the file to write. The possible values are `V0_11` and `V0_12`. The default is `V0_12`.
     * 
     */
    public Optional<String> getFormatVersion() {
        return Optional.ofNullable(this.formatVersion);
    }
    /**
     * A float between 0 and 1 that defines the tolerance for block padding as a decimal fraction of stripe size. The default value is `0.05`, which means 5 percent of stripe size. For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block padding tolerance of 5 percent reserves a maximum of 3.2 MiB for padding within the 256 MiB block. In such a case, if the available size within the block is more than 3.2 MiB, a new, smaller stripe is inserted to fit within that space. This ensures that no stripe crosses block boundaries and causes remote reads within a node-local task. Kinesis Data Firehose ignores this parameter when `enable_padding` is `false`.
     * 
     */
    public Optional<Double> getPaddingTolerance() {
        return Optional.ofNullable(this.paddingTolerance);
    }
    /**
     * The number of rows between index entries. The default is `10000` and the minimum is `1000`.
     * 
     */
    public Optional<Integer> getRowIndexStride() {
        return Optional.ofNullable(this.rowIndexStride);
    }
    /**
     * The number of bytes in each stripe. The default is 64 MiB and the minimum is 8 MiB.
     * 
     */
    public Optional<Integer> getStripeSizeBytes() {
        return Optional.ofNullable(this.stripeSizeBytes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer blockSizeBytes;
        private @Nullable List<String> bloomFilterColumns;
        private @Nullable Double bloomFilterFalsePositiveProbability;
        private @Nullable String compression;
        private @Nullable Double dictionaryKeyThreshold;
        private @Nullable Boolean enablePadding;
        private @Nullable String formatVersion;
        private @Nullable Double paddingTolerance;
        private @Nullable Integer rowIndexStride;
        private @Nullable Integer stripeSizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockSizeBytes = defaults.blockSizeBytes;
    	      this.bloomFilterColumns = defaults.bloomFilterColumns;
    	      this.bloomFilterFalsePositiveProbability = defaults.bloomFilterFalsePositiveProbability;
    	      this.compression = defaults.compression;
    	      this.dictionaryKeyThreshold = defaults.dictionaryKeyThreshold;
    	      this.enablePadding = defaults.enablePadding;
    	      this.formatVersion = defaults.formatVersion;
    	      this.paddingTolerance = defaults.paddingTolerance;
    	      this.rowIndexStride = defaults.rowIndexStride;
    	      this.stripeSizeBytes = defaults.stripeSizeBytes;
        }

        public Builder setBlockSizeBytes(@Nullable Integer blockSizeBytes) {
            this.blockSizeBytes = blockSizeBytes;
            return this;
        }

        public Builder setBloomFilterColumns(@Nullable List<String> bloomFilterColumns) {
            this.bloomFilterColumns = bloomFilterColumns;
            return this;
        }

        public Builder setBloomFilterFalsePositiveProbability(@Nullable Double bloomFilterFalsePositiveProbability) {
            this.bloomFilterFalsePositiveProbability = bloomFilterFalsePositiveProbability;
            return this;
        }

        public Builder setCompression(@Nullable String compression) {
            this.compression = compression;
            return this;
        }

        public Builder setDictionaryKeyThreshold(@Nullable Double dictionaryKeyThreshold) {
            this.dictionaryKeyThreshold = dictionaryKeyThreshold;
            return this;
        }

        public Builder setEnablePadding(@Nullable Boolean enablePadding) {
            this.enablePadding = enablePadding;
            return this;
        }

        public Builder setFormatVersion(@Nullable String formatVersion) {
            this.formatVersion = formatVersion;
            return this;
        }

        public Builder setPaddingTolerance(@Nullable Double paddingTolerance) {
            this.paddingTolerance = paddingTolerance;
            return this;
        }

        public Builder setRowIndexStride(@Nullable Integer rowIndexStride) {
            this.rowIndexStride = rowIndexStride;
            return this;
        }

        public Builder setStripeSizeBytes(@Nullable Integer stripeSizeBytes) {
            this.stripeSizeBytes = stripeSizeBytes;
            return this;
        }
        public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDe(blockSizeBytes, bloomFilterColumns, bloomFilterFalsePositiveProbability, compression, dictionaryKeyThreshold, enablePadding, formatVersion, paddingTolerance, rowIndexStride, stripeSizeBytes);
        }
    }
}
