// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SnowflakeExportCopyCommandArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity snowflake source.
 * 
 */
public final class SnowflakeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnowflakeSourceArgs Empty = new SnowflakeSourceArgs();

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
     * Snowflake export settings.
     * 
     */
    @Import(name="exportSettings")
      private final @Nullable Output<SnowflakeExportCopyCommandArgs> exportSettings;

    public Output<SnowflakeExportCopyCommandArgs> getExportSettings() {
        return this.exportSettings == null ? Output.empty() : this.exportSettings;
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
     * Snowflake Sql query. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="query")
      private final @Nullable Output<Object> query;

    public Output<Object> getQuery() {
        return this.query == null ? Output.empty() : this.query;
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
     * Copy source type.
     * Expected value is 'SnowflakeSource'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public SnowflakeSourceArgs(
        @Nullable Output<Object> disableMetricsCollection,
        @Nullable Output<SnowflakeExportCopyCommandArgs> exportSettings,
        @Nullable Output<Object> maxConcurrentConnections,
        @Nullable Output<Object> query,
        @Nullable Output<Object> sourceRetryCount,
        @Nullable Output<Object> sourceRetryWait,
        Output<String> type) {
        this.disableMetricsCollection = disableMetricsCollection;
        this.exportSettings = exportSettings;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.query = query;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SnowflakeSourceArgs() {
        this.disableMetricsCollection = Output.empty();
        this.exportSettings = Output.empty();
        this.maxConcurrentConnections = Output.empty();
        this.query = Output.empty();
        this.sourceRetryCount = Output.empty();
        this.sourceRetryWait = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnowflakeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> disableMetricsCollection;
        private @Nullable Output<SnowflakeExportCopyCommandArgs> exportSettings;
        private @Nullable Output<Object> maxConcurrentConnections;
        private @Nullable Output<Object> query;
        private @Nullable Output<Object> sourceRetryCount;
        private @Nullable Output<Object> sourceRetryWait;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SnowflakeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.exportSettings = defaults.exportSettings;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.query = defaults.query;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Output.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder exportSettings(@Nullable Output<SnowflakeExportCopyCommandArgs> exportSettings) {
            this.exportSettings = exportSettings;
            return this;
        }

        public Builder exportSettings(@Nullable SnowflakeExportCopyCommandArgs exportSettings) {
            this.exportSettings = Output.ofNullable(exportSettings);
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

        public Builder query(@Nullable Output<Object> query) {
            this.query = query;
            return this;
        }

        public Builder query(@Nullable Object query) {
            this.query = Output.ofNullable(query);
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

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public SnowflakeSourceArgs build() {
            return new SnowflakeSourceArgs(disableMetricsCollection, exportSettings, maxConcurrentConnections, query, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
