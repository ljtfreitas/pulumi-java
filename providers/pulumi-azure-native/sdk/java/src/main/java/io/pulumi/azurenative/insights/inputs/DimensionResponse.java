// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies the criteria for converting log to metric.
 * 
 */
public final class DimensionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DimensionResponse Empty = new DimensionResponse();

    /**
     * Name of the dimension
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Operator for dimension values
     * 
     */
    @InputImport(name="operator", required=true)
        private final String operator;

    public String getOperator() {
        return this.operator;
    }

    /**
     * List of dimension values
     * 
     */
    @InputImport(name="values", required=true)
        private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public DimensionResponse(
        String name,
        String operator,
        List<String> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private DimensionResponse() {
        this.name = null;
        this.operator = null;
        this.values = List.of();
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
