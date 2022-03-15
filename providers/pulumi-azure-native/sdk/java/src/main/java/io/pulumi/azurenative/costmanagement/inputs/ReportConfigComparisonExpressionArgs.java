// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.enums.OperatorType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The comparison expression to be used in the report.
 * 
 */
public final class ReportConfigComparisonExpressionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportConfigComparisonExpressionArgs Empty = new ReportConfigComparisonExpressionArgs();

    /**
     * The name of the column to use in comparison.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The operator to use for comparison.
     * 
     */
    @Import(name="operator", required=true)
      private final Output<Either<String,OperatorType>> operator;

    public Output<Either<String,OperatorType>> getOperator() {
        return this.operator;
    }

    /**
     * Array of values to use for comparison
     * 
     */
    @Import(name="values", required=true)
      private final Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values;
    }

    public ReportConfigComparisonExpressionArgs(
        Output<String> name,
        Output<Either<String,OperatorType>> operator,
        Output<List<String>> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ReportConfigComparisonExpressionArgs() {
        this.name = Output.empty();
        this.operator = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigComparisonExpressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<Either<String,OperatorType>> operator;
        private Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigComparisonExpressionArgs defaults) {
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

        public Builder operator(Output<Either<String,OperatorType>> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder operator(Either<String,OperatorType> operator) {
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
        public ReportConfigComparisonExpressionArgs build() {
            return new ReportConfigComparisonExpressionArgs(name, operator, values);
        }
    }
}
