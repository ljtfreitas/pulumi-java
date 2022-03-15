// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A custom alert rule that checks if a value (depends on the custom alert type) is within the given range.
 * 
 */
public final class ThresholdCustomAlertRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ThresholdCustomAlertRuleResponse Empty = new ThresholdCustomAlertRuleResponse();

    /**
     * The description of the custom alert.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The display name of the custom alert.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Status of the custom alert.
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * The maximum threshold.
     * 
     */
    @Import(name="maxThreshold", required=true)
      private final Integer maxThreshold;

    public Integer getMaxThreshold() {
        return this.maxThreshold;
    }

    /**
     * The minimum threshold.
     * 
     */
    @Import(name="minThreshold", required=true)
      private final Integer minThreshold;

    public Integer getMinThreshold() {
        return this.minThreshold;
    }

    /**
     * The type of the custom alert rule.
     * Expected value is 'ThresholdCustomAlertRule'.
     * 
     */
    @Import(name="ruleType", required=true)
      private final String ruleType;

    public String getRuleType() {
        return this.ruleType;
    }

    public ThresholdCustomAlertRuleResponse(
        String description,
        String displayName,
        Boolean isEnabled,
        Integer maxThreshold,
        Integer minThreshold,
        String ruleType) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.maxThreshold = Objects.requireNonNull(maxThreshold, "expected parameter 'maxThreshold' to be non-null");
        this.minThreshold = Objects.requireNonNull(minThreshold, "expected parameter 'minThreshold' to be non-null");
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
    }

    private ThresholdCustomAlertRuleResponse() {
        this.description = null;
        this.displayName = null;
        this.isEnabled = null;
        this.maxThreshold = null;
        this.minThreshold = null;
        this.ruleType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThresholdCustomAlertRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private Boolean isEnabled;
        private Integer maxThreshold;
        private Integer minThreshold;
        private String ruleType;

        public Builder() {
    	      // Empty
        }

        public Builder(ThresholdCustomAlertRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.isEnabled = defaults.isEnabled;
    	      this.maxThreshold = defaults.maxThreshold;
    	      this.minThreshold = defaults.minThreshold;
    	      this.ruleType = defaults.ruleType;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder maxThreshold(Integer maxThreshold) {
            this.maxThreshold = Objects.requireNonNull(maxThreshold);
            return this;
        }

        public Builder minThreshold(Integer minThreshold) {
            this.minThreshold = Objects.requireNonNull(minThreshold);
            return this;
        }

        public Builder ruleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public ThresholdCustomAlertRuleResponse build() {
            return new ThresholdCustomAlertRuleResponse(description, displayName, isEnabled, maxThreshold, minThreshold, ruleType);
        }
    }
}
