// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs Empty = new WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs();

    /**
     * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Output.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations;

    public Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs(
        Output<String> arn,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch,
        Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs() {
        this.arn = Output.empty();
        this.fieldToMatch = Output.empty();
        this.textTransformations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch;
        private Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs defaults) {
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

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Output.ofNullable(fieldToMatch);
            return this;
        }

        public Builder textTransformations(Output<List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs build() {
            return new WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs(arn, fieldToMatch, textTransformations);
        }
    }
}
