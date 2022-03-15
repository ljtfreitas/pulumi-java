// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.azurenative.labservices.outputs.OperationBatchStatusResponseItemResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGlobalUserOperationBatchStatusResult {
    /**
     * Gets a collection of items that contain the operation url and status.
     * 
     */
    private final List<OperationBatchStatusResponseItemResponse> items;

    @CustomType.Constructor
    private GetGlobalUserOperationBatchStatusResult(@CustomType.Parameter("items") List<OperationBatchStatusResponseItemResponse> items) {
        this.items = items;
    }

    /**
     * Gets a collection of items that contain the operation url and status.
     * 
    */
    public List<OperationBatchStatusResponseItemResponse> getItems() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalUserOperationBatchStatusResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<OperationBatchStatusResponseItemResponse> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalUserOperationBatchStatusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<OperationBatchStatusResponseItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public GetGlobalUserOperationBatchStatusResult build() {
            return new GetGlobalUserOperationBatchStatusResult(items);
        }
    }
}
