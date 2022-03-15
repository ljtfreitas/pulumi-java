// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.logging_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Options that change functionality of a sink exporting data to BigQuery.
 * 
 */
public final class BigQueryOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BigQueryOptionsArgs Empty = new BigQueryOptionsArgs();

    /**
     * Optional. Whether to use BigQuery's partition tables (https://cloud.google.com/bigquery/docs/partitioned-tables). By default, Cloud Logging creates dated tables based on the log entries' timestamps, e.g. syslog_20170523. With partitioned tables the date suffix is no longer present and special query syntax (https://cloud.google.com/bigquery/docs/querying-partitioned-tables) has to be used instead. In both cases, tables are sharded based on UTC timezone.
     * 
     */
    @Import(name="usePartitionedTables")
      private final @Nullable Output<Boolean> usePartitionedTables;

    public Output<Boolean> getUsePartitionedTables() {
        return this.usePartitionedTables == null ? Output.empty() : this.usePartitionedTables;
    }

    public BigQueryOptionsArgs(@Nullable Output<Boolean> usePartitionedTables) {
        this.usePartitionedTables = usePartitionedTables;
    }

    private BigQueryOptionsArgs() {
        this.usePartitionedTables = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigQueryOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> usePartitionedTables;

        public Builder() {
    	      // Empty
        }

        public Builder(BigQueryOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.usePartitionedTables = defaults.usePartitionedTables;
        }

        public Builder usePartitionedTables(@Nullable Output<Boolean> usePartitionedTables) {
            this.usePartitionedTables = usePartitionedTables;
            return this;
        }

        public Builder usePartitionedTables(@Nullable Boolean usePartitionedTables) {
            this.usePartitionedTables = Output.ofNullable(usePartitionedTables);
            return this;
        }
        public BigQueryOptionsArgs build() {
            return new BigQueryOptionsArgs(usePartitionedTables);
        }
    }
}
