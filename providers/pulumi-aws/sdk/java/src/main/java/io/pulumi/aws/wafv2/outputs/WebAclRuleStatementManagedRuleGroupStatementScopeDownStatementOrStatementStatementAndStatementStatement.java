// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementByteMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementGeoMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementLabelMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSizeConstraintStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatement;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatement;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatement {
    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement;
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement;

    @OutputCustomType.Constructor({"byteMatchStatement","geoMatchStatement","ipSetReferenceStatement","labelMatchStatement","regexPatternSetReferenceStatement","sizeConstraintStatement","sqliMatchStatement","xssMatchStatement"})
    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatement(
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement,
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement,
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement,
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement,
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement,
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement,
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement,
        @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement) {
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
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementByteMatchStatement> getByteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementGeoMatchStatement> getGeoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement> getIpSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementLabelMatchStatement> getLabelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSizeConstraintStatement> getSizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatement> getSqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatement> getXssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatement defaults) {
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

        public Builder setByteMatchStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatement build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatement(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
