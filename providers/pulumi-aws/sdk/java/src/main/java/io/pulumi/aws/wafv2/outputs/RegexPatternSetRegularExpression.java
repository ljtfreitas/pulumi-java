// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RegexPatternSetRegularExpression {
    /**
     * The string representing the regular expression, see the AWS WAF [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/waf-regex-pattern-set-creating.html) for more information.
     * 
     */
    private final String regexString;

    @OutputCustomType.Constructor({"regexString"})
    private RegexPatternSetRegularExpression(String regexString) {
        this.regexString = Objects.requireNonNull(regexString);
    }

    /**
     * The string representing the regular expression, see the AWS WAF [documentation](https://docs.aws.amazon.com/waf/latest/developerguide/waf-regex-pattern-set-creating.html) for more information.
     * 
     */
    public String getRegexString() {
        return this.regexString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexPatternSetRegularExpression defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String regexString;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexPatternSetRegularExpression defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexString = defaults.regexString;
        }

        public Builder setRegexString(String regexString) {
            this.regexString = Objects.requireNonNull(regexString);
            return this;
        }
        public RegexPatternSetRegularExpression build() {
            return new RegexPatternSetRegularExpression(regexString);
        }
    }
}
