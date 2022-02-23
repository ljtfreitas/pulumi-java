// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Sql Query/Table/Stored Procedure details.
 * 
 */
public final class DatasetResponseSqlDataPath extends io.pulumi.resources.InvokeArgs {

    public static final DatasetResponseSqlDataPath Empty = new DatasetResponseSqlDataPath();

    /**
     * SQL query timeout. Unit in seconds.
     * 
     */
    @InputImport(name="queryTimeout", required=true)
        private final Double queryTimeout;

    public Double getQueryTimeout() {
        return this.queryTimeout;
    }

    /**
     * SQL query
     * 
     */
    @InputImport(name="sqlQuery", required=true)
        private final String sqlQuery;

    public String getSqlQuery() {
        return this.sqlQuery;
    }

    /**
     * SQL storedProcedure name
     * 
     */
    @InputImport(name="sqlStoredProcedureName", required=true)
        private final String sqlStoredProcedureName;

    public String getSqlStoredProcedureName() {
        return this.sqlStoredProcedureName;
    }

    /**
     * SQL table name
     * 
     */
    @InputImport(name="sqlTableName", required=true)
        private final String sqlTableName;

    public String getSqlTableName() {
        return this.sqlTableName;
    }

    public DatasetResponseSqlDataPath(
        Double queryTimeout,
        String sqlQuery,
        String sqlStoredProcedureName,
        String sqlTableName) {
        this.queryTimeout = Objects.requireNonNull(queryTimeout, "expected parameter 'queryTimeout' to be non-null");
        this.sqlQuery = Objects.requireNonNull(sqlQuery, "expected parameter 'sqlQuery' to be non-null");
        this.sqlStoredProcedureName = Objects.requireNonNull(sqlStoredProcedureName, "expected parameter 'sqlStoredProcedureName' to be non-null");
        this.sqlTableName = Objects.requireNonNull(sqlTableName, "expected parameter 'sqlTableName' to be non-null");
    }

    private DatasetResponseSqlDataPath() {
        this.queryTimeout = null;
        this.sqlQuery = null;
        this.sqlStoredProcedureName = null;
        this.sqlTableName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetResponseSqlDataPath defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double queryTimeout;
        private String sqlQuery;
        private String sqlStoredProcedureName;
        private String sqlTableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetResponseSqlDataPath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sqlQuery = defaults.sqlQuery;
    	      this.sqlStoredProcedureName = defaults.sqlStoredProcedureName;
    	      this.sqlTableName = defaults.sqlTableName;
        }

        public Builder setQueryTimeout(Double queryTimeout) {
            this.queryTimeout = Objects.requireNonNull(queryTimeout);
            return this;
        }

        public Builder setSqlQuery(String sqlQuery) {
            this.sqlQuery = Objects.requireNonNull(sqlQuery);
            return this;
        }

        public Builder setSqlStoredProcedureName(String sqlStoredProcedureName) {
            this.sqlStoredProcedureName = Objects.requireNonNull(sqlStoredProcedureName);
            return this;
        }

        public Builder setSqlTableName(String sqlTableName) {
            this.sqlTableName = Objects.requireNonNull(sqlTableName);
            return this;
        }
        public DatasetResponseSqlDataPath build() {
            return new DatasetResponseSqlDataPath(queryTimeout, sqlQuery, sqlStoredProcedureName, sqlTableName);
        }
    }
}
