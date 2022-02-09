// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudsearch_v1.enums.SortOptionsSortOrder;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SortOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SortOptionsArgs Empty = new SortOptionsArgs();

    @InputImport(name="operatorName")
    private final @Nullable Input<String> operatorName;

    public Input<String> getOperatorName() {
        return this.operatorName == null ? Input.empty() : this.operatorName;
    }

    @InputImport(name="sortOrder")
    private final @Nullable Input<SortOptionsSortOrder> sortOrder;

    public Input<SortOptionsSortOrder> getSortOrder() {
        return this.sortOrder == null ? Input.empty() : this.sortOrder;
    }

    public SortOptionsArgs(
        @Nullable Input<String> operatorName,
        @Nullable Input<SortOptionsSortOrder> sortOrder) {
        this.operatorName = operatorName;
        this.sortOrder = sortOrder;
    }

    private SortOptionsArgs() {
        this.operatorName = Input.empty();
        this.sortOrder = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SortOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> operatorName;
        private @Nullable Input<SortOptionsSortOrder> sortOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(SortOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operatorName = defaults.operatorName;
    	      this.sortOrder = defaults.sortOrder;
        }

        public Builder setOperatorName(@Nullable Input<String> operatorName) {
            this.operatorName = operatorName;
            return this;
        }

        public Builder setOperatorName(@Nullable String operatorName) {
            this.operatorName = Input.ofNullable(operatorName);
            return this;
        }

        public Builder setSortOrder(@Nullable Input<SortOptionsSortOrder> sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        public Builder setSortOrder(@Nullable SortOptionsSortOrder sortOrder) {
            this.sortOrder = Input.ofNullable(sortOrder);
            return this;
        }

        public SortOptionsArgs build() {
            return new SortOptionsArgs(operatorName, sortOrder);
        }
    }
}