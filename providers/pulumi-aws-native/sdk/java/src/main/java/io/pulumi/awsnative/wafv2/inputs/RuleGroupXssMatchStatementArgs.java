// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatchArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupTextTransformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * Xss Match Statement.
 * 
 */
public final class RuleGroupXssMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupXssMatchStatementArgs Empty = new RuleGroupXssMatchStatementArgs();

    @Import(name="fieldToMatch", required=true)
      private final Output<RuleGroupFieldToMatchArgs> fieldToMatch;

    public Output<RuleGroupFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    @Import(name="textTransformations", required=true)
      private final Output<List<RuleGroupTextTransformationArgs>> textTransformations;

    public Output<List<RuleGroupTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public RuleGroupXssMatchStatementArgs(
        Output<RuleGroupFieldToMatchArgs> fieldToMatch,
        Output<List<RuleGroupTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private RuleGroupXssMatchStatementArgs() {
        this.fieldToMatch = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupXssMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RuleGroupFieldToMatchArgs> fieldToMatch;
        private Output<List<RuleGroupTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupXssMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(Output<RuleGroupFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder fieldToMatch(RuleGroupFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Output.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }

        public Builder textTransformations(Output<List<RuleGroupTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder textTransformations(List<RuleGroupTextTransformationArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public RuleGroupXssMatchStatementArgs build() {
            return new RuleGroupXssMatchStatementArgs(fieldToMatch, textTransformations);
        }
    }
}
