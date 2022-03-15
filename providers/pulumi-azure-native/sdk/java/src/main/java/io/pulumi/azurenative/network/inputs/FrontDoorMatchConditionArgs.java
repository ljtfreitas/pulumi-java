// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.FrontDoorMatchVariable;
import io.pulumi.azurenative.network.enums.Operator;
import io.pulumi.azurenative.network.enums.TransformType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Define a match condition.
 * 
 */
public final class FrontDoorMatchConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FrontDoorMatchConditionArgs Empty = new FrontDoorMatchConditionArgs();

    /**
     * List of possible match values.
     * 
     */
    @Import(name="matchValue", required=true)
      private final Output<List<String>> matchValue;

    public Output<List<String>> getMatchValue() {
        return this.matchValue;
    }

    /**
     * Request variable to compare with.
     * 
     */
    @Import(name="matchVariable", required=true)
      private final Output<Either<String,FrontDoorMatchVariable>> matchVariable;

    public Output<Either<String,FrontDoorMatchVariable>> getMatchVariable() {
        return this.matchVariable;
    }

    /**
     * Describes if the result of this condition should be negated.
     * 
     */
    @Import(name="negateCondition")
      private final @Nullable Output<Boolean> negateCondition;

    public Output<Boolean> getNegateCondition() {
        return this.negateCondition == null ? Output.empty() : this.negateCondition;
    }

    /**
     * Comparison type to use for matching with the variable value.
     * 
     */
    @Import(name="operator", required=true)
      private final Output<Either<String,Operator>> operator;

    public Output<Either<String,Operator>> getOperator() {
        return this.operator;
    }

    /**
     * Match against a specific key from the QueryString, PostArgs, RequestHeader or Cookies variables. Default is null.
     * 
     */
    @Import(name="selector")
      private final @Nullable Output<String> selector;

    public Output<String> getSelector() {
        return this.selector == null ? Output.empty() : this.selector;
    }

    /**
     * List of transforms.
     * 
     */
    @Import(name="transforms")
      private final @Nullable Output<List<Either<String,TransformType>>> transforms;

    public Output<List<Either<String,TransformType>>> getTransforms() {
        return this.transforms == null ? Output.empty() : this.transforms;
    }

    public FrontDoorMatchConditionArgs(
        Output<List<String>> matchValue,
        Output<Either<String,FrontDoorMatchVariable>> matchVariable,
        @Nullable Output<Boolean> negateCondition,
        Output<Either<String,Operator>> operator,
        @Nullable Output<String> selector,
        @Nullable Output<List<Either<String,TransformType>>> transforms) {
        this.matchValue = Objects.requireNonNull(matchValue, "expected parameter 'matchValue' to be non-null");
        this.matchVariable = Objects.requireNonNull(matchVariable, "expected parameter 'matchVariable' to be non-null");
        this.negateCondition = negateCondition;
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.selector = selector;
        this.transforms = transforms;
    }

    private FrontDoorMatchConditionArgs() {
        this.matchValue = Output.empty();
        this.matchVariable = Output.empty();
        this.negateCondition = Output.empty();
        this.operator = Output.empty();
        this.selector = Output.empty();
        this.transforms = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontDoorMatchConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> matchValue;
        private Output<Either<String,FrontDoorMatchVariable>> matchVariable;
        private @Nullable Output<Boolean> negateCondition;
        private Output<Either<String,Operator>> operator;
        private @Nullable Output<String> selector;
        private @Nullable Output<List<Either<String,TransformType>>> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontDoorMatchConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValue = defaults.matchValue;
    	      this.matchVariable = defaults.matchVariable;
    	      this.negateCondition = defaults.negateCondition;
    	      this.operator = defaults.operator;
    	      this.selector = defaults.selector;
    	      this.transforms = defaults.transforms;
        }

        public Builder matchValue(Output<List<String>> matchValue) {
            this.matchValue = Objects.requireNonNull(matchValue);
            return this;
        }

        public Builder matchValue(List<String> matchValue) {
            this.matchValue = Output.of(Objects.requireNonNull(matchValue));
            return this;
        }

        public Builder matchVariable(Output<Either<String,FrontDoorMatchVariable>> matchVariable) {
            this.matchVariable = Objects.requireNonNull(matchVariable);
            return this;
        }

        public Builder matchVariable(Either<String,FrontDoorMatchVariable> matchVariable) {
            this.matchVariable = Output.of(Objects.requireNonNull(matchVariable));
            return this;
        }

        public Builder negateCondition(@Nullable Output<Boolean> negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }

        public Builder negateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = Output.ofNullable(negateCondition);
            return this;
        }

        public Builder operator(Output<Either<String,Operator>> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder operator(Either<String,Operator> operator) {
            this.operator = Output.of(Objects.requireNonNull(operator));
            return this;
        }

        public Builder selector(@Nullable Output<String> selector) {
            this.selector = selector;
            return this;
        }

        public Builder selector(@Nullable String selector) {
            this.selector = Output.ofNullable(selector);
            return this;
        }

        public Builder transforms(@Nullable Output<List<Either<String,TransformType>>> transforms) {
            this.transforms = transforms;
            return this;
        }

        public Builder transforms(@Nullable List<Either<String,TransformType>> transforms) {
            this.transforms = Output.ofNullable(transforms);
            return this;
        }
        public FrontDoorMatchConditionArgs build() {
            return new FrontDoorMatchConditionArgs(matchValue, matchVariable, negateCondition, operator, selector, transforms);
        }
    }
}
