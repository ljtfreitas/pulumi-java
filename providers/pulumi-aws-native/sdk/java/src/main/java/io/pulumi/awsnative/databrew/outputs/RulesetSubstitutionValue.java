// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RulesetSubstitutionValue {
    /**
     * Value or column name
     * 
     */
    private final String value;
    /**
     * Variable name
     * 
     */
    private final String valueReference;

    @OutputCustomType.Constructor({"value","valueReference"})
    private RulesetSubstitutionValue(
        String value,
        String valueReference) {
        this.value = Objects.requireNonNull(value);
        this.valueReference = Objects.requireNonNull(valueReference);
    }

    /**
     * Value or column name
     * 
     */
    public String getValue() {
        return this.value;
    }
    /**
     * Variable name
     * 
     */
    public String getValueReference() {
        return this.valueReference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetSubstitutionValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String value;
        private String valueReference;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesetSubstitutionValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
    	      this.valueReference = defaults.valueReference;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValueReference(String valueReference) {
            this.valueReference = Objects.requireNonNull(valueReference);
            return this;
        }
        public RulesetSubstitutionValue build() {
            return new RulesetSubstitutionValue(value, valueReference);
        }
    }
}
