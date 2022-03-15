// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SortOptionsResponse {
    /**
     * Name of the operator corresponding to the field to sort on. The corresponding property must be marked as sortable.
     * 
     */
    private final String operatorName;
    /**
     * Ascending is the default sort order
     * 
     */
    private final String sortOrder;

    @CustomType.Constructor
    private SortOptionsResponse(
        @CustomType.Parameter("operatorName") String operatorName,
        @CustomType.Parameter("sortOrder") String sortOrder) {
        this.operatorName = operatorName;
        this.sortOrder = sortOrder;
    }

    /**
     * Name of the operator corresponding to the field to sort on. The corresponding property must be marked as sortable.
     * 
    */
    public String getOperatorName() {
        return this.operatorName;
    }
    /**
     * Ascending is the default sort order
     * 
    */
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SortOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operatorName;
        private String sortOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(SortOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operatorName = defaults.operatorName;
    	      this.sortOrder = defaults.sortOrder;
        }

        public Builder operatorName(String operatorName) {
            this.operatorName = Objects.requireNonNull(operatorName);
            return this;
        }

        public Builder sortOrder(String sortOrder) {
            this.sortOrder = Objects.requireNonNull(sortOrder);
            return this;
        }
        public SortOptionsResponse build() {
            return new SortOptionsResponse(operatorName, sortOrder);
        }
    }
}
