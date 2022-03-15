// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.waf.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlInjectionMatchSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlInjectionMatchSetArgs Empty = new SqlInjectionMatchSetArgs();

    /**
     * The name or description of the SQL Injection Match Set.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
     * 
     */
    @Import(name="sqlInjectionMatchTuples")
      private final @Nullable Output<List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs>> sqlInjectionMatchTuples;

    public Output<List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs>> getSqlInjectionMatchTuples() {
        return this.sqlInjectionMatchTuples == null ? Output.empty() : this.sqlInjectionMatchTuples;
    }

    public SqlInjectionMatchSetArgs(
        @Nullable Output<String> name,
        @Nullable Output<List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs>> sqlInjectionMatchTuples) {
        this.name = name;
        this.sqlInjectionMatchTuples = sqlInjectionMatchTuples;
    }

    private SqlInjectionMatchSetArgs() {
        this.name = Output.empty();
        this.sqlInjectionMatchTuples = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlInjectionMatchSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs>> sqlInjectionMatchTuples;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlInjectionMatchSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sqlInjectionMatchTuples = defaults.sqlInjectionMatchTuples;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder sqlInjectionMatchTuples(@Nullable Output<List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs>> sqlInjectionMatchTuples) {
            this.sqlInjectionMatchTuples = sqlInjectionMatchTuples;
            return this;
        }

        public Builder sqlInjectionMatchTuples(@Nullable List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs> sqlInjectionMatchTuples) {
            this.sqlInjectionMatchTuples = Output.ofNullable(sqlInjectionMatchTuples);
            return this;
        }
        public SqlInjectionMatchSetArgs build() {
            return new SqlInjectionMatchSetArgs(name, sqlInjectionMatchTuples);
        }
    }
}
