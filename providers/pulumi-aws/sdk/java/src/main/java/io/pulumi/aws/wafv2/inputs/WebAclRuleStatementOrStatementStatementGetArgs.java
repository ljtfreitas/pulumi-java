// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementByteMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementGeoMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementIpSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementLabelMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementSizeConstraintStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementSqliMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementXssMatchStatementGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementGetArgs();

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    @InputImport(name="andStatement")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementGetArgs> andStatement;

    public Input<WebAclRuleStatementOrStatementStatementAndStatementGetArgs> getAndStatement() {
        return this.andStatement == null ? Input.empty() : this.andStatement;
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @InputImport(name="byteMatchStatement")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement;

    public Input<WebAclRuleStatementOrStatementStatementByteMatchStatementGetArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Input.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @InputImport(name="geoMatchStatement")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;

    public Input<WebAclRuleStatementOrStatementStatementGeoMatchStatementGetArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Input.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @InputImport(name="ipSetReferenceStatement")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;

    public Input<WebAclRuleStatementOrStatementStatementIpSetReferenceStatementGetArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Input.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @InputImport(name="labelMatchStatement")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;

    public Input<WebAclRuleStatementOrStatementStatementLabelMatchStatementGetArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Input.empty() : this.labelMatchStatement;
    }

    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    @InputImport(name="notStatement")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementNotStatementGetArgs> notStatement;

    public Input<WebAclRuleStatementOrStatementStatementNotStatementGetArgs> getNotStatement() {
        return this.notStatement == null ? Input.empty() : this.notStatement;
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    @InputImport(name="orStatement")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementGetArgs> orStatement;

    public Input<WebAclRuleStatementOrStatementStatementOrStatementGetArgs> getOrStatement() {
        return this.orStatement == null ? Input.empty() : this.orStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @InputImport(name="regexPatternSetReferenceStatement")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;

    public Input<WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Input.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @InputImport(name="sizeConstraintStatement")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;

    public Input<WebAclRuleStatementOrStatementStatementSizeConstraintStatementGetArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Input.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @InputImport(name="sqliMatchStatement")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;

    public Input<WebAclRuleStatementOrStatementStatementSqliMatchStatementGetArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Input.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @InputImport(name="xssMatchStatement")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

    public Input<WebAclRuleStatementOrStatementStatementXssMatchStatementGetArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Input.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementOrStatementStatementGetArgs(
        @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementGetArgs> andStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementNotStatementGetArgs> notStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementGetArgs> orStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement,
        @Nullable Input<WebAclRuleStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
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

    private WebAclRuleStatementOrStatementStatementGetArgs() {
        this.andStatement = Input.empty();
        this.byteMatchStatement = Input.empty();
        this.geoMatchStatement = Input.empty();
        this.ipSetReferenceStatement = Input.empty();
        this.labelMatchStatement = Input.empty();
        this.notStatement = Input.empty();
        this.orStatement = Input.empty();
        this.regexPatternSetReferenceStatement = Input.empty();
        this.sizeConstraintStatement = Input.empty();
        this.sqliMatchStatement = Input.empty();
        this.xssMatchStatement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementGetArgs> andStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementNotStatementGetArgs> notStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementGetArgs> orStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementGetArgs defaults) {
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

        public Builder setAndStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementGetArgs> andStatement) {
            this.andStatement = andStatement;
            return this;
        }

        public Builder setAndStatement(@Nullable WebAclRuleStatementOrStatementStatementAndStatementGetArgs andStatement) {
            this.andStatement = Input.ofNullable(andStatement);
            return this;
        }

        public Builder setByteMatchStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setByteMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementByteMatchStatementGetArgs byteMatchStatement) {
            this.byteMatchStatement = Input.ofNullable(byteMatchStatement);
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementGeoMatchStatementGetArgs geoMatchStatement) {
            this.geoMatchStatement = Input.ofNullable(geoMatchStatement);
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable WebAclRuleStatementOrStatementStatementIpSetReferenceStatementGetArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Input.ofNullable(ipSetReferenceStatement);
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementLabelMatchStatementGetArgs labelMatchStatement) {
            this.labelMatchStatement = Input.ofNullable(labelMatchStatement);
            return this;
        }

        public Builder setNotStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementNotStatementGetArgs> notStatement) {
            this.notStatement = notStatement;
            return this;
        }

        public Builder setNotStatement(@Nullable WebAclRuleStatementOrStatementStatementNotStatementGetArgs notStatement) {
            this.notStatement = Input.ofNullable(notStatement);
            return this;
        }

        public Builder setOrStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementOrStatementGetArgs> orStatement) {
            this.orStatement = orStatement;
            return this;
        }

        public Builder setOrStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementGetArgs orStatement) {
            this.orStatement = Input.ofNullable(orStatement);
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable WebAclRuleStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Input.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable WebAclRuleStatementOrStatementStatementSizeConstraintStatementGetArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Input.ofNullable(sizeConstraintStatement);
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementSqliMatchStatementGetArgs sqliMatchStatement) {
            this.sqliMatchStatement = Input.ofNullable(sqliMatchStatement);
            return this;
        }

        public Builder setXssMatchStatement(@Nullable Input<WebAclRuleStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementXssMatchStatementGetArgs xssMatchStatement) {
            this.xssMatchStatement = Input.ofNullable(xssMatchStatement);
            return this;
        }
        public WebAclRuleStatementOrStatementStatementGetArgs build() {
            return new WebAclRuleStatementOrStatementStatementGetArgs(andStatement, byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, notStatement, orStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
