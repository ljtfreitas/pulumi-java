// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.RulesetColumnSelector;
import io.pulumi.awsnative.databrew.inputs.RulesetSubstitutionValue;
import io.pulumi.awsnative.databrew.inputs.RulesetThreshold;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Data quality rule for a target resource (dataset)
 * 
 */
public final class RulesetRule extends io.pulumi.resources.InvokeArgs {

    public static final RulesetRule Empty = new RulesetRule();

    @InputImport(name="checkExpression", required=true)
        private final String checkExpression;

    public String getCheckExpression() {
        return this.checkExpression;
    }

    @InputImport(name="columnSelectors")
        private final @Nullable List<RulesetColumnSelector> columnSelectors;

    public List<RulesetColumnSelector> getColumnSelectors() {
        return this.columnSelectors == null ? List.of() : this.columnSelectors;
    }

    @InputImport(name="disabled")
        private final @Nullable Boolean disabled;

    public Optional<Boolean> getDisabled() {
        return this.disabled == null ? Optional.empty() : Optional.ofNullable(this.disabled);
    }

    /**
     * Name of the rule
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="substitutionMap")
        private final @Nullable List<RulesetSubstitutionValue> substitutionMap;

    public List<RulesetSubstitutionValue> getSubstitutionMap() {
        return this.substitutionMap == null ? List.of() : this.substitutionMap;
    }

    @InputImport(name="threshold")
        private final @Nullable RulesetThreshold threshold;

    public Optional<RulesetThreshold> getThreshold() {
        return this.threshold == null ? Optional.empty() : Optional.ofNullable(this.threshold);
    }

    public RulesetRule(
        String checkExpression,
        @Nullable List<RulesetColumnSelector> columnSelectors,
        @Nullable Boolean disabled,
        String name,
        @Nullable List<RulesetSubstitutionValue> substitutionMap,
        @Nullable RulesetThreshold threshold) {
        this.checkExpression = Objects.requireNonNull(checkExpression, "expected parameter 'checkExpression' to be non-null");
        this.columnSelectors = columnSelectors;
        this.disabled = disabled;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.substitutionMap = substitutionMap;
        this.threshold = threshold;
    }

    private RulesetRule() {
        this.checkExpression = null;
        this.columnSelectors = List.of();
        this.disabled = null;
        this.name = null;
        this.substitutionMap = List.of();
        this.threshold = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String checkExpression;
        private @Nullable List<RulesetColumnSelector> columnSelectors;
        private @Nullable Boolean disabled;
        private String name;
        private @Nullable List<RulesetSubstitutionValue> substitutionMap;
        private @Nullable RulesetThreshold threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesetRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkExpression = defaults.checkExpression;
    	      this.columnSelectors = defaults.columnSelectors;
    	      this.disabled = defaults.disabled;
    	      this.name = defaults.name;
    	      this.substitutionMap = defaults.substitutionMap;
    	      this.threshold = defaults.threshold;
        }

        public Builder setCheckExpression(String checkExpression) {
            this.checkExpression = Objects.requireNonNull(checkExpression);
            return this;
        }

        public Builder setColumnSelectors(@Nullable List<RulesetColumnSelector> columnSelectors) {
            this.columnSelectors = columnSelectors;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSubstitutionMap(@Nullable List<RulesetSubstitutionValue> substitutionMap) {
            this.substitutionMap = substitutionMap;
            return this;
        }

        public Builder setThreshold(@Nullable RulesetThreshold threshold) {
            this.threshold = threshold;
            return this;
        }
        public RulesetRule build() {
            return new RulesetRule(checkExpression, columnSelectors, disabled, name, substitutionMap, threshold);
        }
    }
}
