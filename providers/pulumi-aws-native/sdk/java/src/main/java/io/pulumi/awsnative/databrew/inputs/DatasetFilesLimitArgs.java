// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.enums.DatasetFilesLimitOrder;
import io.pulumi.awsnative.databrew.enums.DatasetFilesLimitOrderedBy;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetFilesLimitArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetFilesLimitArgs Empty = new DatasetFilesLimitArgs();

    /**
     * Maximum number of files
     * 
     */
    @InputImport(name="maxFiles", required=true)
        private final Input<Integer> maxFiles;

    public Input<Integer> getMaxFiles() {
        return this.maxFiles;
    }

    /**
     * Order
     * 
     */
    @InputImport(name="order")
        private final @Nullable Input<DatasetFilesLimitOrder> order;

    public Input<DatasetFilesLimitOrder> getOrder() {
        return this.order == null ? Input.empty() : this.order;
    }

    /**
     * Ordered by
     * 
     */
    @InputImport(name="orderedBy")
        private final @Nullable Input<DatasetFilesLimitOrderedBy> orderedBy;

    public Input<DatasetFilesLimitOrderedBy> getOrderedBy() {
        return this.orderedBy == null ? Input.empty() : this.orderedBy;
    }

    public DatasetFilesLimitArgs(
        Input<Integer> maxFiles,
        @Nullable Input<DatasetFilesLimitOrder> order,
        @Nullable Input<DatasetFilesLimitOrderedBy> orderedBy) {
        this.maxFiles = Objects.requireNonNull(maxFiles, "expected parameter 'maxFiles' to be non-null");
        this.order = order;
        this.orderedBy = orderedBy;
    }

    private DatasetFilesLimitArgs() {
        this.maxFiles = Input.empty();
        this.order = Input.empty();
        this.orderedBy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetFilesLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxFiles;
        private @Nullable Input<DatasetFilesLimitOrder> order;
        private @Nullable Input<DatasetFilesLimitOrderedBy> orderedBy;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetFilesLimitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxFiles = defaults.maxFiles;
    	      this.order = defaults.order;
    	      this.orderedBy = defaults.orderedBy;
        }

        public Builder setMaxFiles(Input<Integer> maxFiles) {
            this.maxFiles = Objects.requireNonNull(maxFiles);
            return this;
        }

        public Builder setMaxFiles(Integer maxFiles) {
            this.maxFiles = Input.of(Objects.requireNonNull(maxFiles));
            return this;
        }

        public Builder setOrder(@Nullable Input<DatasetFilesLimitOrder> order) {
            this.order = order;
            return this;
        }

        public Builder setOrder(@Nullable DatasetFilesLimitOrder order) {
            this.order = Input.ofNullable(order);
            return this;
        }

        public Builder setOrderedBy(@Nullable Input<DatasetFilesLimitOrderedBy> orderedBy) {
            this.orderedBy = orderedBy;
            return this;
        }

        public Builder setOrderedBy(@Nullable DatasetFilesLimitOrderedBy orderedBy) {
            this.orderedBy = Input.ofNullable(orderedBy);
            return this;
        }
        public DatasetFilesLimitArgs build() {
            return new DatasetFilesLimitArgs(maxFiles, order, orderedBy);
        }
    }
}
