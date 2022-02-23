// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs();

    /**
     * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    @InputImport(name="arn", required=true)
    private final Input<String> arn;

    public Input<String> getArn() {
        return this.arn;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch;

    public Input<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Input.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
    private final Input<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations;

    public Input<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs(
        Input<String> arn,
        @Nullable Input<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch,
        Input<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs() {
        this.arn = Input.empty();
        this.fieldToMatch = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> arn;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch;
        private Input<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setArn(Input<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Input.of(Objects.requireNonNull(arn));
            return this;
        }

        public Builder setFieldToMatch(@Nullable Input<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setFieldToMatch(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Input.ofNullable(fieldToMatch);
            return this;
        }

        public Builder setTextTransformations(Input<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder setTextTransformations(List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs build() {
            return new WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs(arn, fieldToMatch, textTransformations);
        }
    }
}