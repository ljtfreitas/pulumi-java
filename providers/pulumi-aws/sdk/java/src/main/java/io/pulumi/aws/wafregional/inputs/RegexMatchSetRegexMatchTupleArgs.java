// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.RegexMatchSetRegexMatchTupleFieldToMatchArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RegexMatchSetRegexMatchTupleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegexMatchSetRegexMatchTupleArgs Empty = new RegexMatchSetRegexMatchTupleArgs();

    /**
     * The part of a web request that you want to search, such as a specified header or a query string.
     * 
     */
    @InputImport(name="fieldToMatch", required=true)
    private final Input<RegexMatchSetRegexMatchTupleFieldToMatchArgs> fieldToMatch;

    public Input<RegexMatchSetRegexMatchTupleFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * The ID of a `WAF Regex Pattern Set`.
     * 
     */
    @InputImport(name="regexPatternSetId", required=true)
    private final Input<String> regexPatternSetId;

    public Input<String> getRegexPatternSetId() {
        return this.regexPatternSetId;
    }

    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    @InputImport(name="textTransformation", required=true)
    private final Input<String> textTransformation;

    public Input<String> getTextTransformation() {
        return this.textTransformation;
    }

    public RegexMatchSetRegexMatchTupleArgs(
        Input<RegexMatchSetRegexMatchTupleFieldToMatchArgs> fieldToMatch,
        Input<String> regexPatternSetId,
        Input<String> textTransformation) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.regexPatternSetId = Objects.requireNonNull(regexPatternSetId, "expected parameter 'regexPatternSetId' to be non-null");
        this.textTransformation = Objects.requireNonNull(textTransformation, "expected parameter 'textTransformation' to be non-null");
    }

    private RegexMatchSetRegexMatchTupleArgs() {
        this.fieldToMatch = Input.empty();
        this.regexPatternSetId = Input.empty();
        this.textTransformation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexMatchSetRegexMatchTupleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RegexMatchSetRegexMatchTupleFieldToMatchArgs> fieldToMatch;
        private Input<String> regexPatternSetId;
        private Input<String> textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexMatchSetRegexMatchTupleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.regexPatternSetId = defaults.regexPatternSetId;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder setFieldToMatch(Input<RegexMatchSetRegexMatchTupleFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setFieldToMatch(RegexMatchSetRegexMatchTupleFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }

        public Builder setRegexPatternSetId(Input<String> regexPatternSetId) {
            this.regexPatternSetId = Objects.requireNonNull(regexPatternSetId);
            return this;
        }

        public Builder setRegexPatternSetId(String regexPatternSetId) {
            this.regexPatternSetId = Input.of(Objects.requireNonNull(regexPatternSetId));
            return this;
        }

        public Builder setTextTransformation(Input<String> textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }

        public Builder setTextTransformation(String textTransformation) {
            this.textTransformation = Input.of(Objects.requireNonNull(textTransformation));
            return this;
        }
        public RegexMatchSetRegexMatchTupleArgs build() {
            return new RegexMatchSetRegexMatchTupleArgs(fieldToMatch, regexPatternSetId, textTransformation);
        }
    }
}
