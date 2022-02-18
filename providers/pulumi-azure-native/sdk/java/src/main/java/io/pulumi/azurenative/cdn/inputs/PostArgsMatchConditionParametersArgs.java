// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.PostArgsOperator;
import io.pulumi.azurenative.cdn.enums.Transform;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="matchValues")
    private final @Nullable Input<List<String>> matchValues;

    public Input<List<String>> getMatchValues() {
        return this.matchValues == null ? Input.empty() : this.matchValues;
    }

    /**
     * Describes if this is negate condition or not
     * 
     */
    @InputImport(name="negateCondition")
    private final @Nullable Input<Boolean> negateCondition;

    public Input<Boolean> getNegateCondition() {
        return this.negateCondition == null ? Input.empty() : this.negateCondition;
    }

    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Describes operator to be matched
     * 
     */
    @InputImport(name="operator", required=true)
    private final Input<Either<String,PostArgsOperator>> operator;

    public Input<Either<String,PostArgsOperator>> getOperator() {
        return this.operator;
    }

    /**
     * Name of PostArg to be matched
     * 
     */
    @InputImport(name="selector")
    private final @Nullable Input<String> selector;

    public Input<String> getSelector() {
        return this.selector == null ? Input.empty() : this.selector;
    }

    /**
     * List of transforms
     * 
     */
    @InputImport(name="transforms")
    private final @Nullable Input<List<Either<String,Transform>>> transforms;

    public Input<List<Either<String,Transform>>> getTransforms() {
        return this.transforms == null ? Input.empty() : this.transforms;
    }

    public PostArgsMatchConditionParametersArgs(
        @Nullable Input<List<String>> matchValues,
        @Nullable Input<Boolean> negateCondition,
        Input<String> odataType,
        Input<Either<String,PostArgsOperator>> operator,
        @Nullable Input<String> selector,
        @Nullable Input<List<Either<String,Transform>>> transforms) {
        this.matchValues = matchValues;
        this.negateCondition = negateCondition;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.selector = selector;
        this.transforms = transforms;
    }

    private PostArgsMatchConditionParametersArgs() {
        this.matchValues = Input.empty();
        this.negateCondition = Input.empty();
        this.odataType = Input.empty();
        this.operator = Input.empty();
        this.selector = Input.empty();
        this.transforms = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostArgsMatchConditionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> matchValues;
        private @Nullable Input<Boolean> negateCondition;
        private Input<String> odataType;
        private Input<Either<String,PostArgsOperator>> operator;
        private @Nullable Input<String> selector;
        private @Nullable Input<List<Either<String,Transform>>> transforms;

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

        public Builder setMatchValues(@Nullable Input<List<String>> matchValues) {
            this.matchValues = matchValues;
            return this;
        }

        public Builder setMatchValues(@Nullable List<String> matchValues) {
            this.matchValues = Input.ofNullable(matchValues);
            return this;
        }

        public Builder setNegateCondition(@Nullable Input<Boolean> negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }

        public Builder setNegateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = Input.ofNullable(negateCondition);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setOperator(Input<Either<String,PostArgsOperator>> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setOperator(Either<String,PostArgsOperator> operator) {
            this.operator = Input.of(Objects.requireNonNull(operator));
            return this;
        }

        public Builder setSelector(@Nullable Input<String> selector) {
            this.selector = selector;
            return this;
        }

        public Builder setSelector(@Nullable String selector) {
            this.selector = Input.ofNullable(selector);
            return this;
        }

        public Builder setTransforms(@Nullable Input<List<Either<String,Transform>>> transforms) {
            this.transforms = transforms;
            return this;
        }

        public Builder setTransforms(@Nullable List<Either<String,Transform>> transforms) {
            this.transforms = Input.ofNullable(transforms);
            return this;
        }

        public PostArgsMatchConditionParametersArgs build() {
            return new PostArgsMatchConditionParametersArgs(matchValues, negateCondition, odataType, operator, selector, transforms);
        }
    }
}
