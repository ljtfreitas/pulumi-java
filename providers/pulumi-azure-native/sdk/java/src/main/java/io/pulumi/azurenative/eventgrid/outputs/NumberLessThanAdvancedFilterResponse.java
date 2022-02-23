// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NumberLessThanAdvancedFilterResponse {
    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    private final @Nullable String key;
    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'NumberLessThan'.
     * 
     */
    private final String operatorType;
    /**
     * The filter value.
     * 
     */
    private final @Nullable Double value;

    @OutputCustomType.Constructor({"key","operatorType","value"})
    private NumberLessThanAdvancedFilterResponse(
        @Nullable String key,
        String operatorType,
        @Nullable Double value) {
        this.key = key;
        this.operatorType = Objects.requireNonNull(operatorType);
        this.value = value;
    }

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'NumberLessThan'.
     * 
     */
    public String getOperatorType() {
        return this.operatorType;
    }
    /**
     * The filter value.
     * 
     */
    public Optional<Double> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NumberLessThanAdvancedFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private String operatorType;
        private @Nullable Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(NumberLessThanAdvancedFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
    	      this.value = defaults.value;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setOperatorType(String operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }

        public Builder setValue(@Nullable Double value) {
            this.value = value;
            return this;
        }
        public NumberLessThanAdvancedFilterResponse build() {
            return new NumberLessThanAdvancedFilterResponse(key, operatorType, value);
        }
    }
}
