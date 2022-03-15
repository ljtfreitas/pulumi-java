// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.CassandraPartitionKeyArgs;
import io.pulumi.azurenative.documentdb.inputs.ClusterKeyArgs;
import io.pulumi.azurenative.documentdb.inputs.ColumnArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB Cassandra table schema
 * 
 */
public final class CassandraSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final CassandraSchemaArgs Empty = new CassandraSchemaArgs();

    /**
     * List of cluster key.
     * 
     */
    @Import(name="clusterKeys")
      private final @Nullable Output<List<ClusterKeyArgs>> clusterKeys;

    public Output<List<ClusterKeyArgs>> getClusterKeys() {
        return this.clusterKeys == null ? Output.empty() : this.clusterKeys;
    }

    /**
     * List of Cassandra table columns.
     * 
     */
    @Import(name="columns")
      private final @Nullable Output<List<ColumnArgs>> columns;

    public Output<List<ColumnArgs>> getColumns() {
        return this.columns == null ? Output.empty() : this.columns;
    }

    /**
     * List of partition key.
     * 
     */
    @Import(name="partitionKeys")
      private final @Nullable Output<List<CassandraPartitionKeyArgs>> partitionKeys;

    public Output<List<CassandraPartitionKeyArgs>> getPartitionKeys() {
        return this.partitionKeys == null ? Output.empty() : this.partitionKeys;
    }

    public CassandraSchemaArgs(
        @Nullable Output<List<ClusterKeyArgs>> clusterKeys,
        @Nullable Output<List<ColumnArgs>> columns,
        @Nullable Output<List<CassandraPartitionKeyArgs>> partitionKeys) {
        this.clusterKeys = clusterKeys;
        this.columns = columns;
        this.partitionKeys = partitionKeys;
    }

    private CassandraSchemaArgs() {
        this.clusterKeys = Output.empty();
        this.columns = Output.empty();
        this.partitionKeys = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CassandraSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ClusterKeyArgs>> clusterKeys;
        private @Nullable Output<List<ColumnArgs>> columns;
        private @Nullable Output<List<CassandraPartitionKeyArgs>> partitionKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(CassandraSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterKeys = defaults.clusterKeys;
    	      this.columns = defaults.columns;
    	      this.partitionKeys = defaults.partitionKeys;
        }

        public Builder clusterKeys(@Nullable Output<List<ClusterKeyArgs>> clusterKeys) {
            this.clusterKeys = clusterKeys;
            return this;
        }

        public Builder clusterKeys(@Nullable List<ClusterKeyArgs> clusterKeys) {
            this.clusterKeys = Output.ofNullable(clusterKeys);
            return this;
        }

        public Builder columns(@Nullable Output<List<ColumnArgs>> columns) {
            this.columns = columns;
            return this;
        }

        public Builder columns(@Nullable List<ColumnArgs> columns) {
            this.columns = Output.ofNullable(columns);
            return this;
        }

        public Builder partitionKeys(@Nullable Output<List<CassandraPartitionKeyArgs>> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }

        public Builder partitionKeys(@Nullable List<CassandraPartitionKeyArgs> partitionKeys) {
            this.partitionKeys = Output.ofNullable(partitionKeys);
            return this;
        }
        public CassandraSchemaArgs build() {
            return new CassandraSchemaArgs(clusterKeys, columns, partitionKeys);
        }
    }
}
