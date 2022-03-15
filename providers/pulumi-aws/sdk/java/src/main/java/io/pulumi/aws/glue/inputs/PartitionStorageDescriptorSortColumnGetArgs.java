// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class PartitionStorageDescriptorSortColumnGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PartitionStorageDescriptorSortColumnGetArgs Empty = new PartitionStorageDescriptorSortColumnGetArgs();

    /**
     * The name of the column.
     * 
     */
    @Import(name="column", required=true)
      private final Output<String> column;

    public Output<String> getColumn() {
        return this.column;
    }

    /**
     * Indicates that the column is sorted in ascending order (== 1), or in descending order (==0).
     * 
     */
    @Import(name="sortOrder", required=true)
      private final Output<Integer> sortOrder;

    public Output<Integer> getSortOrder() {
        return this.sortOrder;
    }

    public PartitionStorageDescriptorSortColumnGetArgs(
        Output<String> column,
        Output<Integer> sortOrder) {
        this.column = Objects.requireNonNull(column, "expected parameter 'column' to be non-null");
        this.sortOrder = Objects.requireNonNull(sortOrder, "expected parameter 'sortOrder' to be non-null");
    }

    private PartitionStorageDescriptorSortColumnGetArgs() {
        this.column = Output.empty();
        this.sortOrder = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartitionStorageDescriptorSortColumnGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> column;
        private Output<Integer> sortOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(PartitionStorageDescriptorSortColumnGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.sortOrder = defaults.sortOrder;
        }

        public Builder column(Output<String> column) {
            this.column = Objects.requireNonNull(column);
            return this;
        }

        public Builder column(String column) {
            this.column = Output.of(Objects.requireNonNull(column));
            return this;
        }

        public Builder sortOrder(Output<Integer> sortOrder) {
            this.sortOrder = Objects.requireNonNull(sortOrder);
            return this;
        }

        public Builder sortOrder(Integer sortOrder) {
            this.sortOrder = Output.of(Objects.requireNonNull(sortOrder));
            return this;
        }
        public PartitionStorageDescriptorSortColumnGetArgs build() {
            return new PartitionStorageDescriptorSortColumnGetArgs(column, sortOrder);
        }
    }
}
