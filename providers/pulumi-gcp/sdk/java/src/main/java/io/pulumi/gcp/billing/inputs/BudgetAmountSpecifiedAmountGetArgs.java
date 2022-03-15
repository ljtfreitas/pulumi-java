// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetAmountSpecifiedAmountGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetAmountSpecifiedAmountGetArgs Empty = new BudgetAmountSpecifiedAmountGetArgs();

    /**
     * The 3-letter currency code defined in ISO 4217.
     * 
     */
    @Import(name="currencyCode")
      private final @Nullable Output<String> currencyCode;

    public Output<String> getCurrencyCode() {
        return this.currencyCode == null ? Output.empty() : this.currencyCode;
    }

    /**
     * Number of nano (10^-9) units of the amount.
     * The value must be between -999,999,999 and +999,999,999
     * inclusive. If units is positive, nanos must be positive or
     * zero. If units is zero, nanos can be positive, zero, or
     * negative. If units is negative, nanos must be negative or
     * zero. For example $-1.75 is represented as units=-1 and
     * nanos=-750,000,000.
     * 
     */
    @Import(name="nanos")
      private final @Nullable Output<Integer> nanos;

    public Output<Integer> getNanos() {
        return this.nanos == null ? Output.empty() : this.nanos;
    }

    /**
     * The whole units of the amount. For example if currencyCode
     * is "USD", then 1 unit is one US dollar.
     * 
     */
    @Import(name="units")
      private final @Nullable Output<String> units;

    public Output<String> getUnits() {
        return this.units == null ? Output.empty() : this.units;
    }

    public BudgetAmountSpecifiedAmountGetArgs(
        @Nullable Output<String> currencyCode,
        @Nullable Output<Integer> nanos,
        @Nullable Output<String> units) {
        this.currencyCode = currencyCode;
        this.nanos = nanos;
        this.units = units;
    }

    private BudgetAmountSpecifiedAmountGetArgs() {
        this.currencyCode = Output.empty();
        this.nanos = Output.empty();
        this.units = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetAmountSpecifiedAmountGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> currencyCode;
        private @Nullable Output<Integer> nanos;
        private @Nullable Output<String> units;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetAmountSpecifiedAmountGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currencyCode = defaults.currencyCode;
    	      this.nanos = defaults.nanos;
    	      this.units = defaults.units;
        }

        public Builder currencyCode(@Nullable Output<String> currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public Builder currencyCode(@Nullable String currencyCode) {
            this.currencyCode = Output.ofNullable(currencyCode);
            return this;
        }

        public Builder nanos(@Nullable Output<Integer> nanos) {
            this.nanos = nanos;
            return this;
        }

        public Builder nanos(@Nullable Integer nanos) {
            this.nanos = Output.ofNullable(nanos);
            return this;
        }

        public Builder units(@Nullable Output<String> units) {
            this.units = units;
            return this;
        }

        public Builder units(@Nullable String units) {
            this.units = Output.ofNullable(units);
            return this;
        }
        public BudgetAmountSpecifiedAmountGetArgs build() {
            return new BudgetAmountSpecifiedAmountGetArgs(currencyCode, nanos, units);
        }
    }
}
