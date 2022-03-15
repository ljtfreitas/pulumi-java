// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.DatabaseTableResponse;
import io.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetUserTablesSqlTaskOutputResponse {
    /**
     * Mapping from database name to list of tables
     * 
     */
    private final Map<String,List<DatabaseTableResponse>> databasesToTables;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Validation errors
     * 
     */
    private final List<ReportableExceptionResponse> validationErrors;

    @CustomType.Constructor
    private GetUserTablesSqlTaskOutputResponse(
        @CustomType.Parameter("databasesToTables") Map<String,List<DatabaseTableResponse>> databasesToTables,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("validationErrors") List<ReportableExceptionResponse> validationErrors) {
        this.databasesToTables = databasesToTables;
        this.id = id;
        this.validationErrors = validationErrors;
    }

    /**
     * Mapping from database name to list of tables
     * 
    */
    public Map<String,List<DatabaseTableResponse>> getDatabasesToTables() {
        return this.databasesToTables;
    }
    /**
     * Result identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Validation errors
     * 
    */
    public List<ReportableExceptionResponse> getValidationErrors() {
        return this.validationErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserTablesSqlTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,List<DatabaseTableResponse>> databasesToTables;
        private String id;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserTablesSqlTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databasesToTables = defaults.databasesToTables;
    	      this.id = defaults.id;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder databasesToTables(Map<String,List<DatabaseTableResponse>> databasesToTables) {
            this.databasesToTables = Objects.requireNonNull(databasesToTables);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder validationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }
        public GetUserTablesSqlTaskOutputResponse build() {
            return new GetUserTablesSqlTaskOutputResponse(databasesToTables, id, validationErrors);
        }
    }
}
