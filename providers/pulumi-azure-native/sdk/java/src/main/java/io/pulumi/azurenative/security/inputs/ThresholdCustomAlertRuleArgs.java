// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A custom alert rule that checks if a value (depends on the custom alert type) is within the given range.
 * 
 */
public final class ThresholdCustomAlertRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThresholdCustomAlertRuleArgs Empty = new ThresholdCustomAlertRuleArgs();

    /**
     * Status of the custom alert.
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Output<Boolean> isEnabled;

    public Output<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * The maximum threshold.
     * 
     */
    @Import(name="maxThreshold", required=true)
      private final Output<Integer> maxThreshold;

    public Output<Integer> getMaxThreshold() {
        return this.maxThreshold;
    }

    /**
     * The minimum threshold.
     * 
     */
    @Import(name="minThreshold", required=true)
      private final Output<Integer> minThreshold;

    public Output<Integer> getMinThreshold() {
        return this.minThreshold;
    }

    /**
     * The type of the custom alert rule.
     * Expected value is 'ThresholdCustomAlertRule'.
     * 
     */
    @Import(name="ruleType", required=true)
      private final Output<String> ruleType;

    public Output<String> getRuleType() {
        return this.ruleType;
    }

    public ThresholdCustomAlertRuleArgs(
        Output<Boolean> isEnabled,
        Output<Integer> maxThreshold,
        Output<Integer> minThreshold,
        Output<String> ruleType) {
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.maxThreshold = Objects.requireNonNull(maxThreshold, "expected parameter 'maxThreshold' to be non-null");
        this.minThreshold = Objects.requireNonNull(minThreshold, "expected parameter 'minThreshold' to be non-null");
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
    }

    private ThresholdCustomAlertRuleArgs() {
        this.isEnabled = Output.empty();
        this.maxThreshold = Output.empty();
        this.minThreshold = Output.empty();
        this.ruleType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThresholdCustomAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> isEnabled;
        private Output<Integer> maxThreshold;
        private Output<Integer> minThreshold;
        private Output<String> ruleType;

        public Builder() {
    	      // Empty
        }

        public Builder(ThresholdCustomAlertRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.maxThreshold = defaults.maxThreshold;
    	      this.minThreshold = defaults.minThreshold;
    	      this.ruleType = defaults.ruleType;
        }

        public Builder isEnabled(Output<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Output.of(Objects.requireNonNull(isEnabled));
            return this;
        }

        public Builder maxThreshold(Output<Integer> maxThreshold) {
            this.maxThreshold = Objects.requireNonNull(maxThreshold);
            return this;
        }

        public Builder maxThreshold(Integer maxThreshold) {
            this.maxThreshold = Output.of(Objects.requireNonNull(maxThreshold));
            return this;
        }

        public Builder minThreshold(Output<Integer> minThreshold) {
            this.minThreshold = Objects.requireNonNull(minThreshold);
            return this;
        }

        public Builder minThreshold(Integer minThreshold) {
            this.minThreshold = Output.of(Objects.requireNonNull(minThreshold));
            return this;
        }

        public Builder ruleType(Output<String> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder ruleType(String ruleType) {
            this.ruleType = Output.of(Objects.requireNonNull(ruleType));
            return this;
        }
        public ThresholdCustomAlertRuleArgs build() {
            return new ThresholdCustomAlertRuleArgs(isEnabled, maxThreshold, minThreshold, ruleType);
        }
    }
}
