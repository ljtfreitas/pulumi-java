// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.enums.OperatorType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The comparison expression to be used in the report.
 * 
 */
public final class ReportComparisonExpressionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportComparisonExpressionArgs Empty = new ReportComparisonExpressionArgs();

    /**
     * The name of the column to use in comparison.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The operator to use for comparison.
     * 
     */
    @InputImport(name="operator", required=true)
    private final Input<Either<String,OperatorType>> operator;

    public Input<Either<String,OperatorType>> getOperator() {
        return this.operator;
    }

    /**
     * Array of values to use for comparison
     * 
     */
    @InputImport(name="values", required=true)
    private final Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values;
    }

    public ReportComparisonExpressionArgs(
        Input<String> name,
        Input<Either<String,OperatorType>> operator,
        Input<List<String>> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ReportComparisonExpressionArgs() {
        this.name = Input.empty();
        this.operator = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportComparisonExpressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<Either<String,OperatorType>> operator;
        private Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportComparisonExpressionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setOperator(Input<Either<String,OperatorType>> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setOperator(Either<String,OperatorType> operator) {
            this.operator = Input.of(Objects.requireNonNull(operator));
            return this;
        }

        public Builder setValues(Input<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Input.of(Objects.requireNonNull(values));
            return this;
        }

        public ReportComparisonExpressionArgs build() {
            return new ReportComparisonExpressionArgs(name, operator, values);
        }
    }
}
