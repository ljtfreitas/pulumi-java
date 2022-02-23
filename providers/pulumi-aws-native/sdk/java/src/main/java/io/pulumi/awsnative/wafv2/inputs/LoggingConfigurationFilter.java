// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.LoggingConfigurationFilterBehavior;
import io.pulumi.awsnative.wafv2.enums.LoggingConfigurationFilterRequirement;
import io.pulumi.awsnative.wafv2.inputs.LoggingConfigurationCondition;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class LoggingConfigurationFilter extends io.pulumi.resources.InvokeArgs {

    public static final LoggingConfigurationFilter Empty = new LoggingConfigurationFilter();

    /**
     * How to handle logs that satisfy the filter's conditions and requirement.
     * 
     */
    @InputImport(name="behavior", required=true)
        private final LoggingConfigurationFilterBehavior behavior;

    public LoggingConfigurationFilterBehavior getBehavior() {
        return this.behavior;
    }

    /**
     * Match conditions for the filter.
     * 
     */
    @InputImport(name="conditions", required=true)
        private final List<LoggingConfigurationCondition> conditions;

    public List<LoggingConfigurationCondition> getConditions() {
        return this.conditions;
    }

    /**
     * Logic to apply to the filtering conditions. You can specify that, in order to satisfy the filter, a log must match all conditions or must match at least one condition.
     * 
     */
    @InputImport(name="requirement", required=true)
        private final LoggingConfigurationFilterRequirement requirement;

    public LoggingConfigurationFilterRequirement getRequirement() {
        return this.requirement;
    }

    public LoggingConfigurationFilter(
        LoggingConfigurationFilterBehavior behavior,
        List<LoggingConfigurationCondition> conditions,
        LoggingConfigurationFilterRequirement requirement) {
        this.behavior = Objects.requireNonNull(behavior, "expected parameter 'behavior' to be non-null");
        this.conditions = Objects.requireNonNull(conditions, "expected parameter 'conditions' to be non-null");
        this.requirement = Objects.requireNonNull(requirement, "expected parameter 'requirement' to be non-null");
    }

    private LoggingConfigurationFilter() {
        this.behavior = null;
        this.conditions = List.of();
        this.requirement = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigurationFilterBehavior behavior;
        private List<LoggingConfigurationCondition> conditions;
        private LoggingConfigurationFilterRequirement requirement;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
    	      this.conditions = defaults.conditions;
    	      this.requirement = defaults.requirement;
        }

        public Builder setBehavior(LoggingConfigurationFilterBehavior behavior) {
            this.behavior = Objects.requireNonNull(behavior);
            return this;
        }

        public Builder setConditions(List<LoggingConfigurationCondition> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setRequirement(LoggingConfigurationFilterRequirement requirement) {
            this.requirement = Objects.requireNonNull(requirement);
            return this;
        }
        public LoggingConfigurationFilter build() {
            return new LoggingConfigurationFilter(behavior, conditions, requirement);
        }
    }
}
