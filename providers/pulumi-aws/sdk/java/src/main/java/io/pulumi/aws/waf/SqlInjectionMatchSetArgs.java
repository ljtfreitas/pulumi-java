// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.waf.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
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
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
     * 
     */
    @InputImport(name="sqlInjectionMatchTuples")
    private final @Nullable Input<List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs>> sqlInjectionMatchTuples;

    public Input<List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs>> getSqlInjectionMatchTuples() {
        return this.sqlInjectionMatchTuples == null ? Input.empty() : this.sqlInjectionMatchTuples;
    }

    public SqlInjectionMatchSetArgs(
        @Nullable Input<String> name,
        @Nullable Input<List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs>> sqlInjectionMatchTuples) {
        this.name = name;
        this.sqlInjectionMatchTuples = sqlInjectionMatchTuples;
    }

    private SqlInjectionMatchSetArgs() {
        this.name = Input.empty();
        this.sqlInjectionMatchTuples = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlInjectionMatchSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs>> sqlInjectionMatchTuples;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlInjectionMatchSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sqlInjectionMatchTuples = defaults.sqlInjectionMatchTuples;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSqlInjectionMatchTuples(@Nullable Input<List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs>> sqlInjectionMatchTuples) {
            this.sqlInjectionMatchTuples = sqlInjectionMatchTuples;
            return this;
        }

        public Builder setSqlInjectionMatchTuples(@Nullable List<SqlInjectionMatchSetSqlInjectionMatchTupleArgs> sqlInjectionMatchTuples) {
            this.sqlInjectionMatchTuples = Input.ofNullable(sqlInjectionMatchTuples);
            return this;
        }
        public SqlInjectionMatchSetArgs build() {
            return new SqlInjectionMatchSetArgs(name, sqlInjectionMatchTuples);
        }
    }
}
