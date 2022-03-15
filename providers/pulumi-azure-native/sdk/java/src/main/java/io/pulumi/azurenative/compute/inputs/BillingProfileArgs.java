// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the billing related details of a Azure Spot VM or VMSS. <br><br>Minimum api-version: 2019-03-01.
 * 
 */
public final class BillingProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final BillingProfileArgs Empty = new BillingProfileArgs();

    /**
     * Specifies the maximum price you are willing to pay for a Azure Spot VM/VMSS. This price is in US Dollars. <br><br> This price will be compared with the current Azure Spot price for the VM size. Also, the prices are compared at the time of create/update of Azure Spot VM/VMSS and the operation will only succeed if  the maxPrice is greater than the current Azure Spot price. <br><br> The maxPrice will also be used for evicting a Azure Spot VM/VMSS if the current Azure Spot price goes beyond the maxPrice after creation of VM/VMSS. <br><br> Possible values are: <br><br> - Any decimal value greater than zero. Example: 0.01538 <br><br> -1 – indicates default price to be up-to on-demand. <br><br> You can set the maxPrice to -1 to indicate that the Azure Spot VM/VMSS should not be evicted for price reasons. Also, the default max price is -1 if it is not provided by you. <br><br>Minimum api-version: 2019-03-01.
     * 
     */
    @Import(name="maxPrice")
      private final @Nullable Output<Double> maxPrice;

    public Output<Double> getMaxPrice() {
        return this.maxPrice == null ? Output.empty() : this.maxPrice;
    }

    public BillingProfileArgs(@Nullable Output<Double> maxPrice) {
        this.maxPrice = maxPrice;
    }

    private BillingProfileArgs() {
        this.maxPrice = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> maxPrice;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPrice = defaults.maxPrice;
        }

        public Builder maxPrice(@Nullable Output<Double> maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }

        public Builder maxPrice(@Nullable Double maxPrice) {
            this.maxPrice = Output.ofNullable(maxPrice);
            return this;
        }
        public BillingProfileArgs build() {
            return new BillingProfileArgs(maxPrice);
        }
    }
}
