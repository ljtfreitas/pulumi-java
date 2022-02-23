// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.outputs;

import io.pulumi.aws.waf.outputs.XssMatchSetXssMatchTupleFieldToMatch;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class XssMatchSetXssMatchTuple {
    /**
     * Specifies where in a web request to look for cross-site scripting attacks.
     * 
     */
    private final XssMatchSetXssMatchTupleFieldToMatch fieldToMatch;
    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * If you specify a transformation, AWS WAF performs the transformation on `target_string` before inspecting a request for a match.
     * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_XssMatchTuple.html#WAF-Type-XssMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    private final String textTransformation;

    @OutputCustomType.Constructor({"fieldToMatch","textTransformation"})
    private XssMatchSetXssMatchTuple(
        XssMatchSetXssMatchTupleFieldToMatch fieldToMatch,
        String textTransformation) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
        this.textTransformation = Objects.requireNonNull(textTransformation);
    }

    /**
     * Specifies where in a web request to look for cross-site scripting attacks.
     * 
     */
    public XssMatchSetXssMatchTupleFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }
    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * If you specify a transformation, AWS WAF performs the transformation on `target_string` before inspecting a request for a match.
     * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_XssMatchTuple.html#WAF-Type-XssMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    public String getTextTransformation() {
        return this.textTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XssMatchSetXssMatchTuple defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private XssMatchSetXssMatchTupleFieldToMatch fieldToMatch;
        private String textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(XssMatchSetXssMatchTuple defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder setFieldToMatch(XssMatchSetXssMatchTupleFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setTextTransformation(String textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }
        public XssMatchSetXssMatchTuple build() {
            return new XssMatchSetXssMatchTuple(fieldToMatch, textTransformation);
        }
    }
}
