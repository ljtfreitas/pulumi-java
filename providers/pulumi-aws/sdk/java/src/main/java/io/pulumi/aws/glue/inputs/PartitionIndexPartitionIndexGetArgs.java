// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PartitionIndexPartitionIndexGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PartitionIndexPartitionIndexGetArgs Empty = new PartitionIndexPartitionIndexGetArgs();

    /**
     * Name of the partition index.
     * 
     */
    @Import(name="indexName")
      private final @Nullable Output<String> indexName;

    public Output<String> getIndexName() {
        return this.indexName == null ? Output.empty() : this.indexName;
    }

    @Import(name="indexStatus")
      private final @Nullable Output<String> indexStatus;

    public Output<String> getIndexStatus() {
        return this.indexStatus == null ? Output.empty() : this.indexStatus;
    }

    /**
     * Keys for the partition index.
     * 
     */
    @Import(name="keys")
      private final @Nullable Output<List<String>> keys;

    public Output<List<String>> getKeys() {
        return this.keys == null ? Output.empty() : this.keys;
    }

    public PartitionIndexPartitionIndexGetArgs(
        @Nullable Output<String> indexName,
        @Nullable Output<String> indexStatus,
        @Nullable Output<List<String>> keys) {
        this.indexName = indexName;
        this.indexStatus = indexStatus;
        this.keys = keys;
    }

    private PartitionIndexPartitionIndexGetArgs() {
        this.indexName = Output.empty();
        this.indexStatus = Output.empty();
        this.keys = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartitionIndexPartitionIndexGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> indexName;
        private @Nullable Output<String> indexStatus;
        private @Nullable Output<List<String>> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(PartitionIndexPartitionIndexGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indexName = defaults.indexName;
    	      this.indexStatus = defaults.indexStatus;
    	      this.keys = defaults.keys;
        }

        public Builder indexName(@Nullable Output<String> indexName) {
            this.indexName = indexName;
            return this;
        }

        public Builder indexName(@Nullable String indexName) {
            this.indexName = Output.ofNullable(indexName);
            return this;
        }

        public Builder indexStatus(@Nullable Output<String> indexStatus) {
            this.indexStatus = indexStatus;
            return this;
        }

        public Builder indexStatus(@Nullable String indexStatus) {
            this.indexStatus = Output.ofNullable(indexStatus);
            return this;
        }

        public Builder keys(@Nullable Output<List<String>> keys) {
            this.keys = keys;
            return this;
        }

        public Builder keys(@Nullable List<String> keys) {
            this.keys = Output.ofNullable(keys);
            return this;
        }
        public PartitionIndexPartitionIndexGetArgs build() {
            return new PartitionIndexPartitionIndexGetArgs(indexName, indexStatus, keys);
        }
    }
}
