// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Task errors for Sql Server to Azure Sql DB migration.
 * 
 */
public final class MigrateSqlServerSqlDbTaskOutputErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlDbTaskOutputErrorResponse Empty = new MigrateSqlServerSqlDbTaskOutputErrorResponse();

    /**
     * Migration error
     * 
     */
    @Import(name="error", required=true)
      private final ReportableExceptionResponse error;

    public ReportableExceptionResponse getError() {
        return this.error;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Result type
     * Expected value is 'ErrorOutput'.
     * 
     */
    @Import(name="resultType", required=true)
      private final String resultType;

    public String getResultType() {
        return this.resultType;
    }

    public MigrateSqlServerSqlDbTaskOutputErrorResponse(
        ReportableExceptionResponse error,
        String id,
        String resultType) {
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
    }

    private MigrateSqlServerSqlDbTaskOutputErrorResponse() {
        this.error = null;
        this.id = null;
        this.resultType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbTaskOutputErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportableExceptionResponse error;
        private String id;
        private String resultType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbTaskOutputErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
        }

        public Builder error(ReportableExceptionResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }
        public MigrateSqlServerSqlDbTaskOutputErrorResponse build() {
            return new MigrateSqlServerSqlDbTaskOutputErrorResponse(error, id, resultType);
        }
    }
}
