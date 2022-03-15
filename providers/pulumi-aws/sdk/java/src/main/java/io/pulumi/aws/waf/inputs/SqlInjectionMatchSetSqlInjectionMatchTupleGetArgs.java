// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.aws.waf.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatchGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs Empty = new SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs();

    /**
     * Specifies where in a web request to look for snippets of malicious SQL code.
     * 
     */
    @Import(name="fieldToMatch", required=true)
      private final Output<SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatchGetArgs> fieldToMatch;

    public Output<SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
     * If you specify a transformation, AWS WAF performs the transformation on `field_to_match` before inspecting a request for a match.
     * e.g., `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
     * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_SqlInjectionMatchTuple.html#WAF-Type-SqlInjectionMatchTuple-TextTransformation)
     * for all supported values.
     * 
     */
    @Import(name="textTransformation", required=true)
      private final Output<String> textTransformation;

    public Output<String> getTextTransformation() {
        return this.textTransformation;
    }

    public SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs(
        Output<SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatchGetArgs> fieldToMatch,
        Output<String> textTransformation) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.textTransformation = Objects.requireNonNull(textTransformation, "expected parameter 'textTransformation' to be non-null");
    }

    private SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs() {
        this.fieldToMatch = Output.empty();
        this.textTransformation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatchGetArgs> fieldToMatch;
        private Output<String> textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder fieldToMatch(Output<SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder fieldToMatch(SqlInjectionMatchSetSqlInjectionMatchTupleFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Output.of(Objects.requireNonNull(fieldToMatch));
            return this;
        }

        public Builder textTransformation(Output<String> textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }

        public Builder textTransformation(String textTransformation) {
            this.textTransformation = Output.of(Objects.requireNonNull(textTransformation));
            return this;
        }
        public SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs build() {
            return new SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs(fieldToMatch, textTransformation);
        }
    }
}
