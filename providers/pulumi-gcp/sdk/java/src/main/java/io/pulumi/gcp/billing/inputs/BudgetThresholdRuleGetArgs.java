// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetThresholdRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetThresholdRuleGetArgs Empty = new BudgetThresholdRuleGetArgs();

    /**
     * The type of basis used to determine if spend has passed
     * the threshold.
     * Default value is `CURRENT_SPEND`.
     * Possible values are `CURRENT_SPEND` and `FORECASTED_SPEND`.
     * 
     */
    @InputImport(name="spendBasis")
        private final @Nullable Input<String> spendBasis;

    public Input<String> getSpendBasis() {
        return this.spendBasis == null ? Input.empty() : this.spendBasis;
    }

    /**
     * Send an alert when this threshold is exceeded. This is a
     * 1.0-based percentage, so 0.5 = 50%. Must be >= 0.
     * 
     */
    @InputImport(name="thresholdPercent", required=true)
        private final Input<Double> thresholdPercent;

    public Input<Double> getThresholdPercent() {
        return this.thresholdPercent;
    }

    public BudgetThresholdRuleGetArgs(
        @Nullable Input<String> spendBasis,
        Input<Double> thresholdPercent) {
        this.spendBasis = spendBasis;
        this.thresholdPercent = Objects.requireNonNull(thresholdPercent, "expected parameter 'thresholdPercent' to be non-null");
    }

    private BudgetThresholdRuleGetArgs() {
        this.spendBasis = Input.empty();
        this.thresholdPercent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetThresholdRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> spendBasis;
        private Input<Double> thresholdPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetThresholdRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spendBasis = defaults.spendBasis;
    	      this.thresholdPercent = defaults.thresholdPercent;
        }

        public Builder setSpendBasis(@Nullable Input<String> spendBasis) {
            this.spendBasis = spendBasis;
            return this;
        }

        public Builder setSpendBasis(@Nullable String spendBasis) {
            this.spendBasis = Input.ofNullable(spendBasis);
            return this;
        }

        public Builder setThresholdPercent(Input<Double> thresholdPercent) {
            this.thresholdPercent = Objects.requireNonNull(thresholdPercent);
            return this;
        }

        public Builder setThresholdPercent(Double thresholdPercent) {
            this.thresholdPercent = Input.of(Objects.requireNonNull(thresholdPercent));
            return this;
        }
        public BudgetThresholdRuleGetArgs build() {
            return new BudgetThresholdRuleGetArgs(spendBasis, thresholdPercent);
        }
    }
}
