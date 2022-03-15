// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobQueryScriptOptions {
    /**
     * Determines which statement in the script represents the "key result",
     * used to populate the schema and query results of the script job.
     * Possible values are `LAST` and `FIRST_SELECT`.
     * 
     */
    private final @Nullable String keyResultStatement;
    /**
     * Limit on the number of bytes billed per statement. Exceeding this budget results in an error.
     * 
     */
    private final @Nullable String statementByteBudget;
    /**
     * Timeout period for each statement in a script.
     * 
     */
    private final @Nullable String statementTimeoutMs;

    @CustomType.Constructor
    private JobQueryScriptOptions(
        @CustomType.Parameter("keyResultStatement") @Nullable String keyResultStatement,
        @CustomType.Parameter("statementByteBudget") @Nullable String statementByteBudget,
        @CustomType.Parameter("statementTimeoutMs") @Nullable String statementTimeoutMs) {
        this.keyResultStatement = keyResultStatement;
        this.statementByteBudget = statementByteBudget;
        this.statementTimeoutMs = statementTimeoutMs;
    }

    /**
     * Determines which statement in the script represents the "key result",
     * used to populate the schema and query results of the script job.
     * Possible values are `LAST` and `FIRST_SELECT`.
     * 
    */
    public Optional<String> getKeyResultStatement() {
        return Optional.ofNullable(this.keyResultStatement);
    }
    /**
     * Limit on the number of bytes billed per statement. Exceeding this budget results in an error.
     * 
    */
    public Optional<String> getStatementByteBudget() {
        return Optional.ofNullable(this.statementByteBudget);
    }
    /**
     * Timeout period for each statement in a script.
     * 
    */
    public Optional<String> getStatementTimeoutMs() {
        return Optional.ofNullable(this.statementTimeoutMs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQueryScriptOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyResultStatement;
        private @Nullable String statementByteBudget;
        private @Nullable String statementTimeoutMs;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQueryScriptOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyResultStatement = defaults.keyResultStatement;
    	      this.statementByteBudget = defaults.statementByteBudget;
    	      this.statementTimeoutMs = defaults.statementTimeoutMs;
        }

        public Builder keyResultStatement(@Nullable String keyResultStatement) {
            this.keyResultStatement = keyResultStatement;
            return this;
        }

        public Builder statementByteBudget(@Nullable String statementByteBudget) {
            this.statementByteBudget = statementByteBudget;
            return this;
        }

        public Builder statementTimeoutMs(@Nullable String statementTimeoutMs) {
            this.statementTimeoutMs = statementTimeoutMs;
            return this;
        }
        public JobQueryScriptOptions build() {
            return new JobQueryScriptOptions(keyResultStatement, statementByteBudget, statementTimeoutMs);
        }
    }
}
