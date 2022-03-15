// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement {
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations;

    @CustomType.Constructor
    private WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement(
        @CustomType.Parameter("fieldToMatch") @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch fieldToMatch,
        @CustomType.Parameter("textTransformations") List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = textTransformations;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch> getFieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
    */
    public List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
        private List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement build() {
            return new WebAclRuleStatementOrStatementStatementAndStatementStatementAndStatementStatementXssMatchStatement(fieldToMatch, textTransformations);
        }
    }
}
