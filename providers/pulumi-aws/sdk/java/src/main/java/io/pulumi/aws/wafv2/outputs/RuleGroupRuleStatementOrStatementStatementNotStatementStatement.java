// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementByteMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementLabelMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementSizeConstraintStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementXssMatchStatement;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleStatementOrStatementStatementNotStatementStatement {
    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementByteMatchStatement byteMatchStatement;
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatement geoMatchStatement;
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementLabelMatchStatement labelMatchStatement;
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatement sqliMatchStatement;
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementXssMatchStatement xssMatchStatement;

    @OutputCustomType.Constructor({"byteMatchStatement","geoMatchStatement","ipSetReferenceStatement","labelMatchStatement","regexPatternSetReferenceStatement","sizeConstraintStatement","sqliMatchStatement","xssMatchStatement"})
    private RuleGroupRuleStatementOrStatementStatementNotStatementStatement(
        @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementByteMatchStatement byteMatchStatement,
        @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatement geoMatchStatement,
        @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement,
        @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementLabelMatchStatement labelMatchStatement,
        @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement,
        @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement,
        @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatement sqliMatchStatement,
        @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementXssMatchStatement xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementByteMatchStatement> getByteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatement> getGeoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement> getIpSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementLabelMatchStatement> getLabelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementSizeConstraintStatement> getSizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatement> getSqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementXssMatchStatement> getXssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementNotStatementStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementByteMatchStatement byteMatchStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatement geoMatchStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementLabelMatchStatement labelMatchStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementXssMatchStatement xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementNotStatementStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder setByteMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public RuleGroupRuleStatementOrStatementStatementNotStatementStatement build() {
            return new RuleGroupRuleStatementOrStatementStatementNotStatementStatement(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
