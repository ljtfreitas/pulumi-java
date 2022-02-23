// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementLabelMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGetArgs Empty = new WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGetArgs();

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @InputImport(name="byteMatchStatement")
    private final @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementGetArgs> byteMatchStatement;

    public Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementGetArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Input.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @InputImport(name="geoMatchStatement")
    private final @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;

    public Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementGetArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Input.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @InputImport(name="ipSetReferenceStatement")
    private final @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;

    public Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Input.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @InputImport(name="labelMatchStatement")
    private final @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;

    public Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementLabelMatchStatementGetArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Input.empty() : this.labelMatchStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @InputImport(name="regexPatternSetReferenceStatement")
    private final @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;

    public Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Input.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @InputImport(name="sizeConstraintStatement")
    private final @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;

    public Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Input.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @InputImport(name="sqliMatchStatement")
    private final @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;

    public Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Input.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @InputImport(name="xssMatchStatement")
    private final @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

    public Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementGetArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Input.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGetArgs(
        @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementGetArgs> byteMatchStatement,
        @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementGetArgs> geoMatchStatement,
        @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement,
        @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementLabelMatchStatementGetArgs> labelMatchStatement,
        @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement,
        @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement,
        @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement,
        @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGetArgs() {
        this.byteMatchStatement = Input.empty();
        this.geoMatchStatement = Input.empty();
        this.ipSetReferenceStatement = Input.empty();
        this.labelMatchStatement = Input.empty();
        this.regexPatternSetReferenceStatement = Input.empty();
        this.sizeConstraintStatement = Input.empty();
        this.sqliMatchStatement = Input.empty();
        this.xssMatchStatement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementGetArgs> byteMatchStatement;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGetArgs defaults) {
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

        public Builder setByteMatchStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementGetArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setByteMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementByteMatchStatementGetArgs byteMatchStatement) {
            this.byteMatchStatement = Input.ofNullable(byteMatchStatement);
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementGetArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementGetArgs geoMatchStatement) {
            this.geoMatchStatement = Input.ofNullable(geoMatchStatement);
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementIpSetReferenceStatementGetArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Input.ofNullable(ipSetReferenceStatement);
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementLabelMatchStatementGetArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementLabelMatchStatementGetArgs labelMatchStatement) {
            this.labelMatchStatement = Input.ofNullable(labelMatchStatement);
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementRegexPatternSetReferenceStatementGetArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Input.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Input.ofNullable(sizeConstraintStatement);
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementSqliMatchStatementGetArgs sqliMatchStatement) {
            this.sqliMatchStatement = Input.ofNullable(sqliMatchStatement);
            return this;
        }

        public Builder setXssMatchStatement(@Nullable Input<WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementXssMatchStatementGetArgs xssMatchStatement) {
            this.xssMatchStatement = Input.ofNullable(xssMatchStatement);
            return this;
        }
        public WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGetArgs build() {
            return new WebAclRuleStatementNotStatementStatementOrStatementStatementAndStatementStatementGetArgs(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}