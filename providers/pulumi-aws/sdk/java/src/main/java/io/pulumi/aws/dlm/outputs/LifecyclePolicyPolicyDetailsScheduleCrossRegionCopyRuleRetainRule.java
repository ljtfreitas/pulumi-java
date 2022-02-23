// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule {
    /**
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * 
     */
    private final Integer interval;
    /**
     * The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     * 
     */
    private final String intervalUnit;

    @OutputCustomType.Constructor({"interval","intervalUnit"})
    private LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule(
        Integer interval,
        String intervalUnit) {
        this.interval = Objects.requireNonNull(interval);
        this.intervalUnit = Objects.requireNonNull(intervalUnit);
    }

    /**
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * 
     */
    public Integer getInterval() {
        return this.interval;
    }
    /**
     * The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     * 
     */
    public String getIntervalUnit() {
        return this.intervalUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer interval;
        private String intervalUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.intervalUnit = defaults.intervalUnit;
        }

        public Builder setInterval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder setIntervalUnit(String intervalUnit) {
            this.intervalUnit = Objects.requireNonNull(intervalUnit);
            return this;
        }
        public LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule build() {
            return new LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRule(interval, intervalUnit);
        }
    }
}
