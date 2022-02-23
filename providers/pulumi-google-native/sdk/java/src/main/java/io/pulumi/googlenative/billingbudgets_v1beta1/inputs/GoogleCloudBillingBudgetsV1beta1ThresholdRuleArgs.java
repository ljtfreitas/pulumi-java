// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.billingbudgets_v1beta1.enums.GoogleCloudBillingBudgetsV1beta1ThresholdRuleSpendBasis;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ThresholdRule contains the definition of a threshold. Threshold rules define the triggering events used to generate a budget notification email. When a threshold is crossed (spend exceeds the specified percentages of the budget), budget alert emails are sent to the email recipients you specify in the [NotificationsRule](#notificationsrule). Threshold rules also affect the fields included in the [JSON data object](https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#notification_format) sent to a Pub/Sub topic. Threshold rules are _required_ if using email notifications. Threshold rules are _optional_ if only setting a [`pubsubTopic` NotificationsRule](#NotificationsRule), unless you want your JSON data object to include data about the thresholds you set. For more information, see [set budget threshold rules and actions](https://cloud.google.com/billing/docs/how-to/budgets#budget-actions).
 * 
 */
public final class GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs Empty = new GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs();

    /**
     * Optional. The type of basis used to determine if spend has passed the threshold. Behavior defaults to CURRENT_SPEND if not set.
     * 
     */
    @InputImport(name="spendBasis")
      private final @Nullable Input<GoogleCloudBillingBudgetsV1beta1ThresholdRuleSpendBasis> spendBasis;

    public Input<GoogleCloudBillingBudgetsV1beta1ThresholdRuleSpendBasis> getSpendBasis() {
        return this.spendBasis == null ? Input.empty() : this.spendBasis;
    }

    /**
     * Send an alert when this threshold is exceeded. This is a 1.0-based percentage, so 0.5 = 50%. Validation: non-negative number.
     * 
     */
    @InputImport(name="thresholdPercent", required=true)
      private final Input<Double> thresholdPercent;

    public Input<Double> getThresholdPercent() {
        return this.thresholdPercent;
    }

    public GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs(
        @Nullable Input<GoogleCloudBillingBudgetsV1beta1ThresholdRuleSpendBasis> spendBasis,
        Input<Double> thresholdPercent) {
        this.spendBasis = spendBasis;
        this.thresholdPercent = Objects.requireNonNull(thresholdPercent, "expected parameter 'thresholdPercent' to be non-null");
    }

    private GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs() {
        this.spendBasis = Input.empty();
        this.thresholdPercent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudBillingBudgetsV1beta1ThresholdRuleSpendBasis> spendBasis;
        private Input<Double> thresholdPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spendBasis = defaults.spendBasis;
    	      this.thresholdPercent = defaults.thresholdPercent;
        }

        public Builder setSpendBasis(@Nullable Input<GoogleCloudBillingBudgetsV1beta1ThresholdRuleSpendBasis> spendBasis) {
            this.spendBasis = spendBasis;
            return this;
        }

        public Builder setSpendBasis(@Nullable GoogleCloudBillingBudgetsV1beta1ThresholdRuleSpendBasis spendBasis) {
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
        public GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs build() {
            return new GoogleCloudBillingBudgetsV1beta1ThresholdRuleArgs(spendBasis, thresholdPercent);
        }
    }
}
