// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CatalogTablePartitionIndexArgs extends io.pulumi.resources.ResourceArgs {

    public static final CatalogTablePartitionIndexArgs Empty = new CatalogTablePartitionIndexArgs();

    /**
     * Name of the partition index.
     * 
     */
    @Import(name="indexName", required=true)
      private final Output<String> indexName;

    public Output<String> getIndexName() {
        return this.indexName;
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
    @Import(name="keys", required=true)
      private final Output<List<String>> keys;

    public Output<List<String>> getKeys() {
        return this.keys;
    }

    public CatalogTablePartitionIndexArgs(
        Output<String> indexName,
        @Nullable Output<String> indexStatus,
        Output<List<String>> keys) {
        this.indexName = Objects.requireNonNull(indexName, "expected parameter 'indexName' to be non-null");
        this.indexStatus = indexStatus;
        this.keys = Objects.requireNonNull(keys, "expected parameter 'keys' to be non-null");
    }

    private CatalogTablePartitionIndexArgs() {
        this.indexName = Output.empty();
        this.indexStatus = Output.empty();
        this.keys = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTablePartitionIndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> indexName;
        private @Nullable Output<String> indexStatus;
        private Output<List<String>> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTablePartitionIndexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indexName = defaults.indexName;
    	      this.indexStatus = defaults.indexStatus;
    	      this.keys = defaults.keys;
        }

        public Builder indexName(Output<String> indexName) {
            this.indexName = Objects.requireNonNull(indexName);
            return this;
        }

        public Builder indexName(String indexName) {
            this.indexName = Output.of(Objects.requireNonNull(indexName));
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

        public Builder keys(Output<List<String>> keys) {
            this.keys = Objects.requireNonNull(keys);
            return this;
        }

        public Builder keys(List<String> keys) {
            this.keys = Output.of(Objects.requireNonNull(keys));
            return this;
        }
        public CatalogTablePartitionIndexArgs build() {
            return new CatalogTablePartitionIndexArgs(indexName, indexStatus, keys);
        }
    }
}
