// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamOrcSerDeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamOrcSerDeArgs Empty = new DeliveryStreamOrcSerDeArgs();

    @Import(name="blockSizeBytes")
      private final @Nullable Output<Integer> blockSizeBytes;

    public Output<Integer> getBlockSizeBytes() {
        return this.blockSizeBytes == null ? Output.empty() : this.blockSizeBytes;
    }

    @Import(name="bloomFilterColumns")
      private final @Nullable Output<List<String>> bloomFilterColumns;

    public Output<List<String>> getBloomFilterColumns() {
        return this.bloomFilterColumns == null ? Output.empty() : this.bloomFilterColumns;
    }

    @Import(name="bloomFilterFalsePositiveProbability")
      private final @Nullable Output<Double> bloomFilterFalsePositiveProbability;

    public Output<Double> getBloomFilterFalsePositiveProbability() {
        return this.bloomFilterFalsePositiveProbability == null ? Output.empty() : this.bloomFilterFalsePositiveProbability;
    }

    @Import(name="compression")
      private final @Nullable Output<String> compression;

    public Output<String> getCompression() {
        return this.compression == null ? Output.empty() : this.compression;
    }

    @Import(name="dictionaryKeyThreshold")
      private final @Nullable Output<Double> dictionaryKeyThreshold;

    public Output<Double> getDictionaryKeyThreshold() {
        return this.dictionaryKeyThreshold == null ? Output.empty() : this.dictionaryKeyThreshold;
    }

    @Import(name="enablePadding")
      private final @Nullable Output<Boolean> enablePadding;

    public Output<Boolean> getEnablePadding() {
        return this.enablePadding == null ? Output.empty() : this.enablePadding;
    }

    @Import(name="formatVersion")
      private final @Nullable Output<String> formatVersion;

    public Output<String> getFormatVersion() {
        return this.formatVersion == null ? Output.empty() : this.formatVersion;
    }

    @Import(name="paddingTolerance")
      private final @Nullable Output<Double> paddingTolerance;

    public Output<Double> getPaddingTolerance() {
        return this.paddingTolerance == null ? Output.empty() : this.paddingTolerance;
    }

    @Import(name="rowIndexStride")
      private final @Nullable Output<Integer> rowIndexStride;

    public Output<Integer> getRowIndexStride() {
        return this.rowIndexStride == null ? Output.empty() : this.rowIndexStride;
    }

    @Import(name="stripeSizeBytes")
      private final @Nullable Output<Integer> stripeSizeBytes;

    public Output<Integer> getStripeSizeBytes() {
        return this.stripeSizeBytes == null ? Output.empty() : this.stripeSizeBytes;
    }

    public DeliveryStreamOrcSerDeArgs(
        @Nullable Output<Integer> blockSizeBytes,
        @Nullable Output<List<String>> bloomFilterColumns,
        @Nullable Output<Double> bloomFilterFalsePositiveProbability,
        @Nullable Output<String> compression,
        @Nullable Output<Double> dictionaryKeyThreshold,
        @Nullable Output<Boolean> enablePadding,
        @Nullable Output<String> formatVersion,
        @Nullable Output<Double> paddingTolerance,
        @Nullable Output<Integer> rowIndexStride,
        @Nullable Output<Integer> stripeSizeBytes) {
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

    private DeliveryStreamOrcSerDeArgs() {
        this.blockSizeBytes = Output.empty();
        this.bloomFilterColumns = Output.empty();
        this.bloomFilterFalsePositiveProbability = Output.empty();
        this.compression = Output.empty();
        this.dictionaryKeyThreshold = Output.empty();
        this.enablePadding = Output.empty();
        this.formatVersion = Output.empty();
        this.paddingTolerance = Output.empty();
        this.rowIndexStride = Output.empty();
        this.stripeSizeBytes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamOrcSerDeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> blockSizeBytes;
        private @Nullable Output<List<String>> bloomFilterColumns;
        private @Nullable Output<Double> bloomFilterFalsePositiveProbability;
        private @Nullable Output<String> compression;
        private @Nullable Output<Double> dictionaryKeyThreshold;
        private @Nullable Output<Boolean> enablePadding;
        private @Nullable Output<String> formatVersion;
        private @Nullable Output<Double> paddingTolerance;
        private @Nullable Output<Integer> rowIndexStride;
        private @Nullable Output<Integer> stripeSizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamOrcSerDeArgs defaults) {
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

        public Builder blockSizeBytes(@Nullable Output<Integer> blockSizeBytes) {
            this.blockSizeBytes = blockSizeBytes;
            return this;
        }

        public Builder blockSizeBytes(@Nullable Integer blockSizeBytes) {
            this.blockSizeBytes = Output.ofNullable(blockSizeBytes);
            return this;
        }

        public Builder bloomFilterColumns(@Nullable Output<List<String>> bloomFilterColumns) {
            this.bloomFilterColumns = bloomFilterColumns;
            return this;
        }

        public Builder bloomFilterColumns(@Nullable List<String> bloomFilterColumns) {
            this.bloomFilterColumns = Output.ofNullable(bloomFilterColumns);
            return this;
        }

        public Builder bloomFilterFalsePositiveProbability(@Nullable Output<Double> bloomFilterFalsePositiveProbability) {
            this.bloomFilterFalsePositiveProbability = bloomFilterFalsePositiveProbability;
            return this;
        }

        public Builder bloomFilterFalsePositiveProbability(@Nullable Double bloomFilterFalsePositiveProbability) {
            this.bloomFilterFalsePositiveProbability = Output.ofNullable(bloomFilterFalsePositiveProbability);
            return this;
        }

        public Builder compression(@Nullable Output<String> compression) {
            this.compression = compression;
            return this;
        }

        public Builder compression(@Nullable String compression) {
            this.compression = Output.ofNullable(compression);
            return this;
        }

        public Builder dictionaryKeyThreshold(@Nullable Output<Double> dictionaryKeyThreshold) {
            this.dictionaryKeyThreshold = dictionaryKeyThreshold;
            return this;
        }

        public Builder dictionaryKeyThreshold(@Nullable Double dictionaryKeyThreshold) {
            this.dictionaryKeyThreshold = Output.ofNullable(dictionaryKeyThreshold);
            return this;
        }

        public Builder enablePadding(@Nullable Output<Boolean> enablePadding) {
            this.enablePadding = enablePadding;
            return this;
        }

        public Builder enablePadding(@Nullable Boolean enablePadding) {
            this.enablePadding = Output.ofNullable(enablePadding);
            return this;
        }

        public Builder formatVersion(@Nullable Output<String> formatVersion) {
            this.formatVersion = formatVersion;
            return this;
        }

        public Builder formatVersion(@Nullable String formatVersion) {
            this.formatVersion = Output.ofNullable(formatVersion);
            return this;
        }

        public Builder paddingTolerance(@Nullable Output<Double> paddingTolerance) {
            this.paddingTolerance = paddingTolerance;
            return this;
        }

        public Builder paddingTolerance(@Nullable Double paddingTolerance) {
            this.paddingTolerance = Output.ofNullable(paddingTolerance);
            return this;
        }

        public Builder rowIndexStride(@Nullable Output<Integer> rowIndexStride) {
            this.rowIndexStride = rowIndexStride;
            return this;
        }

        public Builder rowIndexStride(@Nullable Integer rowIndexStride) {
            this.rowIndexStride = Output.ofNullable(rowIndexStride);
            return this;
        }

        public Builder stripeSizeBytes(@Nullable Output<Integer> stripeSizeBytes) {
            this.stripeSizeBytes = stripeSizeBytes;
            return this;
        }

        public Builder stripeSizeBytes(@Nullable Integer stripeSizeBytes) {
            this.stripeSizeBytes = Output.ofNullable(stripeSizeBytes);
            return this;
        }
        public DeliveryStreamOrcSerDeArgs build() {
            return new DeliveryStreamOrcSerDeArgs(blockSizeBytes, bloomFilterColumns, bloomFilterFalsePositiveProbability, compression, dictionaryKeyThreshold, enablePadding, formatVersion, paddingTolerance, rowIndexStride, stripeSizeBytes);
        }
    }
}
