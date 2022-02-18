// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.azurenative.alertsmanagement.enums.Operator;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * condition to trigger an action rule
 * 
 */
public final class ConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConditionArgs Empty = new ConditionArgs();

    /**
     * operator for a given condition
     * 
     */
    @InputImport(name="operator")
    private final @Nullable Input<Either<String,Operator>> operator;

    public Input<Either<String,Operator>> getOperator() {
        return this.operator == null ? Input.empty() : this.operator;
    }

    /**
     * list of values to match for a given condition.
     * 
     */
    @InputImport(name="values")
    private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public ConditionArgs(
        @Nullable Input<Either<String,Operator>> operator,
        @Nullable Input<List<String>> values) {
        this.operator = operator;
        this.values = values;
    }

    private ConditionArgs() {
        this.operator = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,Operator>> operator;
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder setOperator(@Nullable Input<Either<String,Operator>> operator) {
            this.operator = operator;
            return this;
        }

        public Builder setOperator(@Nullable Either<String,Operator> operator) {
            this.operator = Input.ofNullable(operator);
            return this;
        }

        public Builder setValues(@Nullable Input<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public ConditionArgs build() {
            return new ConditionArgs(operator, values);
        }
    }
}
