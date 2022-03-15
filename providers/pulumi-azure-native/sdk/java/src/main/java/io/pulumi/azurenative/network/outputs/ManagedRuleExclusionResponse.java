// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedRuleExclusionResponse {
    /**
     * The variable type to be excluded.
     * 
     */
    private final String matchVariable;
    /**
     * Selector value for which elements in the collection this exclusion applies to.
     * 
     */
    private final String selector;
    /**
     * Comparison operator to apply to the selector when specifying which elements in the collection this exclusion applies to.
     * 
     */
    private final String selectorMatchOperator;

    @CustomType.Constructor
    private ManagedRuleExclusionResponse(
        @CustomType.Parameter("matchVariable") String matchVariable,
        @CustomType.Parameter("selector") String selector,
        @CustomType.Parameter("selectorMatchOperator") String selectorMatchOperator) {
        this.matchVariable = matchVariable;
        this.selector = selector;
        this.selectorMatchOperator = selectorMatchOperator;
    }

    /**
     * The variable type to be excluded.
     * 
    */
    public String getMatchVariable() {
        return this.matchVariable;
    }
    /**
     * Selector value for which elements in the collection this exclusion applies to.
     * 
    */
    public String getSelector() {
        return this.selector;
    }
    /**
     * Comparison operator to apply to the selector when specifying which elements in the collection this exclusion applies to.
     * 
    */
    public String getSelectorMatchOperator() {
        return this.selectorMatchOperator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleExclusionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String matchVariable;
        private String selector;
        private String selectorMatchOperator;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleExclusionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchVariable = defaults.matchVariable;
    	      this.selector = defaults.selector;
    	      this.selectorMatchOperator = defaults.selectorMatchOperator;
        }

        public Builder matchVariable(String matchVariable) {
            this.matchVariable = Objects.requireNonNull(matchVariable);
            return this;
        }

        public Builder selector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public Builder selectorMatchOperator(String selectorMatchOperator) {
            this.selectorMatchOperator = Objects.requireNonNull(selectorMatchOperator);
            return this;
        }
        public ManagedRuleExclusionResponse build() {
            return new ManagedRuleExclusionResponse(matchVariable, selector, selectorMatchOperator);
        }
    }
}
