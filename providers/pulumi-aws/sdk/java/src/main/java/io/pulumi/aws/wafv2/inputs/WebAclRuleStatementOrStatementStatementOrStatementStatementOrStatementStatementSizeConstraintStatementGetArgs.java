// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementTextTransformationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs();

    /**
     * The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
     */
    @InputImport(name="comparisonOperator", required=true)
    private final Input<String> comparisonOperator;

    public Input<String> getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs> fieldToMatch;

    public Input<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Input.empty() : this.fieldToMatch;
    }

    /**
     * The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
     */
    @InputImport(name="size", required=true)
    private final Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
    private final Input<List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementTextTransformationGetArgs>> textTransformations;

    public Input<List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs(
        Input<String> comparisonOperator,
        @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs> fieldToMatch,
        Input<Integer> size,
        Input<List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementTextTransformationGetArgs>> textTransformations) {
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
        this.fieldToMatch = fieldToMatch;
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs() {
        this.comparisonOperator = Input.empty();
        this.fieldToMatch = Input.empty();
        this.size = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> comparisonOperator;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs> fieldToMatch;
        private Input<Integer> size;
        private Input<List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setComparisonOperator(Input<String> comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Input.of(Objects.requireNonNull(comparisonOperator));
            return this;
        }

        public Builder setFieldToMatch(@Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setFieldToMatch(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Input.ofNullable(fieldToMatch);
            return this;
        }

        public Builder setSize(Input<Integer> size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder setSize(Integer size) {
            this.size = Input.of(Objects.requireNonNull(size));
            return this;
        }

        public Builder setTextTransformations(Input<List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder setTextTransformations(List<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs build() {
            return new WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs(comparisonOperator, fieldToMatch, size, textTransformations);
        }
    }
}
