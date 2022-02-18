// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Target resources and allocation
 * 
 */
public final class CostAllocationProportionResponse extends io.pulumi.resources.InvokeArgs {

    public static final CostAllocationProportionResponse Empty = new CostAllocationProportionResponse();

    /**
     * Target resource for cost allocation
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Percentage of source cost to allocate to this resource. This value can be specified to two decimal places and the total percentage of all resources in this rule must sum to 100.00.
     * 
     */
    @InputImport(name="percentage", required=true)
    private final Double percentage;

    public Double getPercentage() {
        return this.percentage;
    }

    public CostAllocationProportionResponse(
        String name,
        Double percentage) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.percentage = Objects.requireNonNull(percentage, "expected parameter 'percentage' to be non-null");
    }

    private CostAllocationProportionResponse() {
        this.name = null;
        this.percentage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostAllocationProportionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Double percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(CostAllocationProportionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.percentage = defaults.percentage;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPercentage(Double percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }

        public CostAllocationProportionResponse build() {
            return new CostAllocationProportionResponse(name, percentage);
        }
    }
}
