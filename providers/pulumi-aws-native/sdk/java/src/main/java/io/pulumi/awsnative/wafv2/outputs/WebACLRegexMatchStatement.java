// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.WebACLFieldToMatch;
import io.pulumi.awsnative.wafv2.outputs.WebACLTextTransformation;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebACLRegexMatchStatement {
    private final WebACLFieldToMatch fieldToMatch;
    private final String regexString;
    private final List<WebACLTextTransformation> textTransformations;

    @CustomType.Constructor
    private WebACLRegexMatchStatement(
        @CustomType.Parameter("fieldToMatch") WebACLFieldToMatch fieldToMatch,
        @CustomType.Parameter("regexString") String regexString,
        @CustomType.Parameter("textTransformations") List<WebACLTextTransformation> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.regexString = regexString;
        this.textTransformations = textTransformations;
    }

    public WebACLFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }
    public String getRegexString() {
        return this.regexString;
    }
    public List<WebACLTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLRegexMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLFieldToMatch fieldToMatch;
        private String regexString;
        private List<WebACLTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLRegexMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.regexString = defaults.regexString;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(WebACLFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder regexString(String regexString) {
            this.regexString = Objects.requireNonNull(regexString);
            return this;
        }

        public Builder textTransformations(List<WebACLTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public WebACLRegexMatchStatement build() {
            return new WebACLRegexMatchStatement(fieldToMatch, regexString, textTransformations);
        }
    }
}
