// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureDatabricksDeltaLakeExportCommandResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Azure Databricks Delta Lake source.
 * 
 */
public final class AzureDatabricksDeltaLakeSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureDatabricksDeltaLakeSourceResponse Empty = new AzureDatabricksDeltaLakeSourceResponse();

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
     * Azure Databricks Delta Lake export settings.
     * 
     */
    @InputImport(name="exportSettings")
    private final @Nullable AzureDatabricksDeltaLakeExportCommandResponse exportSettings;

    public Optional<AzureDatabricksDeltaLakeExportCommandResponse> getExportSettings() {
        return this.exportSettings == null ? Optional.empty() : Optional.ofNullable(this.exportSettings);
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
     * Azure Databricks Delta Lake Sql query. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="query")
    private final @Nullable Object query;

    public Optional<Object> getQuery() {
        return this.query == null ? Optional.empty() : Optional.ofNullable(this.query);
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
     * Copy source type.
     * Expected value is 'AzureDatabricksDeltaLakeSource'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public AzureDatabricksDeltaLakeSourceResponse(
        @Nullable Object disableMetricsCollection,
        @Nullable AzureDatabricksDeltaLakeExportCommandResponse exportSettings,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object query,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        String type) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.exportSettings = exportSettings;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.query = query;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureDatabricksDeltaLakeSourceResponse() {
        this.disableMetricsCollection = null;
        this.exportSettings = null;
        this.maxConcurrentConnections = null;
        this.query = null;
        this.sourceRetryCount = null;
        this.sourceRetryWait = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDatabricksDeltaLakeSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object disableMetricsCollection;
        private @Nullable AzureDatabricksDeltaLakeExportCommandResponse exportSettings;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object query;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDatabricksDeltaLakeSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.exportSettings = defaults.exportSettings;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.query = defaults.query;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setExportSettings(@Nullable AzureDatabricksDeltaLakeExportCommandResponse exportSettings) {
            this.exportSettings = exportSettings;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setQuery(@Nullable Object query) {
            this.query = query;
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

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AzureDatabricksDeltaLakeSourceResponse build() {
            return new AzureDatabricksDeltaLakeSourceResponse(disableMetricsCollection, exportSettings, maxConcurrentConnections, query, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
