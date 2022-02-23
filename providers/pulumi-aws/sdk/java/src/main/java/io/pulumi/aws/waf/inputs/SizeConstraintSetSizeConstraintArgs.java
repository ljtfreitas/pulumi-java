// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.aws.waf.inputs.SizeConstraintSetSizeConstraintFieldToMatchArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class SizeConstraintSetSizeConstraintArgs extends io.pulumi.resources.ResourceArgs {

    public static final SizeConstraintSetSizeConstraintArgs Empty = new SizeConstraintSetSizeConstraintArgs();

    /**
     * The type of comparison you want to perform.
     * e.g., `EQ`, `NE`, `LT`, `GT`.
     * See [docs](https://docs.aws.amazon.com/waf/latest/APIReference/API_wafRegional_SizeConstraint.html) for all supported values.
     * 
     */
    @InputImport(name="comparisonOperator", required=true)
    private final Input<String> comparisonOperator;

    public Input<String> getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * Specifies where in a web request to look for the size constraint.
     * 
     */
    @InputImport(name="fieldToMatch", required=true)
    private final Input<SizeConstraintSetSizeConstraintFieldToMatchArgs> fieldToMatch;

    public Input<SizeConstraintSetSizeConstraintFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * The size in bytes that you want to compare against the size of the specified `field_to_match`.
     * Valid values are between 0 - 21474836480 bytes (0 - 20 GB).
     * 
     */
    @InputImport(name="size", required=true)
    private final Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size;
    }

    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * If you specify a transformation, AWS WAF performs the transformation on `field_to_match` before inspecting a request for a match.
     * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_SizeConstraint.html#WAF-Type-SizeConstraint-TextTransformation)
     * for all supported values.
     * **Note:** if you choose `BODY` as `type`, you must choose `NONE` because CloudFront forwards only the first 8192 bytes for inspection.
     * 
     */
    @InputImport(name="textTransformation", required=true)
    private final Input<String> textTransformation;

    public Input<String> getTextTransformation() {
        return this.textTransformation;
    }

    public SizeConstraintSetSizeConstraintArgs(
        Input<String> comparisonOperator,
        Input<SizeConstraintSetSizeConstraintFieldToMatchArgs> fieldToMatch,
        Input<Integer> size,
        Input<String> textTransformation) {
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.textTransformation = Objects.requireNonNull(textTransformation, "expected parameter 'textTransformation' to be non-null");
    }

    private SizeConstraintSetSizeConstraintArgs() {
        this.comparisonOperator = Input.empty();
        this.fieldToMatch = Input.empty();
        this.size = Input.empty();
        this.textTransformation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SizeConstraintSetSizeConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> comparisonOperator;
        private Input<SizeConstraintSetSizeConstraintFieldToMatchArgs> fieldToMatch;
        private Input<Integer> size;
        private Input<String> textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(SizeConstraintSetSizeConstraintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder setComparisonOperator(Input<String> comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Input.of(Objects.requireNonNull(comparisonOperator));
            return this;
        }

        public Builder setFieldToMatch(Input<SizeConstraintSetSizeConstraintFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setFieldToMatch(SizeConstraintSetSizeConstraintFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.of(Objects.requireNonNull(fieldToMatch));
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

        public Builder setTextTransformation(Input<String> textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }

        public Builder setTextTransformation(String textTransformation) {
            this.textTransformation = Input.of(Objects.requireNonNull(textTransformation));
            return this;
        }
        public SizeConstraintSetSizeConstraintArgs build() {
            return new SizeConstraintSetSizeConstraintArgs(comparisonOperator, fieldToMatch, size, textTransformation);
        }
    }
}
