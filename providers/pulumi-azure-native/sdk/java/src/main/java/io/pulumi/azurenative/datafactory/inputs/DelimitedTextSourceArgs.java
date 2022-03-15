// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AmazonS3ReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobFSReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobStorageReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureFileStorageReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.DelimitedTextReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.FileServerReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.FtpReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.HdfsReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.HttpReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.OracleCloudStorageReadSettingsArgs;
import io.pulumi.azurenative.datafactory.inputs.SftpReadSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity DelimitedText source.
 * 
 */
public final class DelimitedTextSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DelimitedTextSourceArgs Empty = new DelimitedTextSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
      private final @Nullable Output<Object> additionalColumns;

    public Output<Object> getAdditionalColumns() {
        return this.additionalColumns == null ? Output.empty() : this.additionalColumns;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
      private final @Nullable Output<Object> disableMetricsCollection;

    public Output<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Output.empty() : this.disableMetricsCollection;
    }

    /**
     * DelimitedText format settings.
     * 
     */
    @Import(name="formatSettings")
      private final @Nullable Output<DelimitedTextReadSettingsArgs> formatSettings;

    public Output<DelimitedTextReadSettingsArgs> getFormatSettings() {
        return this.formatSettings == null ? Output.empty() : this.formatSettings;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
      private final @Nullable Output<Object> maxConcurrentConnections;

    public Output<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Output.empty() : this.maxConcurrentConnections;
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
      private final @Nullable Output<Object> sourceRetryCount;

    public Output<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Output.empty() : this.sourceRetryCount;
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
      private final @Nullable Output<Object> sourceRetryWait;

    public Output<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Output.empty() : this.sourceRetryWait;
    }

    /**
     * DelimitedText store settings.
     * 
     */
    @Import(name="storeSettings")
      private final @Nullable Output<Object> storeSettings;

    public Output<Object> getStoreSettings() {
        return this.storeSettings == null ? Output.empty() : this.storeSettings;
    }

    /**
     * Copy source type.
     * Expected value is 'DelimitedTextSource'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public DelimitedTextSourceArgs(
        @Nullable Output<Object> additionalColumns,
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<DelimitedTextReadSettingsArgs> formatSettings,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> sourceRetryCount,
        @Nullable Output<Object> sourceRetryWait,
        @Nullable Output<Object> storeSettings,
        Output<String> type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.formatSettings = formatSettings;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.storeSettings = storeSettings;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DelimitedTextSourceArgs() {
        this.additionalColumns = Output.empty();
        this.disableMetricsCollection = Output.empty();
        this.formatSettings = Output.empty();
        this.maxConcurrentConnections = Output.empty();
        this.sourceRetryCount = Output.empty();
        this.sourceRetryWait = Output.empty();
        this.storeSettings = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelimitedTextSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> additionalColumns;
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<DelimitedTextReadSettingsArgs> formatSettings;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> sourceRetryCount;
        private @Nullable Output<Object> sourceRetryWait;
        private @Nullable Output<Object> storeSettings;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DelimitedTextSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.formatSettings = defaults.formatSettings;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.storeSettings = defaults.storeSettings;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Output<Object> additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = Output.ofNullable(additionalColumns);
            return this;
        }

        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Output.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder formatSettings(@Nullable Output<DelimitedTextReadSettingsArgs> formatSettings) {
            this.formatSettings = formatSettings;
            return this;
        }

        public Builder formatSettings(@Nullable DelimitedTextReadSettingsArgs formatSettings) {
            this.formatSettings = Output.ofNullable(formatSettings);
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Output.ofNullable(maxConcurrentConnections);
            return this;
        }

        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Output.ofNullable(sourceRetryCount);
            return this;
        }

        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Output.ofNullable(sourceRetryWait);
            return this;
        }

        public Builder storeSettings(@Nullable Output<Object> storeSettings) {
            this.storeSettings = storeSettings;
            return this;
        }

        public Builder storeSettings(@Nullable Object storeSettings) {
            this.storeSettings = Output.ofNullable(storeSettings);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public DelimitedTextSourceArgs build() {
            return new DelimitedTextSourceArgs(additionalColumns, disableMetricsCollection, formatSettings, maxConcurrentConnections, sourceRetryCount, sourceRetryWait, storeSettings, type);
        }
    }
}
