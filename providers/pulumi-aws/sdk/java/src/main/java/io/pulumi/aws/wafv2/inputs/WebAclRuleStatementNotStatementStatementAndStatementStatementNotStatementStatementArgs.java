// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementLabelMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementArgs Empty = new WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementArgs();

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Output.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatementArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Output.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Output.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementLabelMatchStatementArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Output.empty() : this.labelMatchStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Output.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Output.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Output.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Output.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementArgs(
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement) {
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementArgs() {
        this.byteMatchStatement = Output.empty();
        this.geoMatchStatement = Output.empty();
        this.ipSetReferenceStatement = Output.empty();
        this.labelMatchStatement = Output.empty();
        this.regexPatternSetReferenceStatement = Output.empty();
        this.sizeConstraintStatement = Output.empty();
        this.sqliMatchStatement = Output.empty();
        this.xssMatchStatement = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementArgs defaults) {
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

        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder byteMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementArgs byteMatchStatement) {
            this.byteMatchStatement = Output.ofNullable(byteMatchStatement);
            return this;
        }

        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder geoMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementGeoMatchStatementArgs geoMatchStatement) {
            this.geoMatchStatement = Output.ofNullable(geoMatchStatement);
            return this;
        }

        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder ipSetReferenceStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Output.ofNullable(ipSetReferenceStatement);
            return this;
        }

        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder labelMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementLabelMatchStatementArgs labelMatchStatement) {
            this.labelMatchStatement = Output.ofNullable(labelMatchStatement);
            return this;
        }

        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder regexPatternSetReferenceStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Output.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }

        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder sizeConstraintStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementSizeConstraintStatementArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Output.ofNullable(sizeConstraintStatement);
            return this;
        }

        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder sqliMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementArgs sqliMatchStatement) {
            this.sqliMatchStatement = Output.ofNullable(sqliMatchStatement);
            return this;
        }

        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder xssMatchStatement(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementXssMatchStatementArgs xssMatchStatement) {
            this.xssMatchStatement = Output.ofNullable(xssMatchStatement);
            return this;
        }
        public WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementArgs build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementArgs(byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
