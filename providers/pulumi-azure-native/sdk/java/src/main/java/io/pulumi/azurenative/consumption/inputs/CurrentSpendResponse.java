// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.consumption.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * The current amount of cost which is being tracked for a budget.
 * 
 */
public final class CurrentSpendResponse extends io.pulumi.resources.InvokeArgs {

    public static final CurrentSpendResponse Empty = new CurrentSpendResponse();

    /**
     * The total amount of cost which is being tracked by the budget.
     * 
     */
    @InputImport(name="amount", required=true)
    private final Double amount;

    public Double getAmount() {
        return this.amount;
    }

    /**
     * The unit of measure for the budget amount.
     * 
     */
    @InputImport(name="unit", required=true)
    private final String unit;

    public String getUnit() {
        return this.unit;
    }

    public CurrentSpendResponse(
        Double amount,
        String unit) {
        this.amount = Objects.requireNonNull(amount, "expected parameter 'amount' to be non-null");
        this.unit = Objects.requireNonNull(unit, "expected parameter 'unit' to be non-null");
    }

    private CurrentSpendResponse() {
        this.amount = null;
        this.unit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CurrentSpendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double amount;
        private String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(CurrentSpendResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.unit = defaults.unit;
        }

        public Builder setAmount(Double amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public CurrentSpendResponse build() {
            return new CurrentSpendResponse(amount, unit);
        }
    }
}
