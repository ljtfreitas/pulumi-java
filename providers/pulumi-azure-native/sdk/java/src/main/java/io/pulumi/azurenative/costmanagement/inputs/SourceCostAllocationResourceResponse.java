// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Source resources for cost allocation
 * 
 */
public final class SourceCostAllocationResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceCostAllocationResourceResponse Empty = new SourceCostAllocationResourceResponse();

    /**
     * If resource type is dimension, this must be either ResourceGroupName or SubscriptionId. If resource type is tag, this must be a valid Azure tag
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Type of resources contained in this cost allocation rule
     * 
     */
    @InputImport(name="resourceType", required=true)
        private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    /**
     * Source Resources for cost allocation. This list cannot contain more than 25 values.
     * 
     */
    @InputImport(name="values", required=true)
        private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public SourceCostAllocationResourceResponse(
        String name,
        String resourceType,
        List<String> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private SourceCostAllocationResourceResponse() {
        this.name = null;
        this.resourceType = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceCostAllocationResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String resourceType;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceCostAllocationResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceType = defaults.resourceType;
    	      this.values = defaults.values;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public SourceCostAllocationResourceResponse build() {
            return new SourceCostAllocationResourceResponse(name, resourceType, values);
        }
    }
}
