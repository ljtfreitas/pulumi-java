// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs Empty = new WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch;

    public Output<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Output.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations;

    public Output<List<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs(
        @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch,
        Output<List<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs() {
        this.fieldToMatch = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch;
        private Output<List<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Output.ofNullable(fieldToMatch);
            return this;
        }

        public Builder textTransformations(Output<List<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs build() {
            return new WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSqliMatchStatementGetArgs(fieldToMatch, textTransformations);
        }
    }
}
