// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.glue.inputs.PartitionIndexPartitionIndexArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PartitionIndexArgs extends io.pulumi.resources.ResourceArgs {

    public static final PartitionIndexArgs Empty = new PartitionIndexArgs();

    /**
     * The catalog ID where the table resides.
     * 
     */
    @InputImport(name="catalogId")
    private final @Nullable Input<String> catalogId;

    public Input<String> getCatalogId() {
        return this.catalogId == null ? Input.empty() : this.catalogId;
    }

    /**
     * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     * 
     */
    @InputImport(name="databaseName", required=true)
    private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Configuration block for a partition index. See `partition_index` below.
     * 
     */
    @InputImport(name="partitionIndex", required=true)
    private final Input<PartitionIndexPartitionIndexArgs> partitionIndex;

    public Input<PartitionIndexPartitionIndexArgs> getPartitionIndex() {
        return this.partitionIndex;
    }

    /**
     * Name of the table. For Hive compatibility, this must be entirely lowercase.
     * 
     */
    @InputImport(name="tableName", required=true)
    private final Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName;
    }

    public PartitionIndexArgs(
        @Nullable Input<String> catalogId,
        Input<String> databaseName,
        Input<PartitionIndexPartitionIndexArgs> partitionIndex,
        Input<String> tableName) {
        this.catalogId = catalogId;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.partitionIndex = Objects.requireNonNull(partitionIndex, "expected parameter 'partitionIndex' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private PartitionIndexArgs() {
        this.catalogId = Input.empty();
        this.databaseName = Input.empty();
        this.partitionIndex = Input.empty();
        this.tableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartitionIndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> catalogId;
        private Input<String> databaseName;
        private Input<PartitionIndexPartitionIndexArgs> partitionIndex;
        private Input<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(PartitionIndexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
    	      this.partitionIndex = defaults.partitionIndex;
    	      this.tableName = defaults.tableName;
        }

        public Builder setCatalogId(@Nullable Input<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder setCatalogId(@Nullable String catalogId) {
            this.catalogId = Input.ofNullable(catalogId);
            return this;
        }

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setPartitionIndex(Input<PartitionIndexPartitionIndexArgs> partitionIndex) {
            this.partitionIndex = Objects.requireNonNull(partitionIndex);
            return this;
        }

        public Builder setPartitionIndex(PartitionIndexPartitionIndexArgs partitionIndex) {
            this.partitionIndex = Input.of(Objects.requireNonNull(partitionIndex));
            return this;
        }

        public Builder setTableName(Input<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Input.of(Objects.requireNonNull(tableName));
            return this;
        }
        public PartitionIndexArgs build() {
            return new PartitionIndexArgs(catalogId, databaseName, partitionIndex, tableName);
        }
    }
}
