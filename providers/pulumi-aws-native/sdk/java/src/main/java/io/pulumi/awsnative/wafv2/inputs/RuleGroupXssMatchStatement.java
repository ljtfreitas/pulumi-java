// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatch;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupTextTransformation;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


/**
 * Xss Match Statement.
 * 
 */
public final class RuleGroupXssMatchStatement extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupXssMatchStatement Empty = new RuleGroupXssMatchStatement();

    @InputImport(name="fieldToMatch", required=true)
        private final RuleGroupFieldToMatch fieldToMatch;

    public RuleGroupFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }

    @InputImport(name="textTransformations", required=true)
        private final List<RuleGroupTextTransformation> textTransformations;

    public List<RuleGroupTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public RuleGroupXssMatchStatement(
        RuleGroupFieldToMatch fieldToMatch,
        List<RuleGroupTextTransformation> textTransformations) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private RuleGroupXssMatchStatement() {
        this.fieldToMatch = null;
        this.textTransformations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupXssMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupFieldToMatch fieldToMatch;
        private List<RuleGroupTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupXssMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setFieldToMatch(RuleGroupFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setTextTransformations(List<RuleGroupTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public RuleGroupXssMatchStatement build() {
            return new RuleGroupXssMatchStatement(fieldToMatch, textTransformations);
        }
    }
}
