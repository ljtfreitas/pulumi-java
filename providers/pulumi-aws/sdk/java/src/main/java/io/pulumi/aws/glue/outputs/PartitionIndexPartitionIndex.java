// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PartitionIndexPartitionIndex {
    /**
     * Name of the partition index.
     * 
     */
    private final @Nullable String indexName;
    private final @Nullable String indexStatus;
    /**
     * Keys for the partition index.
     * 
     */
    private final @Nullable List<String> keys;

    @OutputCustomType.Constructor({"indexName","indexStatus","keys"})
    private PartitionIndexPartitionIndex(
        @Nullable String indexName,
        @Nullable String indexStatus,
        @Nullable List<String> keys) {
        this.indexName = indexName;
        this.indexStatus = indexStatus;
        this.keys = keys;
    }

    /**
     * Name of the partition index.
     * 
     */
    public Optional<String> getIndexName() {
        return Optional.ofNullable(this.indexName);
    }
    public Optional<String> getIndexStatus() {
        return Optional.ofNullable(this.indexStatus);
    }
    /**
     * Keys for the partition index.
     * 
     */
    public List<String> getKeys() {
        return this.keys == null ? List.of() : this.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartitionIndexPartitionIndex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String indexName;
        private @Nullable String indexStatus;
        private @Nullable List<String> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(PartitionIndexPartitionIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indexName = defaults.indexName;
    	      this.indexStatus = defaults.indexStatus;
    	      this.keys = defaults.keys;
        }

        public Builder setIndexName(@Nullable String indexName) {
            this.indexName = indexName;
            return this;
        }

        public Builder setIndexStatus(@Nullable String indexStatus) {
            this.indexStatus = indexStatus;
            return this;
        }

        public Builder setKeys(@Nullable List<String> keys) {
            this.keys = keys;
            return this;
        }
        public PartitionIndexPartitionIndex build() {
            return new PartitionIndexPartitionIndex(indexName, indexStatus, keys);
        }
    }
}
