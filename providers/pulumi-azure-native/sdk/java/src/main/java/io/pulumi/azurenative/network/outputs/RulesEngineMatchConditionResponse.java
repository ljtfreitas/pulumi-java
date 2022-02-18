// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RulesEngineMatchConditionResponse {
    /**
     * Describes if this is negate condition or not
     * 
     */
    private final @Nullable Boolean negateCondition;
    /**
     * Match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
     * 
     */
    private final List<String> rulesEngineMatchValue;
    /**
     * Match Variable
     * 
     */
    private final String rulesEngineMatchVariable;
    /**
     * Describes operator to apply to the match condition.
     * 
     */
    private final String rulesEngineOperator;
    /**
     * Name of selector in RequestHeader or RequestBody to be matched
     * 
     */
    private final @Nullable String selector;
    /**
     * List of transforms
     * 
     */
    private final @Nullable List<String> transforms;

    @OutputCustomType.Constructor({"negateCondition","rulesEngineMatchValue","rulesEngineMatchVariable","rulesEngineOperator","selector","transforms"})
    private RulesEngineMatchConditionResponse(
        @Nullable Boolean negateCondition,
        List<String> rulesEngineMatchValue,
        String rulesEngineMatchVariable,
        String rulesEngineOperator,
        @Nullable String selector,
        @Nullable List<String> transforms) {
        this.negateCondition = negateCondition;
        this.rulesEngineMatchValue = Objects.requireNonNull(rulesEngineMatchValue);
        this.rulesEngineMatchVariable = Objects.requireNonNull(rulesEngineMatchVariable);
        this.rulesEngineOperator = Objects.requireNonNull(rulesEngineOperator);
        this.selector = selector;
        this.transforms = transforms;
    }

    /**
     * Describes if this is negate condition or not
     * 
     */
    public Optional<Boolean> getNegateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }
    /**
     * Match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
     * 
     */
    public List<String> getRulesEngineMatchValue() {
        return this.rulesEngineMatchValue;
    }
    /**
     * Match Variable
     * 
     */
    public String getRulesEngineMatchVariable() {
        return this.rulesEngineMatchVariable;
    }
    /**
     * Describes operator to apply to the match condition.
     * 
     */
    public String getRulesEngineOperator() {
        return this.rulesEngineOperator;
    }
    /**
     * Name of selector in RequestHeader or RequestBody to be matched
     * 
     */
    public Optional<String> getSelector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * List of transforms
     * 
     */
    public List<String> getTransforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesEngineMatchConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean negateCondition;
        private List<String> rulesEngineMatchValue;
        private String rulesEngineMatchVariable;
        private String rulesEngineOperator;
        private @Nullable String selector;
        private @Nullable List<String> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesEngineMatchConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.negateCondition = defaults.negateCondition;
    	      this.rulesEngineMatchValue = defaults.rulesEngineMatchValue;
    	      this.rulesEngineMatchVariable = defaults.rulesEngineMatchVariable;
    	      this.rulesEngineOperator = defaults.rulesEngineOperator;
    	      this.selector = defaults.selector;
    	      this.transforms = defaults.transforms;
        }

        public Builder setNegateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }

        public Builder setRulesEngineMatchValue(List<String> rulesEngineMatchValue) {
            this.rulesEngineMatchValue = Objects.requireNonNull(rulesEngineMatchValue);
            return this;
        }

        public Builder setRulesEngineMatchVariable(String rulesEngineMatchVariable) {
            this.rulesEngineMatchVariable = Objects.requireNonNull(rulesEngineMatchVariable);
            return this;
        }

        public Builder setRulesEngineOperator(String rulesEngineOperator) {
            this.rulesEngineOperator = Objects.requireNonNull(rulesEngineOperator);
            return this;
        }

        public Builder setSelector(@Nullable String selector) {
            this.selector = selector;
            return this;
        }

        public Builder setTransforms(@Nullable List<String> transforms) {
            this.transforms = transforms;
            return this;
        }

        public RulesEngineMatchConditionResponse build() {
            return new RulesEngineMatchConditionResponse(negateCondition, rulesEngineMatchValue, rulesEngineMatchVariable, rulesEngineOperator, selector, transforms);
        }
    }
}
