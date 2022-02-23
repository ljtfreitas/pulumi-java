// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AmazonS3CompatibleReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonS3ReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobFSReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataLakeStoreReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureFileStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.FileServerReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.FtpReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.GoogleCloudStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.HdfsReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.HttpReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.OracleCloudStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.SftpReadSettingsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OrcSourceResponse {
    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    private final @Nullable Object additionalColumns;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sourceRetryCount;
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sourceRetryWait;
    /**
     * ORC store settings.
     * 
     */
    private final @Nullable Object storeSettings;
    /**
     * Copy source type.
     * Expected value is 'OrcSource'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"additionalColumns","disableMetricsCollection","maxConcurrentConnections","sourceRetryCount","sourceRetryWait","storeSettings","type"})
    private OrcSourceResponse(
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
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    public Optional<Object> getAdditionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> getSourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> getSourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }
    /**
     * ORC store settings.
     * 
     */
    public Optional<Object> getStoreSettings() {
        return Optional.ofNullable(this.storeSettings);
    }
    /**
     * Copy source type.
     * Expected value is 'OrcSource'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrcSourceResponse defaults) {
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

        public Builder(OrcSourceResponse defaults) {
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
        public OrcSourceResponse build() {
            return new OrcSourceResponse(additionalColumns, disableMetricsCollection, maxConcurrentConnections, sourceRetryCount, sourceRetryWait, storeSettings, type);
        }
    }
}
