// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UrlPathMatchConditionParametersResponse {
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
    /**
     * List of transforms
     * 
     */
    private final @Nullable List<String> transforms;

    @OutputCustomType.Constructor({"matchValues","negateCondition","odataType","operator","transforms"})
    private UrlPathMatchConditionParametersResponse(
        @Nullable List<String> matchValues,
        @Nullable Boolean negateCondition,
        String odataType,
        String operator,
        @Nullable List<String> transforms) {
        this.matchValues = matchValues;
        this.negateCondition = negateCondition;
        this.odataType = Objects.requireNonNull(odataType);
        this.operator = Objects.requireNonNull(operator);
        this.transforms = transforms;
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
    /**
     * List of transforms
     * 
     */
    public List<String> getTransforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlPathMatchConditionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> matchValues;
        private @Nullable Boolean negateCondition;
        private String odataType;
        private String operator;
        private @Nullable List<String> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlPathMatchConditionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.odataType = defaults.odataType;
    	      this.operator = defaults.operator;
    	      this.transforms = defaults.transforms;
        }

        public Builder setMatchValues(@Nullable List<String> matchValues) {
            this.matchValues = matchValues;
            return this;
        }

        public Builder setNegateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setTransforms(@Nullable List<String> transforms) {
            this.transforms = transforms;
            return this;
        }

        public UrlPathMatchConditionParametersResponse build() {
            return new UrlPathMatchConditionParametersResponse(matchValues, negateCondition, odataType, operator, transforms);
        }
    }
}
