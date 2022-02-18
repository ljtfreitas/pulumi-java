// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutomationRulePropertyValuesConditionResponseConditionProperties {
    /**
     * The operator to use for evaluation the condition
     * 
     */
    private final @Nullable String operator;
    /**
     * The property to evaluate
     * 
     */
    private final @Nullable String propertyName;
    /**
     * The values to use for evaluating the condition
     * 
     */
    private final @Nullable List<String> propertyValues;

    @OutputCustomType.Constructor({"operator","propertyName","propertyValues"})
    private AutomationRulePropertyValuesConditionResponseConditionProperties(
        @Nullable String operator,
        @Nullable String propertyName,
        @Nullable List<String> propertyValues) {
        this.operator = operator;
        this.propertyName = propertyName;
        this.propertyValues = propertyValues;
    }

    /**
     * The operator to use for evaluation the condition
     * 
     */
    public Optional<String> getOperator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * The property to evaluate
     * 
     */
    public Optional<String> getPropertyName() {
        return Optional.ofNullable(this.propertyName);
    }
    /**
     * The values to use for evaluating the condition
     * 
     */
    public List<String> getPropertyValues() {
        return this.propertyValues == null ? List.of() : this.propertyValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRulePropertyValuesConditionResponseConditionProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String operator;
        private @Nullable String propertyName;
        private @Nullable List<String> propertyValues;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRulePropertyValuesConditionResponseConditionProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.propertyName = defaults.propertyName;
    	      this.propertyValues = defaults.propertyValues;
        }

        public Builder setOperator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }

        public Builder setPropertyName(@Nullable String propertyName) {
            this.propertyName = propertyName;
            return this;
        }

        public Builder setPropertyValues(@Nullable List<String> propertyValues) {
            this.propertyValues = propertyValues;
            return this;
        }

        public AutomationRulePropertyValuesConditionResponseConditionProperties build() {
            return new AutomationRulePropertyValuesConditionResponseConditionProperties(operator, propertyName, propertyValues);
        }
    }
}
