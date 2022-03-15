// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatchArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupTextTransformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRegexPatternSetReferenceStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRegexPatternSetReferenceStatementArgs Empty = new RuleGroupRegexPatternSetReferenceStatementArgs();

    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }

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

    public RuleGroupRegexPatternSetReferenceStatementArgs(
        Output<String> arn,
        Output<RuleGroupFieldToMatchArgs> fieldToMatch,
        Output<List<RuleGroupTextTransformationArgs>> textTransformations) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private RuleGroupRegexPatternSetReferenceStatementArgs() {
        this.arn = Output.empty();
        this.fieldToMatch = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRegexPatternSetReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private Output<RuleGroupFieldToMatchArgs> fieldToMatch;
        private Output<List<RuleGroupTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRegexPatternSetReferenceStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
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
        public RuleGroupRegexPatternSetReferenceStatementArgs build() {
            return new RuleGroupRegexPatternSetReferenceStatementArgs(arn, fieldToMatch, textTransformations);
        }
    }
}
