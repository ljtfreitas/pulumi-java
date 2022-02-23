// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.enums.FunctionType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The aggregation expression to be used in the report.
 * 
 */
public final class ReportConfigAggregationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportConfigAggregationArgs Empty = new ReportConfigAggregationArgs();

    /**
     * The name of the aggregation function to use.
     * 
     */
    @InputImport(name="function", required=true)
        private final Input<Either<String,FunctionType>> function;

    public Input<Either<String,FunctionType>> getFunction() {
        return this.function;
    }

    /**
     * The name of the column to aggregate.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public ReportConfigAggregationArgs(
        Input<Either<String,FunctionType>> function,
        Input<String> name) {
        this.function = Objects.requireNonNull(function, "expected parameter 'function' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ReportConfigAggregationArgs() {
        this.function = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigAggregationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,FunctionType>> function;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigAggregationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.function = defaults.function;
    	      this.name = defaults.name;
        }

        public Builder setFunction(Input<Either<String,FunctionType>> function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }

        public Builder setFunction(Either<String,FunctionType> function) {
            this.function = Input.of(Objects.requireNonNull(function));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public ReportConfigAggregationArgs build() {
            return new ReportConfigAggregationArgs(function, name);
        }
    }
}
