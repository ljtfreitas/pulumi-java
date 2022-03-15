// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.PostArgsOperator;
import io.pulumi.azurenative.cdn.enums.Transform;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the parameters for PostArgs match conditions
 * 
 */
public final class PostArgsMatchConditionParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final PostArgsMatchConditionParametersArgs Empty = new PostArgsMatchConditionParametersArgs();

    /**
     * The match value for the condition of the delivery rule
     * 
     */
    @Import(name="matchValues")
      private final @Nullable Output<List<String>> matchValues;

    public Output<List<String>> getMatchValues() {
        return this.matchValues == null ? Output.empty() : this.matchValues;
    }

    /**
     * Describes if this is negate condition or not
     * 
     */
    @Import(name="negateCondition")
      private final @Nullable Output<Boolean> negateCondition;

    public Output<Boolean> getNegateCondition() {
        return this.negateCondition == null ? Output.empty() : this.negateCondition;
    }

    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Describes operator to be matched
     * 
     */
    @Import(name="operator", required=true)
      private final Output<Either<String,PostArgsOperator>> operator;

    public Output<Either<String,PostArgsOperator>> getOperator() {
        return this.operator;
    }

    /**
     * Name of PostArg to be matched
     * 
     */
    @Import(name="selector")
      private final @Nullable Output<String> selector;

    public Output<String> getSelector() {
        return this.selector == null ? Output.empty() : this.selector;
    }

    /**
     * List of transforms
     * 
     */
    @Import(name="transforms")
      private final @Nullable Output<List<Either<String,Transform>>> transforms;

    public Output<List<Either<String,Transform>>> getTransforms() {
        return this.transforms == null ? Output.empty() : this.transforms;
    }

    public PostArgsMatchConditionParametersArgs(
        @Nullable Output<List<String>> matchValues,
        @Nullable Output<Boolean> negateCondition,
        Output<String> odataType,
        Output<Either<String,PostArgsOperator>> operator,
        @Nullable Output<String> selector,
        @Nullable Output<List<Either<String,Transform>>> transforms) {
        this.matchValues = matchValues;
        this.negateCondition = negateCondition;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.selector = selector;
        this.transforms = transforms;
    }

    private PostArgsMatchConditionParametersArgs() {
        this.matchValues = Output.empty();
        this.negateCondition = Output.empty();
        this.odataType = Output.empty();
        this.operator = Output.empty();
        this.selector = Output.empty();
        this.transforms = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostArgsMatchConditionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> matchValues;
        private @Nullable Output<Boolean> negateCondition;
        private Output<String> odataType;
        private Output<Either<String,PostArgsOperator>> operator;
        private @Nullable Output<String> selector;
        private @Nullable Output<List<Either<String,Transform>>> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(PostArgsMatchConditionParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.odataType = defaults.odataType;
    	      this.operator = defaults.operator;
    	      this.selector = defaults.selector;
    	      this.transforms = defaults.transforms;
        }

        public Builder matchValues(@Nullable Output<List<String>> matchValues) {
            this.matchValues = matchValues;
            return this;
        }

        public Builder matchValues(@Nullable List<String> matchValues) {
            this.matchValues = Output.ofNullable(matchValues);
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

        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder operator(Output<Either<String,PostArgsOperator>> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder operator(Either<String,PostArgsOperator> operator) {
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

        public Builder transforms(@Nullable Output<List<Either<String,Transform>>> transforms) {
            this.transforms = transforms;
            return this;
        }

        public Builder transforms(@Nullable List<Either<String,Transform>> transforms) {
            this.transforms = Output.ofNullable(transforms);
            return this;
        }
        public PostArgsMatchConditionParametersArgs build() {
            return new PostArgsMatchConditionParametersArgs(matchValues, negateCondition, odataType, operator, selector, transforms);
        }
    }
}
