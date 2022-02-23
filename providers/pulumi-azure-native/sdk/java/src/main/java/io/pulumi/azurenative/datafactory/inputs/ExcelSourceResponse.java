// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.AmazonS3ReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobFSReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureFileStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.FileServerReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.FtpReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.HdfsReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.HttpReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.OracleCloudStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.SftpReadSettingsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity excel source.
 * 
 */
public final class ExcelSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExcelSourceResponse Empty = new ExcelSourceResponse();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @InputImport(name="additionalColumns")
        private final @Nullable Object additionalColumns;

    public Optional<Object> getAdditionalColumns() {
        return this.additionalColumns == null ? Optional.empty() : Optional.ofNullable(this.additionalColumns);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
        private final @Nullable Object disableMetricsCollection;

    public Optional<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
        private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sourceRetryCount")
        private final @Nullable Object sourceRetryCount;

    public Optional<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sourceRetryWait")
        private final @Nullable Object sourceRetryWait;

    public Optional<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Excel store settings.
     * 
     */
    @InputImport(name="storeSettings")
        private final @Nullable Object storeSettings;

    public Object getStoreSettings() {
        return this.storeSettings == null ? null : this.storeSettings;
    }

    /**
     * Copy source type.
     * Expected value is 'ExcelSource'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public ExcelSourceResponse(
        @Nullable Object additionalColumns,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        @Nullable Object storeSettings,
        String type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.storeSettings = storeSettings;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ExcelSourceResponse() {
        this.additionalColumns = null;
        this.disableMetricsCollection = null;
        this.maxConcurrentConnections = null;
        this.sourceRetryCount = null;
        this.sourceRetryWait = null;
        this.storeSettings = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExcelSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private @Nullable Object storeSettings;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExcelSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.storeSettings = defaults.storeSettings;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder setStoreSettings(@Nullable Object storeSettings) {
            this.storeSettings = storeSettings;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ExcelSourceResponse build() {
            return new ExcelSourceResponse(additionalColumns, disableMetricsCollection, maxConcurrentConnections, sourceRetryCount, sourceRetryWait, storeSettings, type);
        }
    }
}
