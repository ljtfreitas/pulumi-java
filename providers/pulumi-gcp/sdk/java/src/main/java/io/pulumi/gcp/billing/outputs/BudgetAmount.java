// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.billing.outputs.BudgetAmountSpecifiedAmount;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BudgetAmount {
    private final @Nullable Boolean lastPeriodAmount;
    private final @Nullable BudgetAmountSpecifiedAmount specifiedAmount;

    @OutputCustomType.Constructor({"lastPeriodAmount","specifiedAmount"})
    private BudgetAmount(
        @Nullable Boolean lastPeriodAmount,
        @Nullable BudgetAmountSpecifiedAmount specifiedAmount) {
        this.lastPeriodAmount = lastPeriodAmount;
        this.specifiedAmount = specifiedAmount;
    }

    public Optional<Boolean> getLastPeriodAmount() {
        return Optional.ofNullable(this.lastPeriodAmount);
    }
    public Optional<BudgetAmountSpecifiedAmount> getSpecifiedAmount() {
        return Optional.ofNullable(this.specifiedAmount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetAmount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean lastPeriodAmount;
        private @Nullable BudgetAmountSpecifiedAmount specifiedAmount;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetAmount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastPeriodAmount = defaults.lastPeriodAmount;
    	      this.specifiedAmount = defaults.specifiedAmount;
        }

        public Builder setLastPeriodAmount(@Nullable Boolean lastPeriodAmount) {
            this.lastPeriodAmount = lastPeriodAmount;
            return this;
        }

        public Builder setSpecifiedAmount(@Nullable BudgetAmountSpecifiedAmount specifiedAmount) {
            this.specifiedAmount = specifiedAmount;
            return this;
        }

        public BudgetAmount build() {
            return new BudgetAmount(lastPeriodAmount, specifiedAmount);
        }
    }
}