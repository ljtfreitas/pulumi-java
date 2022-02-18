// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DimensionResponse {
    /**
     * Name of the dimension
     * 
     */
    private final String name;
    /**
     * Operator for dimension values
     * 
     */
    private final String operator;
    /**
     * List of dimension values
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor({"name","operator","values"})
    private DimensionResponse(
        String name,
        String operator,
        List<String> values) {
        this.name = Objects.requireNonNull(name);
        this.operator = Objects.requireNonNull(operator);
        this.values = Objects.requireNonNull(values);
    }

    /**
     * Name of the dimension
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Operator for dimension values
     * 
     */
    public String getOperator() {
        return this.operator;
    }
    /**
     * List of dimension values
     * 
     */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DimensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String operator;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(DimensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public DimensionResponse build() {
            return new DimensionResponse(name, operator, values);
        }
    }
}
