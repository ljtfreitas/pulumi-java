// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs Empty = new FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs();

    /**
     * The fractional portion, in cents, of the amount. Valid value range between `0` and `99`.
     * 
     */
    @InputImport(name="cents")
    private final @Nullable Input<Integer> cents;

    public Input<Integer> getCents() {
        return this.cents == null ? Input.empty() : this.cents;
    }

    /**
     * The whole number of dollars in the amount. Valid value range between `0` and `2`.
     * 
     */
    @InputImport(name="dollars")
    private final @Nullable Input<Integer> dollars;

    public Input<Integer> getDollars() {
        return this.dollars == null ? Input.empty() : this.dollars;
    }

    /**
     * Fractions of a cent, in tenths. Valid value range between `0` and `9`.
     * 
     */
    @InputImport(name="tenthFractionsOfACent")
    private final @Nullable Input<Integer> tenthFractionsOfACent;

    public Input<Integer> getTenthFractionsOfACent() {
        return this.tenthFractionsOfACent == null ? Input.empty() : this.tenthFractionsOfACent;
    }

    public FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs(
        @Nullable Input<Integer> cents,
        @Nullable Input<Integer> dollars,
        @Nullable Input<Integer> tenthFractionsOfACent) {
        this.cents = cents;
        this.dollars = dollars;
        this.tenthFractionsOfACent = tenthFractionsOfACent;
    }

    private FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs() {
        this.cents = Input.empty();
        this.dollars = Input.empty();
        this.tenthFractionsOfACent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> cents;
        private @Nullable Input<Integer> dollars;
        private @Nullable Input<Integer> tenthFractionsOfACent;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cents = defaults.cents;
    	      this.dollars = defaults.dollars;
    	      this.tenthFractionsOfACent = defaults.tenthFractionsOfACent;
        }

        public Builder setCents(@Nullable Input<Integer> cents) {
            this.cents = cents;
            return this;
        }

        public Builder setCents(@Nullable Integer cents) {
            this.cents = Input.ofNullable(cents);
            return this;
        }

        public Builder setDollars(@Nullable Input<Integer> dollars) {
            this.dollars = dollars;
            return this;
        }

        public Builder setDollars(@Nullable Integer dollars) {
            this.dollars = Input.ofNullable(dollars);
            return this;
        }

        public Builder setTenthFractionsOfACent(@Nullable Input<Integer> tenthFractionsOfACent) {
            this.tenthFractionsOfACent = tenthFractionsOfACent;
            return this;
        }

        public Builder setTenthFractionsOfACent(@Nullable Integer tenthFractionsOfACent) {
            this.tenthFractionsOfACent = Input.ofNullable(tenthFractionsOfACent);
            return this;
        }
        public FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs build() {
            return new FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs(cents, dollars, tenthFractionsOfACent);
        }
    }
}
