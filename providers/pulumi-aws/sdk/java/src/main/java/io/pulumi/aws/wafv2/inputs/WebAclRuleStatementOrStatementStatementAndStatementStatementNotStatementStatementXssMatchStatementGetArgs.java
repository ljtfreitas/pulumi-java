// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch;

    public Input<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Input.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
    private final Input<List<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations;

    public Input<List<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs(
        @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch,
        Input<List<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs() {
        this.fieldToMatch = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch;
        private Input<List<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setFieldToMatch(@Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setFieldToMatch(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Input.ofNullable(fieldToMatch);
            return this;
        }

        public Builder setTextTransformations(Input<List<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder setTextTransformations(List<WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs build() {
            return new WebAclRuleStatementOrStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementGetArgs(fieldToMatch, textTransformations);
        }
    }
}
