// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StringNotInAdvancedFilterResponse {
    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    private final @Nullable String key;
    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'StringNotIn'.
     * 
     */
    private final String operatorType;
    /**
     * The set of filter values.
     * 
     */
    private final @Nullable List<String> values;

    @OutputCustomType.Constructor({"key","operatorType","values"})
    private StringNotInAdvancedFilterResponse(
        @Nullable String key,
        String operatorType,
        @Nullable List<String> values) {
        this.key = key;
        this.operatorType = Objects.requireNonNull(operatorType);
        this.values = values;
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
     * Expected value is 'StringNotIn'.
     * 
     */
    public String getOperatorType() {
        return this.operatorType;
    }
    /**
     * The set of filter values.
     * 
     */
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StringNotInAdvancedFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private String operatorType;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(StringNotInAdvancedFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
    	      this.values = defaults.values;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setOperatorType(String operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public StringNotInAdvancedFilterResponse build() {
            return new StringNotInAdvancedFilterResponse(key, operatorType, values);
        }
    }
}
