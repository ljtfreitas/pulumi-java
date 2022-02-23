// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.BlobInventoryPolicyFilterResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class BlobInventoryPolicyDefinitionResponse {
    /**
     * An object that defines the filter set.
     * 
     */
    private final BlobInventoryPolicyFilterResponse filters;

    @OutputCustomType.Constructor({"filters"})
    private BlobInventoryPolicyDefinitionResponse(BlobInventoryPolicyFilterResponse filters) {
        this.filters = Objects.requireNonNull(filters);
    }

    /**
     * An object that defines the filter set.
     * 
     */
    public BlobInventoryPolicyFilterResponse getFilters() {
        return this.filters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobInventoryPolicyDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobInventoryPolicyFilterResponse filters;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobInventoryPolicyDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
        }

        public Builder setFilters(BlobInventoryPolicyFilterResponse filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }
        public BlobInventoryPolicyDefinitionResponse build() {
            return new BlobInventoryPolicyDefinitionResponse(filters);
        }
    }
}
