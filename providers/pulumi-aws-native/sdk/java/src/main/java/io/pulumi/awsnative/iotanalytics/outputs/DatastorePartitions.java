// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.awsnative.iotanalytics.outputs.DatastorePartition;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatastorePartitions {
    private final @Nullable List<DatastorePartition> partitions;

    @OutputCustomType.Constructor
    private DatastorePartitions(@OutputCustomType.Parameter("partitions") @Nullable List<DatastorePartition> partitions) {
        this.partitions = partitions;
    }

    public List<DatastorePartition> getPartitions() {
        return this.partitions == null ? List.of() : this.partitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastorePartitions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DatastorePartition> partitions;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastorePartitions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitions = defaults.partitions;
        }

        public Builder setPartitions(@Nullable List<DatastorePartition> partitions) {
            this.partitions = partitions;
            return this;
        }
        public DatastorePartitions build() {
            return new DatastorePartitions(partitions);
        }
    }
}
