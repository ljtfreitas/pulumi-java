// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementArgs Empty = new WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Output.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

    public Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementArgs(
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch,
        Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementArgs() {
        this.fieldToMatch = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;
        private Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Output.ofNullable(fieldToMatch);
            return this;
        }

        public Builder textTransformations(Output<List<WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementTextTransformationArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementArgs build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementSqliMatchStatementArgs(fieldToMatch, textTransformations);
        }
    }
}
