// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLSizeConstraintStatementComparisonOperator;
import io.pulumi.awsnative.wafv2.inputs.WebACLFieldToMatch;
import io.pulumi.awsnative.wafv2.inputs.WebACLTextTransformation;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.List;
import java.util.Objects;


/**
 * Size Constraint statement.
 * 
 */
public final class WebACLSizeConstraintStatement extends io.pulumi.resources.InvokeArgs {

    public static final WebACLSizeConstraintStatement Empty = new WebACLSizeConstraintStatement();

    @InputImport(name="comparisonOperator", required=true)
        private final WebACLSizeConstraintStatementComparisonOperator comparisonOperator;

    public WebACLSizeConstraintStatementComparisonOperator getComparisonOperator() {
        return this.comparisonOperator;
    }

    @InputImport(name="fieldToMatch", required=true)
        private final WebACLFieldToMatch fieldToMatch;

    public WebACLFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }

    @InputImport(name="size", required=true)
        private final Double size;

    public Double getSize() {
        return this.size;
    }

    @InputImport(name="textTransformations", required=true)
        private final List<WebACLTextTransformation> textTransformations;

    public List<WebACLTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public WebACLSizeConstraintStatement(
        WebACLSizeConstraintStatementComparisonOperator comparisonOperator,
        WebACLFieldToMatch fieldToMatch,
        Double size,
        List<WebACLTextTransformation> textTransformations) {
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebACLSizeConstraintStatement() {
        this.comparisonOperator = null;
        this.fieldToMatch = null;
        this.size = null;
        this.textTransformations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLSizeConstraintStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLSizeConstraintStatementComparisonOperator comparisonOperator;
        private WebACLFieldToMatch fieldToMatch;
        private Double size;
        private List<WebACLTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLSizeConstraintStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setComparisonOperator(WebACLSizeConstraintStatementComparisonOperator comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder setFieldToMatch(WebACLFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setSize(Double size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder setTextTransformations(List<WebACLTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public WebACLSizeConstraintStatement build() {
            return new WebACLSizeConstraintStatement(comparisonOperator, fieldToMatch, size, textTransformations);
        }
    }
}
