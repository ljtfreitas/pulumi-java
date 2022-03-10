// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPreparedStatementResult {
    /**
     * The description of the prepared statement.
     * 
     */
    private final @Nullable String description;
    /**
     * The query string for the prepared statement.
     * 
     */
    private final @Nullable String queryStatement;

    @OutputCustomType.Constructor
    private GetPreparedStatementResult(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("queryStatement") @Nullable String queryStatement) {
        this.description = description;
        this.queryStatement = queryStatement;
    }

    /**
     * The description of the prepared statement.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The query string for the prepared statement.
     * 
    */
    public Optional<String> getQueryStatement() {
        return Optional.ofNullable(this.queryStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPreparedStatementResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String queryStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPreparedStatementResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.queryStatement = defaults.queryStatement;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setQueryStatement(@Nullable String queryStatement) {
            this.queryStatement = queryStatement;
            return this;
        }
        public GetPreparedStatementResult build() {
            return new GetPreparedStatementResult(description, queryStatement);
        }
    }
}
