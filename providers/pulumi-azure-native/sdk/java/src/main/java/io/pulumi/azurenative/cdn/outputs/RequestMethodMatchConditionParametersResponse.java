// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RequestMethodMatchConditionParametersResponse {
    /**
     * The match value for the condition of the delivery rule
     * 
     */
    private final @Nullable List<String> matchValues;
    /**
     * Describes if this is negate condition or not
     * 
     */
    private final @Nullable Boolean negateCondition;
    private final String odataType;
    /**
     * Describes operator to be matched
     * 
     */
    private final String operator;

    @CustomType.Constructor
    private RequestMethodMatchConditionParametersResponse(
        @CustomType.Parameter("matchValues") @Nullable List<String> matchValues,
        @CustomType.Parameter("negateCondition") @Nullable Boolean negateCondition,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("operator") String operator) {
        this.matchValues = matchValues;
        this.negateCondition = negateCondition;
        this.odataType = odataType;
        this.operator = operator;
    }

    /**
     * The match value for the condition of the delivery rule
     * 
    */
    public List<String> getMatchValues() {
        return this.matchValues == null ? List.of() : this.matchValues;
    }
    /**
     * Describes if this is negate condition or not
     * 
    */
    public Optional<Boolean> getNegateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Describes operator to be matched
     * 
    */
    public String getOperator() {
        return this.operator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestMethodMatchConditionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> matchValues;
        private @Nullable Boolean negateCondition;
        private String odataType;
        private String operator;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestMethodMatchConditionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.odataType = defaults.odataType;
    	      this.operator = defaults.operator;
        }

        public Builder matchValues(@Nullable List<String> matchValues) {
            this.matchValues = matchValues;
            return this;
        }

        public Builder negateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public RequestMethodMatchConditionParametersResponse build() {
            return new RequestMethodMatchConditionParametersResponse(matchValues, negateCondition, odataType, operator);
        }
    }
}
