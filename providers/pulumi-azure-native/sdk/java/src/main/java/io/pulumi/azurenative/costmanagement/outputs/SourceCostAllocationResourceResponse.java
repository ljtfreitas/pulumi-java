// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SourceCostAllocationResourceResponse {
    /**
     * If resource type is dimension, this must be either ResourceGroupName or SubscriptionId. If resource type is tag, this must be a valid Azure tag
     * 
     */
    private final String name;
    /**
     * Type of resources contained in this cost allocation rule
     * 
     */
    private final String resourceType;
    /**
     * Source Resources for cost allocation. This list cannot contain more than 25 values.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor({"name","resourceType","values"})
    private SourceCostAllocationResourceResponse(
        String name,
        String resourceType,
        List<String> values) {
        this.name = Objects.requireNonNull(name);
        this.resourceType = Objects.requireNonNull(resourceType);
        this.values = Objects.requireNonNull(values);
    }

    /**
     * If resource type is dimension, this must be either ResourceGroupName or SubscriptionId. If resource type is tag, this must be a valid Azure tag
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Type of resources contained in this cost allocation rule
     * 
     */
    public String getPropResourceType() {
        return this.resourceType;
    }
    /**
     * Source Resources for cost allocation. This list cannot contain more than 25 values.
     * 
     */
    public List<String> getValues() {
        return this.values;
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
