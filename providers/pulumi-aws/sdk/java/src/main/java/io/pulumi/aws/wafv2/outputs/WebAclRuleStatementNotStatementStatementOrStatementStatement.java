// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementGeoMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementLabelMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementSizeConstraintStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementOrStatementStatementXssMatchStatement;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementNotStatementStatementOrStatementStatement {
    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatement andStatement;
    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatement byteMatchStatement;
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementGeoMatchStatement geoMatchStatement;
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementLabelMatchStatement labelMatchStatement;
    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement notStatement;
    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement orStatement;
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement sqliMatchStatement;
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementXssMatchStatement xssMatchStatement;

    @OutputCustomType.Constructor({"andStatement","byteMatchStatement","geoMatchStatement","ipSetReferenceStatement","labelMatchStatement","notStatement","orStatement","regexPatternSetReferenceStatement","sizeConstraintStatement","sqliMatchStatement","xssMatchStatement"})
    private WebAclRuleStatementNotStatementStatementOrStatementStatement(
        @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatement andStatement,
        @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatement byteMatchStatement,
        @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementGeoMatchStatement geoMatchStatement,
        @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatement ipSetReferenceStatement,
        @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementLabelMatchStatement labelMatchStatement,
        @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement notStatement,
        @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement orStatement,
        @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement,
        @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementSizeConstraintStatement sizeConstraintStatement,
        @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement sqliMatchStatement,
        @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementXssMatchStatement xssMatchStatement) {
        this.andStatement = andStatement;
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.notStatement = notStatement;
        this.orStatement = orStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatement> getAndStatement() {
        return Optional.ofNullable(this.andStatement);
    }
    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatement> getByteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementGeoMatchStatement> getGeoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatement> getIpSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementLabelMatchStatement> getLabelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement> getNotStatement() {
        return Optional.ofNullable(this.notStatement);
    }
    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement> getOrStatement() {
        return Optional.ofNullable(this.orStatement);
    }
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementSizeConstraintStatement> getSizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement> getSqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementOrStatementStatementXssMatchStatement> getXssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementOrStatementStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatement andStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatement byteMatchStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementGeoMatchStatement geoMatchStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementLabelMatchStatement labelMatchStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement notStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement orStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementXssMatchStatement xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementOrStatementStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andStatement = defaults.andStatement;
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.notStatement = defaults.notStatement;
    	      this.orStatement = defaults.orStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder setAndStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatement andStatement) {
            this.andStatement = andStatement;
            return this;
        }

        public Builder setByteMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setNotStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementNotStatement notStatement) {
            this.notStatement = notStatement;
            return this;
        }

        public Builder setOrStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatement orStatement) {
            this.orStatement = orStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public WebAclRuleStatementNotStatementStatementOrStatementStatement build() {
            return new WebAclRuleStatementNotStatementStatementOrStatementStatement(andStatement, byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, notStatement, orStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
