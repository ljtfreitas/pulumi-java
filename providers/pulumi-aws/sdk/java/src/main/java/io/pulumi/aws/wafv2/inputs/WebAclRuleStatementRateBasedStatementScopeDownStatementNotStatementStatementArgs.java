// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementGeoMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementLabelMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSizeConstraintStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementXssMatchStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs();

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    @Import(name="andStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementArgs> andStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementArgs> getAndStatement() {
        return this.andStatement == null ? Output.empty() : this.andStatement;
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Output.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementGeoMatchStatementArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Output.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Output.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementLabelMatchStatementArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Output.empty() : this.labelMatchStatement;
    }

    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    @Import(name="notStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementArgs> notStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementArgs> getNotStatement() {
        return this.notStatement == null ? Output.empty() : this.notStatement;
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    @Import(name="orStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs> orStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs> getOrStatement() {
        return this.orStatement == null ? Output.empty() : this.orStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Output.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSizeConstraintStatementArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Output.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Output.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
      private final @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement;

    public Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementXssMatchStatementArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Output.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs(
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementArgs> andStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementArgs> notStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs> orStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement,
        @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement) {
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

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs() {
        this.andStatement = Output.empty();
        this.byteMatchStatement = Output.empty();
        this.geoMatchStatement = Output.empty();
        this.ipSetReferenceStatement = Output.empty();
        this.labelMatchStatement = Output.empty();
        this.notStatement = Output.empty();
        this.orStatement = Output.empty();
        this.regexPatternSetReferenceStatement = Output.empty();
        this.sizeConstraintStatement = Output.empty();
        this.sqliMatchStatement = Output.empty();
        this.xssMatchStatement = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementArgs> andStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementArgs> notStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs> orStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement;
        private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs defaults) {
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

        public Builder andStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementArgs> andStatement) {
            this.andStatement = andStatement;
            return this;
        }

        public Builder andStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementArgs andStatement) {
            this.andStatement = Output.ofNullable(andStatement);
            return this;
        }

        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder byteMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs byteMatchStatement) {
            this.byteMatchStatement = Output.ofNullable(byteMatchStatement);
            return this;
        }

        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder geoMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementGeoMatchStatementArgs geoMatchStatement) {
            this.geoMatchStatement = Output.ofNullable(geoMatchStatement);
            return this;
        }

        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder ipSetReferenceStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Output.ofNullable(ipSetReferenceStatement);
            return this;
        }

        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder labelMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementLabelMatchStatementArgs labelMatchStatement) {
            this.labelMatchStatement = Output.ofNullable(labelMatchStatement);
            return this;
        }

        public Builder notStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementArgs> notStatement) {
            this.notStatement = notStatement;
            return this;
        }

        public Builder notStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementArgs notStatement) {
            this.notStatement = Output.ofNullable(notStatement);
            return this;
        }

        public Builder orStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs> orStatement) {
            this.orStatement = orStatement;
            return this;
        }

        public Builder orStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs orStatement) {
            this.orStatement = Output.ofNullable(orStatement);
            return this;
        }

        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder regexPatternSetReferenceStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Output.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }

        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder sizeConstraintStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSizeConstraintStatementArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Output.ofNullable(sizeConstraintStatement);
            return this;
        }

        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder sqliMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementArgs sqliMatchStatement) {
            this.sqliMatchStatement = Output.ofNullable(sqliMatchStatement);
            return this;
        }

        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder xssMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementXssMatchStatementArgs xssMatchStatement) {
            this.xssMatchStatement = Output.ofNullable(xssMatchStatement);
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs(andStatement, byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, notStatement, orStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
