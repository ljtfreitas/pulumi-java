// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.DatasetFilterValue;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DatasetFilterExpression extends io.pulumi.resources.InvokeArgs {

    public static final DatasetFilterExpression Empty = new DatasetFilterExpression();

    /**
     * Filtering expression for a parameter
     * 
     */
    @Import(name="expression", required=true)
      private final String expression;

    public String getExpression() {
        return this.expression;
    }

    @Import(name="valuesMap", required=true)
      private final List<DatasetFilterValue> valuesMap;

    public List<DatasetFilterValue> getValuesMap() {
        return this.valuesMap;
    }

    public DatasetFilterExpression(
        String expression,
        List<DatasetFilterValue> valuesMap) {
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.valuesMap = Objects.requireNonNull(valuesMap, "expected parameter 'valuesMap' to be non-null");
    }

    private DatasetFilterExpression() {
        this.expression = null;
        this.valuesMap = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetFilterExpression defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expression;
        private List<DatasetFilterValue> valuesMap;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetFilterExpression defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.valuesMap = defaults.valuesMap;
        }

        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder valuesMap(List<DatasetFilterValue> valuesMap) {
            this.valuesMap = Objects.requireNonNull(valuesMap);
            return this;
        }
        public DatasetFilterExpression build() {
            return new DatasetFilterExpression(expression, valuesMap);
        }
    }
}
