// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.FrontDoorMatchConditionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomRuleResponse {
    /**
     * Describes what action to be applied when rule matches.
     * 
     */
    private final String action;
    /**
     * Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    private final @Nullable String enabledState;
    /**
     * List of match conditions.
     * 
     */
    private final List<FrontDoorMatchConditionResponse> matchConditions;
    /**
     * Describes the name of the rule.
     * 
     */
    private final @Nullable String name;
    /**
     * Describes priority of the rule. Rules with a lower value will be evaluated before rules with a higher value.
     * 
     */
    private final Integer priority;
    /**
     * Time window for resetting the rate limit count. Default is 1 minute.
     * 
     */
    private final @Nullable Integer rateLimitDurationInMinutes;
    /**
     * Number of allowed requests per client within the time window.
     * 
     */
    private final @Nullable Integer rateLimitThreshold;
    /**
     * Describes type of rule.
     * 
     */
    private final String ruleType;

    @OutputCustomType.Constructor({"action","enabledState","matchConditions","name","priority","rateLimitDurationInMinutes","rateLimitThreshold","ruleType"})
    private CustomRuleResponse(
        String action,
        @Nullable String enabledState,
        List<FrontDoorMatchConditionResponse> matchConditions,
        @Nullable String name,
        Integer priority,
        @Nullable Integer rateLimitDurationInMinutes,
        @Nullable Integer rateLimitThreshold,
        String ruleType) {
        this.action = Objects.requireNonNull(action);
        this.enabledState = enabledState;
        this.matchConditions = Objects.requireNonNull(matchConditions);
        this.name = name;
        this.priority = Objects.requireNonNull(priority);
        this.rateLimitDurationInMinutes = rateLimitDurationInMinutes;
        this.rateLimitThreshold = rateLimitThreshold;
        this.ruleType = Objects.requireNonNull(ruleType);
    }

    /**
     * Describes what action to be applied when rule matches.
     * 
     */
    public String getAction() {
        return this.action;
    }
    /**
     * Describes if the custom rule is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    public Optional<String> getEnabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    /**
     * List of match conditions.
     * 
     */
    public List<FrontDoorMatchConditionResponse> getMatchConditions() {
        return this.matchConditions;
    }
    /**
     * Describes the name of the rule.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Describes priority of the rule. Rules with a lower value will be evaluated before rules with a higher value.
     * 
     */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * Time window for resetting the rate limit count. Default is 1 minute.
     * 
     */
    public Optional<Integer> getRateLimitDurationInMinutes() {
        return Optional.ofNullable(this.rateLimitDurationInMinutes);
    }
    /**
     * Number of allowed requests per client within the time window.
     * 
     */
    public Optional<Integer> getRateLimitThreshold() {
        return Optional.ofNullable(this.rateLimitThreshold);
    }
    /**
     * Describes type of rule.
     * 
     */
    public String getRuleType() {
        return this.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private @Nullable String enabledState;
        private List<FrontDoorMatchConditionResponse> matchConditions;
        private @Nullable String name;
        private Integer priority;
        private @Nullable Integer rateLimitDurationInMinutes;
        private @Nullable Integer rateLimitThreshold;
        private String ruleType;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.enabledState = defaults.enabledState;
    	      this.matchConditions = defaults.matchConditions;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.rateLimitDurationInMinutes = defaults.rateLimitDurationInMinutes;
    	      this.rateLimitThreshold = defaults.rateLimitThreshold;
    	      this.ruleType = defaults.ruleType;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setEnabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setMatchConditions(List<FrontDoorMatchConditionResponse> matchConditions) {
            this.matchConditions = Objects.requireNonNull(matchConditions);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRateLimitDurationInMinutes(@Nullable Integer rateLimitDurationInMinutes) {
            this.rateLimitDurationInMinutes = rateLimitDurationInMinutes;
            return this;
        }

        public Builder setRateLimitThreshold(@Nullable Integer rateLimitThreshold) {
            this.rateLimitThreshold = rateLimitThreshold;
            return this;
        }

        public Builder setRuleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public CustomRuleResponse build() {
            return new CustomRuleResponse(action, enabledState, matchConditions, name, priority, rateLimitDurationInMinutes, rateLimitThreshold, ruleType);
        }
    }
}
