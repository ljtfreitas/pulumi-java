// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class MigrateSqlServerSqlMITaskOutputErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlMITaskOutputErrorResponse Empty = new MigrateSqlServerSqlMITaskOutputErrorResponse();

    /**
     * Migration error
     * 
     */
    @InputImport(name="error", required=true)
        private final ReportableExceptionResponse error;

    public ReportableExceptionResponse getError() {
        return this.error;
    }

    /**
     * Result identifier
     * 
     */
    @InputImport(name="id", required=true)
        private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Result type
     * Expected value is 'ErrorOutput'.
     * 
     */
    @InputImport(name="resultType", required=true)
        private final String resultType;

    public String getResultType() {
        return this.resultType;
    }

    public MigrateSqlServerSqlMITaskOutputErrorResponse(
        ReportableExceptionResponse error,
        String id,
        String resultType) {
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
    }

    private MigrateSqlServerSqlMITaskOutputErrorResponse() {
        this.error = null;
        this.id = null;
        this.resultType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMITaskOutputErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportableExceptionResponse error;
        private String id;
        private String resultType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMITaskOutputErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.id = defaults.id;
    	      this.resultType = defaults.resultType;
        }

        public Builder setError(ReportableExceptionResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }
        public MigrateSqlServerSqlMITaskOutputErrorResponse build() {
            return new MigrateSqlServerSqlMITaskOutputErrorResponse(error, id, resultType);
        }
    }
}
