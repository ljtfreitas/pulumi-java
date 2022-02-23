// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.WebACLFieldToMatch;
import io.pulumi.awsnative.wafv2.outputs.WebACLTextTransformation;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WebACLRegexPatternSetReferenceStatement {
    private final String arn;
    private final WebACLFieldToMatch fieldToMatch;
    private final List<WebACLTextTransformation> textTransformations;

    @OutputCustomType.Constructor({"arn","fieldToMatch","textTransformations"})
    private WebACLRegexPatternSetReferenceStatement(
        String arn,
        WebACLFieldToMatch fieldToMatch,
        List<WebACLTextTransformation> textTransformations) {
        this.arn = Objects.requireNonNull(arn);
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
        this.textTransformations = Objects.requireNonNull(textTransformations);
    }

    public String getArn() {
        return this.arn;
    }
    public WebACLFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }
    public List<WebACLTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLRegexPatternSetReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private WebACLFieldToMatch fieldToMatch;
        private List<WebACLTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLRegexPatternSetReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setFieldToMatch(WebACLFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setTextTransformations(List<WebACLTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public WebACLRegexPatternSetReferenceStatement build() {
            return new WebACLRegexPatternSetReferenceStatement(arn, fieldToMatch, textTransformations);
        }
    }
}
