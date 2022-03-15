// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class BillingAccountSinkBigqueryOptions {
    /**
     * Whether to use [BigQuery's partition tables](https://cloud.google.com/bigquery/docs/partitioned-tables).
     * By default, Logging creates dated tables based on the log entries' timestamps, e.g. syslog_20170523. With partitioned
     * tables the date suffix is no longer present and [special query syntax](https://cloud.google.com/bigquery/docs/querying-partitioned-tables)
     * has to be used instead. In both cases, tables are sharded based on UTC timezone.
     * 
     */
    private final Boolean usePartitionedTables;

    @CustomType.Constructor
    private BillingAccountSinkBigqueryOptions(@CustomType.Parameter("usePartitionedTables") Boolean usePartitionedTables) {
        this.usePartitionedTables = usePartitionedTables;
    }

    /**
     * Whether to use [BigQuery's partition tables](https://cloud.google.com/bigquery/docs/partitioned-tables).
     * By default, Logging creates dated tables based on the log entries' timestamps, e.g. syslog_20170523. With partitioned
     * tables the date suffix is no longer present and [special query syntax](https://cloud.google.com/bigquery/docs/querying-partitioned-tables)
     * has to be used instead. In both cases, tables are sharded based on UTC timezone.
     * 
    */
    public Boolean getUsePartitionedTables() {
        return this.usePartitionedTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingAccountSinkBigqueryOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean usePartitionedTables;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingAccountSinkBigqueryOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.usePartitionedTables = defaults.usePartitionedTables;
        }

        public Builder usePartitionedTables(Boolean usePartitionedTables) {
            this.usePartitionedTables = Objects.requireNonNull(usePartitionedTables);
            return this;
        }
        public BillingAccountSinkBigqueryOptions build() {
            return new BillingAccountSinkBigqueryOptions(usePartitionedTables);
        }
    }
}
