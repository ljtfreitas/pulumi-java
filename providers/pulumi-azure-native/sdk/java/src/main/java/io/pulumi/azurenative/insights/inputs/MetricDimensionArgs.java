// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies a metric dimension.
 * 
 */
public final class MetricDimensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricDimensionArgs Empty = new MetricDimensionArgs();

    /**
     * Name of the dimension.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * the dimension operator. Only 'Include' and 'Exclude' are supported
     * 
     */
    @Import(name="operator", required=true)
      private final Output<String> operator;

    public Output<String> getOperator() {
        return this.operator;
    }

    /**
     * list of dimension values.
     * 
     */
    @Import(name="values", required=true)
      private final Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values;
    }

    public MetricDimensionArgs(
        Output<String> name,
        Output<String> operator,
        Output<List<String>> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private MetricDimensionArgs() {
        this.name = Output.empty();
        this.operator = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricDimensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<String> operator;
        private Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricDimensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder operator(Output<String> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder operator(String operator) {
            this.operator = Output.of(Objects.requireNonNull(operator));
            return this;
        }

        public Builder values(Output<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Output.of(Objects.requireNonNull(values));
            return this;
        }
        public MetricDimensionArgs build() {
            return new MetricDimensionArgs(name, operator, values);
        }
    }
}
